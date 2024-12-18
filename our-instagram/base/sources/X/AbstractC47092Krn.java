package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Krn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47092Krn {
    public static final void A00(Context context, L5J l5j, String str, String str2) {
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.reel_tagging_title_subtitle_popup_bubble);
        C14360o3.A07(A0C);
        AbstractC167007dF.A0N(A0C, R.id.tooltip_bold_text).setText(str);
        TextView A0N = AbstractC167007dF.A0N(A0C, R.id.tooltip_plain_text);
        if (str2 != null && str2.length() != 0) {
            A0N.setText(str2);
            A0N.setVisibility(0);
        } else {
            A0N.setVisibility(8);
        }
        l5j.A02 = EnumC46122KbM.A02;
        l5j.A01 = A0C;
    }
}
