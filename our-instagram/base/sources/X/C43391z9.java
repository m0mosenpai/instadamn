package X;

import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1z9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43391z9 {
    public static final boolean A01(C43331z2 c43331z2, ImageUrl imageUrl) {
        if (c43331z2.A01 && imageUrl.Amf() == EnumC59022n0.A07) {
            return true;
        }
        if (imageUrl.Amf() != EnumC59022n0.A07 && imageUrl.Amf() != EnumC59022n0.A05) {
            return true;
        }
        return false;
    }

    public static final PPRLoggingData A00(C43331z2 c43331z2, ImageUrl imageUrl) {
        ImageLoggingData BOm = imageUrl.BOm();
        if (!(BOm instanceof PPRLoggingData)) {
            if (A01(c43331z2, imageUrl)) {
                Integer num = C05F.A00;
                return new PPRLoggingData(null, num, num, "-1", false, false, false);
            }
            throw new IllegalStateException("Can't log PPR for images without PPR logging data");
        }
        C14360o3.A0C(BOm, "null cannot be cast to non-null type com.instagram.analytics.ppr.loggingdata.PPRLoggingData");
        return (PPRLoggingData) BOm;
    }

    public final boolean A02(C43331z2 c43331z2, ImageUrl imageUrl) {
        if (!(imageUrl.BOm() instanceof PPRLoggingData) && !A01(c43331z2, imageUrl)) {
            return false;
        }
        return true;
    }
}
