package X;

import java.util.concurrent.Callable;

/* renamed from: X.DwG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC31711DwG implements Callable {
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        AbstractC27461Uz abstractC27461Uz = AbstractC27461Uz.getInstance();
        if (abstractC27461Uz != null) {
            return abstractC27461Uz;
        }
        throw AbstractC166987dD.A14("Unable to initialize SmartLockPlugin!");
    }
}
