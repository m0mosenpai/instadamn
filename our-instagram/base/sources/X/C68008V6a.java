package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V6a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68008V6a extends AbstractRunnableC14200nk {
    public final /* synthetic */ C449124v A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ C15370ps A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68008V6a(C449124v c449124v, List list, C15370ps c15370ps) {
        super(1948240166, 3, false, false);
        this.A01 = list;
        this.A02 = c15370ps;
        this.A00 = c449124v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A01;
        if (list != null) {
            AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) this.A02.A00;
            ArrayList A0i = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC65703TsZ.A1X(A0i, it);
            }
            abstractC02600Aj.A0S("color_space", A0i);
            ArrayList A0i2 = AbstractC167007dF.A0i(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC166997dE.A1X(A0i2, C449124v.A00((String) it2.next()));
            }
            abstractC02600Aj.A0S("color_depth", A0i2);
            ArrayList A0i3 = AbstractC167007dF.A0i(list);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                AbstractC166997dE.A1X(A0i3, C449124v.A01((String) it3.next()));
            }
            abstractC02600Aj.A0S("frame_per_second", A0i3);
        }
        C176567tE.A00(new RunnableC71339Ws7(this.A02));
    }
}
