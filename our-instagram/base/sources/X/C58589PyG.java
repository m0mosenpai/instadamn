package X;

/* renamed from: X.PyG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58589PyG implements InterfaceC1120053p {
    public Object A00;

    @Override // X.InterfaceC1120053p
    public final boolean AE8() {
        Object obj = this.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    @Override // X.InterfaceC1120053p
    public final int COn() {
        return AbstractC25230BEn.A0D(this.A00, "null cannot be cast to non-null type kotlin.Number");
    }

    @Override // X.InterfaceC1120053p
    public final long Cmb() {
        Object obj = this.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Number");
        return AbstractC166987dD.A0N(obj);
    }

    @Override // X.InterfaceC1120053p
    public final Number Ctf() {
        Object obj = this.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Number");
        return (Number) obj;
    }

    @Override // X.InterfaceC1120053p
    public final String Ep1() {
        Object obj = this.A00;
        C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    @Override // X.InterfaceC1120053p
    public final boolean isNull() {
        if (this.A00 != null) {
            return false;
        }
        return true;
    }
}
