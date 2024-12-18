package X;

/* renamed from: X.PRo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57023PRo implements Runnable {
    public final /* synthetic */ C53021Nct A00;
    public final /* synthetic */ Integer A01;

    public RunnableC57023PRo(C53021Nct c53021Nct, Integer num) {
        this.A00 = c53021Nct;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        String str;
        PJC pjc = this.A00.A0E;
        if (pjc != null) {
            Integer num2 = this.A01;
            EnumC53324Ni1 enumC53324Ni1 = pjc.A05;
            if (enumC53324Ni1 != EnumC53324Ni1.A09 && !enumC53324Ni1.A01()) {
                N3J n3j = pjc.A04;
                if (n3j != null && n3j.A0K) {
                    C55085Oah c55085Oah = pjc.A0U;
                    int intValue = num2.intValue();
                    if (intValue != 1) {
                        if (intValue != 4) {
                            if (intValue != 2) {
                                num = C05F.A00;
                            } else {
                                num = C05F.A0Y;
                            }
                        } else {
                            num = C05F.A0N;
                        }
                    } else {
                        num = C05F.A01;
                    }
                    C14360o3.A0B(num, 0);
                    if (c55085Oah.A06 != null && c55085Oah.A00 < 0) {
                        c55085Oah.A01 = C05F.A0u;
                        c55085Oah.A00 = System.currentTimeMillis();
                        C19260xA c19260xA = new C19260xA();
                        switch (num.intValue()) {
                            case 0:
                                str = "unknown";
                                break;
                            case 1:
                                str = "backgrounding";
                                break;
                            case 2:
                                str = "about_to_finish";
                                break;
                            case 3:
                                str = "lost_connection";
                                break;
                            default:
                                str = "live_swap";
                                break;
                        }
                        C19260xA.A00(c19260xA, str, "reason");
                        C55085Oah.A00(c19260xA, c55085Oah, "INTERRUPT", "WARNING", "BROADCASTER");
                    }
                }
                C56806PIx c56806PIx = pjc.A08;
                if (c56806PIx != null) {
                    c56806PIx.A0F.A00();
                }
                OLC A02 = pjc.A0W.A02();
                A02.A0U.Egh(EnumC53165NfK.A02);
            }
        }
    }
}
