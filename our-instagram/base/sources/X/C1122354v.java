package X;

/* renamed from: X.54v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1122354v extends AbstractC1122454w {
    public static final C1122354v A01 = new C1122354v("");
    public final String A00;

    public static C1122354v A00(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return A01;
        }
        return new C1122354v(str);
    }

    @Override // X.AbstractC911344p
    public final int A03(int i) {
        return C16Y.A01(this.A00);
    }

    @Override // X.AbstractC911344p
    public final String A06() {
        return this.A00;
    }

    @Override // X.AbstractC911344p
    public final String A07() {
        return this.A00;
    }

    @Override // X.AbstractC911344p
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C1122354v)) {
            return false;
        }
        return ((C1122354v) obj).A00.equals(this.A00);
    }

    @Override // X.C54u
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C1122354v(String str) {
        this.A00 = str;
    }
}
