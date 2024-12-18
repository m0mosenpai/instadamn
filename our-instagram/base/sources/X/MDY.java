package X;

import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDY extends C03E implements InterfaceC16620sF {
    public static final MDY A00 = new MDY();

    public MDY() {
        super(2, RoundedCornerImageView.class, "setRadius", "setRadius(F)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) obj;
        float A09 = AbstractC166987dD.A09(obj2);
        C14360o3.A0B(roundedCornerImageView, 0);
        roundedCornerImageView.setRadius(A09);
        return C0eB.A00;
    }
}
