package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.modules.appstate.AppStateModule;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.LIc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47968LIc {
    public final Map A00;
    public final java.util.Set A01;
    public final WeakHashMap A02;
    public final InterfaceC16660sJ A03;

    public C47968LIc(List list, java.util.Set set, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = set;
        this.A03 = interfaceC16660sJ;
        this.A02 = new WeakHashMap();
        LinkedHashSet A00 = AnonymousClass090.A00(list, AbstractC16830sb.A07(new L9Y("touchListener", new C50358MLk(this, 2)), new L9Y("clickListener", new C50358MLk(this, 3)), new L9Y("longClickListener", new C50358MLk(this, 4)), new L9Y("focusChangeListener", new C50358MLk(this, 5)), new L9Y("scrollChangeListener", new C50358MLk(this, 6)), new L9Y("layoutChangeListeners", new C50358MLk(this, 7)), new L9Y("attachStateChangeListeners", new C50358MLk(this, 8)), new L9Y("dragListener", new C50358MLk(this, 9)), new L9Y("keyListener", new C50358MLk(this, 10)), new L9Y("contextClickListener", new C65075Td4(this, 49)), new L9Y("applyWindowInsetsListener", new C50358MLk(this, 0)), new L9Y(AppStateModule.APP_STATE_BACKGROUND, C50292MIw.A00), new L9Y("foreground", C50293MIx.A00), new L9Y("tag", C50294MIy.A00), new L9Y("seekBarListener", new C50358MLk(this, 1))));
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            A18.put(((L9Y) obj).A00, obj);
        }
        this.A00 = A18;
    }

    public final void A01(View view) {
        C14360o3.A0B(view, 0);
        WeakHashMap weakHashMap = this.A02;
        Collection<L9Y> values = this.A00.values();
        ArrayList A0q = AbstractC167017dG.A0q(values);
        for (L9Y l9y : values) {
            A0q.add(new L9Z(l9y.A00, l9y.A01.invoke(view)));
        }
        weakHashMap.put(view, AbstractC001800i.A0k(A0q));
        if (view instanceof ViewGroup) {
            C12500ku c12500ku = new C12500ku((ViewGroup) view);
            while (c12500ku.hasNext()) {
                A01((View) c12500ku.next());
            }
        }
    }

    public static final Object A00(View view, String str) {
        Object obj;
        try {
            Field declaredField = View.class.getDeclaredField("mListenerInfo");
            declaredField.setAccessible(true);
            obj = declaredField.get(view);
        } catch (Exception unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        try {
            Field declaredField2 = obj.getClass().getDeclaredField(str);
            declaredField2.setAccessible(true);
            return declaredField2.get(obj);
        } catch (Exception unused2) {
            return null;
        }
    }

    public C47968LIc() {
        this(C16930sl.A00, C16910sj.A00, null);
    }
}
