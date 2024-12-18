package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;

/* renamed from: X.8aO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189448aO {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public Rect A0G;
    public Drawable A0H;
    public Drawable A0I;
    public Drawable A0J;
    public View.OnClickListener A0K;
    public View.OnClickListener A0L;
    public View.OnClickListener A0M;
    public View A0N;
    public EnumC60792q3 A0O;
    public A7S A0P;
    public C189468aQ A0Q;
    public C189468aQ A0R;
    public C189468aQ A0S;
    public C51D A0T;
    public InterfaceC1119153d A0U;
    public BCD A0V;
    public InterfaceC65577TnB A0W;
    public InterfaceC86363t8 A0X;
    public W4O A0Y;
    public Boolean A0Z;
    public Boolean A0a;
    public CharSequence A0b;
    public CharSequence A0c;
    public CharSequence A0d;
    public Float A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public int[] A1T;
    public int[] A1U;
    public final AbstractC12990ll A1V;
    public static final int[] A1X = {R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out};
    public static final int[] A1W = {R.anim.left_in, R.anim.right_out, R.anim.right_in, R.anim.left_out};

    public C189448aO(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A1V = abstractC12990ll;
        this.A1O = true;
        this.A0k = true;
        this.A11 = true;
        this.A0C = 2;
        this.A02 = 0.5f;
        this.A0Q = new C189458aP(null, null, "", 0, 0).A00();
        this.A0R = new C189458aP(null, null, "", 0, 0).A00();
        this.A0S = new C189458aP(null, null, "", 0, 0).A00();
        this.A16 = true;
        this.A13 = false;
        this.A03 = 0.5f;
        this.A04 = 1.0f;
        this.A01 = 0.2f;
        this.A08 = -1;
        this.A1K = true;
        this.A1C = true;
        this.A14 = true;
        this.A0y = true;
        this.A0p = true;
        this.A0O = EnumC60792q3.A02;
    }

    public final void A01() {
        this.A0Q = new C189458aP(null, null, "", 0, 0).A00();
    }

    public final void A02() {
        this.A0R = new C189458aP(null, null, "", 0, 0).A00();
    }

    public final C189478aR A00() {
        if (this.A0s) {
            float f = this.A01;
            float f2 = this.A03;
            if (f >= f2 && !this.A0o && f > f2) {
                throw new IllegalArgumentException("Expected the collapsed height ratio to be less than the initial opening height ratio");
            }
        }
        return new C189478aR(this.A1V, this);
    }

    public final void A03() {
        int[] iArr = A1X;
        A04(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public final void A04(int i, int i2, int i3, int i4) {
        this.A1U = new int[]{i, i2, i3, i4};
    }

    public final void A05(Context context, int i) {
        this.A03 = context.getResources().getDimensionPixelSize(i) / AbstractC13880nE.A09(context);
    }

    public final void A06(C189468aQ c189468aQ) {
        this.A0Q = c189468aQ;
    }

    public final void A07(C189468aQ c189468aQ) {
        this.A0R = c189468aQ;
    }
}
