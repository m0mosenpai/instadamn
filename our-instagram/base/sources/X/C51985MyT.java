package X;

import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;

/* renamed from: X.MyT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51985MyT extends AbstractC53431NkK {
    public final MetaAiRsysSdkRealTimeSession A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51985MyT) && C14360o3.A0K(this.A00, ((C51985MyT) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C51985MyT(MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession) {
        this.A00 = metaAiRsysSdkRealTimeSession;
    }
}
