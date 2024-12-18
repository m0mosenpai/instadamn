package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: X.Ede, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32897Ede extends VKF {
    public final /* synthetic */ C36684GFe A00;
    public final /* synthetic */ String A01;

    @Override // X.VKF
    public final void A03() {
    }

    public C32897Ede(C36684GFe c36684GFe, String str) {
        this.A00 = c36684GFe;
        this.A01 = str;
    }

    @Override // X.VKF
    public final void A00() {
        C36684GFe c36684GFe = this.A00;
        C36303Fzy c36303Fzy = c36684GFe.A0R;
        c36303Fzy.A0C("thumbs_down");
        String str = this.A01;
        Pattern pattern = AbstractC13670mt.A01;
        c36303Fzy.A0B(C05F.A0B, 7, str.length());
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("bot_response_id", c36684GFe.A07);
        C66237U5h c66237U5h = new C66237U5h(new GRS(this, 2));
        HashMap A1G2 = AbstractC166987dD.A1G();
        A1G2.put(AbstractC43591JPw.A00(185), c66237U5h);
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A03 = U6H.A09;
        c35205Ffx.A02 = U6G.A05;
        C65981Txa A03 = c35205Ffx.A03();
        C66277U6x A02 = C66277U6x.A02(AbstractC43591JPw.A00(853), A1G, A1G2);
        Context context = c36684GFe.A0M;
        IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(c36684GFe.A0Q).A00;
        igBloksScreenConfig.A0C = A03;
        A02.A06(context, igBloksScreenConfig);
    }

    @Override // X.VKF
    public final void A01() {
        C36684GFe c36684GFe = this.A00;
        C36303Fzy c36303Fzy = c36684GFe.A0R;
        c36303Fzy.A0C("thumbs_up");
        String str = this.A01;
        Pattern pattern = AbstractC13670mt.A01;
        c36303Fzy.A0B(C05F.A0B, 6, str.length());
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("bot_response_id", c36684GFe.A07);
        C66237U5h c66237U5h = new C66237U5h(new GRS(this, 3));
        C62862tP A00 = C62862tP.A00(new SparseArray(), c36684GFe.A0N, c36684GFe.A0O, c36684GFe.A0Q, null);
        C69618VsL c69618VsL = new C69618VsL(AbstractC43591JPw.A00(854));
        c69618VsL.A04 = A1G;
        c69618VsL.A01 = c66237U5h;
        c69618VsL.A00(c36684GFe.A0M, A00);
    }
}
