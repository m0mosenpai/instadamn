package X;

import android.content.Context;
import com.facebook.R;

/* loaded from: classes6.dex */
public abstract class FDF {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(Context context) {
        C2d5 c2d5;
        if (context != 0) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(context, A0K, 2131972461);
            A0K.A02();
            A0K.A07(R.drawable.instagram_circle_check_pano_outline_24);
            A0K.A0J = true;
            A0K.A06();
            A0K.A02 = context.getResources().getDimensionPixelOffset(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
            A0K.A0R = true;
            C31349DqE A00 = A0K.A00();
            if ((context instanceof C2d5) && (c2d5 = (C2d5) context) != null) {
                c2d5.By1().A0A(A00);
            }
        }
    }
}
