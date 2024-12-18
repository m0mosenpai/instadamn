package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.IJe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41139IJe {
    public final View A00;
    public final TextView A01;
    public final IF5 A02;
    public final NXU A03;
    public final NXU A04;
    public final NXU A05;

    public C41139IJe(View view) {
        this.A00 = view;
        this.A02 = new IF5(view);
        this.A01 = AbstractC166997dE.A0T(view, R.id.text_response);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        this.A04 = AbstractC37304Gc5.A0N(view, R.id.message_button);
        this.A05 = AbstractC37304Gc5.A0N(view, R.id.share_button);
        this.A03 = AbstractC37304Gc5.A0N(view, R.id.delete_button);
    }
}
