package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.77j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1579977j implements C7QC, C7GV {
    public AccessibilityManager A00;
    public final UserSession A01;
    public final InterfaceC165247aD A02;
    public final C162907Rb A03;
    public final C7DK A04;
    public final C7DM A05;
    public final C2056398n A06;
    public final C7Oi A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_voice_message, viewGroup, false);
        C14360o3.A0A(inflate);
        C43678JTm c43678JTm = new C43678JTm(inflate, new C47380KwV(this));
        this.A03.A00(c43678JTm);
        if (this.A00 == null) {
            Object systemService = c43678JTm.A08.getContext().getSystemService("accessibility");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            this.A00 = (AccessibilityManager) systemService;
        }
        return c43678JTm;
    }

    public static final void A00(C1579977j c1579977j) {
        int i;
        C7DK c7dk = c1579977j.A04;
        if (c7dk != null) {
            i = c7dk.A02() / 1000;
        } else {
            i = 0;
        }
        C7Oi c7Oi = c1579977j.A07;
        String valueOf = String.valueOf(i);
        InterfaceC09390do interfaceC09390do = c7Oi.A00;
        ((XEY) interfaceC09390do.getValue()).A6r("vmplayback_duration", valueOf);
        c7Oi.A00("vmplayback_fail");
        ((XEY) interfaceC09390do.getValue()).A6s();
    }

    public static final void A01(C1579977j c1579977j) {
        int i;
        C7DK c7dk = c1579977j.A04;
        if (c7dk != null) {
            i = c7dk.A02() / 1000;
        } else {
            i = 0;
        }
        C7Oi c7Oi = c1579977j.A07;
        String valueOf = String.valueOf(i);
        InterfaceC09390do interfaceC09390do = c7Oi.A00;
        ((XEY) interfaceC09390do.getValue()).A6r("vmplayback_duration", valueOf);
        c7Oi.A00("vmplayback_success");
        ((XEY) interfaceC09390do.getValue()).A6s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
    
        if (r0 != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C1579977j r32, X.C43678JTm r33, X.C7SX r34) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1579977j.A02(X.77j, X.JTm, X.7SX):void");
    }

    public static final void A03(C1579977j c1579977j, EnumC43692JUb enumC43692JUb) {
        C95334Qt c95334Qt;
        C7DK c7dk = c1579977j.A04;
        if (c7dk != null) {
            float f = enumC43692JUb.A00;
            C5TA c5ta = c7dk.A06;
            if (c5ta != null && (c95334Qt = ((C4QT) c5ta.A06).A0K) != null) {
                c95334Qt.A07(f);
            }
        }
        C2056398n c2056398n = c1579977j.A06;
        c2056398n.A0V.Egi(c2056398n, Float.valueOf(enumC43692JUb.A00), C2056398n.A0d[24]);
    }

    public static final boolean A04(C1579977j c1579977j, C7SX c7sx) {
        if (!c7sx.A04.A06 && !c1579977j.A08 && c7sx.A07.A02 != null && !c7sx.A0G && !c7sx.A0I && ((InterfaceC165007Zp) c1579977j.A02).Cej()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r7, X.InterfaceC129555tK r8) {
        /*
            r6 = this;
            X.JTm r7 = (X.C43678JTm) r7
            X.7SX r8 = (X.C7SX) r8
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            r1 = 1
            X.C14360o3.A0B(r8, r1)
            java.lang.Long r0 = r8.A0A
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L6b
            java.lang.String r2 = r8.A0C
            if (r2 == 0) goto L73
            java.lang.String r0 = "content://com.instagram.android.tam-attachment"
            X.C14360o3.A0B(r0, r1)
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L6b
            com.instagram.common.session.UserSession r0 = r6.A01
            X.6In r0 = X.AbstractC137166Iv.A00(r0)
            java.lang.String r0 = r0.A00(r2)
            if (r0 == 0) goto L5c
            X.7SX r5 = X.AbstractC46828KnN.A00(r8, r0)
        L31:
            com.instagram.common.session.UserSession r4 = r6.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325909972268548(0x810e39000a3604, double:3.035989966936869E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto L58
            java.lang.String r2 = r8.A0C
            boolean r0 = X.LLT.A09(r2)
            if (r0 == 0) goto L58
            X.0do r0 = X.LKn.A05
            X.LKn r1 = X.AbstractC46712KlV.A00(r4)
            if (r2 == 0) goto L6d
            X.LXw r0 = new X.LXw
            r0.<init>(r6, r7, r8)
            r1.A04(r0, r2)
        L58:
            A02(r6, r7, r5)
            return
        L5c:
            X.7aD r1 = r6.A02
            X.7ZZ r1 = (X.C7ZZ) r1
            X.Lms r0 = new X.Lms
            r0.<init>(r6, r7, r8)
            X.L7B r0 = r1.ChZ(r0, r2)
            r7.A04 = r0
        L6b:
            r5 = r8
            goto L31
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1579977j.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7GV
    public final void Cy2(DirectMessageIdentifier directMessageIdentifier) {
        if (directMessageIdentifier != null) {
            A01(this);
            ((InterfaceC164587Xx) this.A02).CnN(directMessageIdentifier);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C43678JTm c43678JTm = (C43678JTm) c7qd;
        C14360o3.A0B(c43678JTm, 0);
        C7DK c7dk = this.A04;
        if (c7dk != null) {
            c7dk.A06(c43678JTm);
        }
        L7B l7b = c43678JTm.A04;
        if (l7b != null) {
            l7b.A00();
        }
        c43678JTm.A04 = null;
        c43678JTm.A05 = null;
        this.A03.A01(c43678JTm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r3 != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1579977j(com.instagram.common.session.UserSession r6, X.InterfaceC165247aD r7, X.AnonymousClass988 r8, X.C7DK r9, boolean r10, boolean r11) {
        /*
            r5 = this;
            r5.<init>()
            r5.A02 = r7
            r5.A01 = r6
            r5.A04 = r9
            r5.A08 = r10
            r5.A09 = r11
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36607393538250333(0x820e3b0000165d, double:3.214001307507093E-306)
            long r3 = X.C18U.A01(r2, r6, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            if (r0 == 0) goto L25
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L26
        L25:
            r1 = 1
        L26:
            X.7Oi r0 = new X.7Oi
            r0.<init>(r1)
            r5.A07 = r0
            X.7DM r0 = new X.7DM
            r0.<init>(r6)
            r5.A05 = r0
            X.77k r2 = new X.77k
            r2.<init>()
            r1 = r7
            X.7a9 r1 = (X.InterfaceC165207a9) r1
            X.7Ra r0 = new X.7Ra
            r0.<init>(r1)
            X.77l r0 = X.AbstractC1575875s.A00(r0, r2, r7, r8)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r1)
            X.7Rb r0 = new X.7Rb
            r0.<init>(r1)
            r5.A03 = r0
            X.98n r0 = X.AbstractC2056298m.A00(r6)
            r5.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1579977j.<init>(com.instagram.common.session.UserSession, X.7aD, X.988, X.7DK, boolean, boolean):void");
    }
}
