package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import java.io.Serializable;

/* renamed from: X.NXh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C52776NXh extends AbstractC33235ElU {
    public static final String __redex_internal_original_name = "RageshakeBottomSheetFragment";
    public NAU A00;
    public C54748OGw A01;
    public InterfaceC58266PsA A02;
    public C2AU A03;
    public BugReportSource A04;
    public OHF A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC09390do A0F = AbstractC60492pY.A01(this);
    public final View.OnClickListener A0D = new ViewOnClickListenerC55467OkM(this, 68);
    public final String A0E = "rageshake_bottom_sheet";

    public static final void A01(C52776NXh c52776NXh) {
        c52776NXh.A09 = true;
        AbstractC167017dG.A0y(c52776NXh.getActivity(), C3DN.A00);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        String str;
        Context A06 = AbstractC31173DnH.A06(view, 0);
        AbstractC31172DnG.A1B(A06, view, AbstractC53242c7.A02(A06));
        super.onViewCreated(view, bundle);
        A00(A06, this);
        C54748OGw c54748OGw = this.A01;
        if (c54748OGw == null) {
            C14360o3.A0F("logger");
            throw C00O.createAndThrow();
        }
        Integer A0Z = MSX.A0Z(this.A0B ? 1 : 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c54748OGw.A00, "rage_shake_impression");
        if (A0f.isSampled()) {
            if (A0Z.intValue() != 0) {
                str = "menu";
            } else {
                str = "shake";
            }
            AbstractC31175DnJ.A15(A0f, str);
        }
        C3DN A0l = AbstractC43593JPy.A0l(this, C3DN.A00);
        if (A0l != null) {
            A0l.A0R(new NXO(this, 0));
        } else {
            C0w9.A01.EmN("RageshakeBottomSheetFragment#bindBottomSheetNavListener", "BottomSheetNavigator.getBottomSheetNavigator() returned null, couldn't bind for listening to on dismiss.");
        }
        if (AbstractC14490oL.A09(A06)) {
            FragmentActivity activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                C04L.A00(window, true);
            }
            if (A0l != null) {
                ((C3DP) A0l).A0H = new C56769PHm(activity, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (((X.C2AV) r0).A00 != true) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r21, X.C52776NXh r22) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52776NXh.A00(android.content.Context, X.NXh):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0E;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0F);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1848731738);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A06 = requireArguments.getString("ARG_RAGESHAKE_BOTTOM_SHEET_AD_ID");
        Serializable serializable = requireArguments.getSerializable("ARG_BOTTOM_SHEET_BUG_REPORT_SOURCE");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.bugreporter.source.BugReportSource");
        this.A04 = (BugReportSource) serializable;
        this.A0B = requireArguments.getBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_MANUAL_REPORT_FROM_HELP_SETTING");
        this.A0C = requireArguments.getBoolean("ARG_RAGESHAKE_BOTTOM_SHEET_REPORT_FROM_LONG_PRESS");
        this.A0A = requireArguments.getBoolean("ARG_RAGESHAKE_DISMISSED_PREVIOUS_VIEWS");
        AbstractC18680vv session = getSession();
        this.A01 = new C54748OGw(session, this.A0E);
        this.A08 = requireArguments.getString("ARG_SCREEN_FROM");
        this.A07 = requireArguments.getString("ARG_NAV_CHAIN");
        C14360o3.A0B(session, 0);
        this.A03 = (C2AU) session.A00(C2AU.class);
        InterfaceC58266PsA A00 = OO8.A00(requireArguments, session);
        if (A00 instanceof C55868OrI) {
            A00 = OO8.A01(session);
        }
        this.A02 = A00;
        if (session instanceof UserSession) {
            this.A05 = new OHF((UserSession) session);
        }
        C0f9.A09(1827196043, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1565819063);
        super.onPause();
        NAU nau = this.A00;
        if (nau != null) {
            nau.A06();
            this.A00 = null;
            C0K8.A0D(__redex_internal_original_name, "onPause, cleaned up mLaunchBugReporterTask");
        }
        C0f9.A09(493056056, A02);
    }
}
