package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.igds.components.imagebutton.IgImageButton;
import java.util.List;

/* loaded from: classes8.dex */
public final class Jo4 extends C2UU implements InterfaceC189068Yw {
    public final float A00;
    public final int A01;
    public final int A02;
    public final C8SG A03;
    public final KFG A04;
    public final List A05 = AbstractC166987dD.A1E();

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
        C44771Jrs c44771Jrs = (C44771Jrs) c3oo;
        C14360o3.A0B(c44771Jrs, 0);
        Medium medium = (Medium) this.A05.get(i);
        C14360o3.A0B(medium, 0);
        IgImageButton igImageButton = c44771Jrs.A02;
        igImageButton.setImageBitmap(null);
        c44771Jrs.A01 = medium;
        c44771Jrs.A00 = c44771Jrs.A03.AGR(null, c44771Jrs.A00, medium, c44771Jrs, null, null, null);
        Context context = igImageButton.getContext();
        StringBuilder sb = new StringBuilder(context.getString(2131963110));
        if (c44771Jrs.A01 != null) {
            AbstractC56932jR.A09(AbstractC167007dF.A0f(context, C23831Eq.A03(context, (int) r0.A0C), 2131957531), sb, true);
        }
        igImageButton.setContentDescription(sb);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0C = AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_gallery_photo_item, false);
        AbstractC13880nE.A0h(A0C, this.A02, this.A01);
        return new C44771Jrs(A0C, this.A03, this, this.A00);
    }

    public Jo4(C8SG c8sg, KFG kfg, int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = c8sg;
        this.A04 = kfg;
        this.A00 = i / i2;
    }

    @Override // X.InterfaceC189068Yw
    public final List ANA() {
        return AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-24162446);
        int size = this.A05.size();
        C0f9.A0A(-299452108, A03);
        return size;
    }
}
