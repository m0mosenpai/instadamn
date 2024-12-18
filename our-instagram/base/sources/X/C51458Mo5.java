package X;

/* renamed from: X.Mo5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51458Mo5 extends AbstractC53422NkB {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51458Mo5) && C14360o3.A0K(this.A00, ((C51458Mo5) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("Unknown(message=", this.A00);
    }

    public C51458Mo5(String str) {
        this.A00 = str;
    }

    public C51458Mo5() {
        this("Unknown");
    }
}
