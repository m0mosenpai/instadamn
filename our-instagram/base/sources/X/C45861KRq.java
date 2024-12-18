package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.KRq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45861KRq extends AbstractC161727Mh implements InterfaceC162347Ow {
    public final UserSession A00;
    public final C48960Ll7 A01;
    public final AnonymousClass988 A02;
    public final C7IM A03;
    public final C18A A04;

    @Override // X.AbstractC161727Mh
    public final /* bridge */ /* synthetic */ InterfaceC66482zP A05(C160787Im c160787Im) {
        C14360o3.A0B(c160787Im, 0);
        C48960Ll7 c48960Ll7 = this.A01;
        Context A03 = AbstractC37301Gc2.A03(this);
        UserSession userSession = this.A00;
        C18A c18a = this.A04;
        return c48960Ll7.AWm(A03, userSession, this.A02, c160787Im, this.A03, c18a, false);
    }

    @Override // X.InterfaceC162347Ow
    public final void Ec3(C74843Xy c74843Xy) {
        C14360o3.A0B(c74843Xy, 0);
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).Ec3(c74843Xy);
    }

    @Override // X.InterfaceC162347Ow
    public final void FCi(C74843Xy c74843Xy, float f) {
        C14360o3.A0B(c74843Xy, 0);
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).FCi(c74843Xy, f);
    }

    @Override // X.InterfaceC162347Ow
    public final void AI4() {
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).AI4();
    }

    @Override // X.InterfaceC162347Ow
    public final C74843Xy BLT() {
        C74843Xy BLT = ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).BLT();
        C14360o3.A07(BLT);
        return BLT;
    }

    @Override // X.InterfaceC162347Ow
    public final C74843Xy C0D() {
        C74843Xy C0D = ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).C0D();
        C14360o3.A07(C0D);
        return C0D;
    }

    @Override // X.InterfaceC162347Ow
    public final void Ctd(float f) {
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).Ctd(f);
    }

    @Override // X.InterfaceC162347Ow
    public final void EJl() {
        ((C1579477e) ((C7SP) ((AbstractC161677Mc) this).A00).A0M).EJl();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Ll7] */
    public C45861KRq(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988, C45886KSp c45886KSp, C7IM c7im) {
        super(AbstractC43594JPz.A0X(layoutInflater, viewGroup, c45886KSp), c45886KSp, c7zx);
        this.A00 = userSession;
        this.A03 = c7im;
        this.A02 = anonymousClass988;
        this.A04 = AnonymousClass189.A00(userSession);
        this.A01 = new Object();
    }
}
