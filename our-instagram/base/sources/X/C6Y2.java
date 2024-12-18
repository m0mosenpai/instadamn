package X;

import android.content.Context;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.6Y2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Y2 {
    public int A00;
    public int A01;
    public Integer A02;
    public final Context A03;
    public final UserSession A04;
    public final C6Y3 A05;
    public final C6Y5 A06;
    public final C145816he A07;
    public final C26281Pj A08;

    public C6Y2(Context context, UserSession userSession, C145816he c145816he, C26281Pj c26281Pj) {
        C14360o3.A0B(c26281Pj, 4);
        this.A03 = context;
        this.A04 = userSession;
        this.A07 = c145816he;
        this.A08 = c26281Pj;
        this.A05 = new C6Y3(userSession, c145816he);
        this.A02 = C05F.A00;
        this.A06 = new C6Y5(userSession, new C6Y4(this), c145816he);
    }

    public static final Integer A00(C41551w4 c41551w4, C6Y2 c6y2) {
        List list;
        if (C18U.A06(C06090Tz.A06, c6y2.A04, 36317792485906013L) || ((list = c41551w4.A0H.A14) != null && list.contains(IGPostTriggerExperience.A0B))) {
            return C05F.A02;
        }
        return C05F.A0u;
    }

    public static final boolean A01(C41551w4 c41551w4, C6Y2 c6y2) {
        Reel reel;
        List list;
        if (C18U.A06(C06090Tz.A06, c6y2.A04, 36317792485906013L) || ((list = (reel = c41551w4.A0H).A14) != null && list.contains(IGPostTriggerExperience.A0A))) {
            return true;
        }
        List list2 = reel.A14;
        if (list2 != null && list2.contains(IGPostTriggerExperience.A0B)) {
            return true;
        }
        return false;
    }
}
