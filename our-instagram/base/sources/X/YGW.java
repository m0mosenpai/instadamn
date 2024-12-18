package X;

import android.view.View;

/* loaded from: classes12.dex */
public final class YGW implements Runnable {
    public final /* synthetic */ C73462YEf A00;

    public YGW(C73462YEf c73462YEf) {
        this.A00 = c73462YEf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C73462YEf c73462YEf = this.A00;
        if (c73462YEf.A02) {
            int B8c = c73462YEf.B8c();
            if (B8c >= 0 && c73462YEf.A00 != B8c) {
                c73462YEf.A04.A00.A0B(c73462YEf);
                c73462YEf.A00 = B8c;
            }
            View view = c73462YEf.A03;
            Runnable runnable = c73462YEf.A01;
            if (runnable == null) {
                C14360o3.A0F("timeRunnable");
                throw C00O.createAndThrow();
            }
            view.postOnAnimation(runnable);
        }
    }
}
