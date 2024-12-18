package X;

/* renamed from: X.Wpb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71189Wpb implements Cloneable {
    public Integer A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C71189Wpb c71189Wpb = (C71189Wpb) obj;
            if (this.A00 != c71189Wpb.A00 || this.A01 != c71189Wpb.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * 31;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "DEFAULT";
        } else {
            str = "BGRA";
        }
        return i + str.hashCode() + intValue;
    }

    public final C71189Wpb A00() {
        try {
            return (C71189Wpb) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }
}
