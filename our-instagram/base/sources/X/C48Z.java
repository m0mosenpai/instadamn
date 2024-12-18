package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.48Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48Z {
    public final int A00;
    public final Activity A01;
    public final Context A02;
    public final UserSession A03;
    public final C57332k8 A04;
    public final boolean A05;

    public C48Z(Activity activity, Context context, UserSession userSession, C57332k8 c57332k8, boolean z) {
        C14360o3.A0B(context, 2);
        C14360o3.A0B(c57332k8, 3);
        C14360o3.A0B(userSession, 4);
        this.A01 = activity;
        this.A02 = context;
        this.A04 = c57332k8;
        this.A03 = userSession;
        this.A05 = z;
        this.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_bottom_material);
    }

    public final void A01(C9BR c9br, C81333k3 c81333k3) {
        C14360o3.A0B(c81333k3, 0);
        C14360o3.A0B(c9br, 1);
        if (this.A05) {
            AbstractC56932jR.A04(c81333k3.A00, 4);
        }
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c9br.A01;
        int length = spannableStringBuilder.length();
        InterfaceC56392iX interfaceC56392iX = c81333k3.A01;
        if (length > 0) {
            ((TextView) interfaceC56392iX.getView()).setText(spannableStringBuilder);
            ((TextView) interfaceC56392iX.getView()).setMovementMethod(LinkMovementMethod.getInstance());
            boolean z = c9br.A02;
            View view = interfaceC56392iX.getView();
            if (z) {
                AbstractC13880nE.A0Y(view, this.A00);
            } else {
                AbstractC13880nE.A0Y(view, 0);
            }
            interfaceC56392iX.getView().setVisibility(0);
            return;
        }
        if (!interfaceC56392iX.CWW()) {
            return;
        }
        interfaceC56392iX.getView().setVisibility(8);
    }

    public static final View A00(Context context, ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        View A00 = C50802Vb.A00(from, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.row_feed_label_below_comments, 0, false, true);
        A00.setTag(new C81333k3(A00));
        return A00;
    }
}
