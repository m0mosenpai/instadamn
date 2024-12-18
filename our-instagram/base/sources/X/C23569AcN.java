package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.AcN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23569AcN implements InterfaceC174767qC {
    public C177447ue A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public SurfaceTexture A04;
    public InterfaceC174657pz A05;
    public final InterfaceC175067qg A06;
    public final InterfaceC178407wE A07;
    public final InterfaceC175017qb A08;
    public final UserSession A09;
    public final String A0A;

    @Override // X.InterfaceC174767qC
    public final void A9h(InterfaceC25160BBf interfaceC25160BBf, int i) {
        this.A06.A9h(interfaceC25160BBf, 1);
    }

    @Override // X.InterfaceC174767qC
    public final boolean CR9() {
        try {
            return this.A06.Ak0() == 1;
        } catch (C6M2 unused) {
            return false;
        }
    }

    @Override // X.InterfaceC174767qC
    public final void E1D() {
    }

    @Override // X.InterfaceC174767qC
    public final /* synthetic */ void EJk(Boolean bool) {
    }

    @Override // X.InterfaceC174767qC
    public final void EYx(boolean z) {
        this.A06.EYx(true);
    }

    @Override // X.InterfaceC174767qC
    public final boolean EjF() {
        return false;
    }

    @Override // X.InterfaceC174767qC
    public final void Eod(AbstractC184688Hj abstractC184688Hj) {
        this.A06.E3g(null);
    }

    @Override // X.InterfaceC174767qC
    public final void AJS(AbstractC184688Hj abstractC184688Hj, InterfaceC175497rP interfaceC175497rP, C55U c55u) {
        this.A07.Ebc(AbstractC166997dE.A0t(this.A09));
        InterfaceC175067qg interfaceC175067qg = this.A06;
        String str = this.A0A;
        int i = this.A01;
        InterfaceC174657pz interfaceC174657pz = this.A05;
        interfaceC174657pz.getClass();
        int i2 = this.A03;
        int i3 = this.A02;
        if (interfaceC175497rP == null) {
            interfaceC175497rP = new C23462AaZ(this.A04);
        }
        C176577tF c176577tF = new C176577tF(interfaceC175497rP, null, i3, i2);
        interfaceC175067qg.AJR(null, new C212669bZ(1, abstractC184688Hj, this), interfaceC174657pz, this.A08, c176577tF, str, i, 0);
    }

    @Override // X.InterfaceC174767qC
    public final C1819085a ALa() {
        return this.A07.ALa();
    }

    @Override // X.InterfaceC174767qC
    public final void ARY(HashMap hashMap, boolean z) {
        InterfaceC175067qg interfaceC175067qg = this.A06;
        C176837tf c176837tf = new C176837tf();
        c176837tf.A01(AbstractC176797tb.A0M, Boolean.valueOf(z));
        c176837tf.A01(AbstractC176797tb.A02, hashMap);
        interfaceC175067qg.Cpo(new C212659bY(this, 6), c176837tf.A00());
    }

    @Override // X.InterfaceC174767qC
    public final InterfaceC178407wE B4Z() {
        return this.A07;
    }

    @Override // X.InterfaceC174767qC
    public final void CKl(AbstractC184688Hj abstractC184688Hj) {
        this.A06.CKl(abstractC184688Hj);
    }

    @Override // X.InterfaceC174767qC
    public final void CKy(AbstractC184688Hj abstractC184688Hj) {
        this.A06.CKy(abstractC184688Hj);
    }

    @Override // X.InterfaceC174767qC
    public final boolean CKz() {
        return this.A06.CKn(1);
    }

    @Override // X.InterfaceC174767qC
    public final boolean CWZ() {
        return this.A06.isConnected();
    }

    @Override // X.InterfaceC174767qC
    public final void EFz(InterfaceC25160BBf interfaceC25160BBf) {
        this.A06.EFz(interfaceC25160BBf);
    }

    @Override // X.InterfaceC174767qC
    public final void EUf(AbstractC184688Hj abstractC184688Hj) {
        InterfaceC175067qg interfaceC175067qg = this.A06;
        if (interfaceC175067qg.isConnected()) {
            interfaceC175067qg.ARu(abstractC184688Hj);
        }
    }

    @Override // X.InterfaceC174767qC
    public final void EUn(boolean z) {
        InterfaceC175067qg interfaceC175067qg = this.A06;
        C176837tf c176837tf = new C176837tf();
        c176837tf.A01(AbstractC176797tb.A0U, Boolean.valueOf(z));
        interfaceC175067qg.Cpo(new C212659bY(this, 5), c176837tf.A00());
    }

    @Override // X.InterfaceC174767qC
    public final void EbS(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A04 = surfaceTexture;
        this.A03 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC174767qC
    public final void EhV(float f) {
        InterfaceC175067qg interfaceC175067qg = this.A06;
        if (interfaceC175067qg.isConnected()) {
            if (AbstractC167007dF.A1S(AbstractC176767tY.A0f, interfaceC175067qg.AlU())) {
                int A0H = AbstractC166987dD.A0H(interfaceC175067qg.AlU().A01(AbstractC176767tY.A0j));
                int min = Math.min(A0H, (int) Math.max(A0H * f, AbstractC166987dD.A0H(interfaceC175067qg.AlU().A01(AbstractC176767tY.A0l))));
                if (interfaceC175067qg.isConnected()) {
                    interfaceC175067qg.EhW(null, min);
                }
            }
        }
    }

    @Override // X.InterfaceC174767qC
    public final void Epe(AbstractC184688Hj abstractC184688Hj) {
        this.A06.Epe(new C212669bZ(2, abstractC184688Hj, this));
    }

    @Override // X.InterfaceC174767qC
    public final void disconnect() {
        this.A06.APd(null);
    }

    public C23569AcN(Context context, InterfaceC178407wE interfaceC178407wE, EnumC177227uI enumC177227uI, InterfaceC175017qb interfaceC175017qb, UserSession userSession, String str) {
        this.A09 = userSession;
        this.A06 = AbstractC175047qe.A00(context.getApplicationContext(), null, enumC177227uI, false);
        this.A0A = str;
        this.A07 = interfaceC178407wE;
        this.A08 = interfaceC175017qb;
    }

    @Override // X.InterfaceC174767qC
    public final void Ecy(InterfaceC174657pz interfaceC174657pz) {
        this.A05 = interfaceC174657pz;
    }

    @Override // X.InterfaceC174767qC
    public final void setInitialCameraFacing(int i) {
        this.A01 = i;
    }
}
