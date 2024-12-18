package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.Se1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63153Se1 {
    public FragmentActivity A01;
    public BrowserLiteFragment A02;
    public C61702RsJ A03;
    public C63305ShB A04;
    public C62720SNk A05;
    public C62656SKq A06;
    public boolean A07;
    public boolean A08;
    public double A00 = 1.0d;
    public final ACQ A09 = new ACQ();

    public static long A00(C63153Se1 c63153Se1) {
        long longExtra = c63153Se1.A01.getIntent().getLongExtra("BrowserLiteIntent.HANDLE_INTENT_START_TIME", 0L);
        if (longExtra > 0) {
            c63153Se1.A09.A01("BLIH.Intent_Creation", longExtra);
        }
        return longExtra;
    }

    public static void A01(Bundle bundle, C63153Se1 c63153Se1, String str, int i) {
        BrowserLiteFragment browserLiteFragment = c63153Se1.A02;
        if (browserLiteFragment != null) {
            browserLiteFragment.A0V(i);
            FragmentActivity fragmentActivity = c63153Se1.A01;
            if (fragmentActivity.getCallingActivity() != null) {
                fragmentActivity.setResult(c63153Se1.A02.A00, new Intent(fragmentActivity.getIntent()).putExtra("KEY_URL", str).putExtra("last_tap_point", i).putExtras(bundle));
            }
        }
        c63153Se1.A01.finish();
    }

    public C63153Se1(FragmentActivity fragmentActivity, C62656SKq c62656SKq) {
        this.A01 = fragmentActivity;
        this.A06 = c62656SKq;
    }
}
