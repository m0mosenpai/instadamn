package X;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes8.dex */
public final class KJG extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44629JpZ(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.magic_media_remix_template_item_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZL lzl = (LZL) interfaceC66482zP;
        C44629JpZ c44629JpZ = (C44629JpZ) c3oo;
        AbstractC167017dG.A1N(lzl, c44629JpZ);
        Bitmap bitmap = lzl.A00;
        RoundedCornerImageView roundedCornerImageView = c44629JpZ.A00;
        roundedCornerImageView.setImageBitmap(bitmap);
        roundedCornerImageView.setVisibility(0);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZL.class;
    }
}
