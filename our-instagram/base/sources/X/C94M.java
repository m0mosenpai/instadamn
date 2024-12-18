package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.Type;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;
import java.util.Map;

/* renamed from: X.94M, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94M implements InterfaceC73603Rm {
    public final C4QF A00;

    public C94M(C4QF c4qf) {
        C14360o3.A0B(c4qf, 1);
        this.A00 = c4qf;
    }

    @Override // X.InterfaceC73603Rm
    public final C3SN CM9(String str, long j) {
        return new C3SN(true, null, true);
    }

    @Override // X.InterfaceC73603Rm
    public final List E83(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC001900j.A0R(this.A00.A01(AnonymousClass001.A0R(str, "_exampleIds")), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
    }

    @Override // X.InterfaceC73603Rm
    public final C3SN EKt(String str) {
        long A00 = this.A00.A00(AnonymousClass001.A0T(str, AbstractC111324zv.A00(520), '_'), -1L);
        if (A00 == -1) {
            return new C3SN(-1L, AbstractC111324zv.A00(2652), false);
        }
        return new C3SN(Long.valueOf(A00), null, true);
    }

    @Override // X.InterfaceC73603Rm
    public final void Eov(String str, List list) {
        C14360o3.A0B(str, 0);
        this.A00.A06(AnonymousClass001.A0R(str, "_exampleIds"), AbstractC001800i.A0P(", ", "", "", list, C25098B8u.A00));
    }

    @Override // X.InterfaceC73603Rm
    public final void Eow(Example example, String str, long j) {
    }

    @Override // X.InterfaceC73603Rm
    public final C3SN E82(Long l, String str) {
        return new C3SN(Example.A03, "to be implemented", false);
    }

    @Override // X.InterfaceC73603Rm
    public final void Eot(Example example, String str, long j) {
        C4QF c4qf = this.A00;
        c4qf.A05(AnonymousClass001.A0T(str, AbstractC111324zv.A00(520), '_'), j);
        for (Map.Entry entry : example.A02.entrySet()) {
            String str2 = (String) entry.getKey();
            FeatureData featureData = (FeatureData) entry.getValue();
            Type type = featureData.A02;
            if (type == Type.A09) {
                c4qf.A05(str2, featureData.A01);
            } else if (type == Type.A06) {
                c4qf.A04(str2, (float) featureData.A00);
            }
        }
    }
}
