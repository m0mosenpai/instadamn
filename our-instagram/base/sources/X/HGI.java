package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HGI extends C1P1 {
    public final /* synthetic */ C41227IMs A00;

    public HGI(C41227IMs c41227IMs) {
        this.A00 = c41227IMs;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Integer num;
        int i;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -15797692);
        Throwable A01 = abstractC115105If.A01();
        String str = null;
        if (A01 != null && (A01 instanceof C53093Ne6)) {
            this.A00.A00(Integer.valueOf(((C53093Ne6) A01).A00), null);
            i = 814795202;
        } else {
            C41227IMs c41227IMs = this.A00;
            C40791um c40791um = (C40791um) abstractC115105If.A00();
            if (c40791um != null) {
                num = Integer.valueOf(c40791um.mStatusCode);
            } else {
                num = null;
            }
            if (A01 != null) {
                str = A01.getMessage();
            }
            c41227IMs.A00(num, str);
            i = -1115635530;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(-2045704220, C0f9.A03(-2089375046));
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(114387864);
        C41227IMs c41227IMs = this.A00;
        c41227IMs.A03.A2V = true;
        C41588Iab.A00(c41227IMs.A01, null, "start", null);
        C0f9.A0A(-1474073592, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1620716888);
        H9M h9m = (H9M) obj;
        int A0N = AbstractC167017dG.A0N(h9m, -1593770559);
        JIT jit = h9m.A00;
        if (jit == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        H2Y h2y = (H2Y) jit;
        List list = h2y.A01;
        if (list != null) {
            this.A00.A01(Integer.valueOf(h9m.mStatusCode), list, AbstractC167017dG.A0K(h2y.A00), h2y.A02);
        }
        C0f9.A0A(-251310547, A0N);
        C0f9.A0A(819873240, A03);
    }
}
