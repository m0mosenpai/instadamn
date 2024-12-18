package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes8.dex */
public abstract class LBM {
    public static void A01(InterfaceC11380iw interfaceC11380iw, C46505Ki4 c46505Ki4, C47Z c47z, float f) {
        String str;
        MediaFrameLayout mediaFrameLayout = c46505Ki4.A03;
        mediaFrameLayout.A00 = f;
        String str2 = c47z.A33;
        if (str2 != null) {
            c46505Ki4.A02.setUrl(AbstractC43593JPy.A0Q(str2), interfaceC11380iw);
        }
        BrandedContentProjectMetadata brandedContentProjectMetadata = c47z.A0t;
        boolean z = true;
        if (brandedContentProjectMetadata == null || (str = brandedContentProjectMetadata.A05) == null || str.length() != 0) {
            z = false;
        }
        ViewGroup viewGroup = c46505Ki4.A00;
        if (z) {
            viewGroup.setVisibility(0);
            c46505Ki4.A01.setText(2131964553);
            return;
        }
        viewGroup.setVisibility(8);
        U7F u7f = new U7F();
        u7f.A00 = 50.0f;
        mediaFrameLayout.setOnTouchListener(u7f);
        u7f.A02 = new C48579LeH(null, mediaFrameLayout, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.Ki4] */
    public static View A00(ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_photo_preview);
        ?? obj = new Object();
        AbstractC31176DnK.A1D(A0A, R.id.preview_image_spinner);
        obj.A03 = (MediaFrameLayout) A0A.requireViewById(R.id.preview_image_frame);
        obj.A02 = AbstractC31172DnG.A0Z(A0A, R.id.preview_image);
        obj.A00 = AbstractC31173DnH.A0F(A0A, R.id.metadata_cta_view);
        obj.A01 = AbstractC166997dE.A0T(A0A, R.id.cta_text);
        A0A.setTag(obj);
        return A0A;
    }
}
