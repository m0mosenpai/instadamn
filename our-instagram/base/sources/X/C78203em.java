package X;

import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.3em, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C78203em extends C03E implements InterfaceC16620sF {
    public static final C78203em A00 = new C78203em();

    public C78203em() {
        super(2, ColorFilterAlphaImageView.class, "setNormalColor", "setNormalColor(I)V", 0);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) obj;
        int intValue = ((Number) obj2).intValue();
        C14360o3.A0B(colorFilterAlphaImageView, 0);
        colorFilterAlphaImageView.setNormalColor(intValue);
        return C0eB.A00;
    }
}
