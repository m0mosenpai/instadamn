package X;

import com.instagram.ui.animation.timeline.linear.AdvanceTargetTaskDisabledException;
import com.instagram.ui.animation.timeline.linear.MultipleAdvanceInTimelineException;
import com.instagram.ui.animation.timeline.linear.TaskNotAvailableException;
import com.instagram.ui.animation.timeline.linear.TimelineNotStartedException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class ILR {
    public InterfaceC43393JFi A00;
    public final C37648Ghh A01;

    public final C37729Gj4 A00(InterfaceC43393JFi interfaceC43393JFi) {
        InterfaceC43393JFi interfaceC43393JFi2;
        Throwable th;
        C37729Gj4 c37729Gj4;
        if (this.A00 != null) {
            th = MultipleAdvanceInTimelineException.A00;
        } else {
            ArrayList A1E = AbstractC166987dD.A1E();
            C37648Ghh c37648Ghh = this.A01;
            C37651Ghk c37651Ghk = c37648Ghh.A01;
            while (true) {
                if (c37651Ghk != null) {
                    interfaceC43393JFi2 = c37651Ghk.A01.A04;
                    if (interfaceC43393JFi.equals(interfaceC43393JFi2)) {
                        break;
                    }
                    A1E.add(c37651Ghk);
                    c37651Ghk = c37651Ghk.A00;
                } else {
                    interfaceC43393JFi2 = null;
                    break;
                }
            }
            if (interfaceC43393JFi.equals(interfaceC43393JFi2)) {
                C37649Ghi c37649Ghi = c37651Ghk.A01;
                if (!c37649Ghi.A03) {
                    if (c37649Ghi.A02) {
                        th = AdvanceTargetTaskDisabledException.A00;
                    } else {
                        Iterator it = A1E.iterator();
                        while (it.hasNext()) {
                            ((C37651Ghk) it.next()).A01.A01 = C05F.A0C;
                        }
                        c37649Ghi.A01 = C05F.A01;
                        InterfaceC09390do interfaceC09390do = c37648Ghh.A08;
                        C38221GrQ c38221GrQ = (C38221GrQ) interfaceC09390do.getValue();
                        InterfaceC43393JFi interfaceC43393JFi3 = c37648Ghh.A01.A01.A04;
                        C14360o3.A0B(interfaceC43393JFi3, 0);
                        if (!c38221GrQ.A01.get()) {
                            TimelineNotStartedException timelineNotStartedException = TimelineNotStartedException.A00;
                            C14360o3.A0B(timelineNotStartedException, 0);
                            c37729Gj4 = new C37729Gj4(false, timelineNotStartedException);
                        } else {
                            C38221GrQ.A00(interfaceC43393JFi3, c38221GrQ);
                            c37729Gj4 = C37729Gj4.A02;
                        }
                        if (!c37729Gj4.A01) {
                            ((C38221GrQ) interfaceC09390do.getValue()).A01();
                            return c37729Gj4;
                        }
                        this.A00 = interfaceC43393JFi;
                        return C37729Gj4.A02;
                    }
                }
            }
            th = TaskNotAvailableException.A00;
        }
        return new C37729Gj4(false, th);
    }

    public ILR(C37648Ghh c37648Ghh) {
        this.A01 = c37648Ghh;
    }
}
