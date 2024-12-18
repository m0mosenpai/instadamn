package X;

/* loaded from: classes7.dex */
public final class J2Y implements InterfaceC43431JGv {
    public final /* synthetic */ C30E A00;

    public J2Y(C30E c30e) {
        this.A00 = c30e;
    }

    @Override // X.InterfaceC43431JGv
    public final void Cy1(String str) {
        C30E c30e = this.A00;
        if (str == null) {
            C4QW c4qw = c30e.A05;
            if (c4qw != null) {
                c4qw.EQ0(false);
                return;
            }
            return;
        }
        C4QW c4qw2 = c30e.A05;
        if (c4qw2 == null) {
            return;
        }
        c4qw2.EbH(str);
    }
}
