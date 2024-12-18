package X;

import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.3ej, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78173ej extends C0YY implements InterfaceC16610sE {
    public static final C78173ej A00 = new C78173ej();

    public C78173ej() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass418 anonymousClass418 = (AnonymousClass418) obj;
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) obj2;
        int intValue = ((Number) obj3).intValue();
        C14360o3.A0B(anonymousClass418, 0);
        C14360o3.A0B(colorFilterAlphaImageView, 1);
        colorFilterAlphaImageView.setNormalColor(intValue);
        return anonymousClass418.A00(new C9EX(colorFilterAlphaImageView, 12));
    }
}
