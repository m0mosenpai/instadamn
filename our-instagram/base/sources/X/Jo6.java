package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jo6 extends C2UU implements InterfaceC189068Yw {
    public final float A00;
    public final int A01;
    public final C8SG A02;
    public final UserSession A03;
    public final C45508KCx A04;
    public final List A05;

    public Jo6(C8SG c8sg, UserSession userSession, C45508KCx c45508KCx, float f, int i) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = c45508KCx;
        this.A02 = c8sg;
        this.A01 = i;
        this.A00 = f;
        this.A05 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC189068Yw
    public final void EYj(List list, String str) {
        C14360o3.A0B(list, 0);
        AbstractC31175DnJ.A0x(this, list, this.A05);
    }

    @Override // X.InterfaceC189068Yw
    public final void EdU(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44772Jrt c44772Jrt = (C44772Jrt) c3oo;
        C14360o3.A0B(c44772Jrt, 0);
        Medium medium = (Medium) this.A05.get(i);
        C8SG c8sg = this.A02;
        C14360o3.A0B(medium, 0);
        TextView textView = c44772Jrt.A02;
        textView.setVisibility(8);
        textView.setAlpha(1.0f);
        IgImageButton igImageButton = c44772Jrt.A03;
        igImageButton.setImageBitmap(null);
        igImageButton.setOnClickListener(null);
        igImageButton.setImageAlpha(255);
        igImageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c44772Jrt.A01 = medium;
        c44772Jrt.A00 = c8sg.AGR(null, c44772Jrt.A00, medium, c44772Jrt, null, null, null);
        if (medium.Cff()) {
            int i2 = medium.A03;
            if (i2 < 0 || i2 > 900500) {
                textView.setAlpha(0.3f);
                igImageButton.setImageAlpha(77);
            }
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0R = AbstractC25226BEj.A0R(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.upload_gallery_item, false);
        AbstractC13880nE.A0W(A0R, this.A01);
        return new C44772Jrt(A0R, this.A03, this.A04, this.A00);
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return C16930sl.A00;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(860768584);
        int size = this.A05.size();
        C0f9.A0A(458504446, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(-1133650971, C0f9.A03(-890483635));
        return 1;
    }
}
