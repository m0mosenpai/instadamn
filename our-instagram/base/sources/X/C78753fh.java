package X;

import android.content.res.ColorStateList;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.3fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78753fh {
    public float A01;
    public float A02;
    public float A03;
    public int A09;
    public int A0B;
    public int A0C;
    public ColorStateList A0D;
    public CharSequence A0I;
    public TextPaint A0F = new TextPaint(1);
    public float A05 = 1.0f;
    public float A04 = 0.0f;
    public float A00 = Float.MAX_VALUE;
    public boolean A0J = true;
    public boolean A0L = false;
    public TextUtils.TruncateAt A0G = null;
    public boolean A0M = false;
    public int A0A = Integer.MAX_VALUE;
    public Layout.Alignment A0E = Layout.Alignment.ALIGN_NORMAL;
    public InterfaceC78793fl A0H = AbstractC78763fi.A01;
    public int A06 = 0;
    public int A07 = 0;
    public int A08 = 0;
    public boolean A0K = false;

    public final void A00() {
        if (this.A0K) {
            TextPaint textPaint = new TextPaint(this.A0F);
            textPaint.set(this.A0F);
            this.A0F = textPaint;
            this.A0K = false;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int color = (((this.A0F.getColor() + 31) * 31) + Float.floatToIntBits(this.A0F.getTextSize())) * 31;
        int i4 = 0;
        if (this.A0F.getTypeface() != null) {
            i = this.A0F.getTypeface().hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = (((((((((color + i) * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31) + this.A09) * 31;
        TextPaint textPaint = this.A0F;
        int floatToIntBits2 = (((((((((((((((((((floatToIntBits + textPaint.linkColor) * 31) + Float.floatToIntBits(textPaint.density)) * 31) + Arrays.hashCode(textPaint.drawableState)) * 31) + this.A0C) * 31) + this.A0B) * 31) + Float.floatToIntBits(this.A05)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A00)) * 31) + (this.A0J ? 1 : 0)) * 31) + 1) * 31;
        TextUtils.TruncateAt truncateAt = this.A0G;
        if (truncateAt != null) {
            i2 = truncateAt.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = (((((((floatToIntBits2 + i2) * 31) + (this.A0M ? 1 : 0)) * 31) + this.A0A) * 31) + this.A0E.hashCode()) * 31;
        InterfaceC78793fl interfaceC78793fl = this.A0H;
        if (interfaceC78793fl != null) {
            i3 = interfaceC78793fl.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = (((((((((hashCode + i3) * 31) + this.A06) * 31) + this.A07) * 31) + Arrays.hashCode((int[]) null)) * 31) + Arrays.hashCode((int[]) null)) * 31;
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            i4 = charSequence.hashCode();
        }
        return hashCode2 + i4;
    }
}
