package X;

import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.ImageUrlBase;

/* renamed from: X.3ZX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZX implements InterfaceC59502nt {
    public final C1OC A00;
    public final InterfaceC59502nt A01;
    public final UserSession A02;

    public C3ZX(C1OC c1oc, InterfaceC59502nt interfaceC59502nt, UserSession userSession) {
        C14360o3.A0B(userSession, 3);
        this.A01 = interfaceC59502nt;
        this.A00 = c1oc;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC59502nt
    public final int BTw() {
        return 0;
    }

    @Override // X.InterfaceC59502nt
    public final boolean Cas() {
        return true;
    }

    @Override // X.InterfaceC59502nt
    public final boolean Cbv() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean Cbw() {
        return true;
    }

    @Override // X.InterfaceC59502nt
    public final void AGO() {
        this.A01.AGO();
    }

    @Override // X.InterfaceC59502nt
    public final InterfaceC59502nt AIB() {
        return new C3ZX(this.A00, this.A01.AIB(), this.A02);
    }

    @Override // X.InterfaceC59502nt
    public final boolean ART() {
        return C18U.A06(C06090Tz.A05, this.A02, 36311264133579232L);
    }

    @Override // X.InterfaceC59512nu
    public final String AjU() {
        ImageUrlBase imageUrlBase;
        ImageUrl BGt = this.A01.BGt();
        if (!(BGt instanceof ImageUrlBase) || (imageUrlBase = (ImageUrlBase) BGt) == null) {
            return null;
        }
        return imageUrlBase.Amf().name();
    }

    @Override // X.InterfaceC59502nt
    public final String AjY() {
        return this.A01.AjY();
    }

    @Override // X.InterfaceC59502nt
    public final C1NJ Ajp() {
        return this.A01.Ajp();
    }

    @Override // X.InterfaceC59502nt
    public final InterfaceC58912mp Avt() {
        return this.A01.Avt();
    }

    @Override // X.InterfaceC59502nt
    public final float Aw0() {
        return this.A01.Aw0();
    }

    @Override // X.InterfaceC59502nt
    public final ImageUrl BGt() {
        ImageUrl BGt = this.A01.BGt();
        C14360o3.A07(BGt);
        return BGt;
    }

    @Override // X.InterfaceC59502nt
    public final int BQ1() {
        return this.A01.BQ1();
    }

    @Override // X.InterfaceC59502nt
    public final ImageUrl BRz() {
        ImageUrl BRz = this.A01.BRz();
        C14360o3.A07(BRz);
        return BRz;
    }

    @Override // X.InterfaceC59502nt
    public final int BU4() {
        return this.A01.BU4();
    }

    @Override // X.InterfaceC59502nt
    public final InterfaceC58852mj BU5() {
        return this.A01.BU5();
    }

    @Override // X.InterfaceC59502nt
    public final String BU6() {
        return this.A01.BU6();
    }

    @Override // X.InterfaceC59502nt
    public final String Ba1() {
        return this.A01.Ba1();
    }

    @Override // X.InterfaceC59502nt
    public final InterfaceC58872ml BiQ() {
        return this.A01.BiQ();
    }

    @Override // X.InterfaceC59502nt
    public final C80673iw BiR() {
        return this.A01.BiR();
    }

    @Override // X.InterfaceC59502nt
    public final int BqU() {
        ImageLoggingData BOm;
        Object value = this.A00.A02.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue() && (BOm = this.A01.BRz().BOm()) != null && ((PPRLoggingData) BOm).A05) {
            return -1;
        }
        return this.A01.BqU();
    }

    @Override // X.InterfaceC59502nt
    public final boolean Bxi() {
        return this.A01.Bxi();
    }

    @Override // X.InterfaceC59502nt
    public final String Byf() {
        String Byf = this.A01.Byf();
        C14360o3.A07(Byf);
        return Byf;
    }

    @Override // X.InterfaceC59502nt
    public final Object C4x() {
        return this.A01.C4x();
    }

    @Override // X.InterfaceC59512nu
    public final boolean CQU() {
        return this.A01.CQU();
    }

    @Override // X.InterfaceC59502nt
    public final boolean CUp() {
        return this.A01.CUp();
    }

    @Override // X.InterfaceC59502nt
    public final boolean CXt() {
        return this.A01.CXt();
    }

    @Override // X.InterfaceC59502nt
    public final boolean CfE() {
        return this.A01.CfE();
    }

    @Override // X.InterfaceC59502nt
    public final boolean Cfj() {
        return this.A01.Cfj();
    }

    @Override // X.InterfaceC59512nu
    public final String EJC() {
        return this.A01.EJC();
    }

    @Override // X.InterfaceC59502nt
    public final boolean EiI() {
        return this.A01.EiI();
    }

    @Override // X.InterfaceC59502nt
    public final boolean EiO() {
        return this.A01.EiO();
    }

    @Override // X.InterfaceC59502nt
    public final boolean EjG() {
        return this.A01.EjG();
    }

    @Override // X.InterfaceC59512nu
    public final Integer FDJ() {
        return this.A01.FDJ();
    }

    @Override // X.InterfaceC59502nt
    public final void cancel() {
        this.A01.cancel();
    }

    @Override // X.InterfaceC59502nt
    public final AbstractC12990ll getSession() {
        return this.A01.getSession();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CacheRequestImpl: Source = ");
        sb.append(Byf());
        sb.append(", mImageUrl = ");
        sb.append(BGt());
        return sb.toString();
    }

    @Override // X.InterfaceC59512nu
    public final Boolean CPT() {
        return BGt().BJa();
    }

    @Override // X.InterfaceC59502nt
    public final void E7X() {
        C25821No.A00().A0N(this);
    }
}
