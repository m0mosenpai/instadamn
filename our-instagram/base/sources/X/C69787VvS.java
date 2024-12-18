package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.VvS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69787VvS {
    public boolean A06 = true;
    public float A00 = Float.NaN;
    public float A03 = Float.NaN;
    public float A02 = Float.NaN;
    public float A04 = Float.NaN;
    public float A01 = Float.NaN;
    public Integer A05 = C05F.A0Y;

    public final float A00() {
        float A01;
        float f = this.A02;
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        if (this.A06) {
            float f2 = this.A04;
            float f3 = 0.0f;
            if (!Float.isNaN(f2)) {
                f3 = f2;
            }
            A01 = WF1.A02(f, f3);
        } else {
            A01 = WF1.A01(f);
        }
        return A01 / A02();
    }

    public final float A01() {
        float A01;
        float f = this.A03;
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        if (this.A06) {
            float f2 = this.A04;
            float f3 = 0.0f;
            if (!Float.isNaN(f2)) {
                f3 = f2;
            }
            A01 = WF1.A02(f, f3);
        } else {
            A01 = WF1.A01(f);
        }
        float f4 = this.A01;
        if (Float.isNaN(f4) || f4 <= A01) {
            return A01;
        }
        return f4;
    }

    public final int A02() {
        float A01;
        float f = this.A00;
        float f2 = 14.0f;
        if (!Float.isNaN(f)) {
            f2 = f;
        }
        if (this.A06) {
            float f3 = this.A04;
            float f4 = 0.0f;
            if (!Float.isNaN(f3)) {
                f4 = f3;
            }
            A01 = WF1.A02(f2, f4);
        } else {
            A01 = WF1.A01(f2);
        }
        return (int) Math.ceil(A01);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("TextAttributes {\n  getAllowFontScaling(): ");
        sb.append(this.A06);
        sb.append("\n  getFontSize(): ");
        sb.append(this.A00);
        sb.append("\n  getEffectiveFontSize(): ");
        sb.append(A02());
        sb.append("\n  getHeightOfTallestInlineViewOrImage(): ");
        sb.append(this.A01);
        sb.append("\n  getLetterSpacing(): ");
        sb.append(this.A02);
        sb.append("\n  getEffectiveLetterSpacing(): ");
        sb.append(A00());
        sb.append("\n  getLineHeight(): ");
        sb.append(this.A03);
        sb.append("\n  getEffectiveLineHeight(): ");
        sb.append(A01());
        sb.append("\n  getTextTransform(): ");
        Integer num = this.A05;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "UPPERCASE";
                    break;
                case 2:
                    str = "LOWERCASE";
                    break;
                case 3:
                    str = "CAPITALIZE";
                    break;
                case 4:
                    str = "UNSET";
                    break;
                default:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("\n  getMaxFontSizeMultiplier(): ");
        sb.append(this.A04);
        sb.append("\n  getEffectiveMaxFontSizeMultiplier(): ");
        float f = this.A04;
        float f2 = 0.0f;
        if (!Float.isNaN(f)) {
            f2 = f;
        }
        sb.append(f2);
        return AbstractC166997dE.A0x("\n}", sb);
    }
}
