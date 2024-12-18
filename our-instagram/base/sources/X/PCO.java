package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.coordinatorlayoutbehavior.BottomSheetScaleBehavior;

/* loaded from: classes9.dex */
public final class PCO implements InterfaceC57985PnV {
    public int A00;
    public C54468O4w A01;
    public final int A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final BottomSheetBehavior A07;
    public final InterfaceC09390do A09;
    public final UserSession A0B;
    public final InterfaceC09390do A0A = C57516Pfq.A00(this, 22);
    public final InterfaceC09390do A08 = C57516Pfq.A00(this, 20);

    public PCO(View view, UserSession userSession) {
        this.A05 = view;
        this.A0B = userSession;
        View findViewById = view.findViewById(R.id.call_participant_grid_container);
        this.A06 = findViewById;
        this.A09 = C57516Pfq.A00(this, 21);
        Context A0L = AbstractC166997dE.A0L(view);
        double A09 = AbstractC13880nE.A09(A0L);
        double d = 0.8d * A09;
        this.A02 = (int) (A09 - d);
        View findViewById2 = view.findViewById(R.id.call_bottom_sheet);
        this.A03 = findViewById2;
        findViewById2.setVisibility(0);
        BottomSheetBehavior A01 = BottomSheetBehavior.A01(findViewById2);
        this.A07 = A01;
        A01.A0P = true;
        AbstractC13880nE.A0W(findViewById2, (int) d);
        View findViewById3 = findViewById2.findViewById(R.id.bottom_sheet_drag_handle);
        this.A04 = findViewById3;
        findViewById3.setBackgroundResource(R.drawable.igds_bottom_sheet_background);
        MSX.A12(findViewById3, 4);
        AbstractC166997dE.A18(A0L, findViewById3, 2131954107);
        if (findViewById != null) {
            this.A00 = A0L.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof C56292iI) {
                CoordinatorLayout.Behavior behavior = ((C56292iI) layoutParams).A0A;
                if (behavior instanceof BottomSheetScaleBehavior) {
                    ((BottomSheetScaleBehavior) behavior).A00 = this.A00;
                } else {
                    throw AbstractC166987dD.A12("The view is not associated with BottomSheetScaleBehavior");
                }
            } else {
                throw AbstractC166987dD.A12("The view is not a child of CoordinatorLayout");
            }
        }
        A01.A0a(new N24(this));
    }

    private final void A00(float f) {
        View findViewById = this.A05.findViewById(R.id.bottom_sheet_container);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            AbstractC166987dD.A0d(this.A0A).animate().translationY(f).setDuration(150L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        }
    }

    public final void A01(boolean z) {
        C02I c02i;
        int A08;
        int i;
        View view = this.A05;
        Context A0L = AbstractC166997dE.A0L(view);
        float A09 = AbstractC13880nE.A09(A0L);
        float A06 = AbstractC13880nE.A06(A0L);
        double d = (A09 / A06) * 0.8d;
        C011504d A00 = AbstractC009003e.A00(view);
        if (A00 != null) {
            c02i = A00.A00.A03();
            A08 = c02i.A00;
        } else {
            c02i = null;
            A08 = AbstractC13880nE.A08(A0L);
        }
        if (z) {
            if (c02i != null) {
                i = c02i.A03;
            } else {
                i = 0;
            }
        } else {
            i = (int) ((1.0d - d) * A06);
        }
        View findViewById = view.findViewById(R.id.bottom_sheet_container);
        if (findViewById != null) {
            if (findViewById.getPaddingBottom() != A08) {
                AbstractC13880nE.A0Y(findViewById, A08);
            }
            if (AbstractC13880nE.A0D(findViewById) != i) {
                AbstractC13880nE.A0f(findViewById, i);
            }
        }
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51898Mwg c51898Mwg = (C51898Mwg) interfaceC57856PlM;
        C14360o3.A0B(c51898Mwg, 0);
        BottomSheetBehavior bottomSheetBehavior = this.A07;
        int i = 4;
        if (c51898Mwg.A01) {
            i = 3;
        }
        bottomSheetBehavior.A0W(i);
        float f = c51898Mwg.A00;
        if (f == 0.0f) {
            this.A03.setTranslationY(0.0f);
            A00(0.0f);
        } else {
            this.A03.animate().translationY(f).setDuration(150L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            A00(f);
        }
    }
}
