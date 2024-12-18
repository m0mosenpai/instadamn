package X;

import android.content.Context;

/* renamed from: X.6Qs, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Qs {
    public final C138866Qr A00(Context context) {
        C14360o3.A0B(context, 0);
        C138866Qr c138866Qr = C138866Qr.A0N;
        if (c138866Qr == null) {
            synchronized (this) {
                c138866Qr = C138866Qr.A0N;
                if (c138866Qr == null) {
                    c138866Qr = new C138866Qr(context);
                    C138866Qr.A0N = c138866Qr;
                }
            }
        }
        return c138866Qr;
    }
}
