package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.FileDescriptor;

/* loaded from: classes12.dex */
public final class Y1s {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Y1s A0A;
    public final FileDescriptor A0B;
    public final FileDescriptor A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public static final Xl2 A0S = new Xl2(0);
    public static final C212689bb A0L = new Xl2(2);
    public static final C212689bb A0K = new Xl2(3);
    public static final C212689bb A0M = new Xl2(4);
    public static final C212689bb A0J = new Xl2(5);
    public static final Xl2 A0T = new Xl2(6);
    public static final Xl2 A0N = new Xl2(7);
    public static final Xl2 A0Z = new Xl2(8);
    public static final Xl2 A0O = new Xl2(9);
    public static final Xl2 A0P = new Xl2(10);
    public static final Xl2 A0Q = new Xl2(11);
    public static final Xl2 A0V = new Xl2(12);
    public static final Xl2 A0W = new Xl2(13);
    public static final Xl2 A0X = new Xl2(14);
    public static final Xl2 A0Y = new Xl2(15);
    public static final Xl2 A0R = new Xl2(16);
    public static final Xl2 A0U = new Xl2(17);

    public final Integer A00(C212689bb c212689bb) {
        int i;
        int i2 = c212689bb.A00;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    i = this.A05;
                } else {
                    i = this.A08;
                }
            } else {
                i = this.A06;
            }
        } else {
            i = this.A07;
        }
        return Integer.valueOf(i);
    }

    public final Object A01(Xl2 xl2) {
        long j;
        int i = xl2.A00;
        if (i != 0) {
            if (i != 1) {
                switch (i) {
                    case 6:
                        return Boolean.valueOf(this.A0I);
                    case 7:
                        return Integer.valueOf(this.A04);
                    case 8:
                        return Integer.valueOf(this.A09);
                    case 9:
                        return this.A0D;
                    case 10:
                        return this.A0E;
                    case 11:
                        return this.A0F;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        j = this.A00;
                        break;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        j = this.A01;
                        break;
                    case 14:
                        j = this.A02;
                        break;
                    case Process.SIGTERM /* 15 */:
                        j = this.A03;
                        break;
                    case 16:
                        return this.A0A;
                    case 17:
                        return this.A0H;
                    default:
                        throw AbstractC166987dD.A18(AnonymousClass001.A0O("Invalid required video capture result key: ", i));
                }
                return Long.valueOf(j);
            }
            return this.A0B;
        }
        return this.A0G;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    public final void A02(Xl2 xl2, Object obj) {
        String str;
        String str2;
        switch (xl2.A00) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                if (this.A00 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start request time was already set, cannot set it again";
                    AbstractC175037qd.A02(str, str2);
                    return;
                }
                this.A00 = AbstractC166987dD.A0N(obj);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                if (this.A01 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start time was already set, cannot set it again";
                    AbstractC175037qd.A02(str, str2);
                    return;
                }
                this.A01 = AbstractC166987dD.A0N(obj);
                return;
            case 14:
                if (this.A02 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop request time was already set, cannot set it again";
                    AbstractC175037qd.A02(str, str2);
                    return;
                }
                this.A02 = AbstractC166987dD.A0N(obj);
                return;
            default:
                if (this.A03 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop time was already set, cannot set it again";
                    AbstractC175037qd.A02(str, str2);
                    return;
                }
                this.A03 = AbstractC166987dD.A0N(obj);
                return;
        }
    }

    public Y1s(Y14 y14) {
        String str = y14.A0G;
        if (str == null && y14.A0B == null) {
            throw AbstractC166987dD.A12("one of file path or FileDescriptor must be set");
        }
        this.A0G = str;
        this.A0B = y14.A0B;
        this.A0H = y14.A0H;
        this.A0C = y14.A0C;
        this.A07 = y14.A03;
        this.A06 = y14.A02;
        this.A08 = y14.A04;
        this.A05 = y14.A01;
        this.A0I = y14.A0I;
        this.A04 = y14.A00;
        this.A09 = y14.A05;
        this.A0D = y14.A0D;
        this.A0E = y14.A0E;
        this.A0F = y14.A0F;
        this.A00 = y14.A06;
        this.A01 = y14.A07;
        this.A02 = y14.A08;
        this.A03 = y14.A09;
        this.A0A = y14.A0A;
    }
}
