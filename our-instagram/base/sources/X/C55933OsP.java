package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.OsP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55933OsP implements InterfaceC26491Qe {
    public C3JQ A00;
    public final File A01;
    public final FileOutputStream A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC24901Jp A05;

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        AbstractC50522MSa.A1X(this.A02, byteBuffer);
    }

    public C55933OsP(C84J c84j, String str, String str2, String str3, InterfaceC24901Jp interfaceC24901Jp) {
        this.A05 = interfaceC24901Jp;
        this.A03 = str2;
        this.A04 = str3;
        File A00 = c84j.A00(str);
        if (!A00.exists()) {
            A00.createNewFile();
        }
        this.A01 = A00;
        this.A02 = MSW.A0x(A00);
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        this.A02.close();
        C3JQ c3jq = this.A00;
        if (c3jq != null && c3jq.A01 == 200) {
            this.A05.EKh(null, AbstractC166987dD.A1L(this.A03, this.A01));
        } else {
            this.A05.resumeWith(AbstractC50523MSb.A0d(MSY.A0X("Unable to synthesize ", this.A04)));
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        this.A02.close();
        InterfaceC24901Jp interfaceC24901Jp = this.A05;
        if (iOException == null) {
            iOException = MSY.A0X("Unable to synthesize ", this.A04);
        }
        interfaceC24901Jp.resumeWith(MSW.A1D(iOException));
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        this.A00 = c3jq;
    }
}
