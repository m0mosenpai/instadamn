package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.LwD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49620LwD implements InterfaceC1119153d {
    public final /* synthetic */ C1576575z A00;
    public final /* synthetic */ C14510oO A01;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C49620LwD(C1576575z c1576575z, C14510oO c14510oO) {
        this.A00 = c1576575z;
        this.A01 = c14510oO;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        String str;
        C1VN A00 = AbstractC31282Dp4.A00();
        C1576575z c1576575z = this.A00;
        Activity activity = c1576575z.A02;
        UserSession userSession = c1576575z.A03;
        if (this.A01.A00) {
            str = "885781683067780";
        } else {
            str = "852935213635690";
        }
        A00.A02(userSession, activity, str);
    }
}
