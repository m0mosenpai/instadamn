package X;

import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes4.dex */
public final class B9T extends C0YY implements InterfaceC16660sJ {
    public static final B9T A00 = new B9T();

    public B9T() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0Q = AbstractC167027dH.A0Q(obj);
        C0f5 AEp = C18950wb.A01.AEp("ClipsVirtualVideoStore", 817898016);
        AEp.ABW(DialogModule.KEY_MESSAGE, A0Q);
        AEp.report();
        return C0eB.A00;
    }
}
