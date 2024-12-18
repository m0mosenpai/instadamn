package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EZn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32663EZn extends AbstractRunnableC14200nk {
    public final /* synthetic */ JR2 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32663EZn(JR2 jr2, String str, boolean z) {
        super(1310328368, 2, false, false);
        this.A00 = jr2;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int min;
        List list;
        String str;
        JR2 jr2 = this.A00;
        C5e4 c5e4 = jr2.A0K;
        if (c5e4 == null) {
            C14360o3.A0F("banyanClient");
            throw C00O.createAndThrow();
        }
        C121305eT A01 = c5e4.A01(this.A01);
        boolean z = this.A02;
        String str2 = A01.A01;
        if (str2 != null) {
            AbstractC122015ft.A00(jr2.A0p()).A00(77014026, str2, AbstractC111324zv.A00(108), A01.A02.size());
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        HashSet A0D = ((C2DU) jr2.A0w()).A0C.A0D(jr2.A0u());
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = jr2.A0y.iterator();
        while (it.hasNext()) {
            String A08 = AbstractC31172DnG.A0m(it).A08();
            if (A08 != null) {
                A1H.add(A08);
            }
        }
        Iterator it2 = A01.A02.iterator();
        while (it2.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it2);
            String A082 = A0m.A08();
            if (!AbstractC001800i.A0u(A0D, A082) && !AbstractC001800i.A0u(A1H, A082)) {
                A1E.add(A0m);
            }
        }
        UserSession A0p = jr2.A0p();
        C06090Tz c06090Tz = C06090Tz.A05;
        Collection collection = A1E;
        if (AbstractC25225BEi.A07(c06090Tz, A0p, 36600852305350700L) == 2) {
            collection = AbstractC31177DnL.A0l(A1E, 5);
        }
        List A0X = AbstractC001800i.A0X(collection);
        if (C18U.A06(c06090Tz, jr2.A0p(), 36317908448843438L)) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Context context = jr2.A1L.getContext();
            if (context != null && !A0X.isEmpty()) {
                if (z) {
                    min = A0X.size();
                } else {
                    min = Math.min(A0X.size(), 3);
                }
                for (int i = 0; i < min; i++) {
                    DirectShareTarget directShareTarget = (DirectShareTarget) A0X.get(i);
                    UserSession A0p2 = jr2.A0p();
                    C14360o3.A0B(A0p2, 1);
                    C14360o3.A0B(directShareTarget, 2);
                    CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
                    if (creatorBroadcastThreadInfo == null || ((str = creatorBroadcastThreadInfo.A04) == null && (str = directShareTarget.A0A()) == null)) {
                        list = C16930sl.A00;
                    } else {
                        list = FU0.A01(context, A0p2, str, creatorBroadcastThreadInfo.A06, creatorBroadcastThreadInfo.A01, creatorBroadcastThreadInfo.A08);
                    }
                    A1E2.add(new C31459Ds3(directShareTarget, list, i, false, false, false, false, false));
                }
            }
            C43626JRj A0q = jr2.A0q();
            C14360o3.A07(A0q.A03.getString(2131959690));
            C43970JcJ c43970JcJ = A0q.A0E;
            if (!c43970JcJ.A0N.isEmpty() || !A1E2.isEmpty()) {
                c43970JcJ.A0L = A1E2;
                C43626JRj.A03(A0q);
            }
        } else {
            if (!z) {
                A0X = A0X.subList(0, Math.min(3, A0X.size()));
            }
            jr2.A0q().A0B(A0X, 0, false, true);
        }
        if (!jr2.A13) {
            C35267Fh2 A00 = F3T.A00(jr2.A0p());
            InterfaceC02590Ai A002 = C35267Fh2.A00(A00);
            if (A002.isSampled()) {
                C35267Fh2.A04(A002, A00);
                AbstractC31177DnL.A1D(A002, AbstractC111324zv.A00(796));
                AbstractC31177DnL.A1F(A002, "channel_suggestion_item");
                A002.AAP("ranking_request_id", str2);
                A002.Cht();
            }
            AbstractC122015ft.A00(jr2.A0p()).A00.markerStart(77017147);
            if (str2 != null) {
                AbstractC122015ft.A00(jr2.A0p()).A00(77017147, str2, AbstractC111324zv.A00(108), A0X.size());
            }
            jr2.A13 = true;
        }
    }
}
