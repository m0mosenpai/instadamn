package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;

/* renamed from: X.7OO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7OO extends Editable.Factory {
    @Override // android.text.Editable.Factory
    public final Editable newEditable(final CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence) { // from class: X.7OP
            public final /* synthetic */ CharSequence A00;

            @Override // android.text.SpannableStringBuilder, android.text.Spannable
            public final void setSpan(Object obj, int i, int i2, int i3) {
                Object obj2;
                C14360o3.A0B(obj, 0);
                try {
                    super.setSpan(obj, i, i2, i3);
                } catch (IndexOutOfBoundsException e) {
                    C18950wb c18950wb = C18950wb.A01;
                    StringBuilder sb = new StringBuilder();
                    sb.append("setSpan out of boundary: start = ");
                    sb.append(i);
                    sb.append(" end = ");
                    sb.append(i2);
                    sb.append(" length = ");
                    CharSequence charSequence2 = this.A00;
                    if (charSequence2 != null) {
                        obj2 = Integer.valueOf(charSequence2.length());
                    } else {
                        obj2 = "null";
                    }
                    sb.append(obj2);
                    C0f5 AEp = c18950wb.AEp(sb.toString(), 245701013);
                    AEp.ERI(e);
                    AEp.report();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(charSequence);
                this.A00 = charSequence;
            }

            @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
            public final /* bridge */ char charAt(int i) {
                return super.charAt(i);
            }

            @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
            public final /* bridge */ int length() {
                return super.length();
            }
        };
    }
}
