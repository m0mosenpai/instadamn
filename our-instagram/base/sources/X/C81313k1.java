package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.3k1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81313k1 extends C3OO {
    public Activity A00;
    public ConstraintLayout A01;
    public IgSimpleImageView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public CircularImageView A07;
    public IgImageView A08;
    public NoteBubbleView A09;
    public C85233rE A0A;
    public C75113Zb A0B;
    public RoundedCornerConstraintLayout A0C;
    public final View A0D;
    public final ViewGroup A0E;
    public final ViewStub A0F;
    public final ViewStub A0G;
    public final IgSimpleImageView A0H;
    public final IgSimpleImageView A0I;
    public final InterfaceC56392iX A0J;
    public final C909043h A0K;
    public final C86043sb A0L;
    public final C908843f A0M;
    public final IgBouncyUfiButtonImageView A0N;
    public final IgBouncyUfiButtonImageView A0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81313k1(View view, boolean z) {
        super(view);
        C909043h c909043h;
        C14360o3.A0B(view, 1);
        this.A0D = view;
        View requireViewById = view.requireViewById(R.id.row_feed_button_like);
        C14360o3.A07(requireViewById);
        this.A0N = (IgBouncyUfiButtonImageView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.row_feed_button_comment);
        C14360o3.A07(requireViewById2);
        this.A0H = (IgSimpleImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.row_feed_button_share);
        C14360o3.A07(requireViewById3);
        this.A0I = (IgSimpleImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.content_notes_button_share);
        C14360o3.A07(requireViewById4);
        this.A0G = (ViewStub) requireViewById4;
        this.A04 = (IgTextView) view.findViewById(R.id.content_notes_new_text_view);
        View requireViewById5 = view.requireViewById(R.id.row_feed_button_save);
        C14360o3.A07(requireViewById5);
        this.A0O = (IgBouncyUfiButtonImageView) requireViewById5;
        this.A0E = (ViewGroup) view.findViewById(R.id.row_feed_view_group_ufi_buttons);
        this.A05 = (IgTextView) view.findViewById(R.id.row_feed_like_count);
        this.A03 = (IgTextView) view.findViewById(R.id.row_feed_comment_count);
        this.A06 = (IgTextView) view.findViewById(R.id.row_feed_share_count);
        View findViewById = view.findViewById(R.id.row_feed_view_group_buttons);
        C14360o3.A07(findViewById);
        this.A0M = new C908843f(findViewById);
        View findViewById2 = view.findViewById(R.id.larger_cta_bottom_buffer);
        C14360o3.A07(findViewById2);
        this.A0L = new C86043sb(findViewById2);
        this.A0F = (ViewStub) view.findViewById(R.id.row_feed_carousel_indicator_stub);
        if (z) {
            c909043h = new C909043h(view);
        } else {
            View findViewById3 = view.findViewById(R.id.row_feed_carousel_indicator_stub);
            C14360o3.A07(findViewById3);
            c909043h = new C909043h((ViewStub) findViewById3, view);
        }
        this.A0K = c909043h;
        InterfaceC56392iX A01 = AbstractC56372iV.A01(view.requireViewById(R.id.visual_search_icon_stub), false, false);
        this.A0J = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.43i
            @Override // X.InterfaceC69513Al
            public final void DLu(View view2) {
                C81313k1 c81313k1 = C81313k1.this;
                c81313k1.A02 = (IgSimpleImageView) c81313k1.A0D.requireViewById(R.id.visual_search_icon);
            }
        });
    }
}
