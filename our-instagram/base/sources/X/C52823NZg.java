package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.NZg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52823NZg extends N7s implements C51D {
    public static final String __redex_internal_original_name = "IgLiveIgdsHeaderAvatarGridFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01;
    public final String A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public C52823NZg() {
        String A0q = AbstractC31173DnH.A0q(this);
        C14360o3.A07(A0q);
        this.A02 = A0q;
        C57540PgE c57540PgE = new C57540PgE(this, 14);
        InterfaceC09390do A01 = C57540PgE.A01(new C57540PgE(this, 11), EnumC09460dv.A02, 12);
        this.A01 = AbstractC25225BEi.A0a(new C57540PgE(A01, 13), c57540PgE, C57532Pg6.A00(null, A01, 39), AbstractC25225BEi.A1D(C52881Nac.class));
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
