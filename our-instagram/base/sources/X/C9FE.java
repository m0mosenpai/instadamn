package X;

import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9FE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FE extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FE(int i, int i2, Object obj, Object obj2) {
        super(0);
        this.A00 = i2;
        this.A01 = i;
        this.A03 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                C7X7 c7x7 = (C7X7) this.A02;
                C7X7.A01(c7x7, this.A01, ((C7X8) this.A03).A00);
                C7X7.A00(c7x7);
                return C0eB.A00;
            case 1:
                final int i = this.A01;
                final C2XI c2xi = (C2XI) this.A03;
                final InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                return new C33R() { // from class: X.4g3
                    @Override // X.C33R
                    public final void DSJ(C75113Zb c75113Zb, int i2) {
                        C14360o3.A0B(c75113Zb, 0);
                        if (i2 == i) {
                            c2xi.A00(interfaceC16660sJ.invoke(c75113Zb));
                        }
                    }
                };
            case 2:
                final int i2 = this.A01;
                final C51762Yz c51762Yz = (C51762Yz) this.A03;
                final InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A02;
                return new C33R() { // from class: X.3dG
                    @Override // X.C33R
                    public final void DSJ(C75113Zb c75113Zb, int i3) {
                        C14360o3.A0B(c75113Zb, 0);
                        if (i3 == i2) {
                            c51762Yz.A01(interfaceC16660sJ2.invoke(c75113Zb));
                        }
                    }
                };
            case 3:
                TreeJNI treeJNI = (TreeJNI) this.A03;
                int i3 = this.A01;
                Class cls = (Class) this.A02;
                TreeJNI treeJNI2 = TreeJNI.$redex_init_class;
                ImmutableList optionalTreeListByHashCode = treeJNI.getOptionalTreeListByHashCode(i3, cls);
                if (optionalTreeListByHashCode != null) {
                    return optionalTreeListByHashCode;
                }
                return C16930sl.A00;
            case 4:
                TreeJNI treeJNI3 = (TreeJNI) this.A03;
                int i4 = this.A01;
                Class cls2 = (Class) this.A02;
                TreeJNI treeJNI4 = TreeJNI.$redex_init_class;
                TreeJNI treeValueByHashCode = treeJNI3.getTreeValueByHashCode(i4, cls2);
                C14360o3.A0A(treeValueByHashCode);
                return treeValueByHashCode;
            case 5:
                TreeJNI treeJNI5 = (TreeJNI) this.A03;
                int i5 = this.A01;
                Class cls3 = (Class) this.A02;
                TreeJNI treeJNI6 = TreeJNI.$redex_init_class;
                return treeJNI5.getOptionalTreeListByHashCode(i5, cls3);
            case 6:
                TreeJNI treeJNI7 = (TreeJNI) this.A03;
                int i6 = this.A01;
                Class cls4 = (Class) this.A02;
                TreeJNI treeJNI8 = TreeJNI.$redex_init_class;
                return treeJNI7.getTreeValueByHashCode(i6, cls4);
            default:
                return ((C11L) this.A03).A06((CharSequence) this.A02, this.A01);
        }
    }
}
