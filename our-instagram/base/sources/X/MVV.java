package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class MVV extends AbstractC116895Qv implements C38Y {
    public final Context A00;
    public final UserSession A01;
    public final C62832tM A02;
    public final MVW A03 = new MVW();
    public final C37546Gg2 A04;
    public final AbstractC39459Hbl A05;
    public final C37556GgC A06;
    public final String A07;
    public final String A08;
    public final C07T A09;
    public final InterfaceC11380iw A0A;

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        C14360o3.A0B(c37818GkY, 0);
        if (AbstractC166987dD.A1b(this.A05.A0L(EnumC129395t1.A09)) && MVa.A00(this.A01).A00().isEmpty()) {
            return;
        }
        List A00 = AbstractC37761Gja.A00(this.A01, this.A0A.getModuleName(), c37818GkY.A09);
        AbstractC166987dD.A1Z(new C57156PZa(this, A00, (InterfaceC23621Ds) null, 33), AbstractC57302k5.A00(this.A09));
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        C37546Gg2 c37546Gg2 = this.A04;
        AbstractC39459Hbl abstractC39459Hbl = this.A05;
        C37556GgC c37556GgC = this.A06;
        MVW.A00(this.A01, this.A02, c37546Gg2, abstractC39459Hbl, c37556GgC, this.A08);
    }

    public MVV(Context context, C07T c07t, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C62832tM c62832tM, C37546Gg2 c37546Gg2, AbstractC39459Hbl abstractC39459Hbl, C37556GgC c37556GgC, String str, String str2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A09 = c07t;
        this.A04 = c37546Gg2;
        this.A05 = abstractC39459Hbl;
        this.A06 = c37556GgC;
        this.A02 = c62832tM;
        this.A08 = str;
        this.A0A = interfaceC11380iw;
        this.A07 = str2;
    }
}
