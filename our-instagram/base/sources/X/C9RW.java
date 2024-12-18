package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.9RW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RW extends Dialog {
    public final ProgressBar A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9RW(Context context, String str) {
        super(context, R.style.IgDialogDeprecated);
        C14360o3.A0B(str, 2);
        setContentView(R.layout.capture_edit_progress_dialog);
        setCancelable(false);
        ((TextView) findViewById(R.id.message)).setText(str);
        this.A00 = (ProgressBar) findViewById(R.id.loading_progress_bar);
    }
}
