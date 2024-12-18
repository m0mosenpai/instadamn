package X;

import com.facebook.rsys.photobooth.gen.PhotoboothApi;

/* renamed from: X.Pif, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57690Pif extends C0YY implements InterfaceC16660sJ {
    public static final C57690Pif A00 = new C57690Pif();

    public C57690Pif() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PhotoboothApi photoboothApi = MSX.A0T(obj).A05.A00;
        if (photoboothApi != null) {
            photoboothApi.cancelPhotoboothSession();
        }
        return C0eB.A00;
    }
}
