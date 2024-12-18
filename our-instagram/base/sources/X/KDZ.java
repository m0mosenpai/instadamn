package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;

/* loaded from: classes8.dex */
public final class KDZ extends AbstractC59962oe implements InterfaceC50495MQy {
    public static final String __redex_internal_original_name = "NametagBackgroundImagePickerFragment";
    public KFE A00;
    public C47958LGu A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC50495MQy
    public final /* synthetic */ void D2F() {
    }

    @Override // X.InterfaceC50495MQy
    public final boolean DIy(View view, GalleryItem galleryItem) {
        return false;
    }

    @Override // X.InterfaceC50495MQy
    public final /* synthetic */ void DKF(boolean z) {
    }

    @Override // X.InterfaceC50495MQy
    public final boolean DmO(Medium medium, String str) {
        C14360o3.A0B(str, 0);
        KFE kfe = this.A00;
        if (kfe == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        AbstractC167017dG.A0y(kfe.A0A, C3DN.A00);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        C47955LGq c47955LGq = kfe.A0I;
        c47955LGq.A01(decodeFile);
        c47955LGq.A02(kfe);
        kfe.A05 = true;
        KFE.A07(kfe);
        KFE.A05(kfe);
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "qr_code_media_picker_gallery_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = new C47958LGu(view, null, EnumC188968Ym.A04, AbstractC166987dD.A0r(this.A02), null, this, new L9H(0, null, null, null, "", "", null, 1.0f, 0, false, false, false, false, false, false, true, false), null, 3, 0, true, false, false);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-707465892);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_nametag_media_picker_photos, viewGroup, false);
        C0f9.A09(435225885, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1732044069);
        super.onPause();
        C47958LGu c47958LGu = this.A01;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        c47958LGu.A02();
        C0f9.A09(-1824053920, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(966999893);
        super.onResume();
        C47958LGu c47958LGu = this.A01;
        if (c47958LGu == null) {
            C14360o3.A0F("mediaPickerPhotosController");
            throw C00O.createAndThrow();
        }
        c47958LGu.A03();
        C0f9.A09(1924469367, A02);
    }
}
