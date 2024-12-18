package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bcb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25876Bcb extends AbstractC52922bZ {
    public C26042BfV A00;
    public final UserSession A01;
    public final CUN A02;
    public final String A03;
    public final InterfaceC06180Ui A04;
    public final InterfaceC06180Ui A05;
    public final InterfaceC15070pN A06;
    public final InterfaceC15070pN A07;

    public C25876Bcb(UserSession userSession, CUN cun, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = cun;
        Integer num = C05F.A00;
        AnonymousClass057 A00 = C10M.A00(num, 1, 0);
        this.A05 = A00;
        this.A07 = new C06160Ug(null, A00);
        AnonymousClass057 A002 = C10M.A00(num, 0, 0);
        this.A04 = A002;
        this.A06 = new C06160Ug(null, A002);
        A04();
    }

    public static final void A03(Challenge challenge, C25876Bcb c25876Bcb, boolean z) {
        AbstractC166987dD.A1Z(new PZO(challenge, c25876Bcb, null, 9, z), AbstractC141776au.A00(c25876Bcb));
    }

    public static final void A01(Achievement achievement, C25876Bcb c25876Bcb) {
        C28458ChA.A00.A08(c25876Bcb.A01, "achievements_hub", "achievement_cell", c25876Bcb.A03, null, AbstractC166987dD.A1J(String.valueOf(achievement.A01)), AbstractC166987dD.A1J(achievement), null, null);
    }

    public static final void A02(Challenge challenge, C25876Bcb c25876Bcb) {
        C28458ChA.A00.A05(c25876Bcb.A01, null, "achievements_hub", AbstractC43591JPw.A00(833), c25876Bcb.A03, null, null, null, AbstractC166987dD.A1J(Long.valueOf(challenge.A02)), null, AbstractC166987dD.A1J(challenge), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List A00(Achievement achievement, List list) {
        ?? r5;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Badge badge = (Badge) it.next();
            if (badge instanceof Badge.AchievementBadge) {
                List A1J = AbstractC166987dD.A1J(badge);
                r5 = AbstractC166987dD.A1E();
                for (Object obj : A1J) {
                    if (((Badge.AchievementBadge) badge).A01.A02 == achievement.A02) {
                        r5.add(obj);
                    }
                }
            } else if (badge instanceof Badge.AchievementTieredBadge) {
                List list2 = ((Badge.AchievementTieredBadge) badge).A04;
                r5 = AbstractC166987dD.A1E();
                for (Object obj2 : list2) {
                    if (((Badge.AchievementBadge) obj2).A01.A02 == achievement.A02) {
                        r5.add(obj2);
                    }
                }
            } else {
                r5 = C16930sl.A00;
            }
            AnonymousClass016.A16(r5, A1E);
        }
        return A1E;
    }

    public final void A04() {
        C141796aw A00 = AbstractC141776au.A00(this);
        D4z A02 = D4z.A02(this, null, 15);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, D4z.A02(this, null, 17), AbstractC25235BEs.A0W(this, anonymousClass191, D4z.A02(this, null, 16), AbstractC25235BEs.A0W(this, anonymousClass191, A02, A00)));
    }
}
