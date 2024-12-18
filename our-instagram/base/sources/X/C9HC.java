package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9HC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9HC extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6PU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9HC(C6PU c6pu, String str, String str2, long j) {
        super(0);
        this.A03 = str;
        this.A01 = c6pu;
        this.A02 = str2;
        this.A00 = j;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Map map = C6PU.A04;
        String str = this.A03;
        Number number = (Number) map.get(str);
        C6PU c6pu = this.A01;
        int hashCode = c6pu.A00.hashCode();
        int A00 = C139446Sz.A00(str, 51511298, hashCode);
        if (number == null || A00 < number.intValue()) {
            String str2 = this.A02;
            if (str2 == null) {
                C139446Sz.A02(c6pu.A01, str, TimeUnit.NANOSECONDS, 51511298, hashCode, this.A00);
            } else {
                C139446Sz.A01(c6pu.A01, str, str2, TimeUnit.NANOSECONDS, 51511298, hashCode, this.A00);
            }
        }
        return C0eB.A00;
    }
}
