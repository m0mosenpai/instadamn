package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6WQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6WQ extends Dialog {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6WQ(Context context) {
        this(context, true);
        C14360o3.A0B(context, 1);
    }

    public final void A00(String str) {
        View findViewById = findViewById(R.id.message);
        C14360o3.A07(findViewById);
        TextView textView = (TextView) findViewById;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6WQ(Context context, boolean z) {
        super(context, R.style.IgDialog);
        C14360o3.A0B(context, 1);
        setContentView(z ? R.layout.progress_dialog : R.layout.progress_dialog_without_spinner);
        setCancelable(false);
    }
}
