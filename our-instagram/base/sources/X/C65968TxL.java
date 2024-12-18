package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TxL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65968TxL implements InterfaceC65626Tpm, C07W {
    public final int A00;
    public final Object A01;

    public C65968TxL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65626Tpm
    public final void onCreate(C07X c07x) {
        EnumC68125VCj valueOf;
        if (this.A00 == 0) {
            W2o w2o = (W2o) this.A01;
            Bundle bundle = w2o.A03.mArguments;
            if (bundle != null) {
                String string = bundle.getString("cds_platform");
                if (string != null && (valueOf = EnumC68125VCj.valueOf(string)) != null) {
                    w2o.A02 = valueOf;
                    C09530e4 A00 = W2o.A00(bundle, w2o, valueOf);
                    XBU xbu = (XBU) A00.A00;
                    C70300WQf c70300WQf = (C70300WQf) A00.A01;
                    w2o.A01 = xbu;
                    C0eR c0eR = c70300WQf.A00;
                    w2o.A00 = c0eR;
                    if (c0eR == null) {
                        C14360o3.A0F("lifecycle");
                        throw C00O.createAndThrow();
                    }
                    c0eR.A0C(C07S.CREATED);
                    return;
                }
                throw new IllegalStateException("Platform is missing from the bundle. Please check that 'cds_platform' field is set.");
            }
            throw new IllegalStateException("Arguments should not be null!");
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        switch (this.A00) {
            case 0:
                Iterator A16 = AbstractC166997dE.A16(((W2o) this.A01).A04);
                while (A16.hasNext()) {
                    ((C70300WQf) ((C09530e4) A16.next()).A01).A00.A0C(C07S.DESTROYED);
                }
                return;
            case 1:
                return;
            default:
                Map map = ((CTL) this.A01).A0D;
                for (C09530e4 c09530e4 : AbstractC001800i.A0Y(map.values())) {
                    ((InterfaceC16660sJ) c09530e4.A01).invoke(c09530e4.A00);
                }
                map.clear();
                return;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        switch (this.A00) {
            case 0:
                C0eR c0eR = ((W2o) this.A01).A00;
                if (c0eR == null) {
                    C14360o3.A0F("lifecycle");
                    throw C00O.createAndThrow();
                }
                c0eR.A0C(C07S.STARTED);
                return;
            case 1:
                return;
            default:
                Iterator it = AbstractC001800i.A0Y(((CTL) this.A01).A09).iterator();
                while (it.hasNext()) {
                    ((InterfaceC16820sZ) it.next()).invoke();
                }
                return;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        switch (this.A00) {
            case 0:
                C0eR c0eR = ((W2o) this.A01).A00;
                if (c0eR == null) {
                    C14360o3.A0F("lifecycle");
                    throw C00O.createAndThrow();
                }
                c0eR.A0C(C07S.RESUMED);
                return;
            case 1:
                C14360o3.A0B(c07x, 0);
                ((C51762Yz) this.A01).A01(false);
                return;
            default:
                Iterator it = ((CTL) this.A01).A0A.iterator();
                while (it.hasNext()) {
                    ((InterfaceC16820sZ) it.next()).invoke();
                }
                return;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStart(C07X c07x) {
        switch (this.A00) {
            case 0:
                Iterator A16 = AbstractC166997dE.A16(((W2o) this.A01).A04);
                while (A16.hasNext()) {
                    ((C70300WQf) ((C09530e4) A16.next()).A01).A00.A0C(C07S.STARTED);
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((CTL) this.A01).A0B.iterator();
                while (it.hasNext()) {
                    ((InterfaceC16820sZ) it.next()).invoke();
                }
                return;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStop(C07X c07x) {
        switch (this.A00) {
            case 0:
                Iterator A16 = AbstractC166997dE.A16(((W2o) this.A01).A04);
                while (A16.hasNext()) {
                    ((C70300WQf) ((C09530e4) A16.next()).A01).A00.A0C(C07S.CREATED);
                }
                return;
            case 1:
                return;
            default:
                Iterator it = AbstractC001800i.A0Y(((CTL) this.A01).A0C).iterator();
                while (it.hasNext()) {
                    ((InterfaceC16820sZ) it.next()).invoke();
                }
                return;
        }
    }
}
