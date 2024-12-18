package X;

import com.instagram.banyan.BanyanCoordinator;
import com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZ3 extends C2AH {
    public final int A00;
    public final String A01;

    public EZ3(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                AbstractC31174DnI.A0L(obj).A06(this.A01);
                return;
            case 1:
                C5e4 A0L = AbstractC31174DnI.A0L(obj);
                String str = this.A01;
                if (!AbstractC167007dF.A1N(str.length())) {
                    List list = A0L.A01("direct_ibc_inbox_invitations").A02;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (C14360o3.A0K(AbstractC31172DnG.A0m(it).A08(), str)) {
                        }
                    }
                    return;
                }
                A0L.A08(AbstractC16960so.A1M("direct_ibc_inbox_invitations"));
                return;
            case 2:
                C5e4 A0L2 = AbstractC31174DnI.A0L(obj);
                String str2 = this.A01;
                BanyanCoordinator banyanCoordinator = A0L2.A00;
                C1ON A00 = AudienceListsApiUtil.A00(banyanCoordinator.A0I, str2);
                C32548EUy.A01(A00, banyanCoordinator, 3);
                AbstractC24641Ih.A00().schedule(A00);
                return;
            default:
                super.onSuccess(obj);
                return;
        }
    }
}
