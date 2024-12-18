package X;

import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* renamed from: X.7NB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NB extends C3OO {
    public final TextView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7NB(TextView textView) {
        super(textView);
        C14360o3.A0B(textView, 1);
        this.A00 = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
    }
}
