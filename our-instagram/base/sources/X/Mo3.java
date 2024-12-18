package X;

/* loaded from: classes9.dex */
public final class Mo3 extends AbstractC53422NkB {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Mo3) && C14360o3.A0K(this.A00, ((Mo3) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("InvalidResponse(message=", this.A00);
    }

    public Mo3(String str) {
        this.A00 = str;
    }

    public Mo3() {
        this("Unknown");
    }
}
