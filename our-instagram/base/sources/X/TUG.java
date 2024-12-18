package X;

import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TUG implements Callable {
    public final /* synthetic */ C63Q A00;
    public final /* synthetic */ C60921Rbb A01;
    public final /* synthetic */ String A02;

    public TUG(C63Q c63q, C60921Rbb c60921Rbb, String str) {
        this.A02 = str;
        this.A01 = c60921Rbb;
        this.A00 = c63q;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str = this.A02;
        String A0R = AnonymousClass001.A0R("syncFetchResponseForKey:", str);
        C60921Rbb c60921Rbb = this.A01;
        C63Q c63q = this.A00;
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryDiskCache", A0R, ':'));
            C63C c63c = c63q.A03;
            c60921Rbb.A00("io_read_start", c63c.currentMonotonicTimestamp());
            byte[] readResourceToMemory = c63q.A01.A00.readResourceToMemory(str);
            c60921Rbb.A00("io_read_end", c63c.currentMonotonicTimestamp());
            return readResourceToMemory;
        } finally {
            C1LN.A00();
        }
    }
}
