package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.common.ui.widget.imageview.PunchedOverlayView;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;
import com.instagram.creation.base.ui.grid.GridLinesView;

/* renamed from: X.N5o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52139N5o extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ProfileCropFragment";
    public RectF A00;
    public PunchedOverlayView A01;
    public TouchImageView A02;
    public boolean A03;
    public boolean A04;
    public Bitmap A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        this.A04 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(this.A06, 0), 36327348785789460L);
        PunchedOverlayView punchedOverlayView = (PunchedOverlayView) view.findViewById(R.id.punched_overlay_view);
        punchedOverlayView.A01 = AbstractC167007dF.A09(requireContext, R.attr.backgroundColorSecondary);
        punchedOverlayView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC55474OkT(2, this, punchedOverlayView));
        this.A01 = punchedOverlayView;
        TouchImageView touchImageView = (TouchImageView) view.findViewById(R.id.crop_image_preview);
        touchImageView.A06 = new C56187Owu(this.A04);
        touchImageView.A0G = true;
        touchImageView.A0F = false;
        touchImageView.A02 = 3.0f;
        Bitmap bitmap = this.A05;
        if (bitmap == null) {
            C14360o3.A0F("bitmap");
            throw C00O.createAndThrow();
        }
        touchImageView.setImageBitmap(bitmap);
        ViewOnTouchListenerC50553MTk.A00(touchImageView, 9, this);
        touchImageView.post(new RunnableC56998PQo(touchImageView, this));
        this.A02 = touchImageView;
        GridLinesView gridLinesView = (GridLinesView) view.requireViewById(R.id.grid_lines);
        gridLinesView.A02 = false;
        if (this.A04) {
            gridLinesView.A00 = 1.3333334f;
        }
        gridLinesView.post(new PN2(gridLinesView));
    }

    public final MediaCroppingCoordinates A00() {
        String str;
        TouchImageView touchImageView = this.A02;
        if (touchImageView == null) {
            str = "touchImageView";
        } else {
            Rect cropRect = touchImageView.getCropRect();
            Bitmap bitmap = this.A05;
            str = "bitmap";
            if (bitmap != null) {
                float width = bitmap.getWidth();
                Bitmap bitmap2 = this.A05;
                if (bitmap2 != null) {
                    float height = bitmap2.getHeight();
                    RectF rectF = new RectF(cropRect.left / width, cropRect.top / height, cropRect.right / width, cropRect.bottom / height);
                    return new MediaCroppingCoordinates(rectF.bottom, rectF.left, rectF.right, rectF.top);
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String A01;
        MediaCroppingCoordinates mediaCroppingCoordinates;
        RectF rectF;
        int A02 = C0f9.A02(724780755);
        super.onCreate(bundle);
        boolean z = this instanceof NN9;
        if (z) {
            A01 = MSY.A0Q(((NN9) this).A01).A0J;
            C14360o3.A0A(A01);
        } else {
            A01 = AbstractC153636vY.A01(requireArguments(), "ClipsConstants.ARG_CLIPS_COVER_IMAGE_FILE_PATH");
        }
        this.A05 = BitmapFactory.decodeFile(A01);
        if (z) {
            mediaCroppingCoordinates = MSY.A0Q(((NN9) this).A01).A0A;
        } else {
            mediaCroppingCoordinates = (MediaCroppingCoordinates) ((C50966MfZ) ((NN8) this).A01.getValue()).A01.A00("PROFILE_CROP_COORDINATES_KEY");
        }
        if (mediaCroppingCoordinates != null) {
            rectF = new RectF(mediaCroppingCoordinates.A01, mediaCroppingCoordinates.A03, mediaCroppingCoordinates.A02, mediaCroppingCoordinates.A00);
        } else {
            if (this.A05 == null) {
                C14360o3.A0F("bitmap");
                throw C00O.createAndThrow();
            }
            float height = (r2.getHeight() - r2.getWidth()) / (r2.getHeight() * 2);
            rectF = new RectF(0.0f, height, 1.0f, 1.0f - height);
        }
        this.A00 = rectF;
        C0f9.A09(-1376636745, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1030545323);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.upload_edit_profile_crop_fragment, false);
        C0f9.A09(-1692309828, A02);
        return A0R;
    }
}
