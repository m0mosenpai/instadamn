package X;

/* renamed from: X.2fC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54552fC implements InterfaceC54232eZ {
    public final int A00;
    public final EnumC54222eY A01;
    public final String A02;
    public final String A03;

    public C54552fC(EnumC54222eY enumC54222eY, String str) {
        String obj;
        C14360o3.A0B(str, 1);
        this.A01 = enumC54222eY;
        String obj2 = enumC54222eY != null ? enumC54222eY.toString() : null;
        String str2 = "";
        this.A02 = AnonymousClass001.A0T(str, obj2 == null ? "" : obj2, '/');
        if (enumC54222eY != null && (obj = enumC54222eY.toString()) != null) {
            str2 = obj;
        }
        this.A03 = str2;
        this.A00 = (enumC54222eY == null ? EnumC54222eY.A0Z : enumC54222eY).A00;
    }

    @Override // X.InterfaceC54232eZ
    public final boolean Al3() {
        return false;
    }

    @Override // X.InterfaceC54232eZ
    public final String BOr() {
        return this.A03;
    }

    @Override // X.InterfaceC54232eZ
    public final int BZT() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        C54552fC c54552fC;
        if (obj instanceof C54552fC) {
            c54552fC = (C54552fC) obj;
        } else {
            c54552fC = null;
        }
        if (c54552fC == null || !C14360o3.A0K(c54552fC.A02, this.A02) || c54552fC.A00 != this.A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC54232eZ
    public final String getIdentifier() {
        return this.A02;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public final String toString() {
        return this.A02;
    }
}
