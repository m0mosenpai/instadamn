package X;

/* renamed from: X.KIr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45654KIr extends C4F4 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45654KIr) && C14360o3.A0K(this.A00, ((C45654KIr) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C45654KIr c45654KIr = (C45654KIr) obj;
        String str2 = this.A00;
        if (c45654KIr != null) {
            str = c45654KIr.A00;
        } else {
            str = null;
        }
        return C14360o3.A0K(str2, str);
    }

    public C45654KIr(String str) {
        this.A00 = str;
    }
}
