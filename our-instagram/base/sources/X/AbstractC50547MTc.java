package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MTc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50547MTc {
    public static final ViewGroup A00(ViewGroup viewGroup, C80673iw c80673iw, UserSession userSession, InterfaceC59152nG interfaceC59152nG, InterfaceC145376gw interfaceC145376gw) {
        ViewGroup viewGroup2;
        boolean A1b = AbstractC25233BEq.A1b(userSession, viewGroup, interfaceC145376gw);
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36323255682083951L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36325274316583887L);
        if (!A06) {
            int i = R.layout.layout_iglive_reel_item;
            if (A062) {
                i = R.layout.layout_iglive_reel_item_igds;
            }
            View inflate = A0P.inflate(i, viewGroup, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) inflate;
            viewGroup2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            int i2 = R.layout.layout_iglive_reel_item;
            if (A062) {
                i2 = R.layout.layout_iglive_reel_item_igds;
            }
            C14360o3.A0A(A0P);
            View A00 = C50802Vb.A00(A0P, new ViewGroup.LayoutParams(-1, -1), viewGroup, i2, 0, false, A1b);
            C14360o3.A0C(A00, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) A00;
        }
        C138376Ot c138376Ot = new C138376Ot(viewGroup2, userSession, interfaceC145376gw);
        if (interfaceC59152nG != null) {
            c138376Ot.A0b.setPostProcessor(interfaceC59152nG);
        }
        if (c80673iw != null) {
            c138376Ot.A0b.setProgressiveImageConfig(c80673iw);
        }
        viewGroup2.setTag(c138376Ot);
        return viewGroup2;
    }

    public static final void A02(C138376Ot c138376Ot) {
        A03(c138376Ot, R.color.fds_transparent, false);
        c138376Ot.A03(true);
        C50549MTg c50549MTg = c138376Ot.A0e;
        c50549MTg.A01.setVisibility(0);
        AbstractC167007dF.A0L(c50549MTg.A05).setVisibility(8);
        AbstractC167017dG.A1W(c50549MTg.A02, 8);
        c50549MTg.A00().A06();
        c50549MTg.A00().setVisibility(0);
        ((O4H) c50549MTg.A07.getValue()).A00.setVisibility(8);
        InterfaceC09390do interfaceC09390do = c50549MTg.A04;
        AbstractC124845kp.A01(AbstractC167007dF.A0L(interfaceC09390do)).setLayoutTransition(null);
        AbstractC43593JPy.A1Q(AbstractC166987dD.A17(interfaceC09390do));
        AbstractC167017dG.A1W(c50549MTg.A06, 8);
    }

    public static final void A03(C138376Ot c138376Ot, int i, boolean z) {
        int color = c138376Ot.A0V.getContext().getColor(i);
        View view = c138376Ot.A0e.A01;
        view.setVisibility(0);
        view.setBackgroundColor(color);
        view.setOnTouchListener(new ViewOnTouchListenerC50553MTk(view, c138376Ot, z));
        c138376Ot.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0274, code lost:
    
        if (r1 != true) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027a, code lost:
    
        if (r0 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ce, code lost:
    
        if (r0.CX2() == true) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0366, code lost:
    
        if (r10.A00() > 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x029a, code lost:
    
        if (r1 != r12) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r6 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0144, code lost:
    
        if (r24.A0H.A1d == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC11380iw r20, com.instagram.common.session.UserSession r21, X.C105824pt r22, X.C41181vS r23, X.C41551w4 r24, X.C3G2 r25, X.C141596ac r26, X.C138376Ot r27, X.InterfaceC144586fe r28) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC50547MTc.A01(X.0iw, com.instagram.common.session.UserSession, X.4pt, X.1vS, X.1w4, X.3G2, X.6ac, X.6Ot, X.6fe):void");
    }
}
