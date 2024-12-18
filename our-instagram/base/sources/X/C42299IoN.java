package X;

/* renamed from: X.IoN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42299IoN implements InterfaceC66482zP {
    public final JJB A00;
    public final String A01;

    public C42299IoN(JJB jjb, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = jjb;
        this.A01 = str;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        JJB jjb;
        C42299IoN c42299IoN = (C42299IoN) obj;
        JJB jjb2 = this.A00;
        if (c42299IoN != null) {
            jjb = c42299IoN.A00;
        } else {
            jjb = null;
        }
        return C14360o3.A0K(jjb2, jjb);
    }
}
