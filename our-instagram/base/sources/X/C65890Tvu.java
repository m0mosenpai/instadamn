package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.Tvu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65890Tvu {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C65890Tvu c65890Tvu = (C65890Tvu) obj;
            if (this.A04 != c65890Tvu.A04 || this.A05 != c65890Tvu.A05) {
                return false;
            }
        }
        return true;
    }

    private void A00() {
        int A06;
        int A062;
        if (!this.A02) {
            int i = this.A05;
            int A04 = AbstractC56842jH.A04(4.5f, -1, i);
            int A042 = AbstractC56842jH.A04(3.0f, -1, i);
            if (A04 != -1 && A042 != -1) {
                this.A00 = AbstractC56842jH.A06(-1, A04);
                A062 = AbstractC56842jH.A06(-1, A042);
            } else {
                int A043 = AbstractC56842jH.A04(4.5f, -16777216, i);
                int A044 = AbstractC56842jH.A04(3.0f, -16777216, i);
                if (A043 != -1 && A044 != -1) {
                    this.A00 = AbstractC56842jH.A06(-16777216, A043);
                    A062 = AbstractC56842jH.A06(-16777216, A044);
                } else {
                    if (A04 != -1) {
                        A06 = AbstractC56842jH.A06(-1, A04);
                    } else {
                        A06 = AbstractC56842jH.A06(-16777216, A043);
                    }
                    this.A00 = A06;
                    if (A042 != -1) {
                        A062 = AbstractC56842jH.A06(-1, A042);
                    } else {
                        A062 = AbstractC56842jH.A06(-16777216, A044);
                    }
                }
            }
            this.A01 = A062;
            this.A02 = true;
        }
    }

    public final float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        AbstractC56842jH.A08(this.A08, this.A07, this.A06, fArr);
        return fArr;
    }

    public final int hashCode() {
        return (this.A05 * 31) + this.A04;
    }

    public C65890Tvu(int i, int i2) {
        this.A08 = Color.red(i);
        this.A07 = Color.green(i);
        this.A06 = Color.blue(i);
        this.A05 = i;
        this.A04 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC31173DnH.A0q(this));
        sb.append(" [RGB: #");
        AbstractC58318PtA.A1T(sb, this.A05);
        sb.append(']');
        sb.append(" [HSL: ");
        sb.append(Arrays.toString(A01()));
        sb.append(']');
        sb.append(" [Population: ");
        sb.append(this.A04);
        sb.append(']');
        sb.append(" [Title Text: #");
        A00();
        AbstractC58318PtA.A1T(sb, this.A01);
        sb.append(']');
        sb.append(" [Body Text: #");
        A00();
        AbstractC58318PtA.A1T(sb, this.A00);
        sb.append(']');
        return sb.toString();
    }
}
