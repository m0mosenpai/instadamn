package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.G6l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36461G6l implements InterfaceC37279GbW {
    public final C43655JSn A00;

    @Override // X.InterfaceC37279GbW
    public final C42221xC APK() {
        C42221xC c42221xC = this.A00.A01;
        C14360o3.A07(c42221xC);
        return c42221xC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.MNN, java.lang.Object] */
    @Override // X.InterfaceC37279GbW
    public final void ChR() {
        this.A00.A01(new Object());
    }

    @Override // X.InterfaceC37279GbW
    public final void start() {
        this.A00.A00();
    }

    @Override // X.InterfaceC37279GbW
    public final void stop() {
        this.A00.A03.A01();
    }

    public C36461G6l(Context context, UserSession userSession, Capabilities capabilities, InterfaceC83733oI interfaceC83733oI) {
        this.A00 = AbstractC34199F6x.A00(context, userSession, capabilities, interfaceC83733oI);
    }
}
