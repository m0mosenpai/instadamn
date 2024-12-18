package X;

import java.util.List;

/* renamed from: X.MsP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51694MsP extends C0T6 {
    public static final C51694MsP A04;
    public final MUD A00;
    public final AbstractC53447Nka A01;
    public final List A02;
    public final List A03;

    static {
        NIP nip = NIP.A00;
        C16930sl c16930sl = C16930sl.A00;
        A04 = new C51694MsP(null, nip, c16930sl, c16930sl);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51694MsP) {
                C51694MsP c51694MsP = (C51694MsP) obj;
                if (!C14360o3.A0K(this.A01, c51694MsP.A01) || !C14360o3.A0K(this.A02, c51694MsP.A02) || !C14360o3.A0K(this.A00, c51694MsP.A00) || !C14360o3.A0K(this.A03, c51694MsP.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public C51694MsP(MUD mud, AbstractC53447Nka abstractC53447Nka, List list, List list2) {
        AbstractC167017dG.A1P(abstractC53447Nka, list);
        this.A01 = abstractC53447Nka;
        this.A02 = list;
        this.A00 = mud;
        this.A03 = list2;
    }
}
