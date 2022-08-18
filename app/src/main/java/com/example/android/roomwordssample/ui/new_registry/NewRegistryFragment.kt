package com.example.android.roomwordssample.ui.new_registry

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.roomwordssample.MainActivity.Companion.NEW_WORD_ACTIVITY_REQUEST_CODE
import com.example.android.roomwordssample.NewWordActivity
import com.example.android.roomwordssample.R
import com.example.android.roomwordssample.ui.new_registry.adapter.WordListAdapter
import com.example.android.roomwordssample.base.BaseFragment
import com.example.android.roomwordssample.WordViewModel
import com.example.android.roomwordssample.data.model.Word
import kotlinx.android.synthetic.main.new_registry_fragment.*

class NewRegistryFragment : BaseFragment(){


    override fun getLayoutView(): Int = R.layout.new_registry_fragment

    lateinit var mWordViewModel: WordViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val wordDiff = WordListAdapter.WordDiff()
        val adapter =
            WordListAdapter(
                wordDiff
            )
        recyclerview.setAdapter(adapter)
        recyclerview.setLayoutManager(LinearLayoutManager(context))

        // Get a new or existing ViewModel from the ViewModelProvider.

        // Get a new or existing ViewModel from the ViewModelProvider.
        mWordViewModel = ViewModelProvider(this).get(WordViewModel::class.java)

        // Add an observer on the LiveData returned by getAlphabetizedWords.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.

        // Add an observer on the LiveData returned by getAlphabetizedWords.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.

        // Add an observer on the LiveData returned by getAlphabetizedWords.
        // The onChanged() method fires when the observed data changes and the activity is
        // in the foreground.
        mWordViewModel.allWords.observe(viewLifecycleOwner,
            Observer { words: List<Word?>? ->
                // Update the cached copy of the words in the adapter.
                adapter.submitList(words)
            })


        fab.setOnClickListener { view: View? ->
            val intent = Intent(context, NewWordActivity::class.java)
            startActivityForResult(
                intent,
                NEW_WORD_ACTIVITY_REQUEST_CODE
            )
        }

    }




}