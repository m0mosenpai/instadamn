package X;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class SSV {
    public static C63180Sef A00(final InterfaceC65439TkB interfaceC65439TkB, final String str) {
        C63194Sew A00 = C63194Sew.A00(S3Y.class);
        A00.A01 = 1;
        C62995SaJ.A00(A00, Context.class, 1);
        return C63194Sew.A01(A00, new InterfaceC65434Tk5(interfaceC65439TkB, str) { // from class: X.T9T
            public final InterfaceC65439TkB A00;
            public final String A01;

            {
                this.A01 = str;
                this.A00 = interfaceC65439TkB;
            }

            @Override // X.InterfaceC65434Tk5
            public final Object ALR(AbstractC61607RqW abstractC61607RqW) {
                return new RVX(this.A01, this.A00.ATs(abstractC61607RqW.A03(Context.class)));
            }
        });
    }

    public static C63180Sef A01(String str, String str2) {
        final RVX rvx = new RVX(str, str2);
        C63194Sew A00 = C63194Sew.A00(S3Y.class);
        A00.A01 = 1;
        return C63194Sew.A01(A00, new InterfaceC65434Tk5(rvx) { // from class: X.T9S
            public final Object A00;

            {
                this.A00 = rvx;
            }

            @Override // X.InterfaceC65434Tk5
            public final Object ALR(AbstractC61607RqW abstractC61607RqW) {
                return this.A00;
            }
        });
    }
}
