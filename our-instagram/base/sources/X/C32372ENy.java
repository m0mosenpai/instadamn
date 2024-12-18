package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ENy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32372ENy extends C53Z implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MessageSearchMessageListFragment";
    public RecyclerView A00;
    public C66362zD A01;
    public ViewModelListUpdate A02;
    public C57112jm A03;
    public InterfaceC37194Ga5 A04;
    public C36294Fzo A05;
    public C37384GdQ A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public boolean A0F;
    public boolean A0G;
    public Context A0I;
    public C1GL A0J;
    public List A0E = AbstractC166987dD.A1E();
    public int A0H = 0;
    public final Handler A0K = AbstractC167007dF.A0J();
    public final InterfaceC62602sz A0O = new C36745GHo(this, 4);
    public final FFV A0N = new FFV(this);
    public final C1I4 A0Q = new E0L(this, 7);
    public final InterfaceC37168GZf A0R = new G2M(this);
    public final GXU A0M = new G2P(this);
    public final Runnable A0P = new GLD(this);
    public final C13400mQ A0L = new C13400mQ(AbstractC167007dF.A0J(), new G0V(this, 2), 300);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        if (C18U.A06(C06090Tz.A05, getSession(), 36324655841161548L)) {
            SearchEditText Ehl = interfaceC56362iU.Ehl();
            Ehl.setSearchIconEnabled(false);
            Ehl.requestFocus();
            Ehl.A06();
            Ehl.setHint(2131966350);
            C31703Dw8.A00(Ehl, this, 2);
            return;
        }
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.setTitle(this.A09);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "message_search_message_list_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        this.A05.A02("message_list");
        return false;
    }

    public static void A00(C32372ENy c32372ENy, List list) {
        ViewModelListUpdate viewModelListUpdate;
        c32372ENy.A02 = AbstractC31171DnF.A0E();
        if (list != null && !list.isEmpty() && c32372ENy.A02 != null) {
            List list2 = c32372ENy.A0E;
            int i = c32372ENy.A0H;
            ArrayList A1E = AbstractC166987dD.A1E();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                A1E.add(new C36207FyL((DirectMessageSearchMessage) list.get(i2), i2, -1, -1, i));
            }
            list2.addAll(A1E);
            c32372ENy.A02.A01(list2);
        } else if (c32372ENy.A0E.isEmpty() && c32372ENy.getContext() != null && (viewModelListUpdate = c32372ENy.A02) != null) {
            viewModelListUpdate.A00(new C32620EXu(c32372ENy.getContext().getString(2131968594)));
        } else {
            AbstractC31557Dth.A01(c32372ENy, false);
            return;
        }
        AbstractC31557Dth.A01(c32372ENy, false);
        ViewModelListUpdate viewModelListUpdate2 = c32372ENy.A02;
        if (viewModelListUpdate2 != null) {
            c32372ENy.A01.A05(viewModelListUpdate2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-486987115);
        super.onCreate(bundle);
        this.A0B = AbstractC31173DnH.A0j(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        this.A09 = AbstractC31172DnG.A13(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY");
        this.A0C = AbstractC31173DnH.A0j(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE");
        this.A0H = requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX");
        this.A0A = AbstractC31173DnH.A0j(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY");
        Long l = null;
        this.A08 = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CUTOVER_OPEN_THREAD_ID", null);
        UserSession session = getSession();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0G = C18U.A06(c06090Tz, session, 36317496133031201L);
        this.A0F = C18U.A06(c06090Tz, getSession(), 36317496133227811L);
        this.A0D = requireArguments().getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_PENDING_RECIPIENTS");
        String string = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_FBID", null);
        if (string != null) {
            l = AbstractC25228BEl.A13(string);
        }
        this.A07 = l;
        this.A05 = C36294Fzo.A00(getSession());
        this.A03 = C57112jm.A00();
        this.A0J = C1GJ.A01();
        C0f9.A09(2069140294, A02);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1513963905);
        View inflate = layoutInflater.inflate(R.layout.message_search_result_list_layout, viewGroup, false);
        this.A0I = requireContext();
        this.A00 = AbstractC31172DnG.A0G(inflate, R.id.message_result_list);
        C66392zG A00 = C66362zD.A00(this.A0I);
        A00.A01(new EXY(this.A0I, this, getSession(), this.A0R));
        A00.A01(new C65721Tsu(this.A0O, null, null, R.layout.direct_search_load_more_empty));
        this.A01 = AbstractC31173DnH.A0R(A00, new Object());
        AbstractC31177DnL.A0s(inflate.getContext(), this.A00);
        this.A00.setAdapter(this.A01);
        this.A00.A14(this.A0Q);
        C0f9.A09(-2007823422, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1283506879);
        super.onDestroy();
        InterfaceC37194Ga5 interfaceC37194Ga5 = this.A04;
        if (interfaceC37194Ga5 != null) {
            interfaceC37194Ga5.onDestroy();
        }
        C0f9.A09(-1662667095, A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            super.onViewCreated(r9, r10)
            X.2jm r2 = r8.A03
            if (r2 == 0) goto L10
            X.3Hc r1 = X.C71163Hc.A00(r8)
            androidx.recyclerview.widget.RecyclerView r0 = r8.A00
            r2.A06(r0, r1)
        L10:
            java.lang.String r1 = r8.A0A
            java.lang.String r0 = "open"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3c
            com.instagram.common.session.UserSession r1 = r8.getSession()
            java.lang.String r4 = r8.A09
            java.lang.String r5 = r8.A0B
            X.FFV r2 = r8.A0N
            r3 = 0
            X.Eb4 r0 = new X.Eb4
            r0.<init>(r1, r2, r3, r4, r5)
        L2a:
            r8.A04 = r0
        L2c:
            java.lang.String r0 = r8.A09
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3b
            r0 = 1
            X.AbstractC31557Dth.A00(r9, r0)
            X.AbstractC31178DnM.A1Q(r8)
        L3b:
            return
        L3c:
            java.lang.String r0 = "e2ee"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5d
            boolean r0 = r8.A0G
            if (r0 == 0) goto L5d
            com.instagram.common.session.UserSession r1 = r8.getSession()
            java.lang.String r4 = r8.A09
            java.lang.String r5 = r8.A0B
            java.lang.String r6 = r8.A0C
            java.util.List r7 = r8.A0D
            X.FFV r2 = r8.A0N
            r3 = 0
            X.Eb5 r0 = new X.Eb5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L2a
        L5d:
            java.lang.String r0 = "cutover"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L2c
            boolean r0 = r8.A0F
            if (r0 == 0) goto L2c
            com.instagram.common.session.UserSession r1 = r8.getSession()
            java.lang.String r3 = r8.A09
            java.lang.String r4 = r8.A0B
            java.lang.String r5 = r8.A08
            java.lang.String r6 = r8.A0C
            java.util.List r7 = r8.A0D
            X.FFV r2 = r8.A0N
            X.G2S r0 = new X.G2S
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32372ENy.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
