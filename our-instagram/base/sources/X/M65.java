package X;

import android.os.Handler;

/* loaded from: classes8.dex */
public final class M65 implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ AbstractC46515KiE A01;
    public final /* synthetic */ C15100pQ A02;
    public final /* synthetic */ Integer[] A03;

    public M65(Handler handler, AbstractC46515KiE abstractC46515KiE, C15100pQ c15100pQ, Integer[] numArr) {
        this.A01 = abstractC46515KiE;
        this.A03 = numArr;
        this.A02 = c15100pQ;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC46515KiE abstractC46515KiE = this.A01;
        Integer[] numArr = this.A03;
        C15100pQ c15100pQ = this.A02;
        abstractC46515KiE.A01(numArr[c15100pQ.A00]);
        int i = c15100pQ.A00 + 1;
        c15100pQ.A00 = i;
        if (i < numArr.length) {
            this.A00.postDelayed(this, 1000L);
        }
    }
}
