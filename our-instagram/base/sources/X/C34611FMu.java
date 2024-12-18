package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.FMu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34611FMu {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C34611FMu(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.trusted_device_more_icon);
        this.A00 = AbstractC31176DnK.A0D(view, R.id.trusted_device_type_icon);
        this.A03 = AbstractC167007dF.A0N(view, R.id.trusted_device_platform);
        this.A04 = AbstractC167007dF.A0N(view, R.id.trusted_device_time);
        this.A02 = AbstractC167007dF.A0N(view, R.id.trusted_device_location);
    }
}
