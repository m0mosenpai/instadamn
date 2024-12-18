package X;

/* renamed from: X.4eY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100104eY implements InterfaceC100084eW {
    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "heap";
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        sn2.A08 = Runtime.getRuntime().totalMemory();
        sn2.A03 = Runtime.getRuntime().freeMemory();
        sn2.A07 = Runtime.getRuntime().maxMemory();
    }
}
