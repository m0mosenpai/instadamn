package X;

/* renamed from: X.KIs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45655KIs extends C4F4 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45655KIs) && C14360o3.A0K(this.A00, ((C45655KIs) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C45655KIs c45655KIs = (C45655KIs) obj;
        String str2 = this.A00;
        if (c45655KIs != null) {
            str = c45655KIs.A00;
        } else {
            str = null;
        }
        return C14360o3.A0K(str2, str);
    }

    public C45655KIs(String str) {
        this.A00 = str;
    }
}
