package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LOF implements View.OnClickListener {
    public final /* synthetic */ VBH A00;

    public LOF(VBH vbh) {
        this.A00 = vbh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        InterfaceC83733oI interfaceC83733oI;
        int A05 = C0f9.A05(2004600674);
        C47298Kv9 c47298Kv9 = this.A00.A01;
        if (c47298Kv9 != null) {
            C159437De c159437De = c47298Kv9.A00;
            InterfaceC16820sZ interfaceC16820sZ = c159437De.A0L;
            User user = (User) AbstractC001800i.A0J(((C7TT) interfaceC16820sZ.invoke()).A0b);
            if (user != null) {
                c159437De.A0D.A01(user.getId(), false);
                InterfaceC09390do interfaceC09390do = c159437De.A0H;
                C05A c05a = ((C7UD) interfaceC09390do.getValue()).A05;
                C9BR c9br = (C9BR) c05a.getValue();
                Integer num = C05F.A0N;
                boolean z = c9br.A02;
                C14360o3.A0B(num, 0);
                c05a.Egh(new C9BR(num, 1, z));
                Resources resources = ((Context) c159437De.A0I.invoke()).getResources();
                C146106i8 A0K = AbstractC31171DnF.A0K();
                AbstractC31172DnG.A1H(resources, A0K, 2131952567);
                A0K.A0G = AbstractC166997dE.A0q(resources, 2131976066);
                A0K.A0A(new C49490Lu3(c159437De, 3));
                A0K.A0L = true;
                AbstractC25233BEq.A1F(A0K);
                C7F3 c7f3 = c159437De.A09;
                String A00 = ((C7UD) interfaceC09390do.getValue()).A00();
                C7TT c7tt = (C7TT) interfaceC16820sZ.invoke();
                if (c7tt != null && (interfaceC83733oI = c7tt.A0P) != null) {
                    str = AbstractC1345466e.A07(interfaceC83733oI);
                } else {
                    str = null;
                }
                c7f3.A0D(A00, str, false);
            }
        }
        C0f9.A0C(1907827694, A05);
    }
}
