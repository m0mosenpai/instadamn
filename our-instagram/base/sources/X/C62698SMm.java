package X;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.SMm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62698SMm {
    public Executor A00;
    public Executor A01;
    public String A02;
    public final List A04 = AbstractC58322PtE.A0z();
    public final List A05 = AbstractC58322PtE.A0z();
    public final List A07 = AbstractC58322PtE.A0z();
    public final List A06 = AbstractC58322PtE.A0z();
    public final List A03 = AbstractC58322PtE.A0z();

    public final synchronized void A00(String str) {
        String str2;
        if (!AbstractC116315Ok.A00(str) && ((str2 = this.A02) == null || !str2.equals(str))) {
            this.A02 = str;
            this.A00.execute(new TJX(this));
        }
    }

    public C62698SMm(Executor executor, Executor executor2) {
        this.A00 = executor;
        this.A01 = executor2;
    }
}
