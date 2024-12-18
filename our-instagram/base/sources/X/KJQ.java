package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.ui.widget.IgABTestMultiImageButton;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class KJQ extends AbstractC66422zJ {
    public final float A00;
    public final InterfaceC11380iw A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new Jp4(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.ab_test_media_thumbnail_preview_item_layout, false), this.A00);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EnumC153466vG enumC153466vG;
        C48305LZe c48305LZe = (C48305LZe) interfaceC66482zP;
        Jp4 jp4 = (Jp4) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c48305LZe, jp4);
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(interfaceC11380iw, A1R ? 1 : 0);
        ImageUrl imageUrl = c48305LZe.A02;
        IgABTestMultiImageButton igABTestMultiImageButton = jp4.A00;
        if (imageUrl != null) {
            igABTestMultiImageButton.setUrl(imageUrl, interfaceC11380iw);
            VDG vdg = c48305LZe.A01;
            if (vdg != null) {
                int ordinal = vdg.ordinal();
                if (ordinal != 3) {
                    if (ordinal == 9) {
                        enumC153466vG = EnumC153466vG.A08;
                    }
                } else {
                    enumC153466vG = EnumC153466vG.A0N;
                }
                igABTestMultiImageButton.setIcon(enumC153466vG);
                igABTestMultiImageButton.setMediaOverlay(null);
                igABTestMultiImageButton.setAlphabet(String.valueOf((char) (c48305LZe.A00 + 65)));
                igABTestMultiImageButton.setBottomRightAlphabetCircleDrawableEnabled(false);
                igABTestMultiImageButton.setBottomCenterAlphabetCircleDrawableEnabled(A1R);
                igABTestMultiImageButton.setSelected(-1);
            }
            igABTestMultiImageButton.A0H();
            igABTestMultiImageButton.setMediaOverlay(null);
            igABTestMultiImageButton.setAlphabet(String.valueOf((char) (c48305LZe.A00 + 65)));
            igABTestMultiImageButton.setBottomRightAlphabetCircleDrawableEnabled(false);
            igABTestMultiImageButton.setBottomCenterAlphabetCircleDrawableEnabled(A1R);
            igABTestMultiImageButton.setSelected(-1);
        } else {
            igABTestMultiImageButton.A09();
            igABTestMultiImageButton.setBottomRightAlphabetCircleDrawableEnabled(false);
            igABTestMultiImageButton.setBottomCenterAlphabetCircleDrawableEnabled(false);
        }
        igABTestMultiImageButton.setNumberedCheckBoxEnabled(false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48305LZe.class;
    }

    public KJQ(InterfaceC11380iw interfaceC11380iw, float f) {
        this.A01 = interfaceC11380iw;
        this.A00 = f;
    }
}
