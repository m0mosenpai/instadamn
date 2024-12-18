package X;

import android.os.IBinder;

/* loaded from: classes11.dex */
public final class USR extends AbstractC64090Sz7 {
    public final String A00;
    public final C70011VzW A01;
    public final C68831Vcm A02;

    @Override // X.XD3
    public final /* bridge */ /* synthetic */ Object AE1(IBinder iBinder) {
        String str = this.A00;
        C14360o3.A0B(str, 1);
        throw new C141786av(AnonymousClass001.A0R("Digital turbine client id is not available for this app : ", str));
    }

    public USR(C70011VzW c70011VzW, C68831Vcm c68831Vcm, String str) {
        AbstractC167017dG.A1R(c68831Vcm, c70011VzW);
        this.A00 = str;
        this.A02 = c68831Vcm;
        this.A01 = c70011VzW;
    }
}
