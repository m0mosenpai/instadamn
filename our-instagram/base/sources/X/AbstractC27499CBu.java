package X;

/* renamed from: X.CBu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27499CBu {
    public static final InterfaceC30790DgR A00(C102884kP c102884kP, long j) {
        InterfaceC30790DgR A00;
        int i = c102884kP.A05;
        if (AbstractC167007dF.A1P(i, 16598)) {
            A00 = new C26105Bgp(CXD.A01(c102884kP.A0G(), AbstractC25232BEp.A00(j), AbstractC68291VLd.A00(c102884kP.A0E(), 0.0f, AbstractC25231BEo.A00(j))), AbstractC68291VLd.A00(c102884kP.A0L(38), 0.0f, 0.0f));
        } else if (AbstractC167007dF.A1P(i, 16588)) {
            A00 = new C26107Bgr(AbstractC68291VLd.A00(c102884kP.A0J(), 0.0f, 0.0f), c102884kP.A02(42, 0.0f), c102884kP.A02(40, 0.0f), CXD.A01(c102884kP.A0G(), AbstractC25232BEp.A00(j), AbstractC68291VLd.A00(c102884kP.A0E(), 0.0f, AbstractC25231BEo.A00(j))), c102884kP.A0S(38, true));
        } else if (i == 16597) {
            String A0L = c102884kP.A0L(38);
            float A002 = AbstractC25231BEo.A00(j);
            float A003 = AbstractC68291VLd.A00(A0L, 0.0f, A002);
            String A0L2 = c102884kP.A0L(40);
            float A004 = AbstractC25232BEp.A00(j);
            A00 = new C26108Bgs(CXD.A01(A0L2, A004, A003), CCR.A00(AbstractC68291VLd.A00(c102884kP.A0G(), 0.0f, A002), AbstractC68291VLd.A00(c102884kP.A0E(), 0.0f, A004)), 0);
        } else if (i == 16604) {
            String A0L3 = c102884kP.A0L(38);
            float A005 = AbstractC25231BEo.A00(j);
            float A006 = AbstractC68291VLd.A00(A0L3, 0.0f, A005);
            String A0L4 = c102884kP.A0L(40);
            float A007 = AbstractC25232BEp.A00(j);
            A00 = new C26108Bgs(CXD.A01(A0L4, A007, A006), CXD.A01(c102884kP.A0G(), A007, AbstractC68291VLd.A00(c102884kP.A0E(), 0.0f, A005)), 1);
        } else if (i == 16601) {
            String A0L5 = c102884kP.A0L(40);
            float A008 = AbstractC25231BEo.A00(j);
            float A009 = AbstractC68291VLd.A00(A0L5, 0.0f, A008);
            String A0J = c102884kP.A0J();
            float A0010 = AbstractC25232BEp.A00(j);
            A00 = new C26106Bgq(AbstractC68291VLd.A00(c102884kP.A0E(), 0.0f, 0.0f), CXD.A01(A0J, A0010, A009), CCR.A00(AbstractC25235BEs.A00(c102884kP, A008, 38), AbstractC68291VLd.A00(c102884kP.A0G(), 0.0f, A0010)));
        } else if (i == 16593) {
            A00 = AbstractC27497CBs.A00(c102884kP, j);
        } else {
            throw AbstractC166987dD.A12("Unknown canvas shape.");
        }
        return A00;
    }
}
