package X;

import com.facebook.litho.ComponentTree;

/* loaded from: classes5.dex */
public final class BU3 implements C2YT {
    public final ComponentTree A00;
    public final C40971v4 A01;
    public final AbstractC27447C9p A02;

    public BU3(ComponentTree componentTree, C40971v4 c40971v4, AbstractC27447C9p abstractC27447C9p) {
        C14360o3.A0B(c40971v4, 1);
        this.A01 = c40971v4;
        this.A00 = componentTree;
        this.A02 = abstractC27447C9p;
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        Object obj = null;
        if (this.A01.A07()) {
            AbstractC27447C9p abstractC27447C9p = this.A02;
            if (abstractC27447C9p instanceof C2M) {
                ComponentTree componentTree = this.A00;
                if (componentTree != null) {
                    componentTree.A0O((AbstractC50812Vc) ((C2M) abstractC27447C9p).A00, AbstractC78603fS.A01(j), AbstractC78603fS.A00(j));
                }
                obj = new C2M(componentTree);
            } else if (abstractC27447C9p instanceof C2L) {
                obj = new C2L(((C2L) abstractC27447C9p).A00);
            }
        }
        return new C2YU(AbstractC78673fZ.A00(C78613fT.A01(j), C78613fT.A00(j)), obj);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
