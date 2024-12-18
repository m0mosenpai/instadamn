package X;

/* renamed from: X.XoG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72826XoG {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C72826XoG)) {
            return false;
        }
        C72826XoG c72826XoG = (C72826XoG) obj;
        return this.A00.equals(c72826XoG.A00) && this.A01.equals(c72826XoG.A01);
    }

    public C72826XoG(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
