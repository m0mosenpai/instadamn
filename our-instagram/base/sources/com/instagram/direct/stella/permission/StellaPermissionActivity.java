package com.instagram.direct.stella.permission;

import X.AbstractC03270Dk;
import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AnonymousClass001;
import X.AnonymousClass186;
import X.C06090Tz;
import X.C08600cO;
import X.C08610cP;
import X.C0f9;
import X.C14240no;
import X.C14360o3;
import X.C18U;
import X.C193328hC;
import X.C31788Dy7;
import X.C32229EHn;
import X.C50171MDy;
import X.DialogInterfaceOnClickListenerC35344FiL;
import X.DialogInterfaceOnClickListenerC35453FkA;
import X.EnumC53275NhD;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.MHI;
import X.MI7;
import X.MSY;
import X.MSZ;
import X.OP6;
import X.OVP;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class StellaPermissionActivity extends IgFragmentActivity implements InterfaceC11380iw {
    public static final C08610cP A01;
    public final InterfaceC09390do A00 = AbstractC25225BEi.A0a(new MHI(this, 34), new MHI(this, 35), new C50171MDy(11, null, this), AbstractC25225BEi.A1D(C31788Dy7.class));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "stella_permission_activity";
    }

    static {
        C08600cO c08600cO = new C08600cO();
        c08600cO.A05("com.instagram.android.fbpermission.MANAGE_MESSAGING");
        c08600cO.A04("MANAGE_DIRECT_MESSAGING");
        A01 = c08600cO.A00();
    }

    @Override // X.InterfaceC12980lk
    public final /* bridge */ /* synthetic */ AbstractC12990ll getSession() {
        return AbstractC31171DnF.A0F(this);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = C0f9.A00(1059355896);
        super.onCreate(bundle);
        OVP ovp = OVP.A00;
        C08610cP c08610cP = A01;
        C14360o3.A08(c08610cP);
        EnumC53275NhD A002 = ovp.A00(this, getIntent(), c08610cP);
        Intent A04 = AbstractC31171DnF.A04();
        if (A002 != EnumC53275NhD.A0N) {
            setResult(A002.A00, A04);
            finish();
            i = 1786361623;
        } else {
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            UserSession A012 = AbstractC03270Dk.A01(A0F);
            if (A012 == null) {
                setResult(7, A04);
                finish();
                i = 259274840;
            } else {
                if (C18U.A06(C06090Tz.A05, A012, 36322366623656136L)) {
                    setContentView(R.layout.stella_permission_activity);
                    C32229EHn c32229EHn = new C32229EHn();
                    String A003 = AnonymousClass186.A00(MSZ.A0h(A012));
                    C14240no A0G = MSY.A0G(this);
                    A0G.A09(c32229EHn, R.id.layout_container_main);
                    A0G.A00();
                    AbstractC31174DnI.A1E(this, ((C31788Dy7) this.A00.getValue()).A00, new MI7(this, A012, A003, 31), 23);
                    OP6.A00(null, this, A0F, AbstractC25231BEo.A0p(), "PROVIDER_LINKING");
                } else {
                    String username = AbstractC166997dE.A0Y(A012).getUsername();
                    String str = A012.userId;
                    String A004 = AnonymousClass186.A00(MSZ.A0h(A012));
                    C193328hC A0H = AbstractC31171DnF.A0H(this);
                    A0H.A05 = "IG Permission";
                    A0H.A0s(false);
                    A0H.A0r(AnonymousClass001.A0g("Allow sending message and receive notification for ", username, " ?"));
                    A0H.A0d(new DialogInterfaceOnClickListenerC35344FiL(this, str, A004, 1), "Yes");
                    A0H.A0c(new DialogInterfaceOnClickListenerC35453FkA(this, 9), "No");
                    AbstractC166987dD.A1W(A0H);
                }
                i = 1498625059;
            }
        }
        C0f9.A07(i, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    public final AbstractC18680vv getSession() {
        return AbstractC31171DnF.A0F(this);
    }
}
