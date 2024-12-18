package com.facebook.caa.shared.passkey.igconfig;

import X.AbstractC31173DnH;
import X.C023409i;
import X.C55888Orc;
import X.C62862tP;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class IGContextProvider {
    public static final C62862tP A00(Context context) {
        FragmentActivity fragmentActivity;
        UserSession A07;
        if (!(context instanceof FragmentActivity) || (fragmentActivity = (FragmentActivity) context) == null || (A07 = C023409i.A0A.A07(AbstractC31173DnH.A0A(fragmentActivity))) == null) {
            return null;
        }
        return C62862tP.A01(null, fragmentActivity, new C55888Orc(), A07);
    }

    public static final String A01(Context context) {
        Activity activity;
        UserSession A07;
        String str;
        if (!(context instanceof FragmentActivity) || (activity = (Activity) context) == null || (A07 = C023409i.A0A.A07(AbstractC31173DnH.A0A(activity))) == null || (str = A07.userId) == null) {
            return null;
        }
        return str;
    }
}
