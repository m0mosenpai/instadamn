package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1j1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34011j1 implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A05 = C34021j2.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C50160MDn(this, 43));
    public final InterfaceC16820sZ A04 = new C50160MDn(this, 42);

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C33991iz c33991iz = (C33991iz) c1ow;
        C14360o3.A0B(c33991iz, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        C35201Fft.A00.A02(c19260xA, this.A00, interfaceC37261GbE, new C34513FIz(this, c33991iz), this, c33991iz, this.A01, this.A02);
    }

    @Override // X.InterfaceC31091eE
    public final /* bridge */ /* synthetic */ void AJE(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47Z c47z) {
        AbstractC33951iv abstractC33951iv = (AbstractC33951iv) c1ow;
        C14360o3.A0B(abstractC33951iv, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str = abstractC33951iv.A07().A00;
        String str2 = abstractC33951iv.A05;
        String str3 = abstractC33951iv.A03;
        if (str3 != null) {
            C35201Fft.A00(userSession, interfaceC37261GbE, c47z, str, str2, str3, abstractC33951iv.A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC33951iv abstractC33951iv = (AbstractC33951iv) c1ow;
        C14360o3.A0B(abstractC33951iv, 0);
        return C35201Fft.A01(abstractC33951iv, null);
    }

    public C34011j1(UserSession userSession, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        this.A00 = userSession;
        this.A01 = interfaceC09390do;
        this.A02 = interfaceC09390do2;
    }
}
