package X;

import android.app.Activity;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTZ extends AbstractC55206OeJ {
    public int A00;
    public C51880MwO A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Activity A0F;
    public final ViewGroup A0G;
    public final UserSession A0H;
    public final C17280tP A0I;
    public final C23031Ai A0J;
    public final OI6 A0K;
    public final C55177Odh A0L;
    public final PCT A0M;
    public final C55095Ob6 A0N;
    public final SM4 A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC16820sZ A0X;
    public final boolean A0Y;

    public static void A00(NTZ ntz) {
        if (ntz.A0Y) {
            ((C2UY) ntz.A0W.getValue()).A05(5L);
        }
    }

    public static final void A01(NTZ ntz) {
        InterfaceC57858PlO interfaceC57858PlO;
        C51880MwO c51880MwO = ntz.A01;
        if (c51880MwO != null) {
            C55177Odh c55177Odh = ntz.A0L;
            c55177Odh.A03(new PBX(!c51880MwO.A08));
            if (AbstractC167007dF.A1Z(ntz.A0T)) {
                if (c51880MwO.A08) {
                    interfaceC57858PlO = C56662PDg.A00;
                } else {
                    interfaceC57858PlO = C56663PDh.A00;
                }
                c55177Odh.A06(interfaceC57858PlO, 250L);
            }
            ntz.A0K.A00(new PB9(C05F.A01, null, !c51880MwO.A08, c51880MwO.A04, c51880MwO.A0I));
        }
    }

    public static final void A02(NTZ ntz) {
        InterfaceC57858PlO interfaceC57858PlO;
        C51880MwO c51880MwO = ntz.A01;
        if (c51880MwO != null) {
            C55177Odh c55177Odh = ntz.A0L;
            c55177Odh.A03(new C56621PBr(!c51880MwO.A04));
            if (AbstractC167007dF.A1Z(ntz.A0T)) {
                if (c51880MwO.A04) {
                    interfaceC57858PlO = C56661PDf.A00;
                } else {
                    interfaceC57858PlO = C56664PDi.A00;
                }
                c55177Odh.A06(interfaceC57858PlO, 250L);
            }
            ntz.A0K.A00(new PB9(C05F.A00, null, c51880MwO.A08, !c51880MwO.A04, c51880MwO.A0I));
        }
    }

    public static final void A03(NTZ ntz, String str) {
        Integer num;
        C51880MwO c51880MwO = ntz.A01;
        if (c51880MwO != null) {
            OI6 oi6 = ntz.A0K;
            if (c51880MwO.A0L) {
                num = C05F.A0Y;
            } else {
                num = C05F.A0C;
            }
            oi6.A00(new PB9(num, str, c51880MwO.A08, c51880MwO.A04, !c51880MwO.A0I));
        }
    }

    public static final void A04(NTZ ntz, String str, boolean z, boolean z2) {
        Integer num;
        C51880MwO c51880MwO = ntz.A01;
        if (c51880MwO != null) {
            OI6 oi6 = ntz.A0K;
            if (z) {
                num = C05F.A0Y;
            } else {
                num = C05F.A0j;
            }
            oi6.A00(new PB9(num, str, c51880MwO.A08, c51880MwO.A04, z2));
        }
    }

    public static final boolean A05(NTZ ntz) {
        if (!ntz.A06 && !ntz.A05 && !ntz.A0A && !ntz.A0B && !ntz.A03 && !ntz.A0C && !ntz.A07) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0692, code lost:
    
        if (r3.A0W == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f4, code lost:
    
        if (r4 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0326, code lost:
    
        if (r1.A0S != true) goto L84;
     */
    @Override // X.AbstractC55206OeJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(X.InterfaceC57858PlO r68) {
        /*
            Method dump skipped, instructions count: 2255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NTZ.A0K(X.PlO):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTZ(Activity activity, ViewGroup viewGroup, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, PCT pct, C55095Ob6 c55095Ob6, InterfaceC16820sZ interfaceC16820sZ) {
        super(AbstractC25225BEi.A1D(C51880MwO.class));
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C17280tP A0y = AbstractC166987dD.A0y();
        SM4 sm4 = new SM4(activity);
        AbstractC167017dG.A1T(c55177Odh, oi6);
        AbstractC25234BEr.A0l(7, c55095Ob6, interfaceC16820sZ, A00, A0y);
        this.A0G = viewGroup;
        this.A0F = activity;
        this.A0H = userSession;
        this.A0M = pct;
        this.A0L = c55177Odh;
        this.A0K = oi6;
        this.A0N = c55095Ob6;
        this.A0X = interfaceC16820sZ;
        this.A0J = A00;
        this.A0I = A0y;
        this.A0O = sm4;
        this.A0D = true;
        this.A02 = true;
        this.A0U = C57516Pfq.A00(this, 43);
        this.A0P = C57516Pfq.A00(this, 38);
        this.A0R = C57516Pfq.A00(this, 40);
        this.A0Q = C57516Pfq.A00(this, 39);
        this.A0S = C57516Pfq.A00(this, 41);
        this.A0T = C57516Pfq.A00(this, 42);
        this.A0W = C1XM.A00(C57428PeQ.A00);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0Y = C18U.A06(c06090Tz, userSession, 36317543375312229L) && C18U.A06(c06090Tz, userSession, 36317543375508838L);
        this.A0V = AbstractC09440dt.A01(new C57516Pfq(this, 44));
        PCT pct2 = this.A0M;
        pct2.A05 = new OZT(this);
        pct2.A04 = new C54469O4x(this);
    }
}
