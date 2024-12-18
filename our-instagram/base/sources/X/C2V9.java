package X;

import com.facebook.litho.ComponentsSystrace;

/* renamed from: X.2V9, reason: invalid class name */
/* loaded from: classes.dex */
public class C2V9 implements C2VA, C2VB {
    public C2VE A00;
    public final int A01;

    @Override // X.C2VB
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public boolean CTz(C2V9 c2v9) {
        C2VE c2ve;
        C2XE c2xe;
        return this == c2v9 || (c2v9 != null && c2v9.getClass() == getClass() && this.A01 == c2v9.A01 && ((c2xe = (c2ve = this.A00).A00) == null || !c2xe.A02.A01.A0U || c2ve == c2v9.A00));
    }

    @Override // X.C2VA
    public final /* bridge */ /* synthetic */ Object call(Object[] objArr) {
        A00(objArr[0]);
        return null;
    }

    public Object A00(Object obj) {
        int i = C2V3.DEFAULT_BACKGROUND_THREAD_PRIORITY;
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            StringBuilder sb = new StringBuilder();
            sb.append("onEvent:");
            sb.append(this);
            ComponentsSystrace.A02(sb.toString());
        }
        C2VD c2vd = this.A00.A01;
        c2vd.getClass();
        Object APq = c2vd.B2i().APq(this, obj);
        if (isTracing) {
            ComponentsSystrace.A01();
        }
        return APq;
    }

    public final String toString() {
        Class<?> cls;
        C2VD c2vd = this.A00.A01;
        if (c2vd != null && c2vd != this) {
            cls = c2vd.getClass();
        } else {
            cls = getClass();
        }
        return AbstractC75733ae.A00(cls);
    }

    public C2V9(C2VE c2ve, int i) {
        this.A01 = i;
        this.A00 = c2ve;
    }
}
