package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import com.facebook.R;

/* renamed from: X.9yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226259yi {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0018. Please report as an issue. */
    public static void A00(Context context, Resources resources, Spannable spannable, C6RQ c6rq, int i, int i2, int i3) {
        int i4;
        int[] A01;
        Object c221439q8;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        AbstractC226249yh abstractC226249yh = AbstractC226249yh.$redex_init_class;
        switch (c6rq.ordinal()) {
            case 0:
                i4 = c6rq.A00;
                A01 = new int[]{i, i, i, i, i};
                c221439q8 = new C221449q9(AbstractC23047AEd.A00(), A01, c6rq.A03, i4, dimensionPixelSize, i2);
                spannable.setSpan(c221439q8, 0, spannable.length(), 18);
                return;
            case 1:
            case 5:
                AMr.A0B(spannable, dimensionPixelSize, i2, i2, c6rq.A00, c6rq.A03[0]);
                return;
            case 2:
                int[] iArr = c6rq.A03;
                C14360o3.A0B(iArr, 4);
                c221439q8 = new C221439q8(iArr, dimensionPixelSize, i2, i2, i2);
                spannable.setSpan(c221439q8, 0, spannable.length(), 18);
                return;
            case 3:
                i4 = c6rq.A00;
                dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                A01 = AbstractC23047AEd.A01(context);
                c221439q8 = new C221449q9(AbstractC23047AEd.A00(), A01, c6rq.A03, i4, dimensionPixelSize, i2);
                spannable.setSpan(c221439q8, 0, spannable.length(), 18);
                return;
            case 4:
                AMr.A0B(spannable, dimensionPixelSize, i2, i2, c6rq.A00, i);
                return;
            case 6:
                int A02 = AbstractC166997dE.A02(context);
                int color = context.getColor(R.color.action_bar_semi_transparent_white);
                C209849Pv c209849Pv = new C209849Pv(A02, dimensionPixelSize, i2, true, i3, i3);
                c209849Pv.A02 = color;
                c209849Pv.A00 = 8.0f;
                c209849Pv.A01 = 4.0f;
                spannable.setSpan(c209849Pv, 0, spannable.length(), 18);
                c221439q8 = new ForegroundColorSpan(-1);
                spannable.setSpan(c221439q8, 0, spannable.length(), 18);
                return;
            default:
                throw B4Z.A00();
        }
    }
}
