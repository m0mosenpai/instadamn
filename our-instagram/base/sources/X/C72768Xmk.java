package X;

import android.content.Context;
import com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.session.UserSession;

/* renamed from: X.Xmk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72768Xmk {
    public final YPE A00;
    public final C006802i A01;
    public final boolean A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.XQj, X.XLu] */
    public C72768Xmk(Context context, UserSession userSession) {
        C85R A00;
        SegmentAnythingOnDeviceProcessorV2 segmentAnythingOnDeviceProcessorV2;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36330565716165537L)) {
            ?? c72154XQj = new C72154XQj(new C8ED(userSession, AbstractC166987dD.A1J(C8E4.A09.A00())));
            c72154XQj.A00 = new C23295AUg(userSession, 3);
            segmentAnythingOnDeviceProcessorV2 = c72154XQj;
        } else {
            if (C18U.A06(c06090Tz, userSession, 36322375213590737L)) {
                A00 = null;
            } else {
                A00 = C85R.A00(context, userSession);
            }
            segmentAnythingOnDeviceProcessorV2 = new SegmentAnythingOnDeviceProcessorV2(new C8EB(A00, userSession, AbstractC166987dD.A1J(VersionedCapability.SegmentAnything), AbstractC166987dD.A1J(new C8E5("SegmentAnything", "PYTORCH_MODEL", C16930sl.A00, 10020L))));
        }
        SegmentAnythingOnDeviceProcessorV2 segmentAnythingOnDeviceProcessorV22 = segmentAnythingOnDeviceProcessorV2;
        this.A00 = segmentAnythingOnDeviceProcessorV22;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A01 = c006802i;
        this.A02 = C18U.A06(c06090Tz, userSession, 36330565716165537L);
        segmentAnythingOnDeviceProcessorV22.Eah(new C72686XlD(this));
        segmentAnythingOnDeviceProcessorV22.Chb();
    }
}
