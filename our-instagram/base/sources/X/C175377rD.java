package X;

import android.graphics.Matrix;
import android.os.Handler;
import android.view.View;
import java.io.File;
import java.io.FileDescriptor;
import java.util.UUID;

/* renamed from: X.7rD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175377rD implements InterfaceC175067qg {
    public C177447ue A00;
    public InterfaceC175017qb A01;
    public UUID A02;
    public Handler A03;
    public UUID A04;
    public boolean A05;
    public final InterfaceC175397rF A06 = new InterfaceC175397rF() { // from class: X.7rE
        @Override // X.InterfaceC175397rF
        public final void DQ9(String str, String str2) {
            C175377rD c175377rD = C175377rD.this;
            InterfaceC175017qb interfaceC175017qb = c175377rD.A01;
            int i = AbstractC175037qd.A00;
            if (interfaceC175017qb != null) {
                AbstractC175037qd.A01.A02(interfaceC175017qb);
            }
            c175377rD.A01 = null;
            c175377rD.A02 = null;
        }
    };
    public final InterfaceC175067qg A07;
    public final C175237qx A08;

    @Override // X.InterfaceC175067qg
    public final void A9h(InterfaceC25160BBf interfaceC25160BBf, int i) {
        if (A00()) {
            this.A07.A9h(interfaceC25160BBf, 1);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void AJR(C176587tG c176587tG, AbstractC184688Hj abstractC184688Hj, InterfaceC174657pz interfaceC174657pz, InterfaceC175017qb interfaceC175017qb, C176577tF c176577tF, String str, int i, int i2) {
        if (!this.A05) {
            C175237qx c175237qx = this.A08;
            this.A04 = c175237qx.A03(this.A03, str);
            c175237qx.A04(this.A06);
        }
        this.A05 = false;
        this.A01 = interfaceC175017qb;
        int i3 = AbstractC175037qd.A00;
        if (interfaceC175017qb != null) {
            AbstractC175037qd.A01.A01(interfaceC175017qb);
        }
        this.A07.AJR(null, new C176457t3(abstractC184688Hj, this), interfaceC174657pz, interfaceC175017qb, c176577tF, str, i, i2);
        UUID uuid = this.A04;
        C175237qx c175237qx2 = this.A08;
        if (uuid != c175237qx2.A03) {
            this.A04 = c175237qx2.A03(this.A03, str);
        }
    }

    @Override // X.InterfaceC175067qg
    public final boolean APd(AbstractC184688Hj abstractC184688Hj) {
        this.A05 = false;
        C175237qx c175237qx = this.A08;
        if (!c175237qx.A05(this.A04)) {
            if (this.A02 == null) {
                InterfaceC175017qb interfaceC175017qb = this.A01;
                int i = AbstractC175037qd.A00;
                if (interfaceC175017qb != null) {
                    AbstractC175037qd.A01.A02(interfaceC175017qb);
                }
                this.A01 = null;
                this.A02 = null;
            }
            return false;
        }
        c175237qx.A04(this.A06);
        this.A02 = this.A04;
        return this.A07.APd(new C177897vO(abstractC184688Hj, this));
    }

    @Override // X.InterfaceC175067qg
    public final void Chr(AbstractC184688Hj abstractC184688Hj, boolean z, boolean z2, boolean z3) {
        this.A07.Chr(abstractC184688Hj, true, true, z3);
    }

    @Override // X.InterfaceC175067qg
    public final void E3g(AbstractC184688Hj abstractC184688Hj) {
        if (A00()) {
            this.A07.E3g(null);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EKm(AbstractC184688Hj abstractC184688Hj) {
        if (A00()) {
            this.A07.EKm(null);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EoD(AbstractC184688Hj abstractC184688Hj, File file, File file2) {
        if (!A01(abstractC184688Hj, "Cannot start video recording.")) {
            this.A07.EoD(abstractC184688Hj, file, null);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EoE(AbstractC184688Hj abstractC184688Hj, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2) {
        if (!A01(abstractC184688Hj, "Cannot start video recording.")) {
            this.A07.EoE(abstractC184688Hj, fileDescriptor, null);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EoF(AbstractC184688Hj abstractC184688Hj, String str, String str2) {
        if (!A01(abstractC184688Hj, "Cannot start video recording.")) {
            this.A07.EoF(abstractC184688Hj, str, null);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void F9E(AbstractC184688Hj abstractC184688Hj, boolean z, boolean z2, boolean z3) {
        this.A07.F9E(abstractC184688Hj, true, true, z3);
    }

    public final boolean A00() {
        if (this.A04 != null) {
            C175237qx c175237qx = this.A08;
            if (c175237qx.A04 && this.A04.equals(c175237qx.A03)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC175067qg
    public final void A8T(InterfaceC175457rL interfaceC175457rL) {
        this.A07.A8T(interfaceC175457rL);
    }

    @Override // X.InterfaceC175067qg
    public final void A8v(InterfaceC174727q7 interfaceC174727q7) {
        this.A07.A8v(interfaceC174727q7);
    }

    @Override // X.InterfaceC175067qg
    public final boolean A9L(InterfaceC175167qq interfaceC175167qq) {
        return this.A07.A9L(interfaceC175167qq);
    }

    @Override // X.InterfaceC175067qg
    public final void A9g(InterfaceC25160BBf interfaceC25160BBf) {
        if (A00()) {
            this.A07.A9g(interfaceC25160BBf);
            return;
        }
        throw new C6M2("Cannot add OnPreviewFrameListener listener.");
    }

    @Override // X.InterfaceC175067qg
    public final void A9i(InterfaceC184558Gw interfaceC184558Gw) {
        this.A07.A9i(interfaceC184558Gw);
    }

    @Override // X.InterfaceC175067qg
    public final void A9j(InterfaceC174807qG interfaceC174807qG) {
        this.A07.A9j(interfaceC174807qG);
    }

    @Override // X.InterfaceC175067qg
    public final void AAs(C184848Hz c184848Hz) {
        this.A07.AAs(c184848Hz);
    }

    @Override // X.InterfaceC175067qg
    public final int AFE(int i, int i2) {
        return this.A07.AFE(i, i2);
    }

    @Override // X.InterfaceC175067qg
    public final void ARf(boolean z) {
        this.A07.ARf(z);
    }

    @Override // X.InterfaceC175067qg
    public final void ARu(AbstractC184688Hj abstractC184688Hj) {
        if (!A01(abstractC184688Hj, "Cannot enable video focus mode")) {
            this.A07.ARu(abstractC184688Hj);
        }
    }

    @Override // X.InterfaceC175067qg
    public final Handler Ajq() {
        return this.A07.Ajq();
    }

    @Override // X.InterfaceC175067qg
    public final int Ak0() {
        C177447ue c177447ue = this.A00;
        if (c177447ue != null) {
            return c177447ue.A01;
        }
        throw new C6M2("Cannot get current camera facing value.");
    }

    @Override // X.InterfaceC175067qg
    public final AbstractC176767tY AlU() {
        C177447ue c177447ue = this.A00;
        if (c177447ue != null) {
            return c177447ue.A02;
        }
        throw new C6M2("Cannot get camera capabilities.");
    }

    @Override // X.InterfaceC175067qg
    public final void BYA(AbstractC184688Hj abstractC184688Hj) {
        this.A07.BYA(abstractC184688Hj);
    }

    @Override // X.InterfaceC175067qg
    public final void BYB(AbstractC184688Hj abstractC184688Hj, int i) {
        this.A07.BYB(abstractC184688Hj, i);
    }

    @Override // X.InterfaceC175067qg
    public final int BtN() {
        return this.A07.BtN();
    }

    @Override // X.InterfaceC175067qg
    public final AbstractC176797tb Bty() {
        C177447ue c177447ue = this.A00;
        if (c177447ue != null) {
            return c177447ue.A03;
        }
        throw new C6M2("Cannot get current camera settings.");
    }

    @Override // X.InterfaceC175067qg
    public final int CIn() {
        return this.A07.CIn();
    }

    @Override // X.InterfaceC175067qg
    public final void CKl(AbstractC184688Hj abstractC184688Hj) {
        this.A07.CKl(abstractC184688Hj);
    }

    @Override // X.InterfaceC175067qg
    public final boolean CKn(int i) {
        return this.A07.CKn(i);
    }

    @Override // X.InterfaceC175067qg
    public final void CKy(AbstractC184688Hj abstractC184688Hj) {
        this.A07.CKy(abstractC184688Hj);
    }

    @Override // X.InterfaceC175067qg
    public final void CO9(Matrix matrix, int i, int i2, int i3) {
        this.A07.CO9(matrix, i, i2, i3);
    }

    @Override // X.InterfaceC175067qg
    public final boolean Ce9() {
        return this.A07.Ce9();
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cmt(float[] fArr) {
        return this.A07.Cmt(fArr);
    }

    @Override // X.InterfaceC175067qg
    public final void Cpo(AbstractC184688Hj abstractC184688Hj, C177007tw c177007tw) {
        if (!A01(abstractC184688Hj, "Cannot modify settings.")) {
            this.A07.Cpo(abstractC184688Hj, c177007tw);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void CtC() {
        this.A07.CtC();
    }

    @Override // X.InterfaceC175067qg
    public final void DX0(int i) {
        this.A07.DX0(i);
    }

    @Override // X.InterfaceC175067qg
    public final void E2d(AbstractC184688Hj abstractC184688Hj, String str, int i) {
        if (!this.A05) {
            this.A04 = this.A08.A03(this.A03, str);
            this.A05 = true;
        }
        this.A07.E2d(new C198228pX(abstractC184688Hj, this), str, i);
    }

    @Override // X.InterfaceC175067qg
    public final void ECd(String str, View view) {
        this.A07.ECd(str, view);
    }

    @Override // X.InterfaceC175067qg
    public final void EFI(InterfaceC175457rL interfaceC175457rL) {
        this.A07.EFI(interfaceC175457rL);
    }

    @Override // X.InterfaceC175067qg
    public final void EFU(InterfaceC174727q7 interfaceC174727q7) {
        this.A07.EFU(interfaceC174727q7);
    }

    @Override // X.InterfaceC175067qg
    public final void EFi(InterfaceC175167qq interfaceC175167qq) {
        this.A07.EFi(interfaceC175167qq);
    }

    @Override // X.InterfaceC175067qg
    public final void EG0(InterfaceC184558Gw interfaceC184558Gw) {
        this.A07.EG0(interfaceC184558Gw);
    }

    @Override // X.InterfaceC175067qg
    public final void EG1(InterfaceC174807qG interfaceC174807qG) {
        this.A07.EG1(interfaceC174807qG);
    }

    @Override // X.InterfaceC175067qg
    public final void EUe(InterfaceC198408pp interfaceC198408pp) {
        this.A07.EUe(interfaceC198408pp);
    }

    @Override // X.InterfaceC175067qg
    public final void EVB(AbstractC184688Hj abstractC184688Hj, boolean z) {
        C177447ue c177447ue = this.A00;
        if (c177447ue != null && ((Boolean) c177447ue.A02.A01(AbstractC176767tY.A0J)).booleanValue()) {
            this.A07.EVB(abstractC184688Hj, z);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EYx(boolean z) {
        this.A07.EYx(z);
    }

    @Override // X.InterfaceC175067qg
    public final void EZy(InterfaceC175397rF interfaceC175397rF) {
        this.A07.EZy(interfaceC175397rF);
    }

    @Override // X.InterfaceC175067qg
    public final void EbM(AbstractC184688Hj abstractC184688Hj, int i) {
        if (!A01(abstractC184688Hj, "Cannot set display rotation.")) {
            this.A07.EbM(abstractC184688Hj, i);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EhW(AbstractC184688Hj abstractC184688Hj, int i) {
        if (!A01(abstractC184688Hj, "Cannot set zoom level.")) {
            this.A07.EhW(abstractC184688Hj, i);
        }
    }

    @Override // X.InterfaceC175067qg
    public final boolean Ehu(Matrix matrix, int i, int i2, int i3, int i4, boolean z) {
        return this.A07.Ehu(matrix, i, i2, i3, i4, z);
    }

    @Override // X.InterfaceC175067qg
    public final void EoC(AbstractC184688Hj abstractC184688Hj, C23106AGs c23106AGs) {
        if (!A01(abstractC184688Hj, "Cannot start video recording.")) {
            this.A07.EoC(abstractC184688Hj, c23106AGs);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void Eop(AbstractC184688Hj abstractC184688Hj, boolean z) {
        if (!A01(abstractC184688Hj, "Cannot stop video recording")) {
            this.A07.Eop(abstractC184688Hj, z);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void Epe(AbstractC184688Hj abstractC184688Hj) {
        if (!A01(abstractC184688Hj, "Cannot switch camera.")) {
            C177447ue c177447ue = this.A00;
            this.A00 = null;
            this.A07.Epe(new C196918nL(abstractC184688Hj, c177447ue, this));
        }
    }

    public C175377rD(Handler handler, InterfaceC175067qg interfaceC175067qg, C175237qx c175237qx) {
        this.A03 = handler;
        this.A07 = interfaceC175067qg;
        this.A08 = c175237qx;
    }

    public final boolean A01(AbstractC184688Hj abstractC184688Hj, String str) {
        if (!A00()) {
            if (abstractC184688Hj != null) {
                abstractC184688Hj.A01(new C6M2(str));
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC175067qg
    public final void AWH(int i, int i2) {
        if (A00()) {
            this.A07.AWH(i, i2);
        }
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cav() {
        if (isConnected() && !this.A07.Cav()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC175067qg
    public final boolean Cbe() {
        if (isConnected() && this.A07.Cbe()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC175067qg
    public final boolean CeD() {
        if (isConnected() && this.A07.CeD()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC175067qg
    public final void EFz(InterfaceC25160BBf interfaceC25160BBf) {
        if (isConnected()) {
            this.A07.EFz(interfaceC25160BBf);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EhX(float f, float f2) {
        if (A00()) {
            this.A07.EhX(f, f2);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void EmH(AbstractC184688Hj abstractC184688Hj, float f) {
        if (A00()) {
            this.A07.EmH(abstractC184688Hj, f);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void Emb(AbstractC184688Hj abstractC184688Hj, int i, int i2) {
        if (A00()) {
            this.A07.Emb(abstractC184688Hj, i, i2);
        }
    }

    @Override // X.InterfaceC175067qg
    public final void Epu(InterfaceC196578mn interfaceC196578mn, C196548mk c196548mk) {
        if (!A00()) {
            interfaceC196578mn.DEF(new C6M2("Cannot take a photo."));
        } else {
            this.A07.Epu(interfaceC196578mn, c196548mk);
        }
    }

    @Override // X.InterfaceC175067qg
    public final boolean isConnected() {
        if (A00() && this.A00 != null && this.A07.isConnected()) {
            return true;
        }
        return false;
    }
}
