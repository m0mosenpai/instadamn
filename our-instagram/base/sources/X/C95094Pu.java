package X;

/* renamed from: X.4Pu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95094Pu {
    public final Integer A00;
    public final long A01;
    public final long A02;
    public final EnumC122375gY A03;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("MqttChannelState{mConnectionState=");
        switch (this.A00.intValue()) {
            case 0:
                str = "CONNECTING";
                break;
            case 1:
                str = "CONNECTED";
                break;
            default:
                str = "DISCONNECTED";
                break;
        }
        sb.append(str);
        sb.append(", mDisconnectionReason=");
        sb.append(this.A03);
        sb.append(", mLastConnectionMs=");
        sb.append(this.A01);
        sb.append(", mLastDisconnectMs=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C95094Pu(EnumC122375gY enumC122375gY, Integer num, long j, long j2) {
        this.A00 = num;
        this.A03 = enumC122375gY;
        this.A01 = j;
        this.A02 = j2;
    }
}
