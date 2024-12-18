package X;

import android.app.Activity;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import fxcache.model.FxCalAccount;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class Ef3 extends AbstractC35025Fby implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(Ef3.class);
    public static final String __redex_internal_original_name = "FxCalControllerImpl";
    public C006802i A00;
    public G04 A01;
    public GZY A02;

    public final void A04(String str) {
        this.A05 = str;
        this.A06 = null;
        AbstractC12990ll abstractC12990ll = this.A07;
        AbstractC31171DnF.A1Q(abstractC12990ll);
        if (!A01((UserSession) abstractC12990ll)) {
            G04.A00(this.A01, "initial_async_controller_request_start", "", str, AbstractC166987dD.A1G());
            this.A05 = str;
            C11T.A02(new GLX(this));
        }
    }

    public final boolean A06(String str, List list) {
        String str2;
        C14360o3.A0B(str, 0);
        AbstractC12990ll abstractC12990ll = this.A07;
        if (abstractC12990ll instanceof UserSession) {
            UserSession userSession = (UserSession) abstractC12990ll;
            boolean z = false;
            if (userSession != null) {
                this.A05 = str;
                this.A06 = list;
                FxCalAccount A01 = AbstractC49092Nc.A00(userSession).A01(A03, "ig_android_linking_cache_fx_internal");
                if (A01 != null && (str2 = A01.A07) != null && str2.length() != 0) {
                    A05(str2);
                } else {
                    z = true;
                    C006802i c006802i = this.A00;
                    c006802i.markerStart(444800256);
                    c006802i.markerAnnotate(444800256, "entrypoint", str);
                    if (!A01(userSession)) {
                        G04.A00(this.A01, "initial_async_controller_request_start", "", str, AbstractC166987dD.A1G());
                        this.A05 = str;
                        C11T.A02(new GLX(this));
                        return true;
                    }
                }
                return z;
            }
        }
        return false;
    }

    public static void A00(AbstractC12990ll abstractC12990ll, Ef3 ef3, GZY gzy) {
        ef3.A02 = gzy;
        ef3.A01 = (G04) abstractC12990ll.A01(G04.class, new C50152MDf(abstractC12990ll, 18));
        SparseArray sparseArray = new SparseArray();
        ((AbstractC35025Fby) ef3).A02 = sparseArray;
        sparseArray.put(R.id.fx_linking_unified_launcher, ef3);
        ef3.A00 = C006802i.A0p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0067, code lost:
    
        if (X.FVN.A01(r5.A01, true) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A01(com.instagram.common.session.UserSession r7) {
        /*
            r6 = this;
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318677246679447(0x8107a500001997, double:3.031415962150473E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            r2 = 0
            if (r0 == 0) goto Ld6
            X.C14360o3.A0B(r7, r2)
            r0 = 12
            X.MDf r1 = new X.MDf
            r1.<init>(r7, r0)
            java.lang.Class<X.GWQ> r0 = X.GWQ.class
            java.lang.Object r5 = r7.A01(r0, r1)
            X.GWQ r5 = (X.GWQ) r5
            androidx.fragment.app.Fragment r0 = r6.A04
            if (r0 == 0) goto Lc0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
        L28:
            X.FM5 r1 = new X.FM5
            r1.<init>(r0, r6)
            r5.A02 = r1
            android.app.Activity r0 = r1.A00
            X.C14360o3.A0B(r0, r2)
            r5.A00 = r0
            android.view.Window r0 = r0.getWindow()
            X.C14360o3.A07(r0)
            r5.A01 = r0
            X.G04 r4 = r5.A02
            java.lang.String r3 = r5.A01()
            r5.A00()
            java.util.HashMap r2 = X.AbstractC166987dD.A1G()
            java.lang.String r1 = "initial_async_controller_request_start"
            java.lang.String r0 = ""
            X.G04.A00(r4, r1, r0, r3, r2)
            java.lang.String r1 = r5.A01()
            java.lang.String r0 = "ig_interop"
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 != 0) goto L69
            com.instagram.common.session.UserSession r0 = r5.A01
            boolean r0 = X.FVN.A01(r0, r4)
            r3 = 1
            if (r0 != 0) goto L6a
        L69:
            r3 = 0
        L6a:
            X.02i r2 = r5.A00
            r1 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r0 = "show_loading_state"
            r2.markerPoint(r1, r0)
            X.1Z0 r2 = X.AbstractC34209F7h.A00()
            android.app.Activity r1 = r5.A00
            if (r1 == 0) goto Lc9
            android.view.Window r0 = r5.A01
            if (r0 == 0) goto Lcc
            r2.A00(r1, r0, r4, r3)
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r0 = 2131433377(0x7f0b17a1, float:1.8488538E38)
            r3.put(r0, r5)
            com.instagram.common.session.UserSession r2 = r5.A01
            android.app.Activity r1 = r5.A00
            if (r1 == 0) goto Lc9
            X.AbstractC31171DnF.A1P(r1)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0xB r0 = X.GWQ.A03
            X.2tP r3 = X.C62862tP.A01(r3, r1, r0, r2)
            java.lang.String r0 = r5.A00()
            X.VsL r2 = new X.VsL
            r2.<init>(r0)
            X.FM5 r0 = r5.A02
            if (r0 == 0) goto Lc6
            java.util.Map r0 = r0.A03
            r2.A04 = r0
            r1 = 7
            X.FvQ r0 = new X.FvQ
            r0.<init>(r5, r1)
            r2.A02 = r0
            android.app.Activity r0 = r5.A00
            if (r0 == 0) goto Lc9
            r2.A00(r0, r3)
            return r4
        Lc0:
            android.app.Activity r0 = r6.A00
            if (r0 == 0) goto Ld6
            goto L28
        Lc6:
            java.lang.String r0 = "unifiedLauncherFlowConfig"
            goto Lce
        Lc9:
            java.lang.String r0 = "activity"
            goto Lce
        Lcc:
            java.lang.String r0 = "window"
        Lce:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ef3.A01(com.instagram.common.session.UserSession):boolean");
    }

    public Ef3(Activity activity, AbstractC12990ll abstractC12990ll, GZY gzy) {
        super(activity, abstractC12990ll);
        A00(abstractC12990ll, this, gzy);
    }

    @Override // X.AbstractC35025Fby
    public final void A03() {
        super.A03();
        this.A00.markerPoint(444800256, "hide_loading_state");
    }

    public final void A05(String str) {
        int length = str.length();
        G04 g04 = this.A01;
        String str2 = this.A05;
        HashMap A1G = AbstractC166987dD.A1G();
        if (length == 0) {
            G04.A00(g04, "client_flow_failed", "Client Flow Interrupted", str2, A1G);
            this.A02.onAuthorizeFail();
        } else {
            G04.A00(g04, "client_flow_succeeded", "", str2, A1G);
            this.A02.onAuthorizeSuccess(str, this.A05);
        }
    }

    public Ef3(Fragment fragment, AbstractC12990ll abstractC12990ll, GZY gzy) {
        super(fragment, abstractC12990ll);
        A00(abstractC12990ll, this, gzy);
    }
}
