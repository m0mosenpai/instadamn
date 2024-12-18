package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Guz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38424Guz extends C3OO {
    public final TextView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38424Guz(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View findViewById = view.findViewById(R.id.secondary_cta_button);
        TextView textView = (TextView) findViewById;
        AbstractC56952jT.A01(textView);
        C14360o3.A07(findViewById);
        this.A00 = textView;
    }
}
