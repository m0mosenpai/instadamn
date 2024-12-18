package X;

import java.util.Arrays;
import kotlin.Deprecated;

/* renamed from: X.8dI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191198dI {
    @Deprecated(message = "This method should only be used from PreCaptureButtonManager, this is necessary so\n        to avoid conflicting with the animations to show and hide pre-capture buttons.")
    public static final void A00(AnonymousClass835[] anonymousClass835Arr, boolean z) {
        A01((AnonymousClass835[]) Arrays.copyOf(anonymousClass835Arr, 1), z, false);
    }

    @Deprecated(message = "This method should only be used from PreCaptureButtonManager, this is necessary so\n        to avoid conflicting with the animations to show and hide pre-capture buttons.")
    public static final void A01(AnonymousClass835[] anonymousClass835Arr, boolean z, boolean z2) {
        C14360o3.A0B(anonymousClass835Arr, 2);
        for (AnonymousClass835 anonymousClass835 : anonymousClass835Arr) {
            if (anonymousClass835 != null) {
                anonymousClass835.EhF(z, z2);
            }
        }
    }
}
