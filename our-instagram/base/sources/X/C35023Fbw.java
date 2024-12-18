package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.Fbw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35023Fbw {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public boolean A05 = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35023Fbw)) {
            return false;
        }
        C35023Fbw c35023Fbw = (C35023Fbw) obj;
        return this.A05 == c35023Fbw.A05 && AbstractC50102Ry.A00(this.A01, c35023Fbw.A01) && AbstractC50102Ry.A00(this.A02, c35023Fbw.A02) && AbstractC50102Ry.A00(this.A04, c35023Fbw.A04) && AbstractC50102Ry.A00(this.A03, c35023Fbw.A03) && AbstractC50102Ry.A00(this.A00, c35023Fbw.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A04});
    }

    public static C35023Fbw parseFromJson(C16L c16l) {
        return F12.parseFromJson(c16l);
    }
}
