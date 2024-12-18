package com.instagram.discovery.mediamap.fragment;

import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC43594JPz;
import X.AbstractC53242c7;
import X.AbstractC53971Nti;
import X.AbstractC56402iY;
import X.AbstractC60592pi;
import X.AbstractC67879V0k;
import X.C68978VfG;
import X.InterfaceC08430c6;
import X.InterfaceC57947Pmt;
import X.InterfaceC58175Pqf;
import X.InterfaceC71921XAf;
import X.U8M;
import X.WDY;
import X.XEB;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.R;
import com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes11.dex */
public class MapBottomSheetController extends AbstractC60592pi implements InterfaceC58175Pqf, InterfaceC57947Pmt {
    public int A00;
    public Guideline A01;
    public float A02;
    public final float A03;
    public final Activity A04;
    public final Set A05 = Collections.newSetFromMap(new WeakHashMap());
    public final int A06;
    public final WDY A07;
    public View mBottomSheet;
    public MapBottomSheetBehavior mBottomSheetBehavior;
    public View mContainer;

    @Override // X.InterfaceC58175Pqf
    public final void Dip(MapBottomSheetBehavior mapBottomSheetBehavior, float f, float f2, float f3) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((XEB) it.next()).D0A(this, f, (float) this.mBottomSheetBehavior.A0F.A01, f2, f3);
        }
    }

    public final float A00() {
        float height = this.mContainer.getHeight() - this.A00;
        return (height - this.A03) / height;
    }

    public final float A01() {
        if (this.mContainer != null && this.mBottomSheet != null) {
            AbstractC67879V0k A02 = this.A07.A02();
            int i = this.A06;
            if (A02 instanceof LocationDetailFragment) {
                LocationDetailFragment locationDetailFragment = (LocationDetailFragment) A02;
                C68978VfG c68978VfG = locationDetailFragment.mLocationDetailRedesignExperimentHelper;
                if (c68978VfG == null) {
                    i = 0;
                } else {
                    int height = c68978VfG.A01.getHeight();
                    Resources A0N = AbstractC166997dE.A0N(locationDetailFragment);
                    i = height + A0N.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) + A0N.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                }
            }
            return (this.A00 + i) / this.mContainer.getHeight();
        }
        return 0.0f;
    }

    public final float A02() {
        InterfaceC08430c6 A02 = this.A07.A02();
        if (A02 instanceof InterfaceC71921XAf) {
            return ((InterfaceC71921XAf) A02).Bc9();
        }
        return 0.0f;
    }

    public final boolean A03() {
        return AbstractC167007dF.A1N((((float) this.mBottomSheetBehavior.A0F.A01) > A00() ? 1 : (((float) this.mBottomSheetBehavior.A0F.A01) == A00() ? 0 : -1)));
    }

    @Override // X.InterfaceC58175Pqf
    public final void CzJ() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((XEB) it.next()).D05(this);
        }
    }

    @Override // X.InterfaceC58175Pqf
    public final void D06() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((XEB) it.next()).D07(this);
        }
    }

    @Override // X.InterfaceC58175Pqf
    public final void DDg() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // X.InterfaceC58175Pqf
    public final void Diw(MapBottomSheetBehavior mapBottomSheetBehavior, float f) {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((XEB) it.next()).D0B(this, f);
        }
    }

    @Override // X.InterfaceC58175Pqf
    public final void Dl6() {
        Iterator it = this.A05.iterator();
        while (it.hasNext()) {
            ((XEB) it.next()).D0C(this);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        Activity activity = this.A04;
        Resources resources = activity.getResources();
        this.mContainer = view;
        View requireViewById = view.requireViewById(R.id.bottom_sheet);
        this.mBottomSheet = requireViewById;
        this.mBottomSheetBehavior = AbstractC53971Nti.A00(requireViewById);
        this.A01 = (Guideline) this.mContainer.requireViewById(R.id.status_bar_adjustment_guideline);
        MapBottomSheetBehavior mapBottomSheetBehavior = this.mBottomSheetBehavior;
        mapBottomSheetBehavior.A03 = this;
        mapBottomSheetBehavior.A02 = this;
        ImageView imageView = (ImageView) this.mBottomSheet.requireViewById(R.id.shadow);
        int A0G = AbstractC53242c7.A0G(activity, R.attr.bottomSheetTopCornerRadius);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        float[] fArr = new float[8];
        float f = A0G;
        fArr[0] = f;
        AbstractC43594JPz.A1U(fArr, f, 1);
        AbstractC167017dG.A1X(fArr, 0.0f);
        imageView.setImageDrawable(new U8M(new RoundRectShape(fArr, null, null), dimensionPixelSize, Color.argb(Math.round(63.75f), 0, 0, 0), dimensionPixelSize));
        int A01 = AbstractC56402iY.A01(activity) - dimensionPixelSize;
        this.A00 = A01;
        this.A01.setGuidelineBegin(A01);
    }

    public MapBottomSheetController(Activity activity, WDY wdy) {
        this.A04 = activity;
        this.A07 = wdy;
        this.A02 = AbstractC13880nE.A04(activity, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
        Resources resources = activity.getResources();
        this.A06 = AbstractC53242c7.A0G(activity, R.attr.actionBarHeight) + resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) + resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A03 = AbstractC13880nE.A04(activity, 140);
    }

    @Override // X.InterfaceC57947Pmt
    public final float APE(float f, float f2, float f3) {
        float A02 = A02();
        if (f3 > 0.0f) {
            if ((f != A00() && (f <= A00() || f3 >= this.A02)) || f2 <= A02) {
                return A01();
            }
        } else {
            if (f3 < 0.0f && (f2 > 0.5d || Math.abs(f3) >= this.A02)) {
                return 1.0f;
            }
            if (f3 >= 0.0f) {
                if (f2 > A02) {
                    return 1.0f;
                }
                return A02;
            }
        }
        return A02();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        MapBottomSheetControllerLifecycleUtil.cleanupReferences(this);
    }
}
