package X;

import java.io.StringWriter;

/* renamed from: X.7pP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174337pP extends C0YY implements InterfaceC16660sJ {
    public static final C174337pP A00 = new C174337pP();

    public C174337pP() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C173027nG c173027nG = (C173027nG) obj;
        C14360o3.A0B(c173027nG, 0);
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        AbstractC173017nF.A00(A0A, c173027nG);
        A0A.close();
        String obj2 = stringWriter.toString();
        C14360o3.A07(obj2);
        return obj2;
    }
}
