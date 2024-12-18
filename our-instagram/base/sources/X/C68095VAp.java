package X;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VAp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68095VAp extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AppearanceThemeOptionsFragment";
    public final List A00 = new ArrayList();
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final String A02 = "theme_settings";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957495);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A01.getValue();
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(636374232);
        super.onCreate(bundle);
        List list = this.A00;
        list.add(C70085W2h.A04);
        list.add(C70085W2h.A06);
        list.add(C70085W2h.A05);
        C0f9.A09(1181591263, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C70085W2h c70085W2h;
        C35124FeR c35124FeR;
        int A02 = C0f9.A02(-1369524570);
        super.onResume();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<C70085W2h> list = this.A00;
        for (C70085W2h c70085W2h2 : list) {
            Integer num = c70085W2h2.A03;
            String str = c70085W2h2.A00;
            int i = c70085W2h2.A01;
            if (num != null) {
                c35124FeR = new C35124FeR(str, getString(i), getString(num.intValue()));
            } else {
                c35124FeR = new C35124FeR(str, getString(i));
            }
            arrayList2.add(c35124FeR);
        }
        int A00 = AbstractC19730y1.A00(AbstractC12960li.A00).A00();
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                c70085W2h = (C70085W2h) it.next();
                if (c70085W2h.A02 == A00) {
                    break;
                }
            } else {
                Context context = getContext();
                C14360o3.A0A(context);
                if (AbstractC72723Nt.A00(context)) {
                    c70085W2h = C70085W2h.A04;
                } else {
                    c70085W2h = C70085W2h.A06;
                }
            }
        }
        arrayList.add(new C34960Fak(new WP4(this, 2), c70085W2h.A00, arrayList2));
        setItems(arrayList);
        C0f9.A09(1050388200, A02);
    }
}
