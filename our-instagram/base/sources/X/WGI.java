package X;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.util.List;

/* loaded from: classes11.dex */
public final class WGI {
    public static final WGI A00 = new Object();

    public static final void A02(Context context, InterfaceC72023XFl interfaceC72023XFl, C1338462s c1338462s, InterfaceC191788ea interfaceC191788ea, VBp vBp, String str) {
        InterfaceC08430c6 interfaceC08430c6;
        C14360o3.A0B(context, 0);
        InterfaceC018407e interfaceC018407e = (InterfaceC72040XGi) C66224U4u.A01(context);
        if ((interfaceC018407e instanceof C0SG) && (interfaceC08430c6 = (C0SG) interfaceC018407e) != null) {
            InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) interfaceC08430c6;
            XBU Bdi = interfaceC72040XGi.Bdi(EnumC68125VCj.A02);
            C14360o3.A0C(Bdi, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
            interfaceC72040XGi.E6r(A01(context, interfaceC72023XFl, (C66209U4f) Bdi, c1338462s, interfaceC191788ea, str), vBp);
            return;
        }
        throw new IllegalStateException("Cannot push a new Screen without an existing bottom sheet.");
    }

    public static final void A03(Context context, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE) {
        RunnableC71530Wvf runnableC71530Wvf;
        C14360o3.A0B(context, 0);
        InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) C66224U4u.A01(context);
        if (interfaceC72040XGi != null) {
            if (c102884kP != null && interfaceC103384lE != null && c6fg != null) {
                runnableC71530Wvf = new RunnableC71530Wvf(c6fg, c102884kP, interfaceC103384lE);
            } else {
                runnableC71530Wvf = null;
            }
            interfaceC72040XGi.APk(new VBq(null), runnableC71530Wvf);
            return;
        }
        throw new IllegalStateException("Cannot dismiss without an existing bottom sheet.");
    }

    public static final void A04(Context context, C68108VBr c68108VBr, String str) {
        C14360o3.A0B(context, 0);
        InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) C66224U4u.A01(context);
        if (interfaceC72040XGi != null) {
            if (str == null) {
                interfaceC72040XGi.E4d(c68108VBr);
                return;
            } else {
                interfaceC72040XGi.E4e(str);
                return;
            }
        }
        throw new IllegalStateException("Cannot pop without an existing bottom sheet.");
    }

    public static final InterfaceC72001XEp A01(Context context, InterfaceC72023XFl interfaceC72023XFl, C66209U4f c66209U4f, C1338462s c1338462s, InterfaceC191788ea interfaceC191788ea, String str) {
        C14360o3.A0B(c66209U4f, 1);
        String BWI = interfaceC72023XFl.BWI();
        boolean equals = BWI.equals("screen_query");
        if (!equals && !BWI.equals("legacy_screen")) {
            throw AbstractC31175DnJ.A0V("Trying to create a CDS screen of an unknown type: ", BWI);
        }
        if (!equals) {
            if (BWI.equals("legacy_screen")) {
                C14360o3.A0B(str, 1);
                C66210U4g c66210U4g = new C66210U4g(new C131555wr(context), str);
                SparseArray sparseArray = new SparseArray();
                sparseArray.put(R.id.cds_bottom_sheet_screen_data, c66210U4g);
                AbstractC12990ll abstractC12990ll = ((C191778eZ) interfaceC191788ea).A00;
                C70677Wex c70677Wex = new C70677Wex(c66209U4f);
                InterfaceC018407e interfaceC018407e = c66209U4f.A0A;
                C14360o3.A0C(interfaceC018407e, "null cannot be cast to non-null type com.instagram.bloks.hosting.cds.IgCdsBottomSheetFragment");
                C66201U3x A002 = C66201U3x.A00(context, sparseArray, (C66273U6s) interfaceC72023XFl, c1338462s, C62862tP.A02((Fragment) interfaceC018407e, c70677Wex, abstractC12990ll, c66209U4f.A09), interfaceC191788ea);
                A002.A08(context, c66209U4f);
                InterfaceC72008XEw interfaceC72008XEw = A002.A00;
                interfaceC72008XEw.getClass();
                interfaceC72008XEw.CnU("cds_bottomsheet", true);
                c66210U4g.A00 = A002;
                return c66210U4g;
            }
            throw AbstractC65702TsY.A0S(BWI);
        }
        AbstractC12990ll abstractC12990ll2 = ((C191778eZ) interfaceC191788ea).A00;
        C70677Wex c70677Wex2 = new C70677Wex(c66209U4f);
        InterfaceC018407e interfaceC018407e2 = c66209U4f.A0A;
        C14360o3.A0C(interfaceC018407e2, "null cannot be cast to non-null type com.instagram.bloks.hosting.cds.IgCdsBottomSheetFragment");
        return new U6C(context, (WTT) interfaceC72023XFl, C62862tP.A02((Fragment) interfaceC018407e2, c70677Wex2, abstractC12990ll2, c66209U4f.A09));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C0SG A00(WGI wgi, String str, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i = size - 1;
            Fragment fragment = (Fragment) list.get(size);
            if ((fragment instanceof InterfaceC72040XGi) && (fragment instanceof C0SG)) {
                C0SG c0sg = (C0SG) fragment;
                if (((InterfaceC72040XGi) c0sg).AJm(str)) {
                    return c0sg;
                }
            } else {
                List A04 = fragment.getChildFragmentManager().A0U.A04();
                C14360o3.A07(A04);
                C0SG A002 = A00(wgi, str, A04);
                if (A002 != null) {
                    return A002;
                }
            }
            if (i >= 0) {
                size = i;
            } else {
                return null;
            }
        }
    }

    public static final void A05(C0SG c0sg, FragmentActivity fragmentActivity, InterfaceC72023XFl interfaceC72023XFl, C1338462s c1338462s, InterfaceC191788ea interfaceC191788ea, U5A u5a, String str) {
        AbstractC10360h2 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        C14360o3.A07(supportFragmentManager);
        C14240no c14240no = new C14240no(supportFragmentManager);
        c14240no.A0I(null);
        try {
            c0sg.A0C(c14240no, null);
        } catch (IllegalStateException e) {
            if (!fragmentActivity.isFinishing() && !fragmentActivity.isDestroyed() && !supportFragmentManager.A0G) {
                try {
                    supportFragmentManager.A12();
                    C14240no c14240no2 = new C14240no(supportFragmentManager);
                    c14240no2.A0I(null);
                    c14240no2.A0B(c0sg, null);
                    c14240no2.A01();
                } catch (Exception e2) {
                    AbstractC25241Le.A00(null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment while allowing state loss during commit", e2);
                }
            } else {
                AbstractC25241Le.A00(null, "CDSBloksBottomSheetController", "Error attempting to show CDS fragment when activity is closing", e);
            }
        }
        RunnableC71625WxX runnableC71625WxX = new RunnableC71625WxX(c0sg, fragmentActivity, interfaceC72023XFl, c1338462s, interfaceC191788ea, u5a, str);
        Handler A0J = AbstractC167007dF.A0J();
        A0J.post(new TQV(A0J, c0sg, runnableC71625WxX));
    }
}
