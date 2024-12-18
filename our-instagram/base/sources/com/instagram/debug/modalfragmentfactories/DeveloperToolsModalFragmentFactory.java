package com.instagram.debug.modalfragmentfactories;

import X.AbstractC18680vv;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import instagram.features.devoptions.plugins.DeveloperOptionsPluginImpl;

/* loaded from: classes10.dex */
public final class DeveloperToolsModalFragmentFactory {
    public static final DeveloperToolsModalFragmentFactory INSTANCE = new Object();

    public Fragment createFragmentByName(AbstractC18680vv abstractC18680vv, FragmentActivity fragmentActivity, Bundle bundle) {
        return DeveloperOptionsPluginImpl.INSTANCE.getDeveloperOptionsFragment();
    }
}
