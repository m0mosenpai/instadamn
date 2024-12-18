package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Collections;
import org.apache.http.client.HttpResponseException;

/* renamed from: X.OsQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55934OsQ implements InterfaceC26491Qe {
    public C3JQ A00;
    public ByteArrayOutputStream A01 = new ByteArrayOutputStream();
    public boolean A02;
    public final C53680NoV A03;
    public final WeakReference A04;
    public final AbstractC53638Nnj A05;

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        C14360o3.A0B(iOException, 0);
        C0K8.A0F("IgHttpRequestCallback", "onFailed()", iOException);
        OVd oVd = (OVd) this.A04.get();
        if (oVd != null) {
            C53680NoV c53680NoV = this.A03;
            C14360o3.A0B(c53680NoV, 0);
            oVd.A01.remove(c53680NoV);
        }
        this.A05.A01(iOException, AbstractC06930Yk.A0E(), 0, true);
    }

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        if (!this.A02) {
            try {
                AbstractC50522MSa.A1X(this.A01, byteBuffer);
            } catch (Exception e) {
                this.A02 = true;
                C0K8.A05(OVd.class, "Exception while writing response stream", e);
            }
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        C14360o3.A0B(c3jq, 0);
        this.A00 = c3jq;
        Collections.unmodifiableList(c3jq.A03);
        this.A01 = new ByteArrayOutputStream();
        this.A02 = false;
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        String A19 = AbstractC166987dD.A19(this.A01);
        C3JQ c3jq = this.A00;
        if (c3jq != null && !c3jq.A01()) {
            int i = c3jq.A01;
            boolean z = false;
            if (400 <= i && i < 500) {
                z = true;
            }
            this.A05.A01(new HttpResponseException(i, AbstractC13670mt.A06("status code: %s\n%s", Integer.valueOf(i), A19)), AbstractC06930Yk.A0E(), i, !z);
        } else if (!this.A02) {
            this.A05.A02(A19, 0, AbstractC06930Yk.A0E());
        } else {
            this.A05.A01(AbstractC166987dD.A18("Response stream not initialized correctly"), AbstractC06930Yk.A0E(), 0, true);
        }
        OVd oVd = (OVd) this.A04.get();
        if (oVd != null) {
            C53680NoV c53680NoV = this.A03;
            C14360o3.A0B(c53680NoV, 0);
            oVd.A01.remove(c53680NoV);
        }
    }

    public C55934OsQ(C53680NoV c53680NoV, AbstractC53638Nnj abstractC53638Nnj, WeakReference weakReference) {
        this.A05 = abstractC53638Nnj;
        this.A03 = c53680NoV;
        this.A04 = weakReference;
    }
}
