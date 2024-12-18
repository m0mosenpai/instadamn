package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.LinkedList;

/* renamed from: X.NsK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53888NsK {
    /* JADX WARN: Type inference failed for: r2v19, types: [X.OBe, java.lang.Object] */
    public static LinkedList A00(UserSession userSession) {
        ImmutableList of;
        LinkedList linkedList = new LinkedList();
        if (C18U.A06(C06090Tz.A05, userSession, 36326902109386937L)) {
            of = ImmutableList.of(0, 1000, 810, 1003, 813, 1013, 706, 1100, 1101, 1009, 1010, 1105, 1104, 1103, 642, 1106, 1108);
        } else {
            Integer[] numArr = new Integer[47];
            System.arraycopy(new Integer[]{1009, 1010, 1011, 1012, 1013, 1100, 1101, 1102, 1103, 1104, 1105, 1106, 1107, 1108, 1109, 1110, 643, 640, 706, 703, 705, 707, 709, 710, 702, 642, 112}, 0, numArr, 0, 27);
            System.arraycopy(new Integer[]{114, 111, 615, 614, 613, 605, 616, 603, 612, 608, 24, 17, 23, 25, 1, 27, 28, 2, 10, 15}, 0, numArr, 27, 20);
            of = ImmutableList.of(0, 810, 813, 1000, 1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, numArr);
        }
        C1LC it = of.iterator();
        while (it.hasNext()) {
            C8M7 A01 = C8M4.A00(userSession).A01(AbstractC167007dF.A0B(it));
            ?? obj = new Object();
            obj.A01 = A01;
            obj.A00 = A01.A00;
            obj.A03 = false;
            obj.A02 = false;
            linkedList.add(obj);
        }
        return linkedList;
    }
}
