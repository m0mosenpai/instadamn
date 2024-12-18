package X;

import java.util.List;

/* renamed from: X.Oq7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55797Oq7 implements InterfaceC65424Tjv {
    public final /* synthetic */ C55036OZi A00;
    public final /* synthetic */ O5R A01;
    public final /* synthetic */ List A02;

    public C55797Oq7(C55036OZi c55036OZi, O5R o5r, List list) {
        this.A00 = c55036OZi;
        this.A01 = o5r;
        this.A02 = list;
    }

    @Override // X.InterfaceC65424Tjv
    public final void onFailure(Exception exc) {
        C14360o3.A0B(exc, 0);
        OMi oMi = this.A00.A04;
        oMi.A02();
        oMi.A00();
        O5R o5r = this.A01;
        EnumC53331NiB enumC53331NiB = EnumC53331NiB.A09;
        List list = this.A02;
        RuntimeException runtimeException = new RuntimeException("Unable to send token for validation", exc);
        AbstractC001800i.A0S(AbstractC166987dD.A1J(enumC53331NiB), list);
        o5r.A00.setException(runtimeException);
    }
}
