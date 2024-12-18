package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.GRo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36997GRo implements InterfaceC16660sJ {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C1YA A03;

    public C36997GRo(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, C1YA c1ya) {
        this.A03 = c1ya;
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        VG2 vg2 = VG2.A0M;
        UserSession userSession = this.A02;
        C1YA.A00(this.A00, this.A01, userSession, this.A03.A00, vg2);
        return null;
    }
}
