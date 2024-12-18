package X;

import java.util.List;

/* renamed from: X.BjS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26259BjS extends C0T6 implements InterfaceC30892Di5 {
    public final C8JW A00;
    public final C26136BhN A01;
    public final InterfaceC88553xD A02;
    public final List A03;

    public C26259BjS(C8JW c8jw, C26136BhN c26136BhN, InterfaceC88553xD interfaceC88553xD, List list) {
        C14360o3.A0B(list, 2);
        this.A02 = interfaceC88553xD;
        this.A03 = list;
        this.A01 = c26136BhN;
        this.A00 = c8jw;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26259BjS) {
                C26259BjS c26259BjS = (C26259BjS) obj;
                if (!C14360o3.A0K(this.A02, c26259BjS.A02) || !C14360o3.A0K(this.A03, c26259BjS.A03) || !C14360o3.A0K(this.A01, c26259BjS.A01) || this.A00 != c26259BjS.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
    }
}
