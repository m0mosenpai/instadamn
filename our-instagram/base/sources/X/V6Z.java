package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V6Z extends AbstractRunnableC14200nk {
    public final /* synthetic */ C25531Mh A00;
    public final /* synthetic */ C449124v A01;
    public final /* synthetic */ List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6Z(C25531Mh c25531Mh, C449124v c449124v, List list) {
        super(1948240166, 3, false, false);
        this.A02 = list;
        this.A00 = c25531Mh;
        this.A01 = c449124v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A02;
        C25531Mh c25531Mh = this.A00;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC65703TsZ.A1X(A0i, it);
        }
        c25531Mh.A0S("color_space", A0i);
        ArrayList A0i2 = AbstractC167007dF.A0i(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC166997dE.A1X(A0i2, C449124v.A00((String) it2.next()));
        }
        c25531Mh.A0S("color_depth", A0i2);
        ArrayList A0i3 = AbstractC167007dF.A0i(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            AbstractC166997dE.A1X(A0i3, C449124v.A01((String) it3.next()));
        }
        c25531Mh.A0S("frame_per_second", A0i3);
        C176567tE.A00(new RunnableC71338Ws6(c25531Mh));
    }
}
