package X;

import java.util.Arrays;

/* renamed from: X.8yU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203128yU {
    public String A00;
    public C203118yT A01;
    public C203138yV A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C203128yU)) {
            return false;
        }
        C203128yU c203128yU = (C203128yU) obj;
        if (!this.A01.equals(c203128yU.A01) || !this.A00.equals(c203128yU.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A01, this.A00});
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8yV, java.lang.Object] */
    public C203128yU(String str, C203118yT c203118yT) {
        this.A01 = c203118yT;
        this.A00 = str;
        ?? obj = new Object();
        obj.A01 = "2";
        obj.A00 = "2";
        this.A02 = obj;
    }

    public C203128yU() {
        this("", new C203118yT());
    }
}
