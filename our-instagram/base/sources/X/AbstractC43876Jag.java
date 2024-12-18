package X;

import com.instagram.common.gallery.Draft;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Jag, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43876Jag {
    public static final ArrayList A00(UserSession userSession) {
        Draft draft;
        C47Z A03;
        String str;
        C47Z A032;
        int i;
        C14360o3.A0B(userSession, 0);
        List<C47Z> A07 = C25A.A00(userSession).A07();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C47Z c47z : A07) {
            int ordinal = c47z.A1G.ordinal();
            if (ordinal != 1) {
                if (ordinal != 0) {
                    if (ordinal == 4 && (A03 = C25A.A00(userSession).A03(c47z.A35)) != null && (str = (String) AbstractC001800i.A0O(A03.A0L(), 0)) != null && (A032 = C25A.A00(userSession).A03(str)) != null) {
                        String str2 = c47z.A35;
                        boolean A11 = A032.A11();
                        if (A11) {
                            ClipInfo clipInfo = A032.A1N;
                            i = clipInfo.A05 - clipInfo.A07;
                        } else {
                            i = 0;
                        }
                        draft = new Draft(Long.valueOf(c47z.A0g), str2, A032.A33, c47z.A2m, i, A11, true, false, true);
                    }
                } else {
                    draft = new Draft(Long.valueOf(c47z.A0g), c47z.A35, c47z.A33, c47z.A2m, 0, false, false, c47z.A0s(), true);
                }
                A1E.add(draft);
            } else if (c47z.A1A == C5JK.A06 || !C18U.A06(C06090Tz.A05, userSession, 36328139060821221L)) {
                String str3 = c47z.A35;
                ClipInfo clipInfo2 = c47z.A1N;
                int i2 = clipInfo2.A05 - clipInfo2.A07;
                String str4 = c47z.A33;
                boolean z = false;
                if (c47z.A0D() == ShareType.A09) {
                    z = true;
                }
                draft = new Draft(Long.valueOf(c47z.A0g), str3, str4, c47z.A2m, i2, true, false, false, !z);
                A1E.add(draft);
            }
        }
        return A1E;
    }
}
