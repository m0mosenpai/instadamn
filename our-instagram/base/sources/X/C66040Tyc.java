package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.Tyc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66040Tyc {
    public static final C66040Tyc A03 = new C66040Tyc();
    public volatile boolean A01;
    public final LinkedBlockingQueue A00 = new LinkedBlockingQueue(200);
    public volatile boolean A02 = true;

    public final void A00(String str, String str2, String str3, String str4, Throwable th, Object... objArr) {
        C14360o3.A0B(objArr, 6);
        if (!this.A01) {
            if ((str2.equals("player") && this.A02) || str.length() == 0 || str2.length() == 0) {
                return;
            }
            this.A00.offer(new C69640Vsh(str, str2, str3, str4, th, objArr));
            if (!W24.A02.A00.get()) {
                return;
            }
            C14360o3.A0F("scheduler");
            throw C00O.createAndThrow();
        }
    }
}
