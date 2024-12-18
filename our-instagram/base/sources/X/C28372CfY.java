package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.CfY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28372CfY {
    public boolean A01;
    public final InterfaceC16660sJ A06;
    public final C26168Bht A03 = new C26168Bht(2131970108);
    public final C29156CtN A07 = new Object();
    public final LinkedHashMap A05 = AbstractC166987dD.A1I();
    public final C26168Bht A02 = new C26168Bht(2131970107);
    public TreeMap A00 = new TreeMap();
    public final LinkedHashMap A04 = AbstractC166987dD.A1I();

    public final void A03(CRV crv) {
        C14360o3.A0B(crv, 0);
        LinkedHashMap linkedHashMap = this.A05;
        linkedHashMap.clear();
        linkedHashMap.putAll(crv.A01);
        TreeMap treeMap = new TreeMap(new C31460Ds4((InterfaceC16620sF) new C30189DRu(crv, 18), 16));
        this.A00 = treeMap;
        treeMap.putAll(crv.A02);
        A00(this);
    }

    public static final void A00(C28372CfY c28372CfY) {
        LinkedHashMap linkedHashMap = c28372CfY.A04;
        linkedHashMap.clear();
        AbstractC25227BEk.A1O(c28372CfY.A03, linkedHashMap, 2131970108);
        LinkedHashMap linkedHashMap2 = c28372CfY.A05;
        if (linkedHashMap2.isEmpty()) {
            AbstractC25227BEk.A1O(c28372CfY.A07, linkedHashMap, 1);
        } else {
            linkedHashMap.putAll(linkedHashMap2);
        }
        c28372CfY.A01(c28372CfY.A01);
        AbstractC25227BEk.A1O(c28372CfY.A02, linkedHashMap, 2131970107);
        linkedHashMap.putAll(c28372CfY.A00);
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        Collection values = linkedHashMap.values();
        C14360o3.A07(values);
        viewModelListUpdate.A01(AbstractC001800i.A0a(values));
        c28372CfY.A06.invoke(viewModelListUpdate);
    }

    private final void A01(boolean z) {
        TreeMap treeMap = this.A00;
        ArrayList A17 = AbstractC25225BEi.A17(treeMap.size());
        Iterator A14 = AbstractC166997dE.A14(treeMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            int A0H = AbstractC166987dD.A0H(A1K.getKey());
            C26172Bhx c26172Bhx = (C26172Bhx) A1K.getValue();
            Integer valueOf = Integer.valueOf(A0H);
            ImageUrl imageUrl = c26172Bhx.A01;
            ImageUrl imageUrl2 = c26172Bhx.A02;
            String str = c26172Bhx.A06;
            String str2 = c26172Bhx.A07;
            boolean z2 = c26172Bhx.A0B;
            String str3 = c26172Bhx.A08;
            String str4 = c26172Bhx.A05;
            Integer num = c26172Bhx.A04;
            boolean z3 = c26172Bhx.A0A;
            Integer num2 = c26172Bhx.A03;
            C44O c44o = c26172Bhx.A00;
            AbstractC167007dF.A1G(str, 2, str3);
            AbstractC166997dE.A1R(valueOf, new C26172Bhx(c44o, imageUrl, imageUrl2, num, num2, str, str2, str3, str4, z2, z, z3), A17);
        }
        this.A00.clear();
        AbstractC06930Yk.A0F(A17, this.A00);
    }

    public final List A02() {
        Collection values = this.A05.values();
        C14360o3.A07(values);
        ArrayList A0q = AbstractC167017dG.A0q(values);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            A0q.add(AnonymousClass001.A0E(((C26172Bhx) it.next()).A08, '\"', '\"'));
        }
        return A0q;
    }

    public final void A04(boolean z) {
        this.A01 = z;
        LinkedHashMap linkedHashMap = this.A05;
        ArrayList A17 = AbstractC25225BEi.A17(linkedHashMap.size());
        Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            int A0H = AbstractC166987dD.A0H(A1K.getKey());
            C26172Bhx c26172Bhx = (C26172Bhx) A1K.getValue();
            Integer valueOf = Integer.valueOf(A0H);
            ImageUrl imageUrl = c26172Bhx.A01;
            ImageUrl imageUrl2 = c26172Bhx.A02;
            String str = c26172Bhx.A06;
            String str2 = c26172Bhx.A07;
            boolean z2 = c26172Bhx.A0B;
            String str3 = c26172Bhx.A08;
            String str4 = c26172Bhx.A05;
            Integer num = c26172Bhx.A04;
            boolean z3 = c26172Bhx.A0A;
            Integer num2 = c26172Bhx.A03;
            C44O c44o = c26172Bhx.A00;
            AbstractC167007dF.A1G(str, 2, str3);
            AbstractC166997dE.A1R(valueOf, new C26172Bhx(c44o, imageUrl, imageUrl2, num, num2, str, str2, str3, str4, z2, z, z3), A17);
        }
        linkedHashMap.clear();
        AbstractC06930Yk.A0F(A17, linkedHashMap);
        A01(this.A01);
        A00(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.CtN, java.lang.Object] */
    public C28372CfY(InterfaceC16660sJ interfaceC16660sJ) {
        this.A06 = interfaceC16660sJ;
    }
}
