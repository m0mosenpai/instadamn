package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NTW extends AbstractC55206OeJ {
    public int A00;
    public C56627PBx A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final View A09;
    public final C54823OLg A0A;
    public final UserSession A0B;
    public final OI6 A0C;
    public final C55177Odh A0D;
    public final OHG A0E;
    public final C54464O4s A0F;
    public final PCS A0G;
    public final Runnable A0H;
    public final InterfaceC09390do A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NTW(View view, UserSession userSession, OI6 oi6, C55177Odh c55177Odh, PCS pcs) {
        super(AbstractC25225BEi.A1D(C56627PBx.class));
        OHG ohg = new OHG(userSession);
        C54823OLg c54823OLg = new C54823OLg(userSession);
        C54464O4s c54464O4s = new C54464O4s(AbstractC166997dE.A0L(view));
        AbstractC167017dG.A1S(c55177Odh, oi6);
        this.A09 = view;
        this.A0B = userSession;
        this.A0G = pcs;
        this.A0D = c55177Odh;
        this.A0C = oi6;
        this.A0E = ohg;
        this.A0A = c54823OLg;
        this.A0F = c54464O4s;
        pcs.A00 = new C54465O4t(this);
        this.A01 = new C56627PBx(null, 0, 50, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.A04 = true;
        this.A0I = C57512Pfm.A00(this, 38);
        this.A0H = new RunnableC56917PNk(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if (r8 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r8 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (A02(r22) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (A02(r22) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        if (A02(r22) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a6, code lost:
    
        if (A02(r22) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (r0 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map A00(X.NTW r22, X.C56627PBx r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NTW.A00(X.NTW, X.PBx, boolean):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r1 != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        if (r45.A0A.A02() == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.NTW r45, boolean r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NTW.A01(X.NTW, boolean, boolean):void");
    }

    public static final boolean A02(NTW ntw) {
        if (ntw.A01.A07) {
            C54823OLg c54823OLg = ntw.A0A;
            if (((c54823OLg.A00() instanceof NUJ) && ntw.A01.A03) || (c54823OLg.A00() instanceof NUK)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A03(NTW ntw) {
        if (ntw.A01.A0I && !ntw.A06 && !ntw.A05) {
            if (ntw.A02) {
                if (!ntw.A07 || ntw.A04) {
                    return false;
                }
            } else if (!ntw.A04) {
                return false;
            }
            if (!ntw.A03) {
                return true;
            }
            return false;
        }
        return false;
    }
}
