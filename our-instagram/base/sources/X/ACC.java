package X;

/* loaded from: classes4.dex */
public final class ACC {
    public final int A00;
    public final String A01;
    public final String A02;

    public ACC(String str, int i, String str2) {
        C14360o3.A0B(str2, 3);
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ACC) && C14360o3.A0K(this.A01, ((ACC) obj).A01)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
