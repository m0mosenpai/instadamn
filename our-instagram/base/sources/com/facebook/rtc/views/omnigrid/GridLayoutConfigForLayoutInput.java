package com.facebook.rtc.views.omnigrid;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.C0T6;
import X.C14360o3;
import X.C3OO;
import com.facebook.common.dextricks.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class GridLayoutConfigForLayoutInput extends C0T6 {
    public final boolean appliesPaddingToFullscreenLayout;
    public final boolean aspectFillFullscreenSingleItem;
    public final int bottomInset;
    public final int bottomPadding;
    public final boolean disablesFloatingSelfView;
    public final boolean forcesHorizontalLayoutForTwoPersonLayout;
    public final int horizontalSpacing;
    public final int itemHeightOffset;
    public final Object layoutExtras;
    public final int leftPadding;
    public final int rightPadding;
    public final GridSelfViewLocation selfViewLocation;
    public final boolean skipsDefaultGridLayout;
    public final int topPadding;
    public final int verticalSpacing;

    public static /* synthetic */ GridLayoutConfigForLayoutInput copy$default(GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridSelfViewLocation gridSelfViewLocation, Object obj, int i9, Object obj2) {
        int i10 = i4;
        int i11 = i3;
        int i12 = i6;
        int i13 = i5;
        int i14 = i8;
        int i15 = i7;
        boolean z6 = z2;
        boolean z7 = z;
        boolean z8 = z4;
        boolean z9 = z3;
        GridSelfViewLocation gridSelfViewLocation2 = gridSelfViewLocation;
        boolean z10 = z5;
        Object obj3 = obj;
        if ((i9 & 1) != 0) {
            i = gridLayoutConfigForLayoutInput.leftPadding;
        }
        if ((i9 & 2) != 0) {
            i2 = gridLayoutConfigForLayoutInput.rightPadding;
        }
        if ((i9 & 4) != 0) {
            i11 = gridLayoutConfigForLayoutInput.topPadding;
        }
        if ((i9 & 8) != 0) {
            i10 = gridLayoutConfigForLayoutInput.bottomPadding;
        }
        if ((i9 & 16) != 0) {
            i13 = gridLayoutConfigForLayoutInput.horizontalSpacing;
        }
        if ((i9 & 32) != 0) {
            i12 = gridLayoutConfigForLayoutInput.verticalSpacing;
        }
        if ((i9 & 64) != 0) {
            i15 = gridLayoutConfigForLayoutInput.bottomInset;
        }
        if ((i9 & 128) != 0) {
            i14 = gridLayoutConfigForLayoutInput.itemHeightOffset;
        }
        if ((i9 & 256) != 0) {
            z7 = gridLayoutConfigForLayoutInput.disablesFloatingSelfView;
        }
        if ((i9 & 512) != 0) {
            z6 = gridLayoutConfigForLayoutInput.skipsDefaultGridLayout;
        }
        if ((i9 & 1024) != 0) {
            z9 = gridLayoutConfigForLayoutInput.forcesHorizontalLayoutForTwoPersonLayout;
        }
        if ((i9 & C3OO.FLAG_MOVED) != 0) {
            z8 = gridLayoutConfigForLayoutInput.appliesPaddingToFullscreenLayout;
        }
        if ((i9 & 4096) != 0) {
            z10 = gridLayoutConfigForLayoutInput.aspectFillFullscreenSingleItem;
        }
        if ((i9 & 8192) != 0) {
            gridSelfViewLocation2 = gridLayoutConfigForLayoutInput.selfViewLocation;
        }
        if ((i9 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            obj3 = gridLayoutConfigForLayoutInput.layoutExtras;
        }
        return gridLayoutConfigForLayoutInput.copy(i, i2, i11, i10, i13, i12, i15, i14, z7, z6, z9, z8, z10, gridSelfViewLocation2, obj3);
    }

    public final int component1() {
        return this.leftPadding;
    }

    public final boolean component10() {
        return this.skipsDefaultGridLayout;
    }

    public final boolean component11() {
        return this.forcesHorizontalLayoutForTwoPersonLayout;
    }

    public final boolean component12() {
        return this.appliesPaddingToFullscreenLayout;
    }

    public final boolean component13() {
        return this.aspectFillFullscreenSingleItem;
    }

    public final GridSelfViewLocation component14() {
        return this.selfViewLocation;
    }

    public final Object component15() {
        return this.layoutExtras;
    }

    public final int component2() {
        return this.rightPadding;
    }

    public final int component3() {
        return this.topPadding;
    }

    public final int component4() {
        return this.bottomPadding;
    }

    public final int component5() {
        return this.horizontalSpacing;
    }

    public final int component6() {
        return this.verticalSpacing;
    }

    public final int component7() {
        return this.bottomInset;
    }

    public final int component8() {
        return this.itemHeightOffset;
    }

    public final boolean component9() {
        return this.disablesFloatingSelfView;
    }

    public final GridLayoutConfigForLayoutInput copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridSelfViewLocation gridSelfViewLocation, Object obj) {
        C14360o3.A0B(gridSelfViewLocation, 13);
        return new GridLayoutConfigForLayoutInput(i, i2, i3, i4, i5, i6, i7, i8, z, z2, z3, z4, z5, gridSelfViewLocation, obj);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GridLayoutConfigForLayoutInput) {
                GridLayoutConfigForLayoutInput gridLayoutConfigForLayoutInput = (GridLayoutConfigForLayoutInput) obj;
                if (this.leftPadding != gridLayoutConfigForLayoutInput.leftPadding || this.rightPadding != gridLayoutConfigForLayoutInput.rightPadding || this.topPadding != gridLayoutConfigForLayoutInput.topPadding || this.bottomPadding != gridLayoutConfigForLayoutInput.bottomPadding || this.horizontalSpacing != gridLayoutConfigForLayoutInput.horizontalSpacing || this.verticalSpacing != gridLayoutConfigForLayoutInput.verticalSpacing || this.bottomInset != gridLayoutConfigForLayoutInput.bottomInset || this.itemHeightOffset != gridLayoutConfigForLayoutInput.itemHeightOffset || this.disablesFloatingSelfView != gridLayoutConfigForLayoutInput.disablesFloatingSelfView || this.skipsDefaultGridLayout != gridLayoutConfigForLayoutInput.skipsDefaultGridLayout || this.forcesHorizontalLayoutForTwoPersonLayout != gridLayoutConfigForLayoutInput.forcesHorizontalLayoutForTwoPersonLayout || this.appliesPaddingToFullscreenLayout != gridLayoutConfigForLayoutInput.appliesPaddingToFullscreenLayout || this.aspectFillFullscreenSingleItem != gridLayoutConfigForLayoutInput.aspectFillFullscreenSingleItem || this.selfViewLocation != gridLayoutConfigForLayoutInput.selfViewLocation || !C14360o3.A0K(this.layoutExtras, gridLayoutConfigForLayoutInput.layoutExtras)) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public GridLayoutConfigForLayoutInput(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridSelfViewLocation gridSelfViewLocation, Object obj) {
        C14360o3.A0B(gridSelfViewLocation, 14);
        this.leftPadding = i;
        this.rightPadding = i2;
        this.topPadding = i3;
        this.bottomPadding = i4;
        this.horizontalSpacing = i5;
        this.verticalSpacing = i6;
        this.bottomInset = i7;
        this.itemHeightOffset = i8;
        this.disablesFloatingSelfView = z;
        this.skipsDefaultGridLayout = z2;
        this.forcesHorizontalLayoutForTwoPersonLayout = z3;
        this.appliesPaddingToFullscreenLayout = z4;
        this.aspectFillFullscreenSingleItem = z5;
        this.selfViewLocation = gridSelfViewLocation;
        this.layoutExtras = obj;
    }

    public final boolean getAppliesPaddingToFullscreenLayout() {
        return this.appliesPaddingToFullscreenLayout;
    }

    public final boolean getAspectFillFullscreenSingleItem() {
        return this.aspectFillFullscreenSingleItem;
    }

    public final int getBottomInset() {
        return this.bottomInset;
    }

    public final int getBottomPadding() {
        return this.bottomPadding;
    }

    public final boolean getDisablesFloatingSelfView() {
        return this.disablesFloatingSelfView;
    }

    public final boolean getForcesHorizontalLayoutForTwoPersonLayout() {
        return this.forcesHorizontalLayoutForTwoPersonLayout;
    }

    public final int getHorizontalSpacing() {
        return this.horizontalSpacing;
    }

    public final int getItemHeightOffset() {
        return this.itemHeightOffset;
    }

    public final Object getLayoutExtras() {
        return this.layoutExtras;
    }

    public final int getLeftPadding() {
        return this.leftPadding;
    }

    public final int getRightPadding() {
        return this.rightPadding;
    }

    public final GridSelfViewLocation getSelfViewLocation() {
        return this.selfViewLocation;
    }

    public final boolean getSkipsDefaultGridLayout() {
        return this.skipsDefaultGridLayout;
    }

    public final int getTopPadding() {
        return this.topPadding;
    }

    public final int getVerticalSpacing() {
        return this.verticalSpacing;
    }

    public int hashCode() {
        return AbstractC166997dE.A0J(this.selfViewLocation, AbstractC167007dF.A0D(this.aspectFillFullscreenSingleItem, AbstractC167007dF.A0D(this.appliesPaddingToFullscreenLayout, AbstractC167007dF.A0D(this.forcesHorizontalLayoutForTwoPersonLayout, AbstractC167007dF.A0D(this.skipsDefaultGridLayout, AbstractC167007dF.A0D(this.disablesFloatingSelfView, ((((((((((((((this.leftPadding * 31) + this.rightPadding) * 31) + this.topPadding) * 31) + this.bottomPadding) * 31) + this.horizontalSpacing) * 31) + this.verticalSpacing) * 31) + this.bottomInset) * 31) + this.itemHeightOffset) * 31)))))) + AbstractC167017dG.A0M(this.layoutExtras);
    }

    public /* synthetic */ GridLayoutConfigForLayoutInput(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GridSelfViewLocation gridSelfViewLocation, Object obj, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i2, (i9 & 4) != 0 ? 0 : i3, (i9 & 8) != 0 ? 0 : i4, (i9 & 16) != 0 ? 0 : i5, (i9 & 32) != 0 ? 0 : i6, (i9 & 64) != 0 ? 0 : i7, (i9 & 128) != 0 ? 0 : i8, AbstractC25226BEj.A1U(i9 & 256, z), AbstractC25226BEj.A1U(i9 & 512, z2), AbstractC25226BEj.A1U(i9 & 1024, z3), AbstractC25226BEj.A1U(i9 & C3OO.FLAG_MOVED, z4), (i9 & 4096) == 0 ? z5 : false, (i9 & 8192) != 0 ? GridSelfViewLocation.TOP_RIGHT : gridSelfViewLocation, (i9 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0 ? null : obj);
    }

    public GridLayoutConfigForLayoutInput() {
        this(0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, false, GridSelfViewLocation.TOP_RIGHT, null);
    }
}
