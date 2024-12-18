package com.instagram.canvas;

import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.C00O;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C172077lc;
import X.C3K8;
import X.C67882V0n;
import X.C71313Hs;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class CanvasActivity extends IgFragmentActivity {
    public UserSession A00;
    public C67882V0n A01;

    @Override // com.instagram.base.activity.IgFragmentActivity
    public final C172077lc getGnvGestureHandler() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            if (C3K8.A02(userSession)) {
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    C172077lc A00 = C172077lc.A00(userSession2);
                    C14360o3.A07(A00);
                    UserSession userSession3 = this.A00;
                    if (userSession3 != null) {
                        C71313Hs A002 = C71313Hs.A00(userSession3);
                        C14360o3.A07(A002);
                        A00.A03(A002);
                        A00.A02(A002);
                        return A00;
                    }
                }
            } else {
                return null;
            }
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        C67882V0n c67882V0n = this.A01;
        if (c67882V0n == null) {
            C14360o3.A0F("canvasFragment");
            throw C00O.createAndThrow();
        }
        c67882V0n.onBackPressed();
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(1797511702);
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            UserSession A0G = AbstractC31171DnF.A0G(A0A);
            C14360o3.A0B(A0G, 0);
            this.A00 = A0G;
            super.onCreate(bundle);
            setContentView(R.layout.activity_canvas);
            C67882V0n c67882V0n = (C67882V0n) getSupportFragmentManager().A0O(R.id.layout_container_main);
            if (c67882V0n != null) {
                this.A01 = c67882V0n;
            } else {
                A0A.putBoolean(AbstractC111324zv.A00(1529), true);
                C67882V0n c67882V0n2 = new C67882V0n();
                c67882V0n2.setArguments(A0A);
                this.A01 = c67882V0n2;
                C14240no c14240no = new C14240no(getSupportFragmentManager());
                C67882V0n c67882V0n3 = this.A01;
                if (c67882V0n3 == null) {
                    C14360o3.A0F("canvasFragment");
                    throw C00O.createAndThrow();
                }
                c14240no.A0A(c67882V0n3, R.id.layout_container_main);
                c14240no.A00();
            }
            C0f9.A07(1443687882, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(184355600, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }
}
