package X;

import android.app.Activity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;

/* loaded from: classes9.dex */
public final class NTY extends AbstractC55206OeJ {
    public C31727DwY A00;
    public C189478aR A01;
    public C54467O4v A02;
    public PDU A03;
    public C56656PDa A04;
    public C56657PDb A05;
    public boolean A06;
    public boolean A07;
    public final Activity A08;
    public final C55177Odh A09;
    public final PCO A0A;
    public final InterfaceC09390do A0B;
    public final UserSession A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTY(Activity activity, UserSession userSession, C55177Odh c55177Odh, PCO pco) {
        super(AbstractC25225BEi.A1D(C56623PBt.class));
        C14360o3.A0B(c55177Odh, 3);
        this.A08 = activity;
        this.A0A = pco;
        this.A09 = c55177Odh;
        this.A0C = userSession;
        this.A0B = C57516Pfq.A00(this, 19);
        this.A02 = new C54467O4v();
        A0J(new C51898Mwg(false, 0.0f));
        this.A0A.A01 = new C54468O4w(this);
    }

    public static final void A03(NTY nty, boolean z) {
        nty.A05 = null;
        nty.A06 = false;
        View view = nty.A0A.A06;
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        C189478aR c189478aR = nty.A01;
        if (c189478aR != null) {
            c189478aR.A0L(null);
        }
        C55177Odh c55177Odh = nty.A09;
        c55177Odh.A05(PEJ.A00);
        if (z) {
            C51898Mwg c51898Mwg = (C51898Mwg) ((AbstractC55206OeJ) nty).A01;
            if ((c51898Mwg != null && c51898Mwg.A01) || nty.A01 != null) {
                return;
            }
            c55177Odh.A05(new PD3(false));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.NTY r5) {
        /*
            X.PlM r2 = r5.A01
            r0 = r2
            X.Mwg r0 = (X.C51898Mwg) r0
            if (r0 == 0) goto Lc
            boolean r1 = r0.A01
            r0 = 1
            if (r1 == 0) goto Ld
        Lc:
            r0 = 0
        Ld:
            r4 = r0 ^ 1
            r3 = 0
            if (r2 == 0) goto L2d
            r2 = 0
            r1 = 0
            X.Mwg r0 = new X.Mwg
            r0.<init>(r2, r1)
        L19:
            r5.A0J(r0)
            A03(r5, r4)
            r5.A03 = r3
            X.DwY r0 = r5.A00
            if (r0 == 0) goto L28
            r0.A04()
        L28:
            r5.A00 = r3
            r5.A04 = r3
            return
        L2d:
            r0 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NTY.A00(X.NTY):void");
    }

    public static final void A01(NTY nty) {
        C51898Mwg c51898Mwg = (C51898Mwg) ((AbstractC55206OeJ) nty).A01;
        if ((c51898Mwg != null && c51898Mwg.A01) || nty.A01 != null) {
            nty.A09.A05(new PD3(true));
        }
    }

    public static final void A02(NTY nty, C56657PDb c56657PDb) {
        nty.A06 = c56657PDb.A02;
        nty.A0A.A01(c56657PDb.A03);
        C189478aR c189478aR = c56657PDb.A01;
        c189478aR.A02(nty.A08, c56657PDb.A00);
        nty.A01 = c189478aR;
        nty.A09.A05(PEE.A00);
        A01(nty);
    }

    public static final boolean A04(NTY nty) {
        C51898Mwg c51898Mwg = (C51898Mwg) ((AbstractC55206OeJ) nty).A01;
        if (c51898Mwg == null || !c51898Mwg.A01) {
            return false;
        }
        LinkedList linkedList = nty.A02.A00;
        if (linkedList.size() > 1) {
            if (linkedList.size() > 1) {
                linkedList.removeLast();
                PCO pco = nty.A0A;
                InterfaceC09390do interfaceC09390do = pco.A08;
                int childCount = MSW.A0B(interfaceC09390do).getChildCount();
                if (childCount == 1) {
                    View childAt = MSW.A0B(interfaceC09390do).getChildAt(0);
                    if (childAt != null) {
                        MSW.A0B(interfaceC09390do).removeView(childAt);
                        childAt.setVisibility(0);
                    }
                } else if (childCount > 1) {
                    View childAt2 = MSW.A0B(interfaceC09390do).getChildAt(childCount - 1);
                    MSW.A0B(interfaceC09390do).getChildAt(childCount - 2).setVisibility(0);
                    MSX.A14(childAt2.animate().translationX(AbstractC166987dD.A07(childAt2)).setDuration(150L).setInterpolator(new AccelerateDecelerateInterpolator()), new PRR(childAt2, pco));
                }
                if (nty.A07) {
                    View view = pco.A03;
                    view.clearFocus();
                    AbstractC13880nE.A0O(view);
                }
                return true;
            }
            throw AbstractC166987dD.A14("Back stack should have multiple sheets when attempting to navigate back. Ensure [#canNavigateBack] is checked before calling this method.");
        }
        A00(nty);
        return true;
    }
}
