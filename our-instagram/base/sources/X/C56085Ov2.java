package X;

import com.instagram.api.schemas.MediaKitVisibility;

/* renamed from: X.Ov2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56085Ov2 implements InterfaceC66482zP {
    public final C56389P2a A00;

    public C56085Ov2(MediaKitVisibility mediaKitVisibility, C56389P2a c56389P2a) {
        C14360o3.A0B(mediaKitVisibility, 1);
        this.A00 = c56389P2a;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "visibility_section";
    }
}
