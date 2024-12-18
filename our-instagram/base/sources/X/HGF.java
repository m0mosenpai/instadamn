package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class HGF extends C1P1 {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final java.util.Set A03;
    public final /* synthetic */ HDJ A04;

    public HGF(HDJ hdj, Integer num, String str, java.util.Set set, int i) {
        this.A04 = hdj;
        this.A01 = num;
        this.A02 = str;
        this.A00 = i;
        this.A03 = set;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        String str;
        Integer num;
        int A03 = C0f9.A03(141385059);
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            if (intValue != 2 && intValue != 3) {
                if (intValue != 0) {
                    i = -1;
                    str = "";
                } else {
                    i = 2131969609;
                    str = "photos_and_videos_of_you_fail_to_add";
                }
            } else {
                i = 2131969611;
                str = "photos_and_videos_of_you_fail_to_remove";
            }
        } else {
            i = 2131969610;
            str = "photos_and_videos_of_you_fail_to_hide";
        }
        C9GR.A01(AbstractC12290kX.A00, str, i, 0);
        HDJ hdj = this.A04;
        ILN iln = hdj.A05;
        EnumC33341Eoa enumC33341Eoa = hdj.A06;
        ArrayList A1F = AbstractC166987dD.A1F(this.A03);
        C14360o3.A0B(enumC33341Eoa, 0);
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        num = C05F.A0u;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    num = C05F.A0N;
                }
            } else {
                num = C05F.A1F;
            }
        } else {
            num = C05F.A02;
        }
        iln.A00(enumC33341Eoa, num, "", A1F);
        C0f9.A0A(-1359440924, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1449513146);
        new Handler().post(new Runnable() { // from class: X.J3I
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC63248Sg4.A01(HGF.this.A04.getChildFragmentManager());
            }
        });
        C0f9.A0A(984749435, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(197696950);
        int A032 = C0f9.A03(686867131);
        HDJ hdj = this.A04;
        HEI hei = hdj.A04;
        java.util.Set set = hei.A0G;
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            if (A1B != null && hei.A07.A0E(A1B)) {
                z = true;
            }
        }
        set.clear();
        if (z) {
            C0fA.A00(hei, -585529423);
        }
        if (this.A01 == C05F.A0N) {
            HEI hei2 = hdj.A04;
            hei2.A07.A04();
            C0fA.A00(hei2, -1812157705);
        }
        new Handler().post(new Runnable() { // from class: X.J3H
            @Override // java.lang.Runnable
            public final void run() {
                Integer num;
                HGF hgf = HGF.this;
                HDJ hdj2 = hgf.A04;
                AbstractC63248Sg4.A01(hdj2.getChildFragmentManager());
                AbstractC25651Mw.A00(hdj2.A03).E4s(new C154966xl(hgf.A02));
                hdj2.A00.A0T();
                ILN iln = hdj2.A05;
                EnumC33341Eoa enumC33341Eoa = hdj2.A06;
                Integer num2 = hgf.A01;
                ArrayList A1F = AbstractC166987dD.A1F(hgf.A03);
                boolean A1R = AbstractC167007dF.A1R(0, enumC33341Eoa, num2);
                int intValue = num2.intValue();
                if (intValue != 0) {
                    if (intValue != A1R) {
                        if (intValue != 2) {
                            if (intValue == 3) {
                                num = C05F.A0Y;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            num = C05F.A0N;
                        }
                    } else {
                        num = C05F.A15;
                    }
                } else {
                    num = C05F.A1I;
                }
                iln.A00(enumC33341Eoa, num, "", A1F);
                Context context = hdj2.getContext();
                if (context != null && num2 == C05F.A0C) {
                    C37091o7.A00().Cor(context, hdj2.A01, hdj2.A03, EnumC39589Hdz.A0O, hgf.A00);
                }
            }
        });
        C0f9.A0A(634627172, A032);
        C0f9.A0A(-998255021, A03);
    }
}
