package com.instagram.react.activity;

import X.AbstractC09440dt;
import X.AbstractC10360h2;
import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31173DnH;
import X.C023409i;
import X.C09Y;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C25027B5z;
import X.C59802oN;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC53772dG;
import X.InterfaceC53822dL;
import X.InterfaceC65494TlI;
import X.MSY;
import X.Rb1;
import android.os.Bundle;
import com.facebook.R;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.instagram.base.activity.BaseFragmentActivity;

/* loaded from: classes10.dex */
public final class IgReactActivity extends BaseFragmentActivity implements InterfaceC11380iw, InterfaceC53772dG, InterfaceC65494TlI, InterfaceC53822dL {
    public AbstractC18680vv A00;
    public PermissionsModule A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C25027B5z(this, 10));

    @Override // X.InterfaceC65494TlI
    public final void EJF(PermissionsModule permissionsModule, String[] strArr, int i) {
        C14360o3.A0B(strArr, 0);
        this.A01 = permissionsModule;
        requestPermissions(strArr, i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "react_activity";
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        AbstractC167007dF.A1D(strArr, 1, iArr);
        PermissionsModule permissionsModule = this.A01;
        if (permissionsModule != null && permissionsModule.onRequestPermissionsResult(i, strArr, iArr)) {
            this.A01 = null;
        }
    }

    @Override // X.InterfaceC53822dL
    public final InterfaceC11380iw Auf() {
        return this;
    }

    @Override // X.InterfaceC53772dG
    public final C59802oN BUF() {
        return (C59802oN) this.A02.getValue();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return this.A00;
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
        if (getSupportFragmentManager().A0O(R.id.layout_container_main) == null) {
            Rb1 rb1 = new Rb1();
            rb1.setArguments(AbstractC31173DnH.A0A(this));
            C14240no A0G = MSY.A0G(this);
            A0G.A0A(rb1, R.id.layout_container_main);
            A0G.A00();
        }
    }

    @Override // X.InterfaceC53822dL
    public final AbstractC10360h2 B8T() {
        return getSupportFragmentManager();
    }

    @Override // X.InterfaceC53772dG
    public final boolean CYp() {
        C59802oN BUF = BUF();
        if (BUF != null && BUF.A06()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC53772dG
    public final boolean CYq() {
        C59802oN BUF = BUF();
        if (BUF != null && BUF.A05()) {
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    @Override // com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int A00 = C0f9.A00(-1930693958);
        super.onCreate(bundle);
        C09Y c09y = C023409i.A0A;
        Bundle A0A = AbstractC31173DnH.A0A(this);
        if (A0A != null) {
            this.A00 = c09y.A04(A0A);
            int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
            if (intArrayExtra != null && intArrayExtra.length == 4) {
                overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
            }
            C0f9.A07(794127300, A00);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A07(79003697, A00);
        throw A0g;
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return this.A00;
    }
}
