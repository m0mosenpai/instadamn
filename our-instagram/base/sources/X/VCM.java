package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public class VCM extends IOException {
    public final int A00;
    public final boolean A01;

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.A01);
        sb.append(", dataType=");
        sb.append(this.A00);
        return AbstractC166997dE.A0x("}", sb);
    }

    public VCM(String str, Throwable th, int i, boolean z) {
        super(str, th);
        this.A01 = z;
        this.A00 = i;
    }
}
