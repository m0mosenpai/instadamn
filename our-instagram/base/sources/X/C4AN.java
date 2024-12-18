package X;

import android.text.TextUtils;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* renamed from: X.4AN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AN {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public android.net.Uri A04;
    public android.net.Uri A05;
    public C4AM A06;
    public C4AK A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public List A0H;
    public List A0I;
    public Map A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public static C4AN A00(android.net.Uri uri, String str, Map map) {
        return new C4AN(uri, null, C4AM.GENERAL, C4AK.PROGRESSIVE, str, null, null, "", "", "UNKNOWN", null, "AUDIO_VIDEO", null, null, null, map, false, false, false, false);
    }

    public final boolean equals(Object obj) {
        android.net.Uri uri;
        android.net.Uri uri2;
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4AN)) {
            return false;
        }
        C4AN c4an = (C4AN) obj;
        if (this.A07 == c4an.A07 && (((uri = this.A05) == (uri2 = c4an.A05) || (uri != null && uri.equals(uri2))) && ((str = this.A0G) == (str2 = c4an.A0G) || (str != null && str.equals(str2))))) {
            C4AM c4am = this.A06;
            C4AM c4am2 = c4an.A06;
            if (c4am == c4am2) {
                return true;
            }
            if (c4am != null && c4am.equals(c4am2)) {
                return true;
            }
        }
        return false;
    }

    public C4AN(android.net.Uri uri, android.net.Uri uri2, C4AM c4am, C4AK c4ak, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, Map map, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = uri;
        this.A0G = str;
        this.A09 = str2;
        this.A0F = str3;
        this.A0I = list;
        this.A04 = uri2;
        this.A0A = str4;
        this.A0B = str5;
        this.A0C = str6;
        this.A07 = c4ak;
        this.A02 = -1L;
        this.A03 = -1L;
        this.A01 = -1;
        this.A0E = str7;
        this.A0J = map;
        this.A0M = z;
        this.A0N = z2;
        this.A0L = z3;
        this.A0K = z4;
        this.A0D = str8;
        this.A06 = c4am;
        this.A00 = -1;
        this.A08 = str9;
        this.A0H = list2;
    }

    public final Pair A01() {
        String str;
        android.net.Uri uri;
        C4AK c4ak = this.A07;
        boolean z = false;
        if (c4ak == C4AK.DASH_LIVE) {
            z = true;
        }
        boolean z2 = false;
        if (z && ((uri = this.A05) == null || TextUtils.isEmpty(uri.toString()))) {
            str = "DashLive with null or empty url";
        } else {
            if (c4ak == C4AK.PROGRESSIVE) {
                android.net.Uri uri2 = this.A05;
                if (uri2 == null) {
                    str = "Progressive with null url";
                } else if (uri2.getPath() == null) {
                    str = "Progressive with null url path";
                } else if (this.A05.getPath().endsWith(".mpd")) {
                    str = "Progressive with MPD";
                }
            }
            if (this.A05 == null && TextUtils.isEmpty(this.A09)) {
                str = "VOD with null url and empty manifest";
            } else {
                z2 = true;
                str = "";
            }
        }
        return new Pair(z2, str);
    }

    public final boolean A02() {
        List list = this.A0I;
        if (list != null) {
            for (int i = 0; i < list.toArray().length; i++) {
                if (((String) list.get(i)).startsWith("av01")) {
                    return true;
                }
            }
            return false;
        }
        String str = this.A0F;
        if (str != null) {
            return str.startsWith("av01");
        }
        String str2 = this.A09;
        if (str2 != null && str2.contains("codecs=\"av01")) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (this.A07 != C4AK.DASH_LIVE) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        boolean contains;
        List list = this.A0I;
        if (list != null) {
            for (int i = 0; i < list.toArray().length; i++) {
                if (((String) list.get(i)).startsWith("vp9") || ((String) list.get(i)).startsWith("vp09")) {
                    return true;
                }
            }
            return false;
        }
        String str = this.A0F;
        if (str != null) {
            if (str.startsWith("vp9")) {
                return true;
            }
            contains = str.startsWith("vp09");
        } else {
            String str2 = this.A09;
            if (str2 != null) {
                contains = str2.contains("codecs=\"vp");
            }
            return false;
        }
        if (contains) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.A07.hashCode() * 31;
        String str = this.A0G;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        android.net.Uri uri = this.A05;
        if (uri != null) {
            i2 = uri.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        C4AM c4am = this.A06;
        if (c4am != null) {
            i3 = c4am.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("Type: ");
        sb.append(this.A07);
        String str = this.A0G;
        if (str != null) {
            sb.append("\n\tId: ");
            sb.append(str);
        }
        android.net.Uri uri = this.A05;
        if (uri != null) {
            sb.append("\n\tUri: ");
            sb.append(uri);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            sb.append("\n\tOrigin: ");
            sb.append(str2);
        }
        String str3 = this.A0B;
        if (str3 != null) {
            sb.append("\n\tSubOrigin: ");
            sb.append(str3);
        }
        String str4 = this.A0C;
        if (str4 != null) {
            sb.append("\n\tPrefetchOrigin: ");
            sb.append(str4);
        }
        sb.append("\n\tDashMPD: ");
        String str5 = this.A09;
        if (str5 == null) {
            valueOf = "NULL";
        } else {
            valueOf = Integer.valueOf(str5.length());
        }
        sb.append(valueOf);
        String str6 = this.A0F;
        if (str6 != null) {
            sb.append("\n\tCodec: ");
            sb.append(str6);
        }
        List list = this.A0I;
        if (list != null) {
            sb.append("\n\tCodecs: ");
            sb.append(list);
        }
        android.net.Uri uri2 = this.A04;
        if (uri2 != null) {
            sb.append("\n\tSubtitle: ");
            sb.append(uri2);
        }
        sb.append("\n\tliveLatency: ");
        sb.append(this.A02);
        sb.append("\n\tliveLatencyTolerance: ");
        sb.append(this.A03);
        sb.append("\n\tisSpherical: ");
        sb.append(this.A0M);
        sb.append("\n\tisSponsored: ");
        sb.append(this.A0N);
        sb.append("\n\tisAdBreak: ");
        sb.append(false);
        sb.append("\n\tisLiveTraceEnabled: ");
        sb.append(this.A0L);
        sb.append("\n\trenderMode: ");
        sb.append(this.A0D);
        sb.append("\n\tisBroadcast: ");
        sb.append(false);
        sb.append("\n\tcontentType: ");
        sb.append(this.A06);
        sb.append("\n\tisAudioDataListenerEnabled: ");
        sb.append(this.A0K);
        sb.append("\n\tliveViewerCount: ");
        sb.append(this.A00);
        return sb.toString();
    }

    public C4AN() {
    }
}
