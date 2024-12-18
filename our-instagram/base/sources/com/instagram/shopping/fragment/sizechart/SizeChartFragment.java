package com.instagram.shopping.fragment.sizechart;

import X.AbstractC111324zv;
import X.AbstractC13880nE;
import X.AbstractC153636vY;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC18680vv;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC53242c7;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C41L;
import X.C51D;
import X.C69157Vim;
import X.EnumC27385C6o;
import X.InterfaceC09390do;
import X.InterfaceC56392iX;
import X.UGX;
import X.UH5;
import X.UKG;
import X.VgF;
import X.W3D;
import X.WNS;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.model.shopping.sizechart.SizeChart;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class SizeChartFragment extends AbstractC59962oe implements C51D {
    public VgF A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public RecyclerView mRowHeadersColumn;
    public View mTopLeftFixedSpace;
    public ViewPager mViewPager;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_sizing_chart";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((ConstraintLayout) view).setMaxHeight((int) (AbstractC13880nE.A09(requireContext()) * 0.5f));
        View requireViewById = view.requireViewById(R.id.top_left_fixed_space);
        this.mTopLeftFixedSpace = requireViewById;
        C14360o3.A07(requireViewById);
        this.mRowHeadersColumn = (RecyclerView) view.requireViewById(R.id.row_headers_column);
        this.mViewPager = (ViewPager) view.requireViewById(R.id.size_chart_pager);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            W3D w3d = new W3D(requireContext(), (SizeChart) AbstractC153636vY.A00(bundle2, SizeChart.class, AbstractC111324zv.A00(3112)));
            List unmodifiableList = Collections.unmodifiableList(w3d.A03);
            C14360o3.A07(unmodifiableList);
            ViewPager viewPager = this.mViewPager;
            C14360o3.A0A(viewPager);
            viewPager.setOffscreenPageLimit(unmodifiableList.size() - 1);
            ViewPager viewPager2 = this.mViewPager;
            C14360o3.A0A(viewPager2);
            VgF vgF = this.A00;
            if (vgF != null) {
                viewPager2.setAdapter(new UKG(vgF, unmodifiableList));
                int size = unmodifiableList.size();
                AbstractC167007dF.A0N(view, R.id.bottom_sheet_title).setText(2131974114);
                ImageView A0D = AbstractC31176DnK.A0D(view, R.id.bottom_sheet_back_button);
                A0D.setImageResource(R.drawable.instagram_arrow_back_24);
                A0D.setContentDescription(getString(2131953583));
                A0D.setBackgroundResource(AbstractC53242c7.A0H(requireContext(), android.R.attr.selectableItemBackground));
                WNS.A00(A0D, 5, this);
                C41L c41l = (C41L) AbstractC166997dE.A0R(view, R.id.bottom_sheet_page_indicator);
                int i = 8;
                if (size > 1) {
                    i = 0;
                }
                c41l.setVisibility(i);
                if (size > 1) {
                    c41l.A01(0, size);
                    ViewPager viewPager3 = this.mViewPager;
                    C14360o3.A0A(viewPager3);
                    viewPager3.A0J(c41l);
                }
                RecyclerView recyclerView = this.mRowHeadersColumn;
                C14360o3.A0A(recyclerView);
                AbstractC31174DnI.A16(requireContext(), recyclerView, 1, false);
                RecyclerView recyclerView2 = this.mRowHeadersColumn;
                C14360o3.A0A(recyclerView2);
                C69157Vim c69157Vim = w3d.A01;
                recyclerView2.A10(new UH5(recyclerView2.getContext(), 1));
                recyclerView2.setAdapter(new UGX(c69157Vim, 1));
                VgF vgF2 = this.A00;
                if (vgF2 != null) {
                    RecyclerView recyclerView3 = this.mRowHeadersColumn;
                    C14360o3.A0A(recyclerView3);
                    vgF2.A01.add(recyclerView3);
                    recyclerView3.A14(vgF2.A00);
                    AbstractC13880nE.A0W(requireViewById, w3d.A02.A00);
                    return;
                }
            }
            C14360o3.A0F("verticalScrollSynchronizer");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A01.getValue();
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        VgF vgF = this.A00;
        if (vgF == null) {
            C14360o3.A0F("verticalScrollSynchronizer");
            throw C00O.createAndThrow();
        }
        Iterator it = vgF.A01.iterator();
        while (it.hasNext()) {
            if (((View) it.next()).canScrollVertically(-1)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1782694416);
        super.onCreate(bundle);
        this.A00 = new VgF();
        C0f9.A09(-482210495, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-329432954);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.size_chart, viewGroup, false);
        C0f9.A09(-1037321656, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1750033376);
        super.onDestroyView();
        VgF vgF = this.A00;
        if (vgF == null) {
            C14360o3.A0F("verticalScrollSynchronizer");
            throw C00O.createAndThrow();
        }
        RecyclerView recyclerView = this.mRowHeadersColumn;
        C14360o3.A0A(recyclerView);
        vgF.A01.remove(recyclerView);
        recyclerView.A15(vgF.A00);
        SizeChartFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(212260780, A02);
    }
}
