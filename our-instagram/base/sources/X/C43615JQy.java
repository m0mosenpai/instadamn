package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.ImageUrlBase;
import java.lang.ref.WeakReference;

/* renamed from: X.JQy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43615JQy implements InterfaceC59502nt {
    public final ImageUrl A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.InterfaceC59502nt
    public final void AGO() {
    }

    @Override // X.InterfaceC59502nt
    public final String AjY() {
        return "";
    }

    @Override // X.InterfaceC59502nt
    public final float Aw0() {
        return 0.0f;
    }

    @Override // X.InterfaceC59502nt
    public final int BQ1() {
        return 0;
    }

    @Override // X.InterfaceC59502nt
    public final int BTw() {
        return 0;
    }

    @Override // X.InterfaceC59502nt
    public final int BU4() {
        return 0;
    }

    @Override // X.InterfaceC59502nt
    public final String BU6() {
        return null;
    }

    @Override // X.InterfaceC59502nt
    public final String Ba1() {
        return "";
    }

    @Override // X.InterfaceC59502nt
    public final C80673iw BiR() {
        return null;
    }

    @Override // X.InterfaceC59502nt
    public final int BqU() {
        return 0;
    }

    @Override // X.InterfaceC59512nu
    public final boolean CQU() {
        return true;
    }

    @Override // X.InterfaceC59502nt
    public final boolean CUp() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean CXt() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean Cas() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean Cbv() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean Cbw() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean CfE() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean Cfj() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean EiI() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean EiO() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final boolean EjG() {
        return false;
    }

    @Override // X.InterfaceC59502nt
    public final void cancel() {
    }

    @Override // X.InterfaceC59502nt
    public final AbstractC12990ll getSession() {
        return null;
    }

    @Override // X.InterfaceC59502nt
    public final InterfaceC59502nt AIB() {
        ImageUrl imageUrl = this.A00;
        String str = this.A03;
        return new C43615JQy(imageUrl, this.A01, this.A02, str, this.A08, this.A09);
    }

    @Override // X.InterfaceC59502nt
    public final boolean ART() {
        return this.A08;
    }

    @Override // X.InterfaceC59512nu
    public final String AjU() {
        ImageUrlBase imageUrlBase;
        ImageUrl imageUrl = this.A00;
        if (!(imageUrl instanceof ImageUrlBase) || (imageUrlBase = (ImageUrlBase) imageUrl) == null) {
            return null;
        }
        return imageUrlBase.Amf().name();
    }

    @Override // X.InterfaceC59502nt
    public final C1NJ Ajp() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            return (C1NJ) weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC59502nt
    public final InterfaceC58912mp Avt() {
        WeakReference weakReference = this.A05;
        if (weakReference != null) {
            return (InterfaceC58912mp) weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC59502nt
    public final ImageUrl BGt() {
        return this.A00;
    }

    @Override // X.InterfaceC59502nt
    public final ImageUrl BRz() {
        return this.A00;
    }

    @Override // X.InterfaceC59502nt
    public final InterfaceC58852mj BU5() {
        WeakReference weakReference = this.A06;
        if (weakReference != null) {
            return (InterfaceC58852mj) weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC59502nt
    public final InterfaceC58872ml BiQ() {
        WeakReference weakReference = this.A07;
        if (weakReference != null) {
            return (InterfaceC58872ml) weakReference.get();
        }
        return null;
    }

    @Override // X.InterfaceC59502nt
    public final boolean Bxi() {
        return this.A09;
    }

    @Override // X.InterfaceC59502nt
    public final String Byf() {
        return this.A03;
    }

    @Override // X.InterfaceC59502nt
    public final Object C4x() {
        return this.A02;
    }

    @Override // X.InterfaceC59512nu
    public final Boolean CPT() {
        return this.A00.BJa();
    }

    @Override // X.InterfaceC59512nu
    public final String EJC() {
        return this.A03;
    }

    @Override // X.InterfaceC59512nu
    public final Integer FDJ() {
        return this.A01;
    }

    public C43615JQy(C1OG c1og) {
        this.A00 = c1og.A06;
        this.A03 = c1og.A0Q;
        this.A04 = c1og.A0A;
        this.A05 = c1og.A0B;
        this.A07 = c1og.A0D;
        this.A06 = c1og.A0C;
        this.A02 = c1og.A08;
        this.A01 = c1og.A07;
        this.A08 = c1og.A0G;
        this.A09 = c1og.A0N;
    }

    @Override // X.InterfaceC59502nt
    public final void E7X() {
        C25821No.A00().A0N(this);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BadUrlCacheRequest: Source = ");
        A1C.append(this.A03);
        A1C.append(", mImageUrl = ");
        return AbstractC166997dE.A0v(this.A00, A1C);
    }

    public C43615JQy(ImageUrl imageUrl, Integer num, Object obj, String str, boolean z, boolean z2) {
        this.A00 = imageUrl;
        this.A03 = str;
        this.A02 = obj;
        this.A04 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        this.A01 = num;
        this.A08 = z;
        this.A09 = z2;
    }
}
