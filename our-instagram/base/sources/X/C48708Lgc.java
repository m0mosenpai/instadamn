package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.Lgc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48708Lgc implements InterfaceC50458MPm {
    public final /* synthetic */ L4U A00;

    public C48708Lgc(L4U l4u) {
        this.A00 = l4u;
    }

    @Override // X.InterfaceC50458MPm
    public final void Dp8(View view, DirectStoreSticker directStoreSticker) {
        C48733Lh1 c48733Lh1 = this.A00.A03;
        if (c48733Lh1.A0X) {
            UserSession userSession = c48733Lh1.A0G;
            if (C18U.A06(C06090Tz.A05, userSession, 36329612233753011L)) {
                AbstractC46756KmD.A00(view, userSession, AbstractC166987dD.A1J(new WjK(new C45105JxZ(new JWd(directStoreSticker, ""), 3), new C29266CvN(c48733Lh1, 2), LJL.A03(userSession, directStoreSticker.A04))));
            }
        }
    }

    @Override // X.InterfaceC50458MPm
    public final void DpA(C45058Jwn c45058Jwn, DirectStoreSticker directStoreSticker) {
        C47933LFf c47933LFf = this.A00.A03.A0J.A00.A00;
        if (c47933LFf != null) {
            C47326Kvb c47326Kvb = c47933LFf.A00.A07;
            c47326Kvb.getClass();
            KCW kcw = c47326Kvb.A00;
            MRR mrr = kcw.A02;
            if (mrr != null) {
                String str = kcw.A05;
                if (str == null) {
                    C14360o3.A0F("bottomSheetSessionId");
                    throw C00O.createAndThrow();
                }
                mrr.Dp9(c45058Jwn, directStoreSticker, str);
            }
        }
    }
}
