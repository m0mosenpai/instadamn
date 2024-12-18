package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class KL4 extends AbstractC146246iN {
    public int A00;
    public InterfaceC83713oG A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Activity A06;
    public final InterfaceC11380iw A07;
    public final UserSession A08;
    public final C57112jm A09;
    public final C41123IIo A0A;
    public final C7E8 A0B;
    public final InterfaceC165337aM A0C;
    public final List A0D;
    public final InterfaceC08830cm A0E;
    public final InterfaceC08830cm A0F;
    public final InterfaceC08830cm A0G;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public /* synthetic */ KL4(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C41123IIo c41123IIo, InterfaceC165337aM interfaceC165337aM, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        C7E8 c7e8 = new C7E8(userSession);
        this.A06 = activity;
        this.A08 = userSession;
        this.A07 = interfaceC11380iw;
        this.A0A = c41123IIo;
        this.A09 = c57112jm;
        this.A0G = interfaceC08830cm;
        this.A0E = interfaceC08830cm2;
        this.A0F = interfaceC08830cm3;
        this.A0C = interfaceC165337aM;
        this.A0B = c7e8;
        this.A0D = AbstractC166987dD.A1E();
        this.A02 = "";
        this.A04 = true;
    }

    public final void A00(List list, boolean z) {
        List list2 = this.A0D;
        list2.clear();
        list2.addAll(list);
        if (z) {
            CtM();
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A0D.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A0D.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Long A0j;
        String str = ((C158797Aq) this.A0D.get(i)).A0S;
        if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
            return A0j.longValue();
        }
        return r1.get(i).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (X.C14360o3.A0K(r8.getId(), r31.A02) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (r0 == false) goto L9;
     */
    @Override // X.AbstractC146246iN, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r32, android.view.View r33, android.view.ViewGroup r34) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KL4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
