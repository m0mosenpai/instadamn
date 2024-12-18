package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IsH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42538IsH implements C30V {
    public final UserSession A00;

    @Override // X.C30V
    public final void Cig(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Cih(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Cii(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final void Cik(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2, long j) {
    }

    @Override // X.C30V
    public final void Cil(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Ck5(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C49378LsC c49378LsC = (C49378LsC) c1ni;
        AbstractC167017dG.A1N(interfaceC60442pS, c49378LsC);
        A00(c11520jB, c49378LsC, interfaceC60442pS, "impression");
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Cls(C11520jB c11520jB, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C49378LsC c49378LsC = (C49378LsC) c1ni;
        AbstractC167017dG.A1N(interfaceC60442pS, c49378LsC);
        A00(c11520jB, c49378LsC, interfaceC60442pS, "sub_impression");
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Clt(C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C49378LsC c49378LsC = (C49378LsC) c1ni;
        C14360o3.A0B(c49378LsC, 1);
        A00(null, c49378LsC, interfaceC60442pS, AbstractC111324zv.A00(1314));
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void Cm8(C82413m5 c82413m5, C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2, long j) {
        C49378LsC c49378LsC = (C49378LsC) c1ni;
        C14360o3.A0B(c49378LsC, 1);
        C82713mZ A04 = AbstractC82703mY.A04(c49378LsC, interfaceC60442pS, "time_spent");
        A04.A0B(j);
        c49378LsC.A00(A04);
        AbstractC31173DnH.A1S(A04.A00(), this.A00);
    }

    @Override // X.C30V
    public final /* bridge */ /* synthetic */ void CmR(C1NI c1ni, InterfaceC60442pS interfaceC60442pS, int i, int i2) {
        C49378LsC c49378LsC = (C49378LsC) c1ni;
        C14360o3.A0B(c49378LsC, 1);
        A00(null, c49378LsC, interfaceC60442pS, AbstractC111324zv.A00(5569));
    }

    public C42538IsH(UserSession userSession) {
        this.A00 = userSession;
    }

    private final void A00(C11520jB c11520jB, C49378LsC c49378LsC, InterfaceC60442pS interfaceC60442pS, String str) {
        C82713mZ A04 = AbstractC82703mY.A04(c49378LsC, interfaceC60442pS, str);
        A04.A0E(c11520jB);
        c49378LsC.A00(A04);
        AbstractC31173DnH.A1S(A04.A00(), this.A00);
    }
}
