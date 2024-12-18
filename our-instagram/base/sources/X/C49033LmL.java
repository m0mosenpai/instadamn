package X;

import android.app.Activity;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LmL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49033LmL implements C7QA {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ L5W A02;
    public final /* synthetic */ InterfaceC163937Vh A03;
    public final /* synthetic */ DirectThreadKey A04;

    public C49033LmL(Activity activity, UserSession userSession, L5W l5w, InterfaceC163937Vh interfaceC163937Vh, DirectThreadKey directThreadKey) {
        this.A04 = directThreadKey;
        this.A02 = l5w;
        this.A00 = activity;
        this.A01 = userSession;
        this.A03 = interfaceC163937Vh;
    }

    @Override // X.C7QA
    public final /* bridge */ /* synthetic */ void DTA(MotionEvent motionEvent, Object obj, boolean z) {
        List list;
        KQ8 kq8 = (KQ8) obj;
        DirectThreadKey directThreadKey = this.A04;
        String str = directThreadKey.A00;
        L5W l5w = this.A02;
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        C83403nh c83403nh = kq8.A00;
        String str2 = c83403nh.A1u;
        C14360o3.A07(str2);
        C7TT c7tt = l5w.A0G;
        AnonymousClass988 anonymousClass988 = (AnonymousClass988) l5w.A0I.getValue();
        ArrayList A1E = AbstractC166987dD.A1E();
        if (c7tt != null) {
            boolean A1Z = AbstractC31172DnG.A1Z(userSession, str2);
            C7P8 A0f = AbstractC43594JPz.A0f(c83403nh);
            C7QQ c7qq = C7QQ.A00;
            int i = c7tt.A08;
            boolean z2 = c7tt.A14;
            boolean z3 = c7tt.A15;
            boolean A03 = C7QQ.A03(userSession, c83403nh, A0f, i, c7tt.A07, z2, z3, c7tt.A1A, c7tt.A0y, c7tt.A1D, c7tt.A11);
            if (A1Z && A03) {
                JQ0.A1L(C05F.A0Y, AbstractC166997dE.A0p(activity, 2131960774), A1E, R.drawable.instagram_delete_pano_outline_24);
            }
            if (anonymousClass988 != null) {
                if (c7qq.A05(userSession, anonymousClass988, c7tt.A0G, c83403nh, c7tt.A0P, i, c7tt.A1G, z2, z3, false)) {
                    JQ0.A1L(C05F.A0O, AbstractC166997dE.A0p(activity, 2131959872), A1E, R.drawable.instagram_delete_pano_outline_24);
                }
            }
        }
        A1E.isEmpty();
        User user = new User(userSession.userId, null);
        if (C18U.A06(C06090Tz.A06, userSession, 36320232025104536L)) {
            list = c83403nh.A0s(user);
        } else {
            String A0q = c83403nh.A0q(user);
            if (A0q != null) {
                list = AbstractC166987dD.A1J(A0q);
            } else {
                list = null;
            }
        }
        String str3 = directThreadKey.A01;
        InterfaceC163937Vh interfaceC163937Vh = this.A03;
        PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        C49089LnF c49089LnF = new C49089LnF(l5w);
        InterfaceC164877Za interfaceC164877Za = l5w.A0B;
        C49082Ln8 c49082Ln8 = l5w.A02;
        C36414G4p c36414G4p = l5w.A03;
        C49084LnA c49084LnA = l5w.A08;
        C49042LmU c49042LmU = l5w.A07;
        C14360o3.A0B(interfaceC163937Vh, 8);
        C49050Lmc c49050Lmc = C49050Lmc.A00;
        MessageIdentifier BSy = kq8.BSy();
        long micros = TimeUnit.MILLISECONDS.toMicros(kq8.BT8());
        LKl.A02(activity, pointF, null, userSession, kq8, c49042LmU, interfaceC164877Za, C49045LmX.A00, c49050Lmc, c49089LnF, C49077Ln3.A00, c49082Ln8, c49084LnA, C49085LnB.A00, c49089LnF, interfaceC163937Vh, c49089LnF, c36414G4p, kq8.Ar9(), BSy, directThreadKey, null, str, str3, null, A1E, list, null, MG8.A00, micros, true, C98Q.A00(userSession).A00(JRE.A05(directThreadKey), 42), true);
    }
}
