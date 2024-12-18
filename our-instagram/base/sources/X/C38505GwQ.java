package X;

import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.shopping.widget.pdp.herocarousel.HeroCarouselScrollbarView;

/* renamed from: X.GwQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38505GwQ extends C3OO {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final View A04;
    public final RecyclerView A05;
    public final IJ4 A06;
    public final C39687HjJ A07;
    public final HeroCarouselScrollbarView A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.HjJ] */
    public C38505GwQ(View view, boolean z) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = view;
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.container);
        this.A05 = recyclerView;
        ViewStub viewStub = (ViewStub) AbstractC166987dD.A0c(view, R.id.hero_carousel_index_indicator_stub);
        C14360o3.A0B(viewStub, 1);
        ?? obj = new Object();
        obj.A00 = viewStub;
        this.A07 = obj;
        AbstractC37304Gc5.A0z(recyclerView, 0, AbstractC166997dE.A08(view.getResources()));
        recyclerView.setItemAnimator(null);
        HeroCarouselScrollbarView heroCarouselScrollbarView = (HeroCarouselScrollbarView) view.requireViewById(R.id.scrollbar);
        this.A08 = heroCarouselScrollbarView;
        this.A06 = new IJ4(view);
        heroCarouselScrollbarView.A02 = z;
        heroCarouselScrollbarView.A01 = new C42928Iyg(this);
    }
}
