package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Agl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23836Agl implements InterfaceC25180BCd {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C23836Agl(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25180BCd
    public final void DxP() {
        if (this.A00 != 0) {
            C9O1.A07((Context) this.A01, (UserSession) this.A04, (C47Z) this.A03, "template_background_render_failure");
        } else {
            ((InterfaceC16660sJ) this.A01).invoke(new Error("Could not render image"));
        }
    }

    @Override // X.InterfaceC25180BCd
    public final /* bridge */ /* synthetic */ void DxQ(Object obj) {
        A8F a8f = (A8F) obj;
        if (this.A00 != 0) {
            C47Z A03 = C9O1.A03((UserSession) this.A04, ShareType.A0Z);
            A03.A33 = a8f.A02.A08;
            ((C47Z) this.A03).A0V(A03);
            ((Runnable) this.A02).run();
            return;
        }
        C14360o3.A0B(a8f, 0);
        UserSession userSession = (UserSession) this.A04;
        C47Z c47z = (C47Z) this.A03;
        C9O1.A0D(userSession, a8f.A02, c47z);
        MYQ myq = new MYQ(c47z);
        int i = a8f.A01;
        int i2 = a8f.A00;
        C47Z c47z2 = myq.A01;
        c47z2.A0H = i;
        c47z2.A0G = i2;
        C9O1.A0F(userSession, c47z, i, i2);
        ((InterfaceC16660sJ) this.A02).invoke(c47z);
    }
}
