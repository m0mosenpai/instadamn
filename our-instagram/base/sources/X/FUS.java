package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FUS {
    public static C50092Rx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("folder_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("folder_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DatePickerDialogModule.ARG_MODE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("sequence_number".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("can_be_renamed".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("can_be_reordered".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("can_be_deleted".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("can_move_thread_to".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("folder_id", c16l, "DirectFolderSummary");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DatePickerDialogModule.ARG_MODE, c16l, "DirectFolderSummary");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("sequence_number", c16l, "DirectFolderSummary");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("can_be_renamed", c16l, "DirectFolderSummary");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("can_be_reordered", c16l, "DirectFolderSummary");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("can_be_deleted", c16l, "DirectFolderSummary");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("can_move_thread_to", c16l, "DirectFolderSummary");
                } else {
                    return new C50092Rx(str, str2, str3, num.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("folder_name", c16l, "DirectFolderSummary");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C50092Rx c50092Rx) {
        anonymousClass182.A0d();
        String str = c50092Rx.A05;
        if (str != null) {
            anonymousClass182.A0S("folder_id", str);
        }
        String str2 = c50092Rx.A02;
        if (str2 != null) {
            anonymousClass182.A0S("folder_name", str2);
        }
        String str3 = c50092Rx.A06;
        if (str3 != null) {
            anonymousClass182.A0S(DatePickerDialogModule.ARG_MODE, str3);
        }
        anonymousClass182.A0Q("sequence_number", c50092Rx.A00);
        anonymousClass182.A0T("can_be_renamed", c50092Rx.A08);
        anonymousClass182.A0T("can_be_reordered", c50092Rx.A09);
        anonymousClass182.A0T("can_be_deleted", c50092Rx.A07);
        anonymousClass182.A0T("can_move_thread_to", c50092Rx.A0A);
        anonymousClass182.A0a();
    }
}
