package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.OsR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55935OsR implements InterfaceC26491Qe {
    public C3JQ A00;
    public final File A01;
    public final FileOutputStream A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC24901Jp A07;

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        AbstractC50522MSa.A1X(this.A02, byteBuffer);
    }

    public C55935OsR(File file, String str, String str2, String str3, InterfaceC24901Jp interfaceC24901Jp, int i) {
        this.A07 = interfaceC24901Jp;
        this.A03 = i;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A01 = file;
        this.A02 = MSW.A0x(file);
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        this.A02.close();
        C3JQ c3jq = this.A00;
        if (c3jq != null && c3jq.A01 == 200) {
            this.A07.EKh(null, new C211729Zg(AbstractC43592JPx.A0x(this.A01), this.A04, this.A05, this.A03));
            return;
        }
        this.A07.resumeWith(AbstractC50523MSb.A0d(MSY.A0X("Unable to download ", this.A06)));
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        this.A02.close();
        InterfaceC24901Jp interfaceC24901Jp = this.A07;
        if (iOException == null) {
            iOException = MSY.A0X("Unable to download ", this.A06);
        }
        interfaceC24901Jp.resumeWith(MSW.A1D(iOException));
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        this.A00 = c3jq;
    }
}
