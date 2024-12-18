package X;

import java.io.File;

/* loaded from: classes9.dex */
public final class NFR extends C2AH {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C1Q0 A01;

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C14360o3.A0B(exc, 0);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("fail: ");
        A1C.append(exc);
        C0K8.A0C("SelfVideoDownloadManager", MSX.A0l(A1C, ' '));
    }

    public NFR(C38321qM c38321qM, C1Q0 c1q0) {
        this.A01 = c1q0;
        this.A00 = c38321qM;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File file = (File) obj;
        C14360o3.A0B(file, 0);
        if (file.renameTo(MSW.A0w(this.A01.A01, AnonymousClass001.A0R(this.A00.getId(), ".mp4")))) {
            C1Q3.A01();
        }
    }
}
