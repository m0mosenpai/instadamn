package X;

/* renamed from: X.Cp9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28901Cp9 implements InterfaceC30922DiZ {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28901Cp9) && C14360o3.A0K(this.A00, ((C28901Cp9) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("IGTypeface(value=", this.A00);
    }

    public C28901Cp9(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC30922DiZ
    public final String getValue() {
        return this.A00;
    }
}
