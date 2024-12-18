package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HwA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40419HwA {
    public static C45150Jyq parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            String str = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            LineType lineType = null;
            C38321qM c38321qM = null;
            ArrayList arrayList = null;
            User user = null;
            Boolean bool5 = null;
            ThreadItemType threadItemType = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1232);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("can_inline_expand_below".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("collapsed_post_suffix".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_contextual".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_parent_unavailable".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("line_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    lineType = (LineType) LineType.A01.get(A1P2);
                    if (lineType == null) {
                        lineType = LineType.A06;
                    }
                } else if ("post".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC111324zv.A00(1233).equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("should_show_replies_cta".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("should_show_reply_tap_cta".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("thread_item_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    threadItemType = (ThreadItemType) ThreadItemType.A01.get(A1P);
                    if (threadItemType == null) {
                        threadItemType = ThreadItemType.A06;
                    }
                } else if ("view_replies_cta_string".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("can_inline_expand_below", c16l, "ThreadItem");
            } else if (lineType != null || !(c16l instanceof C07950bF)) {
                if (c38321qM == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("post", c16l, "ThreadItem");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "ThreadItem");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("should_show_replies_cta", c16l, "ThreadItem");
                } else if (threadItemType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("thread_item_type", c16l, "ThreadItem");
                } else {
                    return new C45150Jyq(lineType, threadItemType, c38321qM, user, bool3, bool4, bool5, str, str2, arrayList, bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("line_type", c16l, "ThreadItem");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
