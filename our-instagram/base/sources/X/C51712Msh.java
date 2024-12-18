package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.Msh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51712Msh extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Integer A06;

    public C51712Msh(Integer num, int i, int i2, int i3, int i4, int i5, int i6) {
        C14360o3.A0B(num, 1);
        this.A06 = num;
        this.A05 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A00 = i5;
        this.A01 = i6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51712Msh) {
                C51712Msh c51712Msh = (C51712Msh) obj;
                if (this.A06 != c51712Msh.A06 || this.A05 != c51712Msh.A05 || this.A03 != c51712Msh.A03 || this.A02 != c51712Msh.A02 || this.A04 != c51712Msh.A04 || this.A00 != c51712Msh.A00 || this.A01 != c51712Msh.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C0Zx c0Zx, C51712Msh c51712Msh) {
        c0Zx.A06("codec", ONI.A01(c51712Msh.A06));
        c0Zx.A05(IgReactMediaPickerNativeModule.WIDTH, Long.valueOf(c51712Msh.A05));
        c0Zx.A05(IgReactMediaPickerNativeModule.HEIGHT, Long.valueOf(c51712Msh.A03));
        c0Zx.A05("frame_rate", Long.valueOf(c51712Msh.A02));
        c0Zx.A05("i_frame_interval", Long.valueOf(c51712Msh.A04));
    }

    public final int hashCode() {
        Integer num = this.A06;
        return (((((((((((AbstractC25230BEn.A0C(num, ONI.A01(num)) * 31) + this.A05) * 31) + this.A03) * 31) + this.A02) * 31) + this.A04) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VideoFormat(codec=");
        Integer num = this.A06;
        if (num != null) {
            str = ONI.A01(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", width=");
        MSX.A1O(A1C, this.A05);
        A1C.append(this.A03);
        A1C.append(", frameRate=");
        A1C.append(this.A02);
        A1C.append(", iFrameInterval=");
        A1C.append(this.A04);
        A1C.append(", bitRate=");
        A1C.append(this.A00);
        A1C.append(", captureFrameRate=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
