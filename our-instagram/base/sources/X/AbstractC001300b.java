package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: X.00b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC001300b {
    public final Map A04 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();
    public final Map A05 = new LinkedHashMap();
    public final List A01 = new ArrayList();
    public final transient Map A06 = new LinkedHashMap();
    public final Map A03 = new LinkedHashMap();
    public final Bundle A00 = new Bundle();

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0z8] */
    public final C20330z8 A01(final C00V c00v, final AbstractC001600g abstractC001600g, C07X c07x, final String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(abstractC001600g, 2);
        C14360o3.A0B(c00v, 3);
        C07T lifecycle = c07x.getLifecycle();
        if (!lifecycle.A07().A00(C07S.STARTED)) {
            Map map = this.A02;
            if (map.get(str) == null) {
                Integer valueOf = Integer.valueOf(A00());
                this.A04.put(valueOf, str);
                map.put(str, valueOf);
            }
            Map map2 = this.A05;
            C001200a c001200a = (C001200a) map2.get(str);
            if (c001200a == null) {
                c001200a = new C001200a(lifecycle);
            }
            InterfaceC09670ek interfaceC09670ek = new InterfaceC09670ek() { // from class: X.0l4
                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x2) {
                    AbstractC001300b abstractC001300b = this;
                    String str2 = str;
                    C00V c00v2 = c00v;
                    AbstractC001600g abstractC001600g2 = abstractC001600g;
                    C14360o3.A0B(c07r, 5);
                    if (C07R.ON_START == c07r) {
                        abstractC001300b.A06.put(str2, new C00Y(c00v2, abstractC001600g2));
                        Map map3 = abstractC001300b.A03;
                        if (map3.containsKey(str2)) {
                            Object obj = map3.get(str2);
                            map3.remove(str2);
                            c00v2.Cv1(obj);
                        }
                        Bundle bundle = abstractC001300b.A00;
                        ActivityResult activityResult = (ActivityResult) AbstractC53062bn.A01(bundle, ActivityResult.class, str2);
                        if (activityResult != null) {
                            bundle.remove(str2);
                            c00v2.Cv1(abstractC001600g2.A02(activityResult.A01, activityResult.A00));
                            return;
                        }
                        return;
                    }
                    if (C07R.ON_STOP == c07r) {
                        abstractC001300b.A06.remove(str2);
                    } else {
                        if (C07R.ON_DESTROY != c07r) {
                            return;
                        }
                        abstractC001300b.A04(str2);
                    }
                }
            };
            c001200a.A00.A09(interfaceC09670ek);
            c001200a.A01.add(interfaceC09670ek);
            map2.put(str, c001200a);
            return new C00X() { // from class: X.0z8
                @Override // X.C00X
                public final void A01(C35204Ffw c35204Ffw, Object obj) {
                    AbstractC001300b abstractC001300b = AbstractC001300b.this;
                    Map map3 = abstractC001300b.A02;
                    String str2 = str;
                    Object obj2 = map3.get(str2);
                    AbstractC001600g abstractC001600g2 = abstractC001600g;
                    if (obj2 != null) {
                        int intValue = ((Number) obj2).intValue();
                        List list = abstractC001300b.A01;
                        list.add(str2);
                        try {
                            abstractC001300b.A03(abstractC001600g2, null, obj, intValue);
                            return;
                        } catch (Exception e) {
                            list.remove(str2);
                            throw e;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                    sb.append(abstractC001600g2);
                    sb.append(" and input ");
                    sb.append(obj);
                    sb.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    throw new IllegalStateException(sb.toString());
                }

                @Override // X.C00X
                public final void A00() {
                    AbstractC001300b.this.A04(str);
                }
            };
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LifecycleOwner ");
        sb.append(c07x);
        sb.append(" is attempting to register while current state is ");
        sb.append(lifecycle.A07());
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0z7] */
    public final C20320z7 A02(C00V c00v, final AbstractC001600g abstractC001600g, final String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A02;
        if (map.get(str) == null) {
            Integer valueOf = Integer.valueOf(A00());
            this.A04.put(valueOf, str);
            map.put(str, valueOf);
        }
        this.A06.put(str, new C00Y(c00v, abstractC001600g));
        Map map2 = this.A03;
        if (map2.containsKey(str)) {
            Object obj = map2.get(str);
            map2.remove(str);
            c00v.Cv1(obj);
        }
        Bundle bundle = this.A00;
        ActivityResult activityResult = (ActivityResult) AbstractC53062bn.A01(bundle, ActivityResult.class, str);
        if (activityResult != null) {
            bundle.remove(str);
            c00v.Cv1(abstractC001600g.A02(activityResult.A01, activityResult.A00));
        }
        return new C00X() { // from class: X.0z7
            @Override // X.C00X
            public final void A01(C35204Ffw c35204Ffw, Object obj2) {
                AbstractC001300b abstractC001300b = AbstractC001300b.this;
                Map map3 = abstractC001300b.A02;
                String str2 = str;
                Object obj3 = map3.get(str2);
                AbstractC001600g abstractC001600g2 = abstractC001600g;
                if (obj3 != null) {
                    int intValue = ((Number) obj3).intValue();
                    List list = abstractC001300b.A01;
                    list.add(str2);
                    try {
                        abstractC001300b.A03(abstractC001600g2, null, obj2, intValue);
                        return;
                    } catch (Exception e) {
                        list.remove(str2);
                        throw e;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
                sb.append(abstractC001600g2);
                sb.append(" and input ");
                sb.append(obj2);
                sb.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
                throw new IllegalStateException(sb.toString());
            }

            @Override // X.C00X
            public final void A00() {
                AbstractC001300b.this.A04(str);
            }
        };
    }

    public abstract void A03(AbstractC001600g abstractC001600g, C35204Ffw c35204Ffw, Object obj, int i);

    private final int A00() {
        Iterator it = AbstractC224717j.A0B(C05820Sk.A00).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (!this.A04.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void A04(String str) {
        Object remove;
        if (!this.A01.contains(str) && (remove = this.A02.remove(str)) != null) {
            this.A04.remove(remove);
        }
        this.A06.remove(str);
        Map map = this.A03;
        if (map.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(map.get(str));
            android.util.Log.w("ActivityResultRegistry", sb.toString());
            map.remove(str);
        }
        Bundle bundle = this.A00;
        if (bundle.containsKey(str)) {
            Object A01 = AbstractC53062bn.A01(bundle, ActivityResult.class, str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(A01);
            android.util.Log.w("ActivityResultRegistry", sb2.toString());
            bundle.remove(str);
        }
        Map map2 = this.A05;
        C001200a c001200a = (C001200a) map2.get(str);
        if (c001200a != null) {
            List list = c001200a.A01;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c001200a.A00.A0A((C07W) it.next());
            }
            list.clear();
            map2.remove(str);
        }
    }

    public final boolean A05(Intent intent, int i, int i2) {
        String str = (String) this.A04.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C00Y c00y = (C00Y) this.A06.get(str);
        if (c00y != null) {
            C00V c00v = c00y.A00;
            List list = this.A01;
            if (list.contains(str)) {
                c00v.Cv1(c00y.A01.A02(intent, i2));
                list.remove(str);
                return true;
            }
        }
        this.A03.remove(str);
        this.A00.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }
}
