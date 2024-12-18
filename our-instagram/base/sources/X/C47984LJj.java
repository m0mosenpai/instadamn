package X;

import android.app.Activity;
import android.util.Base64;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.util.Map;

/* renamed from: X.LJj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47984LJj {
    public static final Map A02 = AbstractC06930Yk.A06(AbstractC166987dD.A1L("ig_user_impersonation_me", 1), AbstractC166987dD.A1L("ig_user_impersonation_someone_i_know", 1), AbstractC166987dD.A1L("ig_user_impersonation_someone_i_follow", 1), AbstractC166987dD.A1L("ig_user_impersonation_someone_else", 1), AbstractC167007dF.A0o("ig_impersonation_celebrity", 2));
    public final UserSession A00;
    public final Activity A01;

    public static final C42221xC A00(C47984LJj c47984LJj, String str, long j) {
        C137756Lx A00 = C137746Lw.A00(c47984LJj.A00, "MsysReportUtil");
        C42221xC A002 = C43601JQh.A00(C137766Ly.A00(A00.A01), C50349MLb.A00, 15);
        final MI5 mi5 = new MI5(A00, str, 3, j);
        return A002.A0L(new C6D2() { // from class: X.LaN
            @Override // X.C6D2
            public final /* synthetic */ Object apply(Object obj) {
                return InterfaceC16660sJ.this.invoke(obj);
            }
        });
    }

    public static final boolean A01(String str, Map map) {
        CommonMediaTransport A03;
        if (str != null && (A03 = LLT.A03(str)) != null) {
            AbstractC1345065z abstractC1345065z = K3X.A00;
            Object A00 = abstractC1345065z.A00(65);
            Object A002 = abstractC1345065z.A00(66);
            Object A003 = abstractC1345065z.A00(64);
            String str2 = A03.mediaKey_;
            C14360o3.A07(str2);
            byte[] decode = Base64.decode(str2, 2);
            C14360o3.A07(decode);
            map.put(A00, decode);
            map.put(A002, A03.mimetype_);
            map.put(A003, A03.directPath_);
            return true;
        }
        return false;
    }

    public C47984LJj(Activity activity, UserSession userSession) {
        this.A01 = activity;
        this.A00 = userSession;
    }

    public final void A02(C131845xK c131845xK, InterfaceC103384lE interfaceC103384lE) {
        AbstractC167017dG.A1N(interfaceC103384lE, c131845xK);
        C9GR.A0B(this.A01, "something_went_wrong");
        C131845xK.A00(c131845xK.A00, C6FW.A01, interfaceC103384lE);
    }
}
