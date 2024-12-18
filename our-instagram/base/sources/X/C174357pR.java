package X;

import java.io.StringWriter;

/* renamed from: X.7pR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174357pR extends C0YY implements InterfaceC16660sJ {
    public static final C174357pR A00 = new C174357pR();

    public C174357pR() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AGB agb = (AGB) obj;
        C14360o3.A0B(agb, 0);
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        ADM.A00(A0A, agb);
        A0A.close();
        String obj2 = stringWriter.toString();
        C14360o3.A07(obj2);
        return obj2;
    }
}
