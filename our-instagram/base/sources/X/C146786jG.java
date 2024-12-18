package X;

/* renamed from: X.6jG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146786jG implements InterfaceC43071ya {
    public final InterfaceC146776jF A00;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0) {
            if (intValue == 2) {
                InterfaceC146776jF interfaceC146776jF = this.A00;
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                Object obj2 = c59062n7.A04;
                C14360o3.A06(obj2);
                interfaceC146776jF.DNe(this, (C41181vS) obj, (C149716oO) obj2);
                return;
            }
            return;
        }
        InterfaceC146776jF interfaceC146776jF2 = this.A00;
        Object obj3 = c59062n7.A03;
        C14360o3.A06(obj3);
        Object obj4 = c59062n7.A04;
        C14360o3.A06(obj4);
        interfaceC146776jF2.DNw(this, (C41181vS) obj3, (C149716oO) obj4);
    }

    public C146786jG(InterfaceC146776jF interfaceC146776jF) {
        this.A00 = interfaceC146776jF;
    }
}
