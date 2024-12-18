package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class EV5 extends U7H implements InterfaceC11380iw, C08V {
    public static final String __redex_internal_original_name = "LogoutTask";
    public User A00;
    public final Context A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final AbstractC10360h2 A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final EnumC33353Eom A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;

    public EV5(Context context, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33353Eom enumC33353Eom, List list, List list2, boolean z, boolean z2) {
        AbstractC167007dF.A1G(context, 1, abstractC10360h2);
        this.A01 = context;
        this.A06 = userSession;
        this.A08 = list;
        this.A09 = list2;
        this.A04 = abstractC10360h2;
        this.A07 = enumC33353Eom;
        this.A02 = fragment;
        this.A03 = fragmentActivity;
        this.A05 = interfaceC11380iw;
        this.A0B = z;
        this.A0A = z2;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "log_out_task";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C84613qA c84613qA, EV5 ev5, int i) {
        android.net.Uri A01;
        C07270a1 A03 = C023409i.A0A.A03(ev5);
        ImmutableList A0L = AbstractC31173DnH.A0L(c84613qA.A02.values());
        C34561FKv c34561FKv = (C34561FKv) A0L.get(i);
        FragmentActivity fragmentActivity = ev5.A03;
        EnumC31713DwI enumC31713DwI = EnumC31713DwI.A0Z;
        InterfaceC11380iw interfaceC11380iw = ev5.A05;
        Integer num = C05F.A01;
        String username = c34561FKv.A00.getUsername();
        G9Q g9q = new G9Q(fragmentActivity);
        Fragment fragment = ev5.A02;
        if (fragment == null) {
            A01 = null;
        } else {
            A01 = AbstractC31525Dt9.A01(fragment);
        }
        C32973Efe c32973Efe = new C32973Efe(A01, fragmentActivity, c84613qA, interfaceC11380iw, A03, g9q, ev5, c34561FKv, enumC31713DwI, num, username, A0L, i);
        C1ON A04 = AbstractC35276FhB.A04(ev5.A01, A03, c34561FKv.A01, c34561FKv.A00.getId(), null);
        A04.A00 = c32973Efe;
        C1GJ.A03(A04);
    }

    public static final void A01(EV5 ev5) {
        UserSession userSession = ev5.A06;
        C84613qA A00 = C84613qA.A00(userSession);
        C14360o3.A07(A00);
        if (!A00.A02.isEmpty()) {
            HashMap A1G = AbstractC166987dD.A1G();
            A00.A02 = A1G;
            A00.A05(A1G.values());
        }
        if (!A00.A01.isEmpty()) {
            HashMap A1G2 = AbstractC166987dD.A1G();
            A00.A01 = A1G2;
            A00.A04(A1G2.values());
        }
        HashMap A1G3 = AbstractC166987dD.A1G();
        List list = ev5.A09;
        A1G3.put("uids", list.toString());
        A1G3.put("uids_count", String.valueOf(list.size()));
        C14360o3.A0B(userSession, 0);
        C83753oK.A00(userSession, C05F.A01, "logout_success", "login_logout_integration", "logout_integration", "logout", null, A1G3);
        C17280tP A0y = AbstractC166987dD.A0y();
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        AbstractC31171DnF.A1S(A0y, str, A0y.A09, C17280tP.A4G, 185);
        C41451vu.A01.E4s(new C04070Jy(null, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0029, code lost:
    
        if (X.AbstractC31177DnL.A1X(r23.A06) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r23.A0A == false) goto L10;
     */
    @Override // X.U7H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object[] r24) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EV5.A03(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.U7H
    public final void A04() {
        if (this.A0B) {
            AbstractC10360h2 abstractC10360h2 = this.A04;
            if (abstractC10360h2.A0Q("ProgressDialog") == null) {
                new C67858Uzp().A0G(new C14240no(abstractC10360h2), "ProgressDialog", true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b6  */
    @Override // X.U7H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ void A05(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EV5.A05(java.lang.Object):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EV5(Context context, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33353Eom enumC33353Eom, List list, boolean z, boolean z2) {
        this(context, fragment, fragmentActivity, abstractC10360h2, interfaceC11380iw, userSession, enumC33353Eom, AbstractC166987dD.A1E(), list, z, z2);
        AbstractC25233BEq.A0x(1, context, abstractC10360h2, enumC33353Eom);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EV5(Context context, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33353Eom enumC33353Eom, List list, boolean z) {
        this(context, fragment, fragmentActivity, abstractC10360h2, interfaceC11380iw, userSession, enumC33353Eom, list, true, z);
        C14360o3.A0B(context, 1);
        AbstractC25233BEq.A0x(2, userSession, abstractC10360h2, enumC33353Eom);
    }
}
