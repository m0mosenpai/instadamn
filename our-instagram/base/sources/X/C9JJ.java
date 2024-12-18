package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.9JJ, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9JJ {
    public static final View A00(Context context, C206429Bz c206429Bz) {
        C14360o3.A0B(c206429Bz, 2);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_expanded_profile_picture_interaction_bar_item_view, (ViewGroup) null);
        C14360o3.A0A(inflate);
        C14360o3.A0B(inflate, 1);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.profile_interaction_item_icon);
        TextView A0e = AbstractC166987dD.A0e(inflate, R.id.profile_interaction_item_label);
        imageView.setImageResource(c206429Bz.A01);
        String str = c206429Bz.A03;
        imageView.setContentDescription(str);
        A0e.setText(str);
        C216559iC.A02(AbstractC166987dD.A0s(inflate), c206429Bz, 36);
        return inflate;
    }
}
