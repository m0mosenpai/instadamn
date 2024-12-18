package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.mobilenetwork.DomainInfoUtils;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class TFK implements C1G4 {
    public SUA A00;
    public TFU A01;
    public TFV A02;
    public C62563SGo A03;
    public TFT A04;
    public final PowerManager A05;
    public final LightweightQuickPerformanceLogger A06;
    public final SQ7 A07;
    public final boolean A0C;
    public final boolean A0D;
    public final AtomicLong A0B = new AtomicLong();
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final AtomicBoolean A09 = new AtomicBoolean();
    public final AtomicBoolean A0A = new AtomicBoolean();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        C60914RbT c60914RbT;
        String str;
        SQ7 sq7 = this.A07;
        C14360o3.A0B(c1qw, 0);
        if (C63188Sen.A0k) {
            sq7.A00.markerStart(677319650, c1qw.hashCode());
        }
        sq7.A00.markerStart(926483817, c1qw.hashCode());
        sq7.A02(c1qw, "sequence_number", this.A0B.getAndIncrement());
        sq7.A04(c1qw, "http_stack", "liger");
        sq7.A04(c1qw, TraceFieldType.HTTPMethod, AbstractC26611Qq.A00(c1qw.A07));
        java.net.URI uri = c1qw.A09;
        sq7.A04(c1qw, "redacted_url", C1RA.A00(uri));
        sq7.A04(c1qw, "request_type", c1qy.A09.A00);
        sq7.A05(c1qw, "started_in_background", C218914p.A08());
        String str2 = c1qy.A0E;
        if (str2 == null) {
            str2 = "undefined";
        }
        sq7.A04(c1qw, AbstractC111324zv.A00(5389), str2);
        PowerManager powerManager = this.A05;
        if (this.A0C && powerManager != null) {
            sq7.A05(c1qw, "is_interactive", powerManager.isInteractive());
            sq7.A05(c1qw, "is_power_save_mode", powerManager.isPowerSaveMode());
            sq7.A05(c1qw, "is_device_idle_mode", powerManager.isDeviceIdleMode());
        }
        String host = uri.getHost();
        if (host != null && DomainInfoUtils.isIgCdnOrFnaDomainNative(host) && this.A09.compareAndSet(false, true)) {
            sq7.A05(c1qw, "is_first_static_request", true);
        }
        String path = uri.getPath();
        if (path != null) {
            if (path.contains("feed/timeline") && this.A08.compareAndSet(false, true)) {
                str = "is_first_feed_request";
            } else if (path.contains("feed/reels_tray") && this.A0A.compareAndSet(false, true)) {
                str = "is_first_stories_request";
            }
            sq7.A05(c1qw, str, true);
        }
        C62563SGo c62563SGo = this.A03;
        TFW tfw = new TFW(this.A06, c26511Qg, c1qw);
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "LigerRequestExecutor";
        C18240vB c18240vB = new C18240vB(A00);
        TFX tfx = new TFX(tfw);
        if (c62563SGo.A02) {
            C60915RbU c60915RbU = new C60915RbU(c1qw, c1qy, tfx, c62563SGo, c18240vB);
            tfx.A00 = new C64465TFb(c60915RbU, c62563SGo);
            c60914RbT = c60915RbU;
        } else {
            c60914RbT = new C60914RbT(c1qw, c1qy, tfx, c62563SGo, c18240vB);
        }
        c18240vB.ATO(c60914RbT);
        return new TFJ(this.A00, c1qw, c1qy, tfx, sq7, this.A0D);
    }

    public TFK(Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, SUA sua, C63188Sen c63188Sen, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        PowerManager powerManager;
        TFV tfv = new TFV(lightweightQuickPerformanceLogger, c63188Sen, i, z4);
        this.A02 = tfv;
        TFU tfu = new TFU(lightweightQuickPerformanceLogger, tfv);
        this.A01 = tfu;
        TFT tft = new TFT(tfu);
        this.A04 = tft;
        this.A03 = new C62563SGo(tft, z);
        this.A06 = lightweightQuickPerformanceLogger;
        this.A07 = new SQ7(lightweightQuickPerformanceLogger);
        this.A0D = z2;
        this.A0C = z3;
        this.A00 = sua;
        if (z3) {
            powerManager = (PowerManager) context.getSystemService("power");
        } else {
            powerManager = null;
        }
        this.A05 = powerManager;
    }
}
