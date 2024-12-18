package X;

import com.facebook.rsys.photobooth.gen.PhotoboothApi;

/* renamed from: X.Pij, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57694Pij extends C0YY implements InterfaceC16660sJ {
    public static final C57694Pij A00 = new C57694Pij();

    public C57694Pij() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PhotoboothApi photoboothApi = MSX.A0T(obj).A05.A00;
        if (photoboothApi != null) {
            photoboothApi.sendSnapshotNotification();
        }
        return C0eB.A00;
    }
}
