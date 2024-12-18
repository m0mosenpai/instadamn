package X;

import android.widget.TextView;
import com.instagram.api.schemas.TrackData;

/* loaded from: classes7.dex */
public abstract class I5R {
    public static void A00(C41628IbJ c41628IbJ, JHI jhi, C38479Gw0 c38479Gw0, Integer num, int i) {
        I5P.A00(c41628IbJ, jhi, c38479Gw0.A04, num, i);
        if (c41628IbJ.A00.BVk() != null) {
            TrackData BVV = c41628IbJ.A00.BVk().BVV();
            TextView textView = c38479Gw0.A02;
            textView.getClass();
            textView.setText(BVV.getDisplayArtist());
            TextView textView2 = c38479Gw0.A03;
            textView2.getClass();
            textView2.setText(BVV.getTitle());
            AbstractC38055Goi.A00(c38479Gw0.A01, BVV.AsF(), null);
        }
    }
}
