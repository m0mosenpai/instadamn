package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34891kU implements InterfaceC29451bM {
    public static final C0KV A01 = C34901kV.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29451bM
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void EHx(C19260xA c19260xA, C34851kQ c34851kQ, boolean z) {
        C14360o3.A0B(c34851kQ, 0);
        C162337Ov.A0W(c19260xA, this.A00, c34851kQ.C7Q(), "edit_text", c34851kQ.A04(), System.currentTimeMillis() - ((C1OW) c34851kQ).A01, z, ((C1OW) c34851kQ).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHt(C1OW c1ow, boolean z) {
        C34851kQ c34851kQ = (C34851kQ) c1ow;
        C14360o3.A0B(c34851kQ, 0);
        EHx(null, c34851kQ, z);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHu(C19260xA c19260xA, C1OW c1ow, C114675Fx c114675Fx, boolean z, boolean z2) {
        C34851kQ c34851kQ = (C34851kQ) c1ow;
        C14360o3.A0B(c34851kQ, 0);
        C14360o3.A0B(c114675Fx, 3);
        C14360o3.A0B(c19260xA, 4);
        C162337Ov.A0V(c19260xA, this.A00, c114675Fx, c34851kQ.C7Q(), "edit_text", c34851kQ.A04(), System.currentTimeMillis() - ((C1OW) c34851kQ).A01, z, z2, ((C1OW) c34851kQ).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHv(C19260xA c19260xA, C1OW c1ow, boolean z, boolean z2) {
        C34851kQ c34851kQ = (C34851kQ) c1ow;
        C14360o3.A0B(c34851kQ, 0);
        C14360o3.A0B(c19260xA, 3);
        C162337Ov.A0X(c19260xA, this.A00, c34851kQ.C7Q(), "edit_text", c34851kQ.A04(), z, z2, ((C1OW) c34851kQ).A02.A07);
    }

    @Override // X.InterfaceC29451bM
    public final /* bridge */ /* synthetic */ void EHw(C1OW c1ow, boolean z) {
        C34851kQ c34851kQ = (C34851kQ) c1ow;
        C14360o3.A0B(c34851kQ, 0);
        C162337Ov.A0i(this.A00, c34851kQ.C7Q(), "edit_text", c34851kQ.A04(), ((C1OW) c34851kQ).A02.A09);
    }

    public C34891kU(UserSession userSession) {
        this.A00 = userSession;
    }
}
