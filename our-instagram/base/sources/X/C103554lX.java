package X;

/* renamed from: X.4lX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103554lX extends C0T6 implements InterfaceC103564lY {
    public final String A00;
    public final String A01;
    public final String A02;

    public C103554lX(String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C103554lX) {
                C103554lX c103554lX = (C103554lX) obj;
                if (!C14360o3.A0K(this.A02, c103554lX.A02) || !C14360o3.A0K(this.A00, c103554lX.A00) || !C14360o3.A0K(this.A01, c103554lX.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }
}
