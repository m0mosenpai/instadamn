package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.unconnectedcontent.GroupSetBinderGroup;
import java.util.ArrayList;

/* renamed from: X.2yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65992yb {
    public final Context A00;
    public final InterfaceC65642y0 A01;
    public final C65662y2 A02;
    public final C65662y2 A03;
    public final C65662y2 A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C66752zs A07;
    public final C65882yQ A08;
    public final C66622ze A09;
    public final C66052yh A0A;
    public final C66702zn A0B;
    public final C65832yL A0C;
    public final C65672y3 A0D;
    public final C65622xy A0E;
    public final C66032yf A0F;
    public final C65762yE A0G;
    public final C65862yO A0H;
    public final C65812yJ A0I;
    public final C65822yK A0J;
    public final C65872yP A0K;
    public final C66682zl A0L;
    public final C66722zp A0M;
    public final C65972yZ A0N;
    public final C65792yH A0O;
    public final C65192xH A0P;
    public final C66652zh A0Q;
    public final C66662zi A0R;
    public final C66642zg A0S;
    public final C65852yN A0T;
    public final C2y9 A0U;
    public final C66352zC A0V;
    public final C65712y8 A0W;
    public final C66632zf A0X;
    public final C66612zd A0Y;
    public final GroupSetBinderGroup A0Z;
    public final C66342zB A0a;
    public final C66062yi A0b;
    public final C66132yp A0c;
    public final C66002yc A0d;
    public final C65772yF A0e;
    public final C66742zr A0f;
    public final C66732zq A0g;
    public final C66692zm A0h;
    public final C65842yM A0i;
    public final C66012yd A0j;
    public final C66022ye A0k;

    public C65992yb(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C65972yZ c65972yZ, C65192xH c65192xH, C65192xH c65192xH2, C65122xA c65122xA) {
        this.A00 = context;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A0P = c65192xH2;
        this.A0N = c65972yZ;
        C65662y2 c65662y2 = (C65662y2) c65122xA.A0J.getValue();
        this.A02 = c65662y2;
        C65662y2 c65662y22 = (C65662y2) c65122xA.A0Q.getValue();
        this.A04 = c65662y22;
        C65662y2 c65662y23 = (C65662y2) c65122xA.A0K.getValue();
        this.A03 = c65662y23;
        C66002yc c66002yc = (C66002yc) c65122xA.A0Y.getValue();
        this.A0d = c66002yc;
        C66012yd c66012yd = (C66012yd) c65122xA.A0g.getValue();
        this.A0j = c66012yd;
        C66022ye c66022ye = (C66022ye) c65122xA.A0h.getValue();
        this.A0k = c66022ye;
        C66032yf c66032yf = (C66032yf) c65122xA.A0W.getValue();
        this.A0F = c66032yf;
        C66052yh c66052yh = (C66052yh) c65122xA.A0f.getValue();
        this.A0A = c66052yh;
        C66062yi c66062yi = (C66062yi) c65122xA.A0F.getValue();
        this.A0b = c66062yi;
        C66132yp c66132yp = (C66132yp) c65122xA.A0G.getValue();
        this.A0c = c66132yp;
        C65672y3 c65672y3 = (C65672y3) c65122xA.A0E.getValue();
        this.A0D = c65672y3;
        C65622xy c65622xy = (C65622xy) c65122xA.A0D.getValue();
        this.A0E = c65622xy;
        AbstractC65632xz abstractC65632xz = (AbstractC65632xz) c65122xA.A0d.getValue();
        this.A01 = abstractC65632xz;
        C65762yE c65762yE = (C65762yE) c65122xA.A0I.getValue();
        this.A0G = c65762yE;
        C65812yJ c65812yJ = (C65812yJ) c65122xA.A0b.getValue();
        this.A0I = c65812yJ;
        C65822yK c65822yK = (C65822yK) c65122xA.A0H.getValue();
        this.A0J = c65822yK;
        C65832yL c65832yL = (C65832yL) c65122xA.A07.getValue();
        this.A0C = c65832yL;
        C66342zB c66342zB = (C66342zB) c65122xA.A0a.getValue();
        this.A0a = c66342zB;
        C65792yH c65792yH = (C65792yH) c65122xA.A0P.getValue();
        this.A0O = c65792yH;
        C65712y8 c65712y8 = (C65712y8) c65122xA.A0B.getValue();
        this.A0W = c65712y8;
        C2y9 c2y9 = (C2y9) c65122xA.A08.getValue();
        this.A0U = c2y9;
        C66352zC c66352zC = (C66352zC) c65122xA.A09.getValue();
        this.A0V = c66352zC;
        C66612zd c66612zd = (C66612zd) c65122xA.A0A.getValue();
        this.A0Y = c66612zd;
        C66622ze c66622ze = (C66622ze) c65122xA.A0R.getValue();
        this.A09 = c66622ze;
        C66632zf c66632zf = (C66632zf) c65122xA.A0O.getValue();
        this.A0X = c66632zf;
        C66642zg c66642zg = (C66642zg) c65122xA.A04.getValue();
        this.A0S = c66642zg;
        C66652zh c66652zh = (C66652zh) c65122xA.A02.getValue();
        this.A0Q = c66652zh;
        C66662zi c66662zi = (C66662zi) c65122xA.A03.getValue();
        this.A0R = c66662zi;
        GroupSetBinderGroup groupSetBinderGroup = (GroupSetBinderGroup) c65122xA.A0L.getValue();
        this.A0Z = groupSetBinderGroup;
        C65842yM c65842yM = (C65842yM) c65122xA.A0S.getValue();
        this.A0i = c65842yM;
        C66682zl c66682zl = (C66682zl) c65122xA.A0C.getValue();
        this.A0L = c66682zl;
        C66692zm c66692zm = (C66692zm) c65122xA.A0V.getValue();
        this.A0h = c66692zm;
        C65772yF c65772yF = (C65772yF) c65122xA.A0Z.getValue();
        this.A0e = c65772yF;
        C66702zn c66702zn = (C66702zn) c65122xA.A06.getValue();
        this.A0B = c66702zn;
        C66722zp c66722zp = (C66722zp) c65122xA.A0M.getValue();
        this.A0M = c66722zp;
        C66732zq c66732zq = (C66732zq) c65122xA.A0X.getValue();
        this.A0g = c66732zq;
        C66742zr c66742zr = (C66742zr) c65122xA.A0T.getValue();
        this.A0f = c66742zr;
        C65852yN c65852yN = (C65852yN) c65122xA.A0c.getValue();
        this.A0T = c65852yN;
        C65862yO c65862yO = (C65862yO) c65122xA.A0U.getValue();
        this.A0H = c65862yO;
        C65872yP c65872yP = (C65872yP) c65122xA.A0e.getValue();
        this.A0K = c65872yP;
        C65882yQ c65882yQ = (C65882yQ) c65122xA.A05.getValue();
        this.A08 = c65882yQ;
        C66752zs c66752zs = (C66752zs) c65122xA.A0N.getValue();
        this.A07 = c66752zs;
        ArrayList arrayList = new ArrayList();
        if (c65662y2 != null) {
            arrayList.add(c65662y2);
        }
        if (c65662y22 != null) {
            arrayList.add(c65662y22);
        }
        if (c65662y23 != null) {
            arrayList.add(c65662y23);
        }
        if (c66002yc != null) {
            arrayList.add(c66002yc);
        }
        if (c65772yF != null) {
            arrayList.add(c65772yF);
        }
        if (c66062yi != null) {
            arrayList.add(c66062yi);
        }
        if (c66032yf != null) {
            arrayList.add(c66032yf);
        }
        if (c66052yh != null) {
            arrayList.add(c66052yh);
        }
        if (c65672y3 != null) {
            arrayList.add(c65672y3);
        }
        if (abstractC65632xz != null) {
            arrayList.add(abstractC65632xz);
        }
        if (c65762yE != null) {
            arrayList.add(c65762yE);
        }
        if (c65792yH != null) {
            arrayList.add(c65792yH);
        }
        if (c65812yJ != null) {
            arrayList.add(c65812yJ);
        }
        if (c65842yM != null) {
            arrayList.add(c65842yM);
        }
        if (c66682zl != null) {
            arrayList.add(c66682zl);
        }
        if (c66692zm != null) {
            arrayList.add(c66692zm);
        }
        if (c65822yK != null) {
            arrayList.add(c65822yK);
        }
        if (c66132yp != null) {
            arrayList.add(c66132yp);
        }
        if (c65832yL != null) {
            arrayList.add(c65832yL);
        }
        if (c66342zB != null) {
            arrayList.add(c66342zB);
        }
        if (c66012yd != null) {
            arrayList.add(c66012yd);
        }
        if (c66022ye != null) {
            arrayList.add(c66022ye);
        }
        if (c65712y8 != null) {
            arrayList.add(c65712y8);
        }
        if (c66612zd != null) {
            arrayList.add(c66612zd);
        }
        if (c66702zn != null) {
            arrayList.add(c66702zn);
        }
        if (groupSetBinderGroup != null) {
            arrayList.add(groupSetBinderGroup);
        }
        if (c2y9 != null) {
            arrayList.add(c2y9);
        }
        if (c66352zC != null) {
            arrayList.add(c66352zC);
        }
        if (c66722zp != null) {
            arrayList.add(c66722zp);
        }
        if (c66622ze != null) {
            arrayList.add(c66622ze);
        }
        if (c66632zf != null) {
            arrayList.add(c66632zf);
        }
        if (c65622xy != null) {
            arrayList.add(c65622xy);
        }
        if (c66642zg != null) {
            arrayList.add(c66642zg);
        }
        if (c66652zh != null) {
            arrayList.add(c66652zh);
        }
        if (c66662zi != null) {
            arrayList.add(c66662zi);
        }
        if (c66732zq != null) {
            arrayList.add(c66732zq);
        }
        if (c66742zr != null) {
            arrayList.add(c66742zr);
        }
        if (c65852yN != null) {
            arrayList.add(c65852yN);
        }
        if (c65862yO != null) {
            arrayList.add(c65862yO);
        }
        if (c65872yP != null) {
            arrayList.add(c65872yP);
        }
        if (c65882yQ != null) {
            arrayList.add(c65882yQ);
        }
        if (c66752zs != null) {
            arrayList.add(c66752zs);
        }
        c65192xH.init(arrayList);
    }
}
