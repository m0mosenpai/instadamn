package X;

/* renamed from: X.Lyw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49789Lyw implements InterfaceC42241xE {
    public static final C49789Lyw A00 = new C49789Lyw();

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
        if (interfaceC132965zL instanceof C48496Lcn) {
            EnumC12410kj enumC12410kj = EnumC12410kj.A0A;
            String message = ((Throwable) AbstractC132975zM.A00(interfaceC132965zL)).getMessage();
            if (message == null) {
                message = "";
            }
            C0w9.A01(enumC12410kj, "DirectExternalMediaShareJob_handleMultiMediaExternalShare", message);
        }
    }
}
