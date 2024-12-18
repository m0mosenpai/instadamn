package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.textview.IgTextLayoutView;
import java.util.EnumSet;

/* renamed from: X.3uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87323uq extends C3OO implements C33R {
    public View A00;
    public UserSession A01;
    public C84923qg A02;
    public InterfaceC60442pS A03;
    public C75113Zb A04;
    public C57332k8 A05;
    public IgBouncyUfiButtonImageView A06;
    public C131325wL A07;
    public String A08;
    public final View A09;
    public final View A0A;
    public final ViewStub A0B;
    public final IgTextLayoutView A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87323uq(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A0A = view;
        View requireViewById = view.requireViewById(R.id.row_feed_comment_textview_child_comment_indent);
        C14360o3.A07(requireViewById);
        this.A09 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.row_feed_comment_textview_layout);
        C14360o3.A07(requireViewById2);
        this.A0C = (IgTextLayoutView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.row_feed_comment_like_button_stub);
        C14360o3.A07(requireViewById3);
        this.A0B = (ViewStub) requireViewById3;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C38321qM A1e;
        if (i == 4) {
            AbstractC99644dh.A02(this);
            C84923qg c84923qg = this.A02;
            if (c84923qg != null) {
                C57332k8 c57332k8 = this.A05;
                C75113Zb c75113Zb2 = this.A04;
                if (c57332k8 != null && c75113Zb2 != null) {
                    EnumSet enumSet = AbstractC75103Za.A00;
                    C38321qM c38321qM = c84923qg.A07;
                    if (c38321qM != null && c38321qM.A5M() && (A1e = c38321qM.A1e(0)) != null && A1e.A5a()) {
                        IgTextLayoutView igTextLayoutView = this.A0C;
                        Context context = igTextLayoutView.getContext();
                        C14360o3.A07(context);
                        if (c75113Zb2.A03 == 0 || c75113Zb2.A02 == 0) {
                            igTextLayoutView.setTextLayout(c57332k8.A0D(context, c84923qg, c75113Zb2.A0o, 1, false, false, false, AbstractC75103Za.A0I(c84923qg, c75113Zb2.A02)));
                            AbstractC13880nE.A0c(igTextLayoutView, context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_right));
                        }
                    }
                }
            }
        }
    }
}
