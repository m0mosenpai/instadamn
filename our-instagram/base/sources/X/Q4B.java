package X;

import android.util.Pair;

/* loaded from: classes10.dex */
public final class Q4B extends Pair implements InterfaceC65233TgP {
    public static Q4B A01 = new Q4B("", "", Long.MAX_VALUE);
    public final long A00;

    public Q4B(String str, String str2, long j) {
        super(str == null ? "" : str, str2 == null ? "" : str2);
        this.A00 = j;
    }

    @Override // android.util.Pair
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MqttDeviceIdAndSecret{id=");
        A1C.append((String) ((Pair) this).first);
        A1C.append("secret=");
        A1C.append((String) ((Pair) this).second);
        A1C.append("mTimestamp=");
        A1C.append(this.A00);
        return AbstractC167027dH.A0R(A1C);
    }
}
