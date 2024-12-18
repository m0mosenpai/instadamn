package com.instagram.clips.intf;

import X.AbstractC166107be;
import X.C0T6;
import X.C14360o3;
import X.C206139Av;
import X.C22P;
import X.C9IF;
import X.C9IG;
import X.EnumC114765Gh;
import X.EnumC116885Qs;
import X.EnumC120785dO;
import X.EnumC120795dP;
import X.EnumC120805dQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.api.schemas.PollType;
import com.instagram.clips.model.ClipsReplyBarData;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsTogetherData;
import com.instagram.clips.model.metadata.ClipsContextualHighlightInfo;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.model.rixu.RIXUChainingBehaviorDefinition;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.AudioType;
import com.instagram.search.common.analytics.SearchContext;

/* loaded from: classes3.dex */
public final class ClipsViewerConfig extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C206139Av(46);
    public String A00;
    public String A01;
    public String A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C22P A0A;
    public final EnumC120805dQ A0B;
    public final EnumC120785dO A0C;
    public final ImmutableList A0D;
    public final ImmutableList A0E;
    public final ClipChainType A0F;
    public final PollType A0G;
    public final EnumC116885Qs A0H;
    public final ClipsViewerDirectData A0I;
    public final ClipsViewerSource A0J;
    public final ClipsWatchAndBrowseData A0K;
    public final ClipsReplyBarData A0L;
    public final ClipsSpotlightData A0M;
    public final ClipsContextualHighlightInfo A0N;
    public final PlaylistContext A0O;
    public final RIXUChainingBehaviorDefinition A0P;
    public final AudioOverlayTrack A0Q;
    public final AudioType A0R;
    public final SearchContext A0S;
    public final EnumC114765Gh A0T;
    public final Boolean A0U;
    public final Boolean A0V;
    public final Integer A0W;
    public final Integer A0X;
    public final Integer A0Y;
    public final Integer A0Z;
    public final Integer A0a;
    public final Integer A0b;
    public final Integer A0c;
    public final Integer A0d;
    public final Integer A0e;
    public final Integer A0f;
    public final Integer A0g;
    public final Long A0h;
    public final Long A0i;
    public final String A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final String A0o;
    public final String A0p;
    public final String A0q;
    public final String A0r;
    public final String A0s;
    public final String A0t;
    public final String A0u;
    public final String A0v;
    public final String A0w;
    public final String A0x;
    public final String A0y;
    public final String A0z;
    public final String A10;
    public final String A11;
    public final String A12;
    public final String A13;
    public final String A14;
    public final String A15;
    public final String A16;
    public final String A17;
    public final String A18;
    public final String A19;
    public final String A1A;
    public final String A1B;
    public final String A1C;
    public final String A1D;
    public final String A1E;
    public final String A1F;
    public final String A1G;
    public final String A1H;
    public final String A1I;
    public final String A1J;
    public final String A1K;
    public final String A1L;
    public final String A1M;
    public final String A1N;
    public final String A1O;
    public final String A1P;
    public final boolean A1Q;
    public final boolean A1R;
    public final boolean A1S;
    public final boolean A1T;
    public final boolean A1U;
    public final boolean A1V;
    public final boolean A1W;
    public final boolean A1X;
    public final boolean A1Y;
    public final boolean A1Z;
    public final boolean A1a;
    public final boolean A1b;
    public final boolean A1c;
    public final boolean A1d;
    public final boolean A1e;
    public final boolean A1f;
    public final boolean A1g;
    public final boolean A1h;
    public final boolean A1i;
    public final boolean A1j;
    public final boolean A1k;
    public final boolean A1l;
    public final boolean A1m;
    public final boolean A1n;
    public final boolean A1o;
    public final boolean A1p;
    public final boolean A1q;
    public final boolean A1r;
    public final boolean A1s;
    public final boolean A1t;
    public final boolean A1u;
    public final boolean A1v;
    public final boolean A1w;
    public final boolean A1x;
    public final boolean A1y;
    public final boolean A1z;
    public final boolean A20;
    public final boolean A21;
    public final boolean A22;
    public final boolean A23;
    public final boolean A24;
    public final boolean A25;
    public final boolean A26;
    public final boolean A27;
    public final boolean A28;
    public final boolean A29;
    public final boolean A2A;
    public final int A2B;
    public final EnumC120795dP A2C;
    public final ClipsTogetherData A2D;
    public final Integer A2E;
    public final String A2F;
    public final String A2G;
    public final String A2H;
    public final boolean A2I;
    public final boolean A2J;
    public final boolean A2K;
    public final boolean A2L;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsViewerConfig) {
                ClipsViewerConfig clipsViewerConfig = (ClipsViewerConfig) obj;
                if (this.A0J != clipsViewerConfig.A0J || !C14360o3.A0K(this.A1I, clipsViewerConfig.A1I) || !C14360o3.A0K(this.A1C, clipsViewerConfig.A1C) || !C14360o3.A0K(this.A1F, clipsViewerConfig.A1F) || !C14360o3.A0K(this.A1D, clipsViewerConfig.A1D) || this.A08 != clipsViewerConfig.A08 || !C14360o3.A0K(this.A0x, clipsViewerConfig.A0x) || !C14360o3.A0K(this.A0E, clipsViewerConfig.A0E) || !C14360o3.A0K(this.A1E, clipsViewerConfig.A1E) || this.A1j != clipsViewerConfig.A1j || !C14360o3.A0K(this.A1B, clipsViewerConfig.A1B) || !C14360o3.A0K(this.A1G, clipsViewerConfig.A1G) || !C14360o3.A0K(this.A1H, clipsViewerConfig.A1H) || !C14360o3.A0K(this.A0V, clipsViewerConfig.A0V) || !C14360o3.A0K(this.A0N, clipsViewerConfig.A0N) || !C14360o3.A0K(this.A1K, clipsViewerConfig.A1K) || this.A09 != clipsViewerConfig.A09 || !C14360o3.A0K(this.A17, clipsViewerConfig.A17) || !C14360o3.A0K(this.A18, clipsViewerConfig.A18) || !C14360o3.A0K(this.A2F, clipsViewerConfig.A2F) || !C14360o3.A0K(this.A0z, clipsViewerConfig.A0z) || !C14360o3.A0K(this.A10, clipsViewerConfig.A10) || this.A0R != clipsViewerConfig.A0R || !C14360o3.A0K(this.A0D, clipsViewerConfig.A0D) || !C14360o3.A0K(this.A1M, clipsViewerConfig.A1M) || !C14360o3.A0K(this.A13, clipsViewerConfig.A13) || this.A0G != clipsViewerConfig.A0G || this.A0C != clipsViewerConfig.A0C || !C14360o3.A0K(this.A1O, clipsViewerConfig.A1O) || !C14360o3.A0K(this.A0v, clipsViewerConfig.A0v) || !C14360o3.A0K(this.A2E, clipsViewerConfig.A2E) || this.A2C != clipsViewerConfig.A2C || this.A0B != clipsViewerConfig.A0B || this.A21 != clipsViewerConfig.A21 || this.A0A != clipsViewerConfig.A0A || !C14360o3.A0K(this.A00, clipsViewerConfig.A00) || this.A1q != clipsViewerConfig.A1q || this.A0H != clipsViewerConfig.A0H || this.A0W != clipsViewerConfig.A0W || this.A2I != clipsViewerConfig.A2I || this.A1r != clipsViewerConfig.A1r || this.A0T != clipsViewerConfig.A0T || this.A1m != clipsViewerConfig.A1m || this.A1U != clipsViewerConfig.A1U || this.A1W != clipsViewerConfig.A1W || this.A1u != clipsViewerConfig.A1u || this.A25 != clipsViewerConfig.A25 || this.A2K != clipsViewerConfig.A2K || !C14360o3.A0K(this.A0t, clipsViewerConfig.A0t) || !C14360o3.A0K(this.A0u, clipsViewerConfig.A0u) || this.A1p != clipsViewerConfig.A1p || this.A1s != clipsViewerConfig.A1s || this.A07 != clipsViewerConfig.A07 || this.A1Q != clipsViewerConfig.A1Q || this.A1a != clipsViewerConfig.A1a || this.A1c != clipsViewerConfig.A1c || this.A1b != clipsViewerConfig.A1b || this.A1d != clipsViewerConfig.A1d || this.A1T != clipsViewerConfig.A1T || this.A1S != clipsViewerConfig.A1S || this.A1R != clipsViewerConfig.A1R || this.A1V != clipsViewerConfig.A1V || !C14360o3.A0K(this.A0j, clipsViewerConfig.A0j) || !C14360o3.A0K(this.A0k, clipsViewerConfig.A0k) || !C14360o3.A0K(this.A0Q, clipsViewerConfig.A0Q) || !C14360o3.A0K(this.A0S, clipsViewerConfig.A0S) || !C14360o3.A0K(this.A19, clipsViewerConfig.A19) || !C14360o3.A0K(this.A15, clipsViewerConfig.A15) || !C14360o3.A0K(this.A14, clipsViewerConfig.A14) || !C14360o3.A0K(this.A0p, clipsViewerConfig.A0p) || !C14360o3.A0K(this.A0g, clipsViewerConfig.A0g) || !C14360o3.A0K(this.A0K, clipsViewerConfig.A0K) || !C14360o3.A0K(this.A16, clipsViewerConfig.A16) || !C14360o3.A0K(this.A01, clipsViewerConfig.A01) || !C14360o3.A0K(this.A0L, clipsViewerConfig.A0L) || !C14360o3.A0K(this.A2D, clipsViewerConfig.A2D) || !C14360o3.A0K(this.A0M, clipsViewerConfig.A0M) || this.A1Y != clipsViewerConfig.A1Y || this.A1Z != clipsViewerConfig.A1Z || !C14360o3.A0K(this.A1J, clipsViewerConfig.A1J) || !C14360o3.A0K(this.A0I, clipsViewerConfig.A0I) || this.A1f != clipsViewerConfig.A1f || !C14360o3.A0K(this.A2G, clipsViewerConfig.A2G) || this.A2B != clipsViewerConfig.A2B || !C14360o3.A0K(this.A0y, clipsViewerConfig.A0y) || !C14360o3.A0K(this.A02, clipsViewerConfig.A02) || this.A1g != clipsViewerConfig.A1g || !C14360o3.A0K(this.A0O, clipsViewerConfig.A0O) || !C14360o3.A0K(this.A2H, clipsViewerConfig.A2H) || this.A27 != clipsViewerConfig.A27 || this.A29 != clipsViewerConfig.A29 || this.A2A != clipsViewerConfig.A2A || this.A28 != clipsViewerConfig.A28 || this.A1X != clipsViewerConfig.A1X || this.A1l != clipsViewerConfig.A1l || Float.compare(this.A05, clipsViewerConfig.A05) != 0 || Float.compare(this.A03, clipsViewerConfig.A03) != 0 || Float.compare(this.A04, clipsViewerConfig.A04) != 0 || Float.compare(this.A06, clipsViewerConfig.A06) != 0 || this.A2J != clipsViewerConfig.A2J || !C14360o3.A0K(this.A11, clipsViewerConfig.A11) || this.A1z != clipsViewerConfig.A1z || !C14360o3.A0K(this.A0P, clipsViewerConfig.A0P) || this.A2L != clipsViewerConfig.A2L || this.A1x != clipsViewerConfig.A1x || this.A1y != clipsViewerConfig.A1y || !C14360o3.A0K(this.A0m, clipsViewerConfig.A0m) || !C14360o3.A0K(this.A0l, clipsViewerConfig.A0l) || !C14360o3.A0K(this.A0c, clipsViewerConfig.A0c) || this.A20 != clipsViewerConfig.A20 || this.A1v != clipsViewerConfig.A1v || this.A0F != clipsViewerConfig.A0F || this.A0Z != clipsViewerConfig.A0Z || !C14360o3.A0K(this.A12, clipsViewerConfig.A12) || !C14360o3.A0K(this.A0b, clipsViewerConfig.A0b) || !C14360o3.A0K(this.A0h, clipsViewerConfig.A0h) || !C14360o3.A0K(this.A0q, clipsViewerConfig.A0q) || this.A0Y != clipsViewerConfig.A0Y || !C14360o3.A0K(this.A0d, clipsViewerConfig.A0d) || this.A26 != clipsViewerConfig.A26 || this.A0f != clipsViewerConfig.A0f || !C14360o3.A0K(this.A0n, clipsViewerConfig.A0n) || !C14360o3.A0K(this.A1N, clipsViewerConfig.A1N) || this.A1h != clipsViewerConfig.A1h || !C14360o3.A0K(this.A0o, clipsViewerConfig.A0o) || this.A1o != clipsViewerConfig.A1o || this.A1k != clipsViewerConfig.A1k || this.A1e != clipsViewerConfig.A1e || !C14360o3.A0K(this.A1L, clipsViewerConfig.A1L) || this.A23 != clipsViewerConfig.A23 || this.A1i != clipsViewerConfig.A1i || !C14360o3.A0K(this.A1P, clipsViewerConfig.A1P) || !C14360o3.A0K(this.A0e, clipsViewerConfig.A0e) || !C14360o3.A0K(this.A1A, clipsViewerConfig.A1A) || this.A1w != clipsViewerConfig.A1w || !C14360o3.A0K(this.A0w, clipsViewerConfig.A0w) || !C14360o3.A0K(this.A0U, clipsViewerConfig.A0U) || this.A22 != clipsViewerConfig.A22 || this.A24 != clipsViewerConfig.A24 || !C14360o3.A0K(this.A0r, clipsViewerConfig.A0r) || !C14360o3.A0K(this.A0a, clipsViewerConfig.A0a) || !C14360o3.A0K(this.A0i, clipsViewerConfig.A0i) || !C14360o3.A0K(this.A0s, clipsViewerConfig.A0s) || this.A1t != clipsViewerConfig.A1t || !C14360o3.A0K(this.A0X, clipsViewerConfig.A0X) || this.A1n != clipsViewerConfig.A1n) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        this.A0J.writeToParcel(parcel, i);
        parcel.writeString(this.A1I);
        parcel.writeString(this.A1C);
        parcel.writeString(this.A1F);
        parcel.writeString(this.A1D);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A0x);
        parcel.writeSerializable(this.A0E);
        parcel.writeString(this.A1E);
        parcel.writeInt(this.A1j ? 1 : 0);
        parcel.writeString(this.A1B);
        parcel.writeString(this.A1G);
        parcel.writeString(this.A1H);
        Boolean bool = this.A0V;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A0N, i);
        parcel.writeString(this.A1K);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A17);
        parcel.writeString(this.A18);
        parcel.writeString(this.A2F);
        parcel.writeString(this.A0z);
        parcel.writeString(this.A10);
        parcel.writeParcelable(this.A0R, i);
        parcel.writeSerializable(this.A0D);
        parcel.writeString(this.A1M);
        parcel.writeString(this.A13);
        parcel.writeParcelable(this.A0G, i);
        EnumC120785dO enumC120785dO = this.A0C;
        if (enumC120785dO == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC120785dO.name());
        }
        parcel.writeString(this.A1O);
        parcel.writeString(this.A0v);
        Integer num = this.A2E;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        EnumC120795dP enumC120795dP = this.A2C;
        if (enumC120795dP == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC120795dP.name());
        }
        EnumC120805dQ enumC120805dQ = this.A0B;
        if (enumC120805dQ == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC120805dQ.name());
        }
        parcel.writeInt(this.A21 ? 1 : 0);
        parcel.writeString(this.A0A.name());
        parcel.writeString(this.A00);
        parcel.writeInt(this.A1q ? 1 : 0);
        parcel.writeString(this.A0H.name());
        parcel.writeString(C9IF.A01(this.A0W));
        parcel.writeInt(this.A2I ? 1 : 0);
        parcel.writeInt(this.A1r ? 1 : 0);
        EnumC114765Gh enumC114765Gh = this.A0T;
        if (enumC114765Gh == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC114765Gh.name());
        }
        parcel.writeInt(this.A1m ? 1 : 0);
        parcel.writeInt(this.A1U ? 1 : 0);
        parcel.writeInt(this.A1W ? 1 : 0);
        parcel.writeInt(this.A1u ? 1 : 0);
        parcel.writeInt(this.A25 ? 1 : 0);
        parcel.writeInt(this.A2K ? 1 : 0);
        parcel.writeString(this.A0t);
        parcel.writeString(this.A0u);
        parcel.writeInt(this.A1p ? 1 : 0);
        parcel.writeInt(this.A1s ? 1 : 0);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A1Q ? 1 : 0);
        parcel.writeInt(this.A1a ? 1 : 0);
        parcel.writeInt(this.A1c ? 1 : 0);
        parcel.writeInt(this.A1b ? 1 : 0);
        parcel.writeInt(this.A1d ? 1 : 0);
        parcel.writeInt(this.A1T ? 1 : 0);
        parcel.writeInt(this.A1S ? 1 : 0);
        parcel.writeInt(this.A1R ? 1 : 0);
        parcel.writeInt(this.A1V ? 1 : 0);
        parcel.writeString(this.A0j);
        parcel.writeString(this.A0k);
        parcel.writeParcelable(this.A0Q, i);
        parcel.writeParcelable(this.A0S, i);
        parcel.writeString(this.A19);
        parcel.writeString(this.A15);
        parcel.writeString(this.A14);
        parcel.writeString(this.A0p);
        Integer num2 = this.A0g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A0K;
        if (clipsWatchAndBrowseData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipsWatchAndBrowseData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A16);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A0L, i);
        parcel.writeParcelable(this.A2D, i);
        parcel.writeParcelable(this.A0M, i);
        parcel.writeInt(this.A1Y ? 1 : 0);
        parcel.writeInt(this.A1Z ? 1 : 0);
        parcel.writeString(this.A1J);
        ClipsViewerDirectData clipsViewerDirectData = this.A0I;
        if (clipsViewerDirectData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipsViewerDirectData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A1f ? 1 : 0);
        parcel.writeString(this.A2G);
        parcel.writeInt(this.A2B);
        parcel.writeString(this.A0y);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A1g ? 1 : 0);
        parcel.writeParcelable(this.A0O, i);
        parcel.writeString(this.A2H);
        parcel.writeInt(this.A27 ? 1 : 0);
        parcel.writeInt(this.A29 ? 1 : 0);
        parcel.writeInt(this.A2A ? 1 : 0);
        parcel.writeInt(this.A28 ? 1 : 0);
        parcel.writeInt(this.A1X ? 1 : 0);
        parcel.writeInt(this.A1l ? 1 : 0);
        parcel.writeFloat(this.A05);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A06);
        parcel.writeInt(this.A2J ? 1 : 0);
        parcel.writeString(this.A11);
        parcel.writeInt(this.A1z ? 1 : 0);
        parcel.writeParcelable(this.A0P, i);
        parcel.writeInt(this.A2L ? 1 : 0);
        parcel.writeInt(this.A1x ? 1 : 0);
        parcel.writeInt(this.A1y ? 1 : 0);
        parcel.writeString(this.A0m);
        parcel.writeString(this.A0l);
        Integer num3 = this.A0c;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeInt(this.A20 ? 1 : 0);
        parcel.writeInt(this.A1v ? 1 : 0);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeString(C9IG.A00(this.A0Z));
        parcel.writeString(this.A12);
        Integer num4 = this.A0b;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Long l = this.A0h;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A0q);
        if (this.A0Y == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString("CAMERA_GALLERY");
        }
        Integer num5 = this.A0d;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeInt(this.A26 ? 1 : 0);
        Integer num6 = this.A0f;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(AbstractC166107be.A01(num6));
        }
        parcel.writeString(this.A0n);
        parcel.writeString(this.A1N);
        parcel.writeInt(this.A1h ? 1 : 0);
        parcel.writeString(this.A0o);
        parcel.writeInt(this.A1o ? 1 : 0);
        parcel.writeInt(this.A1k ? 1 : 0);
        parcel.writeInt(this.A1e ? 1 : 0);
        parcel.writeString(this.A1L);
        parcel.writeInt(this.A23 ? 1 : 0);
        parcel.writeInt(this.A1i ? 1 : 0);
        parcel.writeString(this.A1P);
        Integer num7 = this.A0e;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        parcel.writeString(this.A1A);
        parcel.writeInt(this.A1w ? 1 : 0);
        parcel.writeString(this.A0w);
        Boolean bool2 = this.A0U;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.A22 ? 1 : 0);
        parcel.writeInt(this.A24 ? 1 : 0);
        parcel.writeString(this.A0r);
        Integer num8 = this.A0a;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num8.intValue());
        }
        Long l2 = this.A0i;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.A0s);
        parcel.writeInt(this.A1t ? 1 : 0);
        Integer num9 = this.A0X;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num9.intValue());
        }
        parcel.writeInt(this.A1n ? 1 : 0);
    }

    public final boolean A00() {
        ClipsViewerSource clipsViewerSource = this.A0J;
        if ((clipsViewerSource == ClipsViewerSource.A1A || clipsViewerSource == ClipsViewerSource.A0R || clipsViewerSource == ClipsViewerSource.A1B || clipsViewerSource == ClipsViewerSource.A19 || clipsViewerSource == ClipsViewerSource.A1Q || clipsViewerSource == ClipsViewerSource.A1R) && this.A0K != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        int hashCode37;
        int hashCode38;
        int hashCode39;
        int hashCode40;
        int hashCode41;
        int hashCode42;
        int hashCode43;
        int hashCode44;
        int hashCode45;
        int hashCode46;
        int hashCode47;
        int hashCode48;
        int hashCode49;
        int hashCode50;
        int hashCode51;
        int hashCode52;
        int hashCode53;
        int hashCode54;
        int hashCode55;
        int hashCode56;
        int hashCode57;
        int hashCode58;
        int hashCode59;
        int hashCode60;
        int hashCode61;
        int hashCode62;
        int hashCode63;
        int intValue;
        int hashCode64;
        int hashCode65;
        int hashCode66;
        int hashCode67;
        int hashCode68;
        int hashCode69;
        int hashCode70;
        int hashCode71;
        int hashCode72;
        int hashCode73;
        int hashCode74;
        int hashCode75;
        int hashCode76;
        int hashCode77;
        int hashCode78;
        int hashCode79 = this.A0J.hashCode() * 31;
        String str = this.A1I;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode79 + hashCode) * 31;
        String str2 = this.A1C;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A1F;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A1D;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (((i4 + hashCode4) * 31) + this.A08) * 31;
        String str5 = this.A0x;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        ImmutableList immutableList = this.A0E;
        if (immutableList == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = immutableList.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this.A1E;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        int i9 = 1237;
        if (this.A1j) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        String str7 = this.A1B;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i11 = (i10 + hashCode8) * 31;
        String str8 = this.A1G;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i12 = (i11 + hashCode9) * 31;
        String str9 = this.A1H;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i13 = (i12 + hashCode10) * 31;
        Boolean bool = this.A0V;
        if (bool == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool.hashCode();
        }
        int i14 = (i13 + hashCode11) * 31;
        ClipsContextualHighlightInfo clipsContextualHighlightInfo = this.A0N;
        if (clipsContextualHighlightInfo == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = clipsContextualHighlightInfo.hashCode();
        }
        int i15 = (i14 + hashCode12) * 31;
        String str10 = this.A1K;
        if (str10 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str10.hashCode();
        }
        int i16 = (((i15 + hashCode13) * 31) + this.A09) * 31;
        String str11 = this.A17;
        if (str11 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str11.hashCode();
        }
        int i17 = (i16 + hashCode14) * 31;
        String str12 = this.A18;
        if (str12 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str12.hashCode();
        }
        int i18 = (i17 + hashCode15) * 31;
        String str13 = this.A2F;
        if (str13 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str13.hashCode();
        }
        int i19 = (i18 + hashCode16) * 31;
        String str14 = this.A0z;
        if (str14 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str14.hashCode();
        }
        int i20 = (i19 + hashCode17) * 31;
        String str15 = this.A10;
        if (str15 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str15.hashCode();
        }
        int i21 = (i20 + hashCode18) * 31;
        AudioType audioType = this.A0R;
        if (audioType == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = audioType.hashCode();
        }
        int i22 = (i21 + hashCode19) * 31;
        ImmutableList immutableList2 = this.A0D;
        if (immutableList2 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = immutableList2.hashCode();
        }
        int i23 = (i22 + hashCode20) * 31;
        String str16 = this.A1M;
        if (str16 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str16.hashCode();
        }
        int i24 = (i23 + hashCode21) * 31;
        String str17 = this.A13;
        if (str17 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = str17.hashCode();
        }
        int i25 = (i24 + hashCode22) * 31;
        PollType pollType = this.A0G;
        if (pollType == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = pollType.hashCode();
        }
        int i26 = (i25 + hashCode23) * 31;
        EnumC120785dO enumC120785dO = this.A0C;
        if (enumC120785dO == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = enumC120785dO.hashCode();
        }
        int i27 = (i26 + hashCode24) * 31;
        String str18 = this.A1O;
        if (str18 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = str18.hashCode();
        }
        int i28 = (i27 + hashCode25) * 31;
        String str19 = this.A0v;
        if (str19 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = str19.hashCode();
        }
        int i29 = (i28 + hashCode26) * 31;
        Integer num = this.A2E;
        if (num == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = num.hashCode();
        }
        int i30 = (i29 + hashCode27) * 31;
        EnumC120795dP enumC120795dP = this.A2C;
        if (enumC120795dP == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = enumC120795dP.hashCode();
        }
        int i31 = (i30 + hashCode28) * 31;
        EnumC120805dQ enumC120805dQ = this.A0B;
        if (enumC120805dQ == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = enumC120805dQ.hashCode();
        }
        int i32 = (i31 + hashCode29) * 31;
        int i33 = 1237;
        if (this.A21) {
            i33 = 1231;
        }
        int hashCode80 = (((i32 + i33) * 31) + this.A0A.hashCode()) * 31;
        String str20 = this.A00;
        if (str20 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = str20.hashCode();
        }
        int i34 = (hashCode80 + hashCode30) * 31;
        int i35 = 1237;
        if (this.A1q) {
            i35 = 1231;
        }
        int hashCode81 = (((i34 + i35) * 31) + this.A0H.hashCode()) * 31;
        Integer num2 = this.A0W;
        int hashCode82 = (hashCode81 + C9IF.A01(num2).hashCode() + num2.intValue()) * 31;
        int i36 = 1237;
        if (this.A2I) {
            i36 = 1231;
        }
        int i37 = (hashCode82 + i36) * 31;
        int i38 = 1237;
        if (this.A1r) {
            i38 = 1231;
        }
        int i39 = (i37 + i38) * 31;
        EnumC114765Gh enumC114765Gh = this.A0T;
        if (enumC114765Gh == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = enumC114765Gh.hashCode();
        }
        int i40 = (i39 + hashCode31) * 31;
        int i41 = 1237;
        if (this.A1m) {
            i41 = 1231;
        }
        int i42 = (i40 + i41) * 31;
        int i43 = 1237;
        if (this.A1U) {
            i43 = 1231;
        }
        int i44 = (i42 + i43) * 31;
        int i45 = 1237;
        if (this.A1W) {
            i45 = 1231;
        }
        int i46 = (i44 + i45) * 31;
        int i47 = 1237;
        if (this.A1u) {
            i47 = 1231;
        }
        int i48 = (i46 + i47) * 31;
        int i49 = 1237;
        if (this.A25) {
            i49 = 1231;
        }
        int i50 = (i48 + i49) * 31;
        int i51 = 1237;
        if (this.A2K) {
            i51 = 1231;
        }
        int i52 = (i50 + i51) * 31;
        String str21 = this.A0t;
        if (str21 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = str21.hashCode();
        }
        int i53 = (i52 + hashCode32) * 31;
        String str22 = this.A0u;
        if (str22 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = str22.hashCode();
        }
        int i54 = (i53 + hashCode33) * 31;
        int i55 = 1237;
        if (this.A1p) {
            i55 = 1231;
        }
        int i56 = (i54 + i55) * 31;
        int i57 = 1237;
        if (this.A1s) {
            i57 = 1231;
        }
        int i58 = (((i56 + i57) * 31) + this.A07) * 31;
        int i59 = 1237;
        if (this.A1Q) {
            i59 = 1231;
        }
        int i60 = (i58 + i59) * 31;
        int i61 = 1237;
        if (this.A1a) {
            i61 = 1231;
        }
        int i62 = (i60 + i61) * 31;
        int i63 = 1237;
        if (this.A1c) {
            i63 = 1231;
        }
        int i64 = (i62 + i63) * 31;
        int i65 = 1237;
        if (this.A1b) {
            i65 = 1231;
        }
        int i66 = (i64 + i65) * 31;
        int i67 = 1237;
        if (this.A1d) {
            i67 = 1231;
        }
        int i68 = (i66 + i67) * 31;
        int i69 = 1237;
        if (this.A1T) {
            i69 = 1231;
        }
        int i70 = (i68 + i69) * 31;
        int i71 = 1237;
        if (this.A1S) {
            i71 = 1231;
        }
        int i72 = (i70 + i71) * 31;
        int i73 = 1237;
        if (this.A1R) {
            i73 = 1231;
        }
        int i74 = (i72 + i73) * 31;
        int i75 = 1237;
        if (this.A1V) {
            i75 = 1231;
        }
        int i76 = (i74 + i75) * 31;
        String str23 = this.A0j;
        if (str23 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = str23.hashCode();
        }
        int i77 = (i76 + hashCode34) * 31;
        String str24 = this.A0k;
        if (str24 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = str24.hashCode();
        }
        int i78 = (i77 + hashCode35) * 31;
        AudioOverlayTrack audioOverlayTrack = this.A0Q;
        if (audioOverlayTrack == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = audioOverlayTrack.hashCode();
        }
        int hashCode83 = (((i78 + hashCode36) * 31) + this.A0S.hashCode()) * 31;
        String str25 = this.A19;
        if (str25 == null) {
            hashCode37 = 0;
        } else {
            hashCode37 = str25.hashCode();
        }
        int i79 = (hashCode83 + hashCode37) * 31;
        String str26 = this.A15;
        if (str26 == null) {
            hashCode38 = 0;
        } else {
            hashCode38 = str26.hashCode();
        }
        int i80 = (i79 + hashCode38) * 31;
        String str27 = this.A14;
        if (str27 == null) {
            hashCode39 = 0;
        } else {
            hashCode39 = str27.hashCode();
        }
        int i81 = (i80 + hashCode39) * 31;
        String str28 = this.A0p;
        if (str28 == null) {
            hashCode40 = 0;
        } else {
            hashCode40 = str28.hashCode();
        }
        int i82 = (i81 + hashCode40) * 31;
        Integer num3 = this.A0g;
        if (num3 == null) {
            hashCode41 = 0;
        } else {
            hashCode41 = num3.hashCode();
        }
        int i83 = (i82 + hashCode41) * 31;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = this.A0K;
        if (clipsWatchAndBrowseData == null) {
            hashCode42 = 0;
        } else {
            hashCode42 = clipsWatchAndBrowseData.hashCode();
        }
        int i84 = (i83 + hashCode42) * 31;
        String str29 = this.A16;
        if (str29 == null) {
            hashCode43 = 0;
        } else {
            hashCode43 = str29.hashCode();
        }
        int i85 = (i84 + hashCode43) * 31;
        String str30 = this.A01;
        if (str30 == null) {
            hashCode44 = 0;
        } else {
            hashCode44 = str30.hashCode();
        }
        int i86 = (i85 + hashCode44) * 31;
        ClipsReplyBarData clipsReplyBarData = this.A0L;
        if (clipsReplyBarData == null) {
            hashCode45 = 0;
        } else {
            hashCode45 = clipsReplyBarData.hashCode();
        }
        int i87 = (i86 + hashCode45) * 31;
        ClipsTogetherData clipsTogetherData = this.A2D;
        if (clipsTogetherData == null) {
            hashCode46 = 0;
        } else {
            hashCode46 = clipsTogetherData.hashCode();
        }
        int i88 = (i87 + hashCode46) * 31;
        ClipsSpotlightData clipsSpotlightData = this.A0M;
        if (clipsSpotlightData == null) {
            hashCode47 = 0;
        } else {
            hashCode47 = clipsSpotlightData.hashCode();
        }
        int i89 = (i88 + hashCode47) * 31;
        int i90 = 1237;
        if (this.A1Y) {
            i90 = 1231;
        }
        int i91 = (i89 + i90) * 31;
        int i92 = 1237;
        if (this.A1Z) {
            i92 = 1231;
        }
        int i93 = (i91 + i92) * 31;
        String str31 = this.A1J;
        if (str31 == null) {
            hashCode48 = 0;
        } else {
            hashCode48 = str31.hashCode();
        }
        int i94 = (i93 + hashCode48) * 31;
        ClipsViewerDirectData clipsViewerDirectData = this.A0I;
        if (clipsViewerDirectData == null) {
            hashCode49 = 0;
        } else {
            hashCode49 = clipsViewerDirectData.hashCode();
        }
        int i95 = (i94 + hashCode49) * 31;
        int i96 = 1237;
        if (this.A1f) {
            i96 = 1231;
        }
        int i97 = (i95 + i96) * 31;
        String str32 = this.A2G;
        if (str32 == null) {
            hashCode50 = 0;
        } else {
            hashCode50 = str32.hashCode();
        }
        int i98 = (((i97 + hashCode50) * 31) + this.A2B) * 31;
        String str33 = this.A0y;
        if (str33 == null) {
            hashCode51 = 0;
        } else {
            hashCode51 = str33.hashCode();
        }
        int i99 = (i98 + hashCode51) * 31;
        String str34 = this.A02;
        if (str34 == null) {
            hashCode52 = 0;
        } else {
            hashCode52 = str34.hashCode();
        }
        int i100 = (i99 + hashCode52) * 31;
        int i101 = 1237;
        if (this.A1g) {
            i101 = 1231;
        }
        int hashCode84 = (((i100 + i101) * 31) + this.A0O.hashCode()) * 31;
        String str35 = this.A2H;
        if (str35 == null) {
            hashCode53 = 0;
        } else {
            hashCode53 = str35.hashCode();
        }
        int i102 = (hashCode84 + hashCode53) * 31;
        int i103 = 1237;
        if (this.A27) {
            i103 = 1231;
        }
        int i104 = (i102 + i103) * 31;
        int i105 = 1237;
        if (this.A29) {
            i105 = 1231;
        }
        int i106 = (i104 + i105) * 31;
        int i107 = 1237;
        if (this.A2A) {
            i107 = 1231;
        }
        int i108 = (i106 + i107) * 31;
        int i109 = 1237;
        if (this.A28) {
            i109 = 1231;
        }
        int i110 = (i108 + i109) * 31;
        int i111 = 1237;
        if (this.A1X) {
            i111 = 1231;
        }
        int i112 = (i110 + i111) * 31;
        int i113 = 1237;
        if (this.A1l) {
            i113 = 1231;
        }
        int floatToIntBits = (((((((((i112 + i113) * 31) + Float.floatToIntBits(this.A05)) * 31) + Float.floatToIntBits(this.A03)) * 31) + Float.floatToIntBits(this.A04)) * 31) + Float.floatToIntBits(this.A06)) * 31;
        int i114 = 1237;
        if (this.A2J) {
            i114 = 1231;
        }
        int i115 = (floatToIntBits + i114) * 31;
        String str36 = this.A11;
        if (str36 == null) {
            hashCode54 = 0;
        } else {
            hashCode54 = str36.hashCode();
        }
        int i116 = (i115 + hashCode54) * 31;
        int i117 = 1237;
        if (this.A1z) {
            i117 = 1231;
        }
        int i118 = (i116 + i117) * 31;
        RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition = this.A0P;
        if (rIXUChainingBehaviorDefinition == null) {
            hashCode55 = 0;
        } else {
            hashCode55 = rIXUChainingBehaviorDefinition.hashCode();
        }
        int i119 = (i118 + hashCode55) * 31;
        int i120 = 1237;
        if (this.A2L) {
            i120 = 1231;
        }
        int i121 = (i119 + i120) * 31;
        int i122 = 1237;
        if (this.A1x) {
            i122 = 1231;
        }
        int i123 = (i121 + i122) * 31;
        int i124 = 1237;
        if (this.A1y) {
            i124 = 1231;
        }
        int i125 = (i123 + i124) * 31;
        String str37 = this.A0m;
        if (str37 == null) {
            hashCode56 = 0;
        } else {
            hashCode56 = str37.hashCode();
        }
        int i126 = (i125 + hashCode56) * 31;
        String str38 = this.A0l;
        if (str38 == null) {
            hashCode57 = 0;
        } else {
            hashCode57 = str38.hashCode();
        }
        int i127 = (i126 + hashCode57) * 31;
        Integer num4 = this.A0c;
        if (num4 == null) {
            hashCode58 = 0;
        } else {
            hashCode58 = num4.hashCode();
        }
        int i128 = (i127 + hashCode58) * 31;
        int i129 = 1237;
        if (this.A20) {
            i129 = 1231;
        }
        int i130 = (i128 + i129) * 31;
        int i131 = 1237;
        if (this.A1v) {
            i131 = 1231;
        }
        int i132 = (i130 + i131) * 31;
        ClipChainType clipChainType = this.A0F;
        if (clipChainType == null) {
            hashCode59 = 0;
        } else {
            hashCode59 = clipChainType.hashCode();
        }
        Integer num5 = this.A0Z;
        int hashCode85 = (((i132 + hashCode59) * 31) + C9IG.A00(num5).hashCode() + num5.intValue()) * 31;
        String str39 = this.A12;
        if (str39 == null) {
            hashCode60 = 0;
        } else {
            hashCode60 = str39.hashCode();
        }
        int i133 = (hashCode85 + hashCode60) * 31;
        Integer num6 = this.A0b;
        if (num6 == null) {
            hashCode61 = 0;
        } else {
            hashCode61 = num6.hashCode();
        }
        int i134 = (i133 + hashCode61) * 31;
        Long l = this.A0h;
        if (l == null) {
            hashCode62 = 0;
        } else {
            hashCode62 = l.hashCode();
        }
        int i135 = (i134 + hashCode62) * 31;
        String str40 = this.A0q;
        if (str40 == null) {
            hashCode63 = 0;
        } else {
            hashCode63 = str40.hashCode();
        }
        int i136 = (i135 + hashCode63) * 31;
        Integer num7 = this.A0Y;
        if (num7 == null) {
            intValue = 0;
        } else {
            intValue = (-1359909864) + num7.intValue();
        }
        int i137 = (i136 + intValue) * 31;
        Integer num8 = this.A0d;
        if (num8 == null) {
            hashCode64 = 0;
        } else {
            hashCode64 = num8.hashCode();
        }
        int i138 = (i137 + hashCode64) * 31;
        int i139 = 1237;
        if (this.A26) {
            i139 = 1231;
        }
        int i140 = (i138 + i139) * 31;
        Integer num9 = this.A0f;
        if (num9 == null) {
            hashCode65 = 0;
        } else {
            hashCode65 = AbstractC166107be.A01(num9).hashCode() + num9.intValue();
        }
        int i141 = (i140 + hashCode65) * 31;
        String str41 = this.A0n;
        if (str41 == null) {
            hashCode66 = 0;
        } else {
            hashCode66 = str41.hashCode();
        }
        int i142 = (i141 + hashCode66) * 31;
        String str42 = this.A1N;
        if (str42 == null) {
            hashCode67 = 0;
        } else {
            hashCode67 = str42.hashCode();
        }
        int i143 = (i142 + hashCode67) * 31;
        int i144 = 1237;
        if (this.A1h) {
            i144 = 1231;
        }
        int i145 = (i143 + i144) * 31;
        String str43 = this.A0o;
        if (str43 == null) {
            hashCode68 = 0;
        } else {
            hashCode68 = str43.hashCode();
        }
        int i146 = (i145 + hashCode68) * 31;
        int i147 = 1237;
        if (this.A1o) {
            i147 = 1231;
        }
        int i148 = (i146 + i147) * 31;
        int i149 = 1237;
        if (this.A1k) {
            i149 = 1231;
        }
        int i150 = (i148 + i149) * 31;
        int i151 = 1237;
        if (this.A1e) {
            i151 = 1231;
        }
        int i152 = (i150 + i151) * 31;
        String str44 = this.A1L;
        if (str44 == null) {
            hashCode69 = 0;
        } else {
            hashCode69 = str44.hashCode();
        }
        int i153 = (i152 + hashCode69) * 31;
        int i154 = 1237;
        if (this.A23) {
            i154 = 1231;
        }
        int i155 = (i153 + i154) * 31;
        int i156 = 1237;
        if (this.A1i) {
            i156 = 1231;
        }
        int i157 = (i155 + i156) * 31;
        String str45 = this.A1P;
        if (str45 == null) {
            hashCode70 = 0;
        } else {
            hashCode70 = str45.hashCode();
        }
        int i158 = (i157 + hashCode70) * 31;
        Integer num10 = this.A0e;
        if (num10 == null) {
            hashCode71 = 0;
        } else {
            hashCode71 = num10.hashCode();
        }
        int i159 = (i158 + hashCode71) * 31;
        String str46 = this.A1A;
        if (str46 == null) {
            hashCode72 = 0;
        } else {
            hashCode72 = str46.hashCode();
        }
        int i160 = (i159 + hashCode72) * 31;
        int i161 = 1237;
        if (this.A1w) {
            i161 = 1231;
        }
        int i162 = (i160 + i161) * 31;
        String str47 = this.A0w;
        if (str47 == null) {
            hashCode73 = 0;
        } else {
            hashCode73 = str47.hashCode();
        }
        int i163 = (i162 + hashCode73) * 31;
        Boolean bool2 = this.A0U;
        if (bool2 == null) {
            hashCode74 = 0;
        } else {
            hashCode74 = bool2.hashCode();
        }
        int i164 = (i163 + hashCode74) * 31;
        int i165 = 1237;
        if (this.A22) {
            i165 = 1231;
        }
        int i166 = (i164 + i165) * 31;
        int i167 = 1237;
        if (this.A24) {
            i167 = 1231;
        }
        int i168 = (i166 + i167) * 31;
        String str48 = this.A0r;
        if (str48 == null) {
            hashCode75 = 0;
        } else {
            hashCode75 = str48.hashCode();
        }
        int i169 = (i168 + hashCode75) * 31;
        Integer num11 = this.A0a;
        if (num11 == null) {
            hashCode76 = 0;
        } else {
            hashCode76 = num11.hashCode();
        }
        int i170 = (i169 + hashCode76) * 31;
        Long l2 = this.A0i;
        if (l2 == null) {
            hashCode77 = 0;
        } else {
            hashCode77 = l2.hashCode();
        }
        int i171 = (i170 + hashCode77) * 31;
        String str49 = this.A0s;
        if (str49 == null) {
            hashCode78 = 0;
        } else {
            hashCode78 = str49.hashCode();
        }
        int i172 = (i171 + hashCode78) * 31;
        int i173 = 1237;
        if (this.A1t) {
            i173 = 1231;
        }
        int i174 = (i172 + i173) * 31;
        Integer num12 = this.A0X;
        if (num12 != null) {
            i = num12.hashCode();
        }
        int i175 = (i174 + i) * 31;
        int i176 = 1237;
        if (this.A1n) {
            i176 = 1231;
        }
        return i175 + i176;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder();
        sb.append("ClipsViewerConfig(clipsViewerSource=");
        sb.append(this.A0J);
        sb.append(", sourceMediaId=");
        sb.append(this.A1I);
        sb.append(", sourceAdId=");
        sb.append(this.A1C);
        sb.append(", sourceAdToken=");
        sb.append(this.A1F);
        sb.append(", sourceAdPostTriggerEligibilityFlags=");
        sb.append(this.A1D);
        sb.append(", openedClipIndex=");
        sb.append(this.A08);
        sb.append(", mediaIds=");
        sb.append(this.A0x);
        sb.append(", sourceMediaIds=");
        sb.append(this.A0E);
        sb.append(", sourceAdRetrievalKey=");
        sb.append(this.A1E);
        sb.append(", isSourceClipsItemAd=");
        sb.append(this.A1j);
        sb.append(", shortUrlId=");
        sb.append(this.A1B);
        sb.append(", sourceAssetId=");
        sb.append(this.A1G);
        sb.append(", sourceAttributionUserId=");
        sb.append(this.A1H);
        sb.append(", sourceAssetEnabled=");
        sb.append(this.A0V);
        sb.append(", contextualHighlightInfo=");
        sb.append(this.A0N);
        sb.append(", sourceUniqueGridKey=");
        sb.append(this.A1K);
        sb.append(", sourceMediaStartTimeMs=");
        sb.append(this.A09);
        sb.append(", rootReferrerMediaId=");
        sb.append(this.A17);
        sb.append(", rootReferrerMediaRankingToken=");
        sb.append(this.A18);
        sb.append(", audioClusterId=");
        sb.append(this.A2F);
        sb.append(", musicCanonicalId=");
        sb.append(this.A0z);
        sb.append(", musicCanonicalSegmentId=");
        sb.append(this.A10);
        sb.append(", audioPageModelType=");
        sb.append(this.A0R);
        sb.append(", musicSpotlightMediaIds=");
        sb.append(this.A0D);
        sb.append(", targetCommentId=");
        sb.append(this.A1M);
        sb.append(", pollId=");
        sb.append(this.A13);
        sb.append(", pollType=");
        sb.append(this.A0G);
        sb.append(", commentSheetEntryPoint=");
        sb.append(this.A0C);
        sb.append(", targetNoteId=");
        sb.append(this.A1O);
        sb.append(", inFeedTraySessionId=");
        sb.append(this.A0v);
        sb.append(", inFeedTrayPosition=");
        sb.append(this.A2E);
        sb.append(", viewerActionSource=");
        sb.append(this.A2C);
        sb.append(", viewerEntryActionSource=");
        sb.append(this.A0B);
        sb.append(", shouldShowInsightBottomSheetOnEnter=");
        sb.append(this.A21);
        sb.append(", trendsPageCameraEntryPoint=");
        sb.append(this.A0A);
        sb.append(", _customSourceModuleName=");
        sb.append(this.A00);
        sb.append(", pullToRefreshEnabled=");
        sb.append(this.A1q);
        sb.append(", autoAdvanceToNextItemOnOpen=");
        sb.append(this.A0H);
        sb.append(", actionBarExitIcon=");
        Integer num = this.A0W;
        if (num != null) {
            str = C9IF.A01(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", defaultAudioOn=");
        sb.append(this.A2I);
        sb.append(", recentlyDeletedModeEnabled=");
        sb.append(this.A1r);
        sb.append(", activityCenterScreen=");
        sb.append(this.A0T);
        sb.append(", launchedFromAdsHistory=");
        sb.append(this.A1m);
        sb.append(", disableSyncWithGridStore=");
        sb.append(this.A1U);
        sb.append(", disableViewerToGridStoreSync=");
        sb.append(this.A1W);
        sb.append(", shouldForceDisableTailLoads=");
        sb.append(this.A1u);
        sb.append(", showUpsellOnLastItem=");
        sb.append(this.A25);
        sb.append(", isSubtab=");
        sb.append(this.A2K);
        sb.append(", customActionBarTitle=");
        sb.append(this.A0t);
        sb.append(", customSecondaryActionBarTitle=");
        sb.append(this.A0u);
        sb.append(", pullFromGridStoreOnGhost=");
        sb.append(this.A1p);
        sb.append(", shouldConsiderPreviouslyInsertedItems=");
        sb.append(this.A1s);
        sb.append(", maxPageForCoverItemInsertion=");
        sb.append(this.A07);
        sb.append(", disableAnimations=");
        sb.append(this.A1Q);
        sb.append(", hideCameraButton=");
        sb.append(this.A1a);
        sb.append(", hideLikeButton=");
        sb.append(this.A1c);
        sb.append(", hideCommentButton=");
        sb.append(this.A1b);
        sb.append(", hideReshareButton=");
        sb.append(this.A1d);
        sb.append(", disableLikedContainerInteraction=");
        sb.append(this.A1T);
        sb.append(", disableCommentContainerInteraction=");
        sb.append(this.A1S);
        sb.append(", disableAttributionsContainerInteraction=");
        sb.append(this.A1R);
        sb.append(", disableUserAndAvatarInteraction=");
        sb.append(this.A1V);
        sb.append(", adPreviewCtaText=");
        sb.append(this.A0j);
        sb.append(", adPreviewPoliticalBylineText=");
        sb.append(this.A0k);
        sb.append(", adPreviewSelectedAudioOverlayTrack=");
        sb.append(this.A0Q);
        sb.append(", searchContext=");
        sb.append(this.A0S);
        sb.append(", searchSessionId=");
        sb.append(this.A19);
        sb.append(", rankToken=");
        sb.append(this.A15);
        sb.append(", queryText=");
        sb.append(this.A14);
        sb.append(", clipsMaxId=");
        sb.append(this.A0p);
        sb.append(", viewerConstrainedHeightPx=");
        sb.append(this.A0g);
        sb.append(", clipsWatchAndBrowseData=");
        sb.append(this.A0K);
        sb.append(", reelsPageIndex=");
        sb.append(this.A16);
        sb.append(", containerId=");
        sb.append(this.A01);
        sb.append(", clipsReplyBarData=");
        sb.append(this.A0L);
        sb.append(", clipsTogetherData=");
        sb.append(this.A2D);
        sb.append(", clipsSpotlightData=");
        sb.append(this.A0M);
        sb.append(", enableClipsBackwardsPagination=");
        sb.append(this.A1Y);
        sb.append(", enableClipsDualPagination=");
        sb.append(this.A1Z);
        sb.append(", sourceThreadId=");
        sb.append(this.A1J);
        sb.append(", directData=");
        sb.append(this.A0I);
        sb.append(", isDovetailMedia=");
        sb.append(this.A1f);
        sb.append(", clipsViewerAnimatorHandle=");
        sb.append(this.A2G);
        sb.append(", drawerKeyboardOffset=");
        sb.append(this.A2B);
        sb.append(", momentId=");
        sb.append(this.A0y);
        sb.append(", shoppingSessionId=");
        sb.append(this.A02);
        sb.append(", isFromExternalSend=");
        sb.append(this.A1g);
        sb.append(", playlistContext=");
        sb.append(this.A0O);
        sb.append(", sourceModuleName=");
        sb.append(this.A2H);
        sb.append(", swipeDownToDismissEnabled=");
        sb.append(this.A27);
        sb.append(", swipeUpToDismissEnabled=");
        sb.append(this.A29);
        sb.append(", swipeUpToDismissEnabledAtEndOfChaining=");
        sb.append(this.A2A);
        sb.append(", swipeRightToDismissEnabled=");
        sb.append(this.A28);
        sb.append(", dragToDismissEnabled=");
        sb.append(this.A1X);
        sb.append(", keepFeedInBackgroundEnabled=");
        sb.append(this.A1l);
        sb.append(", clipsSourceViewTop=");
        sb.append(this.A05);
        sb.append(", clipsSourceViewHeight=");
        sb.append(this.A03);
        sb.append(", clipsSourceViewLeft=");
        sb.append(this.A04);
        sb.append(", clipsSourceViewWidth=");
        sb.append(this.A06);
        sb.append(", forceModalActivity=");
        sb.append(this.A2J);
        sb.append(", nextOffsetForPagination=");
        sb.append(this.A11);
        sb.append(", shouldRevertToDefaultTheme=");
        sb.append(this.A1z);
        sb.append(", chainingBehaviorDefinition=");
        sb.append(this.A0P);
        sb.append(", showAdsOnlyForDebug=");
        sb.append(this.A2L);
        sb.append(", shouldOpenReactionSheet=");
        sb.append(this.A1x);
        sb.append(", shouldOpenSaveCollectionsSheet=");
        sb.append(this.A1y);
        sb.append(", appreciationNotificationType=");
        sb.append(this.A0m);
        sb.append(", appreciationNotificationEntryPoint=");
        sb.append(this.A0l);
        sb.append(", netegoSubtype=");
        sb.append(this.A0c);
        sb.append(", shouldScrollAwayActionBar=");
        sb.append(this.A20);
        sb.append(", shouldForceStartPosition=");
        sb.append(this.A1v);
        sb.append(", clipChainType=");
        sb.append(this.A0F);
        sb.append(", clipsViewerAdMode=");
        Integer num2 = this.A0Z;
        if (num2 != null) {
            str2 = C9IG.A00(num2);
        } else {
            str2 = "null";
        }
        sb.append(str2);
        sb.append(", notificationSource=");
        sb.append(this.A12);
        sb.append(", midcardPrioritizePosition=");
        sb.append(this.A0b);
        sb.append(", clipsSourceIdFromProfile=");
        sb.append(this.A0h);
        sb.append(", clipsStartingRankingInfoToken=");
        sb.append(this.A0q);
        sb.append(", chainCtaType=");
        if (this.A0Y != null) {
            str3 = "CAMERA_GALLERY";
        } else {
            str3 = "null";
        }
        sb.append(str3);
        sb.append(", secondaryChainMediaPosition=");
        sb.append(this.A0d);
        sb.append(", supportsOpalCreation=");
        sb.append(this.A26);
        sb.append(", sortOrder=");
        Integer num3 = this.A0f;
        if (num3 != null) {
            str4 = AbstractC166107be.A01(num3);
        } else {
            str4 = "null";
        }
        sb.append(str4);
        sb.append(", blendId=");
        sb.append(this.A0n);
        sb.append(", targetMediaIgId=");
        sb.append(this.A1N);
        sb.append(", isInitialBlendJoin=");
        sb.append(this.A1h);
        sb.append(", blendRecommenderIgIds=");
        sb.append(this.A0o);
        sb.append(", previewAudioTranslations=");
        sb.append(this.A1o);
        sb.append(", isSourceItemPartOfMultiAds=");
        sb.append(this.A1k);
        sb.append(", highlightOriginalMedia=");
        sb.append(this.A1e);
        sb.append(", spinId=");
        sb.append(this.A1L);
        sb.append(", showCommentNudge=");
        sb.append(this.A23);
        sb.append(", isMetaAiClipsChainingMode=");
        sb.append(this.A1i);
        sb.append(", trialNotificationType=");
        sb.append(this.A1P);
        sb.append(", seedAdMultiAdsType=");
        sb.append(this.A0e);
        sb.append(", seedAdMultiAdsUnitId=");
        sb.append(this.A1A);
        sb.append(", shouldHideTabBar=");
        sb.append(this.A1w);
        sb.append(", interestId=");
        sb.append(this.A0w);
        sb.append(", showUnseenDemarcator=");
        sb.append(this.A0U);
        sb.append(", showAddNoteBar=");
        sb.append(this.A22);
        sb.append(", showContentNoteComposerBar=");
        sb.append(this.A24);
        sb.append(", contentNoteAuthorId=");
        sb.append(this.A0r);
        sb.append(", contentNoteMediaLimit=");
        sb.append(this.A0a);
        sb.append(", httpCacheTimeoutMs=");
        sb.append(this.A0i);
        sb.append(", coverMediaId=");
        sb.append(this.A0s);
        sb.append(", shouldForceDisableFlashCache=");
        sb.append(this.A1t);
        sb.append(", carouselPosition=");
        sb.append(this.A0X);
        sb.append(", launchedFromCarouselMedia=");
        sb.append(this.A1n);
        sb.append(')');
        return sb.toString();
    }

    public ClipsViewerConfig(C22P c22p, EnumC120795dP enumC120795dP, EnumC120805dQ enumC120805dQ, EnumC120785dO enumC120785dO, ImmutableList immutableList, ImmutableList immutableList2, ClipChainType clipChainType, PollType pollType, EnumC116885Qs enumC116885Qs, ClipsViewerDirectData clipsViewerDirectData, ClipsViewerSource clipsViewerSource, ClipsWatchAndBrowseData clipsWatchAndBrowseData, ClipsReplyBarData clipsReplyBarData, ClipsSpotlightData clipsSpotlightData, ClipsTogetherData clipsTogetherData, ClipsContextualHighlightInfo clipsContextualHighlightInfo, PlaylistContext playlistContext, RIXUChainingBehaviorDefinition rIXUChainingBehaviorDefinition, AudioOverlayTrack audioOverlayTrack, AudioType audioType, SearchContext searchContext, EnumC114765Gh enumC114765Gh, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, float f, float f2, float f3, float f4, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34, boolean z35, boolean z36, boolean z37, boolean z38, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, boolean z44, boolean z45, boolean z46, boolean z47, boolean z48, boolean z49, boolean z50, boolean z51) {
        C14360o3.A0B(clipsViewerSource, 1);
        C14360o3.A0B(c22p, 35);
        C14360o3.A0B(enumC116885Qs, 38);
        C14360o3.A0B(searchContext, 66);
        C14360o3.A0B(playlistContext, 88);
        this.A0J = clipsViewerSource;
        this.A1I = str;
        this.A1C = str2;
        this.A1F = str3;
        this.A1D = str4;
        this.A08 = i;
        this.A0x = str5;
        this.A0E = immutableList;
        this.A1E = str6;
        this.A1j = z;
        this.A1B = str7;
        this.A1G = str8;
        this.A1H = str9;
        this.A0V = bool;
        this.A0N = clipsContextualHighlightInfo;
        this.A1K = str10;
        this.A09 = i2;
        this.A17 = str11;
        this.A18 = str12;
        this.A2F = str13;
        this.A0z = str14;
        this.A10 = str15;
        this.A0R = audioType;
        this.A0D = immutableList2;
        this.A1M = str16;
        this.A13 = str17;
        this.A0G = pollType;
        this.A0C = enumC120785dO;
        this.A1O = str18;
        this.A0v = str19;
        this.A2E = num;
        this.A2C = enumC120795dP;
        this.A0B = enumC120805dQ;
        this.A21 = z2;
        this.A0A = c22p;
        this.A00 = str20;
        this.A1q = z3;
        this.A0H = enumC116885Qs;
        this.A0W = num2;
        this.A2I = z4;
        this.A1r = z5;
        this.A0T = enumC114765Gh;
        this.A1m = z6;
        this.A1U = z7;
        this.A1W = z8;
        this.A1u = z9;
        this.A25 = z10;
        this.A2K = z11;
        this.A0t = str21;
        this.A0u = str22;
        this.A1p = z12;
        this.A1s = z13;
        this.A07 = i3;
        this.A1Q = z14;
        this.A1a = z15;
        this.A1c = z16;
        this.A1b = z17;
        this.A1d = z18;
        this.A1T = z19;
        this.A1S = z20;
        this.A1R = z21;
        this.A1V = z22;
        this.A0j = str23;
        this.A0k = str24;
        this.A0Q = audioOverlayTrack;
        this.A0S = searchContext;
        this.A19 = str25;
        this.A15 = str26;
        this.A14 = str27;
        this.A0p = str28;
        this.A0g = num3;
        this.A0K = clipsWatchAndBrowseData;
        this.A16 = str29;
        this.A01 = str30;
        this.A0L = clipsReplyBarData;
        this.A2D = clipsTogetherData;
        this.A0M = clipsSpotlightData;
        this.A1Y = z23;
        this.A1Z = z24;
        this.A1J = str31;
        this.A0I = clipsViewerDirectData;
        this.A1f = z25;
        this.A2G = str32;
        this.A2B = i4;
        this.A0y = str33;
        this.A02 = str34;
        this.A1g = z26;
        this.A0O = playlistContext;
        this.A2H = str35;
        this.A27 = z27;
        this.A29 = z28;
        this.A2A = z29;
        this.A28 = z30;
        this.A1X = z31;
        this.A1l = z32;
        this.A05 = f;
        this.A03 = f2;
        this.A04 = f3;
        this.A06 = f4;
        this.A2J = z33;
        this.A11 = str36;
        this.A1z = z34;
        this.A0P = rIXUChainingBehaviorDefinition;
        this.A2L = z35;
        this.A1x = z36;
        this.A1y = z37;
        this.A0m = str37;
        this.A0l = str38;
        this.A0c = num4;
        this.A20 = z38;
        this.A1v = z39;
        this.A0F = clipChainType;
        this.A0Z = num5;
        this.A12 = str39;
        this.A0b = num6;
        this.A0h = l;
        this.A0q = str40;
        this.A0Y = num7;
        this.A0d = num8;
        this.A26 = z40;
        this.A0f = num9;
        this.A0n = str41;
        this.A1N = str42;
        this.A1h = z41;
        this.A0o = str43;
        this.A1o = z42;
        this.A1k = z43;
        this.A1e = z44;
        this.A1L = str44;
        this.A23 = z45;
        this.A1i = z46;
        this.A1P = str45;
        this.A0e = num10;
        this.A1A = str46;
        this.A1w = z47;
        this.A0w = str47;
        this.A0U = bool2;
        this.A22 = z48;
        this.A24 = z49;
        this.A0r = str48;
        this.A0a = num11;
        this.A0i = l2;
        this.A0s = str49;
        this.A1t = z50;
        this.A0X = num12;
        this.A1n = z51;
    }
}
