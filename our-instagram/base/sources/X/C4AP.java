package X;

/* renamed from: X.4AP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AP {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public C2BB A0A;
    public EnumC46372Az A0B;
    public C4AO A0C;
    public C4AN A0D;
    public Integer A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final InterfaceC96424Va A0P;
    public final C2QE A0Q;
    public final Integer A0R;
    public final String A0S;
    public final String A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("VideoPrefetchRequest");
        sb.append("\nmCacheKey: ");
        sb.append(this.A0G);
        sb.append("\nmPrefetchOffset: ");
        sb.append(this.A07);
        sb.append("\nmPrefetchBytes: ");
        sb.append(this.A02);
        sb.append("\nmPrefetchSegment: ");
        sb.append(this.A03);
        sb.append("\nmStreamType: ");
        sb.append(this.A04);
        sb.append("\nmQueueBehavior: ");
        Integer num = this.A0F;
        if (num != null) {
            str = C4AQ.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("\nmAtomSize: ");
        sb.append(this.A00);
        sb.append("\nmBitRate: ");
        sb.append(this.A01);
        sb.append("\nmQualityLabel: ");
        sb.append(this.A0I);
        sb.append("\nmVideoTotalDurationMs: ");
        sb.append(this.A05);
        sb.append("\nmPrefetchSource: ");
        sb.append(this.A0H);
        sb.append("\nmVideoStatus: ");
        sb.append(this.A0B.name());
        sb.append("\nVideoPrefetchRequest.VideoSource");
        sb.append("\n");
        sb.append(this.A0D.toString());
        sb.append("\nmTargetContentReadyTimeMs: ");
        sb.append(this.A09);
        sb.append("\nmIsAudioOn: ");
        sb.append(this.A0K);
        sb.append("\nmShouldForceHighPriority: ");
        sb.append(this.A0M);
        sb.append("\nmUserOptedInLowLatency: ");
        sb.append(this.A0O);
        sb.append("\nmStartTimeMs: ");
        sb.append(this.A08);
        sb.append("\nmPrefetchDurationMs: ");
        sb.append(this.A06);
        sb.append("\nmUseHeroBgThread: ");
        sb.append(this.A0N);
        sb.append("\nmTag: ");
        sb.append("");
        sb.append("\nmPrefetchingModule: ");
        sb.append("");
        sb.append("\nmIsThumbnail: ");
        sb.append(this.A0W);
        sb.append("\nmIsBackgroundPrefetch: ");
        sb.append(this.A0V);
        sb.append("\nmIsFollowUpPrefetch: ");
        sb.append(this.A0L);
        sb.append("\nmDisableFollowUpPrefetch: ");
        sb.append(this.A0J);
        sb.append("\nmEnableForegroundPrefetchQualityExperimentation: ");
        sb.append(this.A0U);
        sb.append("\nmFromNewsFeedStartup: ");
        sb.append(false);
        sb.append("\nmCustomDataSoruceFactory: ");
        InterfaceC96424Va interfaceC96424Va = this.A0P;
        String str3 = "null";
        String str4 = "null";
        if (interfaceC96424Va == null) {
            str2 = "null";
        } else {
            str2 = String.valueOf(interfaceC96424Va.hashCode());
        }
        sb.append(str2);
        sb.append("\nmCustomCache: ");
        C2QE c2qe = this.A0Q;
        if (c2qe != null) {
            str3 = String.valueOf(c2qe.hashCode());
        }
        sb.append(str3);
        sb.append("\nmBytesCalculationOrigin: ");
        Integer num2 = this.A0E;
        if (num2 != null) {
            str4 = AbstractC225349wx.A00(num2);
        }
        sb.append(str4);
        sb.append("\nmVideoPos: ");
        sb.append(this.A0R);
        return sb.toString();
    }

    public C4AP(C4AP c4ap) {
        this.A0E = C05F.A00;
        this.A0D = c4ap.A0D;
        this.A0G = c4ap.A0G;
        this.A07 = c4ap.A07;
        this.A02 = c4ap.A02;
        this.A03 = c4ap.A03;
        this.A04 = c4ap.A04;
        this.A00 = c4ap.A00;
        this.A01 = c4ap.A01;
        this.A0I = c4ap.A0I;
        this.A05 = c4ap.A05;
        this.A0H = c4ap.A0H;
        this.A0B = c4ap.A0B;
        this.A0F = c4ap.A0F;
        this.A0C = c4ap.A0C;
        this.A09 = c4ap.A09;
        this.A0K = c4ap.A0K;
        this.A0M = c4ap.A0M;
        this.A0O = c4ap.A0O;
        this.A08 = c4ap.A08;
        this.A06 = c4ap.A06;
        this.A0N = c4ap.A0N;
        this.A0T = "";
        this.A0S = "";
        this.A0W = c4ap.A0W;
        this.A0V = c4ap.A0V;
        this.A0L = c4ap.A0L;
        this.A0J = c4ap.A0J;
        this.A0U = c4ap.A0U;
        this.A0A = c4ap.A0A;
        this.A0P = c4ap.A0P;
        this.A0Q = c4ap.A0Q;
        this.A0E = c4ap.A0E;
        this.A0R = c4ap.A0R;
    }

    public C4AP(EnumC46372Az enumC46372Az, C4AO c4ao, C4AN c4an, InterfaceC96424Va interfaceC96424Va, C2QE c2qe, Integer num, Integer num2, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0D = c4an;
        this.A0G = str;
        this.A07 = j;
        this.A02 = i;
        this.A03 = -1;
        this.A04 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A0I = str2;
        this.A05 = i5;
        this.A0H = str3;
        this.A0B = enumC46372Az;
        this.A0F = num;
        this.A0C = c4ao;
        this.A09 = j2;
        this.A0K = z;
        this.A0M = z2;
        this.A0O = false;
        this.A08 = j3;
        this.A06 = j4;
        this.A0N = false;
        this.A0T = "";
        this.A0S = "";
        this.A0W = z3;
        this.A0V = true;
        this.A0L = false;
        this.A0J = z4;
        this.A0U = z5;
        this.A0A = null;
        this.A0P = interfaceC96424Va;
        this.A0Q = c2qe;
        this.A0E = num2;
        this.A0R = null;
    }
}
