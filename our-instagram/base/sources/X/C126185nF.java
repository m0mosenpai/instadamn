package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TightTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.textview.UpdatableButton;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.5nF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126185nF extends C3OO {
    public ViewOnClickListenerC126195nG A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TightTextView A08;
    public final CircularImageView A09;
    public final CircularImageView A0A;
    public final UpdatableButton A0B;
    public final FollowButton A0C;
    public final ViewGroup A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C126185nF(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl) {
        super(view);
        ViewOnClickListenerC126195nG viewOnClickListenerC126195nG;
        C14360o3.A0B(c1gl, 3);
        C14360o3.A0B(view, 5);
        View requireViewById = view.requireViewById(R.id.suggested_entity_card_container);
        C14360o3.A07(requireViewById);
        this.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.suggested_entity_card_image);
        C14360o3.A07(requireViewById2);
        this.A09 = (CircularImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.suggested_entity_card_name);
        C14360o3.A07(requireViewById3);
        this.A07 = (TextView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.suggested_entity_card_chaining_context);
        C14360o3.A07(requireViewById4);
        this.A04 = (ViewGroup) requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.suggested_entity_card_chaining_context_header);
        C14360o3.A07(requireViewById5);
        this.A06 = (TextView) requireViewById5;
        View requireViewById6 = view.requireViewById(R.id.suggested_entity_card_chaining_context_pic);
        C14360o3.A07(requireViewById6);
        this.A0A = (CircularImageView) requireViewById6;
        View requireViewById7 = view.requireViewById(R.id.suggested_entity_card_social_context_container);
        C14360o3.A07(requireViewById7);
        ViewGroup viewGroup = (ViewGroup) requireViewById7;
        this.A0D = viewGroup;
        View requireViewById8 = viewGroup.requireViewById(R.id.suggested_entity_card_context);
        C14360o3.A07(requireViewById8);
        TightTextView tightTextView = (TightTextView) requireViewById8;
        this.A08 = tightTextView;
        View requireViewById9 = viewGroup.requireViewById(R.id.suggested_entity_card_context_stacked_avatar_view);
        C14360o3.A07(requireViewById9);
        this.A05 = (ImageView) requireViewById9;
        View requireViewById10 = view.requireViewById(R.id.dismiss_button);
        C14360o3.A07(requireViewById10);
        this.A02 = requireViewById10;
        View requireViewById11 = view.requireViewById(R.id.suggested_user_card_follow_button);
        C14360o3.A07(requireViewById11);
        FollowButton followButton = (FollowButton) requireViewById11;
        this.A0C = followButton;
        UpdatableButton updatableButton = (UpdatableButton) view.findViewById(R.id.suggested_entity_card_close_friend_button);
        this.A0B = updatableButton;
        View findViewById = view.findViewById(R.id.suggested_user_card_new_badge);
        this.A03 = findViewById;
        Context context2 = tightTextView.getContext();
        tightTextView.setTextColor(context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igdsSecondaryText)));
        followButton.A0J.A0H = "feed_suggested_user_carousel";
        if (updatableButton != null) {
            viewOnClickListenerC126195nG = new ViewOnClickListenerC126195nG(context, interfaceC11380iw, userSession, c1gl, updatableButton);
        } else {
            viewOnClickListenerC126195nG = null;
        }
        this.A00 = viewOnClickListenerC126195nG;
        AbstractC14680og.A02(findViewById, C05F.A01, true);
    }
}
