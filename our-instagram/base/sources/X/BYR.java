package X;

import android.text.SpannableStringBuilder;

/* loaded from: classes5.dex */
public final class BYR extends SpannableStringBuilder {
    public final /* synthetic */ BYQ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BYR(BYQ byq, CharSequence charSequence) {
        super(charSequence);
        this.A00 = byq;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Object obj2;
        try {
            if (CCL.A00(obj) && C2V3.useSafeSpanEndInTextInputSpec) {
                i2 = Math.min(i2, length());
            }
            super.setSpan(obj, i, i2, i3);
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            if (obj != null) {
                obj2 = obj.getClass();
            } else {
                obj2 = "Unknown";
            }
            throw new IndexOutOfBoundsException(String.format("%s | span=%s | flags=%d", message, obj2, Integer.valueOf(i3)));
        }
    }
}
