package com.instagram.modal;

import X.AbstractC58327PtK;
import X.C06T;
import X.C0f9;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class TransparentModalActivity extends ModalActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final boolean A0m() {
        return false;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putStringArrayList("arg_cleanup_bottom_sheet_fragments", new ArrayList<>(Collections.singletonList("BottomSheetConstants.FRAGMENT_TAG")));
        super.onSaveInstanceState(bundle);
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0h() {
        setTheme(R.style.IgTranslucentWindowPanavisionSoftUpdateButtons);
    }

    @Override // com.instagram.modal.ModalActivity, com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-606044621);
        Bundle A002 = AbstractC58327PtK.A00(bundle);
        if (A002 != null) {
            C06T.A00(A002, getClassLoader(), A002.getStringArrayList("arg_cleanup_bottom_sheet_fragments"));
        }
        super.onCreate(A002);
        C0f9.A07(439224304, A00);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A0n(intent);
    }
}
