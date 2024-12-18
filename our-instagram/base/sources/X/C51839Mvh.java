package X;

import java.util.List;

/* renamed from: X.Mvh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51839Mvh extends C0T6 implements InterfaceC58251Prv {
    public final C51591Mqj A00;
    public final C38595Gxy A01;
    public final C51596Mqo A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51839Mvh) {
                C51839Mvh c51839Mvh = (C51839Mvh) obj;
                if (!C14360o3.A0K(this.A03, c51839Mvh.A03) || !C14360o3.A0K(this.A01, c51839Mvh.A01) || !C14360o3.A0K(this.A00, c51839Mvh.A00) || !C14360o3.A0K(this.A02, c51839Mvh.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C51839Mvh(C51591Mqj c51591Mqj, C38595Gxy c38595Gxy, C51596Mqo c51596Mqo, List list) {
        this.A03 = list;
        this.A01 = c38595Gxy;
        this.A00 = c51591Mqj;
        this.A02 = c51596Mqo;
    }
}
