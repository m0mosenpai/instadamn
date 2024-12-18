package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedList;

/* renamed from: X.Hbp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39463Hbp extends H8E {
    public final C143746eH A00;
    public final LinkedList A01;
    public final IgTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39463Hbp(View view, UserSession userSession) {
        super(view);
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.title);
        C143746eH c143746eH = new C143746eH((ViewStub) AbstractC166987dD.A0c(view, R.id.shuffle_layout), (ViewStub) AbstractC166987dD.A0c(view, R.id.shuffle_layout), userSession);
        this.A00 = c143746eH;
        LinkedList linkedList = new LinkedList();
        this.A01 = linkedList;
        linkedList.add(new C43057J1x(AbstractC166987dD.A0c(view, R.id.top_start_card)));
        linkedList.add(new C43057J1x(AbstractC166987dD.A0c(view, R.id.top_end_card)));
        linkedList.add(new C43057J1x(AbstractC166987dD.A0c(view, R.id.bottom_start_card)));
        linkedList.add(new C43057J1x(AbstractC166987dD.A0c(view, R.id.bottom_end_card)));
        c143746eH.A01();
        TextView textView = c143746eH.A07;
        if (textView != null) {
            AbstractC166987dD.A1P(view.getContext(), textView, 2131955394);
        }
        ImageView imageView = c143746eH.A05;
        if (imageView != null) {
            imageView.setImageDrawable(c143746eH.A09);
        }
        View view2 = c143746eH.A02;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            view2.setLayoutParams(layoutParams);
            if (view2 instanceof LinearLayout) {
                ((LinearLayout) view2).setGravity(A1V ? 1 : 0);
            }
            view2.setBackgroundResource(R.drawable.clips_viewer_suggested_creators_shuffle_background);
        }
        TextView textView2 = c143746eH.A07;
        if (textView2 != null) {
            AbstractC166987dD.A1O(textView2.getContext(), textView2, R.color.design_dark_default_color_on_background);
        }
    }
}
