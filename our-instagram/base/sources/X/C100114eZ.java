package X;

/* renamed from: X.4eZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100114eZ implements InterfaceC100084eW {
    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "swap";
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        if (sn2 instanceof QDM) {
            QDM qdm = (QDM) sn2;
            C0AT.A00();
            long[] jArr = C0AT.A01;
            qdm.A02 = jArr[23];
            qdm.A01 = jArr[24];
            qdm.A00 = jArr[14];
            long[] jArr2 = new long[8];
            C0JC.A02(AbstractC111324zv.A00(1474), jArr2, C0AX.A00);
            qdm.A03 = jArr2[7];
        }
    }
}
