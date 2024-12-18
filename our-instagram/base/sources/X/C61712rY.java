package X;

/* renamed from: X.2rY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61712rY {
    public final C006802i A00;

    public C61712rY(C006802i c006802i) {
        C14360o3.A0B(c006802i, 1);
        this.A00 = c006802i;
    }

    public final void A01(C38321qM c38321qM, Integer num, Integer num2, String str) {
        int i;
        String str2;
        String id;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(num, 1);
        int A00 = A00(num, str);
        if (A00 != 0) {
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                i = id.hashCode();
            } else {
                i = 0;
            }
            C006802i c006802i = this.A00;
            switch (num2.intValue()) {
                case 2:
                    str2 = "prepare_video_start";
                    break;
                case 3:
                    str2 = "prepare_video_end";
                    break;
                case 4:
                    str2 = "video_started_playing";
                    break;
                case 5:
                    str2 = "tail_load_request_success";
                    break;
                case 6:
                    str2 = "tail_load_request_failed";
                    break;
                case 7:
                    str2 = "tail_load_indicator_end";
                    break;
                case 8:
                    str2 = "fetch_request_success";
                    break;
                case 9:
                    str2 = "fetch_request_failed";
                    break;
                case 10:
                    str2 = "image_load_failed";
                    break;
                case 11:
                    str2 = "fetch_begin";
                    break;
                default:
                    str2 = "fetch_finished";
                    break;
            }
            c006802i.markerPoint(A00, i, str2);
        }
    }

    public final void A02(C38321qM c38321qM, Integer num, String str) {
        int i;
        String id;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(num, 1);
        int A00 = A00(num, str);
        if (A00 != 0) {
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                i = id.hashCode();
            } else {
                i = 0;
            }
            C006802i c006802i = this.A00;
            c006802i.markerPoint(A00, i, "load_end");
            c006802i.markerEnd(A00, i, (short) 2);
        }
    }

    public final void A03(C38321qM c38321qM, Integer num, String str) {
        int i;
        String id;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(num, 1);
        int A00 = A00(num, str);
        if (A00 != 0) {
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                i = id.hashCode();
            } else {
                i = 0;
            }
            this.A00.markerEnd(A00, i, (short) 3);
        }
    }

    public final void A04(C38321qM c38321qM, Integer num, String str) {
        int i;
        String id;
        C14360o3.A0B(num, 1);
        int A00 = A00(num, str);
        if (A00 != 0) {
            boolean z = false;
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                i = id.hashCode();
            } else {
                i = 0;
            }
            C006802i c006802i = this.A00;
            c006802i.A0Q(A00, i, 30000L);
            c006802i.markerAnnotate(A00, i, "asl_session_id", C0L6.A01());
            c006802i.markerPoint(A00, i, "load_start");
            if (c38321qM != null) {
                if (c38321qM.A5M() || c38321qM.A5N()) {
                    z = true;
                }
                c006802i.markerAnnotate(A00, i, "is_video", c38321qM.Cff());
                c006802i.markerAnnotate(A00, i, "is_carousel", z);
            }
        }
    }

    public final void A05(C38321qM c38321qM, Integer num, String str, String str2) {
        int i;
        String id;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(num, 1);
        int A00 = A00(num, str);
        if (A00 != 0) {
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                i = id.hashCode();
            } else {
                i = 0;
            }
            C006802i c006802i = this.A00;
            c006802i.markerAnnotate(A00, i, "cancel_reason", str2);
            c006802i.markerEnd(A00, i, (short) 4);
        }
    }

    public final void A06(C38321qM c38321qM, Integer num, String str, String str2, boolean z) {
        int i;
        String id;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(num, 1);
        int A00 = A00(num, str);
        if (A00 != 0) {
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                i = id.hashCode();
            } else {
                i = 0;
            }
            this.A00.markerAnnotate(A00, i, str2, z);
        }
    }

    public final void A07(Integer num, String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str3, 3);
        int A00 = A00(num, str);
        if (A00 != 0) {
            this.A00.markerAnnotate(A00, 0, str2, str3);
        }
    }

    public final boolean A08(C38321qM c38321qM, Integer num, String str) {
        String id;
        C14360o3.A0B(num, 1);
        int A00 = A00(num, str);
        int i = 0;
        if (A00 == 0) {
            return false;
        }
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            i = id.hashCode();
        }
        return this.A00.isMarkerOn(A00, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000b A[PHI: r4
      0x000b: PHI (r4v18 int) = 
      (r4v0 int)
      (r4v0 int)
      (r4v3 int)
      (r4v0 int)
      (r4v0 int)
      (r4v0 int)
      (r4v10 int)
      (r4v0 int)
      (r4v0 int)
      (r4v0 int)
      (r4v0 int)
      (r4v0 int)
      (r4v0 int)
     binds: [B:2:0x0008, B:55:0x0096, B:60:0x00a3, B:40:0x0046, B:44:0x0050, B:30:0x002d, B:35:0x003a, B:24:0x0018, B:26:0x001e, B:17:0x0082, B:20:0x008a, B:7:0x005f, B:11:0x0069] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(java.lang.Integer r5, java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r3 = 1
            r2 = 0
            r4 = 0
            r1 = 2
            switch(r0) {
                case -975990334: goto L90;
                case -913715469: goto L78;
                case -400141475: goto L75;
                case 67781225: goto L72;
                case 332522282: goto L6f;
                case 339532540: goto L59;
                case 464395801: goto L56;
                case 877420756: goto L40;
                case 935219501: goto L27;
                case 1127778335: goto L24;
                case 1634711301: goto L12;
                case 1765812994: goto Lf;
                case 1805942339: goto Lc;
                default: goto Lb;
            }
        Lb:
            return r4
        Lc:
            java.lang.String r0 = "feed_contextual_self_profile"
            goto L5b
        Lf:
            r0 = 5330(0x14d2, float:7.469E-42)
            goto L7a
        L12:
            java.lang.String r0 = "feed_contextual_ads_chain"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            int r0 = r5.intValue()
            if (r0 != r1) goto Lb
            r4 = 386743012(0x170d3ae4, float:4.563389E-25)
            return r4
        L24:
            r0 = 5328(0x14d0, float:7.466E-42)
            goto L7a
        L27:
            java.lang.String r0 = "explore_popular"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            int r0 = r5.intValue()
            if (r0 == r2) goto Lad
            if (r0 == r3) goto La9
            r4 = 997006891(0x3b6d1e2b, float:0.0036181312)
            if (r0 == r1) goto Lb
            r4 = 997005525(0x3b6d18d5, float:0.003617813)
            return r4
        L40:
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            int r0 = r5.intValue()
            if (r0 == r2) goto Lb5
            if (r0 == r3) goto Lb1
            if (r0 != r1) goto Lb
            r4 = 776677153(0x2e4b2721, float:4.619161E-11)
            return r4
        L56:
            r0 = 5332(0x14d4, float:7.472E-42)
            goto L7a
        L59:
            java.lang.String r0 = "feed_contextual_profile"
        L5b:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            int r0 = r5.intValue()
            if (r0 == r2) goto Lbd
            if (r0 == r3) goto Lb9
            if (r0 != r1) goto Lb
            r4 = 290468408(0x11503238, float:1.6423782E-28)
            return r4
        L6f:
            r0 = 5331(0x14d3, float:7.47E-42)
            goto L7a
        L72:
            r0 = 5329(0x14d1, float:7.468E-42)
            goto L7a
        L75:
            r0 = 5327(0x14cf, float:7.465E-42)
            goto L7a
        L78:
            r0 = 5333(0x14d5, float:7.473E-42)
        L7a:
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            int r0 = r5.intValue()
            if (r0 == r2) goto Lc1
            if (r0 != r1) goto Lb
            r4 = 177282872(0xa911f38, float:1.3974735E-32)
            return r4
        L90:
            java.lang.String r0 = "feed_timeline"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb
            int r0 = r5.intValue()
            if (r0 == r2) goto Lc9
            if (r0 == r3) goto Lc5
            r4 = 77669247(0x4a1237f, float:3.7883516E-36)
            if (r0 == r1) goto Lb
            r4 = 77666306(0x4a11802, float:3.7872966E-36)
            return r4
        La9:
            r4 = 997011871(0x3b6d319f, float:0.0036192907)
            return r4
        Lad:
            r4 = 997006453(0x3b6d1c75, float:0.0036180292)
            return r4
        Lb1:
            r4 = 776673996(0x2e4b1acc, float:4.6180657E-11)
            return r4
        Lb5:
            r4 = 776669815(0x2e4b0a77, float:4.616615E-11)
            return r4
        Lb9:
            r4 = 290460768(0x11501460, float:1.6414585E-28)
            return r4
        Lbd:
            r4 = 290459922(0x11501112, float:1.6413567E-28)
            return r4
        Lc1:
            r4 = 177280368(0xa911570, float:1.3971056E-32)
            return r4
        Lc5:
            r4 = 77669394(0x4a12412, float:3.7884043E-36)
            return r4
        Lc9:
            r4 = 77675937(0x4a13da1, float:3.7907515E-36)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61712rY.A00(java.lang.Integer, java.lang.String):int");
    }
}
