package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.Example$$serializer;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73593Rl implements InterfaceC73603Rm {
    public final InterfaceC73573Rj A00;
    public final C0JM A01;

    public C73593Rl(C0JM c0jm, InterfaceC73573Rj interfaceC73573Rj) {
        C14360o3.A0B(interfaceC73573Rj, 1);
        C14360o3.A0B(c0jm, 2);
        this.A00 = interfaceC73573Rj;
        this.A01 = c0jm;
    }

    @Override // X.InterfaceC73603Rm
    public final C3SN CM9(String str, long j) {
        String A00;
        boolean z = false;
        C14360o3.A0B(str, 0);
        C3SN EKt = EKt(str);
        boolean z2 = false;
        if (!EKt.A02) {
            return C3SO.A00(EKt, false);
        }
        if (this.A01.now() <= ((Number) EKt.A00).longValue() + (j * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) {
            z = true;
            z2 = true;
            A00 = null;
        } else {
            A00 = AbstractC111324zv.A00(3073);
        }
        return new C3SN(z2, A00, z);
    }

    @Override // X.InterfaceC73603Rm
    public final C3SN E82(Long l, String str) {
        C14360o3.A0B(str, 0);
        InterfaceC73573Rj interfaceC73573Rj = this.A00;
        if (!((C3Ri) interfaceC73573Rj).A00.hasKey(str)) {
            return new C3SN(Example.A03, "example not found in cache", false);
        }
        try {
            C73773Sh c73773Sh = AbstractC73763Sg.A03;
            String string = interfaceC73573Rj.getString(str);
            C3R9[] c3r9Arr = Example.A04;
            return new C3SN(c73773Sh.A00(string, Example$$serializer.INSTANCE), null, true);
        } catch (Exception unused) {
            return new C3SN(Example.A03, "example not found in cache", false);
        }
    }

    @Override // X.InterfaceC73603Rm
    public final List E83(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC001900j.A0R(this.A00.getString(AnonymousClass001.A0R(str, "_exampleIds")), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
    }

    @Override // X.InterfaceC73603Rm
    public final void Eot(Example example, String str, long j) {
        InterfaceC73573Rj interfaceC73573Rj = this.A00;
        String A0T = AnonymousClass001.A0T(str, AbstractC111324zv.A00(520), '_');
        TimeUnit timeUnit = TimeUnit.DAYS;
        long millis = timeUnit.toMillis(30L);
        C14360o3.A0B(A0T, 0);
        ((C3Ri) interfaceC73573Rj).E6y(A0T, String.valueOf(j), millis);
        C73773Sh c73773Sh = AbstractC73763Sg.A03;
        C3R9[] c3r9Arr = Example.A04;
        interfaceC73573Rj.E6y(str, c73773Sh.A02(example, Example$$serializer.INSTANCE), timeUnit.toMillis(30L));
    }

    @Override // X.InterfaceC73603Rm
    public final void Eov(String str, List list) {
        C14360o3.A0B(str, 0);
        this.A00.E6y(AnonymousClass001.A0R(str, "_exampleIds"), AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", list, null), TimeUnit.DAYS.toMillis(30L));
    }

    @Override // X.InterfaceC73603Rm
    public final void Eow(Example example, String str, long j) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(example, 1);
        Eot(example, str, j);
    }

    @Override // X.InterfaceC73603Rm
    public final C3SN EKt(String str) {
        String A00 = AbstractC111324zv.A00(2652);
        C14360o3.A0B(str, 0);
        try {
            InterfaceC73573Rj interfaceC73573Rj = this.A00;
            String A0T = AnonymousClass001.A0T(str, AbstractC111324zv.A00(520), '_');
            C14360o3.A0B(A0T, 0);
            return new C3SN(Long.valueOf(Long.parseLong(((C3Ri) interfaceC73573Rj).getString(A0T))), null, true);
        } catch (C4D1 | NumberFormatException unused) {
            return new C3SN(-1L, A00, false);
        }
    }
}
