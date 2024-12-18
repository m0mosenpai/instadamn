package X;

import java.io.StringWriter;

/* loaded from: classes9.dex */
public final class MZ5 implements InterfaceC195278kT {
    @Override // X.InterfaceC195278kT
    public final /* bridge */ /* synthetic */ Object AOx(String str) {
        C14360o3.A0B(str, 0);
        C66130U0o parseFromJson = MZ9.parseFromJson(C16V.A00(str));
        C14360o3.A07(parseFromJson);
        return parseFromJson;
    }

    @Override // X.InterfaceC195278kT
    public final /* bridge */ /* synthetic */ String AhL(Object obj) {
        C66130U0o c66130U0o = (C66130U0o) obj;
        C14360o3.A0B(c66130U0o, 0);
        return c66130U0o.A01.A04;
    }

    @Override // X.InterfaceC195278kT
    public final /* bridge */ /* synthetic */ String EOt(Object obj) {
        C66130U0o c66130U0o = (C66130U0o) obj;
        StringWriter A0f = MSZ.A0f(c66130U0o);
        C17z A0O = MSW.A0O(A0f);
        MZ9.A00(A0O, c66130U0o);
        return MSY.A0e(A0O, A0f);
    }
}
