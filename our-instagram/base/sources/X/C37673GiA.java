package X;

import com.instagram.ui.animation.timeline.linear.TaskNotAvailableException;

/* renamed from: X.GiA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37673GiA {
    public final C37648Ghh A00;

    public final C37729Gj4 A01(InterfaceC43393JFi interfaceC43393JFi, InterfaceC43446JHk interfaceC43446JHk) {
        C37651Ghk c37651Ghk = (C37651Ghk) this.A00.A03.get(interfaceC43393JFi);
        if (c37651Ghk != null) {
            c37651Ghk.A01.A00 = interfaceC43446JHk;
            return C37729Gj4.A02;
        }
        TaskNotAvailableException taskNotAvailableException = TaskNotAvailableException.A00;
        C14360o3.A0B(taskNotAvailableException, 0);
        return new C37729Gj4(false, taskNotAvailableException);
    }

    public final C37729Gj4 A00(InterfaceC43393JFi interfaceC43393JFi) {
        C37651Ghk c37651Ghk = (C37651Ghk) this.A00.A03.get(interfaceC43393JFi);
        if (c37651Ghk == null) {
            TaskNotAvailableException taskNotAvailableException = TaskNotAvailableException.A00;
            C14360o3.A0B(taskNotAvailableException, 0);
            return new C37729Gj4(false, taskNotAvailableException);
        }
        c37651Ghk.A01.A02 = true;
        return C37729Gj4.A02;
    }

    public C37673GiA(C37648Ghh c37648Ghh) {
        this.A00 = c37648Ghh;
    }
}
