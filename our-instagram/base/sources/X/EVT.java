package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class EVT extends AbstractC60592pi implements C1GL, InterfaceC169507hQ, InterfaceC37224GaZ, InterfaceViewOnFocusChangeListenerC37281Gbi, AbsListView.OnScrollListener {
    public C35151Fet A00;
    public InterfaceC169517hR A01;
    public List A02;
    public Dialog A03;
    public ListView A04;
    public DirectShareTarget A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final EQH A08;
    public final C31600DuS A09;
    public final ArrayList A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Context A0E;
    public final AbstractC018607g A0F;
    public final C32325ELt A0G;
    public final C35018Fbr A0H;
    public final EnumC31337Dq2 A0I;
    public final List A0J;
    public final boolean A0K;

    public EVT(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C32325ELt c32325ELt, C31600DuS c31600DuS, EnumC31337Dq2 enumC31337Dq2, List list, int i, int i2, int i3, boolean z) {
        C14360o3.A0B(userSession, 3);
        AbstractC25229BEm.A1L(enumC31337Dq2, 10, c31600DuS);
        this.A0E = context;
        this.A0F = abstractC018607g;
        this.A07 = userSession;
        this.A0G = c32325ELt;
        this.A0J = list;
        this.A0B = i;
        this.A0C = i2;
        this.A06 = interfaceC11380iw;
        this.A09 = c31600DuS;
        this.A0A = AbstractC166987dD.A1E();
        C35018Fbr c35018Fbr = (C35018Fbr) C31651DvH.A00(userSession, C35018Fbr.class, 7);
        C14360o3.A07(c35018Fbr);
        this.A0H = c35018Fbr;
        this.A0K = z;
        this.A08 = new EQH(context, interfaceC11380iw, userSession, this, this, z);
        this.A0D = i3;
        this.A0I = enumC31337Dq2;
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final /* synthetic */ void Cyr(View view) {
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.non_interop_recipients_list);
        ListView listView = (ListView) requireViewById;
        this.A04 = listView;
        C14360o3.A07(requireViewById);
        listView.setScrollBarStyle(33554432);
        listView.setClipToPadding(false);
        Context context = this.A0E;
        AbstractC13880nE.A0Y(listView, AbstractC167017dG.A03(context));
        listView.setOnScrollListener(this);
        UserSession userSession = this.A07;
        this.A00 = new C35151Fet((ViewGroup) view, userSession, this);
        listView.setAdapter((ListAdapter) this.A08);
        C61972ry c61972ry = new C61972ry(context, this.A0F, null);
        C14360o3.A0B(userSession, 1);
        this.A01 = AbstractC31674Dvf.A00(context, userSession, c61972ry, "default_no_interop", null, false, false, false);
        A01(false);
        InterfaceC169517hR interfaceC169517hR = this.A01;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.EYJ(this);
        }
    }

    @Override // X.InterfaceC37224GaZ
    public final void DAR(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        List A00;
        C14360o3.A0B(interfaceC169517hR, 0);
        List list = ((C31671Dvc) interfaceC169517hR.Bov()).A00;
        String BjQ = interfaceC169517hR.BjQ();
        EQH eqh = this.A08;
        boolean z = !interfaceC169517hR.isLoading();
        eqh.A01 = z;
        eqh.A03.A00 = !z;
        if (BjQ != null && BjQ.length() != 0) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                if (A0m.A0R()) {
                    A1E.add(A0m);
                }
            }
            C14360o3.A0C(A1E, "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.model.direct.DirectShareTarget>");
            A00 = C15500q5.A02(A1E);
        } else {
            A00 = A00(this);
        }
        eqh.A01(A00);
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdF(DirectShareTarget directShareTarget) {
        DdH(directShareTarget, 6, -1, -1);
    }

    @Override // X.InterfaceC37224GaZ
    public final void DdG(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdH(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        int size;
        String str;
        String str2;
        String str3;
        C193328hC A0I;
        String str4;
        String str5;
        C14360o3.A0B(directShareTarget, 0);
        UserSession userSession = this.A07;
        boolean A1a = AbstractC166987dD.A1a(AbstractC47132Ef.A00(userSession).A0E.A00());
        boolean z = this.A0K;
        if (z && !directShareTarget.A0a(A1a)) {
            boolean z2 = !directShareTarget.A0J();
            A0I = AbstractC31171DnF.A0I(this.A0E);
            int i4 = 2131958816;
            if (z2) {
                i4 = 2131958682;
            }
            A0I.A0A(i4);
            int i5 = 2131958819;
            if (z2) {
                i5 = 2131958683;
            }
            A0I.A09(i5);
            A0I.A07();
        } else {
            ArrayList arrayList = this.A0A;
            if (arrayList.contains(directShareTarget)) {
                arrayList.remove(directShareTarget);
                Integer A04 = directShareTarget.A04(userSession.userId, false);
                C14360o3.A07(A04);
                long j = i2;
                long j2 = i3;
                InterfaceC169517hR interfaceC169517hR = this.A01;
                if (interfaceC169517hR != null) {
                    str4 = interfaceC169517hR.BjQ();
                    str5 = interfaceC169517hR.Bo9();
                } else {
                    str4 = null;
                    str5 = null;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator A13 = AbstractC166997dE.A13(arrayList);
                while (A13.hasNext()) {
                    AbstractC31177DnL.A1R(AbstractC31173DnH.A0o((DirectShareTarget) AbstractC166997dE.A0l(A13)), A1E);
                }
                this.A09.A09(new E9O(directShareTarget, A04, str4, str5, A1E, i, j, j2), arrayList);
                A01(false);
                C162337Ov.A0H(this.A06, userSession, directShareTarget, AbstractC34051F1e.A00(i), directShareTarget.A08(), null, null, null, null, null, null, "DIRECT", j, -1L);
                return true;
            }
            if (A02(directShareTarget)) {
                String str6 = directShareTarget.A0J;
                if (str6 == null) {
                    str6 = "";
                }
                Context context = this.A0E;
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0A(2131959540);
                AbstractC31177DnL.A0v(context, A0I, str6, 2131959541);
                A0I.A0J(null, 2131956237);
            } else {
                C35018Fbr c35018Fbr = this.A0H;
                List list = this.A0J;
                int i6 = this.A0C;
                int i7 = this.A0B;
                EnumC31337Dq2 enumC31337Dq2 = this.A0I;
                int ordinal = enumC31337Dq2.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            size = 0;
                        } else {
                            size = arrayList.size() + i7;
                        }
                    } else {
                        size = arrayList.size() + i6;
                    }
                } else {
                    size = arrayList.size();
                    if (list != null) {
                        size = AbstractC31172DnG.A02(list, size);
                    }
                }
                Context context2 = this.A0E;
                if (!F7E.A00(context2, userSession, AbstractC31172DnG.A14(directShareTarget), directShareTarget.A0P())) {
                    int i8 = this.A0D;
                    if (size < c35018Fbr.A01(enumC31337Dq2, i8, z)) {
                        Integer A042 = directShareTarget.A04(userSession.userId, false);
                        C14360o3.A07(A042);
                        long j3 = i2;
                        long j4 = i3;
                        InterfaceC169517hR interfaceC169517hR2 = this.A01;
                        if (interfaceC169517hR2 != null) {
                            str = interfaceC169517hR2.BjQ();
                            str2 = interfaceC169517hR2.Bo9();
                        } else {
                            str = null;
                            str2 = null;
                        }
                        ArrayList A1E2 = AbstractC166987dD.A1E();
                        Iterator A132 = AbstractC166997dE.A13(arrayList);
                        while (A132.hasNext()) {
                            AbstractC31177DnL.A1R(AbstractC31173DnH.A0o((DirectShareTarget) AbstractC166997dE.A0l(A132)), A1E2);
                        }
                        E9O e9o = new E9O(directShareTarget, A042, str, str2, A1E2, i, j3, j4);
                        C31600DuS c31600DuS = this.A09;
                        InterfaceC11380iw interfaceC11380iw = this.A06;
                        c31600DuS.A06(interfaceC11380iw, userSession, e9o, "DIRECT", arrayList, false);
                        arrayList.add(directShareTarget);
                        A01(true);
                        String A00 = AbstractC34051F1e.A00(i);
                        String A08 = directShareTarget.A08();
                        InterfaceC169517hR interfaceC169517hR3 = this.A01;
                        if (interfaceC169517hR3 != null) {
                            str3 = interfaceC169517hR3.BjQ();
                        } else {
                            str3 = null;
                        }
                        C162337Ov.A0C(null, interfaceC11380iw, userSession, directShareTarget, A00, A08, null, str3, null, null, null, null, null, null, "DIRECT", j3, -1L);
                        return true;
                    }
                    Dialog A02 = c35018Fbr.A02(context2, enumC31337Dq2, i8, z);
                    this.A03 = A02;
                    if (A02 != null) {
                        C0fJ.A00(A02);
                    }
                    C162337Ov.A0M(this.A06, userSession);
                    C32325ELt c32325ELt = this.A0G;
                    if (c32325ELt != null && c32325ELt.A01 == 29) {
                        int ordinal2 = c32325ELt.A06.ordinal();
                        if (ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                C142846ck A002 = AbstractC147806l5.A00(c32325ELt.A02);
                                int i9 = c32325ELt.A00;
                                String A07 = AbstractC1345466e.A07(c32325ELt.A05);
                                String str7 = c32325ELt.A07;
                                C25531Mh A0I2 = AbstractC31172DnG.A0I(A002);
                                if (AbstractC25226BEj.A1Z(A0I2)) {
                                    AbstractC31175DnJ.A1B(A0I2, A002);
                                    AbstractC31174DnI.A1I(A0I2, "collaborator_invite_limit_reached");
                                    A0I2.A0o("collaborator_invite_limit_dialog");
                                    A0I2.A0h(AbstractC31179DnN.A0a(A0I2, "add_collaborators_sheet", A07, str7, i9));
                                    A0I2.Cht();
                                    return false;
                                }
                            }
                        } else {
                            C36267FzK A003 = AbstractC34061F1o.A00(c32325ELt.A02);
                            AbstractC34065F1s.A00(A003.A00, AbstractC1345466e.A07(c32325ELt.A05), c32325ELt.A07, "moderator_invite_limit_reached", "tap", "add_moderator_button", "thread_details_people", null, c32325ELt.A00);
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        AbstractC166987dD.A1W(A0I);
        return false;
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean DdK(DirectShareTarget directShareTarget) {
        return false;
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdL(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        DdH(directShareTarget, 6, -1, -1);
    }

    @Override // X.InterfaceC37224GaZ
    public final /* synthetic */ void DdO(View view) {
    }

    @Override // X.InterfaceC37224GaZ
    public final /* synthetic */ void DdP() {
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final /* synthetic */ void DjA() {
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DjT(String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 0);
        InterfaceC169517hR interfaceC169517hR = this.A01;
        if (interfaceC169517hR != null) {
            str2 = interfaceC169517hR.BjQ();
        } else {
            str2 = null;
        }
        Locale locale = Locale.ROOT;
        if (!AbstractC13670mt.A0G(str2, AbstractC13670mt.A01(AbstractC31172DnG.A16(locale, str)))) {
            InterfaceC169517hR interfaceC169517hR2 = this.A01;
            if (interfaceC169517hR2 != null) {
                interfaceC169517hR2.Eby(AbstractC13670mt.A01(AbstractC31172DnG.A16(locale, str)));
            }
            this.A09.A08(this.A06, this.A07, str);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
    }

    private final void A01(boolean z) {
        this.A08.A00();
        C35151Fet c35151Fet = this.A00;
        if (c35151Fet != null) {
            c35151Fet.A01(this.A0A, z);
        }
        C32325ELt c32325ELt = this.A0G;
        if (c32325ELt != null) {
            c32325ELt.A08 = this.A0A;
            AbstractC31178DnM.A0v(c32325ELt);
        }
    }

    private final boolean A02(DirectShareTarget directShareTarget) {
        UserSession userSession = this.A07;
        Object obj = AbstractC31172DnG.A18(directShareTarget).get(0);
        C14360o3.A07(obj);
        if (C4GO.A00(userSession, (PendingRecipient) obj).A29()) {
            return false;
        }
        return AbstractC31176DnK.A1a(C06090Tz.A05, userSession, 36325330151158784L);
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean Cci(DirectShareTarget directShareTarget) {
        return this.A0A.contains(directShareTarget);
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean Ceu(DirectShareTarget directShareTarget) {
        DirectShareTarget directShareTarget2 = this.A05;
        if (directShareTarget2 != null && directShareTarget2.equals(directShareTarget)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onCreate() {
        List list = this.A0J;
        if (list != null) {
            this.A08.A00 = AbstractC31171DnF.A0k(list);
        }
        UserSession userSession = this.A07;
        C1ON A02 = AbstractC35238FgX.A02(userSession, AbstractC13670mt.A06("friendships/%s/following/", userSession.userId), "direct_recipient_list_page");
        A02.A00 = new EE9(userSession, this, 6);
        schedule(A02);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        InterfaceC37232Gah interfaceC37232Gah;
        InterfaceC169517hR interfaceC169517hR = this.A01;
        if (interfaceC169517hR != null) {
            interfaceC169517hR.EYJ(null);
        }
        InterfaceC169517hR interfaceC169517hR2 = this.A01;
        if (interfaceC169517hR2 != null) {
            interfaceC169517hR2.DEw();
        }
        this.A01 = null;
        C35151Fet c35151Fet = this.A00;
        if (c35151Fet != null && (interfaceC37232Gah = c35151Fet.A02) != null) {
            interfaceC37232Gah.AHQ();
        }
        this.A04 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        Dialog dialog = this.A03;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.A03 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
        InterfaceC37232Gah interfaceC37232Gah;
        C35151Fet c35151Fet = this.A00;
        if (c35151Fet != null && (interfaceC37232Gah = c35151Fet.A02) != null) {
            interfaceC37232Gah.E0x();
        }
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        if (c11r != null) {
            C1GJ.A00(this.A0E, this.A0F, c11r);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final ArrayList A00(EVT evt) {
        ArrayList A1E = AbstractC166987dD.A1E();
        HashSet A1H = AbstractC166987dD.A1H();
        UserSession userSession = evt.A07;
        for (C2EC c2ec : ((C2DU) AbstractC28761aE.A00(userSession)).A0C.A0G(C4I1.A00, C2EB.A04, C4I3.A0I)) {
            if (!c2ec.CPl() || C18U.A06(C06090Tz.A05, userSession, 36325081044366022L)) {
                List BSH = c2ec.BSH();
                if (BSH.size() == 1) {
                    DirectShareTarget directShareTarget = new DirectShareTarget((User) AbstractC166987dD.A16(BSH));
                    if (A1H.add(directShareTarget)) {
                        A1E.add(directShareTarget);
                    }
                }
            }
        }
        List list = evt.A02;
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1V(A0q, it);
            }
            A1E.addAll(A0q);
        }
        return A1E;
    }

    @Override // X.InterfaceC37224GaZ
    public final boolean EiQ(DirectShareTarget directShareTarget) {
        return A02(directShareTarget);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0N = AbstractC167017dG.A0N(absListView, 1773787396);
        C32325ELt c32325ELt = this.A0G;
        if (c32325ELt != null) {
            c32325ELt.onScroll(absListView, i, i2, i3);
        }
        C0f9.A0A(-2119501524, A0N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C35151Fet c35151Fet;
        int A0N = AbstractC167017dG.A0N(absListView, -1413116604);
        C35151Fet c35151Fet2 = this.A00;
        if (c35151Fet2 != null && c35151Fet2.A02.CKx() && (c35151Fet = this.A00) != null) {
            c35151Fet.A02.AHn();
        }
        C32325ELt c32325ELt = this.A0G;
        if (c32325ELt != null) {
            c32325ELt.onScrollStateChanged(absListView, i);
        }
        C0f9.A0A(1728357606, A0N);
    }

    @Override // X.InterfaceViewOnFocusChangeListenerC37281Gbi
    public final void DdN(DirectShareTarget directShareTarget) {
        this.A05 = directShareTarget;
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        schedule(c11r);
    }
}
