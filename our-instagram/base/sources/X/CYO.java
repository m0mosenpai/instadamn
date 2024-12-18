package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeButtonInfo;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.creator.achievements.modules.models.Badge;

/* loaded from: classes5.dex */
public abstract class CYO {
    public static final Badge.AchievementBadge A00(Achievement achievement, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        C14360o3.A0B(achievement, 0);
        long j = achievement.A01;
        String obj = achievement.A03.toString();
        if (z2) {
            str = achievement.A0A;
        } else {
            str = achievement.A08;
        }
        if (z) {
            str2 = achievement.A09;
        } else {
            str2 = achievement.A0B;
        }
        if (z) {
            str3 = achievement.A07;
        } else {
            str3 = achievement.A06;
        }
        return new Badge.AchievementBadge(achievement, achievement.A05, achievement.A04, Integer.valueOf(achievement.A00), obj, str, str3, str2, j, z);
    }

    public static final Badge.ChallengeBadge A01(Challenge challenge, boolean z) {
        String str;
        C14360o3.A0B(challenge, 0);
        long j = challenge.A02;
        String obj = challenge.A05.toString();
        String str2 = challenge.A0C;
        String str3 = challenge.A0F;
        String str4 = challenge.A0B;
        String str5 = challenge.A0A;
        String str6 = challenge.A0E;
        ChallengeButtonInfo challengeButtonInfo = challenge.A04;
        if (challengeButtonInfo != null) {
            str = challengeButtonInfo.Aj7();
        } else {
            str = null;
        }
        return new Badge.ChallengeBadge(challenge, challenge.A07, Integer.valueOf(challenge.A00), Integer.valueOf(challenge.A01), obj, str2, str3, str4, str5, str6, str, challenge.A0D, str4, j, z, AbstractC167007dF.A1X(challenge.A06, ChallengeState.A07));
    }
}
