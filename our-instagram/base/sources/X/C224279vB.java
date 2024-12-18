package X;

/* renamed from: X.9vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224279vB {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C224279vB c224279vB = (C224279vB) obj;
            if (this.A00 != c224279vB.A00 || this.A01 != c224279vB.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * 31;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "ECHO";
                break;
            case 2:
                str = "DUO";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return i + str.hashCode() + intValue;
    }
}
