package X;

/* renamed from: X.IoX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42309IoX implements InterfaceC66482zP {
    public final C32071E6x A00;
    public final InterfaceC43396JFl A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "upcoming-event-cta-row-item";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C32071E6x c32071E6x;
        C42309IoX c42309IoX = (C42309IoX) obj;
        C32071E6x c32071E6x2 = this.A00;
        if (c42309IoX != null) {
            c32071E6x = c42309IoX.A00;
        } else {
            c32071E6x = null;
        }
        return C14360o3.A0K(c32071E6x2, c32071E6x);
    }

    public C42309IoX(C32071E6x c32071E6x, InterfaceC43396JFl interfaceC43396JFl) {
        this.A00 = c32071E6x;
        this.A01 = interfaceC43396JFl;
    }
}
