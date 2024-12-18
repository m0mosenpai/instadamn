package X;

import android.os.HandlerThread;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PTB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ HandlerThread A01;
    public final /* synthetic */ OF8 A02;
    public final /* synthetic */ Map A03;

    public PTB(HandlerThread handlerThread, OF8 of8, Map map, int i) {
        this.A03 = map;
        this.A02 = of8;
        this.A00 = i;
        this.A01 = handlerThread;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x012a, code lost:
    
        r2 = (android.graphics.Bitmap) r6.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0130, code lost:
    
        if (r2 == null) goto L40;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PTB.run():void");
    }
}
