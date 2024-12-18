package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class RhR {
    public static final /* synthetic */ RhR[] A00;
    public static final RhR A01;
    public static final RhR A02;
    public static final RhR A03;
    public static final RhR A04;
    public static final RhR A05;
    public static final RhR A06;
    public static final RhR A07;
    public static final RhR A08;
    public static final RhR A09;
    public static final RhR A0A;
    public static final RhR A0B;
    public static final RhR A0C;
    public static final RhR A0D;
    public static final RhR A0E;
    public static final RhR A0F;
    public static final RhR A0G;
    public static final RhR A0H;
    public static final RhR A0I;
    public static final RhR A0J;
    public static final RhR A0K;
    public static final RhR A0L;
    public static final RhR A0M;
    public static final RhR A0N;
    public static final RhR A0O;
    public static final RhR A0P;
    public static final RhR A0Q;
    public static final RhR A0R;
    public static final RhR A0S;
    public static final RhR A0T;

    static {
        RhR rhR = new RhR("SERVICE_DESTROY", 0);
        A0L = rhR;
        RhR rhR2 = new RhR("SERVICE_STOP", 1);
        A0M = rhR2;
        RhR rhR3 = new RhR("KICK_SHOULD_NOT_CONNECT", 2);
        A07 = rhR3;
        RhR rhR4 = new RhR("KICK_CONFIG_CHANGED", 3);
        A06 = rhR4;
        RhR rhR5 = new RhR("KEEPALIVE_SHOULD_NOT_CONNECT", 4);
        A05 = rhR5;
        RhR rhR6 = new RhR("EXPIRE_CONNECTION", 5);
        A04 = rhR6;
        RhR rhR7 = new RhR("OPERATION_TIMEOUT", 6);
        A09 = rhR7;
        RhR rhR8 = new RhR("PING_UNRECEIVED", 7);
        A0A = rhR8;
        RhR rhR9 = new RhR("READ_TIMEOUT", 8);
        A0I = rhR9;
        RhR rhR10 = new RhR("READ_EOF", 9);
        A0C = rhR10;
        RhR rhR11 = new RhR("READ_SOCKET", 10);
        A0G = rhR11;
        RhR rhR12 = new RhR("READ_SSL", 11);
        A0H = rhR12;
        RhR rhR13 = new RhR("READ_IO", 12);
        A0F = rhR13;
        RhR rhR14 = new RhR("READ_FORMAT", 13);
        A0E = rhR14;
        RhR rhR15 = new RhR("READ_FAILURE_UNCLASSIFIED", 14);
        A0D = rhR15;
        RhR rhR16 = new RhR("WRITE_TIMEOUT", 15);
        A0T = rhR16;
        RhR rhR17 = new RhR("WRITE_EOF", 16);
        A0O = rhR17;
        RhR rhR18 = new RhR("WRITE_SOCKET", 17);
        A0R = rhR18;
        RhR rhR19 = new RhR("WRITE_SSL", 18);
        A0S = rhR19;
        RhR rhR20 = new RhR("WRITE_IO", 19);
        A0Q = rhR20;
        RhR rhR21 = new RhR("WRITE_FAILURE_UNCLASSIFIED", 20);
        A0P = rhR21;
        RhR rhR22 = new RhR("UNKNOWN_RUNTIME", 21);
        A0N = rhR22;
        RhR rhR23 = new RhR("SEND_FAILURE", 22);
        A0J = rhR23;
        RhR rhR24 = new RhR("DISCONNECT_FROM_SERVER", 23);
        A03 = rhR24;
        RhR rhR25 = new RhR("SERIALIZER_FAILURE", 24);
        A0K = rhR25;
        RhR rhR26 = new RhR("PREEMPTIVE_RECONNECT_SUCCESS", 25);
        A0B = rhR26;
        RhR rhR27 = new RhR("ABORTED_PREEMPTIVE_RECONNECT", 26);
        A01 = rhR27;
        RhR rhR28 = new RhR("AUTH_CREDENTIALS_CHANGE", 27);
        A02 = rhR28;
        RhR rhR29 = new RhR("NETWORK_LOST", 28);
        A08 = rhR29;
        RhR[] rhRArr = new RhR[29];
        System.arraycopy(new RhR[]{rhR28, rhR29}, AbstractC31175DnJ.A1b(new RhR[]{rhR, rhR2, rhR3, rhR4, rhR5, rhR6, rhR7, rhR8, rhR9, rhR10, rhR11, rhR12, rhR13, rhR14, rhR15, rhR16, rhR17, rhR18, rhR19, rhR20, rhR21, rhR22, rhR23, rhR24, rhR25, rhR26, rhR27}, rhRArr) ? 1 : 0, rhRArr, 27, 2);
        A00 = rhRArr;
    }

    public static RhR A00(Throwable th) {
        if (!(th instanceof TimeoutException) && !(th instanceof SocketTimeoutException)) {
            if (th instanceof EOFException) {
                return A0O;
            }
            if (th instanceof SocketException) {
                return A0R;
            }
            if (th instanceof SSLException) {
                return A0S;
            }
            if (th instanceof IOException) {
                return A0Q;
            }
            return A0P;
        }
        return A0T;
    }

    public static RhR valueOf(String str) {
        return (RhR) Enum.valueOf(RhR.class, str);
    }

    public static RhR[] values() {
        return (RhR[]) A00.clone();
    }

    public RhR(String str, int i) {
    }
}
