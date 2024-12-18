package X;

import android.content.Context;
import android.widget.Toast;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LJ8 {
    public static LJ8 A0C;
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C44915JuT A09;
    public final C44916JuU A0A;
    public final UserSession A0B;

    public final void A03(Context context, String str, String str2) {
        UserSession userSession = this.A0B;
        AnonymousClass637 A00 = VRA.A00(userSession, false);
        if (A05(str, str2)) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36326704540694571L);
            A00(this, str);
            A01(context, A00, new MHY(this, context, A00, str, 0, A06));
        }
    }

    public final boolean A04(String str, String str2) {
        if (!A05(str, str2)) {
            return false;
        }
        return C18U.A06(C06090Tz.A05, this.A0B, 36326704540563498L);
    }

    public final void A01(Context context, AnonymousClass637 anonymousClass637, InterfaceC16820sZ interfaceC16820sZ) {
        UserSession userSession = this.A0B;
        C14360o3.A0B(userSession, 1);
        C30752Dfp c30752Dfp = new C30752Dfp(0, this, anonymousClass637, interfaceC16820sZ);
        DH1 dh1 = new DH1(41, context, this);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        C48146LSv.A00(new C58510Pwe(c30752Dfp, 0), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "FetchAEScreenQueryLaunchDataQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), QQO.class, false, null, 0, null, AbstractC58317Pt9.A00(1067), AbstractC166987dD.A1E()), A01, dh1, 6);
    }

    public final boolean A05(String str, String str2) {
        String str3;
        if (str.equals(AbstractC111324zv.A00(993))) {
            int hashCode = str2.hashCode();
            if (hashCode != -80854192) {
                if (hashCode != 610004705) {
                    if (hashCode == 2055510097) {
                        str3 = "ig_edit_profile_identity_sheet_profile_picture";
                    }
                } else {
                    str3 = "ig_edit_profile_cta_dialog";
                }
                if (str2.equals(str3)) {
                    return true;
                }
            } else if (str2.equals("ig_edit_profile_identity_sheet_avatar")) {
                return true;
            }
        }
        return false;
    }

    public LJ8(UserSession userSession) {
        this();
        this.A0B = userSession;
        C44916JuU c44916JuU = C44916JuU.A01;
        if (c44916JuU == null) {
            c44916JuU = new C44916JuU();
            C44916JuU.A01 = c44916JuU;
        }
        this.A0A = c44916JuU;
        C44915JuT c44915JuT = C44915JuT.A03;
        if (c44915JuT == null) {
            c44915JuT = new C44915JuT(userSession);
            C44915JuT.A03 = c44915JuT;
        }
        this.A09 = c44915JuT;
    }

    public static final void A00(LJ8 lj8, String str) {
        String A0o = AbstractC166997dE.A0o();
        lj8.A05 = A0o;
        C44916JuU c44916JuU = lj8.A0A;
        C14360o3.A0B(A0o, 0);
        QuickPerformanceLogger quickPerformanceLogger = c44916JuU.A00;
        quickPerformanceLogger.markerStart(231933580, 0);
        quickPerformanceLogger.markerPoint(231933580, 0, "editor_native_launch_data_fetch_start");
        quickPerformanceLogger.markerAnnotate(231933580, 0, "prefetch_session_id", A0o);
        quickPerformanceLogger.markerAnnotate(231933580, 0, "surface", str);
    }

    public final void A02(Context context, String str) {
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        if (C18U.A06(C06090Tz.A05, this.A0B, 36326704540825644L)) {
            Toast.makeText(context, str, A1Y ? 1 : 0).show();
        }
    }

    public LJ8() {
        this.A01 = "unknown";
        this.A05 = "";
    }
}
