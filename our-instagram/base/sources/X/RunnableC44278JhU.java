package X;

import android.content.Context;

/* renamed from: X.JhU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44278JhU implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C44272JhO A01;

    public RunnableC44278JhU(Context context, C44272JhO c44272JhO) {
        this.A01 = c44272JhO;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44272JhO c44272JhO = this.A01;
        Context context = this.A00;
        if (c44272JhO.A0A.get() != null) {
            c44272JhO.A06.A01();
        }
        if (!AbstractC43594JPz.A0Q(context).CPp() && context.getExternalFilesDir(null) != null) {
            new C44285Jhb(c44272JhO).A02(new String[0]);
        }
    }
}
