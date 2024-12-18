package X;

import android.os.Bundle;

/* renamed from: X.Put, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58415Put {
    public final int A00;
    public final int A01;
    public final Bundle A02;
    public final C58411Pup A03 = new C58411Pup();

    public static void A00(Object obj, Object obj2) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(obj);
            String valueOf2 = String.valueOf(obj2);
            String.valueOf(valueOf);
            String.valueOf(valueOf2);
        }
    }

    public final String toString() {
        boolean z;
        int i = this.A00;
        int i2 = this.A01;
        if (this instanceof RVS) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder A0q = AbstractC58318PtA.A0q(55);
        A0q.append("Request { what=");
        A0q.append(i);
        A0q.append(" id=");
        A0q.append(i2);
        A0q.append(" oneWay=");
        return AbstractC50523MSb.A0X(A0q, z);
    }

    public AbstractC58415Put(Bundle bundle, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = bundle;
    }
}
