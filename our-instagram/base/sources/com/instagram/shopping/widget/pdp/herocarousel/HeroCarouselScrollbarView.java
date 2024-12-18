package com.instagram.shopping.widget.pdp.herocarousel;

import X.AbstractC167007dF;
import X.AbstractC70663Fe;
import X.C0f9;
import X.C14360o3;
import X.C38293Gsc;
import X.C38505GwQ;
import X.C39687HjJ;
import X.C42928Iyg;
import X.C55733Ooz;
import X.C55982hj;
import X.InterfaceC43389JFe;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class HeroCarouselScrollbarView extends View {
    public RecyclerView A00;
    public InterfaceC43389JFe A01;
    public boolean A02;
    public int A03;
    public final C55982hj A04;
    public final C38293Gsc A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeroCarouselScrollbarView(Context context) {
        this(context, null, 0, null);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A04.A09.A00 > 0.0d) {
            this.A05.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        C14360o3.A0B(drawable, 0);
        if (!super.verifyDrawable(drawable) && !C14360o3.A0K(this.A05, drawable)) {
            return false;
        }
        return true;
    }

    public static final void A00(RecyclerView recyclerView, HeroCarouselScrollbarView heroCarouselScrollbarView) {
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC70663Fe;
            C14360o3.A0A(linearLayoutManager);
            int A1d = linearLayoutManager.A1d();
            if (A1d == -1) {
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) recyclerView.A0D;
                C14360o3.A0A(linearLayoutManager2);
                A1d = linearLayoutManager2.A1a();
            }
            if (A1d == -1) {
                A1d = heroCarouselScrollbarView.A03;
            }
            heroCarouselScrollbarView.A03 = A1d;
            InterfaceC43389JFe interfaceC43389JFe = heroCarouselScrollbarView.A01;
            if (interfaceC43389JFe != null) {
                AbstractC70663Fe abstractC70663Fe2 = recyclerView.A0D;
                C14360o3.A0A(abstractC70663Fe2);
                int A0U = abstractC70663Fe2.A0U();
                C38505GwQ c38505GwQ = ((C42928Iyg) interfaceC43389JFe).A00;
                c38505GwQ.A01 = A1d;
                c38505GwQ.A00 = A0U;
                C39687HjJ c39687HjJ = c38505GwQ.A07;
                if (c38505GwQ.A03) {
                    A0U = c38505GwQ.A02;
                }
                C14360o3.A0B(c39687HjJ, 0);
                if (A0U > 1 && A1d >= 0 && A1d < A0U) {
                    c39687HjJ.A00.setVisibility(8);
                }
            }
        }
    }

    public static final void A01(HeroCarouselScrollbarView heroCarouselScrollbarView) {
        RecyclerView recyclerView = heroCarouselScrollbarView.A00;
        if (recyclerView != null) {
            int computeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
            if (computeHorizontalScrollExtent < computeHorizontalScrollRange) {
                int width = (heroCarouselScrollbarView.getWidth() * computeHorizontalScrollExtent) / computeHorizontalScrollRange;
                int width2 = ((heroCarouselScrollbarView.getWidth() - width) * computeHorizontalScrollOffset) / (computeHorizontalScrollRange - computeHorizontalScrollExtent);
                C38293Gsc c38293Gsc = heroCarouselScrollbarView.A05;
                if (c38293Gsc.A01 != width2 || c38293Gsc.A00 != width) {
                    c38293Gsc.A01 = width2;
                    c38293Gsc.A00 = width;
                    C38293Gsc.A00(c38293Gsc);
                }
                C55982hj c55982hj = heroCarouselScrollbarView.A04;
                float f = 0.0f;
                if (heroCarouselScrollbarView.A02) {
                    f = 1.0f;
                }
                c55982hj.A06(f);
                return;
            }
            C38293Gsc c38293Gsc2 = heroCarouselScrollbarView.A05;
            if (c38293Gsc2.A01 != 0 || c38293Gsc2.A00 != 0) {
                c38293Gsc2.A01 = 0;
                c38293Gsc2.A00 = 0;
                C38293Gsc.A00(c38293Gsc2);
            }
            C55982hj c55982hj2 = heroCarouselScrollbarView.A04;
            c55982hj2.A04();
            c55982hj2.A01();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-612923030);
        this.A05.setBounds(0, 0, i, i2);
        A01(this);
        C0f9.A0D(1751904989, A06);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeroCarouselScrollbarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroCarouselScrollbarView(Context context, AttributeSet attributeSet, int i, InterfaceC43389JFe interfaceC43389JFe) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        C38293Gsc c38293Gsc = new C38293Gsc(context);
        this.A05 = c38293Gsc;
        this.A02 = true;
        c38293Gsc.setCallback(this);
        this.A01 = interfaceC43389JFe;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A05(0.0d);
        A0R.A06 = true;
        A0R.A0A(new C55733Ooz(this, 3));
        this.A04 = A0R;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeroCarouselScrollbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ HeroCarouselScrollbarView(Context context, AttributeSet attributeSet, int i, InterfaceC43389JFe interfaceC43389JFe, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : interfaceC43389JFe);
    }
}
