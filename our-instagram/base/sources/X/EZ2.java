package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZ2 extends C2AH {
    public final /* synthetic */ String A00;

    public EZ2(String str) {
        this.A00 = str;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C5e4 A0L = AbstractC31174DnI.A0L(obj);
        List list = A0L.A01("direct_ibc_inbox_invitations").A02;
        String str = this.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(AbstractC31172DnG.A0m(it).A08(), str)) {
                A0L.A07(str);
                return;
            }
        }
    }
}
