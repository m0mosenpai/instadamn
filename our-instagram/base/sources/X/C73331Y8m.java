package X;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Y8m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73331Y8m implements YQ8 {
    public long A00;
    public final WRB A01;
    public final HashMap A02;

    public C73331Y8m() {
        WRB wrb = new WRB();
        AnonymousClass001.A0g("bufferForPlaybackMs", " cannot be less than ", "0");
        AnonymousClass001.A0g("bufferForPlaybackAfterRebufferMs", " cannot be less than ", "0");
        AnonymousClass001.A0g("minBufferMs", " cannot be less than ", "bufferForPlaybackMs");
        AnonymousClass001.A0g("minBufferMs", " cannot be less than ", "bufferForPlaybackAfterRebufferMs");
        AnonymousClass001.A0g("maxBufferMs", " cannot be less than ", "minBufferMs");
        AnonymousClass001.A0g("backBufferDurationMs", " cannot be less than ", "0");
        this.A01 = wrb;
        this.A02 = AbstractC166987dD.A1G();
        this.A00 = -1L;
    }

    public static void A00(C73331Y8m c73331Y8m) {
        HashMap hashMap = c73331Y8m.A02;
        boolean isEmpty = hashMap.isEmpty();
        WRB wrb = c73331Y8m.A01;
        if (isEmpty) {
            synchronized (wrb) {
                wrb.A00(0);
            }
            return;
        }
        Iterator A0k = AbstractC167007dF.A0k(hashMap);
        int i = 0;
        while (A0k.hasNext()) {
            i += ((C72662Xkd) A0k.next()).A00;
        }
        wrb.A00(i);
    }
}
