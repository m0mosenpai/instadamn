package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.rtc.views.omnigrid.GridItemSize;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.NTb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52690NTb extends AbstractC55206OeJ {
    public UQ7 A00;
    public C51879MwN A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final View A06;
    public final UserSession A07;
    public final C54610OAl A08;
    public final OI6 A09;
    public final C55177Odh A0A;
    public final PCK A0B;
    public final C54728OFf A0C;
    public final Map A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC11380iw A0T;
    public final boolean A0U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52690NTb(Activity activity, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C54610OAl c54610OAl, OI6 oi6, C55177Odh c55177Odh) {
        super(AbstractC25225BEi.A1D(C51879MwN.class));
        C14360o3.A0B(c55177Odh, 4);
        C14360o3.A0B(oi6, 5);
        C14360o3.A0B(c54610OAl, 6);
        this.A06 = view;
        this.A0T = interfaceC11380iw;
        this.A07 = userSession;
        this.A0A = c55177Odh;
        this.A09 = oi6;
        this.A08 = c54610OAl;
        this.A05 = activity;
        this.A0J = C57524Pfy.A00(this, 11);
        this.A0M = C57524Pfy.A00(this, 13);
        this.A0K = C1XM.A00(C57436PeY.A00);
        this.A0Q = C57524Pfy.A00(this, 17);
        this.A0P = C57524Pfy.A00(this, 16);
        this.A0S = C57524Pfy.A00(this, 19);
        this.A0I = C57524Pfy.A00(this, 10);
        this.A0G = C57524Pfy.A00(this, 8);
        this.A0H = C57524Pfy.A00(this, 9);
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36323259976985720L);
        this.A0U = A06;
        View A08 = AbstractC43592JPx.A08(activity);
        AbstractC43592JPx.A1T(A08);
        MTY mty = new MTY(this, 5);
        O57 o57 = new O57(this);
        MTX A1F = MSW.A1F(this, 59);
        C57228PbC c57228PbC = new C57228PbC(this, 14);
        O58 o58 = (O58) this.A0I.getValue();
        MTX A1F2 = MSW.A1F(this, 60);
        MTX A1F3 = MSW.A1F(this, 61);
        this.A0B = new PCK(view, (ViewGroup) A08, (C55629OnE) this.A0G.getValue(), (C55630OnF) this.A0H.getValue(), interfaceC11380iw, c57112jm, o57, o58, A1F, A1F2, A1F3, MSW.A1F(this, 62), c57228PbC, mty, A06);
        this.A0C = new C54728OFf(activity);
        this.A0N = C57524Pfy.A00(this, 14);
        this.A00 = new UQ7(6);
        this.A0L = C57524Pfy.A00(this, 12);
        this.A0E = C57524Pfy.A00(this, 7);
        this.A0F = C1XM.A00(C57435PeX.A00);
        this.A0O = C57524Pfy.A00(this, 15);
        this.A0R = C57524Pfy.A00(this, 18);
        this.A0D = AbstractC166987dD.A1I();
    }

    public static final Rect A00(C52690NTb c52690NTb) {
        if (c52690NTb.A00.A00 > 0) {
            View view = c52690NTb.A06;
            return new Rect(0, 0, view.getWidth(), view.getHeight() - c52690NTb.A00.A00);
        }
        Rect A0U = AbstractC166987dD.A0U();
        c52690NTb.A06.getGlobalVisibleRect(A0U);
        return A0U;
    }

    private final void A01() {
        PCK pck = this.A0B;
        if (!pck.A02()) {
            UQ7 uq7 = this.A00;
            int i = uq7.A02;
            int i2 = uq7.A01;
            InterfaceC09390do interfaceC09390do = pck.A0B;
            ViewGroup A0B = MSW.A0B(interfaceC09390do);
            InterfaceC09390do interfaceC09390do2 = pck.A0E;
            if (A0B.indexOfChild(AbstractC166987dD.A0d(interfaceC09390do2)) != -1) {
                MSW.A0B(interfaceC09390do).removeView(AbstractC166987dD.A0d(interfaceC09390do2));
                AbstractC31173DnH.A0z(pck.A02.getContext(), AbstractC166987dD.A0d(interfaceC09390do2), R.drawable.floating_participants_background);
                pck.A01(i, i2);
                InterfaceC09390do interfaceC09390do3 = pck.A0A;
                View A0d = AbstractC166987dD.A0d(interfaceC09390do3);
                C14360o3.A0B(A0d, 0);
                A0d.setOutlineProvider(null);
                A0d.setClipToOutline(false);
                pck.A03.addView(AbstractC166987dD.A0d(interfaceC09390do3));
            }
        }
    }

    private final void A02(int i) {
        C51905Mwn c51905Mwn;
        C51905Mwn c51905Mwn2 = (C51905Mwn) super.A01;
        if (c51905Mwn2 != null && c51905Mwn2.A0B) {
            if (C18U.A06(C06090Tz.A06, this.A07, 36323259977182331L)) {
                this.A0A.A05(new PDN(i));
            }
        }
        if (this.A0U && (c51905Mwn = (C51905Mwn) super.A01) != null && c51905Mwn.A09) {
            A03(this);
        }
        if (AbstractC167007dF.A1Z(this.A0K)) {
            this.A06.post(new PRU(this, i));
        }
    }

    public static final void A03(C52690NTb c52690NTb) {
        C51905Mwn c51905Mwn;
        c52690NTb.A0A.A05(PEO.A00);
        C51905Mwn c51905Mwn2 = (C51905Mwn) ((AbstractC55206OeJ) c52690NTb).A01;
        boolean z = false;
        if (c51905Mwn2 != null) {
            if (c51905Mwn2.A09) {
                z = true;
            }
            c51905Mwn = C51905Mwn.A00(null, null, c51905Mwn2, null, null, null, 65535, false, false, false, false, false, false, false, false, !z);
        } else {
            c51905Mwn = null;
        }
        c52690NTb.A0J(c51905Mwn);
    }

    private final void A04(boolean z) {
        C51905Mwn c51905Mwn = (C51905Mwn) super.A01;
        if (c51905Mwn == null) {
            c51905Mwn = AbstractC54899OPu.A00();
        }
        InterfaceC09390do interfaceC09390do = this.A0N;
        A0J(C51905Mwn.A00(((OX0) interfaceC09390do.getValue()).A00, ((OX0) interfaceC09390do.getValue()).A01, c51905Mwn, null, null, null, 116735, false, false, false, false, false, z, false, false, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0424, code lost:
    
        if (r1.A05 == true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x043e, code lost:
    
        if (r1.A07 != true) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC55206OeJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(X.InterfaceC57858PlO r37) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52690NTb.A0K(X.PlO):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0221, code lost:
    
        if (r13 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0256, code lost:
    
        if (X.C18U.A06(r22, r4, 36314996459703244L) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x037d, code lost:
    
        if (X.AbstractC167007dF.A1Z(r58.A0Q) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0450, code lost:
    
        if (X.AbstractC166987dD.A1b(r44) != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x045c, code lost:
    
        if (r59.A0F != false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04ec, code lost:
    
        if (r6.A06 != true) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04f1, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04f4, code lost:
    
        if (r6.A07 == true) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x04f6, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04f7, code lost:
    
        if (r1 == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x04f9, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04fc, code lost:
    
        if (r1.A06 == true) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0503, code lost:
    
        if (r1.A07 != true) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0505, code lost:
    
        r5.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0507, code lost:
    
        if (r11 != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0509, code lost:
    
        if (r6 == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x050b, code lost:
    
        r5.A01.A00(X.C56596PAs.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0512, code lost:
    
        if (r9 == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0514, code lost:
    
        if (r11 != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05a8, code lost:
    
        if (r12 == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05aa, code lost:
    
        if (r6 != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0521, code lost:
    
        r9 = (X.C51905Mwn) r58.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0525, code lost:
    
        if (r9 != null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0527, code lost:
    
        r9 = X.AbstractC54899OPu.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x052b, code lost:
    
        r6 = r59.A0G;
        r12 = r59.A05;
        r5 = r59.A0E;
        r2 = ((X.OX0) r4.getValue()).A01().A0B;
        r46 = X.AbstractC06930Yk.A0B(r10);
        r10 = ((X.OX0) r4.getValue()).A00;
        r1 = ((X.OX0) r4.getValue()).A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0551, code lost:
    
        if (r9 == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0555, code lost:
    
        if (r58.A03 != false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0557, code lost:
    
        r54 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0559, code lost:
    
        A0J(X.C51905Mwn.A00(r10, r1, r9, r44, r7, r46, 100465, false, r2, r6, r12, r5, false, r54, false, false));
        r1 = r58.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x057d, code lost:
    
        if (r1 == null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x057f, code lost:
    
        r1 = r1.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0581, code lost:
    
        if (r1 != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0585, code lost:
    
        if (r59.A0F == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0587, code lost:
    
        A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0592, code lost:
    
        if (r1 != true) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0596, code lost:
    
        if (r59.A0F != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0598, code lost:
    
        r2 = r58.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x059e, code lost:
    
        if (r2.A02() == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05a0, code lost:
    
        r2.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x058a, code lost:
    
        if (r8 == r6) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x058c, code lost:
    
        A02(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x058f, code lost:
    
        r58.A01 = r59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0591, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x05ac, code lost:
    
        r5.A01.A00(X.C56595PAr.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05b3, code lost:
    
        if (r6 != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x05b5, code lost:
    
        r2 = r5.A01;
        r1 = X.C56597PAt.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x051e, code lost:
    
        r2.A00(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0516, code lost:
    
        if (r6 == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0518, code lost:
    
        if (r12 == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x051a, code lost:
    
        r2 = r5.A01;
        r1 = X.C56594PAq.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x05a4, code lost:
    
        if (r11 == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x05a6, code lost:
    
        if (r9 == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05bb, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x04fe, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04ff, code lost:
    
        if (r1 == null) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04ef, code lost:
    
        if (r6 != null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0108, code lost:
    
        if (r18 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0075, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r58.A07, 36329457614930264L) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x007b, code lost:
    
        if (r59.A0D != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        if (r9 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        if (r15 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0100, code lost:
    
        if (r18 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r59.A0G != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
    
        if (r11 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
    
        if (r1.A05 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
    
        if (X.C18U.A06(r22, r4, 36314996459703244L) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020f, code lost:
    
        if (r7 != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(X.C51879MwN r59) {
        /*
            Method dump skipped, instructions count: 1476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52690NTb.A0M(X.MwN):void");
    }

    public static final boolean A05(Map map) {
        int i;
        Collection<GridItemSize> values = map.values();
        if (values != null && values.isEmpty()) {
            return false;
        }
        for (GridItemSize gridItemSize : values) {
            int i2 = gridItemSize.width;
            if (i2 != 0 && (i = gridItemSize.height) != 0 && i2 > i) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(Map map) {
        int i;
        boolean z;
        Collection<GridItemSize> values = map.values();
        if (values == null || !values.isEmpty()) {
            for (GridItemSize gridItemSize : values) {
                int i2 = gridItemSize.width;
                if (i2 != 0 && (i = gridItemSize.height) != 0 && i2 <= i) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean A05 = A05(map);
        if (z && A05) {
            return true;
        }
        return false;
    }
}
