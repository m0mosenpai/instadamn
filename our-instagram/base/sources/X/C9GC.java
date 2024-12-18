package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.9GC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GC extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GC(C5yI c5yI, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = c5yI;
        if (1 - i != 0) {
            this.A03 = str;
            this.A02 = str2;
        } else {
            this.A02 = str;
            this.A03 = str2;
        }
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                ((InterfaceC132365yF) this.A01).CrW(this.A02, this.A03);
                break;
            case 1:
                ((C5yI) this.A01).DCr(this.A02, this.A03);
                break;
            case 2:
                ((C5yI) this.A01).Daa(this.A03, this.A02);
                break;
            default:
                Object value = AbstractC09440dt.A00(EnumC09460dv.A02, new D82((Fragment) this.A01, this.A02)).getValue();
                if (value == null) {
                    throw new IllegalStateException(AnonymousClass001.A0R(AbstractC111324zv.A00(3499), this.A03));
                }
                return value;
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GC(Object obj, String str, String str2, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = str2;
    }
}
