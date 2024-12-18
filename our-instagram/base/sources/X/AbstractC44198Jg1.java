package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.TypedValue;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Jg1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44198Jg1 {
    public static final int A01(Context context) {
        int A04 = AbstractC166997dE.A04(context, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        int A042 = AbstractC166997dE.A04(context, R.dimen.avatar_size_ridiculously_xlarge);
        int A043 = AbstractC166997dE.A04(context, R.dimen.action_bar_item_spacing_left);
        int A044 = AbstractC166997dE.A04(context, R.dimen.annotation_cluster_name_plate_padding_top);
        float A00 = A00(context);
        int A045 = AbstractC166997dE.A04(context, R.dimen.abc_dialog_padding_top_material);
        return Math.max(((A04 * 2) - ((int) Math.ceil((Math.max(1, 0) * A04) * A00))) + A044 + A045, A042 + A043 + A045);
    }

    public static final int A02(Context context) {
        return Math.max((AbstractC166997dE.A04(context, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size) * 5) - ((int) Math.ceil((Math.max(4, 0) * r2) * A00(context))), AbstractC166997dE.A04(context, R.dimen.avatar_size_ridiculously_xlarge));
    }

    public static final int A03(Context context, int i) {
        C14360o3.A0B(context, 0);
        return context.getResources().getDimensionPixelSize(i);
    }

    public static final LayerDrawable A04(Context context) {
        int A01 = AbstractC13690mv.A01(context, 16);
        int A012 = AbstractC13690mv.A01(context, 10);
        int color = context.getColor(AbstractC53242c7.A0D(context));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(color);
        AbstractC166987dD.A1R(shapeDrawable.getPaint());
        shapeDrawable.setBounds(new Rect(0, 0, A01, A01));
        C6RB c6rb = new C6RB(context, A012);
        c6rb.A0A(A012);
        c6rb.A0M("❤️");
        LayerDrawable A0B = AbstractC43593JPy.A0B(shapeDrawable, c6rb);
        int A013 = AbstractC13690mv.A01(context, 4);
        A0B.setLayerInset(1, A013, A013, A013, A013);
        return A0B;
    }

    public static final String A05(Context context, User user) {
        AbstractC167007dF.A1K(user, context);
        String fullName = user.getFullName();
        if (fullName != null) {
            String A06 = A06(AbstractC25226BEj.A1I(AbstractC167007dF.A0m(fullName, " ", 0), 0));
            if (AbstractC25228BEl.A1A(A06).length() > 0 && A06 != null) {
                return A06;
            }
        }
        return user.getUsername();
    }

    public static final String A06(String str) {
        C14360o3.A0B(str, 0);
        if (str.length() != 0) {
            String A16 = AbstractC31172DnG.A16(C1Q2.A02(), str);
            return AnonymousClass001.A0R(AbstractC166997dE.A10(C1Q2.A02(), AbstractC25227BEk.A0w(str, 0, 1)), AbstractC43592JPx.A0z(A16, 1));
        }
        return str;
    }

    public static final C09530e4 A07(Context context, long j) {
        String A04 = C23831Eq.A04(context, j);
        if (AbstractC43593JPy.A07() - j < TimeUnit.MINUTES.toSeconds(10L)) {
            return AbstractC166987dD.A1L(A06(A04), true);
        }
        return AbstractC166987dD.A1L(A04, false);
    }

    public static final void A08(IgSimpleImageView igSimpleImageView, int i) {
        Context A06 = AbstractC31173DnH.A06(igSimpleImageView, 0);
        Drawable drawable = A06.getDrawable(i);
        if (drawable != null) {
            igSimpleImageView.setImageDrawable(new C44351Jiq(A06, drawable));
        }
    }

    public static final float A00(Context context) {
        C14360o3.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.cluster_item_horizontal_overlap_factor, typedValue, true);
        int i = typedValue.type;
        if (i == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException(AnonymousClass001.A11("Resource ID #0x", Integer.toHexString(R.dimen.cluster_item_horizontal_overlap_factor), " type #0x", Integer.toHexString(i), " is not valid"));
    }
}
