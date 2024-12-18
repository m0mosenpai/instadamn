package X;

import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Map;

/* renamed from: X.2BM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BM implements C2BL {
    public final AbrContextAwareConfiguration A00;
    public final C2BH A01;

    @Override // X.C2BL
    public final boolean CW0() {
        return false;
    }

    @Override // X.C2BL
    public final boolean Ejr() {
        return false;
    }

    @Override // X.C2BL
    public final C4Iz AT7(C93644Ip c93644Ip, C4BV c4bv, C4B6 c4b6, Map map, C4B6[] c4b6Arr, int i, int i2) {
        if (c4b6 != null && !this.A00.isThumbnail) {
            this.A01.A7q(EnumC92204Ba.A0D);
            return new C4Iz(c4b6);
        }
        this.A01.A7q(EnumC92204Ba.A0C);
        return new C4Iz(c4b6Arr[c4b6Arr.length - 1]);
    }

    public C2BM(AbrContextAwareConfiguration abrContextAwareConfiguration, C2BH c2bh) {
        this.A01 = c2bh;
        this.A00 = abrContextAwareConfiguration;
    }
}
