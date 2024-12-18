package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class FRH {
    public final int A00;
    public final ImageUrl A01;
    public final InterfaceC83733oI A02;
    public final String A03;
    public final String A04;
    public final /* synthetic */ C7MJ A05;

    public FRH(ImageUrl imageUrl, C7MJ c7mj, InterfaceC83733oI interfaceC83733oI, String str, String str2, int i) {
        this.A05 = c7mj;
        this.A02 = interfaceC83733oI;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A00 = i;
    }

    public final void A00() {
        java.util.Set<C7ZH> set = this.A05.A03;
        if (AbstractC31171DnF.A1b(set)) {
            for (C7ZH c7zh : set) {
                if (c7zh != null) {
                    c7zh.Cvv(this.A00);
                }
            }
        }
    }

    public final void A01(String str, String str2) {
        C7MJ c7mj = this.A05;
        java.util.Set<C7ZH> set = c7mj.A03;
        boolean z = false;
        if (AbstractC31171DnF.A1b(set)) {
            for (C7ZH c7zh : set) {
                if (c7zh != null) {
                    int i = this.A00;
                    c7zh.Cvu(i, str, str2);
                    if (!z) {
                        if (c7zh.EkL(this.A02, this.A04, i)) {
                            z = true;
                        }
                    }
                }
            }
            if (z) {
                return;
            }
        }
        InterfaceC83733oI interfaceC83733oI = this.A02;
        if (interfaceC83733oI instanceof C83693oE) {
            Context context = c7mj.A00;
            UserSession userSession = c7mj.A02;
            String A0c = AbstractC31171DnF.A0c(interfaceC83733oI);
            String A00 = C7MK.A00(context, userSession, this.A04, this.A03, this.A00);
            ImageUrl imageUrl = this.A01;
            C14360o3.A0B(context, 0);
            AbstractC167027dH.A13(userSession, A0c, A00);
            C14120nc.A00().ATO(new C32671EZv(context, userSession, null, A00, A0c, null, AbstractC166987dD.A1J(imageUrl), null));
        }
    }
}
