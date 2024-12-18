package X;

import android.os.Process;

/* renamed from: X.4ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100154ed implements InterfaceC100084eW {
    public static C100154ed A03;
    public final C100164ee A02 = new C100164ee(Process.myPid());
    public final C100164ee A01 = new C100164ee();
    public final C100184eg A00 = new C100184eg(Process.myPid());

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "procstat";
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        sn2.A0B = this.A02.A01();
        sn2.A0A = this.A01.A01();
        sn2.A0C = this.A00.A01();
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
        this.A02.A02();
        this.A01.A02();
        this.A00.A02();
    }
}
