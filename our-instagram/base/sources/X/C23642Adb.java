package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Adb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23642Adb implements C6D2 {
    public final /* synthetic */ C76U A00;

    public C23642Adb(C76U c76u) {
        this.A00 = c76u;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        PPRLoggingData pPRLoggingData;
        String str = (String) obj;
        if (C18U.A06(C06090Tz.A05, this.A00.A01.A00, 36318990779292475L)) {
            pPRLoggingData = new PPRLoggingData(null, C05F.A01, C05F.A00, NetInfoModule.CONNECTION_TYPE_NONE, false, false, false);
        } else {
            pPRLoggingData = null;
        }
        C14360o3.A0A(str);
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl(null, null, null, null, str, null, null, null);
        extendedImageUrl.A00 = pPRLoggingData;
        return extendedImageUrl;
    }
}
