package X;

import java.util.List;

/* renamed from: X.CtK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29153CtK implements InterfaceC41501vz {
    public final /* synthetic */ C81373k7 A00;
    public final /* synthetic */ C81373k7 A01;
    public final /* synthetic */ C38321qM A02;

    public C29153CtK(C81373k7 c81373k7, C81373k7 c81373k72, C38321qM c38321qM) {
        this.A01 = c81373k7;
        this.A00 = c81373k72;
        this.A02 = c38321qM;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(1823316866);
        LYK lyk = (LYK) obj;
        int A0N = AbstractC167017dG.A0N(lyk, -708157962);
        C81373k7 c81373k7 = this.A01;
        String A06 = AbstractC75103Za.A06(this.A00.A0G, c81373k7.A0N, this.A02, lyk.A01);
        C5LT c5lt = c81373k7.A08;
        if (c5lt != null) {
            c81373k7.A00(c5lt.A01, c81373k7.A09, A06, (CharSequence) c5lt.A00.A07.invoke(c81373k7.A0G, c81373k7.A0W), (List) c5lt.A00.A00.invoke(), c5lt.A0A, c5lt.A0B);
        }
        C0f9.A0A(-324704444, A0N);
        C0f9.A0A(-539494922, A03);
    }
}
