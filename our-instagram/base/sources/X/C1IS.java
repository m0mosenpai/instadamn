package X;

import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import java.util.List;

/* renamed from: X.1IS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IS extends C1IQ {
    public final List A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1IS(C1IN c1in) {
        super(c1in);
        C14360o3.A0B(c1in, 1);
        this.A00 = C16930sl.A00;
    }

    @Override // X.C1IQ
    public final List A01() {
        return this.A00;
    }

    public final void A06(Long l) {
        A05("FEED_REQUEST_FAILED", l);
        A00().Egh(C1IT.A03);
    }

    @Override // X.C1IQ
    public final void A02() {
        SubspanMutableStateFlow A00;
        C1IT c1it;
        C1IT c1it2 = (C1IT) A00().A02.getValue();
        if (A00().A01.get() != null) {
            A05("FEED_REQUEST_START", (Long) A00().A01.get());
            A00().Egh(C1IT.A07);
        }
        if (A00().A00.get() != null) {
            int ordinal = c1it2.ordinal();
            if (ordinal != 4) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        A00 = A00();
                        c1it = C1IT.A06;
                    } else {
                        return;
                    }
                } else {
                    A05("FEED_REQUEST_SUCCEEDED", (Long) A00().A00.get());
                    A00 = A00();
                    c1it = C1IT.A08;
                }
                A00.Egh(c1it);
                return;
            }
            A06((Long) A00().A00.get());
        }
    }
}
