package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7Kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161227Kh {
    public final Context A00;
    public final Map A01 = new LinkedHashMap();
    public final CopyOnWriteArraySet A02 = new CopyOnWriteArraySet();

    public static final C51756Mtf A00(C51757Mtg c51757Mtg, C161227Kh c161227Kh) {
        C51756Mtf c51756Mtf;
        Map map = c161227Kh.A01;
        synchronized (map) {
            c51756Mtf = null;
            if (A01(c51757Mtg, c161227Kh)) {
                List<EnumC46207Kcj> list = (List) c51757Mtg.A00;
                ArrayList arrayList = new ArrayList();
                for (EnumC46207Kcj enumC46207Kcj : list) {
                    AbstractC56582ir abstractC56582ir = (AbstractC56582ir) map.get(Integer.valueOf(enumC46207Kcj.A00));
                    if (abstractC56582ir != null) {
                        arrayList.add(new C09530e4(enumC46207Kcj, new AnonymousClass693(abstractC56582ir)));
                    }
                }
                c51756Mtf = new C51756Mtf(AbstractC06930Yk.A08(arrayList), 12);
            }
        }
        return c51756Mtf;
    }

    public static final boolean A01(C51757Mtg c51757Mtg, C161227Kh c161227Kh) {
        List list = (List) c51757Mtg.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!c161227Kh.A01.containsKey(Integer.valueOf(((EnumC46207Kcj) it.next()).A00))) {
                    return false;
                }
            }
        }
        return true;
    }

    public C161227Kh(Context context) {
        this.A00 = context;
    }

    public final void A02(InterfaceC16660sJ interfaceC16660sJ, EnumC46207Kcj[] enumC46207KcjArr) {
        C51757Mtg c51757Mtg = new C51757Mtg(interfaceC16660sJ, AbstractC009903n.A0J(enumC46207KcjArr));
        C51756Mtf A00 = A00(c51757Mtg, this);
        if (A00 != null) {
            ((InterfaceC16660sJ) c51757Mtg.A01).invoke(A00);
            return;
        }
        this.A02.add(c51757Mtg);
        for (EnumC46207Kcj enumC46207Kcj : (List) c51757Mtg.A00) {
            Drawable drawable = this.A00.getDrawable(enumC46207Kcj.A00);
            C14360o3.A0C(drawable, "null cannot be cast to non-null type com.facebook.keyframes.network.KeyframesNetworkDrawableBase<*, *, *>");
            AbstractC58662mP abstractC58662mP = (AbstractC58662mP) drawable;
            C69547VrB c69547VrB = new C69547VrB(this, enumC46207Kcj);
            if (abstractC58662mP.A00 != null) {
                if (((C58752mY) ((AbstractC58672mQ) abstractC58662mP).A00).A00() != null) {
                    c69547VrB.A00(((C58752mY) ((AbstractC58672mQ) abstractC58662mP).A00).A00());
                }
            } else {
                abstractC58662mP.A02.add(c69547VrB);
                abstractC58662mP.A02();
            }
        }
    }
}
