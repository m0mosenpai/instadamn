package X;

/* renamed from: X.WZi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70501WZi implements XE8 {
    public XE8 A00;

    @Override // X.XE8
    public final void ENL(C68232VIs c68232VIs, XCB xcb) {
        this.A00.ENL(c68232VIs, new C70500WZh(null, c68232VIs, xcb, this, null, C05F.A0C));
    }

    @Override // X.XE8
    public final void EOA(W63 w63, C68232VIs c68232VIs, XCB xcb, W62 w62) {
        this.A00.EOA(w63, c68232VIs, new C70500WZh(w63, c68232VIs, xcb, this, w62, C05F.A01), w62);
    }

    @Override // X.XE8
    public final void EOS(MYB myb, XCB xcb) {
        XE8 xe8 = this.A00;
        C70500WZh c70500WZh = new C70500WZh(null, null, xcb, this, null, C05F.A00);
        c70500WZh.A00 = myb;
        xe8.EOS(myb, c70500WZh);
    }

    @Override // X.XE8
    public final C69734VuU Bo7() {
        return this.A00.Bo7();
    }

    @Override // X.XE8
    public final void EN9(C68232VIs c68232VIs, XCB xcb) {
        this.A00.EN9(c68232VIs, xcb);
    }
}
