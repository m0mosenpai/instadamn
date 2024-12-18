package X;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.NZh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52824NZh extends N7s implements C51D {
    public static final String __redex_internal_original_name = "IgLiveHostRequestsToJoinFragment";
    public final int A00;
    public final int A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03;
    public final String A04;

    @Override // X.N7s, X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C52884Naf) this.A03.getValue()).A07();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public C52824NZh() {
        String A0q = AbstractC31173DnH.A0q(this);
        C14360o3.A07(A0q);
        this.A04 = A0q;
        this.A01 = R.layout.iglive_cohost_request_top;
        this.A00 = R.layout.iglive_cohost_request_empty;
        C57542PgG c57542PgG = new C57542PgG(this, 21);
        InterfaceC09390do A01 = C57542PgG.A01(new C57542PgG(this, 18), EnumC09460dv.A02, 19);
        this.A03 = AbstractC25225BEi.A0a(new C57542PgG(A01, 20), c57542PgG, C57530Pg4.A00(null, A01, 3), AbstractC25225BEi.A1D(C52884Naf.class));
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView.getChildCount() != 0 && recyclerView.computeVerticalScrollOffset() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1938133868);
        super.onDestroy();
        ((C52884Naf) this.A03.getValue()).A08();
        C0f9.A09(200604443, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1706524933);
        super.onPause();
        ((C52884Naf) this.A03.getValue()).A08();
        C0f9.A09(-1112468269, A02);
    }
}
