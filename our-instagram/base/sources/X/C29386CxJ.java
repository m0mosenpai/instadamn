package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.CxJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29386CxJ implements InterfaceC1119153d {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C145176gc A01;
    public final /* synthetic */ C14510oO A02;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C29386CxJ(FragmentActivity fragmentActivity, C145176gc c145176gc, C14510oO c14510oO) {
        this.A02 = c14510oO;
        this.A00 = fragmentActivity;
        this.A01 = c145176gc;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        if (this.A02.A00) {
            C1ZF A00 = F1A.A00();
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01.A09;
            if (userSession == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            A00.A05(fragmentActivity, userSession, "achievement_sticker_consumption", C16930sl.A00);
        }
        this.A01.A18.EJJ();
    }
}
