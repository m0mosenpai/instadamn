package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LmV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49043LmV implements InterfaceC164937Zi, InterfaceC165237aC, InterfaceC165307aJ, InterfaceC165487ab, InterfaceC165557ai, InterfaceC165617ao, InterfaceC165627ap, InterfaceC165807b7, C7b9 {
    public MessageIdentifier A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C162507Pn A06;
    public final C47556KzR A07;
    public final C164357Wy A08;
    public final L4A A09;
    public final L4A A0A;
    public final L4A A0B;
    public final L4A A0C;
    public final L4A A0D;
    public final L4A A0E;
    public final L4A A0F;
    public final C163867Va A0G;
    public final C47353Kw2 A0H;
    public final LEK A0I;
    public final InterfaceC165257aE A0J;
    public final InterfaceC165567aj A0K;
    public final InterfaceC165577ak A0L;
    public final InterfaceC164877Za A0M;
    public final C7W6 A0N;
    public final InterfaceC165097Zy A0O;
    public final InterfaceC164907Zd A0P;
    public final C7Ze A0Q;
    public final InterfaceC165017Zq A0R;
    public final InterfaceC165427aV A0S;
    public final InterfaceC165767b3 A0T;
    public final InterfaceC164347Wx A0U;
    public final C7W7 A0V;
    public final InterfaceC165477aa A0W;
    public final InterfaceC165127a1 A0X;
    public final InterfaceC165777b4 A0Y;
    public final InterfaceC165787b5 A0Z;
    public final InterfaceC165797b6 A0a;
    public final InterfaceC165497ac A0b;
    public final InterfaceC165177a6 A0c;
    public final C7XS A0d;
    public final InterfaceC165137a2 A0e;
    public final InterfaceC165087Zx A0f;
    public final InterfaceC165207a9 A0g;
    public final InterfaceC163877Vb A0h;
    public final InterfaceC165217aA A0i;
    public final InterfaceC165227aB A0j;
    public final InterfaceC164997Zo A0k;
    public final C47651L2k A0l;
    public final C47568Kze A0m;
    public final L3U A0n;
    public final C159497Dk A0o;
    public final C159497Dk A0p;
    public final L3V A0q;
    public final C48261LXk A0r;
    public final InterfaceC08830cm A0s;
    public final InterfaceC08830cm A0t;
    public final InterfaceC08830cm A0u;
    public final InterfaceC16820sZ A0v;
    public final InterfaceC16820sZ A0w;
    public final InterfaceC16820sZ A0x;
    public final InterfaceC16820sZ A0y;
    public final InterfaceC16820sZ A0z;
    public final InterfaceC16820sZ A10;

    @Override // X.InterfaceC165237aC
    public final void AIP(C31230DoD c31230DoD) {
        C14360o3.A0B(c31230DoD, 0);
        if (AbstractC43593JPy.A0Z(this.A0s).CMv(c31230DoD)) {
            this.A08.A00(false);
        }
    }

    @Override // X.InterfaceC164937Zi
    public final void AOf() {
        C18950wb c18950wb;
        String str;
        InterfaceC08830cm interfaceC08830cm = this.A0s;
        HashSet Aim = AbstractC43593JPy.A0Z(interfaceC08830cm).Aim();
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = Aim.iterator();
        while (it.hasNext()) {
            MessageIdentifier messageIdentifier = (MessageIdentifier) it.next();
            A1E.add(messageIdentifier.A01);
            String A00 = messageIdentifier.A00();
            if (A00 != null) {
                A1E2.add(A00);
            }
        }
        if (!A1E.isEmpty() && !A1E2.isEmpty()) {
            if (A1E.size() != A1E2.size()) {
                c18950wb = C18950wb.A01;
                str = "deleteMessages - messageIds and messageClientContexts not the same size";
            } else {
                C50372MLz c50372MLz = new C50372MLz(42, A1E, this, Aim, A1E2);
                C2056398n A002 = AbstractC2056298m.A00(this.A05);
                if (AbstractC43594JPz.A0B(A002, A002.A08, C2056398n.A0d, 23) < 3) {
                    Activity activity = this.A03;
                    C193328hC A0H = AbstractC31171DnF.A0H(activity);
                    A0H.A0A(2131959021);
                    A0H.A09(2131959020);
                    A0H.A0Z(new DialogInterfaceOnClickListenerC48021LMq(14, c50372MLz, this), EnumC193348hE.A06, AbstractC31177DnL.A0b(activity, Integer.valueOf(AbstractC43593JPy.A0Z(interfaceC08830cm).Ail()), 2131959018), true);
                    A0H.A0D(DialogInterfaceOnClickListenerC48023LMs.A00(this, 47));
                    AbstractC166987dD.A1W(A0H);
                    return;
                }
                c50372MLz.invoke(false);
                return;
            }
        } else {
            c18950wb = C18950wb.A01;
            str = "deleteMessages - messageIds or messageClientContexts empty";
        }
        AbstractC166987dD.A1T(c18950wb, str, 20134884);
    }

    @Override // X.InterfaceC164937Zi
    public final void ASp(MessageIdentifier messageIdentifier) {
        this.A02 = true;
        this.A00 = messageIdentifier;
        A00();
    }

    @Override // X.InterfaceC164937Zi
    public final void ATg(boolean z) {
        String str;
        if (z) {
            UserSession userSession = this.A05;
            C3o9 c3o9 = (C3o9) AbstractC31172DnG.A0y(this.A0t);
            MessageIdentifier messageIdentifier = this.A00;
            if (messageIdentifier != null) {
                str = messageIdentifier.A01;
            } else {
                str = null;
            }
            C162337Ov.A0k(userSession, c3o9, str, false);
        }
        this.A02 = false;
        this.A01 = false;
        this.A00 = null;
        if (this.A0b.CQu()) {
            InterfaceC08830cm interfaceC08830cm = this.A0s;
            InterfaceC163557Ts A0Z = AbstractC43593JPy.A0Z(interfaceC08830cm);
            A0Z.EQd(null, false);
            A01(this, A0Z, interfaceC08830cm, new C37059GUt(A0Z, 28), false);
        }
    }

    @Override // X.InterfaceC165237aC
    public final void ATq(C31230DoD c31230DoD, boolean z) {
        C14360o3.A0B(c31230DoD, 0);
        C7U0 c7u0 = (C7U0) this.A0s.get();
        if (c7u0.BT6().ElZ(c31230DoD, z)) {
            this.A08.A00(false);
        }
        List list = (List) c31230DoD.A02;
        if (AbstractC166987dD.A1b(list) && ((C160787Im) list.get(0)).A0Y) {
            c7u0.C78().EI8(JRE.A01((C3o9) this.A0t.get()));
        }
    }

    @Override // X.InterfaceC165617ao
    public final void CKR(String str) {
        C14360o3.A0B(str, 0);
        C7U0 c7u0 = (C7U0) this.A0s.get();
        String C7I = c7u0.C7r().C7I();
        if (C7I != null) {
            c7u0.C78().EpG(C7I, str);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC164937Zi
    public final void DSy() {
        this.A01 = true;
        A00();
    }

    @Override // X.InterfaceC165487ab
    public final void EL2(MessageIdentifier messageIdentifier) {
        C14360o3.A0B(messageIdentifier, 0);
        String str = messageIdentifier.A01;
        C7U0 c7u0 = (C7U0) this.A0s.get();
        if (c7u0.C7r().CeQ()) {
            EnumC2054697t enumC2054697t = EnumC2054697t.A0c;
            if (!c7u0.AHB(enumC2054697t)) {
                AbstractC34074F2c.A00(enumC2054697t);
            }
            String EL1 = c7u0.EL1(str);
            if (EL1 != null) {
                ((View) this.A0x.invoke()).announceForAccessibility(EL1);
            }
        }
    }

    @Override // X.C7b9
    public final void EMZ(String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 0);
        AnonymousClass983 anonymousClass983 = this.A0G.A00;
        AnonymousClass983.A06(anonymousClass983).A19();
        C159737El A06 = AnonymousClass983.A06(anonymousClass983);
        if (AbstractC167007dF.A1Z(A06.A0Z.A0G)) {
            if (z) {
                str2 = "stickers";
            } else {
                str2 = "gifs";
            }
            A06.A1O(EnumC46186KcO.A09, str2, str);
        }
    }

    private final void A00() {
        if (this.A02 && this.A01 && !this.A0b.CQu()) {
            InterfaceC08830cm interfaceC08830cm = this.A0s;
            InterfaceC163557Ts A0Z = AbstractC43593JPy.A0Z(interfaceC08830cm);
            A0Z.EQd(new C50357MLj(this, 49), true);
            A01(this, A0Z, interfaceC08830cm, new MHU(12, A0Z, this), true);
        }
    }

    @Override // X.InterfaceC165557ai
    public final void AKy(MessageIdentifier messageIdentifier) {
        String Arm = AbstractC43593JPy.A0Z(this.A0s).Arm(messageIdentifier);
        Activity activity = this.A03;
        AbstractC13900nG.A00(activity, Arm);
        C9GR.A07(activity, 2131956830);
    }

    @Override // X.InterfaceC165627ap
    public final void CMk(String str) {
        ((C7U0) this.A0s.get()).CMk(str);
    }

    public static void A01(C49043LmV c49043LmV, InterfaceC163557Ts interfaceC163557Ts, InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        interfaceC163557Ts.AC2(interfaceC16820sZ);
        ((C7U0) interfaceC08830cm.get()).BDF().D0c(z);
        c49043LmV.A0v.invoke();
        AnonymousClass983.A01(c49043LmV.A0G.A00).A0Q();
        ((C7Z7) c49043LmV.A0H.A00.A0k.getValue()).A01();
    }

    @Override // X.InterfaceC165807b7
    public final void ELm(MessageIdentifier messageIdentifier, String str) {
        C41761wQ A0S = AbstractC31174DnI.A0S();
        A0S.A02(AbstractC43592JPx.A0R(((C7U0) this.A0s.get()).E5m(messageIdentifier)), new C44109JeZ(9, this, A0S));
    }

    public /* synthetic */ C49043LmV(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47556KzR c47556KzR, C164357Wy c164357Wy, L4A l4a, L4A l4a2, L4A l4a3, L4A l4a4, L4A l4a5, L4A l4a6, L4A l4a7, C163867Va c163867Va, C47353Kw2 c47353Kw2, LEK lek, InterfaceC165257aE interfaceC165257aE, InterfaceC165567aj interfaceC165567aj, InterfaceC165577ak interfaceC165577ak, InterfaceC164877Za interfaceC164877Za, C7W6 c7w6, InterfaceC165097Zy interfaceC165097Zy, InterfaceC164907Zd interfaceC164907Zd, C7Ze c7Ze, InterfaceC165017Zq interfaceC165017Zq, InterfaceC165427aV interfaceC165427aV, InterfaceC165767b3 interfaceC165767b3, InterfaceC164347Wx interfaceC164347Wx, C7W7 c7w7, InterfaceC165477aa interfaceC165477aa, InterfaceC165127a1 interfaceC165127a1, InterfaceC165777b4 interfaceC165777b4, InterfaceC165787b5 interfaceC165787b5, InterfaceC165797b6 interfaceC165797b6, InterfaceC165497ac interfaceC165497ac, InterfaceC165177a6 interfaceC165177a6, C7XS c7xs, InterfaceC165137a2 interfaceC165137a2, InterfaceC165087Zx interfaceC165087Zx, InterfaceC165207a9 interfaceC165207a9, InterfaceC163877Vb interfaceC163877Vb, InterfaceC165217aA interfaceC165217aA, InterfaceC165227aB interfaceC165227aB, InterfaceC164997Zo interfaceC164997Zo, C47651L2k c47651L2k, C47568Kze c47568Kze, L3U l3u, C159497Dk c159497Dk, C159497Dk c159497Dk2, L3V l3v, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16820sZ interfaceC16820sZ6) {
        C162507Pn c162507Pn = new C162507Pn(userSession);
        C14360o3.A0B(interfaceC08830cm, 4);
        AbstractC167017dG.A1T(interfaceC08830cm2, lek);
        AbstractC25229BEm.A1J(interfaceC16820sZ, 8, interfaceC16820sZ2);
        AbstractC25229BEm.A1L(interfaceC16820sZ3, 11, interfaceC16820sZ4);
        AbstractC25229BEm.A1O(c7xs, 13, interfaceC165777b4);
        C14360o3.A0B(interfaceC165797b6, 16);
        C14360o3.A0B(interfaceC164997Zo, 17);
        JQ0.A0u(21, interfaceC165227aB, interfaceC165017Zq, interfaceC165137a2, interfaceC165477aa);
        C14360o3.A0B(interfaceC165127a1, 25);
        C14360o3.A0B(interfaceC165177a6, 26);
        C14360o3.A0B(c159497Dk, 27);
        C14360o3.A0B(c159497Dk2, 28);
        C14360o3.A0B(interfaceC165787b5, 29);
        C14360o3.A0B(interfaceC164877Za, 30);
        C14360o3.A0B(interfaceC165207a9, 31);
        C14360o3.A0B(interfaceC165257aE, 32);
        C14360o3.A0B(interfaceC164347Wx, 34);
        C14360o3.A0B(c164357Wy, 35);
        C14360o3.A0B(interfaceC165097Zy, 36);
        C14360o3.A0B(interfaceC165567aj, 38);
        C14360o3.A0B(interfaceC165087Zx, 40);
        C14360o3.A0B(interfaceC164907Zd, 41);
        C14360o3.A0B(interfaceC165217aA, 43);
        C14360o3.A0B(interfaceC16820sZ5, 49);
        C14360o3.A0B(c7Ze, 52);
        C14360o3.A0B(interfaceC16820sZ6, 55);
        C14360o3.A0B(interfaceC165497ac, 56);
        C14360o3.A0B(interfaceC165767b3, 59);
        this.A05 = userSession;
        this.A03 = activity;
        this.A04 = interfaceC11380iw;
        this.A0s = interfaceC08830cm;
        this.A0t = interfaceC08830cm2;
        this.A0I = lek;
        this.A0u = interfaceC08830cm3;
        this.A0x = interfaceC16820sZ;
        this.A0G = c163867Va;
        this.A0w = interfaceC16820sZ2;
        this.A0y = interfaceC16820sZ3;
        this.A0z = interfaceC16820sZ4;
        this.A0d = c7xs;
        this.A0h = interfaceC163877Vb;
        this.A0Y = interfaceC165777b4;
        this.A0a = interfaceC165797b6;
        this.A0k = interfaceC164997Zo;
        this.A0C = l4a;
        this.A0E = l4a2;
        this.A0B = l4a3;
        this.A0j = interfaceC165227aB;
        this.A0R = interfaceC165017Zq;
        this.A0e = interfaceC165137a2;
        this.A0W = interfaceC165477aa;
        this.A0X = interfaceC165127a1;
        this.A0c = interfaceC165177a6;
        this.A0o = c159497Dk;
        this.A0p = c159497Dk2;
        this.A0Z = interfaceC165787b5;
        this.A0M = interfaceC164877Za;
        this.A0g = interfaceC165207a9;
        this.A0J = interfaceC165257aE;
        this.A0N = c7w6;
        this.A0U = interfaceC164347Wx;
        this.A08 = c164357Wy;
        this.A0O = interfaceC165097Zy;
        this.A0V = c7w7;
        this.A0K = interfaceC165567aj;
        this.A0l = c47651L2k;
        this.A0f = interfaceC165087Zx;
        this.A0P = interfaceC164907Zd;
        this.A0A = l4a4;
        this.A0i = interfaceC165217aA;
        this.A0n = l3u;
        this.A0L = interfaceC165577ak;
        this.A0m = c47568Kze;
        this.A0S = interfaceC165427aV;
        this.A0D = l4a5;
        this.A0v = interfaceC16820sZ5;
        this.A0H = c47353Kw2;
        this.A06 = c162507Pn;
        this.A0Q = c7Ze;
        this.A07 = c47556KzR;
        this.A0q = l3v;
        this.A10 = interfaceC16820sZ6;
        this.A0b = interfaceC165497ac;
        this.A0F = l4a6;
        this.A09 = l4a7;
        this.A0T = interfaceC165767b3;
        this.A0r = new C48261LXk(activity, null, userSession, new LnX(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c9, code lost:
    
        if (X.AbstractC31176DnK.A0X(r3).CX1() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0107, code lost:
    
        if (X.C18U.A06(r6, r8, 36316473928716707L) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x065c, code lost:
    
        if (r4 != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0662, code lost:
    
        if (r7 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0664, code lost:
    
        r0 = r7.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0666, code lost:
    
        if (r0 == null) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0668, code lost:
    
        r27 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0670, code lost:
    
        if ((r119 instanceof X.C7QY) == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0672, code lost:
    
        r26 = ((X.C7QY) r119).A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x067a, code lost:
    
        r4 = new X.C47794L9b(r8);
        r0 = X.AbstractC31176DnK.A0X(r3).C7I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0687, code lost:
    
        if (r0 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0689, code lost:
    
        r82 = X.AbstractC34774FTx.A00(X.AbstractC43594JPz.A0d(r8, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0691, code lost:
    
        r83 = r119.Ar9();
        r9 = r119.BSy().A01;
        r0 = (X.C3o9) r13.get();
        r86 = r119.BSy().A00();
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x06aa, code lost:
    
        if (r7 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x06ac, code lost:
    
        r3 = r7.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x06ae, code lost:
    
        if (r3 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x06b0, code lost:
    
        r3 = r3.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x06b2, code lost:
    
        r4.A01(r82, r83, r0, r9, r86, X.AbstractC46830KnP.A00(r3), r26, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x06c9, code lost:
    
        if ((r119 instanceof X.C7SZ) == false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x06cb, code lost:
    
        r4 = ((X.C7SZ) r119).A04;
        r0 = (X.KTK) X.AbstractC001800i.A0O(r4, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x06d9, code lost:
    
        if (r0 == null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x06db, code lost:
    
        r3 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06df, code lost:
    
        if (r3.A0N == null) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x06e1, code lost:
    
        r56 = X.AbstractC43592JPx.A0s(r4);
        r55 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06e7, code lost:
    
        r51 = X.C47986LJl.A00;
        r0 = (X.C3o9) r13.get();
        r54 = java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x06f3, code lost:
    
        if (r7 == null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x06f5, code lost:
    
        r6 = r7.A1u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x06f7, code lost:
    
        r51.A03(r8, r0, r54, r55, r56, null, null, r6, null, 8, 7, r19);
        r6 = r117.A06;
        r4 = X.AbstractC31176DnK.A0X(r3).C7W().A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0716, code lost:
    
        if (r7 == null) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0718, code lost:
    
        r3 = r7.A1S();
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x071c, code lost:
    
        r113 = r6.A00(r4, r19, r3);
        r0 = X.AbstractC31176DnK.A0X(r3).Bj4();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x072a, code lost:
    
        if (r0 == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x072c, code lost:
    
        r25 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0730, code lost:
    
        r4 = X.AbstractC31176DnK.A0X(r3).Co6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0738, code lost:
    
        if (r4 == null) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x073a, code lost:
    
        if (r7 == null) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0114, code lost:
    
        if (r5 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x073c, code lost:
    
        r0 = r7.A1u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x073e, code lost:
    
        r0 = r4.CDl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0742, code lost:
    
        if (r0 == null) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0744, code lost:
    
        r3 = r0.A03.Aah();
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x074a, code lost:
    
        r114 = X.AbstractC167007dF.A1X(r3, com.instagram.api.schemas.IGAIAgentType.A04);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0750, code lost:
    
        if (r4 == null) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0752, code lost:
    
        r0 = r4.Ba5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0756, code lost:
    
        if (r0 == null) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0758, code lost:
    
        r3 = r0.A03.Aae();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x075e, code lost:
    
        r0 = r4.Ba5();
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0762, code lost:
    
        if (r0 == null) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0764, code lost:
    
        r0 = r0.A03.Aah();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x076a, code lost:
    
        if (r3 == null) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x076c, code lost:
    
        r13 = new com.instagram.aistudio.logging.AiStudioLoggingData(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0771, code lost:
    
        r0 = r117.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0775, code lost:
    
        if (r4 == null) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0777, code lost:
    
        r96 = r4.BSH();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x077b, code lost:
    
        r24 = r119.BSy();
        r98 = r119.AuO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0783, code lost:
    
        if (r12 == null) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0785, code lost:
    
        r23 = r12.A00;
        r22 = r12.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x078d, code lost:
    
        if (r7 == null) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x078f, code lost:
    
        r87 = java.lang.Boolean.valueOf(r7.A1S());
        r15 = r7.A1K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0799, code lost:
    
        r107 = X.AbstractC25231BEo.A1b(r117.A0y);
        r109 = X.AbstractC166987dD.A1a(X.AbstractC31172DnG.A0y(r3));
        r0 = r117.A0k;
        r0 = r117.A0Y;
        r0 = r117.A0a;
        r0 = r117.A0C;
        r0 = r117.A0E;
        r0 = r117.A0B;
        r0 = r117.A0j;
        r0 = r117.A0R;
        r0 = r117.A0e;
        r0 = r117.A0W;
        r0 = r117.A0X;
        r0 = r117.A0c;
        r0 = r117.A0o;
        r0 = r117.A0p;
        r0 = r117.A0Z;
        r0 = r117.A0M;
        r0 = r117.A0g;
        r0 = r117.A0J;
        r0 = r117.A0N;
        r14 = r117.A0U;
        r0 = r117.A0O;
        r9 = (X.InterfaceC163937Vh) r117.A0w.invoke();
        r0 = r117.A0h;
        r0 = r117.A0V;
        r0 = r117.A0d;
        r0 = r117.A0l;
        r0 = r117.A0f;
        r0 = r117.A0P;
        r0 = r117.A0A;
        r0 = r117.A0i;
        r0 = r117.A0n;
        r0 = r117.A0L;
        r0 = r117.A0m;
        r0 = r117.A0S;
        r0 = r117.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0835, code lost:
    
        if (r7 == null) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0837, code lost:
    
        r4 = r7.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0839, code lost:
    
        r0 = r117.A0Q;
        r0 = r117.A07;
        r12 = r117.A0q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0843, code lost:
    
        if (r7 == null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0845, code lost:
    
        r11 = r7.A1u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0847, code lost:
    
        r10 = r117.A10;
        r0 = r117.A0F;
        r0 = r117.A09;
        r0 = r117.A0T;
        X.C14360o3.A0B(r24, 9);
        X.C14360o3.A0B(r14, 55);
        X.C14360o3.A0B(r9, 57);
        X.C14360o3.A0B(r12, 79);
        X.C14360o3.A0B(r10, 82);
        r3 = null;
        X.LKl.A01(r2, r118, r30, r13, r8, r0, r0, r0, r0, r0, r0, r0, r0, r119, r0, r117, r0, r117, r0, r0, r0, r0, r0, r0, r0, r0, r0, r14, r0, r0, r0, r0, null, r0, r0, r117, r117, r0, r0, r0, r9, r0, r0, r0, r0, r0, r0, new X.C44995Jvl(r4, r119, r7), r0, r0, r0, r0, r0, r12, r7, r83, r24, r0, r29, r87, r15, r23, r22, r27, r17, r26, null, r11, r96, r5, r98, r25, r10, r19, r102, r121, r3, r123, r107, r124, r109, r110, false, r112, r113, r114);
        r2 = X.AbstractC31176DnK.A0X(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x08c5, code lost:
    
        if (X.AbstractC31172DnG.A00(r2) != 29) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x08cd, code lost:
    
        if (r2.CPb(r8.userId) == false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x08cf, code lost:
    
        r6 = X.AbstractC147806l5.A00(r8);
        r5 = r2.AdZ();
        r4 = r2.C7I();
        r2 = r2.C7q();
        r1 = X.AbstractC31172DnG.A0I(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x08e7, code lost:
    
        if (X.AbstractC25226BEj.A1Z(r1) == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x08e9, code lost:
    
        X.AbstractC31175DnJ.A1B(r1, r6);
        X.AbstractC31174DnI.A1I(r1, "message_options_rendered");
        r1.A0o("message_options_dot_menu");
        X.AbstractC31178DnM.A1H(r1, "thread_view", r5);
        r1.A0r(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x08fe, code lost:
    
        if (r2 == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0900, code lost:
    
        r3 = X.AbstractC166997dE.A0j(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0904, code lost:
    
        r1.A0h(r3);
        r1.Cht();
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x090a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x090b, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x090e, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0911, code lost:
    
        r87 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0916, code lost:
    
        r23 = null;
        r22 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x091c, code lost:
    
        r96 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0920, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0923, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0926, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0123, code lost:
    
        if (r3 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0929, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x092c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x092f, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0933, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0938, code lost:
    
        if (r3.A0F == null) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x093a, code lost:
    
        r55 = X.AbstractC43592JPx.A0s(r4);
        r56 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0942, code lost:
    
        r55 = null;
        r56 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0948, code lost:
    
        r55 = null;
        r56 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x094e, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0951, code lost:
    
        r82 = X.EnumC72433Xdd.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0955, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0959, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0660, code lost:
    
        if (r19 == 29) goto L267;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04cf A[LOOP:0: B:179:0x04c9->B:181:0x04cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.L2N] */
    @Override // X.InterfaceC165307aJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void El9(android.graphics.PointF r118, X.InterfaceC129525tH r119, X.C7QV r120, long r121, boolean r123, boolean r124) {
        /*
            Method dump skipped, instructions count: 2408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49043LmV.El9(android.graphics.PointF, X.5tH, X.7QV, long, boolean, boolean):void");
    }
}
