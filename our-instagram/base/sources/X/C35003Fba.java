package X;

import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fba, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35003Fba {
    public int A00;
    public int A01;
    public String A02;
    public HashMap A03;
    public List A04;

    public final void A00(User user) {
        if (this.A04.remove(user)) {
            this.A00--;
        }
    }

    public C35003Fba(String str, List list, Map map, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A04 = AbstractC166987dD.A1F(list);
        this.A03 = new HashMap(map);
    }

    public C35003Fba() {
    }
}
