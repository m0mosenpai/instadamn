package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.NoteReactionType;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Jrf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44758Jrf extends C3OO {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final InterfaceC56392iX A03;
    public final GradientSpinnerAvatarView A04;
    public final /* synthetic */ KJW A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44758Jrf(View view, KJW kjw) {
        super(view);
        this.A05 = kjw;
        this.A00 = view;
        this.A04 = (GradientSpinnerAvatarView) AbstractC166987dD.A0c(view, R.id.user_row_image_view);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.user_row_text_view);
        this.A01 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.user_row_message_icon);
        this.A03 = AbstractC31179DnN.A0M(view, R.id.notes_user_row_subtitle_view_stub);
    }

    public final String A00(C45212Jzs c45212Jzs) {
        String string;
        int i;
        Context context = this.A00.getContext();
        int i2 = 2131956727;
        if (c45212Jzs.A04) {
            i2 = 2131956728;
        }
        String A0p = AbstractC166997dE.A0p(context, i2);
        NoteReactionType noteReactionType = c45212Jzs.A00;
        if (noteReactionType != null) {
            int ordinal = noteReactionType.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 1) {
                        i = 2131956726;
                    } else {
                        return "";
                    }
                } else {
                    i = 2131956724;
                }
                string = AbstractC167007dF.A0f(context, A0p, i);
            } else {
                string = context.getString(2131956725);
            }
            C14360o3.A07(string);
            return string;
        }
        return "";
    }
}
