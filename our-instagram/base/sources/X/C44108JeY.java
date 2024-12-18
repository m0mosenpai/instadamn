package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.JeY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44108JeY extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44108JeY(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = AbstractC166997dE.A0S(view, R.id.header_wrapper);
        this.A03 = AbstractC167007dF.A0N(view, R.id.header_text);
        this.A04 = AbstractC167007dF.A0N(view, R.id.header_action_button);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.header_action_close_button);
        this.A02 = AbstractC31176DnK.A0D(view, R.id.header_notification_settings_icon);
    }
}
