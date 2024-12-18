package X;

import com.instagram.direct.armadilloexpress.transportpayload.Voice;
import java.util.Arrays;

/* renamed from: X.K6l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45378K6l extends AbstractC60877RXa implements InterfaceC65445TkH {
    public C45378K6l() {
        super(Voice.DEFAULT_INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.TZ8, X.Tr1, X.RWB] */
    public final void A06(float f) {
        Voice voice = (Voice) AbstractC43592JPx.A0K(this);
        int i = Voice.DURATION_FIELD_NUMBER;
        InterfaceC65671Tr1 interfaceC65671Tr1 = voice.waveforms_;
        boolean z = ((TZ8) interfaceC65671Tr1).A00;
        InterfaceC65671Tr1 interfaceC65671Tr12 = interfaceC65671Tr1;
        if (!z) {
            int size = interfaceC65671Tr1.size();
            int i2 = size * 2;
            if (size == 0) {
                i2 = 10;
            }
            RWB rwb = (RWB) interfaceC65671Tr1;
            if (i2 >= rwb.A00) {
                float[] copyOf = Arrays.copyOf(rwb.A01, i2);
                int i3 = rwb.A00;
                ?? tz8 = new TZ8();
                tz8.A01 = copyOf;
                tz8.A00 = i3;
                voice.waveforms_ = tz8;
                interfaceC65671Tr12 = tz8;
            } else {
                throw new IllegalArgumentException();
            }
        }
        interfaceC65671Tr12.A8b(f);
    }
}
