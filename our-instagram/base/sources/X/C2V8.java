package X;

/* renamed from: X.2V8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2V8 extends C2V9 implements C2VC, C2VD {
    @Override // X.C2V9
    public final /* bridge */ /* synthetic */ Object A00(Object obj) {
        C14360o3.A0B(obj, 0);
        return APq(this, obj);
    }

    public abstract AbstractC50812Vc A02(C2XE c2xe, Exception exc);

    @Override // X.C2VC
    public final Object APq(C2V9 c2v9, Object obj) {
        C14360o3.A0B(obj, 1);
        if (c2v9.A01 == -1048037474) {
            C27861CPy c27861CPy = (C27861CPy) obj;
            Exception exc = c27861CPy.A01;
            if (exc != null) {
                C2XE c2xe = c27861CPy.A00;
                if (c2xe != null) {
                    A02(c2xe, exc);
                    throw C00O.createAndThrow();
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        return null;
    }

    @Override // X.C2VD
    public final C2VC B2i() {
        return this;
    }

    public C2V8() {
        super(new C2VE(null, null), -1048037474);
        this.A00.A01 = this;
    }
}
