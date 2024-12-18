package X;

import com.instagram.api.schemas.MediaCroppingCoordinates;
import kotlin.Deprecated;

@Deprecated(message = "See ClipsPublishScreenViewModel")
/* renamed from: X.MfZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50966MfZ extends AbstractC52922bZ {
    public MediaCroppingCoordinates A00;
    public final C152406tQ A01;
    public final C2GS A02;

    public C50966MfZ(C152406tQ c152406tQ) {
        C14360o3.A0B(c152406tQ, 1);
        this.A01 = c152406tQ;
        this.A02 = MSW.A0E();
    }

    public final void A00(MediaCroppingCoordinates mediaCroppingCoordinates) {
        this.A00 = mediaCroppingCoordinates;
        this.A01.A01("PROFILE_CROP_COORDINATES_KEY", mediaCroppingCoordinates);
        this.A02.A0B(mediaCroppingCoordinates);
    }
}
