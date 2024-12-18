package X;

import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.GQe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36961GQe implements Runnable {
    public final /* synthetic */ C36155FxU A00;
    public final /* synthetic */ C42281xI A01;
    public final /* synthetic */ C34946FaW A02;
    public final /* synthetic */ C34947FaX A03;

    public RunnableC36961GQe(C36155FxU c36155FxU, C42281xI c42281xI, C34946FaW c34946FaW, C34947FaX c34947FaX) {
        this.A00 = c36155FxU;
        this.A01 = c42281xI;
        this.A02 = c34946FaW;
        this.A03 = c34947FaX;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.EB0, java.lang.Object, X.1um] */
    @Override // java.lang.Runnable
    public final void run() {
        User user = this.A01.A00;
        C34946FaW c34946FaW = this.A02;
        if (c34946FaW != null) {
            if (!user.CYY() && !user.CQf()) {
                Map map = c34946FaW.A01;
                if (map.containsKey(user.getId())) {
                    c34946FaW.A00.remove(map.remove(user.getId()));
                    C34946FaW.A00(c34946FaW);
                }
            } else {
                Map map2 = c34946FaW.A01;
                if (!map2.containsKey(user.getId())) {
                    ?? c40791um = new C40791um();
                    FY9.A01(user, c40791um);
                    c34946FaW.A00.push(c40791um);
                    map2.put(user.getId(), c40791um);
                    C34946FaW.A00(c34946FaW);
                }
            }
        }
        C34947FaX c34947FaX = this.A03;
        if (c34947FaX != null) {
            if (user.CYY() || user.CQf()) {
                Map map3 = c34947FaX.A02;
                if (map3.containsKey(user.getId())) {
                    c34947FaX.A01.remove(map3.remove(user.getId()));
                    C34947FaX.A00(c34947FaX);
                }
            }
        }
    }
}
