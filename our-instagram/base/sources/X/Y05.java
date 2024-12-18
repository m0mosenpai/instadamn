package X;

import java.util.HashMap;

/* loaded from: classes12.dex */
public final class Y05 {
    public Xl7 A00;
    public C72863XpS A01;
    public boolean A02;
    public boolean A03;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.XpS] */
    public Y05(Y06 y06) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = false;
        this.A03 = false;
        this.A00 = y06.A00;
        C72863XpS c72863XpS = y06.A01;
        ?? obj = new Object();
        obj.A00 = new HashMap(c72863XpS.A00);
        this.A01 = obj;
        this.A02 = y06.A02;
        this.A03 = y06.A03;
    }

    public Y05() {
        this.A00 = null;
        this.A01 = null;
        this.A02 = false;
        this.A03 = false;
    }
}
