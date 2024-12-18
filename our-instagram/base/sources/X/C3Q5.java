package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.3Q5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3Q5 {
    public static final C38321qM A00(InterfaceC65282xQ interfaceC65282xQ, C3FQ c3fq, int i) {
        C14360o3.A0B(interfaceC65282xQ, 1);
        int BDJ = i - c3fq.BDJ();
        if (BDJ >= interfaceC65282xQ.getCount()) {
            return null;
        }
        Object item = interfaceC65282xQ.getItem(BDJ);
        if (item instanceof InterfaceC38371qR) {
            return ((InterfaceC38371qR) item).BQN();
        }
        if (!(item instanceof C1121854m) || !(interfaceC65282xQ instanceof C65192xH)) {
            return null;
        }
        C1121854m c1121854m = (C1121854m) item;
        C65192xH c65192xH = (C65192xH) interfaceC65282xQ;
        C14360o3.A0B(c1121854m, 0);
        C14360o3.A0B(c65192xH, 1);
        return c65192xH.A0T.A02(c1121854m.A00).A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r5.BRZ(r3).A35 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C3Y7 A01(com.instagram.common.session.UserSession r4, X.InterfaceC65282xQ r5, X.C3FQ r6, int r7) {
        /*
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r0 = 3
            X.C14360o3.A0B(r4, r0)
            X.1qM r3 = A00(r5, r6, r7)
            r2 = 0
            if (r3 == 0) goto L31
            boolean r0 = r3.A5x()
            if (r0 == 0) goto L24
            boolean r0 = r3.CdW()
            if (r0 == 0) goto L24
            X.3Zb r0 = r5.BRZ(r3)
            boolean r0 = r0.A35
            r1 = 1
            if (r0 != 0) goto L25
        L24:
            r1 = 0
        L25:
            boolean r0 = A04(r4, r5, r3)
            if (r0 != 0) goto L2d
            if (r1 == 0) goto L31
        L2d:
            X.3Y7 r2 = X.C81203jp.A09(r3, r6, r7)
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3Q5.A01(com.instagram.common.session.UserSession, X.2xQ, X.3FQ, int):X.3Y7");
    }

    public static final void A02(UserSession userSession, C3Y7 c3y7, C30E c30e) {
        SlideInAndOutIconView A01;
        SlideInAndOutIconView A012;
        if (userSession != null && C3FU.A00(userSession)) {
            C75113Zb BRY = c3y7.BRY();
            View BQt = c3y7.BQt();
            if (BRY != null && BQt != null && !BRY.A30) {
                Rect rect = new Rect();
                BQt.getLocalVisibleRect(rect);
                if (rect.bottom >= BQt.getHeight() && rect.bottom - rect.top >= BQt.getHeight() * 0.5d) {
                    String str = null;
                    C1R0 C98 = C26661Qv.A00(c30e.A0K).C98();
                    C14360o3.A07(C98);
                    C5QE A00 = AbstractC47124KsJ.A00(C98, "");
                    C30R c30r = C30R.A0A;
                    C3W4 Adr = c3y7.Adr();
                    if (Adr != null && (A012 = Adr.A01()) != null) {
                        Context context = c30e.A0H;
                        A012.setIcon(context.getDrawable(R.drawable.spinsta_data_white));
                        A012.A02 = C30Q.SLIDE_IN;
                        if (A00 != null) {
                            str = BHX.A00(context, A00).toString();
                        }
                        A012.setText(str);
                    }
                    C75113Zb BRY2 = c3y7.BRY();
                    if (BRY2 != null) {
                        C14360o3.A0A(c30r);
                        BRY2.A0H(A00, c30r, R.drawable.spinsta_data_white);
                    }
                    C30E.A05(C4JD.A05, c30e);
                    BRY.A30 = true;
                    return;
                }
                C3W4 Adr2 = c3y7.Adr();
                if (Adr2 != null && (A01 = Adr2.A01()) != null) {
                    A01.setIcon(c30e.A0H.getDrawable(R.drawable.spinsta_data_white));
                    A01.setText((String) null);
                    A01.setVisibility(0);
                }
                C30E.A05(C4JD.A05, c30e);
            }
        }
    }

    public static final boolean A04(UserSession userSession, InterfaceC65282xQ interfaceC65282xQ, Object obj) {
        C14360o3.A0B(interfaceC65282xQ, 0);
        C14360o3.A0B(userSession, 2);
        if (obj instanceof C76403bk) {
            return !((C76403bk) obj).A0M.isEmpty();
        }
        if (!(obj instanceof C38321qM)) {
            return false;
        }
        C38321qM c38321qM = (C38321qM) obj;
        C75113Zb BRZ = interfaceC65282xQ.BRZ(c38321qM);
        if (c38321qM.A5M()) {
            C38321qM A1e = c38321qM.A1e(BRZ.A03);
            if (A1e != null && A1e.A6d(userSession)) {
                return true;
            }
            return false;
        }
        if (c38321qM.A5Q()) {
            return c38321qM.A1d().A6d(userSession);
        }
        return c38321qM.A6d(userSession);
    }

    public static final boolean A05(C66290U7l c66290U7l, C3Q0 c3q0, long j, boolean z, boolean z2) {
        boolean z3 = false;
        C14360o3.A0B(c3q0, 0);
        if (!z || z2) {
            C3Q0 c3q02 = C3Q0.IDLE;
            if (c66290U7l != null) {
                if (c3q0 != c3q02) {
                    z3 = false;
                    if (c3q0 == C3Q0.PAUSED) {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                if ((c3q0 != c3q02 && c3q0 != C3Q0.PAUSED) || Math.abs(j) > 7000) {
                    return false;
                }
                return true;
            }
        }
        return z3;
    }

    public static final void A03(C3Y7 c3y7, EnumC79303gb enumC79303gb) {
        C3Y8 c3y8;
        if ((c3y7 instanceof C81303k0) && (c3y8 = ((C81303k0) c3y7).A0J) != null) {
            c3y8.A00(enumC79303gb);
        }
    }
}
