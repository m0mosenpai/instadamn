package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.photo.crop.LayoutImageView;

/* renamed from: X.UJp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66487UJp extends C3OO implements InterfaceC193488hT, C1NJ {
    public ABL A00;
    public C22919A8p A01;
    public boolean A02;
    public final View A03;
    public final InterfaceC56392iX A04;
    public final InterfaceC56392iX A05;

    @Override // X.InterfaceC193488hT
    public final boolean CXZ(Medium medium) {
        return true;
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C14360o3.A0B(c73033Pe, 1);
        C22919A8p c22919A8p = this.A01;
        if (c22919A8p != null) {
            A00(c73033Pe.A01, C197098ne.A01(c22919A8p.A03.A0X));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.InterfaceC193488hT
    public final void Dt1(Bitmap bitmap, Medium medium, boolean z) {
        C14360o3.A0B(bitmap, 2);
        A00(bitmap, 0);
    }

    private final void A00(Bitmap bitmap, int i) {
        if (bitmap != null) {
            InterfaceC56392iX interfaceC56392iX = this.A05;
            if (interfaceC56392iX.CGb() == 0) {
                ((ImageView) interfaceC56392iX.getView()).setImageBitmap(bitmap);
            } else {
                InterfaceC56392iX interfaceC56392iX2 = this.A04;
                if (interfaceC56392iX2.CGb() == 0) {
                    C22919A8p c22919A8p = this.A01;
                    if (c22919A8p != null) {
                        C22918A8o c22918A8o = c22919A8p.A01;
                        ((LayoutImageView) interfaceC56392iX2.getView()).A0P((int) c22918A8o.A03, (int) c22918A8o.A00, bitmap, i);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw new IllegalArgumentException("Loaded thumbnail but no image preview is visible.");
                }
            }
        }
        ABL abl = this.A00;
        if (abl != null) {
            abl.A00();
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        ABL abl = this.A00;
        if (abl != null) {
            abl.A00();
        }
    }

    @Override // X.InterfaceC193488hT
    public final void DN1(Medium medium, String str) {
        ABL abl = this.A00;
        if (abl != null) {
            abl.A00();
        }
    }

    public C66487UJp(View view) {
        super(view);
        this.A03 = view;
        this.A05 = AbstractC166997dE.A0X(view, R.id.layout_thumbnail_simple_image_stub);
        this.A04 = AbstractC166997dE.A0X(view, R.id.layout_thumbnail_layout_image_stub);
    }
}
