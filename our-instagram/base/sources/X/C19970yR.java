package X;

import com.facebook.soloader.SoLoaderULError;

/* renamed from: X.0yR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19970yR implements InterfaceC09320dh {
    @Override // X.InterfaceC09320dh
    public final boolean ECg(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC09180dS[] abstractC09180dSArr) {
        if (unsatisfiedLinkError instanceof SoLoaderULError) {
            android.util.Log.e("SoLoader", "Checking /data/data missing libraries.");
            boolean z = false;
            for (AbstractC09180dS abstractC09180dS : abstractC09180dSArr) {
                if ((abstractC09180dS instanceof AbstractC07480aN) && !(abstractC09180dS instanceof C0QD)) {
                    AbstractC07480aN abstractC07480aN = (AbstractC07480aN) abstractC09180dS;
                    try {
                        C09240dZ[] A0C = abstractC07480aN.A0C();
                        int length = A0C.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                C09240dZ c09240dZ = A0C[i];
                                if (abstractC07480aN.A09(c09240dZ.A01) == null) {
                                    android.util.Log.e("SoLoader", AnonymousClass001.A11("Missing ", c09240dZ.A01, " from ", abstractC07480aN.A06(), ", will force prepare."));
                                    abstractC07480aN.A08(2);
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                        }
                    } catch (Exception e) {
                        android.util.Log.e("SoLoader", "Encountered an exception while recovering from /data/data failure ", e);
                        return false;
                    }
                }
            }
            if (z) {
                android.util.Log.e("SoLoader", "Successfully recovered from /data/data disk failure.");
                return true;
            }
            android.util.Log.e("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        }
        return false;
    }
}
