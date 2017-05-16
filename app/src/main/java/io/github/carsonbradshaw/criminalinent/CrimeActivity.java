package io.github.carsonbradshaw.criminalinent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    public static final String EXTRA_CRIME_ID =
            "com.bignerdranch.android.criminalintent.crime_id";
    public static final String EXTRA_LIST_POSITION=
            "com.bignerdranch.android.criminalintent.list_position";

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        int listPosition = (int) getIntent().getSerializableExtra(EXTRA_LIST_POSITION);
        return CrimeFragment.newInstance(crimeId, listPosition);
    }

    public static Intent newIntent(Context packageContext, UUID crimeId, int listPosition) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        intent.putExtra(EXTRA_LIST_POSITION, listPosition);
        return intent;
    }
}
