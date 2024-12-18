package X;

/* renamed from: X.DLv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30035DLv extends C0YY implements InterfaceC16660sJ {
    public static final C30035DLv A00 = new C30035DLv();

    public C30035DLv() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        InterfaceC132185xw interfaceC132185xw = (InterfaceC132185xw) obj;
        C14360o3.A0B(interfaceC132185xw, 0);
        float width = interfaceC132185xw.getWidth();
        float height = interfaceC132185xw.getHeight();
        if (width > 0.0f && height > 0.0f) {
            f = C17s.A02(width / height, 0.75f, 1.3333334f);
        } else {
            f = 1.0f;
        }
        return Float.valueOf(f);
    }
}
