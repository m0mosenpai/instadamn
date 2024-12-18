package com.google.android.gms.common.api.internal;

import X.AbstractC62396S9v;
import X.AnonymousClass649;
import X.C0f9;
import X.C1340363l;
import X.C61U;
import X.C64B;
import X.C69C;
import X.C69E;
import X.C69G;
import X.InterfaceC65661Tqr;
import X.TOY;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zact extends zac implements C69E, C69G {
    public static final C61U A07 = AbstractC62396S9v.A00;
    public C64B A00;
    public InterfaceC65661Tqr A01;
    public final Context A02;
    public final Handler A03;
    public final C61U A04;
    public final C1340363l A05;
    public final Set A06;

    public zact(Context context, Handler handler, C1340363l c1340363l) {
        C61U c61u = A07;
        int A03 = C0f9.A03(-184067704);
        this.A02 = context;
        this.A03 = handler;
        this.A05 = c1340363l;
        this.A06 = c1340363l.A05;
        this.A04 = c61u;
        C0f9.A0A(385056328, A03);
    }

    @Override // X.C69F
    public final void D75(Bundle bundle) {
        int A03 = C0f9.A03(1516191761);
        this.A01.FF3(this);
        C0f9.A0A(395332081, A03);
    }

    @Override // X.C69H
    public final void D7D(ConnectionResult connectionResult) {
        int A03 = C0f9.A03(1024919413);
        this.A00.FF6(connectionResult);
        C0f9.A0A(1631099790, A03);
    }

    @Override // X.C69F
    public final void D7H(int i) {
        int A03 = C0f9.A03(1807558776);
        AnonymousClass649 anonymousClass649 = (AnonymousClass649) this.A00;
        C69C c69c = (C69C) anonymousClass649.A05.A09.get(anonymousClass649.A04);
        if (c69c != null) {
            if (c69c.A02) {
                c69c.A0B(new ConnectionResult(17));
            } else {
                c69c.D7H(i);
            }
        }
        C0f9.A0A(1839042446, A03);
    }

    @Override // com.google.android.gms.signin.internal.zae
    public final void FF0(zak zakVar) {
        int A03 = C0f9.A03(1139740329);
        this.A03.post(new TOY(this, zakVar));
        C0f9.A0A(111042279, A03);
    }
}
