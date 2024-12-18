package X;

import android.os.Bundle;

/* renamed from: X.FbZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35002FbZ {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    public static Bundle A00(C35002FbZ c35002FbZ) {
        Bundle bundle = new Bundle();
        c35002FbZ.A01(bundle);
        return bundle;
    }

    public final void A01(Bundle bundle) {
        bundle.putInt("resend_sms_delay_sec", this.A02);
        bundle.putInt("robocall_count_down_time_sec", this.A01);
        bundle.putBoolean("robocall_after_max_sms", this.A03);
        bundle.putInt("max_sms_count", this.A00);
    }
}
