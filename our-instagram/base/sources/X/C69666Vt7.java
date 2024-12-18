package X;

import android.text.Layout;

/* renamed from: X.Vt7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69666Vt7 {
    public float A00;
    public int A02;
    public int A04;
    public Layout.Alignment A0C;
    public Layout.Alignment A0D;
    public W2W A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public int A07 = -1;
    public int A0B = -1;
    public int A03 = -1;
    public int A06 = -1;
    public int A05 = -1;
    public int A09 = -1;
    public int A08 = -1;
    public int A0A = -1;
    public float A01 = Float.MAX_VALUE;

    public final void A00(C69666Vt7 c69666Vt7) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c69666Vt7 != null) {
            if (!this.A0I && c69666Vt7.A0I) {
                this.A04 = c69666Vt7.A04;
                this.A0I = true;
            }
            if (this.A03 == -1) {
                this.A03 = c69666Vt7.A03;
            }
            if (this.A06 == -1) {
                this.A06 = c69666Vt7.A06;
            }
            if (this.A0F == null && (str = c69666Vt7.A0F) != null) {
                this.A0F = str;
            }
            if (this.A07 == -1) {
                this.A07 = c69666Vt7.A07;
            }
            if (this.A0B == -1) {
                this.A0B = c69666Vt7.A0B;
            }
            if (this.A08 == -1) {
                this.A08 = c69666Vt7.A08;
            }
            if (this.A0D == null && (alignment2 = c69666Vt7.A0D) != null) {
                this.A0D = alignment2;
            }
            if (this.A0C == null && (alignment = c69666Vt7.A0C) != null) {
                this.A0C = alignment;
            }
            if (this.A0A == -1) {
                this.A0A = c69666Vt7.A0A;
            }
            if (this.A05 == -1) {
                this.A05 = c69666Vt7.A05;
                this.A00 = c69666Vt7.A00;
            }
            if (this.A0E == null) {
                this.A0E = c69666Vt7.A0E;
            }
            if (this.A01 == Float.MAX_VALUE) {
                this.A01 = c69666Vt7.A01;
            }
            if (!this.A0H && c69666Vt7.A0H) {
                this.A02 = c69666Vt7.A02;
                this.A0H = true;
            }
            if (this.A09 == -1 && (i = c69666Vt7.A09) != -1) {
                this.A09 = i;
            }
        }
    }
}
