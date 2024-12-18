package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Y8b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73322Y8b implements YNF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C73322Y8b(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.YNF
    public final void CP5(Object obj) {
        switch (this.A00) {
            case 4:
                YPX ypx = (YPX) obj;
                ypx.DZH((AbstractC72452Xdw) this.A02, (C72855XpB) this.A01);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                YPX ypx2 = (YPX) obj;
                ypx2.Dyx((C72819Xnl) this.A02, (C72855XpB) this.A01);
                return;
            default:
                return;
        }
    }
}
