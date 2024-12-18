package X;

import java.io.File;

/* renamed from: X.0yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19910yL implements InterfaceC09320dh {
    @Override // X.InterfaceC09320dh
    public final boolean ECg(UnsatisfiedLinkError unsatisfiedLinkError, AbstractC09180dS[] abstractC09180dSArr) {
        for (AbstractC09180dS abstractC09180dS : abstractC09180dSArr) {
            if (abstractC09180dS instanceof AbstractC07480aN) {
                C006402e c006402e = (C006402e) abstractC09180dS;
                android.util.Log.e("SoLoader", AnonymousClass001.A0R("Waiting on SoSource ", abstractC09180dS.A06()));
                File file = c006402e.A01;
                try {
                    AbstractC09200dV.A00(file, new File(file, "dso_lock")).close();
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Encountered exception during wait for unpacking trying to acquire file lock for ");
                    sb.append(c006402e.getClass().getName());
                    sb.append(" (");
                    sb.append(file);
                    sb.append("): ");
                    android.util.Log.e("fb-UnpackingSoSource", sb.toString(), e);
                }
            }
        }
        return true;
    }
}
