package X;

import com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker", f = "PlayIntegrityAttestationWorker.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {72, 80}, m = "doWork", n = {"this", "event", "attestPreferences", "errorCodes", "numRetries", "useSharedImpl", "this", "event", "attestPreferences", "errorCodes", "numRetries", "useSharedImpl"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0"})
/* loaded from: classes4.dex */
public final class B57 extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ PlayIntegrityAttestationWorker A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B57(PlayIntegrityAttestationWorker playIntegrityAttestationWorker, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = playIntegrityAttestationWorker;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A08.A03(this);
    }
}
