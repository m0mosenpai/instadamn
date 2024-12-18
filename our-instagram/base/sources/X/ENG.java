package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes6.dex */
public final class ENG extends C38K implements InterfaceC60122ou, GXk, C38O {
    public static final String __redex_internal_original_name = "SimilarHashtagsFragment";
    public UserSession A00;
    public C32414EPp A01;
    public C31434Dre A02;
    public C63822v3 A03;
    public Hashtag A04;
    public final C31363DqS A08 = new C31363DqS();
    public final C61372qz A05 = new C61372qz();
    public final InterfaceC63862v7 A06 = new C36495G7t(this, 1);
    public final InterfaceC37215GaQ A09 = new C36485G7j(this);
    public final AbsListView.OnScrollListener A07 = new LRB(this, 1);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "see_all_suggested_hashtag_fragment";
    }

    @Override // X.GXk, X.C38O
    public final C193328hC AM3(C193328hC c193328hC) {
        c193328hC.A0m(this, this.A00);
        return c193328hC;
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A00;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131974095);
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, X.GaR] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String encode;
        int A02 = C0f9.A02(-426318766);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        Context requireContext = requireContext();
        this.A01 = new C32414EPp(requireActivity(), requireContext, this, this.A00, this.A08, this.A09, this, this, new Object(), null, requireContext().getString(2131968569), false);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        Parcelable parcelable = bundle2.getParcelable("SimilarAccountsFragment.ARGUMENT_HASHTAG");
        parcelable.getClass();
        this.A04 = (Hashtag) parcelable;
        Context requireContext2 = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        UserSession userSession = this.A00;
        this.A03 = new C63822v3(requireContext2, A00, this, userSession);
        String id = this.A04.getId();
        id.getClass();
        C11520jB c11520jB = new C11520jB();
        WE1.A03(c11520jB, this.A04);
        C19260xA A002 = c11520jB.A00();
        C14360o3.A0B(userSession, 2);
        this.A02 = new C31434Dre(this, userSession, id, "hashtag", "see_all_suggested_hashtag_fragment", AbstractC11490j8.A03(A002));
        UserSession userSession2 = this.A00;
        String name = this.A04.getName();
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession2);
        if (name == null) {
            encode = "";
        } else {
            encode = android.net.Uri.encode(name.trim());
        }
        AbstractC31173DnH.A1Q(A0N, "tags/%s/see_all_follow_chaining_recs/", new Object[]{encode});
        C1ON A0S = AbstractC31172DnG.A0S(A0N, C32161EBi.class, C34822FVy.class);
        A0S.A00 = EV0.A00(this, 24);
        AbstractC31177DnL.A19(this, A0S);
        C0f9.A09(-621226355, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1124031527);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_listview);
        C0f9.A09(1844682398, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(android.R.id.list);
        A0U(this.A01);
        this.A05.A01(new C35727Fq1(this.A01, this, this.A08, this.A02));
        findViewById.getClass();
        ((AbsListView) findViewById).setOnScrollListener(this.A07);
    }
}
