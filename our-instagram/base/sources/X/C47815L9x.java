package X;

import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;

/* renamed from: X.L9x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47815L9x {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final WebPEncoderImpl A04;
    public final QuickPerformanceLogger A05;
    public final File A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;

    public C47815L9x(WebPEncoderImpl webPEncoderImpl, QuickPerformanceLogger quickPerformanceLogger, File file, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        C14360o3.A0B(webPEncoderImpl, 2);
        this.A05 = quickPerformanceLogger;
        this.A04 = webPEncoderImpl;
        this.A06 = file;
        this.A08 = num;
        this.A07 = num2;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A09 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47815L9x) {
                C47815L9x c47815L9x = (C47815L9x) obj;
                if (!C14360o3.A0K(this.A05, c47815L9x.A05) || !C14360o3.A0K(this.A04, c47815L9x.A04) || !C14360o3.A0K(this.A06, c47815L9x.A06) || !C14360o3.A0K(this.A08, c47815L9x.A08) || !C14360o3.A0K(this.A07, c47815L9x.A07) || this.A01 != c47815L9x.A01 || this.A03 != c47815L9x.A03 || this.A02 != c47815L9x.A02 || this.A00 != c47815L9x.A00 || this.A09 != c47815L9x.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A09, (((((((((((((AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A05)) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC166997dE.A0I(this.A07)) * 31) + this.A01) * 31) + this.A03) * 31) + this.A02) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("OdrParams(perfLogger=");
        A1C.append(this.A05);
        A1C.append(", webPEncoder=");
        A1C.append(this.A04);
        A1C.append(", destFile=");
        A1C.append(this.A06);
        A1C.append(", snapshotWidth=");
        A1C.append(this.A08);
        A1C.append(", snapshotHeight=");
        A1C.append(this.A07);
        A1C.append(", frameCount=");
        A1C.append(this.A01);
        A1C.append(", outputValidationStepSize=");
        A1C.append(this.A03);
        A1C.append(", frameCountBeforeCapture=");
        A1C.append(this.A02);
        A1C.append(", encodingQueueCapacity=");
        A1C.append(this.A00);
        A1C.append(", isAvatarLoadSelfEnabled=");
        return AbstractC25236BEt.A0a(A1C, this.A09);
    }
}
