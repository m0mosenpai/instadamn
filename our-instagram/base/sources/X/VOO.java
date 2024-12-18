package X;

import com.instagram.api.schemas.GroupMetadataImpl;
import com.instagram.api.schemas.RingSpecImpl;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VOO {
    public static GroupMetadataImpl parseFromJson(C16L c16l) {
        String str;
        String A00;
        C0KX c0kx;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            Long l = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            Integer num7 = null;
            Integer num8 = null;
            ArrayList arrayList3 = null;
            RingSpecImpl ringSpecImpl = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                str = "is_group_notes_allowed";
                A00 = AbstractC111324zv.A00(117);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("admin_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("blocked_user_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("can_post".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("channel_admin_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("chat_thread_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("group_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("group_pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("has_pending_admin_invite".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("hidden".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("is_group".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("is_group_full".equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                } else if ("is_group_notes_allowed".equals(A0s)) {
                    bool7 = AbstractC166997dE.A0d(c16l);
                } else if ("is_recommendable".equals(A0s)) {
                    bool8 = AbstractC166997dE.A0d(c16l);
                } else if ("is_viewer_admin".equals(A0s)) {
                    bool9 = AbstractC166997dE.A0d(c16l);
                } else if ("is_viewer_in_chat_thread".equals(A0s)) {
                    bool10 = AbstractC166997dE.A0d(c16l);
                } else if ("is_viewer_invited".equals(A0s)) {
                    bool11 = AbstractC166997dE.A0d(c16l);
                } else if ("mandatory_approvals_expire_at".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("num_admins".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("num_blocked_users".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("num_pending_follow_requests".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("num_pending_invites".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("num_pending_notes".equals(A0s)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if ("num_pending_notes_by_viewer".equals(A0s)) {
                    num6 = AbstractC166997dE.A0h(c16l);
                } else if ("num_pending_posts".equals(A0s)) {
                    num7 = AbstractC166997dE.A0h(c16l);
                } else if ("num_pending_posts_by_viewer".equals(A0s)) {
                    num8 = AbstractC166997dE.A0h(c16l);
                } else if ("pending_admin_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("ring_spec".equals(A0s)) {
                    ringSpecImpl = AbstractC41276IOr.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("admin_ids", c16l, "GroupMetadataImpl");
            } else if (arrayList2 != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("can_post", c16l, "GroupMetadataImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("group_fbid", c16l, "GroupMetadataImpl");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("group_pk", c16l, "GroupMetadataImpl");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "GroupMetadataImpl");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("has_pending_admin_invite", c16l, "GroupMetadataImpl");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_group", c16l, "GroupMetadataImpl");
                } else if (bool6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_group_full", c16l, "GroupMetadataImpl");
                } else {
                    if (bool7 == null && (c16l instanceof C07950bF)) {
                        c0kx = ((C07950bF) c16l).A03;
                    } else if (bool8 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("is_recommendable", c16l, "GroupMetadataImpl");
                    } else if (bool9 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("is_viewer_admin", c16l, "GroupMetadataImpl");
                    } else if (bool10 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("is_viewer_in_chat_thread", c16l, "GroupMetadataImpl");
                    } else if (bool11 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("is_viewer_invited", c16l, "GroupMetadataImpl");
                    } else if (num == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("num_admins", c16l, "GroupMetadataImpl");
                    } else if (num2 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("num_blocked_users", c16l, "GroupMetadataImpl");
                    } else if (num3 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("num_pending_follow_requests", c16l, "GroupMetadataImpl");
                    } else if (num4 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("num_pending_invites", c16l, "GroupMetadataImpl");
                    } else if (num5 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("num_pending_notes", c16l, "GroupMetadataImpl");
                    } else if (num6 == null && (c16l instanceof C07950bF)) {
                        AbstractC166997dE.A1V("num_pending_notes_by_viewer", c16l, "GroupMetadataImpl");
                    } else if (num7 != null || !(c16l instanceof C07950bF)) {
                        if (num8 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "num_pending_posts_by_viewer";
                        } else if (arrayList3 == null && (c16l instanceof C07950bF)) {
                            c0kx = ((C07950bF) c16l).A03;
                            str = "pending_admin_ids";
                        } else {
                            return new GroupMetadataImpl(ringSpecImpl, bool4, l, str2, str3, str4, str5, arrayList, arrayList2, arrayList3, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), num5.intValue(), num6.intValue(), num7.intValue(), num8.intValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool5.booleanValue(), bool6.booleanValue(), bool7.booleanValue(), bool8.booleanValue(), bool9.booleanValue(), bool10.booleanValue(), bool11.booleanValue());
                        }
                    } else {
                        c0kx = ((C07950bF) c16l).A03;
                        str = "num_pending_posts";
                    }
                    c0kx.A00(str, "GroupMetadataImpl");
                }
            } else {
                AbstractC166997dE.A1V("blocked_user_ids", c16l, "GroupMetadataImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
