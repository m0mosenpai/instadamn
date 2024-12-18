package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Vm6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69360Vm6 {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;

    public C69360Vm6(View view) {
        this.A01 = view;
        this.A05 = AbstractC31180DnO.A06(view);
        this.A04 = AbstractC31176DnK.A0E(view);
        this.A03 = (TextView) view.requireViewById(R.id.button);
        this.A00 = view.requireViewById(R.id.dismiss_button);
        this.A02 = (ImageView) view.requireViewById(R.id.icon);
    }
}
