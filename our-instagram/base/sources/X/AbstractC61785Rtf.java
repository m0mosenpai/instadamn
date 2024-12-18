package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Rtf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61785Rtf {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static String A00(C170097iO c170097iO, String str, List list) {
        String str2;
        String str3;
        String str4;
        ListIterator listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex() + 1;
            Object next = listIterator.next();
            ListIterator listIterator2 = list.listIterator(nextIndex);
            while (listIterator2.hasNext()) {
                Object next2 = listIterator2.next();
                if (C170097iO.A00(c170097iO, next, next2)) {
                    String str5 = "null";
                    if (next == null) {
                        str2 = "null";
                    } else {
                        str2 = next.toString();
                    }
                    if (next2 == null) {
                        str3 = "null";
                    } else {
                        str3 = next2.toString();
                    }
                    if (next == null) {
                        str4 = "null";
                    } else {
                        str4 = MSY.A0h(next);
                    }
                    String A0g = AnonymousClass001.A0g("<cls>", str4, "</cls>");
                    if (next2 != null) {
                        str5 = MSY.A0h(next2);
                    }
                    String A0g2 = AnonymousClass001.A0g("<cls>", str5, "</cls>");
                    InterfaceC16820sZ interfaceC16820sZ = AbstractC62853SUa.A00;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (EnumC50702Ur.A02.compareTo(AbstractC50692Uq.A00()) >= 0) {
                        java.util.Set set = AbstractC50692Uq.A00;
                        if (!set.isEmpty()) {
                            ?? r0 = 0;
                            for (Object obj : set) {
                                String[] strArr = ((AbstractC50682Uo) obj).A00;
                                if (AbstractC009903n.A0O("Litho.DebugInfo", strArr) || AbstractC009903n.A0O("*", strArr)) {
                                    r0 = MSY.A0j(r0);
                                    r0.add(obj);
                                }
                            }
                            if (r0 == 0) {
                                r0 = C16930sl.A00;
                            }
                            if (AbstractC166987dD.A1b(r0)) {
                                LinkedHashMap A1I = AbstractC166987dD.A1I();
                                A1I.put("section", str);
                                A1I.put("size", AbstractC43592JPx.A0s(list));
                                A1I.put("item", str2);
                                A1I.put("item-type", A0g);
                                A1I.put("other-item", str3);
                                A1I.put("other-item-type", A0g2);
                                A1I.put("index", Integer.valueOf(i));
                                A1I.put("next-index", Integer.valueOf(nextIndex));
                                A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "DuplicateItemsInSection");
                                C58571Pxp c58571Pxp = new C58571Pxp(currentTimeMillis, "Litho.DebugInfo", (String) interfaceC16820sZ.invoke(), A1I);
                                Iterator it = r0.iterator();
                                while (it.hasNext()) {
                                    ((AbstractC50682Uo) it.next()).A00(c58571Pxp);
                                }
                            }
                        }
                    }
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Duplicates are [type:");
                    A1C.append(A0g);
                    A1C.append(" hash:");
                    A1C.append(System.identityHashCode(next));
                    A1C.append(" position:");
                    A1C.append(i);
                    AbstractC58320PtC.A1N("] and [type:", A0g2, " hash:", A1C);
                    A1C.append(System.identityHashCode(next2));
                    A1C.append(" position:");
                    A1C.append(nextIndex);
                    return AbstractC58319PtB.A0w(A1C);
                }
                nextIndex++;
            }
            i++;
        }
        return null;
    }
}
