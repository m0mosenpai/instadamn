package X;

/* renamed from: X.FRf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34718FRf {
    public final InterfaceC37107GWs A00;
    public final String A01;

    public final boolean equals(Object obj) {
        AbstractC34718FRf abstractC34718FRf;
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
            return false;
        }
        InterfaceC37107GWs interfaceC37107GWs = null;
        if (obj instanceof AbstractC34718FRf) {
            abstractC34718FRf = (AbstractC34718FRf) obj;
        } else {
            abstractC34718FRf = null;
        }
        InterfaceC37107GWs interfaceC37107GWs2 = this.A00;
        if (abstractC34718FRf != null) {
            interfaceC37107GWs = abstractC34718FRf.A00;
        }
        return interfaceC37107GWs2 == interfaceC37107GWs;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A00() {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34718FRf.A00():boolean");
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return ((EnumC33522Erv) this.A00).name();
    }

    public AbstractC34718FRf(InterfaceC37107GWs interfaceC37107GWs, String str) {
        this.A00 = interfaceC37107GWs;
        this.A01 = str;
    }
}
