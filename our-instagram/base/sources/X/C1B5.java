package X;

import java.io.File;

/* renamed from: X.1B5, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1B5 extends AbstractC23171Aw {
    public C23191Ay A00;
    public C1B6 A01;
    public C1B7 A02;

    @Override // X.AbstractC23171Aw, X.InterfaceC23181Ax
    public final File AXd(C1MG c1mg, int i) {
        String str;
        File AXd = super.AXd(c1mg, i);
        if (this.A02 == null) {
            str = "superstoreConstraintsProvider";
        } else {
            C1F9 c1f9 = new C1F9(c1mg, i);
            C1B6 c1b6 = this.A01;
            if (c1b6 == null) {
                str = "caskPluginMapper";
            } else {
                C1FD.A00(c1b6, c1f9, AXd);
                return AXd;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
