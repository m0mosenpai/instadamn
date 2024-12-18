package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.SNm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62722SNm {
    public int A00 = 0;
    public int[] A01;
    public final ViewGroup A02;

    public final void A01() {
        int i = 0;
        this.A00 = 0;
        while (true) {
            ViewGroup viewGroup = this.A02;
            if (i < viewGroup.getChildCount()) {
                if (ViewGroupManager.getViewZIndex(viewGroup.getChildAt(i)) != null) {
                    this.A00++;
                }
                i++;
            } else {
                this.A01 = null;
                return;
            }
        }
    }

    public final int A00(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr != null && (i2 >= iArr.length || iArr[i2] >= i)) {
            C0I2.A09("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", AbstractC25228BEl.A1Z(Integer.valueOf(i), i2));
            A01();
        }
        if (this.A01 == null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (int i3 = 0; i3 < i; i3++) {
                A1E.add(this.A02.getChildAt(i3));
            }
            Collections.sort(A1E, new TSN(this, 2));
            this.A01 = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.A01[i4] = this.A02.indexOfChild((View) A1E.get(i4));
            }
        }
        return this.A01[i2];
    }

    public C62722SNm(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }
}
