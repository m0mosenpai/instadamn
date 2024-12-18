package X;

import com.instagram.creation.capture.quickcapture.ourstory.viewmodel.OurStoryPostCaptureViewModel$viewState$1;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8EQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8EQ extends AbstractC52922bZ {
    public final InterfaceC06180Ui A00;
    public final C05A A01;
    public final C05A A02;
    public final C05A A03;
    public final C0UO A04;

    public final void A00() {
        C05A c05a = this.A02;
        List list = (List) c05a.getValue();
        C05A c05a2 = this.A03;
        C05A c05a3 = this.A01;
        String str = (String) c05a3.getValue();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(((DirectShareTarget) it.next()).A0B(), A1E);
        }
        c05a2.Egh(new C206429Bz(A1E, list.size(), str));
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new C25024B5f(this, null, 14), A00);
        c05a3.Egh("");
        c05a.Egh(C16930sl.A00);
    }

    public C8EQ() {
        C008002u c008002u = new C008002u("");
        this.A01 = c008002u;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A02 = A00;
        C008002u A002 = C10E.A00(null);
        this.A03 = A002;
        C15230pd A003 = C10Q.A00(new OurStoryPostCaptureViewModel$viewState$1(null), c008002u, A00, A002);
        this.A04 = AbstractC208910l.A01(new C189438aN(null, "", c16930sl, 0, false), AbstractC141776au.A00(this), A003, C10I.A00);
        this.A00 = C10M.A00(C05F.A00, 0, 0);
    }
}
