package X;

import com.facebook.rsys.photobooth.gen.PhotoboothApi;

/* renamed from: X.Pik, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57695Pik extends C0YY implements InterfaceC16660sJ {
    public static final C57695Pik A00 = new C57695Pik();

    public C57695Pik() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PhotoboothApi photoboothApi = MSX.A0T(obj).A05.A00;
        if (photoboothApi != null) {
            photoboothApi.startPhotoboothSession();
        }
        return C0eB.A00;
    }
}
