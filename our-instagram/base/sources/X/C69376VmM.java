package X;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* renamed from: X.VmM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69376VmM {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final SpannableStringBuilder A05;
    public final CharSequence A06;

    public C69376VmM(EditText editText) {
        this.A05 = new SpannableStringBuilder(editText.getText());
        this.A00 = editText.getTextSize();
        this.A02 = editText.getInputType();
        this.A06 = editText.getHint();
        this.A04 = editText.getMinLines();
        this.A03 = editText.getMaxLines();
        this.A01 = editText.getBreakStrategy();
    }
}
