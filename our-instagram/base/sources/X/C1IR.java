package X;

import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1IR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IR extends C1IQ {
    public SubspanMutableStateFlow A00;
    public final C1IW A01;
    public final C1IV A02;
    public final C1IS A03;
    public final List A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1IW, X.1IQ] */
    public /* synthetic */ C1IR(final C1IN c1in) {
        super(c1in);
        C1IS c1is = new C1IS(c1in);
        C1IV c1iv = new C1IV(c1in);
        ?? r2 = new C1IQ(c1in) { // from class: X.1IW
            public final List A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(c1in);
                C14360o3.A0B(c1in, 1);
                this.A00 = C16930sl.A00;
            }

            @Override // X.C1IQ
            public final List A01() {
                return this.A00;
            }

            @Override // X.C1IQ
            public final void A02() {
                SubspanMutableStateFlow A00;
                C1IT c1it;
                C1IT c1it2 = (C1IT) A00().A02.getValue();
                Long l = (Long) A00().A01.get();
                if (l != null) {
                    A05("NETWORK_FEED_UI_RENDER_START", l);
                    A00().Egh(C1IT.A07);
                }
                Long l2 = (Long) A00().A00.get();
                if (l2 != null) {
                    int ordinal = c1it2.ordinal();
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            A05("NETWORK_FEED_UI_RENDER_SKIPPED", l2);
                            A00 = A00();
                            c1it = C1IT.A06;
                        } else {
                            return;
                        }
                    } else {
                        A05("NETWORK_FEED_UI_RENDER_END", l2);
                        A00 = A00();
                        c1it = C1IT.A08;
                    }
                    A00.Egh(c1it);
                }
            }
        };
        C14360o3.A0B(c1in, 1);
        this.A03 = c1is;
        this.A02 = c1iv;
        this.A01 = r2;
        this.A00 = new SubspanMutableStateFlow(C1IT.A05);
        this.A04 = AbstractC16960so.A1Q(c1is, c1iv, r2);
    }

    @Override // X.C1IQ
    public final SubspanMutableStateFlow A00() {
        return this.A00;
    }

    @Override // X.C1IQ
    public final List A01() {
        return this.A04;
    }

    @Override // X.C1IQ
    public final void A02() {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C1IQ) it.next()).A02();
        }
    }

    @Override // X.C1IQ
    public final void A04(SubspanMutableStateFlow subspanMutableStateFlow) {
        this.A00 = subspanMutableStateFlow;
    }
}
