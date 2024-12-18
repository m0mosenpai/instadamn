package X;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes5.dex */
public final class CUV {
    public final C26773Bru A00(String str, String str2, List list, List list2) {
        AbstractC167017dG.A1N(str, list);
        C26773Bru c26773Bru = new C26773Bru();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("entryPoint", str2);
        A0b.putString("achievementTitle", str);
        A0b.putParcelableArrayList("earnedAchievementTierList", AbstractC166987dD.A1F(list));
        A0b.putParcelableArrayList("unearnedAchievementTierList", AbstractC166987dD.A1F(list2));
        c26773Bru.setArguments(A0b);
        return c26773Bru;
    }

    public final C26772Brt A01(String str, List list) {
        AbstractC167017dG.A1N(str, list);
        C26772Brt c26772Brt = new C26772Brt();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("challengeTitle", str);
        A0b.putParcelableArrayList("challengeTierList", AbstractC166987dD.A1F(list));
        c26772Brt.setArguments(A0b);
        return c26772Brt;
    }
}
