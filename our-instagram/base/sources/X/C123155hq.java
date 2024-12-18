package X;

/* renamed from: X.5hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123155hq extends C4SW {
    @Override // X.C4SW
    public final void A00(InterfaceC02550Ad interfaceC02550Ad) {
        boolean z;
        String str;
        long j;
        Double d;
        Double d2;
        Long l;
        Long l2;
        Long l3;
        C14360o3.A0B(interfaceC02550Ad, 0);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_video_viewability_changed");
        if (A00.isSampled()) {
            C95684Sc c95684Sc = this.A06;
            Long l4 = null;
            if (c95684Sc != null) {
                C4SX c4sx = c95684Sc.A00;
                if (c4sx != null && (l3 = c4sx.A00) != null) {
                    j = l3.longValue();
                } else {
                    j = 0;
                }
                A00.A9K("a_pk", Long.valueOf(j));
                if (c95684Sc.A0d != null) {
                    A00.A9K("current_viewability_percentage", Long.valueOf(r0.intValue()));
                    String str2 = c95684Sc.A10;
                    if (str2 != null) {
                        A00.AAP("m_pk", str2);
                        A00.AAP("a_i", c95684Sc.A1I);
                        A00.AAP("nav_chain", c95684Sc.A13);
                        if (c95684Sc.A0H != null) {
                            d = Double.valueOf(r0.floatValue());
                        } else {
                            d = null;
                        }
                        A00.A8I("time", d);
                        if (c95684Sc.A0H != null) {
                            d2 = Double.valueOf(r0.floatValue());
                        } else {
                            d2 = null;
                        }
                        A00.A8I("video_time_position", d2);
                        A00.AAP("tracking_token", c95684Sc.A1H);
                        A00.AAP("application_state", null);
                        A00.A9K("dr_ad_type", null);
                        A00.AAP("feed_request_id", null);
                        A00.AAP("follow_status", c95684Sc.A0v);
                        A00.AAP("gating_type", null);
                        A00.AAP("inventory_source", c95684Sc.A0y);
                        if (c95684Sc.A0T != null) {
                            l = Long.valueOf(r0.intValue());
                        } else {
                            l = null;
                        }
                        A00.A9K("is_dash_eligible", l);
                        if (c95684Sc.A0S != null) {
                            l2 = Long.valueOf(r0.intValue());
                        } else {
                            l2 = null;
                        }
                        A00.A9K("m_ix", l2);
                        A00.A9K("m_t", null);
                        A00.A9K("m_ts", c95684Sc.A0f);
                        A00.AAP("playback_format", c95684Sc.A16);
                        A00.AAP(AbstractC50532MSl.A01(197, 10, 82), null);
                        z = true;
                    } else {
                        throw new IllegalStateException("mediaId should not be null.");
                    }
                } else {
                    throw new IllegalStateException("viewability should not be null.");
                }
            } else {
                z = false;
            }
            C95714Sf c95714Sf = this.A07;
            if (c95714Sf != null && z) {
                if (c95714Sf.A0J != null) {
                    l4 = Long.valueOf(r0.intValue());
                }
                A00.A9K("number_of_qualities", l4);
            }
            C95684Sc c95684Sc2 = this.A06;
            if (c95684Sc2 != null && (str = c95684Sc2.A0x) != null) {
                if (z) {
                    A00.A9K("host_profile_id", AbstractC003100w.A0k(10, str));
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
