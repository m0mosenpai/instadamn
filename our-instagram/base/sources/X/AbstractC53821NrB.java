package X;

/* renamed from: X.NrB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53821NrB {
    public static final Object A00(C6FW c6fw) {
        C102884kP c102884kP;
        InterfaceC41141vN c52620NPt;
        String str = (String) c6fw.A03(0);
        if (str != null && (c102884kP = (C102884kP) c6fw.A02()) != null) {
            Object A00 = c6fw.A00();
            C14360o3.A0C(A00, AbstractC43591JPw.A00(1));
            AbstractC12990ll A0A = C6BQ.A0A((C6FG) A00);
            AbstractC31171DnF.A1Q(A0A);
            boolean A0S = c102884kP.A0S(40, false);
            C25671My A002 = AbstractC25651Mw.A00(A0A);
            if (str.equals("discover.screenshare")) {
                c52620NPt = C52625NPy.A00;
            } else if (str.equals("discover.photobooth")) {
                c52620NPt = C52626NPz.A00;
            } else if (str.equals("discover.reels_together")) {
                c52620NPt = C52624NPx.A00;
            } else if (A0S) {
                c52620NPt = new C52621NPu(str);
            } else {
                c52620NPt = new C52620NPt(AbstractC25227BEk.A0B(str));
            }
            A002.E4s(c52620NPt);
        }
        return null;
    }
}
