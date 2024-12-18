package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cuj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29240Cuj implements InterfaceC30941Div {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C1ZE A02;
    public final /* synthetic */ C189478aR A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    @Override // X.InterfaceC30941Div
    public final void CuR(Achievement achievement) {
        ArrayList arrayList;
        C1ZE c1ze = this.A02;
        C189448aO A01 = AbstractC47841LBf.A01(this.A00, this.A01);
        Map map = this.A05;
        List list = (List) map.get(achievement);
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (((Badge.AchievementBadge) obj).A09) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        List list2 = (List) map.get(achievement);
        if (list2 != null) {
            arrayList2 = AbstractC166987dD.A1E();
            for (Object obj2 : list2) {
                if (!((Badge.AchievementBadge) obj2).A09) {
                    arrayList2.add(obj2);
                }
            }
        }
        c1ze.A00();
        this.A03.A0F(AbstractC27636CHh.A00(String.valueOf(achievement.A01), null, this.A04, arrayList, arrayList2, true, false), A01);
    }

    public C29240Cuj(FragmentActivity fragmentActivity, UserSession userSession, C1ZE c1ze, C189478aR c189478aR, String str, Map map) {
        this.A02 = c1ze;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = map;
        this.A04 = str;
        this.A03 = c189478aR;
    }
}
