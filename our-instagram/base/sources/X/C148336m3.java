package X;

/* renamed from: X.6m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148336m3 extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public static final C168157fA A04 = new Object();
    public static final C12550kz A03 = new C12550kz(5);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C148336m3(String str, int i) {
        this(C168157fA.A02(str), str, i);
        C14360o3.A0B(str, 1);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C148336m3) && C14360o3.A0K(this.A02, ((C148336m3) obj).A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public C148336m3(String str, String str2, int i) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
