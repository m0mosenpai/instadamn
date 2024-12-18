package X;

import android.media.CamcorderProfile;
import android.os.SystemClock;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.FileDescriptor;

/* loaded from: classes12.dex */
public final class Y14 {
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Y1s A0A;
    public FileDescriptor A0B;
    public FileDescriptor A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public boolean A0I = true;
    public int A00 = 0;
    public int A05 = 0;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -1;
    public long A09 = -1;

    public Y14(FileDescriptor fileDescriptor, String str, int i, int i2, int i3, int i4) {
        if (str == null && fileDescriptor == null) {
            throw AbstractC166987dD.A12("Both file path or file descriptor must be not be null, one must be set.");
        }
        if (i != 0) {
            if (i2 != 0) {
                this.A0G = str;
                this.A0B = fileDescriptor;
                this.A0H = null;
                this.A0C = null;
                this.A03 = i;
                this.A02 = i2;
                this.A04 = i3;
                this.A01 = i4;
                return;
            }
            throw AbstractC166987dD.A12("Frame height must be greater 0");
        }
        throw AbstractC166987dD.A12("Frame width must be greater 0");
    }

    public static Y1s A00(CamcorderProfile camcorderProfile, Y14 y14) {
        y14.A01(Y1s.A0N, Integer.valueOf(camcorderProfile.audioCodec));
        y14.A01(Y1s.A0Z, Integer.valueOf(camcorderProfile.videoCodec));
        y14.A01(Y1s.A0W, Long.valueOf(SystemClock.elapsedRealtime()));
        return new Y1s(y14);
    }

    public final void A01(Xl2 xl2, Object obj) {
        switch (xl2.A00) {
            case 6:
                this.A0I = AbstractC166987dD.A1a(obj);
                return;
            case 7:
                this.A00 = AbstractC166987dD.A0H(obj);
                return;
            case 8:
                this.A05 = AbstractC166987dD.A0H(obj);
                return;
            case 9:
                this.A0D = (Integer) obj;
                return;
            case 10:
                this.A0E = (Integer) obj;
                return;
            case 11:
                this.A0F = (Integer) obj;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                this.A06 = AbstractC166987dD.A0N(obj);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                this.A07 = AbstractC166987dD.A0N(obj);
                return;
            case 14:
                this.A08 = AbstractC166987dD.A0N(obj);
                return;
            case Process.SIGTERM /* 15 */:
                this.A09 = AbstractC166987dD.A0N(obj);
                return;
            default:
                this.A0A = (Y1s) obj;
                return;
        }
    }
}
