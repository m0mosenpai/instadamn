package X;

import com.instagram.igsignals.core.IgSignalsPredictor$Metadata$Companion;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WD2 {
    public static final IgSignalsPredictor$Metadata$Companion Companion = new Object();
    public final long A00;
    public final String A01;
    public final String A02;

    public WD2(String str, String str2, long j) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }

    public final String A00() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02);
        sb.append('_');
        sb.append(this.A00);
        sb.append('_');
        return AbstractC166997dE.A0x(this.A01, sb);
    }

    public /* synthetic */ WD2(int i, String str, String str2, long j) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71742X0h.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }
}
