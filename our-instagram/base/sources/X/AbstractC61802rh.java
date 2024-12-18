package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61802rh extends AbstractC61812ri {
    public RecyclerView A00;
    public Scroller A01;
    public final C1I4 mScrollListener = new C1I4() { // from class: X.2rj
        public boolean A00 = false;

        @Override // X.C1I4
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            int A03 = C0f9.A03(-930971533);
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.A00) {
                this.A00 = false;
                AbstractC61802rh.this.A06();
            }
            C0f9.A0A(-740887047, A03);
        }

        @Override // X.C1I4
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int A03 = C0f9.A03(-1275803871);
            if (i != 0 || i2 != 0) {
                this.A00 = true;
            }
            C0f9.A0A(1241226584, A03);
        }
    };

    public abstract int A02(AbstractC70663Fe abstractC70663Fe, int i, int i2);

    public abstract View A03(AbstractC70663Fe abstractC70663Fe);

    public int[] A09(View view, AbstractC70663Fe abstractC70663Fe) {
        C61792rg c61792rg = (C61792rg) this;
        int[] iArr = new int[2];
        if (abstractC70663Fe.A1X()) {
            AbstractC70763Fo abstractC70763Fo = c61792rg.A00;
            if (abstractC70763Fo == null || abstractC70763Fo.A02 != abstractC70663Fe) {
                abstractC70763Fo = new C70773Fp(abstractC70663Fe);
                c61792rg.A00 = abstractC70763Fo;
            }
            iArr[0] = (abstractC70763Fo.A0D(view) + (abstractC70763Fo.A0B(view) / 2)) - (abstractC70763Fo.A06() + (abstractC70763Fo.A07() / 2));
        } else {
            iArr[0] = 0;
        }
        if (abstractC70663Fe.A1Y()) {
            AbstractC70763Fo abstractC70763Fo2 = c61792rg.A01;
            if (abstractC70763Fo2 == null || abstractC70763Fo2.A02 != abstractC70663Fe) {
                abstractC70763Fo2 = new C3H6(abstractC70663Fe);
                c61792rg.A01 = abstractC70763Fo2;
            }
            iArr[1] = (abstractC70763Fo2.A0D(view) + (abstractC70763Fo2.A0B(view) / 2)) - (abstractC70763Fo2.A06() + (abstractC70763Fo2.A07() / 2));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Deprecated
    public C110814yt A04(AbstractC70663Fe abstractC70663Fe) {
        if (!(abstractC70663Fe instanceof InterfaceC70673Ff)) {
            return null;
        }
        return new C51105MiA(this.A00.getContext(), this);
    }

    public AbstractC110824yu A05(AbstractC70663Fe abstractC70663Fe) {
        if (this instanceof C61792rg) {
            C61792rg c61792rg = (C61792rg) this;
            if (!(abstractC70663Fe instanceof InterfaceC70673Ff)) {
                return null;
            }
            return new C51110MiF(((AbstractC61802rh) c61792rg).A00.getContext(), c61792rg);
        }
        return A04(abstractC70663Fe);
    }

    public final void A06() {
        AbstractC70663Fe abstractC70663Fe;
        View A03;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null && (A03 = A03(abstractC70663Fe)) != null) {
            int[] A09 = A09(A03, abstractC70663Fe);
            int i = A09[0];
            if (i != 0 || A09[1] != 0) {
                this.A00.A0t(i, A09[1]);
            }
        }
    }

    public void A07(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A15(this.mScrollListener);
                this.A00.A0E = null;
            }
            this.A00 = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.A0E == null) {
                    recyclerView.A14(this.mScrollListener);
                    RecyclerView recyclerView3 = this.A00;
                    recyclerView3.A0E = this;
                    this.A01 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                    A06();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
        }
    }

    public int[] A08(int i, int i2) {
        this.A01.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.A01.getFinalX(), this.A01.getFinalY()};
    }
}
