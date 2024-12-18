package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.6NY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NY implements C6NZ {
    public final /* synthetic */ ScrollingLogic A00;

    public C6NY(ScrollingLogic scrollingLogic) {
        this.A00 = scrollingLogic;
    }

    @Override // X.C6NZ
    public final long EMF(long j, int i) {
        ScrollingLogic scrollingLogic = this.A00;
        scrollingLogic.A00 = i;
        InterfaceC137936Mt interfaceC137936Mt = scrollingLogic.A01;
        if (interfaceC137936Mt != null && (scrollingLogic.A05.Akn() || scrollingLogic.A05.Akm())) {
            return interfaceC137936Mt.ACH(scrollingLogic.A09, scrollingLogic.A00, j);
        }
        return ScrollingLogic.A00(scrollingLogic.A04, scrollingLogic, i, j);
    }
}
