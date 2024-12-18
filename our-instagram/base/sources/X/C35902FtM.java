package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.archive.fragment.InlineAddHighlightFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FtM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35902FtM implements InterfaceC58138Pq3 {
    public ImageUrl A00;
    public final int A01;
    public final int A02;
    public final UserSession A03;
    public final String A04;
    public final boolean A05;

    @Override // X.InterfaceC58138Pq3
    public final ImageUrl AsN(Context context) {
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            return AbstractC50558MTp.A02(context, this.A03, this.A04, this.A05);
        }
        return imageUrl;
    }

    @Override // X.InterfaceC58138Pq3
    public final void D8F(InlineAddHighlightFragment inlineAddHighlightFragment, C1GL c1gl, String str) {
        C188538Ws A00 = AbstractC35082Fct.A00(str, EnumC53243Ngg.A06.A00, this.A02, this.A01);
        UserSession userSession = this.A03;
        C35126FeT A002 = C35126FeT.A00(userSession);
        synchronized (A002) {
            A002.A05.add(A00.A01);
            if (A002.A01 == null) {
                A002.A03.add(A00);
            } else {
                C35126FeT.A02(A002, A00);
            }
        }
        AbstractC188518Wq.A00(userSession).A00 = A00;
        AbstractC31181DnP.A0Y(inlineAddHighlightFragment);
    }

    @Override // X.InterfaceC58138Pq3
    public final void DPo(C155306yJ c155306yJ, List list) {
        UserSession userSession = this.A03;
        c155306yJ.EcN(list, false, userSession);
        Iterator A13 = AbstractC31174DnI.A13(C35126FeT.A00(userSession).A04);
        while (A13.hasNext()) {
            c155306yJ.A08(AbstractC166987dD.A1B(A13));
        }
    }

    @Override // X.InterfaceC58138Pq3
    public final void Ddp(Fragment fragment, C1GL c1gl, String str, boolean z) {
        UserSession userSession = this.A03;
        Reel A0M = C1OU.A04(userSession).A0M(str);
        A0M.getClass();
        C188538Ws A01 = AbstractC35082Fct.A01(str, A0M.A0r, EnumC53243Ngg.A06.A00, !z);
        C35126FeT A00 = C35126FeT.A00(userSession);
        Context requireContext = fragment.requireContext();
        synchronized (A00) {
            boolean z2 = A01.A04;
            if (z2) {
                A00.A04.add(A01.A00);
                A00.A05.add(A01.A01);
            } else {
                A00.A04.remove(A01.A00);
                A00.A05.remove(A01.A01);
            }
            if (A00.A01 == null) {
                if (z2) {
                    A00.A02.add(A01);
                } else {
                    A00.A02.remove(A01);
                }
            } else {
                C35126FeT.A01(requireContext, A00, A01);
            }
        }
        AbstractC188518Wq.A00(userSession).A00 = A01;
        AbstractC31181DnP.A0Y(fragment);
    }

    public C35902FtM(Context context, UserSession userSession, String str, int i, int i2, boolean z) {
        this.A03 = userSession;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = str;
        this.A05 = z;
        if (!C18U.A06(C06090Tz.A05, userSession, 36323367350971585L)) {
            this.A00 = AbstractC50558MTp.A02(context, userSession, str, z);
        }
    }
}
