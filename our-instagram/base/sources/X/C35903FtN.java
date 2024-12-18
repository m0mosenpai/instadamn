package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.FtN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35903FtN implements InterfaceC58138Pq3 {
    public ImageUrl A00;
    public final int A01;
    public final int A02;
    public final UserSession A03;
    public final Reel A04;
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC58138Pq3
    public final ImageUrl AsN(Context context) {
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            return AbstractC50558MTp.A02(context, this.A03, this.A05, this.A06);
        }
        return imageUrl;
    }

    @Override // X.InterfaceC58138Pq3
    public final void D8F(InlineAddHighlightFragment inlineAddHighlightFragment, C1GL c1gl, String str) {
        AbstractC188518Wq.A00(this.A03).A00 = AbstractC35082Fct.A00(str, EnumC53243Ngg.A05.A00, this.A02, this.A01);
        AbstractC31181DnP.A0Y(inlineAddHighlightFragment);
    }

    @Override // X.InterfaceC58138Pq3
    public final void DPo(C155306yJ c155306yJ, List list) {
        Reel reel = this.A04;
        list.add(0, reel);
        c155306yJ.EcN(list, false, this.A03);
        c155306yJ.A08(reel.getId());
    }

    @Override // X.InterfaceC58138Pq3
    public final void Ddp(Fragment fragment, C1GL c1gl, String str, boolean z) {
        if (!str.equals(this.A04.getId())) {
            String str2 = EnumC53243Ngg.A05.A00;
            C14360o3.A0B(str2, 1);
            AbstractC188518Wq.A00(this.A03).A00 = AbstractC35082Fct.A01(str, null, str2, true);
            AbstractC31181DnP.A0Y(fragment);
        }
    }

    public C35903FtN(Context context, UserSession userSession, String str, int i, int i2, boolean z) {
        this.A03 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
        this.A06 = z;
        if (!C18U.A06(C06090Tz.A05, userSession, 36323367350971585L)) {
            this.A00 = AbstractC50558MTp.A02(context, userSession, str, z);
        }
        C1OU c1ou = C1OU.$redex_init_class;
        C14360o3.A0B(userSession, 0);
        Reel reel = C1Ns.A00(userSession).A00;
        C14360o3.A0A(reel);
        this.A04 = reel;
    }
}
