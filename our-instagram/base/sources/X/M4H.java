package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class M4H implements Runnable {
    public final /* synthetic */ L52 A00;
    public final /* synthetic */ MsysThreadId A01;

    public M4H(L52 l52, MsysThreadId msysThreadId) {
        this.A00 = l52;
        this.A01 = msysThreadId;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C165937bL c165937bL = this.A00.A04;
        MsysThreadId msysThreadId = this.A01;
        AbstractC167007dF.A1C(msysThreadId);
        C7W4.A0A(c165937bL.A00, msysThreadId);
    }
}
