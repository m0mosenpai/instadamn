package X;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.user.model.User;

/* renamed from: X.NZj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52826NZj extends N7s implements C51D, InterfaceC71994XEi, GZD {
    public static final String __redex_internal_original_name = "IgLiveIgdsAddModeratorFragment";
    public final int A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03;
    public final String A04;

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void CuK(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void CvT(User user, String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void D1s(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DHz(String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DN5(User user, Integer num) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DOl() {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DTp(GZU gzu, User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void Df6(User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void Dxl(String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void E1r(C1P1 c1p1, AbstractC53633Nne abstractC53633Nne, User user, Integer num) {
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        C52883Nae c52883Nae = (C52883Nae) this.A03.getValue();
        AbstractC166997dE.A1Y(c52883Nae.A06, AbstractC167007dF.A1O(str.length()));
        PZ1.A01(c52883Nae, str, AbstractC141776au.A00(c52883Nae), 36);
    }

    @Override // X.N7s, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) this.A01.getValue();
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = this;
        }
        ((C52883Nae) this.A03.getValue()).A07();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
        ((C52883Nae) this.A03.getValue()).A07();
    }

    public C52826NZj() {
        String A0q = AbstractC31173DnH.A0q(this);
        C14360o3.A07(A0q);
        this.A04 = A0q;
        C57555PgT c57555PgT = new C57555PgT(this, 19);
        InterfaceC09390do A01 = C57555PgT.A01(new C57555PgT(this, 16), EnumC09460dv.A02, 17);
        this.A03 = AbstractC25225BEi.A0a(new C57555PgT(A01, 18), c57555PgT, C57530Pg4.A00(null, A01, 20), AbstractC25225BEi.A1D(C52883Nae.class));
        this.A00 = R.layout.iglive_cohost_invite_top;
        this.A01 = C57555PgT.A00(this, 15);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView.getChildCount() != 0 && recyclerView.computeVerticalScrollOffset() != 0) {
            return false;
        }
        return true;
    }
}
