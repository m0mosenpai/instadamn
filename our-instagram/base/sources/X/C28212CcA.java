package X;

import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.CcA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28212CcA {
    public final MediaCommentListRepository A00;
    public final UserSession A01;
    public final Map A02;
    public final boolean A03;

    public C28212CcA(MediaCommentListRepository mediaCommentListRepository, UserSession userSession, String str, boolean z) {
        C14360o3.A0B(str, 4);
        this.A00 = mediaCommentListRepository;
        this.A01 = userSession;
        this.A03 = z;
        this.A02 = AbstractC166987dD.A1I();
    }

    public final void A01(C166007bS c166007bS, C19L c19l, C05A c05a) {
        int A06 = AbstractC167007dF.A06(0, c05a, c166007bS);
        MediaCommentListRepository mediaCommentListRepository = this.A00;
        C166137bh A0s = AbstractC25228BEl.A0s(mediaCommentListRepository);
        C14360o3.A0B(A0s, 0);
        ArrayList A0A = AbstractC166327c1.A0A(A0s, DMP.A00);
        C51760Mtj A00 = AbstractC166327c1.A00(A0A);
        if (((java.util.Set) A00.A01).isEmpty() && ((java.util.Set) A00.A02).isEmpty()) {
            return;
        }
        java.util.Set set = (java.util.Set) A00.A01;
        List A0a = AbstractC001800i.A0a(set);
        boolean z = this.A03;
        String A002 = MSV.A00(1118);
        c166007bS.A0B("comments_bulk_delete_tapped", A0a.size());
        if (z) {
            C166007bS.A02(c166007bS, A002, null, A0a);
        }
        Integer num = C05F.A01;
        MC7 mc7 = new MC7(A00, c05a, this, null, 21);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A02.put(A00, AbstractC23641Du.A03(num, anonymousClass191, mc7, c19l));
        c05a.Egh(new C166907d4(A00, A0A.size()));
        mediaCommentListRepository.A0S(set, (java.util.Set) A00.A02);
        AbstractC23641Du.A05(anonymousClass191, new MC8(c05a, this, A00, null, 30), c19l);
        if ((A0A instanceof Collection) && A0A.isEmpty()) {
            return;
        }
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            if (AbstractC25225BEi.A1a(((C167297di) it.next()).A0C.getId(), this.A01.userId)) {
                c05a.Egh(new C206339Bq("260308124595846", A06));
                return;
            }
        }
    }

    public static final void A00(C51760Mtj c51760Mtj, C28212CcA c28212CcA, InterfaceC16600sD interfaceC16600sD) {
        c28212CcA.A00.A0T((java.util.Set) c51760Mtj.A01, (java.util.Set) c51760Mtj.A02, DAW.A00, interfaceC16600sD);
    }
}
