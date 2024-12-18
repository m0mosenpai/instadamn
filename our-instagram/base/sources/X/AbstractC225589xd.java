package X;

import java.io.IOException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225589xd {
    /* JADX WARN: Type inference failed for: r2v1, types: [X.4la] */
    public static C103584la parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            final String str = null;
            final String str2 = null;
            final String str3 = null;
            final String str4 = null;
            final String str5 = null;
            final String str6 = null;
            final String str7 = null;
            final String str8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("all_others".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("mqtt".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("native_apps".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("photo".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("static".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("video_upload".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("web".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C0T6(str, str2, str3, str4, str5, str6, str7, str8) { // from class: X.4la
                public final String A00;
                public final String A01;
                public final String A02;
                public final String A03;
                public final String A04;
                public final String A05;
                public final String A06;
                public final String A07;

                public final boolean equals(Object obj) {
                    if (this != obj) {
                        if (obj instanceof C103584la) {
                            C103584la c103584la = (C103584la) obj;
                            if (!C14360o3.A0K(this.A01, c103584la.A01) || !C14360o3.A0K(this.A02, c103584la.A02) || !C14360o3.A0K(this.A03, c103584la.A03) || !C14360o3.A0K(this.A04, c103584la.A04) || !C14360o3.A0K(this.A00, c103584la.A00) || !C14360o3.A0K(this.A05, c103584la.A05) || !C14360o3.A0K(this.A06, c103584la.A06) || !C14360o3.A0K(this.A07, c103584la.A07)) {
                            }
                        }
                        return false;
                    }
                    return true;
                }

                public final int hashCode() {
                    String str9 = this.A01;
                    int hashCode = (str9 == null ? 0 : str9.hashCode()) * 31;
                    String str10 = this.A02;
                    int hashCode2 = (hashCode + (str10 == null ? 0 : str10.hashCode())) * 31;
                    String str11 = this.A03;
                    int hashCode3 = (hashCode2 + (str11 == null ? 0 : str11.hashCode())) * 31;
                    String str12 = this.A04;
                    int hashCode4 = (hashCode3 + (str12 == null ? 0 : str12.hashCode())) * 31;
                    String str13 = this.A00;
                    int hashCode5 = (hashCode4 + (str13 == null ? 0 : str13.hashCode())) * 31;
                    String str14 = this.A05;
                    int hashCode6 = (hashCode5 + (str14 == null ? 0 : str14.hashCode())) * 31;
                    String str15 = this.A06;
                    int hashCode7 = (hashCode6 + (str15 == null ? 0 : str15.hashCode())) * 31;
                    String str16 = this.A07;
                    return hashCode7 + (str16 != null ? str16.hashCode() : 0);
                }

                {
                    this.A01 = str;
                    this.A02 = str2;
                    this.A03 = str3;
                    this.A04 = str4;
                    this.A00 = str5;
                    this.A05 = str6;
                    this.A06 = str7;
                    this.A07 = str8;
                }
            };
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
