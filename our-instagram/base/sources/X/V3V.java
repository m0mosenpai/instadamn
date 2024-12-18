package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class V3V extends C1P1 {
    public final C69386VmW A00;

    public V3V(C69386VmW c69386VmW) {
        this.A00 = c69386VmW;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        float f;
        float f2;
        float f3;
        int A03 = C0f9.A03(847180942);
        C74293Vk c74293Vk = (C74293Vk) obj;
        int A0N = AbstractC167017dG.A0N(c74293Vk, -922333614);
        super.onSuccess(c74293Vk);
        C69386VmW c69386VmW = this.A00;
        List list = c74293Vk.A06;
        String str = c74293Vk.A04;
        C69727VuM c69727VuM = c69386VmW.A03;
        c69727VuM.A08 = list;
        c69727VuM.A04 = str;
        C66483UJj c66483UJj = c69386VmW.A04;
        C66362zD c66362zD = c69386VmW.A01;
        UP8 up8 = c69727VuM.A00().A00;
        if (up8 != null) {
            f = up8.A00;
        } else {
            f = 1.0f;
        }
        UP8 up82 = c69727VuM.A00().A00;
        if (up82 != null) {
            f2 = up82.A01;
        } else {
            f2 = 0.75f;
        }
        UP8 up83 = c69727VuM.A00().A00;
        if (up83 != null) {
            f3 = up83.A02;
        } else {
            f3 = 1.0f;
        }
        C66160U2b.A02(c66362zD, c69727VuM, c66483UJj, f, f2, f3);
        C0f9.A0A(-1371941424, A0N);
        C0f9.A0A(481107037, A03);
    }
}
