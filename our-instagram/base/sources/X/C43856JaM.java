package X;

import java.util.List;

/* renamed from: X.JaM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43856JaM implements InterfaceC188988Yo {
    public final /* synthetic */ C43830JZt A00;
    public final /* synthetic */ C43852JaI A01;

    @Override // X.InterfaceC188988Yo
    public final void DEP(Exception exc) {
        C14360o3.A0B(exc, 0);
        InterfaceC189638ai interfaceC189638ai = this.A01.A00.A0H;
        if (interfaceC189638ai != null) {
            interfaceC189638ai.DEP(exc);
        }
    }

    public C43856JaM(C43830JZt c43830JZt, C43852JaI c43852JaI) {
        this.A01 = c43852JaI;
        this.A00 = c43830JZt;
    }

    @Override // X.InterfaceC188988Yo
    public final void DS1(C189058Yv c189058Yv, List list, List list2, int i) {
        AbstractC167017dG.A1P(list, list2);
        C43852JaI c43852JaI = this.A01;
        this.A00.A0M.A06().size();
        GestureDetectorOnGestureListenerC43829JZs.A0K(c43852JaI.A00, list, list2);
    }
}
