package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class WlH implements InterfaceC71979XDo {
    public final /* synthetic */ V1B A00;

    public WlH(V1B v1b) {
        this.A00 = v1b;
    }

    @Override // X.InterfaceC71979XDo
    public final void DFf() {
        V1B v1b = this.A00;
        v1b.A00.A00.A01();
        C66095TzW.A00(v1b.A05);
        C9GR.A03(v1b.getContext(), AbstractC166997dE.A0N(v1b).getString(2131974293), "onFeedRequestFail", 0);
    }

    @Override // X.InterfaceC71979XDo
    public final void DGX(EnumC68206VFy enumC68206VFy, C67847UzS c67847UzS, boolean z) {
        List A06;
        V1B v1b = this.A00;
        v1b.A00.A00.A05();
        UserSession userSession = v1b.A02;
        List list = c67847UzS.A03;
        if (list == null) {
            A06 = Collections.emptyList();
        } else {
            C14360o3.A0B(userSession, 0);
            A06 = C127895qI.A06(userSession, null, list);
        }
        if (z) {
            v1b.A07.A06(enumC68206VFy);
        }
        v1b.A07.A07(enumC68206VFy, A06);
        v1b.A08.A00();
        if (z && v1b.mView != null) {
            v1b.A06.A02();
        }
    }

    @Override // X.InterfaceC71979XDo
    public final void DRY() {
        C65823Tug c65823Tug = this.A00.A06;
        if (c65823Tug != null) {
            C65823Tug.A00(c65823Tug, false, true);
        }
    }

    @Override // X.InterfaceC71979XDo
    public final void DRb() {
        this.A00.A00.A00.A04();
    }
}
