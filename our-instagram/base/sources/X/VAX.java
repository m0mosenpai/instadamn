package X;

/* loaded from: classes11.dex */
public final class VAX extends C70077W1u implements InterfaceC71959XCl {
    public VJX A00;
    public boolean A01;
    public final VAW A02;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.VJX, java.lang.Object] */
    @Override // X.InterfaceC71959XCl
    public final VJX Ac4() {
        String str;
        VJX vjx = this.A00;
        int i = vjx.A00;
        VJX vjx2 = this.A02.A00;
        if (vjx2 == null) {
            str = null;
        } else {
            str = vjx2.A02;
        }
        String str2 = vjx.A01;
        ?? obj = new Object();
        obj.A00 = i;
        obj.A02 = str;
        obj.A01 = str2;
        return obj;
    }

    @Override // X.InterfaceC71959XCl
    public final boolean CM8() {
        return this.A01;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VAW, X.W1u] */
    public VAX(VJX vjx, VDB vdb, String str) {
        super(vdb, str);
        this.A00 = vjx;
        this.A02 = new C70077W1u(VDB.EDITTEXT, str);
    }
}
