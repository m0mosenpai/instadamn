package X;

/* renamed from: X.MxW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51949MxW extends C0T6 implements InterfaceC30853DhS {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51949MxW) && C14360o3.A0K(this.A00, ((C51949MxW) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("OpenUserProfile(userId=", this.A00);
    }

    public C51949MxW(String str) {
        this.A00 = str;
    }
}
