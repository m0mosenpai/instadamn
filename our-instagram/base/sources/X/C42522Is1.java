package X;

/* renamed from: X.Is1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42522Is1 implements InterfaceC73233Pz {
    public C103464lM A00;
    public final QIy A01;

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0x;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return (Integer) this.A01.A01;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return (InterfaceC39571se) this.A01.A02;
    }

    @Override // X.InterfaceC73233Pz
    public final /* synthetic */ Integer BWa() {
        return null;
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A01.A06;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return (Integer) this.A01.A04;
    }

    @Override // X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A01.A05;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4lM, java.lang.Object] */
    public C42522Is1(QIy qIy) {
        String str;
        this.A01 = qIy;
        String str2 = qIy.A05;
        if (str2 != null) {
            C103434lJ c103434lJ = (C103434lJ) qIy.A03;
            if (c103434lJ == null) {
                C914346k c914346k = (C914346k) qIy.A00;
                if (c914346k != null && (str = c914346k.A01) != null) {
                    c103434lJ = AbstractC102744kB.A01(str);
                } else {
                    c103434lJ = null;
                }
            }
            String str3 = qIy.A06;
            ?? obj = new Object();
            obj.A06 = str2;
            obj.A08 = str3;
            obj.A02 = c103434lJ;
            this.A00 = obj;
        }
    }
}
