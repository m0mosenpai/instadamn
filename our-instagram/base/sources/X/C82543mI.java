package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82543mI implements InterfaceC82553mJ {
    public final InterfaceC82423m6 A00;
    public final C82533mH A01;
    public final InterfaceC82443m8 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.A03;
        sb.append(AnonymousClass001.A05(str.hashCode(), "itemHash: ", ", sessionId: ", this.A05));
        sb.append('\n');
        List list = this.A06;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        sb.append(AbstractC001800i.A0P("\n", "", "", arrayList, null));
        sb.append('\n');
        sb.append(AnonymousClass001.A0R("itemId: ", str));
        sb.append('\n');
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C82543mI(InterfaceC82423m6 interfaceC82423m6, C82533mH c82533mH, InterfaceC82443m8 interfaceC82443m8, String str, String str2, String str3, List list) {
        this.A06 = list;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = interfaceC82423m6;
        this.A01 = c82533mH;
        this.A02 = interfaceC82443m8;
    }
}
