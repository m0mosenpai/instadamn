package X;

/* loaded from: classes8.dex */
public final class JXS implements C1GL {
    public final Integer A00;
    public final C1GL A01;

    @Override // X.C1GL
    public final void schedule(C11R c11r, int i, int i2, boolean z, boolean z2) {
        JXR jxr;
        C1GL c1gl = this.A01;
        if (c11r != null) {
            jxr = new JXR(c11r, this.A00);
        } else {
            jxr = null;
        }
        c1gl.schedule(jxr, i, i2, z, z2);
    }

    public JXS(C1GL c1gl, Integer num) {
        this.A01 = c1gl;
        this.A00 = num;
    }

    @Override // X.C1GL
    public final void schedule(C11R c11r) {
        JXR jxr;
        C1GL c1gl = this.A01;
        if (c11r != null) {
            jxr = new JXR(c11r, this.A00);
        } else {
            jxr = null;
        }
        c1gl.schedule(jxr);
    }
}
