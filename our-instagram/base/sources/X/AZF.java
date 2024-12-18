package X;

import android.graphics.Bitmap;
import android.util.SparseArray;

/* loaded from: classes4.dex */
public final class AZF implements BDF {
    public final /* synthetic */ AML A00;
    public final /* synthetic */ C22814A4h A01;
    public final /* synthetic */ Integer A02;

    public AZF(AML aml, C22814A4h c22814A4h, Integer num) {
        this.A00 = aml;
        this.A01 = c22814A4h;
        this.A02 = num;
    }

    @Override // X.BDF
    public final void Czd(Bitmap bitmap, long j) {
        C22814A4h c22814A4h = this.A01;
        int intValue = this.A02.intValue();
        c22814A4h.A00.Czc(bitmap);
        AML aml = this.A00;
        SparseArray sparseArray = aml.A09;
        Object obj = sparseArray.get(intValue);
        if (obj != null) {
            aml.A02.BQq().EFO(intValue, obj);
            sparseArray.remove(intValue);
        }
    }

    @Override // X.BDF
    public final void DEF(Exception exc) {
        this.A01.A00.D2I(AbstractC166987dD.A18(String.valueOf(exc)));
        AML aml = this.A00;
        int intValue = this.A02.intValue();
        SparseArray sparseArray = aml.A09;
        Object obj = sparseArray.get(intValue);
        if (obj != null) {
            aml.A02.BQq().EFO(intValue, obj);
            sparseArray.remove(intValue);
        }
    }

    @Override // X.BDF
    public final void DLI() {
        ((LS3) this.A01.A00).A00.invoke(C51503Moo.A00);
    }
}
