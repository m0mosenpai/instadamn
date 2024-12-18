package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.Jrt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44772Jrt extends C3OO implements InterfaceC193488hT {
    public C193498hU A00;
    public Medium A01;
    public final TextView A02;
    public final IgImageButton A03;
    public final C45508KCx A04;
    public final float A05;
    public final Matrix A06;
    public final UserSession A07;

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        C14360o3.A0B(medium, 0);
        Medium medium2 = this.A01;
        if (medium2 == null) {
            C14360o3.A0F("currentMedium");
            throw C00O.createAndThrow();
        }
        return medium.equals(medium2);
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        int i = 0;
        AbstractC167007dF.A1D(medium, 0, bitmap);
        TextView textView = this.A02;
        Context context = textView.getContext();
        bitmap.getWidth();
        bitmap.getHeight();
        IgImageButton igImageButton = this.A03;
        ((ConstrainedImageView) igImageButton).A00 = this.A05;
        if (medium.A07 != 0) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int width2 = this.itemView.getWidth();
            int height2 = this.itemView.getHeight();
            int i2 = medium.A07;
            Matrix matrix = this.A06;
            C1NC.A0J(matrix, width, height, width2, height2, i2, false);
            igImageButton.setScaleType(ImageView.ScaleType.MATRIX);
            igImageButton.setImageMatrix(matrix);
        }
        igImageButton.setImageBitmap(bitmap);
        C0fQ.A00(new ViewOnClickListenerC55465OkK(38, medium, this), igImageButton);
        if (medium.Cff()) {
            AbstractC166987dD.A1O(context, textView, AbstractC53242c7.A0A(context));
            textView.setText(medium.B8m());
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public C44772Jrt(View view, UserSession userSession, C45508KCx c45508KCx, float f) {
        super(view);
        this.A07 = userSession;
        this.A04 = c45508KCx;
        this.A05 = f;
        this.A03 = (IgImageButton) AbstractC166987dD.A0c(view, R.id.video_thumbnail);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.duration_label);
        this.A06 = AbstractC166987dD.A0Q();
    }
}
