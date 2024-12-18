package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes7.dex */
public final class IJ4 {
    public View A00;
    public View A01;
    public ImageView A02;
    public TextView A03;
    public final InterfaceC56392iX A04;

    public IJ4(View view) {
        InterfaceC56392iX A00 = AbstractC56372iV.A00(view.requireViewById(R.id.ar_tag_indicator_stub));
        this.A04 = A00;
        A00.EZv(new C42366IpT(0, this, view));
    }
}
