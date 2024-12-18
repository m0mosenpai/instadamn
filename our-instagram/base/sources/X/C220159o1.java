package X;

import java.nio.charset.Charset;

/* renamed from: X.9o1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220159o1 extends C7J1 {
    public C220179o3 A00;
    public final String A01;
    public final /* synthetic */ C28811aJ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C220159o1(C28811aJ c28811aJ, String str) {
        super(null, c28811aJ);
        this.A02 = c28811aJ;
        this.A01 = str;
    }

    @Override // X.C7J1
    public final void A00() {
        C28811aJ c28811aJ = this.A02;
        Charset charset = C28811aJ.A0v;
        C220179o3 A02 = c28811aJ.A0O.A02(this.A01, c28811aJ.A01);
        this.A00 = A02;
        A02.A06.add(this);
    }

    @Override // X.C7J1
    public final void A01() {
        C220179o3 c220179o3 = this.A00;
        if (c220179o3 != null) {
            c220179o3.A06(this);
            this.A00 = null;
        }
    }
}
