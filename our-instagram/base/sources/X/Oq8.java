package X;

import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class Oq8 implements InterfaceC65424Tjv {
    public final /* synthetic */ C55036OZi A00;
    public final /* synthetic */ O5R A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public Oq8(C55036OZi c55036OZi, O5R o5r, String str, List list) {
        this.A00 = c55036OZi;
        this.A03 = list;
        this.A01 = o5r;
        this.A02 = str;
    }

    @Override // X.InterfaceC65424Tjv
    public final void onFailure(Exception e) {
        O5R o5r;
        EnumC53331NiB enumC53331NiB;
        List list;
        String str;
        C14360o3.A0B(e, 0);
        C55036OZi c55036OZi = this.A00;
        OMi oMi = c55036OZi.A04;
        oMi.A05(null);
        OZV ozv = c55036OZi.A02;
        if (e instanceof N21) {
            java.util.Set set = ozv.A00;
            int i = ((Rk3) e).A00.A00;
            if (set.contains(Integer.valueOf(i))) {
                try {
                    OTD otd = c55036OZi.A00;
                    int i2 = otd.A00;
                    int i3 = otd.A01;
                    if (i2 < i3) {
                        int i4 = i2;
                        if (i2 > i3) {
                            i4 = i3;
                        }
                        int pow = (int) (250.0d * Math.pow(2.0d, i4));
                        otd.A00 = i2 + 1;
                        EnumC53331NiB A00 = EnumC53331NiB.A00(i);
                        List list2 = this.A03;
                        list2.add(A00);
                        c55036OZi.A06.schedule(new PT7(c55036OZi, this.A01, this.A02, list2), pow, TimeUnit.MILLISECONDS);
                        return;
                    }
                    throw AbstractC166987dD.A14("Max retries reached");
                } catch (IllegalStateException e2) {
                    e = e2;
                    oMi.A00();
                    o5r = this.A01;
                    enumC53331NiB = EnumC53331NiB.A0X;
                    list = this.A03;
                    str = "Token retrieval failed after too many retries";
                } catch (RejectedExecutionException e3) {
                    e = e3;
                    oMi.A00();
                    o5r = this.A01;
                    enumC53331NiB = EnumC53331NiB.A0V;
                    list = this.A03;
                    str = "Unable to schedule retry for token retrieval";
                }
            }
        }
        oMi.A00();
        o5r = this.A01;
        enumC53331NiB = EnumC53331NiB.A0W;
        list = this.A03;
        str = "Retry not allowed";
        RuntimeException runtimeException = new RuntimeException(str, e);
        AbstractC001800i.A0S(AbstractC166987dD.A1J(enumC53331NiB), list);
        o5r.A00.setException(runtimeException);
    }
}
