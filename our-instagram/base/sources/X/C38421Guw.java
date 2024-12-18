package X;

import android.widget.TextView;

/* renamed from: X.Guw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38421Guw extends C3OO {
    public final /* synthetic */ C38371Gu8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38421Guw(TextView textView, C38371Gu8 c38371Gu8, String str) {
        super(textView);
        C14360o3.A0B(textView, 2);
        this.A00 = c38371Gu8;
        textView.setText(str);
        if (C38371Gu8.A02(c38371Gu8, 0)) {
            textView.setTypeface(null, 1);
            textView.setTextSize(2, 16.0f);
        }
    }
}
