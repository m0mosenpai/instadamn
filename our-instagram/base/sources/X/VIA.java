package X;

import java.util.Map;

/* loaded from: classes11.dex */
public final class VIA extends Exception {
    public final int A00;
    public final long A01;
    public final Exception A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VIA(Exception exc, String str, Map map, int i, long j, boolean z) {
        super(str, exc);
        AbstractC167007dF.A1I(str, 1, map);
        this.A03 = str;
        this.A01 = j;
        this.A05 = z;
        this.A02 = exc;
        this.A00 = i;
        this.A04 = map;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        String str3 = this.A03;
        if (this.A05) {
            str = " (Cancellation), ";
        } else {
            str = ", ";
        }
        Exception exc = this.A02;
        if (exc != null) {
            str2 = exc.getMessage();
        } else {
            str2 = "None";
        }
        return AnonymousClass001.A11("Failure Reason: ", str3, str, "InnerException: ", str2);
    }
}
