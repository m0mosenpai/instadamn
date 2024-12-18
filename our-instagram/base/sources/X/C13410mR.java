package X;

import java.util.List;

/* renamed from: X.0mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13410mR extends AbstractC66542zW {
    public final /* synthetic */ List A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ InterfaceC16620sF A02;
    public final /* synthetic */ InterfaceC16620sF A03;

    public C13410mR(List list, List list2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2) {
        this.A01 = list;
        this.A00 = list2;
        this.A03 = interfaceC16620sF;
        this.A02 = interfaceC16620sF2;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        return ((Boolean) this.A02.invoke(this.A01.get(i), this.A00.get(i2))).booleanValue();
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        return ((Boolean) this.A03.invoke(this.A01.get(i), this.A00.get(i2))).booleanValue();
    }
}
