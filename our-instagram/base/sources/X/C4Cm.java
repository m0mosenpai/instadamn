package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.4Cm, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Cm extends C3OO {
    public final TextView A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Cm(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View findViewById = view.findViewById(R.id.branded_content_tag_text);
        C14360o3.A07(findViewById);
        this.A00 = (TextView) findViewById;
    }
}
