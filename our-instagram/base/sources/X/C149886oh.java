package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149886oh {
    public final C149896oi A00;
    public final ImmutableSet A01;
    public final AbstractC12990ll A02;
    public final boolean A03;

    public C149886oh(C150736qU c150736qU, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        C14360o3.A0B(c150736qU, 2);
        this.A02 = abstractC12990ll;
        C06090Tz c06090Tz = C06090Tz.A05;
        List A0R = AbstractC001900j.A0R(C18U.A04(c06090Tz, abstractC12990ll, 36874042288046102L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0R) {
            if (!C14360o3.A0K(obj, "")) {
                arrayList.add(obj);
            }
        }
        ImmutableSet A03 = ImmutableSet.A03(arrayList);
        C14360o3.A07(A03);
        this.A01 = A03;
        C18U.A06(c06090Tz, this.A02, 36311092334428590L);
        this.A03 = Boolean.valueOf(C18U.A06(c06090Tz, this.A02, 36311092334559664L)).booleanValue();
        this.A00 = new C149896oi(c150736qU);
    }
}
