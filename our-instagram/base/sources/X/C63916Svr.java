package X;

import java.io.BufferedReader;
import java.io.FileReader;

/* renamed from: X.Svr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63916Svr implements InterfaceC100084eW {
    public boolean A00;

    @Override // X.InterfaceC100084eW
    public final String getName() {
        return "memory_pressure";
    }

    @Override // X.InterfaceC100084eW
    public final void update() {
    }

    @Override // X.InterfaceC100084eW
    public final void AGj(SN2 sn2, StackTraceElement[] stackTraceElementArr) {
        if (this.A00 && (sn2 instanceof QDM)) {
            QDM qdm = (QDM) sn2;
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(AbstractC166987dD.A11("/proc/pressure/memory")));
                try {
                    String[] strArr = {bufferedReader.readLine(), bufferedReader.readLine(), bufferedReader.readLine()};
                    bufferedReader.close();
                    qdm.A0E = strArr;
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            } catch (Throwable unused) {
                this.A00 = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r1.canRead() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63916Svr() {
        /*
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "/proc/pressure/memory"
            java.io.File r1 = X.AbstractC166987dD.A11(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L16
            boolean r1 = r1.canRead()
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63916Svr.<init>():void");
    }
}
