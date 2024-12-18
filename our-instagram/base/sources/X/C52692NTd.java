package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NTd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52692NTd extends AbstractC55206OeJ {
    public float A00;
    public C88X A01;
    public C88X A02;
    public C51887MwV A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Activity A09;
    public final View A0A;
    public final C54823OLg A0B;
    public final InterfaceC11380iw A0C;
    public final C25671My A0D;
    public final InterfaceC41501vz A0E;
    public final UserSession A0F;
    public final OI6 A0G;
    public final C55177Odh A0H;
    public final OHG A0I;
    public final C54614OAp A0J;
    public final OJ1 A0K;
    public final PC7 A0L;
    public final OCB A0M;
    public final OJ2 A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final InterfaceC09390do A0Z;
    public final InterfaceC09390do A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d;
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC09390do A0i;
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;
    public final InterfaceC09390do A0l;
    public final InterfaceC09390do A0m;

    public static final void A02(C52692NTd c52692NTd) {
        c52692NTd.A0J(new C51899Mwh(null, null, false, false));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C52692NTd(Activity activity, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, PC7 pc7, OJ2 oj2) {
        super(AbstractC25225BEi.A1D(C51887MwV.class));
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C54823OLg c54823OLg = new C54823OLg(userSession);
        OHG ohg = new OHG(userSession);
        Context A0L = AbstractC166997dE.A0L(view);
        OCB ocb = new OCB(A0L, userSession, oj2);
        C14360o3.A07(A0L);
        OJ1 oj1 = new OJ1(A0L, userSession);
        C54614OAp c54614OAp = new C54614OAp(userSession, oi6);
        C14360o3.A0B(c55177Odh, 5);
        AbstractC167017dG.A1U(oi6, oj2);
        C14360o3.A0B(A00, 9);
        this.A0A = view;
        this.A09 = activity;
        this.A0F = userSession;
        this.A0C = interfaceC11380iw;
        this.A0H = c55177Odh;
        this.A0G = oi6;
        this.A0N = oj2;
        this.A0L = pc7;
        this.A0D = A00;
        this.A0B = c54823OLg;
        this.A0I = ohg;
        this.A0M = ocb;
        this.A0K = oj1;
        this.A0J = c54614OAp;
        C16930sl c16930sl = C16930sl.A00;
        Integer num = C05F.A00;
        this.A03 = new C51887MwV(null, null, null, null, null, EnumC53279NhH.A04, num, num, num, 0, null, "simple_gradient_background_0", null, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, 0.0f, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.A0Q = C57512Pfm.A00(this, 13);
        this.A0g = C57512Pfm.A00(this, 29);
        InterfaceC09390do A002 = C57512Pfm.A00(this, 16);
        this.A0T = A002;
        this.A00 = MSZ.A03(A002);
        this.A0i = C57512Pfm.A00(this, 31);
        this.A0k = C57512Pfm.A00(this, 33);
        this.A0h = C57512Pfm.A00(this, 30);
        this.A0c = C57512Pfm.A00(this, 25);
        this.A0Z = C57512Pfm.A00(this, 22);
        this.A0Y = C57512Pfm.A00(this, 21);
        this.A0j = C57512Pfm.A00(this, 32);
        this.A0E = C56034Ou6.A00(this, 28);
        this.A0d = C57512Pfm.A00(this, 26);
        this.A0R = C57512Pfm.A00(this, 14);
        this.A0P = C57512Pfm.A00(this, 12);
        this.A0O = C57512Pfm.A00(this, 11);
        this.A0V = C57512Pfm.A00(this, 18);
        this.A0U = C57512Pfm.A00(this, 17);
        this.A0S = C57512Pfm.A00(this, 15);
        this.A0a = C57512Pfm.A00(this, 23);
        this.A0W = C57512Pfm.A00(this, 19);
        this.A0l = C57512Pfm.A00(this, 34);
        this.A0e = C57512Pfm.A00(this, 27);
        this.A0m = C57512Pfm.A00(this, 35);
        this.A0X = C57512Pfm.A00(this, 20);
        this.A0b = AbstractC09440dt.A01(new C57512Pfm(this, 24));
        this.A0f = AbstractC09440dt.A01(new C57512Pfm(this, 28));
        C88X c88x = C88X.A0T;
        C14360o3.A08(c88x);
        this.A01 = c88x;
        c54614OAp.A00 = new C54461O4p(this);
        ocb.A00 = new C54459O4n(this);
    }

    private final C88X A00() {
        if (!(this.A0B.A00() instanceof NUJ)) {
            return null;
        }
        C88X c88x = this.A02;
        if (c88x == null) {
            Drawable A0a = AbstractC166987dD.A0a(this.A0X);
            String string = this.A0A.getContext().getString(2131969550);
            C189128Zd c189128Zd = new C189128Zd(A0a, C88Z.A07, null);
            c189128Zd.A04 = string;
            return new C88X(c189128Zd);
        }
        return c88x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C88X r32, X.C52692NTd r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52692NTd.A01(X.88X, X.NTd, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.PlO, java.lang.Object] */
    public static final void A04(C52692NTd c52692NTd) {
        if (c52692NTd.A03.A06 != null) {
            C55177Odh c55177Odh = c52692NTd.A0H;
            c55177Odh.A05(new Object());
            c55177Odh.A03(new PF1(true, false, false));
        }
    }

    public static final void A05(C52692NTd c52692NTd) {
        CameraAREffect A00;
        C55210OeT A0q = MSW.A0q(c52692NTd.A0S);
        C88X c88x = (C88X) A0q.A0I.get(A0q.A02);
        C54727OFe c54727OFe = (C54727OFe) c52692NTd.A0W.getValue();
        c54727OFe.A01 = c88x;
        c54727OFe.A0B.Egh(c88x);
        C88X c88x2 = c54727OFe.A01;
        if (c88x2 != null && (A00 = c88x2.A00()) != null && A00.A0Z.get("nativeUIControlSlider") != null) {
            c54727OFe.A02.setProgress(c54727OFe.A00);
        }
        NHN nhn = (NHN) c52692NTd.A0V.getValue();
        nhn.A01 = c88x;
        nhn.A06.Egh(c88x);
    }

    public static final void A06(C52692NTd c52692NTd, C51887MwV c51887MwV) {
        if (c51887MwV.A0B == C05F.A01 && !c52692NTd.A07) {
            ((C1821185v) c52692NTd.A0a.getValue()).A00();
        } else {
            ((C1821185v) c52692NTd.A0a.getValue()).CMh();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r4.A03.A0A != X.C05F.A00) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C52692NTd r4, boolean r5) {
        /*
            X.0do r0 = r4.A0Y
            android.view.View r3 = X.AbstractC166987dD.A0d(r0)
            if (r3 == 0) goto L1e
            boolean r0 = A0A(r4)
            if (r0 == 0) goto L19
            if (r5 == 0) goto L19
            X.MwV r0 = r4.A03
            java.lang.Integer r2 = r0.A0A
            java.lang.Integer r1 = X.C05F.A00
            r0 = 0
            if (r2 == r1) goto L1b
        L19:
            r0 = 8
        L1b:
            r3.setVisibility(r0)
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52692NTd.A07(X.NTd, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A08(X.EnumC53279NhH r19) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52692NTd.A08(X.NhH):void");
    }

    public static final boolean A0A(C52692NTd c52692NTd) {
        return AbstractC167007dF.A1X(((C1810281e) c52692NTd.A0j.getValue()).A00.first, EnumC1810181d.A11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0445, code lost:
    
        if (java.lang.Integer.toString(811).equals(r8.A0E) == false) goto L178;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0246  */
    @Override // X.AbstractC55206OeJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A0I(X.InterfaceC57855PlL r19) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52692NTd.A0I(X.PlL):void");
    }

    public static final void A03(C52692NTd c52692NTd) {
        C55177Odh c55177Odh;
        int i;
        if (A0A(c52692NTd)) {
            float Bd6 = ((C8FP) r2.getValue()).Bd6() - ((C8FP) c52692NTd.A0U.getValue()).CAj();
            if (((NHN) c52692NTd.A0V.getValue()).A03) {
                Bd6 += MSZ.A03(c52692NTd.A0g);
            }
            c55177Odh = c52692NTd.A0H;
            i = (int) Bd6;
        } else {
            c55177Odh = c52692NTd.A0H;
            i = 0;
        }
        c55177Odh.A05(new C56655PCz(i));
    }

    public static final boolean A09(C52692NTd c52692NTd) {
        if (!A0A(c52692NTd)) {
            return false;
        }
        ((C1810281e) c52692NTd.A0j.getValue()).A04(new Object());
        c52692NTd.A0H.A05(new PD0(false));
        return true;
    }

    public static final boolean A0B(List list, List list2) {
        if (list2.isEmpty() || list.size() != list2.size() || !C14360o3.A0K(AbstractC001800i.A0I(list), AbstractC001800i.A0I(list2))) {
            return true;
        }
        return false;
    }
}
