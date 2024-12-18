package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KD3 extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "GenAIStickerAttributionBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "gen_ai_sticker_attribution_bottomsheet_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0C = AbstractC31178DnM.A0C(view);
        View A0S = AbstractC166997dE.A0S(view, R.id.icon);
        Context context = getContext();
        if (context != null) {
            A0C.setText(AbstractC07900bA.A01(context.getResources(), new String[0], 2131963168));
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            AbstractC166987dD.A1R(paint);
            paint.setAntiAlias(true);
            shapeDrawable.setIntrinsicWidth(context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
            shapeDrawable.setIntrinsicHeight(AbstractC166997dE.A04(context, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
            Integer[] numArr = {AbstractC31174DnI.A0q(context, R.color.netego_su_background_gradient_end_4), AbstractC31174DnI.A0q(context, R.color.clips_gradient_redesign_color_1), AbstractC31174DnI.A0q(context, R.color.clips_gradient_redesign_color_2), AbstractC31174DnI.A0q(context, R.color.clips_gradient_redesign_color_3)};
            int[] iArr = new int[4];
            int i = 0;
            do {
                iArr[i] = numArr[i].intValue();
                i++;
            } while (i < 4);
            Paint paint2 = C3LQ.A00;
            Rect A0W = AbstractC166987dD.A0W(shapeDrawable);
            int width = A0W.width();
            int height = A0W.height();
            if (width <= 0 || height <= 0) {
                width = shapeDrawable.getIntrinsicWidth();
                height = shapeDrawable.getIntrinsicWidth();
            }
            LayerDrawable A0B = AbstractC43593JPy.A0B(C3LQ.A00(context, new LinearGradient(0.0f, height, width, 0.0f, iArr, (float[]) null, Shader.TileMode.REPEAT), shapeDrawable), C3LQ.A05(context, R.drawable.instagram_gen_ai_pano_filled_24, AbstractC166997dE.A03(context)));
            int A02 = AbstractC43593JPy.A02(context, 10);
            A0B.setLayerInset(0, 0, 0, 0, 0);
            A0B.setLayerInset(1, A02, A02, A02, A02);
            A0S.setBackground(A0B);
        }
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1983244936);
        super.onCreate(bundle);
        C0f9.A09(-927598112, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1849133950);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.gen_ai_sticker_attribution_bottomsheet_fragment, false);
        C0f9.A09(811803370, A02);
        return A0R;
    }
}
