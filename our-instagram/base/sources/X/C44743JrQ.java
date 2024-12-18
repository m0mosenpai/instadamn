package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.JrQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44743JrQ extends C3OO {
    public final Context A00;
    public final View A01;
    public final FrameLayout A02;
    public final TextView A03;
    public final TextView A04;
    public final InterfaceC56392iX A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44743JrQ(View view, C47434KxP c47434KxP) {
        super(view);
        C14360o3.A0B(c47434KxP, 2);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A00 = A0L;
        View A0S = AbstractC166997dE.A0S(view, R.id.row_inbox_container);
        this.A01 = A0S;
        FrameLayout frameLayout = (FrameLayout) AbstractC166997dE.A0R(view, R.id.icon_container);
        this.A02 = frameLayout;
        this.A04 = AbstractC167007dF.A0N(view, R.id.row_title);
        this.A03 = AbstractC167007dF.A0N(view, R.id.row_subtitle);
        this.A05 = AbstractC56372iV.A01(view.findViewById(R.id.toggle_stub), false, false);
        float dimension = A0L.getResources().getDimension(R.dimen.alert_dialog_button_cell_height);
        LinearGradient linearGradient = new LinearGradient(0.0f, dimension, dimension, 0.0f, new int[]{AbstractC167007dF.A09(A0L, R.attr.igds_color_gradient_yellow), A0L.getColor(R.color.activator_card_progress_bad), AbstractC167007dF.A09(A0L, R.attr.igds_color_gradient_pink), AbstractC167007dF.A09(A0L, R.attr.igds_color_gradient_lavender)}, new float[]{0.17f, 0.39f, 0.61f, 0.83f}, Shader.TileMode.CLAMP);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(linearGradient);
        frameLayout.setBackground(shapeDrawable);
        ViewOnClickListenerC48074LPz.A01(A0S, 34, c47434KxP);
    }
}
