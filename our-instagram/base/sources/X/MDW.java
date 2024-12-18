package X;

import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDW extends C03E implements InterfaceC16620sF {
    public static final MDW A00 = new MDW();

    public MDW() {
        super(2, RoundedCornerImageView.class, "setStrokeEnabled", "setStrokeEnabled(Z)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) obj;
        boolean A1a = AbstractC166987dD.A1a(obj2);
        C14360o3.A0B(roundedCornerImageView, 0);
        roundedCornerImageView.setStrokeEnabled(A1a);
        return C0eB.A00;
    }
}
