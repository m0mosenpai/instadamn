package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EE1 extends AnonymousClass935 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC37117GXc A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE1(UserSession userSession, InterfaceC37117GXc interfaceC37117GXc, String str, String str2, String str3, int i) {
        super(userSession);
        this.A02 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A03 = str3;
        this.A01 = interfaceC37117GXc;
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03 = C0f9.A03(878323910);
        AbstractC167017dG.A1N(userSession, abstractC115105If);
        super.A04(abstractC115105If, userSession);
        AbstractC35063Fca.A01(abstractC115105If, userSession, this.A02, this.A04, this.A00);
        C0f9.A0A(-86636963, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-560380543);
        int A032 = C0f9.A03(543761838);
        AbstractC167017dG.A1N(userSession, obj);
        super.A05(userSession, obj);
        AbstractC35063Fca.A01(null, userSession, this.A02, this.A04, this.A00);
        AbstractC34070F1y.A00(userSession, this.A03);
        InterfaceC37117GXc interfaceC37117GXc = this.A01;
        if (interfaceC37117GXc != null) {
            interfaceC37117GXc.onSuccess();
        }
        C0f9.A0A(-1714793275, A032);
        C0f9.A0A(-1420109687, A03);
    }
}
