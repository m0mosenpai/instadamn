package X;

import java.util.List;

/* renamed from: X.Jym, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45146Jym extends C0T6 implements XFT {
    public final List A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45146Jym) {
                C45146Jym c45146Jym = (C45146Jym) obj;
                if (!C14360o3.A0K(this.A00, c45146Jym.A00) || !C14360o3.A0K(this.A01, c45146Jym.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C45146Jym(List list, String str) {
        this.A00 = list;
        this.A01 = str;
    }
}
