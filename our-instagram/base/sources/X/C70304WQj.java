package X;

import android.util.SparseArray;

/* renamed from: X.WQj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70304WQj implements InterfaceC58362lv {
    public final /* synthetic */ AbstractC129435t5 A00;
    public final /* synthetic */ AbstractC129455t8 A01;

    public C70304WQj(AbstractC129435t5 abstractC129435t5, AbstractC129455t8 abstractC129455t8) {
        this.A01 = abstractC129455t8;
        this.A00 = abstractC129435t5;
    }

    @Override // X.InterfaceC58362lv
    public final void onChanged(Object obj) {
        AbstractC129455t8 abstractC129455t8 = this.A01;
        C58252li c58252li = abstractC129455t8.A05;
        Object A02 = c58252li.A02();
        A02.getClass();
        SparseArray sparseArray = (SparseArray) A02;
        AbstractC129435t5 abstractC129435t5 = this.A00;
        int i = abstractC129435t5.A02;
        Object obj2 = sparseArray.get(i);
        sparseArray.put(i, obj);
        c58252li.A0B(sparseArray);
        abstractC129455t8.A0L(abstractC129435t5, obj, obj2);
    }
}
