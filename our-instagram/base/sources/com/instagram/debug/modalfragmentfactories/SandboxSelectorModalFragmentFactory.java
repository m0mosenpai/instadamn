package com.instagram.debug.modalfragmentfactories;

import X.AbstractC18680vv;
import X.AbstractC31180DnO;
import X.C0w9;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class SandboxSelectorModalFragmentFactory {
    public static final SandboxSelectorModalFragmentFactory INSTANCE = new Object();

    public Fragment createFragmentByName(AbstractC18680vv abstractC18680vv, FragmentActivity fragmentActivity, Bundle bundle) {
        try {
            return AbstractC31180DnO.A07("com.instagram.debug.devoptions.sandboxselector.SandboxSelectorFragment");
        } catch (Exception e) {
            C0w9.A07("ModalActivity", e);
            return null;
        }
    }
}
