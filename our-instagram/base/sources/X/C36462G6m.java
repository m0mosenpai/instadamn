package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* renamed from: X.G6m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36462G6m implements InterfaceC37279GbW {
    public final InterfaceC09390do A01;
    public final C43655JSn A03;
    public final C41761wQ A02 = AbstractC31174DnI.A0S();
    public final List A00 = AbstractC166987dD.A1J("instagram_secure_thread_model");

    @Override // X.InterfaceC37279GbW
    public final C42221xC APK() {
        C42221xC c42221xC = this.A03.A01;
        C14360o3.A07(c42221xC);
        return c42221xC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.MNN, java.lang.Object] */
    @Override // X.InterfaceC37279GbW
    public final void ChR() {
        this.A03.A01(new Object());
    }

    @Override // X.InterfaceC37279GbW
    public final void start() {
        this.A03.A00();
        GKK.A00(C137766Ly.A00(((C137756Lx) this.A01.getValue()).A01).A0M(new C36264FzH(this)), this.A02, this, 26);
    }

    @Override // X.InterfaceC37279GbW
    public final void stop() {
        this.A03.A03.A01();
        this.A02.A01();
    }

    public C36462G6m(Context context, UserSession userSession, Capabilities capabilities, InterfaceC83733oI interfaceC83733oI) {
        this.A03 = AbstractC34199F6x.A00(context, userSession, capabilities, interfaceC83733oI);
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37054GUk(userSession, 5));
    }
}
