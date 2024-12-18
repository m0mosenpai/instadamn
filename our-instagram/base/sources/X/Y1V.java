package X;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class Y1V {
    public static final Y1V A0W = new Y1V(new Object());
    public final android.net.Uri A00;
    public final Bundle A01;
    public final Boolean A02;
    public final Boolean A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final CharSequence A0A;
    public final CharSequence A0B;
    public final CharSequence A0C;
    public final CharSequence A0D;
    public final CharSequence A0E;
    public final CharSequence A0F;
    public final CharSequence A0G;
    public final Integer A0H;
    public final Integer A0I;

    @Deprecated
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final Integer A0P;
    public final Integer A0Q;
    public final Integer A0R;
    public final Integer A0S;
    public final Integer A0T;
    public final Long A0U;
    public final byte[] A0V;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Y1V y1v = (Y1V) obj;
            if (!Util.A0F(this.A0F, y1v.A0F) || !Util.A0F(this.A06, y1v.A06) || !Util.A0F(this.A05, y1v.A05) || !Util.A0F(this.A04, y1v.A04) || !Util.A0F(this.A0B, y1v.A0B) || !Util.A0F(this.A0E, y1v.A0E) || !Util.A0F(this.A0A, y1v.A0A) || !Util.A0F(this.A0U, y1v.A0U) || !Arrays.equals(this.A0V, y1v.A0V) || !Util.A0F(this.A0H, y1v.A0H) || !Util.A0F(this.A00, y1v.A00) || !Util.A0F(this.A0T, y1v.A0T) || !Util.A0F(this.A0S, y1v.A0S) || !Util.A0F(this.A0J, y1v.A0J) || !Util.A0F(this.A02, y1v.A02) || !Util.A0F(this.A03, y1v.A03) || !Util.A0F(this.A0N, y1v.A0N) || !Util.A0F(this.A0M, y1v.A0M) || !Util.A0F(this.A0L, y1v.A0L) || !Util.A0F(this.A0Q, y1v.A0Q) || !Util.A0F(this.A0P, y1v.A0P) || !Util.A0F(this.A0O, y1v.A0O) || !Util.A0F(this.A0G, y1v.A0G) || !Util.A0F(this.A08, y1v.A08) || !Util.A0F(this.A09, y1v.A09) || !Util.A0F(this.A0I, y1v.A0I) || !Util.A0F(this.A0R, y1v.A0R) || !Util.A0F(this.A0C, y1v.A0C) || !Util.A0F(this.A07, y1v.A07) || !Util.A0F(this.A0D, y1v.A0D) || !Util.A0F(this.A0K, y1v.A0K) || AbstractC25229BEm.A1Z(this.A01) != AbstractC25229BEm.A1Z(y1v.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[34];
        boolean z = false;
        System.arraycopy(new Object[]{this.A0F, this.A06, this.A05, this.A04, this.A0B, this.A0E, this.A0A, this.A0U, null, null, Integer.valueOf(Arrays.hashCode(this.A0V)), this.A0H, this.A00, this.A0T, this.A0S, this.A0J, this.A02, this.A03, this.A0N, this.A0M, this.A0L, this.A0Q, this.A0P, this.A0O, this.A0G, this.A08, this.A09}, 0, objArr, 0, 27);
        Integer num = this.A0I;
        Integer num2 = this.A0R;
        CharSequence charSequence = this.A0C;
        CharSequence charSequence2 = this.A07;
        CharSequence charSequence3 = this.A0D;
        Integer num3 = this.A0K;
        if (this.A01 == null) {
            z = true;
        }
        System.arraycopy(new Object[]{num, num2, charSequence, charSequence2, charSequence3, num3, Boolean.valueOf(z)}, 0, objArr, 27, 7);
        return Arrays.hashCode(objArr);
    }

    public Y1V(Y15 y15) {
        int i;
        Boolean bool = y15.A02;
        Integer num = y15.A0J;
        Integer num2 = y15.A0K;
        int i2 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        case 14:
                        case Process.SIGTERM /* 15 */:
                        case 16:
                        case 17:
                        case 18:
                        case Process.SIGSTOP /* 19 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            i2 = 1;
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        case 30:
                        default:
                            i2 = 0;
                            break;
                        case 21:
                            i2 = 2;
                            break;
                        case 22:
                            i2 = 3;
                            break;
                        case 23:
                            i2 = 4;
                            break;
                        case 24:
                            i2 = 5;
                            break;
                        case 25:
                            i2 = 6;
                            break;
                    }
                }
                num = Integer.valueOf(i2);
            }
        } else if (num != null) {
            int intValue = num.intValue();
            bool = Boolean.valueOf(intValue != -1);
            if (bool.booleanValue() && num2 == null) {
                switch (intValue) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = 21;
                        break;
                    case 3:
                        i = 22;
                        break;
                    case 4:
                        i = 23;
                        break;
                    case 5:
                        i = 24;
                        break;
                    case 6:
                        i = 25;
                        break;
                    default:
                        i = 20;
                        break;
                }
                num2 = Integer.valueOf(i);
            }
        }
        this.A0F = y15.A0F;
        this.A06 = y15.A06;
        this.A05 = y15.A05;
        this.A04 = y15.A04;
        this.A0B = y15.A0B;
        this.A0E = y15.A0E;
        this.A0A = y15.A0A;
        this.A0U = y15.A0U;
        this.A0V = y15.A0V;
        this.A0H = y15.A0H;
        this.A00 = y15.A00;
        this.A0T = y15.A0T;
        this.A0S = y15.A0S;
        this.A0J = num;
        this.A02 = bool;
        this.A03 = y15.A03;
        this.A0N = y15.A0N;
        this.A0M = y15.A0M;
        this.A0L = y15.A0L;
        this.A0Q = y15.A0Q;
        this.A0P = y15.A0P;
        this.A0O = y15.A0O;
        this.A0G = y15.A0G;
        this.A08 = y15.A08;
        this.A09 = y15.A09;
        this.A0I = y15.A0I;
        this.A0R = y15.A0R;
        this.A0C = y15.A0C;
        this.A07 = y15.A07;
        this.A0D = y15.A0D;
        this.A0K = num2;
        this.A01 = y15.A01;
    }
}
