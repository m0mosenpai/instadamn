package X;

import android.view.View;
import java.util.Arrays;

/* renamed from: X.73r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1571273r {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public View.OnClickListener A05;
    public InterfaceC1571373s A06;
    public CharSequence A07;
    public CharSequence A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C1571273r c1571273r = (C1571273r) obj;
            if (this.A02 != c1571273r.A02 || this.A01 != c1571273r.A01 || this.A00 != c1571273r.A00 || this.A0Q != c1571273r.A0Q || this.A0M != c1571273r.A0M || this.A03 != c1571273r.A03 || this.A0O != c1571273r.A0O || this.A0N != c1571273r.A0N || this.A0L != c1571273r.A0L || this.A0P != c1571273r.A0P || this.A04 != c1571273r.A04 || this.A0H != c1571273r.A0H || this.A0K != c1571273r.A0K || this.A0I != c1571273r.A0I || this.A0J != c1571273r.A0J || this.A0G != c1571273r.A0G || this.A0F != c1571273r.A0F || !C14360o3.A0K(this.A0D, c1571273r.A0D) || !C14360o3.A0K(this.A07, c1571273r.A07) || !C14360o3.A0K(this.A0B, c1571273r.A0B) || !C14360o3.A0K(this.A0A, c1571273r.A0A) || !C14360o3.A0K(this.A08, c1571273r.A08) || !C14360o3.A0K(this.A0C, c1571273r.A0C) || !C14360o3.A0K(this.A09, c1571273r.A09)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[28];
        System.arraycopy(new Object[]{Integer.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A0D, this.A0B, this.A07, this.A0A, this.A08, null, this.A0C, this.A09, false, Boolean.valueOf(this.A0Q), null, true, Boolean.valueOf(this.A0M), Integer.valueOf(this.A03), Boolean.valueOf(this.A0O), Boolean.valueOf(this.A0N), Boolean.valueOf(this.A0L), Boolean.valueOf(this.A0P), Integer.valueOf(this.A04), Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0K), Boolean.valueOf(this.A0I), Boolean.valueOf(this.A0J), Boolean.valueOf(this.A0G)}, 0, objArr, 0, 27);
        System.arraycopy(new Object[]{Boolean.valueOf(this.A0F)}, 0, objArr, 27, 1);
        return Arrays.hashCode(objArr);
    }
}
