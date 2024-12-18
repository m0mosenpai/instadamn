package X;

/* renamed from: X.Uiy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67251Uiy extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(C94754Oe.A01(), "admin_ids");
        C4OW c4ow2 = new C4OW(C94754Oe.A01(), "blocked_user_ids");
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow3 = new C4OW(new C94774Oi(c95124Py), "can_post");
        C4OW c4ow4 = new C4OW(c94754Oe, "channel_admin_id");
        C4OW c4ow5 = new C4OW(c94754Oe, "chat_thread_id");
        C4OW c4ow6 = new C4OW(new C94774Oi(c94754Oe), "group_fbid");
        C4OW c4ow7 = new C4OW(new C94774Oi(c94754Oe), "group_pk");
        C4OW c4ow8 = new C4OW(new C94774Oi(c95124Py), AbstractC111324zv.A00(117));
        C4OW c4ow9 = new C4OW(new C94774Oi(c95124Py), "has_pending_admin_invite");
        C4OW c4ow10 = new C4OW(c95124Py, "hidden");
        C4OW c4ow11 = new C4OW(new C94774Oi(c95124Py), "is_group");
        C4OW c4ow12 = new C4OW(new C94774Oi(c95124Py), "is_group_full");
        C4OW c4ow13 = new C4OW(new C94774Oi(c95124Py), "is_group_notes_allowed");
        C4OW c4ow14 = new C4OW(new C94774Oi(c95124Py), "is_recommendable");
        C4OW c4ow15 = new C4OW(new C94774Oi(c95124Py), "is_viewer_admin");
        C4OW c4ow16 = new C4OW(new C94774Oi(c95124Py), "is_viewer_in_chat_thread");
        C4OW c4ow17 = new C4OW(new C94774Oi(c95124Py), "is_viewer_invited");
        C4OW c4ow18 = new C4OW(C67A.A00, "mandatory_approvals_expire_at");
        C94894Ou c94894Ou = C94894Ou.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, c4ow4, c4ow5, c4ow6, c4ow7, c4ow8, c4ow9, c4ow10, c4ow11, c4ow12, c4ow13, c4ow14, c4ow15, c4ow16, c4ow17, c4ow18, new C4OW(new C94774Oi(c94894Ou), "num_admins"), new C4OW(new C94774Oi(c94894Ou), "num_blocked_users"), new C4OW(new C94774Oi(c94894Ou), "num_pending_follow_requests"), new C4OW(new C94774Oi(c94894Ou), "num_pending_invites"), new C4OW(new C94774Oi(c94894Ou), "num_pending_notes"), new C4OW(new C94774Oi(c94894Ou), "num_pending_notes_by_viewer"), new C4OW(new C94774Oi(c94894Ou), "num_pending_posts"), new C4OW(new C94774Oi(c94894Ou), "num_pending_posts_by_viewer"), new C4OW(C94754Oe.A01(), "pending_admin_ids")});
    }

    public C67251Uiy(int i) {
        super(i);
    }

    public C67251Uiy() {
        super(-1104045322);
    }
}
