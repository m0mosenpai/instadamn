package X;

import android.content.res.Resources;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import com.instagram.fxcal.upsell.common.FxIgLogoutACUpsellImpl;
import com.instagram.user.model.User;
import fxcache.model.FxCalAccount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fh7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35272Fh7 {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final AbstractC10360h2 A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final FxIgLogoutACUpsellImpl A05;
    public final C36301Fzw A06;
    public final FK4 A07;
    public final C34937FaN A08;
    public final AbstractC018607g A09;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.3oK, java.lang.Object] */
    public static void A06(C35272Fh7 c35272Fh7) {
        c35272Fh7.A01();
        ?? obj = new Object();
        HashMap A1G = AbstractC166987dD.A1G();
        UserSession userSession = c35272Fh7.A04;
        A1G.put("uids", C0BQ.A00(userSession).BOe().toString());
        A1G.put("uids_count", String.valueOf(AbstractC31174DnI.A06(userSession)));
        boolean z = !AbstractC34239F8l.A00().booleanValue();
        AbstractC35076Fcn.A01(c35272Fh7.A03, userSession, "logout_d2_loaded");
        if (z) {
            C14360o3.A0B(userSession, 0);
            C83753oK.A01(userSession, "logout_password_saving_multiaccount_logout_all_dialog_viewed", "logout_spi", "logout", "logout_interaction");
        }
        C193328hC A0H = AbstractC31171DnF.A0H(c35272Fh7.A01);
        A0H.A0A(2131965719);
        A0H.A0J(new DialogInterfaceOnClickListenerC35353FiU(2, A1G, obj, c35272Fh7, z), 2131965713);
        A0H.A0D(new DialogInterfaceOnClickListenerC35447Fk4((C83753oK) obj, c35272Fh7, 2, z));
        A0H.A07 = !C14640oc.A01();
        try {
            C0fJ.A00(A0H.A02());
        } catch (WindowManager.BadTokenException unused) {
            c35272Fh7.A0D(EnumC33353Eom.A05, true);
        }
    }

    public static void A08(C35272Fh7 c35272Fh7, boolean z) {
        c35272Fh7.A01();
        UserSession userSession = c35272Fh7.A04;
        String str = userSession.userId;
        C83743oJ A01 = C83743oJ.A01(userSession);
        A01.A0H(str);
        EII eii = new EII();
        eii.A00 = z;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25225BEi.A1Q(A0y, false);
        FragmentActivity fragmentActivity = c35272Fh7.A01;
        A0y.A0g = fragmentActivity.getResources().getString(2131969000);
        A0y.A0v = true;
        A0y.A0K = new ViewOnClickListenerC35673Fp8(eii, A01, c35272Fh7, str, 9);
        if (C1AD.A06(C06090Tz.A05, 18296144069263542L)) {
            A0y.A0d = AbstractC166997dE.A0r(fragmentActivity.getResources(), AbstractC166997dE.A0Y(userSession).getUsername(), 2131969003);
        }
        C189478aR A00 = A0y.A00();
        A00.A0Q(true);
        A00.A02(fragmentActivity, eii);
    }

    private ArrayList A00() {
        UserSession userSession = this.A04;
        List A03 = AbstractC40751ui.A00(userSession).A03(CallerContext.A01("LogoutDialogHelper"), "ig_native_linking_cache_logout_linked_accounts", "INSTAGRAM");
        ArrayList A1E = AbstractC166987dD.A1E();
        if (!A03.isEmpty()) {
            String A0q = AbstractC31176DnK.A0q(userSession);
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                String str = ((FxCalAccount) it.next()).A0A;
                if (str != null) {
                    if (str.equals(A0q)) {
                        A1E.add(0, str);
                    } else {
                        A1E.add(str);
                    }
                }
            }
        }
        return A1E;
    }

    private void A01() {
        C1VN c1vn = C1VN.A00;
        if (c1vn != null) {
            c1vn.A02(this.A04, this.A01, "1949557911961250");
        }
    }

    public static void A02(C83753oK c83753oK, C35272Fh7 c35272Fh7, boolean z) {
        UserSession userSession = c35272Fh7.A04;
        C14360o3.A0B(userSession, 0);
        C83753oK.A01(userSession, "logout_password_saving_logout_dialog_viewed", "logout_spi", "logout", "logout_interaction");
        C193328hC A0H = AbstractC31171DnF.A0H(c35272Fh7.A01);
        A0H.A0A(2131954446);
        A0H.A0L(new DialogInterfaceOnClickListenerC35447Fk4(c83753oK, c35272Fh7, 1, z), 2131954445);
        DialogInterfaceOnClickListenerC35455FkC.A02(A0H, c35272Fh7, c83753oK, 41, 2131954444);
        AbstractC31174DnI.A1R(A0H);
        try {
            C0fJ.A00(A0H.A02());
        } catch (WindowManager.BadTokenException unused) {
            c35272Fh7.A0D(EnumC33353Eom.A05, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r2 <= 1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.EnumC33353Eom r7, X.C35272Fh7 r8) {
        /*
            com.instagram.common.session.UserSession r0 = r8.A04
            X.95m r4 = X.C2049995m.A01(r0)
            com.instagram.user.model.User r6 = X.AbstractC166987dD.A10(r0)
            java.lang.String r0 = r6.getId()
            java.util.Map r1 = r4.A02
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L8d
            java.lang.String r0 = r6.getId()
            boolean r0 = r4.A06(r0)
            if (r0 == 0) goto L47
            java.lang.String r0 = r6.getId()
            java.lang.Object r0 = r1.get(r0)
            com.instagram.accountlinking.model.AccountFamily r0 = (com.instagram.accountlinking.model.AccountFamily) r0
            java.util.List r0 = r0.A04
            java.util.Iterator r3 = r0.iterator()
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L47
            com.instagram.user.model.User r2 = X.AbstractC25226BEj.A15(r3)
            X.0Bo r1 = r4.A01
            java.lang.String r0 = r2.getId()
            boolean r0 = r1.CPH(r0)
            if (r0 == 0) goto L30
            r6 = r2
        L47:
            java.lang.String r1 = r6.getUsername()
            java.lang.String r0 = X.C35264Fgy.A01()
            boolean r5 = r1.equals(r0)
            X.Eom r0 = X.EnumC33353Eom.A02
            if (r7 == r0) goto L85
            X.0Bo r0 = r4.A01
            java.util.Set r0 = r0.BOd()
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L81
            java.lang.String r1 = X.AbstractC166987dD.A1B(r3)
            boolean r0 = r4.A05(r1)
            if (r0 == 0) goto L7e
            boolean r0 = r4.A07(r1)
            if (r0 != 0) goto L7e
            int r0 = X.C2049995m.A00(r4, r1)
            if (r0 != 0) goto L62
        L7e:
            int r2 = r2 + 1
            goto L62
        L81:
            r1 = 1
            r0 = 0
            if (r2 > r1) goto L86
        L85:
            r0 = 1
        L86:
            if (r5 != 0) goto L8d
            if (r0 == 0) goto L8d
            X.AbstractC31177DnL.A1O(r6)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35272Fh7.A03(X.Eom, X.Fh7):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.EnumC33353Eom r19, X.C35272Fh7 r20) {
        /*
            r3 = r20
            com.instagram.common.session.UserSession r1 = r3.A04
            java.lang.String r6 = r1.userId
            X.3oJ r5 = X.C83743oJ.A01(r1)
            X.0iw r2 = r3.A03
            java.lang.String r0 = "logout_d3_loaded"
            X.AbstractC35076Fcn.A00(r2, r1, r0)
            r20 = 6
            X.FiT r15 = new X.FiT
            r7 = r19
            r19 = r6
            r18 = r5
            r17 = r7
            r16 = r3
            r15.<init>(r16, r17, r18, r19, r20)
            r13 = 7
            X.FiT r8 = new X.FiT
            r9 = r3
            r10 = r7
            r11 = r5
            r12 = r6
            r8.<init>(r9, r10, r11, r12, r13)
            androidx.fragment.app.FragmentActivity r9 = r3.A01
            X.8hC r4 = X.AbstractC31171DnF.A0H(r9)
            int r10 = r7.ordinal()
            r0 = 2
            if (r10 == r0) goto Ld9
            r2 = 3
            r0 = 2131972132(0x7f135024, float:1.9581263E38)
            if (r10 == r2) goto L42
            r0 = 2131972126(0x7f13501e, float:1.958125E38)
        L42:
            X.AbstractC31172DnG.A1C(r9, r4, r0)
            r14 = 2
            if (r10 == r14) goto Ld4
            r13 = 3
            if (r10 == r13) goto L72
            r0 = 2131972126(0x7f13501e, float:1.958125E38)
        L4e:
            java.lang.String r0 = r9.getString(r0)
        L52:
            r4.A0r(r0)
            X.Eom r1 = X.EnumC33353Eom.A04
            r0 = 2131972125(0x7f13501d, float:1.9581249E38)
            if (r7 != r1) goto L5f
            r0 = 2131954455(0x7f130b17, float:1.954541E38)
        L5f:
            r4.A0J(r15, r0)
            r0 = 2131968687(0x7f1342af, float:1.9574276E38)
            r4.A0I(r8, r0)
            X.AbstractC31174DnI.A1R(r4)
            X.AbstractC166987dD.A1W(r4)
            r5.A0H(r6)
            return
        L72:
            java.util.ArrayList r12 = r3.A00()
            int r11 = r12.size()
            r2 = 1
            r3 = 0
            if (r11 != r14) goto L92
            r10 = 2131972129(0x7f135021, float:1.9581257E38)
            java.lang.Object r1 = r12.get(r3)
            java.lang.Object r0 = r12.get(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
        L8d:
            java.lang.String r0 = r9.getString(r10, r0)
            goto L52
        L92:
            if (r11 != r13) goto La8
            r10 = 2131972130(0x7f135022, float:1.9581259E38)
            java.lang.Object r3 = r12.get(r3)
            java.lang.Object r1 = r12.get(r2)
            java.lang.Object r0 = r12.get(r14)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r1, r0}
            goto L8d
        La8:
            r0 = 4
            if (r11 < r0) goto Lc4
            r10 = 2131972131(0x7f135023, float:1.958126E38)
            java.lang.Object r3 = r12.get(r3)
            java.lang.Object r2 = r12.get(r2)
            java.lang.Object r1 = r12.get(r14)
            int r11 = r11 - r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r1, r0}
            goto L8d
        Lc4:
            r10 = 2131972128(0x7f135020, float:1.9581255E38)
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r1)
            java.lang.String r0 = r0.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            goto L8d
        Ld4:
            r0 = 2131972134(0x7f135026, float:1.9581267E38)
            goto L4e
        Ld9:
            r0 = 2131972133(0x7f135025, float:1.9581265E38)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35272Fh7.A04(X.Eom, X.Fh7):void");
    }

    public static void A07(C35272Fh7 c35272Fh7) {
        List list;
        UserSession userSession = c35272Fh7.A04;
        AbstractC35076Fcn.A00(c35272Fh7.A03, userSession, "logout_d4_loaded");
        C2049995m A01 = C2049995m.A01(userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A04 = A01.A04(userSession);
        if (A04 != null) {
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                A1E.add(AbstractC25226BEj.A15(it).getUsername());
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        User A03 = A01.A03(userSession);
        if (A03 != null) {
            AccountFamily accountFamily = (AccountFamily) A01.A02.get(A03.getId());
            if (accountFamily != null) {
                if (accountFamily.A04.isEmpty()) {
                    list = accountFamily.A03;
                } else {
                    list = accountFamily.A04;
                }
                HashSet A02 = C2049995m.A02(list);
                C84613qA c84613qA = A01.A00;
                if (c84613qA != null) {
                    C1LC it2 = ImmutableList.copyOf(c84613qA.A01.values()).iterator();
                    while (it2.hasNext()) {
                        FK7 fk7 = (FK7) it2.next();
                        if (A02.contains(fk7.A00.A01.getId())) {
                            A1E2.add(fk7.A00.A01.getUsername());
                        }
                    }
                }
            }
        }
        A1E.addAll(A1E2);
        C83743oJ.A01(userSession).A0K(userSession.userId);
        FragmentActivity fragmentActivity = c35272Fh7.A01;
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        Resources resources = fragmentActivity.getResources();
        int i = 2131965716;
        int size = A1E.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        if (size == 5) {
                            i = 2131965714;
                        }
                    } else {
                        i = 2131965715;
                    }
                } else {
                    i = 2131965717;
                }
            } else {
                i = 2131965718;
            }
        }
        A0H.A05 = AbstractC07900bA.A01(resources, (String[]) A1E.toArray(new String[A1E.size()]), i).toString();
        DialogInterfaceOnClickListenerC35453FkA.A02(A0H, c35272Fh7, 70, 2131965713);
        DialogInterfaceOnClickListenerC35453FkA.A01(A0H, c35272Fh7, 69);
        AbstractC31174DnI.A1R(A0H);
        AbstractC166987dD.A1W(A0H);
    }

    public final void A0B() {
        UserSession userSession = this.A04;
        ArrayList A04 = C2049995m.A01(userSession).A04(userSession);
        EnumC33353Eom enumC33353Eom = EnumC33353Eom.A03;
        A03(enumC33353Eom, this);
        U7K u7k = U7H.A04;
        FragmentActivity fragmentActivity = this.A01;
        if (A04 == null) {
            A04 = AbstractC166987dD.A1E();
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC31174DnI.A1N(new EV5(fragmentActivity, this.A00, fragmentActivity, this.A02, this.A03, userSession, enumC33353Eom, A04, A1E, true, AbstractC31177DnL.A1X(userSession)));
    }

    public final void A0C(EnumC33353Eom enumC33353Eom) {
        ClipsDraftRepository A00 = AbstractC193608hg.A00(this.A01, this.A04);
        C5JK c5jk = C5JK.A05;
        A7U a7u = new A7U(enumC33353Eom, this);
        AbstractC166987dD.A1Z(new C9DM(A00, c5jk, a7u, (InterfaceC23621Ds) null, 11, 42), ((C4A7) A00).A01);
    }

    public final void A0D(EnumC33353Eom enumC33353Eom, boolean z) {
        C32657EZg c32657EZg = new C32657EZg(enumC33353Eom, this);
        UserSession userSession = this.A04;
        if (C18U.A06(C06090Tz.A05, userSession, 36311478881813023L)) {
            C14120nc.A00().ATO(c32657EZg);
        } else {
            c32657EZg.run();
        }
        InterfaceC19610xo A0P = AbstractC31171DnF.A0P(AbstractC31171DnF.A0Q());
        A0P.E77("is_from_log_out", true);
        A0P.apply();
        U7K u7k = U7H.A04;
        FragmentActivity fragmentActivity = this.A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC31174DnI.A1N(new EV5(fragmentActivity, this.A00, fragmentActivity, this.A02, this.A03, userSession, enumC33353Eom, A1E, z));
    }

    public C35272Fh7(Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        fragmentActivity.getClass();
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A00 = fragment;
        abstractC10360h2.getClass();
        this.A02 = abstractC10360h2;
        this.A09 = abstractC018607g;
        interfaceC11380iw.getClass();
        this.A03 = interfaceC11380iw;
        this.A08 = new C34937FaN(fragmentActivity);
        FK4 fk4 = FK4.A02;
        if (fk4 == null) {
            fk4 = new FK4();
            FK4.A02 = fk4;
        }
        this.A07 = fk4;
        C14360o3.A0B(userSession, 0);
        this.A06 = (C36301Fzw) userSession.A01(C36301Fzw.class, new C50152MDf(userSession, 26));
        this.A05 = C1564370n.A00(userSession, fragmentActivity.getApplicationContext(), "IG_LOGOUT_UPSELL");
    }

    public static void A05(C35272Fh7 c35272Fh7) {
        String str;
        FragmentActivity fragmentActivity;
        int i;
        Object[] objArr;
        ArrayList A00 = c35272Fh7.A00();
        int size = A00.size();
        try {
            if (size == 2) {
                fragmentActivity = c35272Fh7.A01;
                i = 2131954447;
                objArr = new Object[]{A00.get(0), A00.get(1)};
            } else if (size == 3) {
                fragmentActivity = c35272Fh7.A01;
                i = 2131954448;
                objArr = new Object[]{A00.get(0), A00.get(1), A00.get(2)};
            } else if (size >= 4) {
                fragmentActivity = c35272Fh7.A01;
                i = 2131954449;
                objArr = new Object[]{A00.get(0), A00.get(1), A00.get(2), Integer.valueOf(size - 3)};
            } else {
                str = "";
                C193328hC A0H = AbstractC31171DnF.A0H(c35272Fh7.A01);
                A0H.A0A(2131954446);
                A0H.A0r(str);
                A0H.A0M(DialogInterfaceOnClickListenerC35453FkA.A00(c35272Fh7, 67), 2131954445);
                A0H.A0I(null, 2131954444);
                AbstractC31174DnI.A1R(A0H);
                C0fJ.A00(A0H.A02());
                return;
            }
            C0fJ.A00(A0H.A02());
            return;
        } catch (WindowManager.BadTokenException unused) {
            c35272Fh7.A0D(EnumC33353Eom.A04, false);
            return;
        }
        str = fragmentActivity.getString(i, objArr);
        C193328hC A0H2 = AbstractC31171DnF.A0H(c35272Fh7.A01);
        A0H2.A0A(2131954446);
        A0H2.A0r(str);
        A0H2.A0M(DialogInterfaceOnClickListenerC35453FkA.A00(c35272Fh7, 67), 2131954445);
        A0H2.A0I(null, 2131954444);
        AbstractC31174DnI.A1R(A0H2);
    }

    public static void A09(C35272Fh7 c35272Fh7, boolean z) {
        c35272Fh7.A01();
        UserSession userSession = c35272Fh7.A04;
        String str = userSession.userId;
        AbstractC35076Fcn.A02(c35272Fh7.A03, userSession, "logout_d1_loaded", str, z);
        C83743oJ.A01(userSession).A0H(str);
        FJF fjf = new FJF(c35272Fh7, str);
        FragmentActivity fragmentActivity = c35272Fh7.A01;
        C35166FfG c35166FfG = new C35166FfG(fragmentActivity);
        c35166FfG.A01(2131965720);
        String string = fragmentActivity.getString(2131969004);
        CheckBox checkBox = c35166FfG.A08;
        checkBox.getClass();
        checkBox.setChecked(z);
        checkBox.setText(string);
        checkBox.setOnCheckedChangeListener(new C35730FqD(17, fjf, c35166FfG));
        checkBox.setVisibility(0);
        View view = c35166FfG.A05;
        view.getClass();
        view.setVisibility(0);
        TextView textView = c35166FfG.A0A;
        textView.getClass();
        textView.setVisibility(8);
        c35166FfG.A03(DialogInterfaceOnClickListenerC35455FkC.A00(c35166FfG, fjf, 59), c35166FfG.A02.getString(2131965713));
        c35166FfG.A02(DialogInterfaceOnClickListenerC35453FkA.A00(c35272Fh7, 66), 2131954754);
        C0fJ.A00(c35166FfG.A00());
    }

    public static void A0A(C35272Fh7 c35272Fh7, boolean z) {
        c35272Fh7.A01();
        AbstractC35076Fcn.A00(c35272Fh7.A03, c35272Fh7.A04, "logout_d2_loaded");
        C193328hC A0H = AbstractC31171DnF.A0H(c35272Fh7.A01);
        A0H.A0A(2131965720);
        A0H.A0J(new DialogInterfaceOnClickListenerC35331Fi8(2, c35272Fh7, z), 2131965713);
        DialogInterfaceOnClickListenerC35454FkB.A01(A0H, c35272Fh7, 0);
        AbstractC31174DnI.A1R(A0H);
        AbstractC166987dD.A1W(A0H);
    }
}
