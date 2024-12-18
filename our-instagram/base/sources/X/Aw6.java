package X;

import android.content.Context;

/* loaded from: classes4.dex */
public final class Aw6 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public Aw6(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9GR.A03(this.A00, this.A01, "prepopulate_audio_error", 0);
    }
}
