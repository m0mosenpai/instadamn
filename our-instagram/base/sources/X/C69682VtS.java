package X;

import androidx.media3.common.util.Util;

/* renamed from: X.VtS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69682VtS {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C69682VtS c69682VtS = (C69682VtS) obj;
            if (!Util.A0F(this.A00, c69682VtS.A00) || !Util.A0F(this.A01, c69682VtS.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + AbstractC31177DnL.A04(this.A00);
    }

    public C69682VtS(String str, String str2) {
        this.A00 = Util.A0A(str);
        this.A01 = str2;
    }
}
