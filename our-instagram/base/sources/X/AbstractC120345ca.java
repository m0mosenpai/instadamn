package X;

import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.IOException;

/* renamed from: X.5ca, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120345ca {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling] */
    public static ARCapabilityMinVersionModeling parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("capability_name".equals(A0q)) {
                    obj.mCapability = VersionedCapability.fromServerValue(c16l.A1Q());
                } else if ("min_version".equals(A0q)) {
                    obj.mMinVersion = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        VersionedCapability versionedCapability = aRCapabilityMinVersionModeling.mCapability;
        if (versionedCapability != null) {
            anonymousClass182.A0S("capability_name", versionedCapability.toServerValue());
        }
        anonymousClass182.A0Q("min_version", aRCapabilityMinVersionModeling.mMinVersion);
        anonymousClass182.A0a();
    }
}
