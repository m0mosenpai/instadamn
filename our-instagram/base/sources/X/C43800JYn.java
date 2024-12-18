package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.inbox.notes.ui.NoteAvatarView;

/* renamed from: X.JYn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43800JYn extends C3OO {
    public C4FL A00;
    public final View A01;
    public final View A02;
    public final IgTextView A03;
    public final NoteAvatarView A04;
    public final /* synthetic */ C4FD A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43800JYn(View view, C4FD c4fd) {
        super(view);
        C14360o3.A0B(view, 2);
        this.A05 = c4fd;
        this.A01 = view;
        this.A02 = view.findViewById(R.id.pog_root_view);
        NoteAvatarView noteAvatarView = (NoteAvatarView) AbstractC166987dD.A0c(view, R.id.pog_avatar_view);
        this.A04 = noteAvatarView;
        this.A03 = AbstractC31172DnG.A0Y(view, R.id.pog_name);
        UserSession userSession = c4fd.A01;
        noteAvatarView.A0F(userSession);
        ViewOnClickListenerC48066LPr.A00(noteAvatarView.A0J, 68, this, c4fd);
        ViewOnClickListenerC48066LPr.A00(noteAvatarView.getNoteBubbleView(), 69, this, c4fd);
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36329290111402233L)) {
            ViewOnClickListenerC48066LPr.A00(noteAvatarView.getNoteAnimatedBubbleView().getView(), 70, this, c4fd);
        }
    }
}
