package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.video.heroplayer.common.MosScoreCalculation;
import com.instagram.video.player.common.LiveVideoDebugStatsView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.UBs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66354UBs extends FrameLayout {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Point A07;
    public ViewGroup A08;
    public VgL A09;
    public LiveVideoDebugStatsView A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public int A0F;
    public CheckBox A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public EnumC440821q A0M;
    public EnumC440821q A0N;
    public C98704bq A0O;
    public C98704bq A0P;
    public C4AK A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public final C68857VdD A0Z;
    public final C69364VmA A0a;
    public final AtomicReference A0b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66354UBs(Context context, C68857VdD c68857VdD) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A0Z = c68857VdD;
        this.A0b = new AtomicReference(C16930sl.A00);
        this.A0C = "NO_INIT";
        EnumC440821q enumC440821q = EnumC440821q.A06;
        this.A0N = enumC440821q;
        this.A0M = enumC440821q;
        this.A0V = "Undefined";
        this.A0W = "";
        LayoutInflater.from(context).inflate(R.layout.player_debug_view, this);
        this.A08 = (ViewGroup) findViewById(R.id.container_view);
        this.A0J = (TextView) findViewById(R.id.info_text);
        this.A0I = (TextView) findViewById(R.id.error_text);
        this.A0H = (TextView) findViewById(R.id.compact_info_text);
        this.A0L = (TextView) findViewById(R.id.set_quality_button);
        CheckBox checkBox = (CheckBox) findViewById(R.id.background_checkbox);
        this.A0G = checkBox;
        if (checkBox != null) {
            checkBox.setChecked(false);
            this.A08.setBackgroundColor(0);
            checkBox.setOnCheckedChangeListener(new C70265WOs(this, 5));
        }
        this.A0A = (LiveVideoDebugStatsView) findViewById(R.id.live_video_debug_stats);
        this.A0a = new C69364VmA(this);
        TextView textView = (TextView) findViewById(R.id.set_bandwidth_button);
        this.A0K = textView;
        textView.setOnClickListener(new ViewOnClickListenerC48073LPy(this, 61));
        this.A0H.setOnClickListener(new WNS(this, 28));
        C17280tP A00 = C17280tP.A4E.A00();
        if (AbstractC167017dG.A1b(A00, A00.A2u, C17280tP.A4G, 90)) {
            A02(this);
        } else {
            A00(this);
            this.A0J.setOnClickListener(new WNS(this, 29));
        }
        A03();
    }

    public final void A03() {
        this.A0O = null;
        this.A0P = null;
        this.A0B = null;
        this.A0F = -1;
        this.A02 = -1;
        this.A0T = null;
        this.A0S = null;
        this.A0U = null;
        this.A05 = -1L;
        this.A04 = -1L;
        this.A06 = -1L;
        this.A01 = -1;
        this.A0X = "";
        C69364VmA c69364VmA = this.A0a;
        c69364VmA.A01 = 0L;
        int i = 0;
        c69364VmA.A00 = 0;
        c69364VmA.A02 = false;
        do {
            c69364VmA.A03[i] = 0;
            c69364VmA.A04[i] = 0;
            i++;
        } while (i < 3);
    }

    public final void setExtraFeatureDebugInfo(String str) {
        C14360o3.A0B(str, 0);
        this.A0R = str;
    }

    public final void setFormat(C98704bq c98704bq) {
        C14360o3.A0B(c98704bq, 0);
        String str = c98704bq.A0E;
        C14360o3.A06(str);
        if (AbstractC001900j.A0a(str, MediaStreamTrack.VIDEO_TRACK_KIND, false)) {
            this.A0P = c98704bq;
        }
        if (AbstractC001900j.A0a(str, MediaStreamTrack.AUDIO_TRACK_KIND, false)) {
            this.A0O = c98704bq;
        }
    }

    public final void setLatencyDecision(C4TR c4tr) {
        C14360o3.A0B(c4tr, 0);
        this.A0N = c4tr.A01;
        EnumC440821q enumC440821q = c4tr.A00;
        if (enumC440821q == null) {
            enumC440821q = EnumC440821q.A06;
        }
        this.A0M = enumC440821q;
        String str = c4tr.A02;
        if (str == null) {
            str = "Undefined";
        }
        this.A0V = str;
    }

    public final void setPlayerId(String str) {
        C14360o3.A0B(str, 0);
        this.A0W = str;
    }

    public final void setVideoSource(C4AN c4an) {
        String str;
        if (c4an == null) {
            this.A0F = -1;
            this.A0P = null;
            this.A0Q = null;
            return;
        }
        C4AK c4ak = c4an.A07;
        this.A0Q = c4ak;
        this.A0X = c4an.A0G;
        android.net.Uri uri = c4an.A05;
        if (uri != null) {
            str = uri.getPath();
        } else {
            str = null;
        }
        int i = 0;
        if (!c4an.A03() || str == null ? c4an.A09 != null : AbstractC001900j.A0a(str, "-abr", false)) {
            i = 1;
        }
        this.A0F = i;
        if (c4ak != C4AK.PROGRESSIVE) {
            return;
        }
        android.net.Uri uri2 = c4an.A05;
        if (!"file".equals(uri2 != null ? uri2.getScheme() : null)) {
            return;
        }
        this.A0Y = true;
    }

    public static final void A00(C66354UBs c66354UBs) {
        c66354UBs.A0L.setVisibility(4);
        CheckBox checkBox = c66354UBs.A0G;
        checkBox.setVisibility(4);
        c66354UBs.A0K.setVisibility(4);
        c66354UBs.A0J.setVisibility(4);
        c66354UBs.A0I.setVisibility(4);
        c66354UBs.A0H.setVisibility(0);
        checkBox.setChecked(false);
    }

    private final List getAvailableCustomQualities() {
        List list = (List) this.A0b.get();
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    private final float getBufferedDurationInSec() {
        long j = this.A04;
        if (j > 0) {
            long j2 = this.A05;
            if (j2 > 0) {
                return ((float) (j - j2)) / 1000.0f;
            }
            return -1.0f;
        }
        return -1.0f;
    }

    private final float getCurrentPositionInSec() {
        long j = this.A05;
        if (j > 0) {
            return ((float) j) / 1000.0f;
        }
        return -1.0f;
    }

    private final StringBuilder getVideoQualityMosText() {
        int i;
        int i2;
        Float f;
        Float f2;
        StringBuilder sb = new StringBuilder();
        C98704bq c98704bq = this.A0P;
        if (c98704bq != null) {
            Point point = this.A07;
            if (point != null) {
                i = point.x;
            } else {
                i = getResources().getDisplayMetrics().widthPixels;
            }
            Point point2 = this.A07;
            if (point2 != null) {
                i2 = point2.y;
            } else {
                i2 = getResources().getDisplayMetrics().heightPixels;
            }
            String str = c98704bq.A0C;
            if (str != null) {
                f = Float.valueOf(MosScoreCalculation.A01(str, i));
            } else {
                f = null;
            }
            float A02 = MosScoreCalculation.A02(c98704bq.A09, i, i2);
            float A022 = MosScoreCalculation.A02(c98704bq.A08, i, i2);
            Float valueOf = Float.valueOf(A02);
            if (f != null && valueOf != null) {
                f2 = Float.valueOf(new BigDecimal(String.valueOf(((r2 * 1.4148d) - 70.65999d) + (f.floatValue() * 0.005351d * A02))).setScale(2, RoundingMode.UP).floatValue());
            } else {
                f2 = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mos=");
            sb2.append(A02);
            sb2.append(" csvqm=");
            sb2.append(A022);
            sb2.append(" uumos=");
            sb2.append(f);
            sb.append(AbstractC167017dG.A0n(f2, " overallMos=", sb2));
        }
        return sb;
    }

    public final void A04() {
        String str;
        float f;
        long j;
        long j2;
        String str2;
        int i;
        String A00 = AbstractC111324zv.A00(3648);
        StringBuilder sb = new StringBuilder();
        sb.append("playerVersion: ");
        sb.append(AnonymousClass001.A0g(A00, " | PlayerId: ", this.A0W));
        sb.append("\n");
        String str3 = this.A0X;
        if (str3 != null) {
            sb.append(AnonymousClass001.A0S("video id: ", str3, '\n'));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("is warmed: ");
        sb2.append(this.A0E);
        sb2.append(", abr: ");
        sb2.append(this.A0F);
        sb2.append('\n');
        AbstractC58318PtA.A1V(sb, sb2);
        String str4 = "NO_INIT";
        if (!C14360o3.A0K(this.A0C, "NO_INIT")) {
            if (AbstractC001900j.A0a(this.A0C, "SurfaceTexture", false)) {
                i = 1814;
            } else {
                i = 1805;
            }
            str4 = AbstractC111324zv.A00(i);
        }
        sb.append(AnonymousClass001.A0S("View used: ", str4, '\n'));
        Point point = this.A07;
        if (point != null) {
            sb.append(AnonymousClass001.A0X("view size: ", " x ", '\n', point.x, point.y));
        }
        C98704bq c98704bq = this.A0P;
        if (c98704bq != null) {
            sb.append(AnonymousClass001.A0X("video size: ", " x ", '\n', c98704bq.A05, c98704bq.A04));
        }
        C69364VmA c69364VmA = this.A0a;
        long[] jArr = c69364VmA.A04;
        sb.append(StringFormatUtil.formatStrLocaleSafe("Stalls: init: %d, buffering: %d, count: %d, total: %d\n", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]), Integer.valueOf(c69364VmA.A00), Long.valueOf(c69364VmA.A01)));
        int i2 = this.A01;
        if (i2 > 0) {
            sb.append(AnonymousClass001.A0c("injected delay: ", " ms\n", i2));
        }
        if (c98704bq != null) {
            sb.append("\nVideo:\n");
            sb.append(AnonymousClass001.A0c("bitrate: ", " kbps\n", c98704bq.A02 / 1000));
            if (this.A0Y) {
                str2 = "original";
            } else {
                str2 = c98704bq.A0D;
            }
            sb.append(AnonymousClass001.A0S("rep id: ", str2, '\n'));
        }
        int i3 = this.A02;
        if (i3 >= 0) {
            sb.append(AnonymousClass001.A0c("bandwidth: ", " kbps\n", i3));
        }
        sb.append(AnonymousClass001.A0Z("current pos: ", "s, ", getCurrentPositionInSec()));
        sb.append(AnonymousClass001.A0Z("buffered duration: ", "s\n", getBufferedDurationInSec()));
        if (this.A06 > 0) {
            sb.append("Live Data:");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("\nPlayback Speed: ");
            sb3.append(this.A00);
            sb3.append(" Buffered Duration: ");
            sb3.append(this.A03);
            AbstractC58318PtA.A1V(sb, sb3);
            EnumC440821q enumC440821q = this.A0N;
            if (enumC440821q != EnumC440821q.A06) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" Target:");
                sb4.append(enumC440821q);
                sb4.append(", Current:");
                sb4.append(this.A0M);
                sb4.append(", reason:");
                sb4.append(this.A0V);
                AbstractC58318PtA.A1V(sb, sb4);
            }
            long j3 = this.A04;
            if (j3 > 0) {
                f = ((float) (this.A06 - j3)) / 1000.0f;
            } else {
                f = -1.0f;
            }
            sb.append(AbstractC13670mt.A06("\nedge: %.1f\n", Float.valueOf(f)));
            VgL vgL = this.A09;
            if (vgL != null) {
                j = vgL.A01;
                j2 = vgL.A00;
            } else {
                j = 0;
                j2 = 0;
            }
            LiveVideoDebugStatsView liveVideoDebugStatsView = this.A0A;
            long j4 = this.A05;
            long j5 = this.A04;
            long j6 = this.A06;
            if (liveVideoDebugStatsView.getVisibility() != 0) {
                liveVideoDebugStatsView.setVisibility(0);
            }
            liveVideoDebugStatsView.A06 = j;
            liveVideoDebugStatsView.A03 = j2;
            liveVideoDebugStatsView.A04 = j4;
            liveVideoDebugStatsView.A02 = j5;
            liveVideoDebugStatsView.A05 = j6;
        }
        C98704bq c98704bq2 = this.A0P;
        if (c98704bq2 != null) {
            sb.append(AnonymousClass001.A0S("format.codecs: ", c98704bq2.A06, '\n'));
        }
        String str5 = this.A0B;
        if (str5 != null) {
            sb.append(AnonymousClass001.A0S("decoder name: ", str5, '\n'));
        }
        C4AK c4ak = this.A0Q;
        if (c4ak != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("source type: ");
            sb5.append(c4ak);
            sb5.append('\n');
            AbstractC58318PtA.A1V(sb, sb5);
        }
        C98704bq c98704bq3 = this.A0P;
        if (c98704bq3 != null) {
            sb.append(AnonymousClass001.A0S("selected quality: ", c98704bq3.A0B, '\n'));
            StringBuilder sb6 = new StringBuilder();
            sb6.append((Object) getVideoQualityMosText());
            sb6.append('\n');
            AbstractC58318PtA.A1V(sb, sb6);
            sb.append(AnonymousClass001.A0S("encoding tag: ", c98704bq3.A07, '\n'));
        }
        List availableCustomQualities = getAvailableCustomQualities();
        if (!availableCustomQualities.isEmpty()) {
            sb.append(AnonymousClass001.A0S("qualities: ", AbstractC31175DnJ.A0a(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, availableCustomQualities), '\n'));
        }
        C98704bq c98704bq4 = this.A0O;
        if (c98704bq4 != null) {
            sb.append("\nAudio:\n");
            sb.append(AnonymousClass001.A0S("audio codecs: ", c98704bq4.A06, '\n'));
            sb.append(AnonymousClass001.A0S("audio rep id: ", c98704bq4.A0D, '\n'));
            sb.append(AnonymousClass001.A0c("audio bitrate: ", " kbps\n", c98704bq4.A02 / 1000));
            sb.append(AnonymousClass001.A0I("audio sample rate: ", '\n', c98704bq4.A01));
            sb.append(AnonymousClass001.A0I("audio channel: ", '\n', c98704bq4.A00));
            sb.append(AnonymousClass001.A0S("audio encoding tag: ", c98704bq4.A07, '\n'));
        }
        C0K8.A0P("ig4a.video-overlay", "%s", AbstractC002300n.A0d(AbstractC166987dD.A19(sb), "\n", ";", false));
        TextView textView = this.A0J;
        textView.setText(sb);
        float f2 = 0.5f;
        if (this.A0D) {
            f2 = 1.0f;
        }
        textView.setAlpha(f2);
        float f3 = 50.0f;
        if (this.A0D) {
            f3 = 0.0f;
        }
        textView.setTranslationY(f3);
        StringBuilder sb7 = new StringBuilder();
        String str6 = this.A0T;
        if (str6 != null) {
            sb7.append(str6);
        }
        String str7 = this.A0S;
        if (str7 != null) {
            sb7.append(" \n");
            sb7.append(str7);
        }
        String str8 = this.A0U;
        if (str8 != null) {
            sb7.append(" \n");
            sb7.append(str8);
        }
        this.A0I.setText(sb7);
        StringBuilder sb8 = new StringBuilder();
        C98704bq c98704bq5 = this.A0P;
        if (c98704bq5 != null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("video: ");
            sb9.append(c98704bq5.A05);
            sb9.append('x');
            sb9.append(c98704bq5.A04);
            sb9.append(' ');
            sb9.append(c98704bq5.A02 / 1000);
            sb9.append("kb/s abr:");
            sb9.append(this.A0F);
            AbstractC58318PtA.A1V(sb8, sb9);
            String str9 = c98704bq5.A07;
            if (str9 != null) {
                sb8.append(AnonymousClass001.A0S(" (", AbstractC001900j.A0G("_v1", AbstractC001900j.A0F("dash_", str9)), ')'));
            }
            sb8.append("\n");
            StringBuilder sb10 = new StringBuilder();
            sb10.append((Object) getVideoQualityMosText());
            sb10.append('\n');
            AbstractC58318PtA.A1V(sb8, sb10);
        }
        C98704bq c98704bq6 = this.A0O;
        if (c98704bq6 != null) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append("audio: ");
            if (c98704bq6.A00 == 1) {
                str = "mono";
            } else {
                str = "stereo";
            }
            sb11.append(str);
            sb11.append(' ');
            sb11.append(c98704bq6.A01);
            sb11.append("hz ");
            sb11.append(c98704bq6.A02 / 1000);
            sb11.append("kb/s");
            AbstractC58318PtA.A1V(sb8, sb11);
            String str10 = c98704bq6.A07;
            if (str10 != null) {
                sb8.append(AnonymousClass001.A0S(" (", AbstractC001900j.A0G("_v1", AbstractC001900j.A0F("dash_", str10)), ')'));
            }
            sb8.append("\n");
        }
        Point point2 = this.A07;
        if (point2 != null) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append("view: ");
            sb12.append(point2.x);
            sb12.append('x');
            sb12.append(point2.y);
            sb12.append(' ');
            sb12.append(str4);
            AbstractC58318PtA.A1V(sb8, sb12);
            sb8.append("\n");
        }
        String str11 = this.A0R;
        if (str11 != null) {
            sb8.append(str11);
        }
        this.A0H.setText(sb8);
    }

    public final void A05(Integer num) {
        C69364VmA c69364VmA = this.A0a;
        long[] jArr = c69364VmA.A03;
        int intValue = num.intValue();
        long j = jArr[intValue];
        if (j > 0) {
            c69364VmA.A02 = true;
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            c69364VmA.A01 += elapsedRealtime;
            long[] jArr2 = c69364VmA.A04;
            jArr2[intValue] = jArr2[intValue] + elapsedRealtime;
            jArr[intValue] = 0;
            c69364VmA.A00++;
        }
    }

    public final String getDecoderName() {
        return this.A0B;
    }

    public final int getInjectedStartDelayMs() {
        return this.A01;
    }

    public final VgL getLiveVideoDebugStats() {
        return this.A09;
    }

    public final String getPlayerId() {
        return this.A0W;
    }

    public final long getPreferredTimePeriod() {
        if (this.A06 > 0) {
            return this.A0A.A09;
        }
        return -1L;
    }

    public final int getThroughputKbps() {
        return this.A02;
    }

    public final boolean getWasWarmed() {
        return this.A0E;
    }

    public final void setCustomQualities(List list) {
        if (list != null) {
            AtomicReference atomicReference = this.A0b;
            List list2 = (List) atomicReference.get();
            if (list2 == null || list.size() != list2.size() || !list2.containsAll(list)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                atomicReference.set(arrayList);
                this.A0L.setOnClickListener(new WNS(this, 30));
            }
        }
    }

    public final void setErrorOrWarningCause(String str, String str2, String str3) {
        this.A0T = str;
        this.A0S = str2;
        this.A0U = str3;
    }

    public static final void A01(C66354UBs c66354UBs) {
        String str;
        String[] A1b = AbstractC31173DnH.A1b(c66354UBs.getAvailableCustomQualities(), 0);
        if (A1b.length == 0) {
            str = "No Available Qualities";
        } else {
            str = "Set Quality";
        }
        C193328hC c193328hC = new C193328hC(c66354UBs.getContext());
        c193328hC.A0f(new DialogInterfaceOnClickListenerC70206WHe(15, A1b, c66354UBs), A1b);
        c193328hC.A0r(str);
        c193328hC.A0s(true);
        c193328hC.A0t(true);
        Dialog A02 = c193328hC.A02();
        Window window = A02.getWindow();
        if (window != null) {
            window.setType(2038);
        }
        C0fJ.A00(A02);
    }

    public static final void A02(C66354UBs c66354UBs) {
        boolean canDrawOverlays = Settings.canDrawOverlays(c66354UBs.getContext());
        TextView textView = c66354UBs.A0L;
        if (!canDrawOverlays) {
            textView.setVisibility(4);
            c66354UBs.A0K.setVisibility(4);
        } else {
            textView.setVisibility(0);
            c66354UBs.A0K.setVisibility(0);
        }
        CheckBox checkBox = c66354UBs.A0G;
        checkBox.setVisibility(0);
        c66354UBs.A0J.setVisibility(0);
        c66354UBs.A0I.setVisibility(0);
        c66354UBs.A0H.setVisibility(4);
        checkBox.setChecked(true);
    }

    public final void setDecoderName(String str) {
        this.A0B = str;
    }

    public final void setInjectedStartDelayMs(int i) {
        this.A01 = i;
    }

    public final void setIsPlaying(boolean z) {
        this.A0D = z;
    }

    public final void setLiveVideoDebugStats(VgL vgL) {
        this.A09 = vgL;
    }

    public final void setPlaying(boolean z) {
        this.A0D = z;
    }

    public final void setThroughputKbps(int i) {
        this.A02 = i;
    }

    public final void setWasWarmed(boolean z) {
        this.A0E = z;
    }
}
