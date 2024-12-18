package X;

/* renamed from: X.Nng, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53635Nng {
    public final C51020MgS A00() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52839NZw) {
            interfaceC09390do = ((C52839NZw) this).A00;
        } else {
            interfaceC09390do = ((C52838NZv) this).A00;
        }
        return (C51020MgS) interfaceC09390do.getValue();
    }

    public final void A01() {
        C51020MgS A00 = A00();
        if (A00.A02 == EnumC142806cg.A03) {
            AbstractC166997dE.A1Y(A00.A0A.A0H, true);
        }
        C55072OaS c55072OaS = A00.A08.A00;
        OFE ofe = c55072OaS.A00;
        if (ofe != null && ofe.A01) {
            C25671My A002 = AbstractC25651Mw.A00(ofe.A02);
            A002.A02(ofe.A04, NYE.class);
            A002.A02(ofe.A07, NYI.class);
            A002.A02(ofe.A06, NYH.class);
            A002.A02(ofe.A05, NYG.class);
            ofe.A01 = false;
        }
        c55072OaS.A00 = null;
        AnonymousClass195 anonymousClass195 = A00.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        A00.A00 = null;
        A00.A09.A00.Egh(null);
        AnonymousClass195 anonymousClass1952 = A00.A01;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        A00.A01 = null;
    }
}
