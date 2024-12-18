package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HFn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39011HFn extends C1P1 {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C147596kk A01;

    public C39011HFn(C41181vS c41181vS, C147596kk c147596kk) {
        this.A01 = c147596kk;
        this.A00 = c41181vS;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2;
        Object obj3;
        C105864px c105864px;
        int A03 = C0f9.A03(1678771359);
        H9Y h9y = (H9Y) obj;
        int A0N = AbstractC167017dG.A0N(h9y, 597369775);
        C38629GyW c38629GyW = h9y.A01;
        if (c38629GyW == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        List list = c38629GyW.A02;
        String str = null;
        if (list.size() >= 3) {
            C147596kk c147596kk = this.A01;
            View AuA = c147596kk.A06.AuA();
            if (AuA != null) {
                obj2 = AuA.getTag();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof C38080Gp9) {
                C41181vS c41181vS = this.A00;
                if (c41181vS.A1R()) {
                    C105864px c105864px2 = c41181vS.A07;
                    if (c105864px2 != null) {
                        ArrayList A0q = AbstractC167017dG.A0q(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            A0q.add(((JMD) it.next()).F2J(C1DS.A00(c147596kk.A02)));
                        }
                        c105864px2.A01 = A0q;
                    }
                    if (AuA != null) {
                        obj3 = AuA.getTag();
                    } else {
                        obj3 = null;
                    }
                    C14360o3.A0C(obj3, "null cannot be cast to non-null type com.instagram.reels.viewer.netego.NetegoReelViewerItemBinder.Holder");
                    C38080Gp9 c38080Gp9 = (C38080Gp9) obj3;
                    C6SG c6sg = c38080Gp9.A0X;
                    C41181vS c41181vS2 = c6sg.A04;
                    if (c41181vS2 != null && (c105864px = c41181vS2.A07) != null && c105864px.A02) {
                        AbstractC40782I5k.A00(c6sg);
                    }
                    AnonymousClass693 anonymousClass693 = c38080Gp9.A0Q.A07.A09;
                    if (anonymousClass693 != null) {
                        anonymousClass693.EH0(1);
                        anonymousClass693.E4S();
                    }
                }
            }
        }
        C105864px c105864px3 = this.A00.A07;
        if (c105864px3 != null) {
            if (c38629GyW.A03) {
                str = c38629GyW.A01;
            }
            c105864px3.A00 = str;
        }
        C0f9.A0A(-443846051, A0N);
        C0f9.A0A(-1084281197, A03);
    }
}
