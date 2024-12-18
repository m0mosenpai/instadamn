package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tv9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65848Tv9 extends C61792rg {
    public final float A00;
    public final int A01;
    public final RecyclerView A02;
    public final ViewPager2 A03;

    @Override // X.C61792rg, X.AbstractC61802rh
    public final View A03(AbstractC70663Fe abstractC70663Fe) {
        C14360o3.A0B(abstractC70663Fe, 0);
        if (this.A03.A06.A06.A07) {
            return null;
        }
        return super.A03(abstractC70663Fe);
    }

    @Override // X.AbstractC61802rh
    public final AbstractC110824yu A05(AbstractC70663Fe abstractC70663Fe) {
        C14360o3.A0B(abstractC70663Fe, 0);
        if (abstractC70663Fe instanceof InterfaceC70673Ff) {
            return new C65883Tvn(this.A02.getContext(), this, 3);
        }
        return null;
    }

    public C65848Tv9(RecyclerView recyclerView, ViewPager2 viewPager2, float f, int i) {
        this.A03 = viewPager2;
        this.A02 = recyclerView;
        this.A00 = f;
        this.A01 = i;
    }
}
