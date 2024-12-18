package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.FgQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35233FgQ {
    public static boolean A07;
    public final Fragment A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C147036jf A03;
    public final InterfaceC37264GbH A04;
    public final FJT A05;
    public final boolean A06;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (X.AbstractC114515Ew.A06(r2, "android.permission.READ_CONTACTS") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C34694FQf A00(X.C1P1 r16, X.InterfaceC37164GZb r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22) {
        /*
            r15 = this;
            r6 = r15
            androidx.fragment.app.Fragment r1 = r15.A00
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            android.app.Activity r2 = r3.getParent()
            if (r2 != 0) goto Le
            r2 = r3
        Le:
            X.EqG r0 = X.EnumC33444EqG.A06
            r7 = r18
            boolean r11 = X.AbstractC31174DnI.A1a(r0, r7)
            X.EqG r0 = X.EnumC33444EqG.A0F
            boolean r10 = X.AbstractC31174DnI.A1a(r0, r7)
            android.content.Context r0 = r1.requireContext()
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            boolean r0 = X.AbstractC23451Ch.A07(r0, r1)
            if (r0 != 0) goto L2f
            boolean r0 = X.AbstractC114515Ew.A06(r2, r1)
            r13 = 1
            if (r0 != 0) goto L30
        L2f:
            r13 = 0
        L30:
            X.FQf r1 = new X.FQf
            r4 = r16
            r5 = r17
            r8 = r19
            r12 = r20
            r14 = r21
            r9 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35233FgQ.A00(X.1P1, X.GZb, java.lang.String, java.lang.String, boolean, boolean, boolean):X.FQf");
    }

    public final void A04(C1P1 c1p1, InterfaceC37164GZb interfaceC37164GZb, EnumC33444EqG enumC33444EqG, String str, String str2, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        C147036jf c147036jf = this.A03;
        Fragment fragment = this.A00;
        Context requireContext = fragment.requireContext();
        boolean z3 = this.A06;
        AbstractC34351FCt.A00(requireContext, c147036jf.A01, c147036jf.A03, str, z3);
        if (enumC33444EqG == EnumC33444EqG.A0J) {
            Context requireContext2 = fragment.requireContext();
            UserSession userSession = this.A02;
            if (C54P.A01(requireContext2, userSession)) {
                A02(this, true);
                A03(this, false);
                return;
            } else {
                A02(this, false);
                A00(null, interfaceC37164GZb, str, null, z2, false, false).A00("ci", true, true);
                C36114Fwo.A00(userSession);
                return;
            }
        }
        A00(c1p1, interfaceC37164GZb, str, str2, z2, z, false).A00(str, false, false);
    }

    public final void A06(InterfaceC37164GZb interfaceC37164GZb, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if (AbstractC23451Ch.A07(this.A00.requireContext(), "android.permission.READ_CONTACTS")) {
            A00(null, interfaceC37164GZb, str, str2, z, z2, true).A00(str3, z3, false);
        } else {
            this.A03.A04(C05F.A0Y, str3, str.equals(EnumC33444EqG.A0F.toString()));
        }
    }

    public final void A07(EnumC33444EqG enumC33444EqG) {
        A05(null, enumC33444EqG, true, false, false);
    }

    public static final void A01(Context context, C35233FgQ c35233FgQ, EnumC33444EqG enumC33444EqG, String str) {
        C35133Fea.A01(context, c35233FgQ.A02, SimpleWebViewActivity.A02, AbstractC31171DnF.A0R(AbstractC63260SgI.A01(context, "https://help.instagram.com/227486307449481")), str);
        C147036jf c147036jf = c35233FgQ.A03;
        String A0k = AbstractC31180DnO.A0k(enumC33444EqG);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147036jf.A02, "ci_modal_learn_more_tapped");
        if (A0k == null) {
            A0k = c147036jf.A04;
        }
        AbstractC31175DnJ.A17(A0f, A0k);
    }

    public static final void A02(C35233FgQ c35233FgQ, boolean z) {
        UserSession userSession = c35233FgQ.A02;
        AbstractC23021Ah.A00(userSession).A1B(z);
        C19280xC A00 = C19280xC.A00(c35233FgQ.A01, "contacts_import_permissions");
        A00.A09("enabled", Boolean.valueOf(z));
        C19U A01 = AbstractC31172DnG.A0P(userSession).A01(C19T.A1V);
        if (A01 != null) {
            A00.A0C("phone_id", A01.A01);
        }
        AbstractC31173DnH.A1S(A00, userSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN] */
    public static final void A03(C35233FgQ c35233FgQ, boolean z) {
        Fragment fragment;
        AbstractC10360h2 abstractC10360h2;
        Fragment fragment2 = c35233FgQ.A00;
        if ((fragment2 instanceof GWV) || ((fragment = fragment2.mParentFragment) != null && (fragment instanceof GWV))) {
            AbstractC25651Mw.A00(c35233FgQ.A02).E4s(new Object());
            return;
        }
        if ((!z && (abstractC10360h2 = fragment2.mFragmentManager) != null && !C06P.A01(abstractC10360h2)) || !AbstractC167007dF.A1W(C37001nx.A02)) {
            return;
        }
        C140966Yy A0r = AbstractC25225BEi.A0r(fragment2.requireActivity(), c35233FgQ.A02);
        A0r.A0G = true;
        AbstractC35067Fce.A01();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean(AbstractC111324zv.A00(84), false);
        AbstractC31175DnJ.A0t(A0b, new EK6(), A0r);
    }

    public final void A05(InterfaceC37164GZb interfaceC37164GZb, EnumC33444EqG enumC33444EqG, boolean z, boolean z2, boolean z3) {
        DialogInterface.OnClickListener dialogInterfaceOnClickListenerC35352FiT;
        CharSequence charSequence;
        EnumC33444EqG enumC33444EqG2 = enumC33444EqG;
        if (z) {
            C147036jf c147036jf = this.A03;
            Context requireContext = this.A00.requireContext();
            boolean z4 = this.A06;
            AbstractC34351FCt.A00(requireContext, c147036jf.A01, c147036jf.A03, null, z4);
        }
        Fragment fragment = this.A00;
        Context requireContext2 = fragment.requireContext();
        UserSession userSession = this.A02;
        if (C54P.A01(requireContext2, userSession)) {
            A02(this, true);
            A03(this, false);
            return;
        }
        A02(this, false);
        C34694FQf A00 = A00(null, interfaceC37164GZb, enumC33444EqG2.toString(), null, z3, false, false);
        Context requireContext3 = fragment.requireContext();
        if (!z2 && enumC33444EqG2 != EnumC33444EqG.A0K && enumC33444EqG2 != EnumC33444EqG.A0A && enumC33444EqG2 != EnumC33444EqG.A09 && enumC33444EqG2 != EnumC33444EqG.A0C) {
            enumC33444EqG2 = null;
        }
        String A0p = AbstractC166997dE.A0p(requireContext3, 2131956652);
        C193328hC A0I = AbstractC31171DnF.A0I(requireContext3);
        A0I.A05 = A0p;
        String A0p2 = AbstractC166997dE.A0p(requireContext3, 2131956657);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36322976509209380L) && !C18U.A06(c06090Tz, userSession, 36322976509274917L)) {
            String A0T = AnonymousClass001.A0T(AbstractC166997dE.A0p(requireContext3, 2131956656), A0p2, ' ');
            dialogInterfaceOnClickListenerC35352FiT = new DialogInterfaceOnClickListenerC35450Fk7(5, requireContext3, this, enumC33444EqG2);
            charSequence = A0T;
        } else {
            String A0p3 = AbstractC166997dE.A0p(requireContext3, 2131956654);
            String A0p4 = AbstractC166997dE.A0p(requireContext3, 2131956655);
            StringBuilder A11 = AbstractC166997dE.A11(A0p3);
            A11.append(' ');
            A11.append(A0p2);
            A11.append("\n\n");
            String A0x = AbstractC166997dE.A0x(A0p4, A11);
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0x);
            String A0p5 = AbstractC166997dE.A0p(requireContext3, 2131956653);
            A0H.setSpan(new RelativeSizeSpan(0.85f), AbstractC001900j.A08(A0x, A0p5, 0, false) + A0p5.length(), A0H.length(), 33);
            dialogInterfaceOnClickListenerC35352FiT = new DialogInterfaceOnClickListenerC35352FiT(requireContext3, enumC33444EqG2, this, A0p5, 1);
            charSequence = A0H;
        }
        A0I.A0a(dialogInterfaceOnClickListenerC35352FiT, charSequence, A0p2);
        A0I.A0J(DialogInterfaceOnClickListenerC35393Fj8.A00, 2131956650);
        A0I.A0I(DialogInterfaceOnClickListenerC35394Fj9.A00, 2131956651);
        A0I.A0g(new DialogInterfaceOnDismissListenerC35461FkI(requireContext3, interfaceC37164GZb, A00, this, enumC33444EqG2));
        if (this.A06) {
            A0I.A0s(false);
        }
        AbstractC166987dD.A1W(A0I);
        C147036jf c147036jf2 = this.A03;
        String A0k = AbstractC31180DnO.A0k(enumC33444EqG2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147036jf2.A02, "ci_modal_impression");
        if (A0k == null) {
            A0k = c147036jf2.A04;
        }
        AbstractC31171DnF.A1G(A0f, A0k);
        A0f.A7v("user_initiated", Boolean.valueOf(z));
        A0f.Cht();
    }

    public C35233FgQ(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37264GbH interfaceC37264GbH, FJT fjt) {
        AbstractC167027dH.A13(userSession, interfaceC11380iw, fragment);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = fragment;
        this.A04 = interfaceC37264GbH;
        this.A05 = fjt;
        this.A03 = new C147036jf(interfaceC11380iw, userSession);
        this.A06 = AbstractC167007dF.A1W(interfaceC37264GbH);
    }
}
