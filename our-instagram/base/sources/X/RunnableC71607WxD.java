package X;

import java.util.Iterator;

/* renamed from: X.WxD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71607WxD implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C4RW A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public RunnableC71607WxD(C4RW c4rw, String str, byte[] bArr, long j, long j2) {
        this.A02 = c4rw;
        this.A04 = bArr;
        this.A03 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DPK(this.A03, this.A04, this.A00, this.A01);
        }
    }
}
