package X;

import android.os.Build;
import android.os.Bundle;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.D5y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29656D5y extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C26773Bru A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29656D5y(C26773Bru c26773Bru) {
        super(0);
        this.A00 = c26773Bru;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.A00.mArguments;
        if (i >= 33) {
            if (bundle == null) {
                return null;
            }
            return bundle.getParcelableArrayList("earnedAchievementTierList", Badge.AchievementBadge.class);
        }
        if (bundle == null) {
            return null;
        }
        return bundle.getParcelableArrayList("earnedAchievementTierList");
    }
}
