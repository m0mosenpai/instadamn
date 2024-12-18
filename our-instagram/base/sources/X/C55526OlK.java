package X;

import android.widget.RadioGroup;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OlK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55526OlK implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ C51757Mtg A00;
    public final /* synthetic */ C52775NXg A01;
    public final /* synthetic */ List A02;

    public C55526OlK(C51757Mtg c51757Mtg, C52775NXg c52775NXg, List list) {
        this.A00 = c51757Mtg;
        this.A02 = list;
        this.A01 = c52775NXg;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        Object obj;
        OI0 oi0;
        C51757Mtg c51757Mtg = this.A00;
        List list = (List) c51757Mtg.A00;
        List list2 = this.A02;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((BJF) obj).A01, ((C35124FeR) list2.get(i)).A02)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BJF bjf = (BJF) obj;
        if (bjf != null && (oi0 = this.A01.A00) != null) {
            oi0.A00(c51757Mtg, bjf, true);
        }
    }
}
