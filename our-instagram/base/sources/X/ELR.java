package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ELR extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, GYT {
    public static final String __redex_internal_original_name = "DirectSearchSeeAllMessagesFragment";
    public int A00;
    public int A01;
    public C66362zD A02;
    public ViewModelListUpdate A03;
    public C57112jm A04;
    public C36294Fzo A05;
    public FQQ A06;
    public String A07;
    public ArrayList A08;
    public int A09;
    public RecyclerView A0A;
    public String A0B;
    public final InterfaceC37168GZf A0F = new G2N(this);
    public final GXU A0C = new G2Q(this);
    public final C1I4 A0E = new E0L(this, 16);
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(true);
        String str = this.A0B;
        if (str == null) {
            C14360o3.A0F(DialogModule.KEY_TITLE);
            throw C00O.createAndThrow();
        }
        interfaceC56362iU.setTitle(str);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_SEE_ALL_MESSAGES_FRAGMENT";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57112jm c57112jm = this.A04;
        if (c57112jm == null) {
            str = "viewpointManager";
        } else {
            C71163Hc A00 = C71163Hc.A00(this);
            RecyclerView recyclerView = this.A0A;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                c57112jm.A08(recyclerView, A00, new InterfaceC57142jp[0]);
                AbstractC31179DnN.A0t(this);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.GYT
    public final void DjF() {
        FQQ fqq = this.A06;
        if (fqq != null) {
            fqq.A00(this.A00);
            A00();
        } else {
            C14360o3.A0F("messageSearchProvider");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C36294Fzo c36294Fzo = this.A05;
        if (c36294Fzo == null) {
            C14360o3.A0F("messageSearchLogger");
            throw C00O.createAndThrow();
        }
        c36294Fzo.A02("thread_list");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r11 = this;
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = X.AbstractC31171DnF.A0E()
            r11.A03 = r0
            java.util.ArrayList r0 = r11.A08
            if (r0 != 0) goto L14
            java.lang.String r0 = "messageResults"
        Lc:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L14:
            java.util.Iterator r3 = X.AbstractC166997dE.A13(r0)
            r4 = 0
            r7 = 0
            r8 = 0
        L1b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r6 = X.AbstractC166997dE.A0l(r3)
            com.instagram.model.direct.DirectSearchResult r6 = (com.instagram.model.direct.DirectSearchResult) r6
            com.instagram.common.recyclerview.ViewModelListUpdate r2 = r11.A03
            if (r2 == 0) goto L94
            int r1 = r7 + 1
            int r0 = r8 + 1
            r9 = -1
            int r10 = r11.A09
            X.FyL r5 = new X.FyL
            r5.<init>(r6, r7, r8, r9, r10)
            r2.A00(r5)
            r7 = r1
            r8 = r0
            goto L1b
        L3d:
            X.FQQ r0 = r11.A06
            if (r0 == 0) goto L9c
            java.lang.Integer r1 = r0.A00
            if (r1 == 0) goto L98
            java.lang.Integer r0 = X.C05F.A01
            r5 = 1
            if (r1 != r0) goto L6a
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = r11.A03
            if (r3 == 0) goto L94
            android.content.Context r1 = r11.requireContext()
            r0 = 2131973064(0x7f1353c8, float:1.9583153E38)
            java.lang.String r1 = r1.getString(r0)
            int r0 = r11.A01
            X.EY0 r2 = new X.EY0
            r2.<init>(r1, r0, r5)
        L60:
            r3.A00(r2)
        L63:
            X.2zD r1 = r11.A02
            if (r1 != 0) goto L8c
            java.lang.String r0 = "adapter"
            goto Lc
        L6a:
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L63
            com.instagram.common.recyclerview.ViewModelListUpdate r3 = r11.A03
            if (r3 == 0) goto L94
            android.content.Context r2 = r11.requireContext()
            r1 = 2131973013(0x7f135395, float:1.958305E38)
            java.lang.String r0 = r11.A07
            if (r0 != 0) goto L80
            java.lang.String r0 = "query"
            goto Lc
        L80:
            java.lang.String r1 = X.AbstractC167007dF.A0f(r2, r0, r1)
            int r0 = r11.A01
            X.EY0 r2 = new X.EY0
            r2.<init>(r1, r0, r4)
            goto L60
        L8c:
            com.instagram.common.recyclerview.ViewModelListUpdate r0 = r11.A03
            if (r0 == 0) goto L94
            r1.A05(r0)
            return
        L94:
            java.lang.String r0 = "viewModelListUpdater"
            goto Lc
        L98:
            java.lang.String r0 = "state"
            goto Lc
        L9c:
            java.lang.String r0 = "messageSearchProvider"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELR.A00():void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1636878109);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireContext().getColor(AbstractC31180DnO.A01(this));
        this.A0B = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_TITLE", "");
        this.A07 = requireArguments.getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", "");
        this.A00 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_NEXT_OFFSET", 0);
        this.A09 = requireArguments.getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX");
        ArrayList parcelableArrayList = requireArguments.getParcelableArrayList("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGES");
        if (parcelableArrayList == null) {
            parcelableArrayList = AbstractC166987dD.A1E();
        }
        this.A08 = parcelableArrayList;
        InterfaceC09390do interfaceC09390do = this.A0D;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C61972ry A0K = AbstractC31180DnO.A0K(requireContext(), this);
        FG5 fg5 = new FG5(this);
        String str = this.A07;
        if (str == null) {
            C14360o3.A0F("query");
            throw C00O.createAndThrow();
        }
        FQQ fqq = new FQQ(A0r, A0K, fg5, str);
        this.A06 = fqq;
        fqq.A00(this.A00);
        this.A05 = C36294Fzo.A00(AbstractC166987dD.A0r(interfaceC09390do));
        this.A04 = C57112jm.A00();
        C0f9.A09(856942542, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.2zJ, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1822127676);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.inbox_search_see_all_fragment, viewGroup, false);
        this.A0A = AbstractC31180DnO.A08(inflate);
        C66392zG A00 = C66362zD.A00(requireActivity());
        A00.A01(new Object());
        A00.A01(new EXO(requireContext(), this));
        this.A02 = AbstractC31173DnH.A0R(A00, new EXY(requireContext(), this, AbstractC166987dD.A0r(this.A0D), this.A0F));
        RecyclerView recyclerView = this.A0A;
        String str = "recyclerView";
        if (recyclerView != null) {
            AbstractC31177DnL.A17(this, recyclerView);
            RecyclerView recyclerView2 = this.A0A;
            if (recyclerView2 != null) {
                C66362zD c66362zD = this.A02;
                if (c66362zD == null) {
                    str = "adapter";
                } else {
                    recyclerView2.setAdapter(c66362zD);
                    RecyclerView recyclerView3 = this.A0A;
                    if (recyclerView3 != null) {
                        recyclerView3.A14(this.A0E);
                        A00();
                        C0f9.A09(1570506818, A02);
                        return inflate;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
