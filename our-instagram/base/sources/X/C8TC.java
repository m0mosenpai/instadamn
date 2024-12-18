package X;

/* renamed from: X.8TC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TC extends C8T9 {
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8TC) {
                C8TC c8tc = (C8TC) obj;
                if (this.A01 != c8tc.A01 || this.A00 != c8tc.A00 || !C14360o3.A0K(this.A02, c8tc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A01 * 31) + this.A00) * 31;
        String str = this.A02;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TextToSpeechSelector(selectedRow=");
        sb.append(this.A01);
        sb.append(", selectedIndex=");
        sb.append(this.A00);
        sb.append(", selectedVoiceName=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C8TC(int i, int i2, String str) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }
}
