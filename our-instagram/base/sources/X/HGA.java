package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HGA extends C1P1 {
    public final /* synthetic */ C41227IMs A00;

    public HGA(C41227IMs c41227IMs) {
        this.A00 = c41227IMs;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Integer num;
        int i;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1296033102);
        Throwable A01 = abstractC115105If.A01();
        String str = null;
        if (A01 != null && (A01 instanceof C53093Ne6)) {
            this.A00.A00(Integer.valueOf(((C53093Ne6) A01).A00), null);
            i = 417837650;
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
            i = -861251599;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1180496628);
        C41227IMs c41227IMs = this.A00;
        c41227IMs.A03.A2V = true;
        C41588Iab.A00(c41227IMs.A01, null, "start", null);
        C0f9.A0A(1437726218, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-85929351);
        C38848H8w c38848H8w = (C38848H8w) obj;
        int A032 = C0f9.A03(-1708247630);
        C14360o3.A0B(c38848H8w, 0);
        JIU jiu = c38848H8w.A00;
        if (jiu == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        C38689H2a c38689H2a = (C38689H2a) jiu;
        List list = c38689H2a.A00;
        if (list != null) {
            this.A00.A01(Integer.valueOf(c38848H8w.mStatusCode), list, 0, c38689H2a.A01);
        }
        C0f9.A0A(1669279948, A032);
        C0f9.A0A(1769724423, A03);
    }
}
