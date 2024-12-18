package X;

/* renamed from: X.IlY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42124IlY implements C3u8 {
    public final int A00;
    public final Object A01;

    public C42124IlY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3u8
    public final /* synthetic */ String AX2() {
        switch (this.A00) {
            case 0:
                return (String) AbstractC25226BEj.A1C(this.A01);
            case 1:
                return ((C63397SjR) this.A01).A09();
            default:
                return ((C42127Ilb) this.A01).A00;
        }
    }
}
