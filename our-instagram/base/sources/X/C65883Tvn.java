package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;

/* renamed from: X.Tvn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65883Tvn extends C110814yt {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65883Tvn(Context context, Object obj, int i) {
        super(context);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A04(View view, C110834yv c110834yv, C3F5 c3f5) {
        int i;
        int i2;
        int A09;
        switch (this.A00) {
            case 0:
                C9V9 c9v9 = (C9V9) this.A01;
                int[] A092 = c9v9.A09(view, c9v9.A04.A0D);
                i = A092[0];
                i2 = A092[1];
                A09 = A09(Math.max(Math.abs(i), Math.abs(i2)));
                if (A09 <= 0) {
                    return;
                }
                break;
            case 1:
            case 2:
            default:
                super.A04(view, c110834yv, c3f5);
                return;
            case 3:
                AbstractC167007dF.A1D(view, 0, c110834yv);
                C65848Tv9 c65848Tv9 = (C65848Tv9) this.A01;
                AbstractC70663Fe abstractC70663Fe = c65848Tv9.A02.A0D;
                if (abstractC70663Fe == null) {
                    return;
                }
                int[] A093 = c65848Tv9.A09(view, abstractC70663Fe);
                Integer A04 = AbstractC009903n.A04(A093, 0);
                Integer A042 = AbstractC009903n.A04(A093, 1);
                if (A04 == null || A042 == null) {
                    return;
                }
                i = A04.intValue();
                int abs = Math.abs(i);
                i2 = A042.intValue();
                A09 = A09(Math.max(abs, Math.abs(i2)));
                if (A09 <= 0) {
                    return;
                }
                break;
        }
        c110834yv.A00(((C110814yt) this).A06, i, i2, A09);
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        float count;
        float f;
        switch (this.A00) {
            case 2:
                count = 250.0f / ((WishListFeedFragment) this.A01).A01.getCount();
                f = displayMetrics.densityDpi;
                break;
            case 3:
                C14360o3.A0B(displayMetrics, 0);
                count = ((C65848Tv9) this.A01).A00;
                f = displayMetrics.densityDpi;
                break;
            default:
                f = displayMetrics.densityDpi;
                count = 100.0f;
                break;
        }
        return count / f;
    }

    @Override // X.C110814yt
    public final int A0A(int i) {
        switch (this.A00) {
            case 0:
                return Math.min(100, super.A0A(i));
            case 1:
            case 2:
            default:
                return super.A0A(i);
            case 3:
                return Math.min(((C65848Tv9) this.A01).A01, super.A0A(i));
        }
    }
}
