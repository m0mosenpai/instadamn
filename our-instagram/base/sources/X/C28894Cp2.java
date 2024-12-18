package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Cp2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28894Cp2 implements InterfaceC52932ba {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C28894Cp2(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC167027dH.A0a(1, userSession, str, str2, str3);
        this.A00 = userSession;
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
        this.A05 = str5;
        this.A01 = str6;
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        UserSession userSession = this.A00;
        return new C25843Bby(userSession, AbstractC27688CJh.A00(userSession), this.A06, this.A03, this.A04, this.A02, this.A05, this.A01);
    }
}
