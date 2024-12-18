package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.R2c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60520R2c extends AbstractC62966SZj {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C63347Si4 A03;
    public final T0G A04;

    public C60520R2c(C63347Si4 c63347Si4, ReadableMap readableMap) {
        this.A03 = c63347Si4;
        this.A04 = T0G.A00(readableMap.getMap("animationConfig"));
        this.A00 = readableMap.getInt("animationId");
        this.A01 = readableMap.getInt("toValue");
        this.A02 = readableMap.getInt(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
    }

    @Override // X.AbstractC62966SZj
    public final String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "TrackingAnimatedNode[", A1C);
        A1C.append("]: animationID: ");
        A1C.append(this.A00);
        A1C.append(" toValueNode: ");
        A1C.append(this.A01);
        A1C.append(" valueNode: ");
        A1C.append(this.A02);
        A1C.append(" animationConfig: ");
        return AbstractC166997dE.A0v(this.A04, A1C);
    }
}
