package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Dyl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31827Dyl extends AbstractC52922bZ {
    public final C05A A00 = C10E.A00(C32939EeK.A00);
    public final C05A A01 = AbstractC31179DnN.A0h();

    public final void A02() {
        Object value;
        LinkedHashMap A03;
        C05A c05a = this.A01;
        do {
            value = c05a.getValue();
            A03 = AbstractC06930Yk.A03((Map) value);
            A03.clear();
        } while (!c05a.AIi(value, A03));
    }

    public final void A03(User user) {
        Object value;
        LinkedHashMap A03;
        C05A c05a = this.A01;
        do {
            value = c05a.getValue();
            A03 = AbstractC06930Yk.A03((Map) value);
            boolean containsKey = A03.containsKey(user.getUsername());
            String username = user.getUsername();
            if (containsKey) {
                A03.remove(username);
            } else {
                A03.put(username, user);
            }
        } while (!c05a.AIi(value, A03));
    }
}
