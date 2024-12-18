package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.PollType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerDirectData;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.5Qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116875Qr {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public C22P A06;
    public EnumC120795dP A07;
    public EnumC120805dQ A08;
    public EnumC120785dO A09;
    public ImmutableList A0A;
    public ImmutableList A0B;
    public ClipChainType A0C;
    public IntentAwareAdsInfoIntf A0D;
    public PollType A0E;
    public EnumC116885Qs A0F;
    public ClipsViewerDirectData A0G;
    public ClipsWatchAndBrowseData A0H;
    public ClipsReplyBarData A0I;
    public PlaylistContext A0J;
    public RIXUChainingBehaviorDefinition A0K;
    public AudioOverlayTrack A0L;
    public AudioType A0M;
    public SearchContext A0N;
    public EnumC114765Gh A0O;
    public Boolean A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Long A0a;
    public Long A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public String A0x;
    public String A0y;
    public String A0z;
    public String A10;
    public String A11;
    public String A12;
    public String A13;
    public String A14;
    public String A15;
    public String A16;
    public String A17;
    public String A18;
    public String A19;
    public String A1A;
    public String A1B;
    public String A1C;
    public String A1D;
    public String A1E;
    public String A1F;
    public String A1G;
    public String A1H;
    public String A1I;
    public String A1J;
    public String A1K;
    public String A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public boolean A1Z;
    public boolean A1a;
    public boolean A1b;
    public boolean A1c;
    public boolean A1d;
    public boolean A1e;
    public boolean A1f;
    public boolean A1g;
    public boolean A1h;
    public boolean A1i;
    public boolean A1j;
    public boolean A1k;
    public boolean A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x;
    public boolean A1y;
    public final ClipsViewerSource A1z;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (r20 == com.instagram.clips.intf.ClipsViewerSource.A25) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0055, code lost:
    
        if (r20 == com.instagram.clips.intf.ClipsViewerSource.A25) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C116875Qr(com.instagram.clips.intf.ClipsViewerSource r20, com.instagram.common.session.UserSession r21) {
        /*
            r19 = this;
            r5 = 1
            r9 = r21
            X.C14360o3.A0B(r9, r5)
            r0 = 2
            r6 = r20
            X.C14360o3.A0B(r6, r0)
            r7 = r19
            r7.<init>()
            r7.A1z = r6
            r0 = -1
            r7.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r7.A0P = r0
            X.22P r0 = X.C22P.A5N
            r7.A06 = r0
            X.5Qs r0 = X.EnumC116885Qs.A04
            r7.A0F = r0
            java.lang.Integer r4 = X.C05F.A00
            r7.A0Q = r4
            r11 = 0
            com.instagram.search.common.analytics.SearchContext r10 = new com.instagram.search.common.analytics.SearchContext
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r7.A0N = r10
            com.instagram.clips.model.metadata.PlaylistContext r0 = new com.instagram.clips.model.metadata.PlaylistContext
            r0.<init>(r11)
            r7.A0J = r0
            X.0Tz r8 = X.C06090Tz.A05
            r2 = 36314438114347576(0x8103ca00060a38, double:3.028735117794182E-306)
            boolean r0 = X.C18U.A06(r8, r9, r2)
            if (r0 == 0) goto L57
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A0g
            if (r6 == r0) goto L57
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A25
            r1 = 0
            if (r6 != r0) goto L58
        L57:
            r1 = 1
        L58:
            r7.A1d = r1
            boolean r0 = X.C18U.A06(r8, r9, r2)
            if (r0 == 0) goto L69
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A0g
            if (r6 == r0) goto L69
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A25
            r1 = 1
            if (r6 != r0) goto L6a
        L69:
            r1 = 0
        L6a:
            r7.A1v = r1
            r7.A1m = r5
            r7.A0T = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116875Qr.<init>(com.instagram.clips.intf.ClipsViewerSource, com.instagram.common.session.UserSession):void");
    }

    public final ClipsViewerConfig A00() {
        Integer num;
        String str;
        ClipsViewerSource clipsViewerSource = this.A1z;
        String str2 = this.A1D;
        String str3 = this.A18;
        String str4 = this.A1B;
        String str5 = this.A19;
        int i = this.A04;
        String str6 = this.A0t;
        ImmutableList immutableList = this.A0B;
        String str7 = this.A1A;
        boolean z = this.A1W;
        String str8 = this.A17;
        String str9 = this.A1C;
        Boolean bool = this.A0P;
        String str10 = this.A1G;
        int i2 = this.A05;
        String str11 = this.A13;
        String str12 = this.A14;
        String str13 = this.A0g;
        String str14 = this.A0v;
        String str15 = this.A0w;
        AudioType audioType = this.A0M;
        ImmutableList immutableList2 = this.A0A;
        String str16 = this.A1I;
        String str17 = this.A0z;
        PollType pollType = this.A0E;
        EnumC120785dO enumC120785dO = this.A09;
        String str18 = this.A1K;
        String str19 = this.A0r;
        Integer num2 = this.A0V;
        EnumC120795dP enumC120795dP = this.A07;
        EnumC120805dQ enumC120805dQ = this.A08;
        boolean z2 = this.A1n;
        C22P c22p = this.A06;
        String str20 = this.A0q;
        boolean z3 = this.A1d;
        EnumC116885Qs enumC116885Qs = this.A0F;
        Integer num3 = this.A0Q;
        boolean z4 = this.A1M;
        boolean z5 = this.A1e;
        EnumC114765Gh enumC114765Gh = this.A0O;
        boolean z6 = this.A1Z;
        boolean z7 = this.A1N;
        boolean z8 = this.A1O;
        boolean z9 = this.A1c;
        boolean z10 = this.A1f;
        boolean z11 = this.A1h;
        boolean z12 = this.A1t;
        String str21 = this.A0o;
        String str22 = this.A0p;
        boolean z13 = this.A1Q;
        String str23 = this.A0c;
        String str24 = this.A0d;
        AudioOverlayTrack audioOverlayTrack = this.A0L;
        String str25 = this.A0l;
        String str26 = this.A15;
        String str27 = this.A11;
        String str28 = this.A10;
        String str29 = this.A0j;
        Integer num4 = this.A0Z;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A0H;
        String str30 = this.A12;
        SearchContext searchContext = this.A0N;
        ClipsReplyBarData clipsReplyBarData = this.A0I;
        ClipsViewerDirectData clipsViewerDirectData = this.A0G;
        String str31 = this.A1F;
        boolean z14 = this.A1S;
        String str32 = this.A0u;
        String str33 = this.A16;
        PlaylistContext playlistContext = this.A0J;
        String str34 = this.A1E;
        boolean z15 = this.A1v;
        boolean z16 = this.A1x;
        boolean z17 = this.A1y;
        boolean z18 = this.A1w;
        boolean z19 = this.A1P;
        boolean z20 = this.A1Y;
        float f = this.A02;
        float f2 = this.A00;
        float f3 = this.A01;
        float f4 = this.A03;
        String str35 = this.A0x;
        boolean z21 = this.A1T;
        RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition = this.A0K;
        boolean z22 = this.A1p;
        boolean z23 = this.A1k;
        boolean z24 = this.A1l;
        String str36 = this.A0f;
        String str37 = this.A0e;
        Integer num5 = this.A0X;
        boolean z25 = this.A1m;
        boolean z26 = this.A1i;
        ClipChainType clipChainType = this.A0C;
        Integer num6 = this.A0T;
        String str38 = this.A0y;
        Integer num7 = this.A0W;
        Long l = this.A0a;
        String str39 = this.A0k;
        Integer num8 = this.A0S;
        boolean z27 = this.A1u;
        Integer num9 = this.A0Y;
        String str40 = this.A0h;
        String str41 = this.A1J;
        String str42 = this.A0i;
        boolean z28 = this.A1U;
        boolean z29 = this.A1b;
        boolean z30 = this.A1X;
        boolean z31 = this.A1R;
        String str43 = this.A1H;
        boolean z32 = this.A1q;
        boolean z33 = this.A1V;
        String str44 = this.A1L;
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = this.A0D;
        if (intentAwareAdsInfoIntf != null) {
            num = intentAwareAdsInfoIntf.BVJ();
        } else {
            num = null;
        }
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf2 = this.A0D;
        if (intentAwareAdsInfoIntf2 != null) {
            str = intentAwareAdsInfoIntf2.BVL();
        } else {
            str = null;
        }
        boolean z34 = this.A1j;
        String str45 = this.A0s;
        boolean z35 = this.A1s;
        boolean z36 = this.A1o;
        boolean z37 = this.A1r;
        String str46 = this.A0m;
        return new ClipsViewerConfig(c22p, enumC120795dP, enumC120805dQ, enumC120785dO, immutableList, immutableList2, clipChainType, pollType, enumC116885Qs, clipsViewerDirectData, clipsViewerSource, clipsWatchAndBrowseData, clipsReplyBarData, null, null, null, playlistContext, rIXUChainingBehaviorDefinition, audioOverlayTrack, audioType, searchContext, enumC114765Gh, bool, Boolean.valueOf(z35), num2, num3, num4, num5, num6, num7, num8, null, num9, num, this.A0U, this.A0R, l, this.A0b, str2, str3, str4, str5, str6, str7, str8, str9, null, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str26, str27, str28, str29, str30, str25, str31, null, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str, str45, str46, this.A0n, f, f2, f3, f4, i, i2, 5, 0, z, z2, z3, z4, z5, z6, z7, z8, z11, z12, false, z9, z10, false, z13, false, false, false, false, false, false, false, false, false, z14, z21, z15, z16, z17, z18, z19, z20, false, true, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z36, z37, this.A1g, this.A1a);
    }

    public final void A01(ClipsWatchAndBrowseData clipsWatchAndBrowseData) {
        this.A0H = clipsWatchAndBrowseData;
        if (clipsWatchAndBrowseData != null) {
            Integer num = clipsWatchAndBrowseData.A08;
            Integer num2 = C05F.A01;
            boolean z = true;
            boolean z2 = false;
            if (num == num2) {
                z2 = true;
            }
            this.A1v = z2;
            if (clipsWatchAndBrowseData.A09 != num2) {
                z = false;
            }
            this.A1x = z;
        }
    }

    public final void A02(UserSession userSession, C40971v4 c40971v4, boolean z) {
        String str;
        if (c40971v4 != null) {
            this.A1A = AbstractC151266rU.A01(userSession, c40971v4);
            this.A1W = true;
            this.A1X = z;
            this.A18 = c40971v4.A0S;
            this.A1B = c40971v4.A0j;
            List A3m = c40971v4.A0K.A3m();
            if (A3m != null) {
                str = A3m.toString();
            } else {
                str = null;
            }
            this.A19 = str;
        }
    }

    public final void A03(SearchContext searchContext) {
        this.A0N = searchContext;
        this.A15 = searchContext.A05;
        this.A11 = searchContext.A03;
        this.A10 = searchContext.A02;
        this.A0j = searchContext.A01;
        this.A12 = searchContext.A04;
    }
}
