package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class N23 extends VK4 {
    public float A00;
    public boolean A01;
    public final /* synthetic */ C55076OaW A02;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // X.VK4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.View r11, int r12) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N23.A02(android.view.View, int):void");
    }

    public N23(C55076OaW c55076OaW) {
        this.A02 = c55076OaW;
    }

    @Override // X.VK4
    public final void A01(View view, float f) {
        String str;
        String str2;
        String str3;
        C55076OaW c55076OaW = this.A02;
        if (c55076OaW.A09 != EnumC53149Nf4.A05) {
            float f2 = this.A00;
            boolean z = true;
            if (f < f2 && f2 < -0.3f) {
                C142846ck A0d = AbstractC31172DnG.A0d(c55076OaW.A0I);
                OFY ofy = c55076OaW.A0A;
                Integer num = null;
                if (ofy != null) {
                    str = ofy.A06.C7I();
                } else {
                    str = null;
                }
                OFY ofy2 = c55076OaW.A0A;
                if (ofy2 != null) {
                    str2 = ofy2.A06.C7q();
                } else {
                    str2 = null;
                }
                OFY ofy3 = c55076OaW.A0A;
                if (ofy3 != null) {
                    num = Integer.valueOf(ofy3.A06.AdZ());
                }
                C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, A0d);
                    AbstractC31174DnI.A1I(A0I, "member_participation_hub_active_participation_hidden");
                    A0I.A0o("member_participation_hub");
                    A0I.A0p("thread_view");
                    if (num != null && num.intValue() == 2) {
                        str3 = AbstractC111324zv.A00(535);
                    } else {
                        str3 = "broadcast";
                    }
                    A0I.A0n(str3);
                    A0I.A0r(str);
                    A0I.A0h(AbstractC25233BEq.A0n(str2));
                    A0I.Cht();
                }
                C55076OaW.A01(c55076OaW, EnumC53149Nf4.A03);
            }
            if (f <= this.A00) {
                z = false;
            }
            this.A01 = z;
            this.A00 = f;
        }
    }
}
