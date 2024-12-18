package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.JsF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44794JsF extends C3OO implements InterfaceC30947Dj4 {
    public C45128JyU A00;
    public final ViewGroup A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final CircularImageView A08;
    public final L8P A09;
    public final C47633L1s A0A;
    public final C49411Lsl A0B;
    public final IgBouncyUfiButtonImageView A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44794JsF(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47633L1s c47633L1s, C49411Lsl c49411Lsl) {
        super(view);
        AbstractC25234BEr.A0j(2, userSession, interfaceC11380iw, c49411Lsl, c47633L1s);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A0B = c49411Lsl;
        this.A0A = c47633L1s;
        this.A08 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.friend_map_h_scroll_avatar);
        this.A06 = AbstractC31175DnJ.A0L(view, R.id.friend_map_h_scroll_title);
        this.A05 = AbstractC31175DnJ.A0L(view, R.id.friend_map_h_scroll_subtitle);
        this.A04 = AbstractC31175DnJ.A0L(view, R.id.friend_map_presence_reply_text);
        this.A07 = AbstractC31175DnJ.A0L(view, R.id.friend_map_presence_additional_text);
        this.A0C = (IgBouncyUfiButtonImageView) AbstractC166987dD.A0c(view, R.id.friend_map_note_like_button);
        this.A09 = new L8P();
        ViewGroup viewGroup = (ViewGroup) AbstractC166987dD.A0c(view, R.id.friend_map_h_scroll_emoji_reply_container);
        this.A01 = viewGroup;
        if (C18U.A06(C06090Tz.A05, userSession, 36321722382493464L)) {
            viewGroup.setVisibility(0);
            AbstractC47888LDi.A01(AbstractC166997dE.A0L(view), viewGroup, this, c49411Lsl);
        }
    }

    @Override // X.InterfaceC30947Dj4
    public final C45128JyU B8i() {
        return this.A00;
    }
}
