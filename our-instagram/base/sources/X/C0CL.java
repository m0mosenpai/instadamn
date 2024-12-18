package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.AbstractCollection;

/* renamed from: X.0CL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CL extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InterfaceC09390do A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CL(InterfaceC09390do interfaceC09390do) {
        super(0);
        this.A00 = interfaceC09390do;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36316216232251543L));
        long A01 = C20150ym.A01(AbstractC20100yh.A00(36597691209026439L));
        final InterfaceC09390do interfaceC09390do = this.A00;
        final int i = (int) A01;
        return new AbstractC211911v(interfaceC09390do, i, A07) { // from class: X.128
            public final int A00;
            public final InterfaceC09390do A01;
            public final boolean A02;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "IgSharedPreferencesQPLInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                InterfaceC09390do interfaceC09390do2;
                AnonymousClass127 anonymousClass127;
                LightweightQuickPerformanceLogger BjG;
                if (this.A02 && (interfaceC09390do2 = this.A01) != null && (anonymousClass127 = (AnonymousClass127) interfaceC09390do2.getValue()) != null && (BjG = anonymousClass127.BjG()) != null) {
                    C17320tT.A06 = this.A00;
                    ((AbstractCollection) C12940lg.A01.getValue()).add(new InterfaceC12930lf() { // from class: X.0tV
                        @Override // X.InterfaceC12930lf
                        public final void DV3(String str) {
                            if (str != null) {
                                C17320tT.A05 = str;
                            }
                        }
                    });
                    C17320tT.A07 = BjG;
                }
            }

            {
                this.A02 = A07;
                this.A01 = interfaceC09390do;
                this.A00 = i;
            }
        };
    }
}
