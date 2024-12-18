package X;

import com.instagram.ui.animation.timeline.linear.TaskNotAvailableException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.GrQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38221GrQ {
    public final C37648Ghh A00;
    public final AtomicBoolean A01 = new AtomicBoolean();

    public static final C37729Gj4 A00(InterfaceC43393JFi interfaceC43393JFi, C38221GrQ c38221GrQ) {
        C37648Ghh c37648Ghh = c38221GrQ.A00;
        C37651Ghk c37651Ghk = (C37651Ghk) c37648Ghh.A03.get(interfaceC43393JFi);
        if (c37651Ghk != null) {
            c37648Ghh.A01 = c37651Ghk;
            C37649Ghi c37649Ghi = c37651Ghk.A01;
            c37649Ghi.A00.ELB(c37649Ghi, (C38222GrR) c37648Ghh.A07.getValue());
            return C37729Gj4.A02;
        }
        TaskNotAvailableException taskNotAvailableException = TaskNotAvailableException.A00;
        C14360o3.A0B(taskNotAvailableException, 0);
        return new C37729Gj4(false, taskNotAvailableException);
    }

    public final void A01() {
        C37648Ghh c37648Ghh = this.A00;
        Iterator A16 = AbstractC166997dE.A16(c37648Ghh.A03);
        while (A16.hasNext()) {
            C37649Ghi c37649Ghi = ((C37651Ghk) A16.next()).A01;
            c37649Ghi.A01 = C05F.A00;
            c37649Ghi.A00.reset();
            c37649Ghi.A03 = false;
        }
        C37651Ghk c37651Ghk = c37648Ghh.A02;
        C14360o3.A0B(c37651Ghk, 0);
        c37648Ghh.A01 = c37651Ghk;
        this.A01.set(false);
        ((ILR) c37648Ghh.A04.getValue()).A00 = null;
    }

    public C38221GrQ(C37648Ghh c37648Ghh) {
        this.A00 = c37648Ghh;
    }
}
