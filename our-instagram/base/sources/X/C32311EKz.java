package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.EKz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32311EKz extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacFinishFragment";
    public Integer A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131975902);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    public static final void A00(C32311EKz c32311EKz) {
        Fragment A02;
        InterfaceC09390do interfaceC09390do = c32311EKz.A09;
        AbstractC35075Fcm.A00(AbstractC166987dD.A0r(interfaceC09390do), C05F.A0u);
        C1V8 A01 = AbstractC35179FfW.A01();
        if (c32311EKz.A07) {
            A01.A00();
            Bundle requireArguments = c32311EKz.requireArguments();
            A02 = new C32290EKd();
            A02.setArguments(requireArguments);
        } else {
            boolean z = c32311EKz.A04;
            FRQ A00 = A01.A00();
            if (z) {
                A02 = A00.A00(null, false);
            } else {
                A02 = A00.A02(C05F.A0j, true, !c32311EKz.requireArguments().getBoolean("has_two_fac_already_on"));
            }
        }
        C140966Yy A0j = AbstractC25233BEq.A0j(c32311EKz, interfaceC09390do);
        A0j.A0B(null, A02);
        A0j.A04();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A09);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A00(this);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (r2 == false) goto L16;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 717269313(0x2ac0a941, float:3.4223495E-13)
            int r3 = X.C0f9.A02(r0)
            super.onCreate(r10)
            android.os.Bundle r7 = r9.requireArguments()
            r4 = 0
            java.lang.String r0 = X.AbstractC31180DnO.A0Z()
            boolean r0 = r7.getBoolean(r0)
            r9.A04 = r0
            java.lang.String r0 = "has_phone_number_confirmed"
            boolean r0 = r7.getBoolean(r0)
            r9.A02 = r0
            java.lang.String r0 = X.AbstractC31182DnR.A03()
            java.lang.String r1 = ""
            java.lang.String r0 = r7.getString(r0, r1)
            r9.A01 = r0
            java.lang.String r0 = "has_two_fac_already_on"
            boolean r0 = r7.getBoolean(r0)
            r9.A03 = r0
            java.lang.String r0 = "two_fac_enable_method"
            java.lang.String r8 = r7.getString(r0, r1)
            X.C14360o3.A07(r8)
            r0 = 4
            java.lang.Integer[] r6 = X.C05F.A00(r0)
            int r5 = r6.length
            r2 = 0
        L45:
            if (r2 >= r5) goto L56
            r1 = r6[r2]
            java.lang.String r0 = X.AbstractC34233F8f.A00(r1)
            boolean r0 = X.C14360o3.A0K(r0, r8)
            if (r0 != 0) goto L58
            int r2 = r2 + 1
            goto L45
        L56:
            java.lang.Integer r1 = X.C05F.A0N
        L58:
            r9.A00 = r1
            java.lang.String r0 = "is_eligible_for_whatsapp_two_factor"
            boolean r2 = r7.getBoolean(r0)
            r9.A05 = r2
            java.lang.Integer r1 = r9.A00
            if (r1 != 0) goto L70
            java.lang.String r0 = "twoFacEnableMethod"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L70:
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L77
            r0 = 1
            if (r2 != 0) goto L78
        L77:
            r0 = 0
        L78:
            r9.A06 = r0
            java.lang.String r0 = "is_eligible_for_multiple_totp"
            boolean r0 = r7.getBoolean(r0)
            r9.A08 = r0
            X.0do r2 = r9.A09
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r2)
            java.lang.String r0 = "confirm"
            X.AbstractC35075Fcm.A02(r1, r0)
            X.0ll r1 = X.AbstractC25230BEn.A0k(r2, r4)
            X.0iw r0 = X.C34918Fa4.A01
            X.0wW r1 = X.AbstractC12220kQ.A01(r0, r1)
            java.lang.String r0 = "instagram_two_fac_setup_complete"
            X.0Ai r0 = X.AbstractC166987dD.A0f(r1, r0)
            X.AbstractC31181DnP.A0c(r0)
            r0.Cht()
            r0 = 733057867(0x2bb1934b, float:1.2617488E-12)
            X.C0f9.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32311EKz.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:
    
        if (r11.A07 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0125, code lost:
    
        if (r1 != X.C05F.A01) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32311EKz.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
