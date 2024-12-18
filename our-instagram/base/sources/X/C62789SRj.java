package X;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SRj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62789SRj {
    public static final Context A00(AbstractC62966SZj abstractC62966SZj) {
        Object c09540e5;
        List list = abstractC62966SZj.A03;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        AbstractC62966SZj abstractC62966SZj2 = (AbstractC62966SZj) it.next();
        if (abstractC62966SZj2 instanceof C60519R2b) {
            C60519R2b c60519R2b = (C60519R2b) abstractC62966SZj2;
            Object obj = null;
            try {
                InterfaceC65589TnT interfaceC65589TnT = c60519R2b.A01;
                if (interfaceC65589TnT != null) {
                    c09540e5 = interfaceC65589TnT.resolveView(c60519R2b.A00);
                } else {
                    c09540e5 = null;
                }
            } catch (Throwable th) {
                c09540e5 = new C09540e5(th);
            }
            if (!(c09540e5 instanceof C09540e5)) {
                obj = c09540e5;
            }
            View view = (View) obj;
            if (view == null) {
                return null;
            }
            return view.getContext();
        }
        return A00(abstractC62966SZj2);
    }
}
