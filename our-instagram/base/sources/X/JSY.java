package X;

import com.instagram.user.model.User;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class JSY implements C6D2 {
    public static final JSY A00 = new JSY();

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Long l;
        JSO jso = (JSO) obj;
        int i = jso.A00.A00;
        C4I3 c4i3 = jso.A01;
        C14360o3.A06(c4i3);
        List<C2EC> list = jso.A03;
        int size = list.size();
        if (AbstractC166987dD.A1b(list)) {
            l = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(((C2EH) list.get(AbstractC25226BEj.A05(list))).BLF()));
        } else {
            l = null;
        }
        HashSet A1H = AbstractC166987dD.A1H();
        for (C2EC c2ec : list) {
            if (!c2ec.CVQ() && (!c2ec.BSH().isEmpty())) {
                A1H.add(((User) c2ec.BSH().get(0)).getId());
            }
        }
        return new C65782Tu0(c4i3, l, A1H, i, size);
    }
}
