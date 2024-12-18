package com.instagram.urlhandlers.guides;

import X.AbstractC001800i;
import X.AbstractC08820cl;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31176DnK;
import X.AbstractC35178FfV;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.EnumC33459Equ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* loaded from: classes6.dex */
public final class GuidesExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AbstractC18680vv A00;

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        String A0a;
        Uri A03;
        String scheme;
        Bundle A0b;
        String str;
        int A00 = C0f9.A00(852757371);
        super.onCreate(bundle);
        Bundle A07 = AbstractC31176DnK.A07(this);
        if (A07 != null && (A0a = AbstractC31171DnF.A0a(A07)) != null && A0a.length() != 0) {
            AbstractC18680vv A0V = AbstractC31172DnG.A0V(A07);
            this.A00 = A0V;
            try {
                A03 = AbstractC08820cl.A03(A0a);
                scheme = A03.getScheme();
            } catch (Exception unused) {
            }
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if ("instagram".equalsIgnoreCase(scheme)) {
                    String A11 = AbstractC31172DnG.A11(A03);
                    String queryParameter = A03.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    if (A11 != null && A11.length() != 0) {
                        A0b = AbstractC166987dD.A0b();
                        str = "guide_id";
                        A0b.putString("guide_id", A11);
                        A0b.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
                    }
                }
                finish();
                i = -592694384;
            } else {
                List<String> pathSegments = A03.getPathSegments();
                C14360o3.A0A(pathSegments);
                String str2 = (String) AbstractC001800i.A0O(pathSegments, AbstractC25226BEj.A05(pathSegments));
                A0b = AbstractC166987dD.A0b();
                str = "guide_id";
                A0b.putString("guide_id", str2);
            }
            A07.putAll(A0b);
            C14360o3.A0B(A0V, 0);
            if (!(A0V instanceof UserSession)) {
                AbstractC35178FfV.A01(this, A07, A0V);
                i = 493400521;
            } else {
                A07.getString(str);
                String A0Z = AbstractC31171DnF.A0Z(A07);
                if (A0Z != null) {
                    try {
                        EnumC33459Equ.valueOf(A0Z);
                    } catch (IllegalArgumentException unused2) {
                        EnumC33459Equ[] values = EnumC33459Equ.values();
                        int length = values.length;
                        for (int i2 = 0; i2 < length && !values[i2].A00.equals(A0Z); i2++) {
                        }
                    }
                }
                AbstractC31171DnF.A0v();
                throw C00O.createAndThrow();
            }
        } else {
            finish();
            i = -605761182;
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
