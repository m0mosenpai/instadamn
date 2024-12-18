package X;

import org.apache.http.client.HttpResponseException;

/* renamed from: X.Vr6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69542Vr6 {
    public int A00;
    public final W2H A01;

    public C69542Vr6(W2H w2h) {
        C14360o3.A0B(w2h, 1);
        this.A01 = w2h;
    }

    public final void A00(Exception exc) {
        if ((exc instanceof HttpResponseException) && ((HttpResponseException) exc).getStatusCode() == 418) {
            this.A00++;
        }
    }
}
