package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LZV implements InterfaceC66482zP {
    public final User A00;
    public final List A01;

    public LZV(User user, List list) {
        C14360o3.A0B(user, 1);
        this.A00 = user;
        this.A01 = list;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        LZV lzv = (LZV) obj;
        String id = this.A00.getId();
        if (lzv != null) {
            str = lzv.A00.getId();
        } else {
            str = null;
        }
        if (C14360o3.A0K(id, str)) {
            List list = this.A01;
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0i.add(((C38321qM) ((C26086BgF) it.next()).A02).getId());
            }
            List list2 = lzv.A01;
            ArrayList A0i2 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                A0i2.add(((C38321qM) ((C26086BgF) it2.next()).A02).getId());
            }
            if (A0i.equals(A0i2)) {
                return true;
            }
        }
        return false;
    }
}
