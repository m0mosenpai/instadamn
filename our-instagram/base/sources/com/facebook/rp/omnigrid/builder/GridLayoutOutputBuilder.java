package com.facebook.rp.omnigrid.builder;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25230BEn;
import X.AbstractC54331Nzp;
import X.AbstractC54332Nzq;
import X.AbstractC54333Nzr;
import X.AnonymousClass001;
import X.C05F;
import X.C0K8;
import X.C51614Mr7;
import X.C51727Mt4;
import X.OR3;
import X.UQ7;
import android.graphics.Rect;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;
import com.facebook.rtc.views.omnigrid.GridLayoutInputItem;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class GridLayoutOutputBuilder {
    public int contentHeight;
    public int contentWidth;
    public int floatingSelfViewDisplayMode;
    public boolean floatingSelfViewMinimizable;
    public int floatingSelfViewSize;
    public int[] itemData;
    public final GridLayoutInput layoutInput;
    public int[] scrollExclusionAreaData;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [int] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v6 */
    public final C51727Mt4 build() {
        ?? r17;
        Integer num;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        Integer num4;
        int i3;
        int i4;
        int size = this.layoutInput.items.size();
        ArrayList A17 = AbstractC25225BEi.A17(size);
        int[] iArr = this.itemData;
        if (iArr != null && iArr.length == size * 8) {
            for (int i5 = 0; i5 < size; i5++) {
                long j = ((GridLayoutInputItem) this.layoutInput.items.get(i5)).id;
                int i6 = i5 * 8;
                int i7 = iArr[i6];
                int i8 = iArr[i6 + 1];
                int i9 = iArr[i6 + 2];
                int i10 = iArr[i6 + 3];
                int i11 = iArr[i6 + 4];
                int i12 = iArr[i6 + 5];
                int i13 = iArr[i6 + 6];
                int i14 = iArr[i6 + 7];
                UQ7 uq7 = new UQ7(i7, i8, i9 + i7, i10 + i8, 0);
                Integer[] numArr = AbstractC54333Nzr.A00;
                int length = numArr.length;
                int i15 = 0;
                while (true) {
                    if (i15 < length) {
                        num3 = numArr[i15];
                        switch (num3.intValue()) {
                            case 1:
                                i4 = 1;
                                break;
                            case 2:
                                i4 = 2;
                                break;
                            case 3:
                                i4 = 3;
                                break;
                            case 4:
                                i4 = 4;
                                break;
                            case 5:
                                i4 = 5;
                                break;
                            case 6:
                                i4 = 6;
                                break;
                            default:
                                i4 = 0;
                                break;
                        }
                        if (i4 != i11) {
                            i15++;
                        }
                    } else {
                        num3 = C05F.A00;
                    }
                }
                boolean A1O = AbstractC167007dF.A1O(i14);
                Integer[] numArr2 = OR3.A00;
                int length2 = numArr2.length;
                int i16 = 0;
                while (true) {
                    if (i16 < length2) {
                        num4 = numArr2[i16];
                        switch (num4.intValue()) {
                            case 1:
                                i3 = 1;
                                break;
                            case 2:
                                i3 = 2;
                                break;
                            default:
                                i3 = 0;
                                break;
                        }
                        if (i3 != i12) {
                            i16++;
                        }
                    } else {
                        num4 = C05F.A00;
                    }
                }
                A17.add(new C51614Mr7(uq7, num3, num4, i13, j, A1O));
            }
        } else {
            C0K8.A0C("GridLayoutOutputBuilder", AnonymousClass001.A07(size, "Invalid itemData: ", Arrays.toString(iArr), ", itemCount: "));
        }
        int i17 = this.contentHeight;
        GridLayoutInput gridLayoutInput = this.layoutInput;
        if (i17 > gridLayoutInput.height) {
            r17 = 2;
        } else {
            r17 = AbstractC25230BEn.A1S(this.contentWidth, gridLayoutInput.width);
        }
        int[] iArr2 = this.scrollExclusionAreaData;
        Rect rect = null;
        if (iArr2 != null && iArr2[2] > 0 && iArr2[3] > 0) {
            rect = AbstractC166987dD.A0U();
            int i18 = iArr2[0];
            rect.left = i18;
            int i19 = iArr2[1];
            rect.top = i19;
            rect.right = i18 + iArr2[2];
            rect.bottom = i19 + iArr2[3];
        }
        int i20 = this.contentWidth;
        int i21 = this.contentHeight;
        int i22 = this.floatingSelfViewDisplayMode;
        Integer[] numArr3 = AbstractC54331Nzp.A00;
        int length3 = numArr3.length;
        int i23 = 0;
        while (true) {
            if (i23 < length3) {
                num = numArr3[i23];
                switch (num.intValue()) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                if (i2 != i22) {
                    i23++;
                }
            } else {
                num = C05F.A00;
            }
        }
        boolean z = this.floatingSelfViewMinimizable;
        int i24 = this.floatingSelfViewSize;
        Integer[] numArr4 = AbstractC54332Nzq.A00;
        int length4 = numArr4.length;
        int i25 = 0;
        while (true) {
            if (i25 < length4) {
                num2 = numArr4[i25];
                if (1 - num2.intValue() != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i != i24) {
                    i25++;
                }
            } else {
                num2 = C05F.A00;
            }
        }
        return new C51727Mt4(rect, this.layoutInput.config.selfViewLocation, num, num2, null, A17, null, i20, i21, r17, z);
    }

    public GridLayoutOutputBuilder(GridLayoutInput gridLayoutInput) {
        this.layoutInput = gridLayoutInput;
    }
}
