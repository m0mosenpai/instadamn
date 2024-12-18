package X;

/* renamed from: X.V5i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67993V5i extends C2AH {
    public final /* synthetic */ C66151U1s A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public C67993V5i(C66151U1s c66151U1s, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c66151U1s;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C65911TwI c65911TwI = (C65911TwI) obj;
        C14360o3.A0B(c65911TwI, 0);
        this.A00.A00 = c65911TwI;
        this.A01.invoke();
    }
}
