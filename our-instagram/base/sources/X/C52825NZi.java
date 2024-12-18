package X;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.NZi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52825NZi extends N7s implements C51D, GZD {
    public static final String __redex_internal_original_name = "IgLiveHostInviteFragment";
    public final int A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03;
    public final String A04;

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        ((C52882Nad) this.A03.getValue()).A07(str);
    }

    @Override // X.N7s, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) this.A01.getValue();
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = this;
        }
        ((C52882Nad) this.A03.getValue()).A07("");
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
        ((C52882Nad) this.A03.getValue()).A07("");
    }

    public C52825NZi() {
        String A0q = AbstractC31173DnH.A0q(this);
        C14360o3.A07(A0q);
        this.A04 = A0q;
        C57542PgG c57542PgG = new C57542PgG(this, 5);
        InterfaceC09390do A01 = C57542PgG.A01(new C57542PgG(this, 2), EnumC09460dv.A02, 3);
        this.A03 = AbstractC25225BEi.A0a(new C57542PgG(A01, 4), c57542PgG, C57532Pg6.A00(null, A01, 48), AbstractC25225BEi.A1D(C52882Nad.class));
        this.A00 = R.layout.iglive_cohost_invite_top;
        this.A01 = C57542PgG.A00(this, 1);
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
