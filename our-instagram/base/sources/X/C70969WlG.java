package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.WlG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70969WlG implements InterfaceC71979XDo {
    public final /* synthetic */ C67973V4n A00;

    public C70969WlG(C67973V4n c67973V4n) {
        this.A00 = c67973V4n;
    }

    @Override // X.InterfaceC71979XDo
    public final void DFf() {
        C66095TzW.A00(this.A00.A03);
    }

    @Override // X.InterfaceC71979XDo
    public final void DGX(EnumC68206VFy enumC68206VFy, C67847UzS c67847UzS, boolean z) {
        List A06;
        C67973V4n c67973V4n = this.A00;
        Map map = c67973V4n.A0L;
        List list = (List) map.get(enumC68206VFy);
        if (list == null) {
            list = new ArrayList();
            map.put(enumC68206VFy, list);
        }
        if (z) {
            list.clear();
        }
        UserSession userSession = c67973V4n.A0I;
        List list2 = c67847UzS.A03;
        if (list2 == null) {
            A06 = Collections.emptyList();
        } else {
            C14360o3.A0B(userSession, 0);
            A06 = C127895qI.A06(userSession, null, list2);
        }
        list.addAll(A06);
        C67973V4n.A01(enumC68206VFy, c67973V4n);
    }

    @Override // X.InterfaceC71979XDo
    public final void DRY() {
        C65823Tug c65823Tug = this.A00.A04;
        if (c65823Tug != null) {
            C65823Tug.A00(c65823Tug, false, true);
        }
    }

    @Override // X.InterfaceC71979XDo
    public final void DRb() {
        C65823Tug c65823Tug = this.A00.A04;
        if (c65823Tug != null) {
            C65823Tug.A00(c65823Tug, true, true);
        }
    }
}
