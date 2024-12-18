package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.HFc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39000HFc extends C1P1 {
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-2069831270);
        HAA haa = (HAA) obj;
        int A0N = AbstractC167017dG.A0N(haa, -1386086090);
        IF8 if8 = haa.A00;
        if (if8 != null && !AbstractC39679HjB.A00) {
            AbstractC39679HjB.A00 = true;
            C14270nr.A00().A01(new HJJ(if8), TimeUnit.SECONDS.toMillis(if8.A00));
        }
        C0f9.A0A(-1692881786, A0N);
        C0f9.A0A(-300441289, A03);
    }
}
