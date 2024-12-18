package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: X.OsN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55931OsN implements InterfaceC26491Qe {
    public String A00;
    public C3JQ A01;
    public final ByteArrayOutputStream A02 = new ByteArrayOutputStream();
    public final /* synthetic */ OJH A03;

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        AbstractC50522MSa.A1X(this.A02, byteBuffer);
    }

    public C55931OsN(OJH ojh) {
        this.A03 = ojh;
    }

    @Override // X.InterfaceC26491Qe
    public final void onComplete() {
        C3JQ c3jq = this.A01;
        if (c3jq != null && c3jq.A01 == 200) {
            JWd parseFromJson = AbstractC53898NsU.parseFromJson(C16V.A00(this.A02.toString()));
            Iterator A1J = AbstractC25226BEj.A1J(parseFromJson.A00);
            while (A1J.hasNext() && !AbstractC25228BEl.A1X(((C25547BRj) A1J.next()).A01)) {
            }
            System.currentTimeMillis();
            InterfaceC58032PoI interfaceC58032PoI = this.A03.A00;
            if (interfaceC58032PoI != null) {
                String str = this.A00;
                C14360o3.A0A(str);
                interfaceC58032PoI.Dv7(parseFromJson, str);
                return;
            }
            return;
        }
        System.currentTimeMillis();
        InterfaceC58032PoI interfaceC58032PoI2 = this.A03.A00;
        if (interfaceC58032PoI2 == null) {
            return;
        }
        interfaceC58032PoI2.Dv6();
    }

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        System.currentTimeMillis();
        InterfaceC58032PoI interfaceC58032PoI = this.A03.A00;
        if (interfaceC58032PoI != null) {
            interfaceC58032PoI.Dv6();
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        this.A01 = c3jq;
    }
}
