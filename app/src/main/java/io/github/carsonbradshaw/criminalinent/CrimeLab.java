package io.github.carsonbradshaw.criminalinent;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Carson on 5/13/2017.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Map<UUID, Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new LinkedHashMap<>();
    }

    public Map<UUID, Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        return mCrimes.get(id);
    }

    public void addCrime(Crime c) {
        mCrimes.put(c.getId(), c);
    }
}
