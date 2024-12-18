package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OeA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55200OeA {
    public static final void A02(View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        AbstractC43594JPz.A0H(view).setDuration(100L).setListener(null);
    }

    public static final void A05(RecyclerView recyclerView, CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager, C8Ba c8Ba, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        C211029Uz c211029Uz;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = null;
        if (recyclerView == null) {
            AbstractC12120kG.A07("ClipsTimelineEditorAnimationUtil", "thumbnail recycler view is null", null);
            return;
        }
        Context context = recyclerView.getContext();
        int A05 = (AbstractC167007dF.A0K(context).widthPixels - c8Ba.A02) - (AbstractC167017dG.A05(context) * 2);
        C3OO A0V = recyclerView.A0V(i);
        if ((A0V instanceof C211029Uz) && (c211029Uz = (C211029Uz) A0V) != null) {
            c211029Uz.A00();
            InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) c211029Uz.A09.getValue();
            if (interfaceC56392iX != null) {
                touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) interfaceC56392iX.getView();
            }
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.addUpdateListener(new C55238OfA(recyclerView, recyclerView, customScrollingLinearLayoutManager, touchInterceptorFrameLayout, A05, i));
        ofFloat.addListener(new ANB(6, ofFloat, interfaceC16820sZ));
        ofFloat.start();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0pQ, java.lang.Object] */
    public static final void A06(RecyclerView recyclerView, C8Ba c8Ba, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3, int i4, boolean z) {
        C211029Uz c211029Uz;
        int A06 = (i2 - (c8Ba.A02 * 2)) - (AbstractC167017dG.A06(recyclerView.getContext()) * 2);
        C3OO A0V = recyclerView.A0V(i);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = null;
        if (A0V instanceof C211029Uz) {
            c211029Uz = (C211029Uz) A0V;
            if (c211029Uz != null) {
                c211029Uz.A00();
                InterfaceC56392iX interfaceC56392iX = (InterfaceC56392iX) c211029Uz.A09.getValue();
                if (interfaceC56392iX != null) {
                    touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) interfaceC56392iX.getView();
                }
            }
        } else {
            c211029Uz = null;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        if (z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        ?? obj = new Object();
        int height = recyclerView.getHeight();
        AbstractC13880nE.A0W(recyclerView, i4);
        if (c211029Uz != null) {
            int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            View A0d = AbstractC166987dD.A0d(c211029Uz.A0B);
            if (A0d != null) {
                A0d.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.addUpdateListener(new C55240OfC(recyclerView, touchInterceptorFrameLayout, c211029Uz, interfaceC16660sJ, obj, A06, height, i4, i3, z));
        ofFloat.addListener(new ANB(4, ofFloat, interfaceC16820sZ));
        ofFloat.start();
    }

    public static final ValueAnimator A00(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, float f, int i, int i2) {
        OKm oKm = new OKm(i);
        OKm oKm2 = new OKm(i2);
        OKm oKm3 = new OKm(f);
        OKm oKm4 = new OKm(f);
        C15370ps A1F = AbstractC25225BEi.A1F();
        A1F.A00 = interfaceC16820sZ2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C55239OfB(oKm, oKm2, oKm3, oKm4, new PIA(oKm), interfaceC16820sZ, interfaceC16820sZ3, A1F));
        ofFloat.addListener(new C55231Of3(ofFloat, 1));
        return ofFloat;
    }

    public static final void A04(RecyclerView recyclerView, CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager, C8Ba c8Ba, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        C57213Pax c57213Pax;
        float f;
        InterfaceC16820sZ c57263Pbl;
        InterfaceC16820sZ interfaceC16820sZ2;
        ValueAnimator A00;
        if (recyclerView == null) {
            AbstractC12120kG.A07("ClipsTimelineEditorAnimationUtil", "thumbnail recycler view is null", null);
            return;
        }
        int i3 = c8Ba.A02;
        Context A0L = AbstractC166997dE.A0L(recyclerView);
        int i4 = AbstractC167007dF.A0K(A0L).widthPixels - i3;
        int A05 = i4 - (AbstractC167017dG.A05(A0L) * 2);
        AnimatorSet animatorSet = new AnimatorSet();
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            i2 = c2uu.getItemCount();
        } else {
            i2 = 0;
        }
        C17u A0C = C17s.A0C(0, i2);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0C.iterator();
        while (it.hasNext()) {
            int A002 = ((AbstractC16880sg) it).A00();
            if (A002 == i) {
                A00 = A00(new C57213Pax(recyclerView, A002, 0), new C57249PbX(A002, 19, recyclerView), new MHX(i, 11, c8Ba, recyclerView, customScrollingLinearLayoutManager), 1.0f, i4, A05);
            } else {
                if (A002 != i - 2 && A002 != i + 2) {
                    c57213Pax = new C57213Pax(recyclerView, A002, 2);
                    f = 1.0f;
                    c57263Pbl = new C57249PbX(A002, 20, recyclerView);
                    interfaceC16820sZ2 = C57343Pd3.A00;
                } else {
                    c57213Pax = new C57213Pax(recyclerView, A002, 1);
                    f = 0.6f;
                    c57263Pbl = new C57263Pbl(recyclerView, i, c8Ba, A002, 4);
                    interfaceC16820sZ2 = C57342Pd2.A00;
                }
                A00 = A00(c57213Pax, c57263Pbl, interfaceC16820sZ2, f, i3, i3);
            }
            A1E.add(A00);
        }
        animatorSet.playTogether(A1E);
        animatorSet.addListener(new ANB(3, animatorSet, interfaceC16820sZ));
        animatorSet.start();
    }

    public static final FilmstripTimelineView A01(RecyclerView recyclerView, int i) {
        C51369MmU c51369MmU;
        C3OO A0V = recyclerView.A0V(i);
        if ((A0V instanceof C51369MmU) && (c51369MmU = (C51369MmU) A0V) != null) {
            return c51369MmU.A09;
        }
        return null;
    }

    public static final void A03(View view, int i) {
        AbstractC43594JPz.A0G(view).setDuration(100L).setListener(new C66298U7w(view, i, 2));
    }
}
