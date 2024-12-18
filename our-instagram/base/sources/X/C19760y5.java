package X;

import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0y5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19760y5 {
    public static final /* synthetic */ void A00(C19760y5 c19760y5) {
        synchronized (c19760y5) {
            if (!InstagramApplicationForMainProcess.instanceAlreadyCreated) {
                InstagramApplicationForMainProcess.instanceAlreadyCreated = true;
            } else {
                throw new IllegalStateException("Multiple instances of the Application object were created.");
            }
        }
    }
}
