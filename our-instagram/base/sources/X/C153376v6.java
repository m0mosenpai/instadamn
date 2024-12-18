package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6v6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153376v6 implements InterfaceC152866uG, InterfaceC152886uI {
    public final C57112jm A00;
    public final C63622uj A01;
    public final List A02;
    public final List A03;

    @Override // X.InterfaceC152866uG
    public final void AAn(C38321qM c38321qM, int i) {
        C14360o3.A0B(c38321qM, 0);
        Integer valueOf = Integer.valueOf(i);
        String id = c38321qM.getId();
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(c38321qM, valueOf, id);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            c59072n8.A00((InterfaceC43071ya) it.next());
        }
        C63622uj c63622uj = this.A01;
        String id2 = c38321qM.getId();
        if (id2 != null) {
            c63622uj.A01(c59072n8.A01(), id2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC152886uI
    public final void AAo(Reel reel, int i) {
        C14360o3.A0B(reel, 0);
        Integer valueOf = Integer.valueOf(i);
        String id = reel.getId();
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(reel, valueOf, id);
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            c59072n8.A00((InterfaceC43071ya) it.next());
        }
        C63622uj c63622uj = this.A01;
        String id2 = reel.getId();
        C14360o3.A07(id2);
        c63622uj.A01(c59072n8.A01(), id2);
    }

    @Override // X.InterfaceC152866uG
    public final void EDr(View view, C38321qM c38321qM) {
        C63622uj c63622uj = this.A01;
        String id = c38321qM.getId();
        if (id != null) {
            this.A00.A05(view, c63622uj.A00(id));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC152886uI
    public final void EDs(View view, Reel reel) {
        C63622uj c63622uj = this.A01;
        String id = reel.getId();
        C14360o3.A07(id);
        this.A00.A05(view, c63622uj.A00(id));
    }

    public C153376v6(C57112jm c57112jm, C63622uj c63622uj, List list, List list2) {
        this.A00 = c57112jm;
        this.A01 = c63622uj;
        this.A02 = list;
        this.A03 = list2;
    }
}
