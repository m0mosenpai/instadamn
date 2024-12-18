package X;

import android.animation.StateListAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewOutlineProvider;
import java.util.List;

/* renamed from: X.2X5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2X5 {
    public static final C78253er A0f = new Object();
    public float A01;
    public float A02;
    public float A03;
    public float A05;
    public int A07;
    public int A08;
    public int A0C;
    public StateListAnimator A0E;
    public Paint A0F;
    public Drawable A0G;
    public Drawable A0H;
    public SparseArray A0I;
    public ViewOutlineProvider A0J;
    public C2V9 A0K;
    public C2V9 A0L;
    public C2V9 A0M;
    public C2V9 A0N;
    public C2V9 A0O;
    public CV2 A0P;
    public CharSequence A0Q;
    public Object A0R;
    public String A0T;
    public String A0U;
    public List A0V;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public String A0S = "";
    public int A0D = -1;
    public int A0A = 2;
    public int A09 = -1;
    public float A04 = 1.0f;
    public float A00 = 1.0f;
    public boolean A0W = true;
    public int A06 = -16777216;
    public int A0B = -16777216;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2X5) {
                C2X5 c2x5 = (C2X5) obj;
                if (this.A0c != c2x5.A0c || !C14360o3.A0K(this.A0S, c2x5.A0S) || this.A08 != c2x5.A08 || this.A0Y != c2x5.A0Y || this.A07 != c2x5.A07 || this.A00 != c2x5.A00 || !AbstractC78713fd.A01(this.A0K, c2x5.A0K) || this.A0X != c2x5.A0X || this.A0W != c2x5.A0W || !C14360o3.A0K(this.A0Q, c2x5.A0Q) || !C14360o3.A0K(this.A0T, c2x5.A0T) || this.A0a != c2x5.A0a || !AbstractC78713fd.A01(this.A0L, c2x5.A0L) || this.A0b != c2x5.A0b || !AbstractC78713fd.A01(this.A0M, c2x5.A0M) || !AbstractC78713fd.A01(this.A0N, c2x5.A0N) || !C14360o3.A0K(this.A0J, c2x5.A0J) || this.A01 != c2x5.A01 || this.A02 != c2x5.A02 || this.A03 != c2x5.A03 || this.A04 != c2x5.A04 || this.A0e != c2x5.A0e || this.A0d != c2x5.A0d || this.A0Z != c2x5.A0Z || this.A05 != c2x5.A05 || this.A06 != c2x5.A06 || this.A0B != c2x5.A0B || !AbstractC78713fd.A01(this.A0O, c2x5.A0O) || this.A0D != c2x5.A0D || !C14360o3.A0K(this.A0R, c2x5.A0R) || !AbstractC78713fd.A00(this.A0I, c2x5.A0I) || !AnonymousClass530.A00(this.A0G, c2x5.A0G) || !AnonymousClass530.A00(this.A0H, c2x5.A0H) || !new C78233ep(this.A0A).equals(new C78233ep(c2x5.A0A)) || this.A0C != c2x5.A0C || !C14360o3.A0K(this.A0E, c2x5.A0E) || !C14360o3.A0K(this.A0U, c2x5.A0U) || this.A09 != c2x5.A09 || !C14360o3.A0K(this.A0F, c2x5.A0F)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 1237;
        if (this.A0c) {
            i15 = 1231;
        }
        int hashCode = ((((i15 * 31) + this.A0S.hashCode()) * 31) + this.A08) * 31;
        int i16 = 1237;
        if (this.A0Y) {
            i16 = 1231;
        }
        int i17 = (hashCode + i16) * 31;
        CharSequence charSequence = this.A0Q;
        int i18 = 0;
        if (charSequence != null) {
            i = charSequence.hashCode();
        } else {
            i = 0;
        }
        int i19 = (((i17 + i) * 31) + this.A0D) * 31;
        Object obj = this.A0R;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i20 = (i19 + i2) * 31;
        String str = this.A0U;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i21 = (i20 + i3) * 31;
        SparseArray sparseArray = this.A0I;
        if (sparseArray != null) {
            i4 = sparseArray.hashCode();
        } else {
            i4 = 0;
        }
        int i22 = (i21 + i4) * 31;
        ViewOutlineProvider viewOutlineProvider = this.A0J;
        if (viewOutlineProvider != null) {
            i5 = viewOutlineProvider.hashCode();
        } else {
            i5 = 0;
        }
        int i23 = (i22 + i5) * 31;
        C2V9 c2v9 = this.A0K;
        if (c2v9 != null) {
            i6 = c2v9.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (i23 + i6) * 31;
        C2V9 c2v92 = this.A0N;
        if (c2v92 != null) {
            i7 = c2v92.hashCode();
        } else {
            i7 = 0;
        }
        int i25 = (i24 + i7) * 31;
        C2V9 c2v93 = this.A0L;
        if (c2v93 != null) {
            i8 = c2v93.hashCode();
        } else {
            i8 = 0;
        }
        int i26 = (i25 + i8) * 31;
        C2V9 c2v94 = this.A0O;
        if (c2v94 != null) {
            i9 = c2v94.hashCode();
        } else {
            i9 = 0;
        }
        int i27 = (i26 + i9) * 31;
        C2V9 c2v95 = this.A0M;
        if (c2v95 != null) {
            i10 = c2v95.hashCode();
        } else {
            i10 = 0;
        }
        int i28 = (i27 + i10) * 31;
        Drawable drawable = this.A0G;
        if (drawable != null) {
            i11 = drawable.hashCode();
        } else {
            i11 = 0;
        }
        int i29 = (i28 + i11) * 31;
        Drawable drawable2 = this.A0H;
        if (drawable2 != null) {
            i12 = drawable2.hashCode();
        } else {
            i12 = 0;
        }
        int i30 = (((i29 + i12) * 31) + this.A0A) * 31;
        StateListAnimator stateListAnimator = this.A0E;
        if (stateListAnimator != null) {
            i13 = stateListAnimator.hashCode();
        } else {
            i13 = 0;
        }
        int i31 = (((((i30 + i13) * 31) + this.A0C) * 31) + this.A09) * 31;
        Paint paint = this.A0F;
        if (paint != null) {
            i14 = paint.hashCode();
        } else {
            i14 = 0;
        }
        int floatToIntBits = (((((((((((((i31 + i14) * 31) + this.A07) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31;
        int i32 = 1237;
        if (this.A0W) {
            i32 = 1231;
        }
        int i33 = (floatToIntBits + i32) * 31;
        int i34 = 1237;
        if (this.A0X) {
            i34 = 1231;
        }
        int i35 = (i33 + i34) * 31;
        int i36 = 1237;
        if (this.A0b) {
            i36 = 1231;
        }
        int i37 = (i35 + i36) * 31;
        int i38 = 1237;
        if (this.A0Z) {
            i38 = 1231;
        }
        int i39 = (i37 + i38) * 31;
        int i40 = 1237;
        if (this.A0a) {
            i40 = 1231;
        }
        int i41 = (i39 + i40) * 31;
        int i42 = 1237;
        if (this.A0e) {
            i42 = 1231;
        }
        int i43 = (i41 + i42) * 31;
        int i44 = 1237;
        if (this.A0d) {
            i44 = 1231;
        }
        int floatToIntBits2 = (((((((i43 + i44) * 31) + Float.floatToIntBits(this.A05)) * 31) + this.A06) * 31) + this.A0B) * 31;
        String str2 = this.A0T;
        if (str2 != null) {
            i18 = str2.hashCode();
        }
        return floatToIntBits2 + i18;
    }
}
