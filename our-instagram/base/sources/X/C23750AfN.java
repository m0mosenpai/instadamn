package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.AfN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23750AfN implements XEW {
    public final InterfaceC09390do A00;

    @Override // X.XEW
    public final CircularImageView AeR(Context context, View view) {
        View requireViewById = view.requireViewById(R.id.chat_sticker_avatar_badge);
        CircularImageView circularImageView = (CircularImageView) requireViewById;
        circularImageView.setVisibility(0);
        AbstractC166997dE.A19(context, circularImageView, R.drawable.subscriptions_crown_badge_drawable);
        C14360o3.A07(requireViewById);
        return circularImageView;
    }

    @Override // X.XEW
    public final IgTextView B18(Context context, View view, UserSession userSession) {
        return null;
    }

    @Override // X.XEW
    public final boolean BJg(UserSession userSession, boolean z) {
        return true;
    }

    @Override // X.XEW
    public final boolean Bvh() {
        return false;
    }

    @Override // X.XEW
    public final String C2K() {
        return "subscriber_chat_sticker_default_id";
    }

    @Override // X.XEW
    public final ChatStickerChannelType AnJ() {
        return ChatStickerChannelType.A09;
    }

    @Override // X.XEW
    public final InterfaceC56392iX C0a() {
        return (InterfaceC56392iX) this.A00.getValue();
    }

    public C23750AfN(View view) {
        this.A00 = AbstractC09440dt.A01(new C50151MDe(view, 47));
    }

    @Override // X.XEW
    public final IgTextView C3k(Context context, View view, UserSession userSession) {
        int A00 = AbstractC2051396d.A00(userSession);
        View requireViewById = view.requireViewById(R.id.chat_sticker_subtitle);
        IgTextView igTextView = (IgTextView) requireViewById;
        igTextView.setText(AbstractC167007dF.A0f(context, Integer.valueOf(A00), 2131974811));
        C14360o3.A07(requireViewById);
        return igTextView;
    }
}
