package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Y5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2Y5 implements Cloneable {
    public C50932Vp A00;
    public C2V9 A01;
    public C77083cu A02;
    public final AbstractC50812Vc A03;
    public final C2XE A04;
    public final InterfaceC115915Mh A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public Map manualKeysCounter;

    public final void A00(C2W1 c2w1) {
        InterfaceC09390do interfaceC09390do = this.A07;
        List list = (List) interfaceC09390do.getValue();
        if (list != null && !list.isEmpty()) {
            List list2 = (List) interfaceC09390do.getValue();
            C14360o3.A0B(list2, 0);
            List list3 = c2w1.A0g;
            if (list3 == null) {
                list3 = new ArrayList(list2.size());
                c2w1.A0g = list3;
            }
            list3.addAll(list2);
        }
    }

    public C2Y5(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2V9 c2v9) {
        InterfaceC115915Mh interfaceC115915Mh;
        this.A03 = abstractC50812Vc;
        this.A04 = c2xe;
        if (abstractC50812Vc instanceof AbstractC50792Va) {
            interfaceC115915Mh = ((AbstractC50792Va) abstractC50812Vc).A0f();
        } else {
            interfaceC115915Mh = null;
        }
        this.A05 = interfaceC115915Mh;
        this.A06 = AbstractC09440dt.A01(C76203bP.A00);
        this.A01 = c2v9;
        this.A07 = AbstractC09440dt.A01(C76213bR.A00);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            Object clone = super.clone();
            C14360o3.A0C(clone, "null cannot be cast to non-null type com.facebook.litho.ScopedComponentInfo");
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
