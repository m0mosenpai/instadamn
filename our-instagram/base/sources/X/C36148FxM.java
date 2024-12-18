package X;

import com.instagram.profile.fragment.UserDetailTabController;
import java.util.List;

/* renamed from: X.FxM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36148FxM implements InterfaceC41501vz {
    public final /* synthetic */ C53K A00;

    public C36148FxM(C53K c53k) {
        this.A00 = c53k;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1857230053);
        C151746sK c151746sK = (C151746sK) obj;
        int A0N = AbstractC167017dG.A0N(c151746sK, -985571802);
        C53K c53k = this.A00;
        C47P c47p = c151746sK.A00;
        List list = c53k.A30.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj2 = list.get(i);
            if ((obj2 instanceof C47O) && c47p.getId() != null && C14360o3.A0K(c47p.getId(), ((C47O) obj2).getId())) {
                if (i >= 0) {
                    list.remove(i);
                    UserDetailTabController userDetailTabController = c53k.A0z;
                    if (userDetailTabController.A0O.A0A == EnumC155676yw.A04) {
                        userDetailTabController.A0F();
                    }
                }
            } else {
                i++;
            }
        }
        C0f9.A0A(-660573188, A0N);
        C0f9.A0A(-1557413150, A03);
    }
}
