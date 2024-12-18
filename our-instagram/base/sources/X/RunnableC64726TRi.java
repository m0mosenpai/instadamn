package X;

import android.text.TextUtils;

/* renamed from: X.TRi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64726TRi implements Runnable {
    public final /* synthetic */ C62583SHi A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Throwable A03;

    public RunnableC64726TRi(C62583SHi c62583SHi, Object obj, String str, Throwable th) {
        this.A00 = c62583SHi;
        this.A03 = th;
        this.A02 = str;
        this.A01 = obj;
    }

    public static void A00(RunnableC64726TRi runnableC64726TRi, String str, Throwable th) {
        C62583SHi c62583SHi = runnableC64726TRi.A00;
        SZ5 sz5 = c62583SHi.A01;
        Object obj = runnableC64726TRi.A01;
        c62583SHi.A03.execute(new TR4(c62583SHi.A00, sz5, obj, str, th));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.A03;
        String str = null;
        try {
            String str2 = this.A02;
            if (!TextUtils.isEmpty(str2)) {
                str = this.A00.A02.decodeResponse(str2);
            }
            A00(this, str, th);
        } catch (IllegalArgumentException e) {
            A00(this, null, e);
        } catch (Throwable th2) {
            A00(this, null, th);
            throw th2;
        }
    }
}
