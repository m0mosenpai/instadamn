package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P2J implements JIG {
    public final MZA A00;

    @Override // X.JIG
    public final boolean Cdd(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A00.A0J(c38321qM);
    }

    @Override // X.JIG
    public final void E3f(String str) {
        this.A00.A09();
    }

    @Override // X.JIG
    public final void EE9() {
        this.A00.A0A();
    }

    @Override // X.JIG
    public final void EKj() {
        this.A00.A0B();
    }

    @Override // X.JIG
    public final void EUs(C38321qM c38321qM, boolean z) {
        this.A00.A0E(z);
    }

    @Override // X.JIG
    public final void Eh6(C38321qM c38321qM, boolean z) {
        this.A00.A0F(z);
    }

    @Override // X.JIG
    public final void EoV(String str, boolean z) {
        this.A00.A0D(str, z);
    }

    @Override // X.JIG
    public final int Eoj(C38321qM c38321qM, String str, boolean z) {
        MZA mza = this.A00;
        mza.A0D(str, z);
        return mza.A00;
    }

    public P2J(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, long j) {
        this.A00 = new MZA(context, userSession, interfaceC60442pS, str, j);
    }

    @Override // X.JIG
    public final void E8Y(InterfaceC58117Ppg interfaceC58117Ppg, C38321qM c38321qM) {
        AbstractC167017dG.A1N(c38321qM, interfaceC58117Ppg);
        this.A00.A0I(interfaceC58117Ppg, c38321qM);
    }
}
