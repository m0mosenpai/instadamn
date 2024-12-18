package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.5So, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C117295So extends C4SW {
    @Override // X.C4SW
    public final void A00(InterfaceC02550Ad interfaceC02550Ad) {
        C14360o3.A0B(interfaceC02550Ad, 0);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "video_fetched");
        if (A00.isSampled()) {
            C95684Sc c95684Sc = this.A06;
            boolean z = false;
            Long l = null;
            if (c95684Sc != null) {
                if (c95684Sc.A0Y != null) {
                    A00.A9K("seq_num", Long.valueOf(r0.intValue()));
                    String str = c95684Sc.A10;
                    if (str == null) {
                        str = "0";
                    }
                    A00.AAP("m_pk", str);
                    C4SX c4sx = c95684Sc.A00;
                    if (c4sx == null) {
                        c4sx = new C4SX(0L);
                    }
                    A00.AAK(c4sx, "a_pk");
                    A00.AAP("a_i", c95684Sc.A1I);
                    Boolean bool = c95684Sc.A06;
                    if (bool != null) {
                        A00.A7v("cached", bool);
                        String str2 = c95684Sc.A0v;
                        if (str2 != null) {
                            A00.AAP("follow_status", str2);
                            if (c95684Sc.A0T != null) {
                                l = Long.valueOf(r0.intValue());
                            }
                            A00.A9K("is_dash_eligible", l);
                            A00.A7v("is_video_to_carousel", c95684Sc.A09);
                            A00.A9K("m_ts", c95684Sc.A0f);
                            A00.AAP("playback_format", c95684Sc.A16);
                            A00.AAP("tracking_token", c95684Sc.A1H);
                            A00.AAP("video_codec", c95684Sc.A1K);
                            A00.AAP("video_type", c95684Sc.A1L);
                            A00.AAP("mezql_token", c95684Sc.A11);
                            A00.AAP("ranking_info_token", c95684Sc.A1A);
                            A00.AAP("parent_m_pk", c95684Sc.A15);
                            z = true;
                        } else {
                            throw new IllegalStateException("followStatus should not be null.");
                        }
                    } else {
                        throw new IllegalStateException("cached should not be null.");
                    }
                } else {
                    throw new IllegalStateException("seqNum should not be null.");
                }
            }
            C95714Sf c95714Sf = this.A07;
            if (c95714Sf != null) {
                if (z) {
                    A00.AAP("subtype", c95714Sf.A0Z);
                    A00.AAP("position", c95714Sf.A0V);
                    A00.AAP("size", c95714Sf.A0W);
                    A00.A9K(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c95714Sf.A0P);
                }
                C0Zx c0Zx = new C0Zx();
                c0Zx.A03("captions_available", c95714Sf.A04);
                c0Zx.A03("captions_displayed", c95714Sf.A05);
                if (z) {
                    A00.AAQ(c0Zx, "adhoc_data");
                } else {
                    return;
                }
            } else if (!z) {
                return;
            }
            A00.Cht();
        }
    }
}
