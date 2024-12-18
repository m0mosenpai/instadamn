package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;

/* renamed from: X.3LO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LO {
    public int A02;
    public int A04;
    public int A05;
    public int A08;
    public int A0D;
    public Drawable A0F;
    public View.OnClickListener A0G;
    public View.OnLongClickListener A0H;
    public View A0I;
    public CharSequence A0K;
    public String A0M;
    public boolean A0N;
    public boolean A0P;
    public int A06 = -1;
    public int A0A = -1;
    public LinearLayout.LayoutParams A0J = new LinearLayout.LayoutParams(-2, -2);
    public int A0C = -1;
    public Object[] A0Q = new Object[0];
    public Integer A0L = C05F.A00;
    public int A01 = -1;
    public int A03 = -1;
    public boolean A0O = true;
    public int A0B = -1;
    public int A07 = -1;
    public int A0E = -1;
    public int A00 = -1;
    public int A09 = 80;

    public final void A00() {
        A01(R.drawable.instagram_arrow_back_24);
    }

    public final void A01(int i) {
        if (i == R.drawable.instagram_arrow_back_24) {
            i = R.drawable.instagram_arrow_left_pano_outline_24;
        }
        this.A01 = i;
    }

    public final void A02(Integer num) {
        this.A06 = AbstractC65916TwN.A01(num);
        this.A05 = AbstractC65916TwN.A00(num);
    }
}
