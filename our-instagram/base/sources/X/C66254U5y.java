package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;

/* renamed from: X.U5y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66254U5y implements InterfaceC131615wx {
    public double A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final QuickPerformanceLogger A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    @Override // X.InterfaceC131615wx
    public final void D6P(Map map, int i) {
        if (this.A06) {
            int i2 = this.A01;
            if (i2 != -1) {
                if (i < i2) {
                    AbstractC25241Le.A02("BloksRenderPerfCommitListener", "Frame version is decreasing");
                    return;
                }
                int i3 = (i - i2) - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                this.A04 += i3;
                if (i3 > 4) {
                    this.A00 += (i3 * 1.0d) / 4.0d;
                }
                this.A05 += this.A08 * r7;
            }
            this.A01 = i;
        }
    }

    public C66254U5y(QuickPerformanceLogger quickPerformanceLogger, String str, String str2, String str3, int i, int i2, int i3) {
        this.A08 = i;
        this.A09 = quickPerformanceLogger;
        this.A07 = i2;
        this.A0C = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A02 = i3;
        this.A03 = i3;
    }
}
