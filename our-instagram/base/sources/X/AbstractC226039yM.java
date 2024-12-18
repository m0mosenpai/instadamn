package X;

import android.content.Context;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9yM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226039yM {
    public static final void A00(Context context, UserSession userSession) {
        List A1Q;
        C8E5[] c8e5Arr;
        C85R A00;
        C14360o3.A0B(userSession, 1);
        if (C18U.A06(C06090Tz.A06, userSession, 36329062477611003L)) {
            A1Q = AbstractC16960so.A1Q(VersionedCapability.Saliency, VersionedCapability.SegmentAnything, VersionedCapability.UTwoNet);
            C16930sl c16930sl = C16930sl.A00;
            c8e5Arr = new C8E5[]{new C8E5("Saliency", "PYTORCH_MODEL", c16930sl, 2020L), new C8E5("SegmentAnything", "PYTORCH_MODEL", c16930sl, 10020L), new C8E5("UTWONET", "ET_MODEL", c16930sl, 1L), new C8E5("UTwoNet", "PYTORCH_MODEL", c16930sl, 1020L)};
        } else {
            A1Q = AbstractC16960so.A1Q(VersionedCapability.Saliency, VersionedCapability.SegmentAnything);
            C16930sl c16930sl2 = C16930sl.A00;
            c8e5Arr = new C8E5[]{new C8E5("Saliency", "PYTORCH_MODEL", c16930sl2, 2020L), new C8E5("SegmentAnything", "PYTORCH_MODEL", c16930sl2, 10020L)};
        }
        List A1Q2 = AbstractC16960so.A1Q(c8e5Arr);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322375213590737L);
        IgVoltronModelLoader.Companion.A00(userSession).fetchAllModules();
        if (A06) {
            A00 = null;
        } else {
            A00 = C85R.A00(context, userSession);
        }
        new C8EB(A00, userSession, A1Q, A1Q2).AV9(new C8EE(), true);
    }
}
