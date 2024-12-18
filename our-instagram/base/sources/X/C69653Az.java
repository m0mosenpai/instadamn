package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;

/* renamed from: X.3Az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69653Az implements InterfaceC43071ya {
    public C64012vM A00;

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String A00;
        C14360o3.A0B(c59062n7, 0);
        C14360o3.A0B(interfaceC57162jr, 1);
        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
        if (intValue != 0 && intValue != 1) {
            C64012vM c64012vM = this.A00;
            C3TR c3tr = (C3TR) c59062n7.A04;
            int i = c3tr.A00;
            long j = c3tr.A01;
            Integer num = c3tr.A02;
            C14360o3.A0B(num, 2);
            UserSession userSession = c64012vM.A02;
            if (C18U.A06(C06090Tz.A05, userSession, 36317491837146339L)) {
                C14360o3.A0B(userSession, 0);
                C12210kP c12210kP = new C12210kP(userSession);
                c12210kP.A01 = "reel_feed_timeline";
                C25531Mh A0D = C25531Mh.A0D(c12210kP.A00());
                if (((AbstractC02600Aj) A0D).A00.isSampled()) {
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    switch (num.intValue()) {
                        case 0:
                            A00 = "UNKNOWN";
                            break;
                        case 1:
                            A00 = AbstractC111324zv.A00(1640);
                            break;
                        case 2:
                            A00 = "STORY_TRAY_TAIL_FETCH";
                            break;
                        case 3:
                            A00 = "STORY_VIEWER_FETCH";
                            break;
                        default:
                            A00 = "STORIES_HEAD_LOAD_STREAMING";
                            break;
                    }
                    A0D.A0R(DatePickerDialogModule.ARG_MODE, A00);
                    A0D.A0Q("time_elapsed", Long.valueOf(currentTimeMillis));
                    A0D.A0m("reel_feed_timeline");
                    A0D.A0Q("version", 4L);
                    A0D.A0Q("spinner_position", Long.valueOf(i));
                    A0D.Cht();
                    return;
                }
                return;
            }
            return;
        }
        this.A00.A01(((C3TR) c59062n7.A04).A00);
    }
}
