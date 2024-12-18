package X;

/* loaded from: classes8.dex */
public final class KPM extends AbstractC2056898s {
    public final void A0C(EnumC46164Kc2 enumC46164Kc2) {
        String str;
        int A05 = AbstractC25227BEk.A05(enumC46164Kc2, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    if (A05 != 3) {
                        str = "MEX_EB_LOW_DISK_SPACE_BANNER_TAP_CTA";
                    } else {
                        str = "MEX_EB_UPSELL_BANNER_TAP_CTA";
                    }
                } else {
                    str = "WARN_BANNER_TAP_CTA";
                }
            } else {
                str = "SELL_BANNER_TAP_CTA";
            }
        } else {
            str = "INTRODUCE_BANNER_TAP_CTA";
        }
        A05(str);
        A02();
    }

    public final void A0D(EnumC46164Kc2 enumC46164Kc2) {
        String str;
        int A05 = AbstractC25227BEk.A05(enumC46164Kc2, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    if (A05 != 3) {
                        str = "MEX_EB_LOW_DISK_SPACE_BANNER_TAP_DISMISS";
                    } else {
                        str = "MEX_EB_UPSELL_BANNER_TAP_DISMISS";
                    }
                } else {
                    str = "WARN_BANNER_TAP_DISMISS";
                }
            } else {
                str = "SELL_BANNER_TAP_DISMISS";
            }
        } else {
            str = "INTRODUCE_BANNER_TAP_DISMISS";
        }
        A05(str);
        A01();
    }

    @Override // X.AbstractC2056898s
    public final int A0B() {
        return 724777237;
    }
}
