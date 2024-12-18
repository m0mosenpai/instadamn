package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Pair;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.MaL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50721MaL implements InterfaceC72009XEx {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public C69492VoF A04;
    public boolean A05;
    public final UserSession A06;
    public final boolean A07;
    public final C54993OUc A08;
    public final C54795OJn A09;
    public final C52044N0v A0A;
    public final C54625OBa A0B;
    public final C55146Od7 A0C;
    public final C47Z A0D;
    public final InterfaceC70363Du A0E;
    public final OI2 A0F;
    public final OXD A0G;
    public final XOT A0H;

    public C50721MaL(C54993OUc c54993OUc, C54795OJn c54795OJn, C52044N0v c52044N0v, C54625OBa c54625OBa, C55146Od7 c55146Od7, UserSession userSession, InterfaceC70363Du interfaceC70363Du, OI2 oi2, OXD oxd, XOT xot) {
        C14360o3.A0B(oi2, 3);
        this.A06 = userSession;
        this.A0G = oxd;
        this.A0F = oi2;
        this.A0E = interfaceC70363Du;
        this.A0H = xot;
        this.A09 = c54795OJn;
        this.A0C = c55146Od7;
        this.A08 = c54993OUc;
        this.A0A = c52044N0v;
        this.A0B = c54625OBa;
        C47Z c47z = oxd.A0C;
        this.A0D = c47z;
        this.A07 = c47z.A09() instanceof NRI;
        this.A03 = -1L;
        this.A02 = -1L;
    }

    @Override // X.InterfaceC72009XEx
    public final void DGt(Map map, String str) {
        Map map2;
        Object obj;
        C14360o3.A0B(map, 0);
        Object obj2 = map.get("network");
        String str2 = null;
        if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null && (obj = map2.get("download_bandwidth")) != null) {
            str2 = obj.toString();
        }
        C915547l c915547l = this.A0D.A1T;
        if (str2 == null) {
            str2 = "";
        }
        c915547l.A07 = str2;
        this.A05 = true;
        C54625OBa c54625OBa = this.A0B;
        c54625OBa.A01.flowMarkPoint(c54625OBa.A00, "upload_settings_fetch_success");
    }

    @Override // X.InterfaceC72009XEx
    public final void Dnt(C69492VoF c69492VoF) {
        String str;
        this.A04 = c69492VoF;
        C54625OBa c54625OBa = this.A0B;
        C1QT c1qt = c54625OBa.A01;
        long j = c54625OBa.A00;
        C47Z c47z = c54625OBa.A03;
        boolean z = false;
        c1qt.flowStart(j, c47z.A3t, false);
        c1qt.flowMarkPoint(j, "flow_start");
        String str2 = c47z.A3b;
        if (str2 == null) {
            str2 = "empty";
        }
        c1qt.flowAnnotate(j, AbstractC58354Ptu.A00(), str2);
        String str3 = c47z.A3t;
        if (str3 == null) {
            str3 = "empty";
        }
        c1qt.flowAnnotate(j, "upload_id", str3);
        ShareType A0D = c47z.A0D();
        if (A0D == null || (str = A0D.toString()) == null) {
            str = "empty";
        }
        c1qt.flowAnnotate(j, "share_type", str);
        c1qt.flowAnnotate(j, "is_reels", c47z.A0u());
        c1qt.flowAnnotate(j, "use_oc_transcode", c47z.A60);
        if (c47z.A1K != null) {
            z = true;
        }
        c1qt.flowAnnotate(j, "has_oc_filter_model", z);
        c1qt.flowAnnotate(j, "from_draft", c47z.A5S);
        C15G A00 = C15G.A00();
        Pair pair = new Pair(A00.A01, A00.A00);
        c1qt.flowAnnotate(j, "chipset_vendor", (String) pair.first);
        c1qt.flowAnnotate(j, "chipset_name", (String) pair.second);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.56W] */
    @Override // X.InterfaceC72009XEx
    public final void Dv3(MediaComposition mediaComposition, C69492VoF c69492VoF, List list, boolean z) {
        Float A00;
        C09530e4 c09530e4;
        int size;
        boolean A1R = AbstractC167007dF.A1R(0, list, c69492VoF);
        C55176Odf c55176Odf = (C55176Odf) list.get(0);
        C47Z c47z = this.A0D;
        int i = (int) c55176Odf.A0H;
        int i2 = (int) c55176Odf.A0I;
        ?? obj = new Object();
        obj.A01 = i;
        obj.A00 = i2;
        c47z.A1W = obj;
        int i3 = c55176Odf.A0D;
        int i4 = c55176Odf.A0B;
        c47z.A0S = i3;
        c47z.A0R = i4;
        C54795OJn c54795OJn = this.A09;
        synchronized (c54795OJn) {
            c54795OJn.A01 = A1R;
            c54795OJn.A08.submit(new RunnableC56966PPh(c54795OJn, list));
        }
        if (this.A07) {
            c47z.A0j.A01 = A1R;
        }
        c47z.A1j.A05 = c55176Odf.A01;
        UserSession userSession = this.A06;
        float f = -1.0f;
        if (C18U.A06(C06090Tz.A05, userSession, 36326159079978710L)) {
            try {
                String path = c55176Odf.A0N.getPath();
                if (path != null && (A00 = OV1.A00.A00(path)) != null) {
                    f = A00.floatValue();
                }
            } catch (Throwable th) {
                AbstractC167007dF.A15(C18950wb.A01.AEp("IGVideoUploadLifecycleListener", 817901174), DialogModule.KEY_MESSAGE, "fps_extractor_error", th);
                C0K8.A0G("IGVideoUploadLifecycleListener", "Error extracting fps", th);
            }
        }
        c47z.A03 = f;
        A00();
        this.A0E.EHj(c47z);
        this.A0H.DfL();
        C54625OBa c54625OBa = this.A0B;
        C1QT c1qt = c54625OBa.A01;
        long j = c54625OBa.A00;
        c1qt.flowMarkPoint(j, "transcode_success");
        c1qt.flowAnnotate(j, "result_list_size", list.size());
        C55176Odf c55176Odf2 = (C55176Odf) AbstractC001800i.A0J(list);
        if (c55176Odf2 != null) {
            int i5 = c55176Odf2.A07;
            int i6 = c55176Odf2.A06;
            c1qt.flowAnnotate(j, "input_width", i5);
            c1qt.flowAnnotate(j, "input_height", i6);
            c1qt.flowAnnotate(j, "input_bitrate", c55176Odf2.A0H);
            C47Z c47z2 = c54625OBa.A03;
            C55176Odf.A02(c1qt, c55176Odf2, (int) c47z2.A1N.A01, j);
            c1qt.flowAnnotate(j, "output_frame_rate", (int) c47z2.A03);
            c1qt.flowAnnotate(j, "target_frame_rate", c55176Odf2.A0A);
            c1qt.flowAnnotate(j, "frame_drop_percent", c55176Odf2.A03);
            OV0 ov0 = OV0.A00;
            File file = c55176Odf2.A0N;
            try {
                C14360o3.A0A(file);
                String A0x = AbstractC43592JPx.A0x(file);
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(A0x);
                mediaExtractor.selectTrack(0);
                ArrayList A1E = AbstractC166987dD.A1E();
                do {
                    AbstractC166997dE.A1X(A1E, mediaExtractor.getSampleTime());
                } while (mediaExtractor.advance());
                mediaExtractor.release();
                int countBframe = ov0.countBframe(A1E);
                if (A1E.isEmpty()) {
                    size = 0;
                } else {
                    size = (countBframe * 100) / A1E.size();
                }
                c09530e4 = AbstractC167007dF.A0o(Integer.valueOf(countBframe), size);
            } catch (Throwable th2) {
                C0K8.A0G("BframeScanner", "err in bframe counting", th2);
                C0w9.A06("BframeScanner", "err in bframe counting", th2);
                Integer A0o = AbstractC25227BEk.A0o();
                c09530e4 = new C09530e4(A0o, A0o);
            }
            int A0F = AbstractC25230BEn.A0F(c09530e4);
            int A0A = AbstractC25229BEm.A0A(c09530e4);
            c1qt.flowAnnotate(j, "bframe_count", A0F);
            c1qt.flowAnnotate(j, "bframe_percentage", A0A);
            MediaFormat mediaFormat = c55176Odf2.A0L.A0E;
            if (mediaFormat != null) {
                String string = mediaFormat.getString("mime");
                if (string == null) {
                    string = "unknown";
                }
                c1qt.flowAnnotate(j, "target_codec", string);
                int i7 = -1;
                try {
                    i7 = mediaFormat.getInteger("profile");
                } catch (NullPointerException unused) {
                }
                c1qt.flowAnnotate(j, "target_profile", i7);
                int i8 = -1;
                try {
                    i8 = mediaFormat.getInteger("level");
                } catch (NullPointerException unused2) {
                }
                c1qt.flowAnnotate(j, "target_level", i8);
            }
        }
        C447624g c447624g = AnonymousClass229.A01(userSession).A04;
        C24Q c24q = c447624g.A03;
        c447624g.A00 = c24q.A02(838600141, c447624g.A00);
        c447624g.A02 = c24q.A02(518917599, c447624g.A02);
        C55146Od7 c55146Od7 = this.A0C;
        if (c55146Od7.A07() && !c55146Od7.A09(c47z)) {
            A01(c55176Odf, c69492VoF);
        }
        if (c47z.A5D && c47z.A5E) {
            OXD oxd = this.A0G;
            String str = oxd.A0C.A3V;
            if (str != null) {
                android.net.Uri A0I = AbstractC167007dF.A0I(str);
                android.net.Uri A0I2 = AbstractC167007dF.A0I(AbstractC916948n.A0A(oxd.A0A, ".mp4", System.nanoTime(), A1R));
                C14360o3.A0A(A0I);
                C14360o3.A0A(A0I2);
                LL8.A01(A0I, A0I2, userSession, oxd, null);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    private final void A00() {
        C915547l c915547l;
        Integer num;
        C55146Od7 c55146Od7 = this.A0C;
        if (c55146Od7.A05() && this.A05) {
            c915547l = this.A0D.A1T;
            num = C05F.A0Y;
        } else if (c55146Od7.A05() && !this.A05) {
            c915547l = this.A0D.A1T;
            num = C05F.A0j;
        } else if (c55146Od7.A04()) {
            c915547l = this.A0D.A1T;
            num = C05F.A0N;
        } else if (c55146Od7.A08() && this.A05) {
            c915547l = this.A0D.A1T;
            num = C05F.A01;
        } else if (c55146Od7.A08() && !this.A05) {
            c915547l = this.A0D.A1T;
            num = C05F.A0C;
        } else {
            c915547l = this.A0D.A1T;
            num = C05F.A00;
        }
        c915547l.A06 = num;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d0 A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:2:0x0000, B:4:0x0036, B:6:0x0047, B:8:0x004b, B:10:0x0051, B:11:0x005b, B:13:0x0067, B:15:0x006d, B:16:0x0071, B:18:0x0076, B:20:0x0082, B:21:0x008b, B:23:0x009d, B:24:0x009f, B:26:0x00a3, B:27:0x00a5, B:29:0x00ac, B:30:0x00b0, B:53:0x00f1, B:55:0x00f7, B:56:0x013f, B:75:0x01c7, B:77:0x021c, B:80:0x0230, B:83:0x025a, B:87:0x0268, B:89:0x027f, B:91:0x0287, B:92:0x0290, B:95:0x0296, B:97:0x029c, B:98:0x02c0, B:99:0x02c2, B:101:0x02d0, B:102:0x02db, B:104:0x02e5, B:105:0x02f4, B:111:0x02b3, B:113:0x02b9, B:115:0x0278, B:118:0x02ae), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e5 A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:2:0x0000, B:4:0x0036, B:6:0x0047, B:8:0x004b, B:10:0x0051, B:11:0x005b, B:13:0x0067, B:15:0x006d, B:16:0x0071, B:18:0x0076, B:20:0x0082, B:21:0x008b, B:23:0x009d, B:24:0x009f, B:26:0x00a3, B:27:0x00a5, B:29:0x00ac, B:30:0x00b0, B:53:0x00f1, B:55:0x00f7, B:56:0x013f, B:75:0x01c7, B:77:0x021c, B:80:0x0230, B:83:0x025a, B:87:0x0268, B:89:0x027f, B:91:0x0287, B:92:0x0290, B:95:0x0296, B:97:0x029c, B:98:0x02c0, B:99:0x02c2, B:101:0x02d0, B:102:0x02db, B:104:0x02e5, B:105:0x02f4, B:111:0x02b3, B:113:0x02b9, B:115:0x0278, B:118:0x02ae), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027f A[Catch: Exception -> 0x02fb, TryCatch #0 {Exception -> 0x02fb, blocks: (B:2:0x0000, B:4:0x0036, B:6:0x0047, B:8:0x004b, B:10:0x0051, B:11:0x005b, B:13:0x0067, B:15:0x006d, B:16:0x0071, B:18:0x0076, B:20:0x0082, B:21:0x008b, B:23:0x009d, B:24:0x009f, B:26:0x00a3, B:27:0x00a5, B:29:0x00ac, B:30:0x00b0, B:53:0x00f1, B:55:0x00f7, B:56:0x013f, B:75:0x01c7, B:77:0x021c, B:80:0x0230, B:83:0x025a, B:87:0x0268, B:89:0x027f, B:91:0x0287, B:92:0x0290, B:95:0x0296, B:97:0x029c, B:98:0x02c0, B:99:0x02c2, B:101:0x02d0, B:102:0x02db, B:104:0x02e5, B:105:0x02f4, B:111:0x02b3, B:113:0x02b9, B:115:0x0278, B:118:0x02ae), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(X.C55176Odf r51, X.C69492VoF r52) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50721MaL.A01(X.Odf, X.VoF):void");
    }

    @Override // X.InterfaceC72009XEx
    public final void D1j(Exception exc) {
        boolean z = exc instanceof C105764pn;
        OI2 oi2 = this.A0F;
        if (z) {
            this.A0G.A04(EnumC115415Kb.A0R, "user cancel", exc);
        } else {
            oi2.A00("user cancel", exc);
        }
        C0K8.A0O("IGVideoUploadLifecycleListener", "upload sequence canceled with %s, %s", AbstractC54885OPg.A01(exc), this);
        C54625OBa c54625OBa = this.A0B;
        C1QT c1qt = c54625OBa.A01;
        long j = c54625OBa.A00;
        c1qt.flowAnnotate(j, "flow_cancel_reason", MSZ.A0r(c1qt, "flow_cancel", exc, j));
        c1qt.flowEndCancel(j, AbstractC50522MSa.A0j(c1qt, exc, j));
        this.A09.A00();
    }

    @Override // X.InterfaceC72009XEx
    public final void DGs(Exception exc) {
        C54625OBa c54625OBa = this.A0B;
        C1QT c1qt = c54625OBa.A01;
        long j = c54625OBa.A00;
        c1qt.flowAnnotate(j, "upload_settings_fetch_fail_reason", MSZ.A0r(c1qt, "upload_settings_fetch_fail", exc, j));
        c1qt.flowAnnotate(j, "upload_settings_fetch_stacktrace", C2Ql.A00(exc));
    }

    @Override // X.InterfaceC72009XEx
    public final void Dk8() {
        C0K8.A0O("IGVideoUploadLifecycleListener", "transcode segment file cancelled: %s", this);
    }

    @Override // X.InterfaceC72009XEx
    public final void Dk9(C105764pn c105764pn) {
        C0K8.A0O("IGVideoUploadLifecycleListener", "transcode segment file failed: %s, %s", AbstractC54885OPg.A01(c105764pn), this);
    }

    @Override // X.InterfaceC72009XEx
    public final void DkA(C55176Odf c55176Odf) {
        C69492VoF c69492VoF = this.A04;
        if (c69492VoF != null) {
            C55146Od7 c55146Od7 = this.A0C;
            if (c55146Od7.A07() && c55146Od7.A09(this.A0D)) {
                A01(c55176Odf, c69492VoF);
            }
        }
        this.A01 += c55176Odf.A0G;
        this.A00++;
        OI2 oi2 = this.A0F;
        C47Z c47z = this.A0D;
        oi2.A01.CkY(c55176Odf.A0L, c47z);
        if (this.A07) {
            ((java.util.Set) c47z.A0j.A00).add(AbstractC43592JPx.A0x(c55176Odf.A0N));
        }
    }

    @Override // X.InterfaceC72009XEx
    public final void DkB(Exception exc) {
        C0K8.A0O("IGVideoUploadLifecycleListener", "transfer segment file failed: %s, %s", AbstractC54885OPg.A01(exc), this);
    }

    @Override // X.InterfaceC72009XEx
    public final void DkD(W62 w62) {
        w62.A05.getPath();
    }

    @Override // X.InterfaceC72009XEx
    public final void DkE(W63 w63, W62 w62) {
        if (this.A07) {
            String str = this.A0G.A0C.A3t;
            C14360o3.A07(w62.A05.getPath());
            C14360o3.A0B(str, 1);
        }
        w62.A05.getPath();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // X.InterfaceC72009XEx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dpo(X.C69570VrZ r9) {
        /*
            r8 = this;
            long r0 = r8.A01
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L34
            long r2 = r8.A02
            long r6 = r8.A03
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L34
            double r4 = (double) r0
            r0 = 4665518107723300864(0x40bf400000000000, double:8000.0)
            double r4 = r4 * r0
            long r2 = r2 - r6
            double r0 = (double) r2
            double r4 = r4 / r0
            long r2 = (long) r4
        L1b:
            X.OI2 r0 = r8.A0F
            X.3Du r4 = r0.A01
            X.47Z r1 = r0.A00
            X.3Dt r4 = (X.C70353Dt) r4
            X.0sk r0 = X.AbstractC06930Yk.A0E()
            r4.A08(r1, r0, r2)
            X.VCo r1 = r9.A00
            X.VCo r0 = X.EnumC68130VCo.A03
            if (r1 != r0) goto L45
            X.OJn r1 = r8.A09
            monitor-enter(r1)
            goto L37
        L34:
            r2 = -1
            goto L1b
        L37:
            boolean r0 = r1.A01     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L44
            java.util.concurrent.CountDownLatch r0 = r1.A07     // Catch: java.lang.Throwable -> L41
            r0.getCount()     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L44:
            monitor-exit(r1)
        L45:
            X.OBa r0 = r8.A0B
            X.1QT r3 = r0.A01
            long r1 = r0.A00
            java.lang.String r0 = "flow_success"
            r3.flowMarkPoint(r1, r0)
            r3.flowEndSuccess(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50721MaL.Dpo(X.VrZ):void");
    }

    @Override // X.InterfaceC72009XEx
    public final void Duv() {
        C0K8.A0O("IGVideoUploadLifecycleListener", "transcode(s) canceled: %s", this);
        C54625OBa c54625OBa = this.A0B;
        c54625OBa.A01.flowMarkPoint(c54625OBa.A00, "transcode_cancel");
    }

    @Override // X.InterfaceC72009XEx
    public final void Duy(float f) {
        this.A0D.A0e(C05F.A00, f);
    }

    @Override // X.InterfaceC72009XEx
    public final void Duz() {
        C54625OBa c54625OBa = this.A0B;
        c54625OBa.A01.flowMarkPoint(c54625OBa.A00, "transcode_skip");
    }

    @Override // X.InterfaceC72009XEx
    public final void Dv1(MYB myb, WDI wdi) {
        int i;
        int i2;
        if (myb != null) {
            C47Z c47z = this.A0D;
            if (c47z.A0u()) {
                if (!c47z.A61) {
                    c47z.A1N.A00();
                }
                int i3 = myb.A04;
                if (i3 != 90 && i3 != 270) {
                    i = myb.A05;
                    i2 = myb.A03;
                } else {
                    i = myb.A03;
                    i2 = myb.A05;
                }
                ClipInfo clipInfo = c47z.A1N;
                clipInfo.A09 = i;
                clipInfo.A06 = i2;
                c47z.A0f = myb.A08;
                if (!c47z.A61) {
                    clipInfo.A00();
                }
            }
            if (wdi != null) {
                int i4 = wdi.A0C;
                int i5 = wdi.A0A;
                c47z.A0S = i4;
                c47z.A0R = i5;
                String str = c47z.A1N.A0F;
                if (str != null) {
                    Pair A00 = AbstractC916948n.A00(str);
                    C14360o3.A07(A00);
                    Object obj = A00.second;
                    C14360o3.A06(obj);
                    ((Map) obj).put("segmented", String.valueOf(this.A07));
                    String A0D = AnonymousClass001.A0D((String) A00.first, '|');
                    C14360o3.A07(A0D);
                    ((C70353Dt) this.A0E).Cl0(this.A0G.A0C, "render_video_attempt", A0D);
                }
                C54625OBa c54625OBa = this.A0B;
                C1QT c1qt = c54625OBa.A01;
                long j = c54625OBa.A00;
                c1qt.flowMarkPoint(j, "transcode_start");
                c1qt.flowAnnotate(j, "target_aspect_ratio", wdi.A00);
                c1qt.flowAnnotate(j, "target_width", wdi.A0C);
                c1qt.flowAnnotate(j, "target_height", wdi.A0A);
                c1qt.flowAnnotate(j, "target_bitrate", wdi.A01());
                c1qt.flowAnnotate(j, "target_gop_size", wdi.A03);
                c1qt.flowAnnotate(j, "has_hw_av1_enc", AbstractC167007dF.A1Z(C63329Shd.A02));
                c1qt.flowAnnotate(j, "has_hw_hevc_enc", AbstractC167007dF.A1Z(C63329Shd.A05));
                c1qt.flowAnnotate(j, "has_hw_avc_enc", AbstractC167007dF.A1Z(C63329Shd.A04));
                c1qt.flowAnnotate(j, "has_hw_av1_hdr_enc", AbstractC167007dF.A1Z(C63329Shd.A03));
                c1qt.flowAnnotate(j, "has_hw_hevc_hdr_enc", AbstractC167007dF.A1Z(C63329Shd.A06));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC72009XEx
    public final void DvB(Exception exc, Map map, int i) {
        C0K8.A0O("IGVideoUploadLifecycleListener", "transfer(s) failed: %s, %s", AbstractC54885OPg.A01(exc), this);
        C54625OBa c54625OBa = this.A0B;
        C0w9.A08("videolite_transfer_fail", exc);
        C1QT c1qt = c54625OBa.A01;
        long j = c54625OBa.A00;
        c1qt.flowAnnotate(j, "transfer_fail_reason", MSZ.A0r(c1qt, "transfer_fail", exc, j));
        c1qt.flowAnnotate(j, "stacktrace", C2Ql.A00(exc));
    }

    @Override // X.InterfaceC72009XEx
    public final void DvE(float f) {
        this.A0D.A0e(C05F.A01, f);
    }

    @Override // X.InterfaceC72009XEx
    public final void DvG() {
        OI2 oi2 = this.A0F;
        ((C70353Dt) oi2.A01).EHg(oi2.A00);
        if (this.A07) {
            C14360o3.A0B(this.A0G.A0C.A3t, 0);
        }
        this.A03 = System.currentTimeMillis();
        this.A02 = -1L;
        C54625OBa c54625OBa = this.A0B;
        c54625OBa.A01.flowMarkPoint(c54625OBa.A00, "transfer_start");
    }

    @Override // X.InterfaceC72009XEx
    public final void DvJ(Map map) {
        if (this.A07) {
            C14360o3.A0B(this.A0G.A0C.A3t, 0);
        }
        this.A02 = System.currentTimeMillis();
        this.A0D.A1N.A00();
        C54625OBa c54625OBa = this.A0B;
        c54625OBa.A01.flowMarkPoint(c54625OBa.A00, "transfer_success");
    }

    @Override // X.InterfaceC72009XEx
    public final void DxN(List list) {
        this.A0G.A08 = list;
    }

    @Override // X.InterfaceC72009XEx
    public final void onFailure(Exception exc) {
        String str;
        EnumC115415Kb enumC115415Kb;
        if (this.A07) {
            str = "segmented";
        } else {
            str = "fbuploader";
        }
        String A06 = AbstractC13670mt.A06("%s:%s", StringFormatUtil.formatStrLocaleSafe("%s upload error", str), AbstractC54885OPg.A01(exc));
        boolean z = exc instanceof C105764pn;
        OI2 oi2 = this.A0F;
        if (z) {
            OXD oxd = this.A0G;
            String A00 = AbstractC53750Nq2.A00(exc);
            C14360o3.A0B(A00, 2);
            if (AbstractC54086Nvk.A00(oxd.A0B, oxd.A0C.A0D(), true)) {
                enumC115415Kb = EnumC115415Kb.A0S;
            } else {
                enumC115415Kb = EnumC115415Kb.A0R;
            }
            oxd.A03(enumC115415Kb, A06, A00, exc);
        } else {
            ((C70353Dt) oi2.A01).EHf(null, oi2.A00, A06, exc);
        }
        C0K8.A0O("IGVideoUploadLifecycleListener", "upload sequence failed: %s", this);
        C54625OBa c54625OBa = this.A0B;
        C0w9.A07("videolite_flow_fail", exc);
        C1QT c1qt = c54625OBa.A01;
        long j = c54625OBa.A00;
        c1qt.flowAnnotate(j, "flow_fail_reason", MSZ.A0r(c1qt, "flow_fail", exc, j));
        c1qt.flowEndFail(j, DialogModule.KEY_MESSAGE, AbstractC50522MSa.A0j(c1qt, exc, j));
        this.A09.A00();
    }

    @Override // X.InterfaceC72009XEx
    public final void Dux(C105764pn c105764pn) {
        A00();
        if (this.A07) {
            c105764pn.getMessage();
        }
        String str = this.A0D.A3V;
        if (str != null) {
            MSZ.A1N(AbstractC166987dD.A11(str));
        }
        C0K8.A0O("IGVideoUploadLifecycleListener", "transcode(s) failed: %s, %s", AbstractC54885OPg.A01(c105764pn), this);
        C54625OBa c54625OBa = this.A0B;
        C1QT c1qt = c54625OBa.A01;
        long j = c54625OBa.A00;
        c1qt.flowAnnotate(j, "transcode_fail_reason", MSZ.A0r(c1qt, "transcode_fail", c105764pn, j));
        c1qt.flowAnnotate(j, "stacktrace", C2Ql.A00(c105764pn));
        if (C18U.A06(C06090Tz.A06, c54625OBa.A02, 36315245567806581L)) {
            C0w9.A08("bframe_transcode_fail", c105764pn);
        }
        C447624g c447624g = AnonymousClass229.A01(this.A06).A04;
        String A01 = AbstractC54885OPg.A01(c105764pn);
        C24Q c24q = c447624g.A03;
        c447624g.A00 = c24q.A07(A01, "", 838600141, c447624g.A00);
        c447624g.A02 = c24q.A07(A01, "", 518917599, c447624g.A02);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("IGVideoUploadLifecycleListener{PendingMeida upload_id =");
        A1C.append(this.A0D.A3t);
        A1C.append(", mTotalBytesProduced=");
        A1C.append(this.A01);
        A1C.append(", mTotalSegmentsProduced=");
        A1C.append(this.A00);
        A1C.append(", mIsSegmented=");
        A1C.append(this.A07);
        A1C.append(", mTransferStartTimeMs=");
        A1C.append(this.A03);
        A1C.append(", mTransferFinishTimeMs=");
        A1C.append(this.A02);
        return AbstractC167027dH.A0R(A1C);
    }
}
