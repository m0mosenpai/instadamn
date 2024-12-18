package X;

import com.instagram.common.session.UserSession;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;

/* renamed from: X.OIu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54780OIu {
    public String A01;
    public final UserSession A03;
    public MediaKitEntryPoint A00 = MediaKitEntryPoint.A0A;
    public String A02 = "";

    public final void A00(MediaKitEntryPoint mediaKitEntryPoint) {
        C14360o3.A0B(mediaKitEntryPoint, 0);
        this.A02 = "";
        this.A01 = null;
        this.A00 = mediaKitEntryPoint;
        this.A02 = AbstractC166997dE.A0n();
    }

    public C54780OIu(UserSession userSession) {
        this.A03 = userSession;
    }
}
