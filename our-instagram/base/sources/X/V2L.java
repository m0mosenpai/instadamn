package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V2L extends AbstractC69220Vjn {
    public final C68729Vb8 A00;
    public final ImageInfo A01;
    public final List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2L(C69354Vm0 c69354Vm0) {
        super(new W2a(c69354Vm0.A01, c69354Vm0.A05), c69354Vm0.A02, c69354Vm0.A03, 100);
        C14360o3.A0B(c69354Vm0, 1);
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        this.A01 = AbstractC70134W6i.A01(c69354Vm0.A00);
        arrayList.addAll(AbstractC70134W6i.A02(c69354Vm0.A04));
        this.A00 = new C68729Vb8(c69354Vm0.A03);
    }

    public V2L(C69389VmZ c69389VmZ, int i) {
        super(new W2a(c69389VmZ.A01, c69389VmZ.A06), c69389VmZ.A03, c69389VmZ.A04, i);
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        this.A01 = AbstractC70134W6i.A01(c69389VmZ.A00);
        arrayList.addAll(AbstractC70134W6i.A02(c69389VmZ.A05));
        this.A00 = new C68729Vb8(c69389VmZ.A04);
    }

    public V2L(C69480Vo3 c69480Vo3) {
        super(new W2a(c69480Vo3.A04, c69480Vo3.A0G), c69480Vo3.A08, c69480Vo3.A0A, 100);
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        this.A01 = AbstractC70134W6i.A01(c69480Vo3.A01);
        arrayList.addAll(AbstractC70134W6i.A02(c69480Vo3.A0B));
        this.A00 = new C68729Vb8(c69480Vo3.A0A);
    }
}
