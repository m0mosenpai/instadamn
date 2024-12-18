package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ABu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22995ABu {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final UserSession A05;
    public final C81W A06;
    public final A5I A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;

    public C22995ABu(Context context, UserSession userSession, C81W c81w, A5I a5i, int i, int i2, int i3, int i4, boolean z) {
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = c81w;
        this.A02 = i;
        this.A03 = i2;
        this.A07 = a5i;
        this.A01 = i4;
        this.A0A = z;
        List A01 = AbstractC172817mt.A01(userSession, c81w);
        this.A09 = A01;
        this.A08 = AbstractC166987dD.A1E();
        this.A00 = i3;
        if (A01.isEmpty()) {
            AbstractC12120kG.A07("SecondaryPickerAdapter", "Items should not be empty.", null);
        }
        int size = A01.size();
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = this.A01;
            int i7 = i5 / i6;
            int i8 = i5 % i6;
            float f = i8 * this.A02;
            if (!this.A0A) {
                dimensionPixelOffset = 0;
            } else {
                dimensionPixelOffset = this.A04.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material) * i8;
            }
            float f2 = f + dimensionPixelOffset;
            float f3 = i7 * this.A02;
            if (!this.A0A) {
                dimensionPixelOffset2 = 0;
            } else {
                dimensionPixelOffset2 = this.A04.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material) * i7;
            }
            float f4 = f3 + dimensionPixelOffset2;
            C172867my c172867my = (C172867my) AbstractC001800i.A0O(this.A09, i5);
            if (c172867my != null) {
                C22942A9m c22942A9m = new C22942A9m(this, f2, f4, i5, c172867my.A01, c172867my.A00);
                if (i5 == this.A00) {
                    c22942A9m.A04.setItemViewState(true);
                }
                this.A08.add(c22942A9m);
            }
        }
    }

    public final C22942A9m A00(int i) {
        if (i >= 0) {
            List list = this.A08;
            if (i < list.size()) {
                return (C22942A9m) list.get(i);
            }
            return null;
        }
        return null;
    }
}
