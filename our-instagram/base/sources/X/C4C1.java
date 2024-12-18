package X;

import com.google.common.collect.RegularImmutableMap;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4C1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4C1 implements InterfaceC92354Bq {
    public int A00;
    public C4C7 A01;
    public final ArrayList A02 = new ArrayList(1);
    public final boolean A03;

    public final void A02() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A04(C4C7 c4c7) {
        this.A01 = c4c7;
        for (int i = 0; i < this.A00; i++) {
            ((C2BC) this.A02.get(i)).DvH(this, c4c7, this.A03, false);
        }
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    public final void A01() {
        C4C7 c4c7 = this.A01;
        for (int i = 0; i < this.A00; i++) {
            ((C2BC) this.A02.get(i)).Dv9(this, c4c7, this.A03);
        }
        this.A01 = null;
    }

    public final void A03(int i) {
        C4C7 c4c7 = this.A01;
        for (int i2 = 0; i2 < this.A00; i2++) {
            ((C2BC) this.A02.get(i2)).D15(this, c4c7, i, this.A03);
        }
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        if (this instanceof C4CB) {
            HttpURLConnection httpURLConnection = ((C4CB) this).A03;
            if (httpURLConnection == null) {
                return RegularImmutableMap.A02;
            }
            return new C60759RQm(httpURLConnection.getHeaderFields());
        }
        return Collections.emptyMap();
    }

    public C4C1(boolean z) {
        this.A03 = z;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        c2bc.getClass();
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(c2bc)) {
            arrayList.add(c2bc);
            this.A00++;
        }
    }
}
