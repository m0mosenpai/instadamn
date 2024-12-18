package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes4.dex */
public abstract class A24 {
    public static final void A00(Context context) {
        Drawable drawable;
        C14360o3.A0B(context, 0);
        if (!new C1CM(context).A07(false)) {
            Drawable drawable2 = context.getDrawable(R.drawable.instagram_warning_pano_outline_24);
            if (drawable2 != null) {
                drawable = drawable2.mutate();
                if (drawable != null) {
                    drawable.setTint(context.getColor(AbstractC53242c7.A05(context)));
                }
            } else {
                drawable = null;
            }
            C146106i8 c146106i8 = new C146106i8();
            c146106i8.A0D = context.getString(2131965808);
            c146106i8.A0N = true;
            c146106i8.A0I = context.getString(2131965807);
            c146106i8.A04 = drawable;
            c146106i8.A02();
            c146106i8.A06();
            c146106i8.A0J = true;
            c146106i8.A02 = context.getResources().getDimensionPixelOffset(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
            c146106i8.A0R = true;
            AbstractC166997dE.A1O(C41451vu.A01, c146106i8.A00());
        }
    }
}
