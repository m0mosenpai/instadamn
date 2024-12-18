package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.303, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass303 implements AnonymousClass304 {
    public int A00;
    public int A01;
    public AnonymousClass302 A02;
    public final Map A06 = new HashMap();
    public final NavigableMap A08 = new TreeMap();
    public final AnonymousClass305 A04 = new AnonymousClass305(this);
    public final List A05 = new ArrayList();
    public final Map A07 = new HashMap();
    public boolean A03 = true;

    public final int A00(int i) {
        int i2 = this.A01;
        if (i >= i2) {
            C0w9.A03("BinderGroupCombinator", AnonymousClass001.A0p("position: ", ", mViewModelSize: ", ", mRowSpecs: ", i, i2, this.A05.size()));
        }
        List list = this.A05;
        return ((Number) this.A06.get(((C3GA) list.get(i)).A01)).intValue() + ((C3GA) list.get(i)).A00;
    }

    public final View A01(int i, View view, ViewGroup viewGroup) {
        List list = this.A05;
        C3GA c3ga = (C3GA) list.get(i);
        View view2 = c3ga.A01.getView(c3ga.A00, view, viewGroup, c3ga.A02, c3ga.A03);
        if (view2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("View is null for BinderGroup: ");
            sb.append(c3ga.A01.getClass().getSimpleName());
            sb.append(", with ViewType: ");
            sb.append(c3ga.A00);
            sb.append(", position: ");
            sb.append(i);
            sb.append(", mViewModelSize: ");
            sb.append(this.A01);
            sb.append(", mRowSpecs: ");
            sb.append(list.size());
            C0w9.A04("BinderGroupCombinator null view", sb.toString(), 1);
        }
        return view2;
    }

    public final String A02(int i) {
        InterfaceC65642y0 interfaceC65642y0 = (InterfaceC65642y0) this.A08.floorEntry(Integer.valueOf(i)).getValue();
        return interfaceC65642y0.getViewTypeName(i - ((Number) this.A06.get(interfaceC65642y0)).intValue());
    }

    public final void A03(InterfaceC65642y0 interfaceC65642y0, Object obj, Object obj2) {
        if (this.A06.get(interfaceC65642y0) != null) {
            AnonymousClass305 anonymousClass305 = this.A04;
            anonymousClass305.A01 = obj;
            anonymousClass305.A02 = obj2;
            anonymousClass305.A00 = interfaceC65642y0;
            interfaceC65642y0.buildRowViewTypes(anonymousClass305, obj, obj2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Binder group not registered: ");
        sb.append(interfaceC65642y0.getClass());
        throw new RuntimeException(sb.toString());
    }

    public AnonymousClass303(AnonymousClass302 anonymousClass302, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC65642y0 interfaceC65642y0 = (InterfaceC65642y0) it.next();
            Map map = this.A06;
            Integer valueOf = Integer.valueOf(i);
            map.put(interfaceC65642y0, valueOf);
            this.A08.put(valueOf, interfaceC65642y0);
            i += interfaceC65642y0.getViewTypeCount();
        }
        this.A02 = anonymousClass302;
        this.A00 = i;
    }

    @Override // X.AnonymousClass304
    public final /* bridge */ /* synthetic */ AnonymousClass304 A9U(InterfaceC65642y0 interfaceC65642y0, Object obj, Object obj2) {
        A03(interfaceC65642y0, obj, obj2);
        return this;
    }
}
