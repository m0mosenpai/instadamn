package com.instagram.debug.modalfragmentfactories;

import X.AbstractC18680vv;
import X.C14360o3;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundSignalsFragment;

/* loaded from: classes5.dex */
public final class CreatorInspirationSignalsPlaygroundFragmentFactory {
    public static final CreatorInspirationSignalsPlaygroundFragmentFactory INSTANCE = new Object();

    public Fragment createFragmentByName(AbstractC18680vv abstractC18680vv, FragmentActivity fragmentActivity, Bundle bundle) {
        C14360o3.A0B(bundle, 2);
        CreatorInspirationSignalsPlaygroundSignalsFragment creatorInspirationSignalsPlaygroundSignalsFragment = new CreatorInspirationSignalsPlaygroundSignalsFragment();
        creatorInspirationSignalsPlaygroundSignalsFragment.setArguments(bundle);
        return creatorInspirationSignalsPlaygroundSignalsFragment;
    }
}
