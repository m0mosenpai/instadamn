package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.Rbi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60928Rbi extends AbstractC60592pi {
    public final int A00;
    public final Object A01;

    public C60928Rbi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        C6FQ c6fq;
        C6FQ c6fq2;
        InterfaceC103384lE interfaceC103384lE;
        Object[] A1Z;
        String message;
        char c;
        C6FQ c6fq3;
        InterfaceC103384lE interfaceC103384lE2;
        Object[] objArr;
        String message2;
        if (this.A00 != 0) {
            if (i == 1 && i2 == -1) {
                C62918SWz c62918SWz = (C62918SWz) this.A01;
                String str = c62918SWz.A01;
                C62558SGj c62558SGj = c62918SWz.A04;
                if (str != null) {
                    c = 0;
                    try {
                        C6BS c6bs = C6BS.A02;
                        message2 = C6BX.A00(AbstractC25227BEk.A0B(str)).toString();
                        if (message2 != null) {
                            c6fq3 = c62558SGj.A00;
                            interfaceC103384lE2 = c62558SGj.A02;
                            objArr = new Object[1];
                        }
                    } catch (SecurityException e) {
                        C6BQ.A0E(c62558SGj.A00, c62558SGj.A01, AbstractC58319PtB.A1Z(e));
                    }
                } else {
                    RuntimeException A18 = AbstractC166987dD.A18("Null Uri or Path");
                    c = 0;
                    c6fq3 = c62558SGj.A00;
                    interfaceC103384lE2 = c62558SGj.A01;
                    objArr = new Object[1];
                    message2 = A18.getMessage();
                }
                objArr[c] = message2;
                C6BQ.A0E(c6fq3, interfaceC103384lE2, objArr);
            }
            c6fq = ((C62918SWz) this.A01).A00;
        } else {
            if (i == 1 && i2 == -1) {
                if (intent != null && intent.getData() != null) {
                    try {
                        C54846OMr c54846OMr = new C54846OMr();
                        C62908SWp c62908SWp = (C62908SWp) this.A01;
                        Context context = c62908SWp.A02;
                        android.net.Uri data = intent.getData();
                        C14360o3.A0B(data, 1);
                        c54846OMr.A01(context, data);
                        android.net.Uri fromFile = android.net.Uri.fromFile(c54846OMr.A00());
                        if (fromFile != null && fromFile.getPath() != null) {
                            C62557SGi c62557SGi = c62908SWp.A03;
                            String A0R = AnonymousClass001.A0R("file://", fromFile.getPath());
                            C14360o3.A0B(A0R, 0);
                            try {
                                C6BS c6bs2 = C6BS.A02;
                                message = C6BX.A00(AbstractC25227BEk.A0B(A0R)).toString();
                            } catch (SecurityException e2) {
                                c6fq2 = c62557SGi.A00;
                                interfaceC103384lE = c62557SGi.A01;
                                A1Z = new Object[1];
                                message = e2.getMessage();
                            }
                            if (message != null) {
                                c6fq2 = c62557SGi.A00;
                                interfaceC103384lE = c62557SGi.A02;
                                A1Z = new Object[1];
                                A1Z[0] = message;
                            }
                        } else {
                            C62557SGi c62557SGi2 = c62908SWp.A03;
                            RuntimeException A182 = AbstractC166987dD.A18("Unable to retrieve Uri from SecureSharedFileReceiver");
                            c6fq2 = c62557SGi2.A00;
                            interfaceC103384lE = c62557SGi2.A01;
                            A1Z = AbstractC58319PtB.A1Z(A182);
                        }
                        C6BQ.A0E(c6fq2, interfaceC103384lE, A1Z);
                    } catch (SecurityException e3) {
                        C62557SGi c62557SGi3 = ((C62908SWp) this.A01).A03;
                        C6BQ.A0E(c62557SGi3.A00, c62557SGi3.A01, AbstractC58319PtB.A1Z(e3));
                    }
                } else {
                    C62557SGi c62557SGi4 = ((C62908SWp) this.A01).A03;
                    C6BQ.A0E(c62557SGi4.A00, c62557SGi4.A01, AbstractC58319PtB.A1Z(AbstractC166987dD.A18("Intent returned was either null or had null data")));
                }
            }
            c6fq = ((C62908SWp) this.A01).A00;
        }
        C6BQ.A0L(c6fq, this);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        C6FQ c6fq;
        if (this.A00 != 0) {
            c6fq = ((C62918SWz) this.A01).A00;
        } else {
            c6fq = ((C62908SWp) this.A01).A00;
        }
        C6BQ.A0L(c6fq, this);
    }
}
