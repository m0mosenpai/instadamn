package X;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;

/* renamed from: X.649, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass649 implements C64A, C64B {
    public IAccountAccessor A00 = null;
    public java.util.Set A01 = null;
    public boolean A02 = false;
    public final InterfaceC1340663q A03;
    public final C61c A04;
    public final /* synthetic */ C1335961f A05;

    public AnonymousClass649(InterfaceC1340663q interfaceC1340663q, C61c c61c, C1335961f c1335961f) {
        this.A05 = c1335961f;
        this.A03 = interfaceC1340663q;
        this.A04 = c61c;
    }

    @Override // X.C64A
    public final void Dff(final ConnectionResult connectionResult) {
        this.A05.A06.post(new Runnable() { // from class: X.5rq
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Set emptySet;
                IAccountAccessor iAccountAccessor;
                AnonymousClass649 anonymousClass649 = this;
                C69C c69c = (C69C) anonymousClass649.A05.A09.get(anonymousClass649.A04);
                if (c69c != null) {
                    ConnectionResult connectionResult2 = connectionResult;
                    boolean z = false;
                    if (connectionResult2.A01 == 0) {
                        z = true;
                    }
                    if (z) {
                        anonymousClass649.A02 = true;
                        InterfaceC1340663q interfaceC1340663q = anonymousClass649.A03;
                        if (interfaceC1340663q.requiresSignIn()) {
                            if (anonymousClass649.A02 && (iAccountAccessor = anonymousClass649.A00) != null) {
                                interfaceC1340663q.BmV(iAccountAccessor, anonymousClass649.A01);
                                return;
                            }
                            return;
                        }
                        try {
                            AbstractC1340563o abstractC1340563o = (AbstractC1340563o) interfaceC1340663q;
                            if (abstractC1340563o.requiresSignIn()) {
                                emptySet = abstractC1340563o.A01;
                            } else {
                                emptySet = Collections.emptySet();
                            }
                            interfaceC1340663q.BmV(null, emptySet);
                            return;
                        } catch (SecurityException e) {
                            android.util.Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                            interfaceC1340663q.APc("Failed to get service from broker.");
                            c69c.A0C(new ConnectionResult(10), null);
                            return;
                        }
                    }
                    c69c.A0C(connectionResult2, null);
                }
            }
        });
    }

    @Override // X.C64B
    public final void FF6(ConnectionResult connectionResult) {
        C69C c69c = (C69C) this.A05.A09.get(this.A04);
        if (c69c != null) {
            c69c.A0B(connectionResult);
        }
    }
}
