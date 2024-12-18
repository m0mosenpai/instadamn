package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Agk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23835Agk implements InterfaceC25180BCd {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C47Z A02;

    public C23835Agk(Context context, UserSession userSession, C47Z c47z) {
        this.A01 = userSession;
        this.A02 = c47z;
        this.A00 = context;
    }

    @Override // X.InterfaceC25180BCd
    public final void DxP() {
        C9O1.A07(this.A00, this.A01, this.A02, "photo_prepare_failed_for_one_tap_send");
    }

    @Override // X.InterfaceC25180BCd
    public final /* bridge */ /* synthetic */ void DxQ(Object obj) {
        A8F a8f = (A8F) obj;
        UserSession userSession = this.A01;
        C47Z c47z = this.A02;
        C9O1.A0D(userSession, a8f.A02, c47z);
        int i = a8f.A01;
        int i2 = a8f.A00;
        C9O1.A0F(userSession, c47z, i, i2);
        C47Z c47z2 = new MYQ(c47z).A01;
        c47z2.A0H = i;
        c47z2.A0G = i2;
    }
}
