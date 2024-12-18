package X;

import android.graphics.Rect;

/* renamed from: X.3fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78573fP {
    public int A00;
    public int A01;
    public long A02;
    public C2WA A03;
    public C2W3 A04;
    public C2WB A05;
    public C2WB A06;
    public C2WB A07;
    public C2WB A08;
    public C2WB A09;
    public C2W5 A0A;
    public Object A0B;
    public boolean A0C;
    public boolean A0D;
    public final float A0H;
    public final float A0I;
    public final Rect A0J;
    public final AbstractC78533fL A0K;
    public boolean A0E = false;
    public boolean A0G = false;
    public boolean A0F = false;

    public C78573fP(Rect rect, C2WA c2wa, C2W3 c2w3, C2WB c2wb, C2WB c2wb2, C2WB c2wb3, C2WB c2wb4, C2WB c2wb5, C2W5 c2w5, AbstractC78533fL abstractC78533fL, Object obj, float f, float f2, int i, int i2, long j, boolean z, boolean z2) {
        this.A0K = abstractC78533fL;
        this.A0I = f;
        this.A0H = f2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A0D = z;
        this.A0B = obj;
        this.A0C = z2;
        this.A07 = c2wb;
        this.A09 = c2wb2;
        this.A05 = c2wb3;
        this.A08 = c2wb4;
        this.A06 = c2wb5;
        this.A03 = c2wa;
        this.A0A = c2w5;
        this.A04 = c2w3;
        this.A0J = rect;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C78573fP) {
                C78573fP c78573fP = (C78573fP) obj;
                if (!C14360o3.A0K(this.A0K, c78573fP.A0K) || Float.compare(this.A0I, c78573fP.A0I) != 0 || Float.compare(this.A0H, c78573fP.A0H) != 0 || this.A01 != c78573fP.A01 || this.A00 != c78573fP.A00 || this.A02 != c78573fP.A02 || this.A0D != c78573fP.A0D || this.A0E != c78573fP.A0E || !C14360o3.A0K(this.A0B, c78573fP.A0B) || this.A0G != c78573fP.A0G || this.A0C != c78573fP.A0C || this.A0F != c78573fP.A0F || !C14360o3.A0K(this.A07, c78573fP.A07) || !C14360o3.A0K(this.A09, c78573fP.A09) || !C14360o3.A0K(this.A05, c78573fP.A05) || !C14360o3.A0K(this.A08, c78573fP.A08) || !C14360o3.A0K(this.A06, c78573fP.A06) || !C14360o3.A0K(this.A03, c78573fP.A03) || !C14360o3.A0K(this.A0A, c78573fP.A0A) || !C14360o3.A0K(this.A04, c78573fP.A04) || !C14360o3.A0K(this.A0J, c78573fP.A0J)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("YogaLayoutOutput(yogaNode=");
        sb.append(this.A0K);
        sb.append(", widthFromStyle=");
        sb.append(this.A0I);
        sb.append(", heightFromStyle=");
        sb.append(this.A0H);
        sb.append(", _widthSpec=");
        sb.append(this.A01);
        sb.append(", _heightSpec=");
        sb.append(this.A00);
        sb.append(", _lastMeasuredSize=");
        sb.append(this.A02);
        sb.append(", _isCachedLayout=");
        sb.append(this.A0D);
        sb.append(", _isDiffedLayout=");
        sb.append(this.A0E);
        sb.append(", _layoutData=");
        sb.append(this.A0B);
        sb.append(", _wasMeasured=");
        sb.append(this.A0G);
        sb.append(", _cachedMeasuresValid=");
        sb.append(this.A0C);
        sb.append(", _measureHadExceptions=");
        sb.append(this.A0F);
        sb.append(", _contentRenderUnit=");
        sb.append(this.A07);
        sb.append(", _hostRenderUnit=");
        sb.append(this.A09);
        sb.append(", _backgroundRenderUnit=");
        sb.append(this.A05);
        sb.append(", _foregroundRenderUnit=");
        sb.append(this.A08);
        sb.append(", _borderRenderUnit=");
        sb.append(this.A06);
        sb.append(", _diffNode=");
        sb.append(this.A03);
        sb.append(", _delegate=");
        sb.append(this.A0A);
        sb.append(", _nestedResult=");
        sb.append(this.A04);
        sb.append(", _adjustedBounds=");
        sb.append(this.A0J);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = ((((((((this.A0K.hashCode() * 31) + Float.floatToIntBits(this.A0I)) * 31) + Float.floatToIntBits(this.A0H)) * 31) + this.A01) * 31) + this.A00) * 31;
        long j = this.A02;
        int i = (hashCode9 + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = 1237;
        if (this.A0D) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        int i4 = 1237;
        if (this.A0E) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        Object obj = this.A0B;
        int i6 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i7 = (i5 + hashCode) * 31;
        int i8 = 1237;
        if (this.A0G) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0C) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0F) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        C2WB c2wb = this.A07;
        if (c2wb == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c2wb.hashCode();
        }
        int i14 = (i13 + hashCode2) * 31;
        C2WB c2wb2 = this.A09;
        if (c2wb2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c2wb2.hashCode();
        }
        int i15 = (i14 + hashCode3) * 31;
        C2WB c2wb3 = this.A05;
        if (c2wb3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c2wb3.hashCode();
        }
        int i16 = (i15 + hashCode4) * 31;
        C2WB c2wb4 = this.A08;
        if (c2wb4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c2wb4.hashCode();
        }
        int i17 = (i16 + hashCode5) * 31;
        C2WB c2wb5 = this.A06;
        if (c2wb5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c2wb5.hashCode();
        }
        int i18 = (i17 + hashCode6) * 31;
        C2WA c2wa = this.A03;
        if (c2wa == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = c2wa.hashCode();
        }
        int i19 = (i18 + hashCode7) * 31;
        C2W5 c2w5 = this.A0A;
        if (c2w5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = c2w5.hashCode();
        }
        int i20 = (i19 + hashCode8) * 31;
        C2W3 c2w3 = this.A04;
        if (c2w3 != null) {
            i6 = c2w3.hashCode();
        }
        return ((i20 + i6) * 31) + this.A0J.hashCode();
    }
}
