package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.superlativesticker.model.SuperlativeMentionSticker;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140536Xh extends C6XW {
    public final List A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140536Xh(ViewStub viewStub) {
        super(viewStub, R.id.reel_viewer_superlative_conclusion_card_container);
        C14360o3.A0B(viewStub, 1);
        this.A00 = new ArrayList();
        this.A01 = AbstractC09440dt.A01(new C9EH(this, 33));
        this.A02 = AbstractC09440dt.A01(new C9EH(this, 34));
        this.A03 = AbstractC09440dt.A01(new C9EH(this, 35));
    }

    public final void A08(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, User user, CharSequence charSequence, String str, int i, int i2, int i3, int i4, boolean z) {
        C28186CbZ c28186CbZ;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 3);
        LayoutInflater from = LayoutInflater.from(context);
        InterfaceC09390do interfaceC09390do = this.A02;
        View inflate = from.inflate(i4, (ViewGroup) interfaceC09390do.getValue(), false);
        inflate.setTag(str);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        layoutParams.height = i;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2;
        inflate.setLayoutParams(layoutParams);
        ((ViewGroup) interfaceC09390do.getValue()).addView(inflate);
        View requireViewById = inflate.requireViewById(R.id.superlative_conclusion_item_image);
        C14360o3.A07(requireViewById);
        IgImageView igImageView = (IgImageView) requireViewById;
        View requireViewById2 = inflate.requireViewById(R.id.superlative_conclusion_item_description_text);
        C14360o3.A07(requireViewById2);
        IgTextView igTextView = (IgTextView) requireViewById2;
        if (z) {
            c28186CbZ = new C28186CbZ(interfaceC11380iw, igImageView, c38321qM, (Integer) null, "conclusion_card", context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), true, true);
        } else {
            c28186CbZ = new C28186CbZ(interfaceC11380iw, igImageView, c38321qM, (Integer) null, "conclusion_card", 240, false, false);
        }
        A07(c28186CbZ);
        if (user != null) {
            View requireViewById3 = inflate.requireViewById(R.id.superlative_conclusion_item_mention);
            C14360o3.A07(requireViewById3);
            IgImageView igImageView2 = (IgImageView) requireViewById3;
            igImageView2.setImageDrawable(C23094AGe.A00.A00(context, userSession, user, 16));
            igImageView2.setOnTouchListener(new LQZ(this, user));
            if (inflate.isLaidOut() && !inflate.isLayoutRequested()) {
                this.A00.add(new SuperlativeMentionSticker(AbstractC40783I5l.A00(A04(), igImageView2, i3, ((View) interfaceC09390do.getValue()).getTop() + inflate.getTop()), user, 0.0f, igImageView2.getHeight() / igImageView2.getDrawable().getIntrinsicHeight(), 16));
            } else {
                inflate.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC42041IkA(inflate, igImageView2, this, user, i3));
            }
        }
        if (igTextView.isLaidOut() && !igTextView.isLayoutRequested()) {
            igTextView.setText(charSequence);
            float height = igTextView.getHeight();
            float f = 1.3f;
            if (i4 == R.layout.layout_superlative_conclusion_card_item_top_post) {
                f = 2.5f;
            }
            igTextView.setTextSize(0, height / f);
            return;
        }
        igTextView.addOnLayoutChangeListener(new AT3(igTextView, charSequence, i4));
    }
}
