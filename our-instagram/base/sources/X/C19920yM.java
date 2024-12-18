package X;

import com.facebook.soloader.SoLoaderDSONotFoundError;
import com.facebook.soloader.SoLoaderULError;

/* renamed from: X.0yM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19920yM implements InterfaceC09320dh {
    @Override // X.InterfaceC09320dh
    public final boolean ECg(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC09180dS[] abstractC09180dSArr) {
        String A0R;
        if (!(unsatisfiedLinkError instanceof SoLoaderULError) || (unsatisfiedLinkError instanceof SoLoaderDSONotFoundError)) {
            return false;
        }
        String str = ((SoLoaderULError) unsatisfiedLinkError).mSoName;
        StringBuilder sb = new StringBuilder();
        sb.append("Reunpacking NonApk UnpackingSoSources due to ");
        sb.append(unsatisfiedLinkError);
        if (str == null) {
            A0R = "";
        } else {
            A0R = AnonymousClass001.A0R(", retrying for specific library ", str);
        }
        sb.append(A0R);
        android.util.Log.e("SoLoader", sb.toString());
        for (AbstractC09180dS abstractC09180dS : abstractC09180dSArr) {
            if ((abstractC09180dS instanceof AbstractC07480aN) && !(abstractC09180dS instanceof C0QD)) {
                try {
                    android.util.Log.e("SoLoader", AnonymousClass001.A0R("Runpacking ", abstractC09180dS.A06()));
                    abstractC09180dS.A08(2);
                } catch (Exception e) {
                    android.util.Log.e("SoLoader", AnonymousClass001.A11("Encountered an exception while reunpacking ", abstractC09180dS.A06(), " for library ", str, ": "), e);
                    return false;
                }
            }
        }
        return true;
    }
}
