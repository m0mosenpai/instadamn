package X;

/* renamed from: X.Mo4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51457Mo4 extends AbstractC53422NkB {
    public final String A00;

    public C51457Mo4(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51457Mo4) && C14360o3.A0K(this.A00, ((C51457Mo4) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("Network(message=", this.A00);
    }

    public C51457Mo4() {
        this("Unknown");
    }
}
