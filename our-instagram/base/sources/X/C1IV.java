package X;

import com.instagram.mainfeed.controller.appstart.components.SubspanMutableStateFlow;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1IV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IV extends C1IQ {
    public final List A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1IV(C1IN c1in) {
        super(c1in);
        C14360o3.A0B(c1in, 1);
        this.A00 = C16930sl.A00;
    }

    @Override // X.C1IQ
    public final List A01() {
        return this.A00;
    }

    public final void A06(String str, Long l) {
        if (l != null) {
            C1IN c1in = this.A01;
            C1IN.A00(c1in).markerPoint(15335435, "FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_FAILED", l.longValue(), TimeUnit.MILLISECONDS);
        } else {
            this.A01.A03("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_FAILED", str);
        }
        A00().Egh(C1IT.A03);
    }

    @Override // X.C1IQ
    public final void A02() {
        SubspanMutableStateFlow A00;
        C1IT c1it;
        C1IT c1it2 = (C1IT) A00().A02.getValue();
        Long l = (Long) A00().A01.get();
        if (l != null) {
            A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_START", l);
            A00().Egh(C1IT.A07);
        }
        Long l2 = (Long) A00().A00.get();
        if (l2 != null) {
            int ordinal = c1it2.ordinal();
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 3) {
                        A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_SKIPPED", l2);
                        A00 = A00();
                        c1it = C1IT.A06;
                    } else {
                        return;
                    }
                } else {
                    A06("unkown_due_to_replay", l2);
                    return;
                }
            } else {
                A05("FIRST_MEDIA_FROM_NETWORK_CONTENT_LOAD_END", l2);
                A00 = A00();
                c1it = C1IT.A08;
            }
            A00.Egh(c1it);
        }
    }
}
