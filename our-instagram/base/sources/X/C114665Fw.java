package X;

/* renamed from: X.5Fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114665Fw {
    public C6T7 A00;
    public final C103434lJ A01;
    public final C103434lJ A02;

    public C114665Fw(C103434lJ c103434lJ, String str) {
        this.A02 = c103434lJ;
        if (c103434lJ == null) {
            if (str != null) {
                c103434lJ = IQ3.parseFromJson(C16V.A00(str)).A00;
                if (c103434lJ == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A01 = c103434lJ;
    }

    public C114665Fw() {
        this(null, null);
        throw C00O.createAndThrow();
    }
}
