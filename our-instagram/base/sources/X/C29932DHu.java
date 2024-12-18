package X;

import android.util.SparseArray;

/* renamed from: X.DHu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29932DHu extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SparseArray A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29932DHu(SparseArray sparseArray, InterfaceC16660sJ interfaceC16660sJ, float f, int i, int i2, int i3) {
        super(1);
        this.A04 = sparseArray;
        this.A02 = i;
        this.A03 = i2;
        this.A05 = interfaceC16660sJ;
        this.A01 = i3;
        this.A00 = f;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        SparseArray sparseArray = this.A04;
        sparseArray.put(this.A02, obj);
        if (sparseArray.size() == this.A03) {
            this.A05.invoke(AbstractC27698CJr.A00(sparseArray, this.A00, this.A01));
        }
        return C0eB.A00;
    }
}
