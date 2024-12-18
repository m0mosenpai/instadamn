package X;

import android.widget.TextView;

/* renamed from: X.39o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC692839o {
    public static final CharSequence A00(TextView textView, CharSequence charSequence) {
        boolean z = false;
        if (textView.getText() == charSequence) {
            z = true;
        }
        if (charSequence == null) {
            return null;
        }
        if (z) {
            return charSequence;
        }
        return C2UX.A00().Cny(-1, charSequence);
    }
}
