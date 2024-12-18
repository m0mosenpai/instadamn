package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes11.dex */
public final class WMg implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C123545iT A01;
    public final /* synthetic */ C54O A02;
    public final /* synthetic */ C47K A03;

    public WMg(C123545iT c123545iT, C54O c54o, C47K c47k, int i) {
        this.A02 = c54o;
        this.A01 = c123545iT;
        this.A03 = c47k;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List list;
        AbstractC70663Fe abstractC70663Fe;
        int A05 = C0f9.A05(238715956);
        C54O c54o = this.A02;
        C47R C3q = c54o.C3q();
        C123545iT c123545iT = this.A01;
        RecyclerView recyclerView = c123545iT.A00;
        int i = 0;
        if (recyclerView != null && (abstractC70663Fe = recyclerView.A0D) != null && (abstractC70663Fe instanceof LinearLayoutManager)) {
            i = ((LinearLayoutManager) abstractC70663Fe).A1a();
        }
        InterfaceC63682up interfaceC63682up = c123545iT.A0D;
        C47K c47k = this.A03;
        C1XV B5n = c47k.B5n();
        String str = c47k.A0D;
        String str2 = c47k.A0E;
        if (C3q == C47R.A06) {
            list = c54o.A00.A05;
            if (list == null) {
                list = C16930sl.A00;
            }
        } else {
            list = null;
        }
        interfaceC63682up.Dqn(B5n, C3q, Integer.valueOf(i), str, str2, c47k.getId(), list);
        int i2 = this.A00;
        int ordinal = c54o.C3q().ordinal();
        if (ordinal != 6) {
            if (ordinal == 2) {
                C147036jf c147036jf = c123545iT.A01;
                if (c147036jf == null) {
                    c147036jf = new C147036jf(c123545iT.A0B, c123545iT.A0C);
                    c123545iT.A01 = c147036jf;
                }
                c147036jf.A02(AbstractC166997dE.A0a(), Integer.valueOf(i2), C123545iT.A00(c123545iT), null);
            }
        } else {
            C69225Vjt c69225Vjt = c123545iT.A02;
            if (c69225Vjt == null) {
                c69225Vjt = new C69225Vjt(c123545iT.A0B, c123545iT.A0C);
                c123545iT.A02 = c69225Vjt;
            }
            String A00 = C123545iT.A00(c123545iT);
            Integer valueOf = Integer.valueOf(i2);
            C18920wW c18920wW = c69225Vjt.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "discover_people_upsell_clicked");
            A002.AAP("module", c69225Vjt.A01);
            A002.AAP(AbstractC111324zv.A00(1367), A00);
            A002.A8p("position", valueOf);
            A002.Cht();
        }
        C0f9.A0C(-1427881262, A05);
    }
}
