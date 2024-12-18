package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.1ix, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33971ix implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A03 = C33981iy.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC31091eE
    public final /* bridge */ /* synthetic */ void AJE(InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow, C47Z c47z) {
        C33941iu c33941iu = (C33941iu) c1ow;
        C14360o3.A0B(c33941iu, 0);
        C14360o3.A0B(c47z, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        try {
            String str = ((AbstractC33951iv) c33941iu).A03;
            if (str == null) {
                C33891ip c33891ip = c33941iu.A01;
                if (c33891ip != null) {
                    ETL etl = new ETL(interfaceC37261GbE, interfaceC37261GbE, this, c33941iu, c47z);
                    Object AXR = C33921is.A05.AXR(this.A00);
                    C14360o3.A0C(AXR, "null cannot be cast to non-null type com.instagram.direct.send.mutation.DirectSendPromptMessageMutationProcessor");
                    ((C33921is) AXR).A00(etl, c33891ip);
                    return;
                }
                return;
            }
            A00(interfaceC37261GbE, this, c33941iu, c47z, str);
        } catch (IOException e) {
            C162337Ov.A0Z(interfaceC37261GbE.B4C(), C05F.A00);
            interfaceC37261GbE.DUq(AbstractC35240FgZ.A03(e), null);
        }
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        AbstractC33951iv abstractC33951iv = (AbstractC33951iv) c1ow;
        C14360o3.A0B(abstractC33951iv, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        C35201Fft.A00.A02(c19260xA, this.A00, interfaceC37261GbE, null, this, abstractC33951iv, this.A01, this.A02);
    }

    public static final void A00(InterfaceC37261GbE interfaceC37261GbE, C33971ix c33971ix, C33941iu c33941iu, C47Z c47z, String str) {
        C35201Fft.A00(c33971ix.A00, interfaceC37261GbE, c47z, c33941iu.A07().A00, c33941iu.A06(), str, ((AbstractC33951iv) c33941iu).A00);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        C33941iu c33941iu = (C33941iu) c1ow;
        C14360o3.A0B(c33941iu, 0);
        return C35201Fft.A01(c33941iu, c33941iu.A01);
    }

    public C33971ix(UserSession userSession, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        this.A00 = userSession;
        this.A01 = interfaceC09390do;
        this.A02 = interfaceC09390do2;
    }
}
