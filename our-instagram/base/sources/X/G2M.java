package X;

import android.view.View;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes6.dex */
public final class G2M implements InterfaceC37168GZf {
    public final /* synthetic */ C32372ENy A00;

    @Override // X.InterfaceC37168GZf
    public final void DTL(DirectMessageSearchThread directMessageSearchThread, int i, int i2, int i3, int i4) {
    }

    public G2M(C32372ENy c32372ENy) {
        this.A00 = c32372ENy;
    }

    @Override // X.InterfaceC37168GZf
    public final void DTF(DirectMessageSearchMessage directMessageSearchMessage, int i, int i2, int i3, int i4) {
        InterfaceC83713oG A0N;
        C32372ENy c32372ENy = this.A00;
        if (!c32372ENy.A0A.equals("open") && c32372ENy.A0G) {
            A0N = new MsysThreadId(EnumC92794Ds.A04, c32372ENy.A07, Long.parseLong(c32372ENy.A0B));
        } else {
            A0N = AbstractC31171DnF.A0N(c32372ENy.A0B);
        }
        AbstractC31181DnP.A0M(c32372ENy.requireActivity(), c32372ENy, c32372ENy.getSession(), directMessageSearchMessage, A0N);
        if (c32372ENy.A05.A02 != null) {
            C36303Fzy A00 = C36303Fzy.A00(c32372ENy.getSession());
            A00.A0A(directMessageSearchMessage, c32372ENy.A09, 25, i, i2);
            A00.A09(directMessageSearchMessage);
        }
        c32372ENy.A05.A04(c32372ENy.A09, c32372ENy.A0C, "message_list", directMessageSearchMessage.A02);
    }

    @Override // X.InterfaceC37168GZf
    public final void Dh4(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        if (directSearchResult instanceof DirectMessageSearchMessage) {
            C32372ENy c32372ENy = this.A00;
            DirectMessageSearchMessage directMessageSearchMessage = (DirectMessageSearchMessage) directSearchResult;
            if (view != null && c32372ENy.A03 != null) {
                C59072n8 A00 = C59062n7.A00(directMessageSearchMessage, null, directMessageSearchMessage.A07);
                A00.A00(new G0Z(c32372ENy.A0M));
                c32372ENy.A03.A05(view, A00.A01());
            }
        }
    }
}
