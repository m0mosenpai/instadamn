package X;

/* loaded from: classes4.dex */
public final class AUA implements InterfaceC58362lv {
    public final /* synthetic */ AnonymousClass882 A00;

    public AUA(AnonymousClass882 anonymousClass882) {
        this.A00 = anonymousClass882;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C88X A01;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            AnonymousClass882 anonymousClass882 = this.A00;
            boolean booleanValue = bool.booleanValue();
            if (!anonymousClass882.A0W.A03) {
                AnonymousClass882.A05(anonymousClass882);
                C195328kY c195328kY = anonymousClass882.A0A;
                if (c195328kY != null) {
                    c195328kY.A02 = !booleanValue;
                    if (!booleanValue) {
                        c195328kY.setCurrentTitle(C174587ps.A07);
                        return;
                    }
                    C88M c88m = anonymousClass882.A08;
                    String str = null;
                    if (c88m == null || c88m.A01() == null) {
                        return;
                    }
                    C88M c88m2 = anonymousClass882.A08;
                    if (c88m2 != null && (A01 = c88m2.A01()) != null) {
                        str = A01.A0G;
                    }
                    anonymousClass882.ESj(str);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
    }
}
