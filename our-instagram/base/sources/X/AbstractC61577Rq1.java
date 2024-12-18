package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rq1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61577Rq1 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.56I] */
    public final void A00(List list) {
        if (this instanceof ShortcutInfoCompatSaverImpl) {
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this;
            ArrayList A0q = AbstractC25230BEn.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(new C72081XMz((C72080XMy) it.next()).A00());
            }
            shortcutInfoCompatSaverImpl.A05.submit(new RunnableC58496PwO(new Object(), shortcutInfoCompatSaverImpl, A0q));
        }
    }
}
