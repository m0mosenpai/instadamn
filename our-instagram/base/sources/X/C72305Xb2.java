package X;

/* renamed from: X.Xb2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72305Xb2 extends C4SW {
    @Override // X.C4SW
    public final void A00(InterfaceC02550Ad interfaceC02550Ad) {
        boolean z;
        C14360o3.A0B(interfaceC02550Ad, 0);
        InterfaceC02590Ai A0H = MSY.A0H(interfaceC02550Ad, AbstractC111324zv.A00(1365));
        if (A0H.isSampled()) {
            C95684Sc c95684Sc = this.A06;
            if (c95684Sc != null) {
                Integer num = c95684Sc.A0Y;
                if (num != null) {
                    A0H.A9K("seq_num", AbstractC25229BEm.A0n(num));
                    String str = c95684Sc.A10;
                    if (str == null) {
                        str = "0";
                    }
                    AbstractC37300Gc1.A0l(A0H, str);
                    C4SX c4sx = c95684Sc.A00;
                    long j = 0;
                    if (c4sx == null) {
                        c4sx = new C4SX(0L);
                    }
                    A0H.AAK(c4sx, "a_pk");
                    A0H.AAP("a_i", c95684Sc.A1I);
                    if (c95684Sc.A0N != null) {
                        A0H.A8I("from_time", Double.valueOf(r0.floatValue()));
                        if (AbstractC166997dE.A1Z(c95684Sc.A05, true)) {
                            j = 1;
                        }
                        A0H.A9K("audio_fetched", Long.valueOf(j));
                        A0H.AAP("channel_pk", c95684Sc.A0r);
                        A0H.A8I("duration", AbstractC72046XLm.A0V(c95684Sc.A0I));
                        A0H.AAP("follow_status", c95684Sc.A0v);
                        A0H.A9K("is_dash_eligible", AbstractC72047XLn.A0F(c95684Sc.A0T));
                        A0H.A7v("is_video_to_carousel", c95684Sc.A09);
                        A0H.A8I("loop_count", AbstractC72046XLm.A0V(c95684Sc.A0L));
                        A0H.A8I("lsp", AbstractC72046XLm.A0V(c95684Sc.A0J));
                        A0H.A9K("m_ts", c95684Sc.A0f);
                        A0H.AAP("playback_format", c95684Sc.A16);
                        A0H.AAP("playing_audio", String.valueOf(c95684Sc.A04));
                        A0H.A8I("time", AbstractC72046XLm.A0V(c95684Sc.A0H));
                        A0H.A8I("to_time", AbstractC72046XLm.A0V(c95684Sc.A0O));
                        A0H.AAP("tracking_token", c95684Sc.A1H);
                        A0H.AAP("video_codec", c95684Sc.A1K);
                        A0H.AAP("video_type", c95684Sc.A1L);
                        A0H.AAP("viewer_session_id", c95684Sc.A1M);
                        A0H.AAP("chaining_session_id", c95684Sc.A0p);
                        A0H.A9K("recent_bandwidth", AbstractC72047XLn.A0F(c95684Sc.A0W));
                        A0H.A9K("video_width", AbstractC72047XLn.A0F(c95684Sc.A0c));
                        A0H.AAP("channel_pk", c95684Sc.A0r);
                        A0H.AAP("nav_chain", c95684Sc.A13);
                        A0H.AAP("seek_reason", c95684Sc.A1F);
                        z = true;
                    } else {
                        throw AbstractC166987dD.A14("seekFromPositionSeconds should not be null.");
                    }
                } else {
                    throw AbstractC166987dD.A14(AbstractC111324zv.A00(3072));
                }
            } else {
                z = false;
            }
            C95714Sf c95714Sf = this.A07;
            if (c95714Sf != null) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A03("captions_available", c95714Sf.A04);
                c0Zx.A03("captions_displayed", c95714Sf.A05);
                c0Zx.A05("video_x_position", null);
                c0Zx.A05("video_y_position", null);
                c0Zx.A03("was_live", null);
                if (z) {
                    A0H.AAQ(c0Zx, "adhoc_data");
                } else {
                    return;
                }
            } else if (!z) {
                return;
            }
            A0H.Cht();
        }
    }
}
