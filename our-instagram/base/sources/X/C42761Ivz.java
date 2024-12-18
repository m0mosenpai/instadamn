package X;

import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ivz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42761Ivz implements InterfaceC114755Gg {
    public final /* synthetic */ C37434GeE A00;

    public C42761Ivz(C37434GeE c37434GeE) {
        this.A00 = c37434GeE;
    }

    @Override // X.InterfaceC114755Gg
    public final int BXv() {
        C37434GeE c37434GeE = this.A00;
        User user = c37434GeE.A01;
        int i = 0;
        if (user != null) {
            String id = user.getId();
            List AZV = c37434GeE.A06.AZV();
            C14360o3.A07(AZV);
            Iterator it = AZV.iterator();
            while (it.hasNext()) {
                if (AbstractC31172DnG.A0i(it).A6o(id)) {
                    i++;
                }
            }
        }
        return i;
    }
}
