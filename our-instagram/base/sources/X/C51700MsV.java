package X;

import com.facebook.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.MsV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51700MsV extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C51700MsV(C51753Mtc c51753Mtc, Integer num, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2) {
        this.A00 = 1;
        num = (i2 & 4) != 0 ? null : num;
        int i3 = (i2 & 8) != 0 ? R.attr.igdsPrimaryIcon : 0;
        c51753Mtc = (i2 & 16) != 0 ? null : c51753Mtc;
        interfaceC16660sJ2 = (i2 & 32) != 0 ? null : interfaceC16660sJ2;
        this.A00 = 1;
        this.A01 = i;
        this.A07 = interfaceC16660sJ;
        this.A05 = num;
        this.A03 = i3;
        this.A04 = c51753Mtc;
        this.A06 = interfaceC16660sJ2;
        this.A02 = i;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C51700MsV) {
                    C51700MsV c51700MsV = (C51700MsV) obj;
                    if (c51700MsV.A00 != 1 || this.A01 != c51700MsV.A01 || !C14360o3.A0K(this.A07, c51700MsV.A07) || !C14360o3.A0K(this.A05, c51700MsV.A05) || this.A03 != c51700MsV.A03 || !C14360o3.A0K(this.A04, c51700MsV.A04) || !C14360o3.A0K(this.A06, c51700MsV.A06)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C51700MsV)) {
                return false;
            }
            C51700MsV c51700MsV2 = (C51700MsV) obj;
            if (c51700MsV2.A00 != 0 || !C14360o3.A0K(this.A07, c51700MsV2.A07) || !C14360o3.A0K(this.A04, c51700MsV2.A04) || !C14360o3.A0K(this.A06, c51700MsV2.A06) || this.A01 != c51700MsV2.A01 || this.A03 != c51700MsV2.A03 || this.A02 != c51700MsV2.A02 || this.A05 != c51700MsV2.A05) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        int A00;
        if (this.A00 != 0) {
            A0J = (((((AbstractC166997dE.A0J(this.A07, this.A01 * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + this.A03) * 31) + AbstractC167017dG.A0M(this.A04)) * 31;
            A00 = AbstractC166997dE.A0I(this.A06);
        } else {
            A0J = (((((AbstractC166997dE.A0J(this.A06, ((AbstractC167017dG.A0M(this.A07) * 31) + AbstractC166997dE.A0I(this.A04)) * 31) + this.A01) * 31) + this.A03) * 31) + this.A02) * 31;
            A00 = AbstractC53905Nse.A00((Integer) this.A05);
        }
        return A0J + A00;
    }

    public C51700MsV(TargetViewSizeProvider targetViewSizeProvider, AudioOverlayTrack audioOverlayTrack, C195868lW c195868lW, Integer num, int i, int i2, int i3) {
        this.A00 = 0;
        this.A07 = c195868lW;
        this.A04 = audioOverlayTrack;
        this.A06 = targetViewSizeProvider;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A05 = num;
    }
}
