package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ah7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23855Ah7 implements InterfaceC25185BCi {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C22987ABm A02;
    public final /* synthetic */ C47Z A03;

    public C23855Ah7(Context context, UserSession userSession, C22987ABm c22987ABm, C47Z c47z) {
        this.A02 = c22987ABm;
        this.A03 = c47z;
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC25185BCi
    public final void DXL() {
        C9O1.A07(this.A00, this.A01, this.A03, "template_overlay_failed_to_save");
    }

    @Override // X.InterfaceC25185BCi
    public final void DXM(String str) {
        this.A02.A00(str);
    }
}
