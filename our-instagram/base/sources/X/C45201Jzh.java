package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.Jzh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45201Jzh extends C0T6 implements InterfaceC66482zP {
    public final ImageUrl A00;
    public final PrivacyMediaOverlayViewModel A01;
    public final String A02;

    public C45201Jzh(ImageUrl imageUrl, PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, String str) {
        C14360o3.A0B(imageUrl, 1);
        this.A00 = imageUrl;
        this.A02 = str;
        this.A01 = privacyMediaOverlayViewModel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45201Jzh) {
                C45201Jzh c45201Jzh = (C45201Jzh) obj;
                if (!C14360o3.A0K(this.A00, c45201Jzh.A00) || !C14360o3.A0K(this.A02, c45201Jzh.A02) || !C14360o3.A0K(this.A01, c45201Jzh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C45201Jzh c45201Jzh = (C45201Jzh) obj;
        C14360o3.A0B(c45201Jzh, 0);
        if (C14360o3.A0K(this.A00, c45201Jzh.A00) && C14360o3.A0K(this.A02, c45201Jzh.A02) && C14360o3.A0K(this.A01, c45201Jzh.A01)) {
            return true;
        }
        return false;
    }
}
