package X;

/* renamed from: X.0Yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07040Yw implements InterfaceC16530ry {
    public Boolean A00;
    public Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16620sF A04;
    public final /* synthetic */ InterfaceC16620sF A05;

    @Override // X.InterfaceC16530ry, X.InterfaceC16130rD
    public final /* bridge */ /* synthetic */ Object CES(Object obj, C0YR c0yr) {
        C14360o3.A0B(obj, 0);
        Boolean bool = this.A00;
        if (bool == null) {
            String str = this.A03;
            if (!C17280tP.A4D) {
                bool = null;
            } else {
                boolean z = true;
                if (!C14360o3.A0K(C17280tP.A4B, true) || !C17280tP.A4C.contains(str)) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            this.A00 = bool;
        }
        if (C14360o3.A0K(bool, true)) {
            return this.A01;
        }
        return this.A04.invoke(this.A03, this.A02);
    }

    @Override // X.InterfaceC16530ry
    public final /* bridge */ /* synthetic */ void Egi(Object obj, Object obj2, C0YR c0yr) {
        C14360o3.A0B(obj, 0);
        Boolean bool = this.A00;
        if (bool == null) {
            String str = this.A03;
            if (!C17280tP.A4D) {
                bool = null;
            } else {
                boolean z = true;
                if (!C14360o3.A0K(C17280tP.A4B, true) || !C17280tP.A4C.contains(str)) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            this.A00 = bool;
        }
        if (C14360o3.A0K(bool, true)) {
            this.A01 = obj2;
        } else {
            ((InterfaceC19610xo) this.A05.invoke(this.A03, obj2)).apply();
        }
    }

    public C07040Yw(Object obj, String str, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2) {
        this.A02 = obj;
        this.A03 = str;
        this.A04 = interfaceC16620sF;
        this.A05 = interfaceC16620sF2;
        this.A01 = obj;
    }
}
