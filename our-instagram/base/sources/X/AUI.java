package X;

import com.google.common.collect.ImmutableList;

/* loaded from: classes4.dex */
public final class AUI implements InterfaceC58362lv {
    public final /* synthetic */ C22833A5c A00;

    public AUI(C22833A5c c22833A5c) {
        this.A00 = c22833A5c;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AbstractC193598he abstractC193598he = (AbstractC193598he) obj;
        C14360o3.A0B(abstractC193598he, 0);
        int i = abstractC193598he.A00;
        if (i != 3) {
            if (i == 4) {
                this.A00.A00.A1o.A01();
                return;
            }
            return;
        }
        C22833A5c c22833A5c = this.A00;
        C195868lW c195868lW = (C195868lW) abstractC193598he.A00();
        C14360o3.A0B(c195868lW, 0);
        int i2 = c195868lW.A07;
        C115525Km A01 = AbstractC23036ADs.A01(c195868lW, c195868lW.A06(), 54, i2, 0, i2, i2);
        C8JT c8jt = c22833A5c.A00;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        int A00 = c8jt.A1k.A00();
        if (i2 > A00) {
            i2 = A00;
        }
        C8JT.A0K(of, null, c8jt, A01, C05F.A01, A01.A0H, 0, i2, false);
    }
}
