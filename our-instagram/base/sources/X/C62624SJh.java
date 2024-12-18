package X;

import android.content.Intent;

/* renamed from: X.SJh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62624SJh {
    public final C63217SfN A00(Intent intent) {
        C14360o3.A0B(intent, 0);
        C63217SfN c63217SfN = C63217SfN.A06;
        if (c63217SfN == null) {
            intent.hashCode();
            C63217SfN.A05 = intent.hashCode();
            c63217SfN = new C63217SfN(intent);
        }
        if (C63217SfN.A05 != intent.hashCode() && C63217SfN.A06 != null) {
            intent.hashCode();
            C63217SfN.A05 = intent.hashCode();
            c63217SfN = new C63217SfN(intent);
        }
        if (!C14360o3.A0K(C63217SfN.A06, c63217SfN)) {
            C63217SfN.A06 = c63217SfN;
        }
        return c63217SfN;
    }
}
