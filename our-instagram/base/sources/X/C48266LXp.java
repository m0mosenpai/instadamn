package X;

import java.io.InputStream;

/* renamed from: X.LXp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48266LXp implements InterfaceC23761Ei {
    public int A00;
    public final int A01;
    public final C006802i A02;
    public final InterfaceC23761Ei A03;
    public final String A04;

    @Override // X.InterfaceC23761Ei
    public final InterfaceC40801un AWy(C3JY c3jy, InputStream inputStream) {
        C14360o3.A0B(inputStream, 1);
        try {
            C006802i c006802i = this.A02;
            int i = this.A01;
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("chunk");
            A1C.append('_');
            A1C.append(this.A00);
            c006802i.markerPoint(1001455617, i, AbstractC166997dE.A0x("_start", A1C));
            InterfaceC40801un AWy = this.A03.AWy(c3jy, inputStream);
            StringBuilder A11 = AbstractC166997dE.A11("chunk");
            A11.append('_');
            A11.append(this.A00);
            c006802i.markerPoint(1001455617, i, AbstractC166997dE.A0x("_end", A11));
            this.A00++;
            return AWy;
        } catch (Exception e) {
            this.A02.markerEnd(1001455617, this.A01, (short) 3);
            throw e;
        }
    }

    @Override // X.InterfaceC23761Ei
    public final void onFinish() {
        this.A03.onFinish();
        this.A02.markerEnd(1001455617, this.A01, (short) 2);
    }

    @Override // X.InterfaceC23761Ei
    public final void onStart() {
        this.A02.markerStart(1001455617, this.A01, "event", this.A04);
        this.A03.onStart();
    }

    public C48266LXp(C006802i c006802i, InterfaceC23761Ei interfaceC23761Ei, String str) {
        this.A03 = interfaceC23761Ei;
        this.A02 = c006802i;
        this.A04 = str;
        this.A01 = str.hashCode();
    }
}
