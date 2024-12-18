package X;

import java.util.Map;

/* renamed from: X.TDp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64431TDp implements InterfaceC65437Tk9 {
    public static final InterfaceC65668Tqy A03 = C64330T9s.A00;
    public final Map A01 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();
    public final InterfaceC65668Tqy A00 = A03;

    @Override // X.InterfaceC65437Tk9
    public final /* bridge */ /* synthetic */ InterfaceC65437Tk9 EDF(InterfaceC65668Tqy interfaceC65668Tqy, Class cls) {
        this.A01.put(cls, interfaceC65668Tqy);
        this.A02.remove(cls);
        return this;
    }
}
