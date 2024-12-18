package X;

import com.instagram.user.model.User;
import java.util.Comparator;

/* loaded from: classes6.dex */
public final class GRK implements Comparator {
    public static final GRK A00 = new GRK();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C32107E9f c32107E9f = (C32107E9f) obj;
        C32107E9f c32107E9f2 = (C32107E9f) obj2;
        AbstractC167017dG.A1N(c32107E9f, c32107E9f2);
        User user = c32107E9f.A00;
        String fullName = user.getFullName();
        String username = user.getUsername();
        c32107E9f.CQw();
        if (fullName == null || fullName.isEmpty()) {
            fullName = username;
        }
        User user2 = c32107E9f2.A00;
        String fullName2 = user2.getFullName();
        String username2 = user2.getUsername();
        c32107E9f2.CQw();
        if (fullName2 == null || fullName2.isEmpty()) {
            fullName2 = username2;
        }
        return fullName.compareToIgnoreCase(fullName2);
    }
}
