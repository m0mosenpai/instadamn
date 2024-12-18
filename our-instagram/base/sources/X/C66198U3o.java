package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.U3o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66198U3o {
    public final InterfaceC58682mR A00;
    public final C51756Mtf A01;
    public final String A02;
    public final List A03;
    public final Map A04;

    public C66198U3o(InterfaceC58682mR interfaceC58682mR, C51756Mtf c51756Mtf, String str, List list, List list2) {
        this.A02 = str;
        this.A00 = interfaceC58682mR;
        this.A03 = list2;
        this.A01 = c51756Mtf;
        TreeMap treeMap = new TreeMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C69544Vr8 c69544Vr8 = (C69544Vr8) it.next();
            treeMap.put(c69544Vr8.A00, c69544Vr8);
        }
        this.A04 = treeMap;
    }
}
