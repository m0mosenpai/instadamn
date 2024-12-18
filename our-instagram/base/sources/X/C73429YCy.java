package X;

/* renamed from: X.YCy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73429YCy implements YNw {
    public final SLN A00;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.XhH] */
    @Override // X.YNw
    public final /* bridge */ /* synthetic */ void CuU(YNq yNq, Object obj) {
        SLN sln;
        String str;
        InterfaceC65503TlX ydn;
        AbstractC72503XfI abstractC72503XfI = (AbstractC72503XfI) obj;
        if (abstractC72503XfI instanceof XYQ) {
            yNq.APm(new XYZ((XXq) abstractC72503XfI, new C72681Xl8(new Object())));
            return;
        }
        if (abstractC72503XfI instanceof XYT) {
            XYT xyt = (XYT) abstractC72503XfI;
            sln = this.A00;
            str = xyt.A02;
            ydn = new YDM(yNq, xyt, this);
        } else {
            if (!(abstractC72503XfI instanceof XYU)) {
                return;
            }
            XYU xyu = (XYU) abstractC72503XfI;
            sln = this.A00;
            str = xyu.A02;
            ydn = new YDN(yNq, xyu, this);
        }
        sln.A00(ydn, str);
    }

    public C73429YCy(SLN sln) {
        this.A00 = sln;
    }
}
