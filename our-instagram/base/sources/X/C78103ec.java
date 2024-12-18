package X;

import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C78103ec extends C03E implements InterfaceC16620sF {
    public static final C78103ec A00 = new C78103ec();

    public C78103ec() {
        super(2, CircularImageView.class, "setPlaceHolderColor", "setPlaceHolderColor(I)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        IgImageView igImageView = (IgImageView) obj;
        int intValue = ((Number) obj2).intValue();
        C14360o3.A0B(igImageView, 0);
        igImageView.setPlaceHolderColor(intValue);
        return C0eB.A00;
    }
}
