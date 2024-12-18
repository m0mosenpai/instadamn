package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import instagram.features.clips.viewer.controller.EmojiReactionTrayView;

/* renamed from: X.L7o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47767L7o {
    public View A00;
    public EmojiReactionTrayView A01;
    public final UserSession A02;
    public final L0U A03;
    public final AbstractC43757JWv A04;

    public C47767L7o(UserSession userSession, AbstractC43757JWv abstractC43757JWv) {
        C14360o3.A0B(userSession, 2);
        this.A04 = abstractC43757JWv;
        this.A02 = userSession;
        this.A03 = new L0U(this);
    }

    public final void A00(boolean z) {
        View view = this.A00;
        int i = 0;
        if (view != null) {
            view.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        }
        EmojiReactionTrayView emojiReactionTrayView = this.A01;
        if (emojiReactionTrayView != null) {
            if (!z) {
                i = 8;
            }
            emojiReactionTrayView.setVisibility(i);
        }
    }
}
