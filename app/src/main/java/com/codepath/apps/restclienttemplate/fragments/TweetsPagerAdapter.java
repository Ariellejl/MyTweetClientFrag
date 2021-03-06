package com.codepath.apps.restclienttemplate.fragments;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Arielle on 03-Mar-18.
 */

public class TweetsPagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] {"Home","Mentions"};
    private Context context;
    public TweetsPagerAdapter(FragmentManager fm, Context context){
      super(fm);
      this.context = context;
    }
    //return the total # of fragment
    public int getCount(){
        return 2;
    }
    //return the fragment to use depending on the position

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new HomeTimelineFragment();
        }else if (position == 1){
            return new MentionTimelineFragment();
        }else

        return null;
    }

    //return title

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        //generate title based on item position
      return tabTitles[position];
    }
}
