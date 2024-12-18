package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import com.instagram.creation.photo.crop.CropImageView;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class KCQ extends AbstractC59962oe implements InterfaceC60072op, MQT {
    public static final String __redex_internal_original_name = "PhotoCropFragment";
    public int A01;
    public int A02;
    public Bitmap A03;
    public GalleryItem A04;
    public C47291Kv2 A05;
    public C43868JaY A06;
    public float[] A07;
    public View A08;
    public C43870Jaa A09;
    public C43869JaZ A0A;
    public CropImageView A0B;
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);
    public final String A0D = __redex_internal_original_name;
    public float A00 = 1.0f;

    @Override // X.MQT
    public final /* synthetic */ void D1r() {
    }

    @Override // X.MQT
    public final /* synthetic */ void D8k(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Medium medium;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        GalleryItem galleryItem = (GalleryItem) requireArguments().getParcelable("PhotoCropFragment.previewItem");
        this.A04 = galleryItem;
        C43869JaZ c43869JaZ = new C43869JaZ();
        c43869JaZ.A03 = getActivity();
        c43869JaZ.A04 = this;
        c43869JaZ.A0A = this.A07;
        CropImageView cropImageView = this.A0B;
        android.net.Uri uri = null;
        if (cropImageView == null) {
            str = "cropImageView";
        } else {
            c43869JaZ.A05 = cropImageView;
            if (galleryItem != null && (medium = galleryItem.A00) != null) {
                uri = medium.A02();
            }
            c43869JaZ.A01 = uri;
            c43869JaZ.A07 = 0;
            c43869JaZ.A06 = Integer.valueOf(AbstractC167007dF.A09(getContext(), R.attr.igds_color_primary_text_on_media));
            this.A0A = c43869JaZ;
            C43868JaY c43868JaY = new C43868JaY(requireContext(), AbstractC43594JPz.A0P(this.A0C));
            this.A06 = c43868JaY;
            c43868JaY.A03 = this.A0A;
            c43868JaY.A01();
            C43870Jaa c43870Jaa = this.A09;
            if (c43870Jaa == null) {
                str = "cropBorderOverlayController";
            } else {
                c43870Jaa.A01(this.A02, this.A01, this.A00);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.MQT
    public final void DH8(Location location, android.net.Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, HashMap hashMap, int i, int i2) {
        Object obj;
        Canvas A06 = AbstractC43592JPx.A06(AbstractC167007dF.A0F(this.A02, this.A01));
        CropImageView cropImageView = this.A0B;
        if (cropImageView != null) {
            cropImageView.draw(A06);
            float[] fArr = new float[9];
            CropImageView cropImageView2 = this.A0B;
            if (cropImageView2 != null) {
                ((AbstractC43828JZr) cropImageView2).A08.getValues(fArr);
                C47291Kv2 c47291Kv2 = this.A05;
                if (c47291Kv2 != null) {
                    GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = c47291Kv2.A00;
                    C43869JaZ c43869JaZ = gestureDetectorOnGestureListenerC43829JZs.A1B;
                    c43869JaZ.A0A = fArr;
                    C43868JaY c43868JaY = gestureDetectorOnGestureListenerC43829JZs.A1C;
                    c43868JaY.A03 = c43869JaZ;
                    c43868JaY.A01();
                    GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = gestureDetectorOnGestureListenerC43829JZs.A0I;
                    if (galleryPreviewMultiselectPager != null && gestureDetectorOnGestureListenerC43829JZs.A0B != null) {
                        C14360o3.A0A(galleryPreviewMultiselectPager);
                        GalleryItem galleryItem = gestureDetectorOnGestureListenerC43829JZs.A0B;
                        AbstractC167007dF.A1C(galleryItem);
                        Iterator it = galleryPreviewMultiselectPager.A02.iterator();
                        do {
                            obj = null;
                            if (!it.hasNext()) {
                                break;
                            } else {
                                obj = it.next();
                            }
                        } while (!C14360o3.A0K(((C45073Jx2) obj).A0B.A0A, galleryItem.A0A));
                        C45073Jx2 c45073Jx2 = (C45073Jx2) obj;
                        if (c45073Jx2 != null) {
                            c45073Jx2.A09 = fArr;
                            GalleryPreviewMultiselectPager.A01(null, galleryPreviewMultiselectPager, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("cropImageView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0D;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        requireActivity().getSupportFragmentManager().A0b();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1847751808);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.gallery_picker_crop_photo_layout, viewGroup, false);
        this.A09 = new C43870Jaa(AbstractC167007dF.A0M(inflate, R.id.crop_border_overlay_stub));
        CropImageView cropImageView = (CropImageView) inflate.requireViewById(R.id.crop_fragment_image_view);
        cropImageView.A05 = true;
        cropImageView.setSameProportionalGrid(true);
        if (this.A00 == 1.0f) {
            cropImageView.setForcedMinZoom(1.0f);
        }
        this.A0B = cropImageView;
        View requireViewById = inflate.requireViewById(R.id.crop_fragment_done_button);
        this.A08 = requireViewById;
        if (requireViewById == null) {
            C14360o3.A0F("doneButton");
            throw C00O.createAndThrow();
        }
        ViewOnClickListenerC48063LPo.A00(requireViewById, 10, this);
        Bitmap bitmap = this.A03;
        if (bitmap != null) {
            inflate.setBackground(new BitmapDrawable(AbstractC166997dE.A0N(this), BlurUtil.blur(bitmap, 0.1f, 4)));
        }
        C0f9.A09(766999725, A02);
        return inflate;
    }
}
