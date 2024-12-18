package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.chat.model.ChatStickerChannelType;

/* renamed from: X.AfM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23749AfM implements XEW {
    public final InterfaceC09390do A00;

    @Override // X.XEW
    public final IgTextView B18(Context context, View view, UserSession userSession) {
        C14360o3.A0B(view, 0);
        String A0p = AbstractC166997dE.A0p(context, 2131955122);
        IgTextView igTextView = (IgTextView) view.requireViewById(R.id.chat_sticker_eligible_requesters_text);
        igTextView.setVisibility(0);
        igTextView.setMovementMethod(LinkMovementMethod.getInstance());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC167007dF.A0f(context, A0p, 2131955124));
        AnonymousClass773.A04(spannableStringBuilder, new Em0(context, userSession, AbstractC167007dF.A09(context, R.attr.igds_color_controls), 4), A0p);
        igTextView.setText(spannableStringBuilder);
        return igTextView;
    }

    @Override // X.XEW
    public final boolean Bvh() {
        return true;
    }

    @Override // X.XEW
    public final String C2K() {
        return AbstractC111324zv.A00(229);
    }

    @Override // X.XEW
    public final ChatStickerChannelType AnJ() {
        return ChatStickerChannelType.A07;
    }

    @Override // X.XEW
    public final boolean BJg(UserSession userSession, boolean z) {
        if (!z && C18U.A06(C06090Tz.A05, userSession, 36314914855324581L)) {
            return true;
        }
        return false;
    }

    @Override // X.XEW
    public final InterfaceC56392iX C0a() {
        return (InterfaceC56392iX) this.A00.getValue();
    }

    public C23749AfM(View view) {
        this.A00 = AbstractC09440dt.A01(new C50151MDe(view, 46));
    }

    @Override // X.XEW
    public final CircularImageView AeR(Context context, View view) {
        View requireViewById = view.requireViewById(R.id.chat_sticker_avatar_badge);
        CircularImageView circularImageView = (CircularImageView) requireViewById;
        circularImageView.setVisibility(8);
        C14360o3.A07(requireViewById);
        return circularImageView;
    }

    @Override // X.XEW
    public final IgTextView C3k(Context context, View view, UserSession userSession) {
        View requireViewById = view.requireViewById(R.id.chat_sticker_subtitle);
        IgTextView igTextView = (IgTextView) requireViewById;
        igTextView.setText(AbstractC167007dF.A0f(context, Integer.valueOf(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), 2131964690));
        C14360o3.A07(requireViewById);
        return igTextView;
    }
}
