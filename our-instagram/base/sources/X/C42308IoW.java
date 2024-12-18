package X;

/* renamed from: X.IoW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42308IoW implements InterfaceC66482zP {
    public final C51759Mti A00;
    public final IHM A01;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return ((C42323Iol) this.A00.A00).A02;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C51759Mti c51759Mti;
        C42308IoW c42308IoW = (C42308IoW) obj;
        C51759Mti c51759Mti2 = this.A00;
        if (c42308IoW != null) {
            c51759Mti = c42308IoW.A00;
        } else {
            c51759Mti = null;
        }
        return C14360o3.A0K(c51759Mti2, c51759Mti);
    }

    public C42308IoW(C51759Mti c51759Mti, IHM ihm) {
        this.A00 = c51759Mti;
        this.A01 = ihm;
    }
}
