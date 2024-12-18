package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1bL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29441bL implements InterfaceC29451bM {
    public static final C0KV A01 = new C0KV() { // from class: X.1bO
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-1351141381);
            int A032 = C0f9.A03(1166385829);
            C29441bL c29441bL = new C29441bL(userSession);
            C0f9.A0A(913142109, A032);
            C0f9.A0A(-196890318, A03);
            return c29441bL;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHw(C1OW c1ow, boolean z) {
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHt(C1OW c1ow, boolean z) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C162337Ov.A0W(null, this.A00, (DirectThreadKey) abstractC29011ae.C7R().get(0), C162337Ov.A04(abstractC29011ae.Ar9(), abstractC29011ae.A05(), false), abstractC29011ae.A06(), System.currentTimeMillis() - ((C1OW) abstractC29011ae).A01, z, ((C1OW) abstractC29011ae).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C162337Ov.A0V(c19260xA, this.A00, c114675Fx, (DirectThreadKey) abstractC29011ae.C7R().get(0), C162337Ov.A04(abstractC29011ae.Ar9(), abstractC29011ae.A05(), false), abstractC29011ae.A06(), System.currentTimeMillis() - ((C1OW) abstractC29011ae).A01, z, z2, ((C1OW) abstractC29011ae).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHv(C19260xA c19260xA, C1OW c1ow, boolean z, boolean z2) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C162337Ov.A0X(c19260xA, this.A00, (DirectThreadKey) abstractC29011ae.C7R().get(0), C162337Ov.A04(abstractC29011ae.Ar9(), abstractC29011ae.A05(), false), abstractC29011ae.A06(), z, z2, ((C1OW) abstractC29011ae).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHx(C19260xA c19260xA, C1OW c1ow, boolean z) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C162337Ov.A0W(c19260xA, this.A00, (DirectThreadKey) abstractC29011ae.C7R().get(0), C162337Ov.A04(abstractC29011ae.Ar9(), abstractC29011ae.A05(), false), abstractC29011ae.A06(), System.currentTimeMillis() - ((C1OW) abstractC29011ae).A01, z, ((C1OW) abstractC29011ae).A02.A07);
    }

    public C29441bL(UserSession userSession) {
        this.A00 = userSession;
    }
}
