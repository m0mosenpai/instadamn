package X;

import com.instagram.user.model.User;
import java.util.Comparator;

/* loaded from: classes6.dex */
public final class GRL implements Comparator {
    public static final GRL A00 = new GRL();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C32107E9f c32107E9f = (C32107E9f) obj;
        C32107E9f c32107E9f2 = (C32107E9f) obj2;
        AbstractC167017dG.A1N(c32107E9f, c32107E9f2);
        User user = c32107E9f.A00;
        String fullName = user.getFullName();
        String username = user.getUsername();
        boolean CQw = user.CQw();
        boolean z = user.A06;
        if (fullName == null || fullName.isEmpty() || !AbstractC101904i3.A09(fullName, CQw, z)) {
            fullName = username;
        }
        User user2 = c32107E9f2.A00;
        String fullName2 = user2.getFullName();
        String username2 = user2.getUsername();
        boolean CQw2 = user2.CQw();
        boolean z2 = user2.A06;
        if (fullName2 == null || fullName2.isEmpty() || !AbstractC101904i3.A09(fullName2, CQw2, z2)) {
            fullName2 = username2;
        }
        return fullName.compareToIgnoreCase(fullName2);
    }
}