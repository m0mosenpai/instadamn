package X;

import android.view.View;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.ONh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54856ONh {
    public static void A00(C56552P8y c56552P8y) {
        MediaFrameLayout mediaFrameLayout = c56552P8y.A0E;
        mediaFrameLayout.setVisibility(8);
        c56552P8y.A0A.A02();
        c56552P8y.A00 = null;
        c56552P8y.A02.setVisibility(8);
        c56552P8y.A0D.setVisibility(8);
        c56552P8y.A04.setVisibility(8);
        mediaFrameLayout.setBackgroundDrawable(null);
        c56552P8y.A0B.A03(8);
        c56552P8y.A0C.A03(8);
        c56552P8y.A06.setVisibility(8);
    }

    public static void A01(C56552P8y c56552P8y, long j, boolean z) {
        View view;
        int i;
        if (z) {
            Date date = new Date(j * 1000);
            TimeZone timeZone = MX0.A03;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d", Locale.getDefault());
            TimeZone timeZone2 = MX0.A03;
            simpleDateFormat.setTimeZone(timeZone2);
            String format = simpleDateFormat.format(date);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM", Locale.getDefault());
            simpleDateFormat2.setTimeZone(timeZone2);
            String format2 = simpleDateFormat2.format(date);
            c56552P8y.A05.setText(format);
            c56552P8y.A07.setText(format2);
            view = c56552P8y.A02;
            i = 0;
        } else {
            view = c56552P8y.A02;
            i = 8;
        }
        view.setVisibility(i);
    }
}
