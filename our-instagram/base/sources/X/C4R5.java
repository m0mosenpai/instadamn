package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.4R5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4R5 implements C4R6, C4R7 {
    public final C2CF A00;
    public final WeakReference A01;

    public C4R5(C2CF c2cf, C95334Qt c95334Qt) {
        C14360o3.A0B(c2cf, 2);
        this.A00 = c2cf;
        this.A01 = new WeakReference(c95334Qt);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    @Override // X.C4R6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cir(X.C5n5 r24, X.C4RV r25, X.C4RU r26, java.lang.Integer r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, boolean r32) {
        /*
            r23 = this;
            r6 = 0
            r3 = r23
            java.lang.ref.WeakReference r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.4Qt r0 = (X.C95334Qt) r0
            if (r0 == 0) goto Lad
            X.4AN r4 = r3.A00()
            if (r4 == 0) goto L68
            java.lang.String r5 = r4.A0G
            r2 = 1
            if (r5 == 0) goto L68
            X.4AK r1 = r4.A07
            if (r1 == 0) goto Lb4
            int r1 = r1.ordinal()
            if (r1 == r6) goto Lb0
            if (r1 != r2) goto Lb4
            java.lang.Integer r13 = X.C05F.A0C
        L26:
            X.2CF r1 = r3.A00
            X.2CO r7 = r1.A05
            java.lang.String r16 = r0.Be2()
            X.4RP r1 = r0.A09
            X.4SS r1 = r1.A08
            if (r1 == 0) goto Lae
            java.lang.String r6 = r1.A07
        L36:
            int r22 = r0.getCurrentPosition()
            boolean r4 = r4.A03()
            java.lang.Integer r12 = X.C05F.A0Y
            r10 = 0
            r9 = 0
            r1 = 0
            r2 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            X.ACC r4 = r7.A00
            if (r4 == 0) goto L56
            int r1 = r4.A00
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r4.A01
            java.lang.String r1 = r4.A02
        L56:
            r11 = r9
            r14 = r9
            r15 = r9
            r17 = r9
            r19 = r2
            r20 = r5
            r21 = r6
            r18 = r1
            X.C2CO.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r7.A00 = r9
        L68:
            X.4RP r1 = r0.A09
            X.4RQ r1 = r1.A0I
            boolean r1 = r1.A0X
            if (r1 != 0) goto Lad
            X.2CR r7 = r3.A01()
            r6 = r24
            if (r7 == 0) goto L8c
            int r10 = r0.getCurrentPosition()
            X.4AN r8 = r3.A00()
            java.lang.Integer r9 = r3.A02()
            int r11 = r6.A00
            long r1 = r6.A02
            int r12 = (int) r1
            r7.A01(r8, r9, r10, r11, r12)
        L8c:
            java.lang.String r5 = r0.Be2()
            java.lang.String r4 = r3.A03()
            if (r4 != 0) goto L98
            java.lang.String r4 = ""
        L98:
            int r1 = r6.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            long r1 = r6.A02
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r4, r3, r1}
            java.lang.String r1 = "COMPLETED: playerid %s for vid %s, stallCount: %d, stallTime: %s"
            r0.A0A(r1, r2)
        Lad:
            return
        Lae:
            r6 = 0
            goto L36
        Lb0:
            java.lang.Integer r13 = X.C05F.A01
            goto L26
        Lb4:
            java.lang.Integer r13 = X.C05F.A0N
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4R5.Cir(X.5n5, X.4RV, X.4RU, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    private final C4AN A00() {
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            return c95334Qt.A0I;
        }
        return null;
    }

    private final C2CR A01() {
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            return c95334Qt.A0K;
        }
        return null;
    }

    private final Integer A02() {
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            return c95334Qt.A0Q;
        }
        return null;
    }

    @Override // X.C4R6
    public final void Cie(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2) {
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            String Be2 = c95334Qt.Be2();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            c95334Qt.A0A("CANCELLED: playerid %s for vid %s", Be2, A03);
            C2CR A01 = A01();
            if (A01 != null) {
                A01.A00(A00(), null, A02(), "live_video_cancelled", c95334Qt.getCurrentPosition());
            }
        }
    }

    @Override // X.C4R7
    public final void Cj6(C5n5 c5n5, int i, long j, long j2, long j3, boolean z, boolean z2) {
        C1CN c1cn;
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            String Be2 = c95334Qt.Be2();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            c95334Qt.A0A("STOP_BUFFERING: playerId %s for vid %s for time: %d", Be2, A03, Long.valueOf(j));
            C2CR A01 = A01();
            if (A01 != null) {
                A01.A00(A00(), null, A02(), "live_video_end_buffering", c95334Qt.getCurrentPosition());
            }
            String A032 = A03();
            if (A032 != null && (c1cn = this.A00.A07) != null) {
                c1cn.A0g(A032);
            }
        }
    }

    @Override // X.C4R6
    public final void CjA(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str, boolean z) {
        String str2;
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            C4AN A00 = A00();
            C2CR A01 = A01();
            if (A01 != null) {
                String str3 = c117275Sm.A02;
                int currentPosition = c95334Qt.getCurrentPosition();
                Integer A02 = A02();
                C19260xA c19260xA = new C19260xA();
                if (str3 == null) {
                    str3 = "unknown";
                }
                C19260xA.A00(c19260xA, str3, "reason");
                C19260xA.A00(c19260xA, "ERROR", MSV.A00(1152));
                A01.A00(A00, c19260xA, A02, "live_video_error", currentPosition);
            }
            if (A00 != null && (str2 = A00.A0G) != null) {
                C2CO c2co = this.A00.A05;
                String Be2 = c95334Qt.Be2();
                String A06 = c95334Qt.A06();
                String str4 = c117275Sm.A01.A00;
                String name = c117275Sm.A00.name();
                String str5 = c117275Sm.A02;
                if (c2co.A03.A00()) {
                    int hashCode = str2.hashCode();
                    C006802i c006802i = c2co.A01;
                    c006802i.markerStart(28180483, hashCode);
                    HashMap hashMap = new HashMap();
                    hashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, "PLAYER_ERROR");
                    hashMap.put("time_ms", Long.toString(System.currentTimeMillis()));
                    hashMap.put("video_id", str2);
                    hashMap.put("player_id", String.valueOf(Be2));
                    hashMap.put("vp_session_id", A06);
                    if (str4 != null) {
                        hashMap.put(TraceFieldType.ErrorDomain, str4);
                    }
                    if (name != null) {
                        hashMap.put(TraceFieldType.ErrorCode, name);
                    }
                    if (str5 != null) {
                        hashMap.put("error_details", str5);
                    }
                    C2CF.A0D.A03(28180483, hashCode, hashMap);
                    c006802i.markerEnd(28180483, hashCode, (short) 2);
                }
            }
        }
    }

    @Override // X.C4R6
    public final void Ckr(C5n5 c5n5, C4RV c4rv, C4RU c4ru, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, long j, boolean z) {
        int hashCode;
        C19260xA c19260xA;
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            String Be2 = c95334Qt.Be2();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            int i4 = c5n5.A00;
            Integer valueOf = Integer.valueOf(i4);
            long j2 = c5n5.A02;
            Long valueOf2 = Long.valueOf(j2);
            Long valueOf3 = Long.valueOf(j);
            c95334Qt.A0A("PAUSED: playerid %s for vid %s, stallCount: %d, stallTime: %d, blackscreenDurationMs: %d", Be2, A03, valueOf, valueOf2, valueOf3);
            C2CR A01 = A01();
            if (A01 != null) {
                int currentPosition = c95334Qt.getCurrentPosition();
                C4AN A00 = A00();
                Integer A02 = A02();
                int i5 = (int) j2;
                if (i4 > 0) {
                    c19260xA = new C19260xA();
                    C19260xA.A00(c19260xA, valueOf, "stall_count");
                    C19260xA.A00(c19260xA, Integer.valueOf(i5), "stall_time");
                } else {
                    c19260xA = null;
                }
                A01.A00(A00, c19260xA, A02, "live_video_paused", currentPosition);
            }
            if (c95334Qt.A0o && j > 0) {
                C2CQ c2cq = this.A00.A02;
                C4AN A002 = A00();
                if (A002 != null) {
                    String str9 = A002.A0G;
                    if (str9 == null) {
                        hashCode = -1;
                    } else {
                        hashCode = str9.hashCode();
                    }
                    C006802i c006802i = c2cq.A00;
                    c006802i.markerStart(61673387, hashCode);
                    C4BJ.A00(c006802i, AbstractC06930Yk.A06(new C09530e4("VIDEO_ID", str9), new C09530e4("PLAY_ORIGIN", A002.A0A), new C09530e4("VIDEO_CODEC", A002.A0F), new C09530e4("FORMAT_TYPE", A002.A07.name()), new C09530e4("BLACK_SCREEN_TIME", valueOf3)), 61673387, hashCode);
                    c006802i.markerEnd(61673387, hashCode, (short) 2);
                }
            }
        }
    }

    @Override // X.C4R6
    public final void ClH(C98704bq c98704bq, String str, List list, int i, long j, long j2) {
        Integer valueOf = Integer.valueOf(c98704bq.A05);
        Integer valueOf2 = Integer.valueOf(c98704bq.A04);
        int i2 = c98704bq.A02;
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            String Be2 = c95334Qt.Be2();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            c95334Qt.A0A("REPRESENTATION_ENDED: playerid [%s] for vid %s: next format bitrate: %d kbps, w: %d, h: %d", Be2, A03, Integer.valueOf(i2 / 1000), valueOf, valueOf2);
        }
    }

    @Override // X.C4R6
    public final void ClK(String str, String str2, int i, long j, long j2) {
        C1CN c1cn;
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            String Be2 = c95334Qt.Be2();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            c95334Qt.A0A("REQUESTED_PLAYING: playerId %s may start stall for vid %s", Be2, A03);
            C2CR A01 = A01();
            if (A01 != null) {
                A01.A00(A00(), null, A02(), "live_video_requested_playing", i);
            }
            String A032 = A03();
            if (A032 != null && (c1cn = this.A00.A07) != null) {
                c1cn.A0k(A032);
                c1cn.A0m(A032, c95334Qt.A0h.A0y.A06);
            }
        }
    }

    @Override // X.C4R7
    public final void Clk(C4RV c4rv, C4RU c4ru, String str, int i, long j, boolean z, boolean z2) {
        C1CN c1cn;
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            String Be2 = c95334Qt.Be2();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            c95334Qt.A0A("START_BUFFERING: playerId %s for vid %s", Be2, A03);
            C2CR A01 = A01();
            if (A01 != null) {
                A01.A00(A00(), null, A02(), "live_video_start_buffering", c95334Qt.getCurrentPosition());
            }
            String A032 = A03();
            if (A032 != null && (c1cn = this.A00.A07) != null) {
                c1cn.A0w(A032, z2);
            }
        }
    }

    @Override // X.C4R6
    public final void Clp(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, long j, boolean z, boolean z2) {
        C1CN c1cn;
        int i4;
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            String Be2 = c95334Qt.Be2();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            Integer valueOf = Integer.valueOf((int) c95334Qt.A09.A0I.A08());
            C98704bq c98704bq = c95334Qt.A0E;
            if (c98704bq != null) {
                i4 = c98704bq.A02;
            } else {
                i4 = 0;
            }
            c95334Qt.A0A("STARTED PLAYING: playerId %s start playing for vid %s , position: %d, bitrate: %d kbps, w: %d, h: %d", Be2, A03, valueOf, Integer.valueOf(i4 / 1000), Integer.valueOf(c95334Qt.A05), Integer.valueOf(c95334Qt.A04));
            C2CR A01 = A01();
            if (A01 != null) {
                A01.A00(A00(), null, A02(), "live_video_started_playing", c95334Qt.getCurrentPosition());
            }
        }
        String A032 = A03();
        if (A032 != null && (c1cn = this.A00.A07) != null) {
            c1cn.A0o(A032, j, str3, str5, str6, str7);
        }
    }

    @Override // X.C4R6
    public final void CmP(C117275Sm c117275Sm, C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, int i, long j) {
        C95334Qt c95334Qt = (C95334Qt) this.A01.get();
        if (c95334Qt != null) {
            String str3 = c98704bq.A0B;
            String str4 = c98704bq2.A0B;
            String str5 = c117275Sm.A02;
            String Be2 = c95334Qt.Be2();
            String A03 = A03();
            if (A03 == null) {
                A03 = "";
            }
            c95334Qt.A0A("VIDEO_PLAYBACK_FALLBACK: playerid [%s] for vid %s: blocked format %s, fallback to format %s, error %s", Be2, A03, str3, str4, str5);
        }
    }

    private final String A03() {
        C4AN A00 = A00();
        if (A00 != null) {
            return A00.A0G;
        }
        return null;
    }

    @Override // X.C4R6
    public final void Civ(long j, String str, boolean z) {
        C1CN c1cn;
        String A03 = A03();
        if (A03 != null && (c1cn = this.A00.A07) != null) {
            c1cn.A0c(j, A03, z, str);
        }
    }

    @Override // X.C4R6
    public final void Cix() {
        C1CN c1cn;
        String A03 = A03();
        if (A03 != null && (c1cn = this.A00.A07) != null) {
            c1cn.A0i(A03);
        }
    }

    @Override // X.C4R6
    public final void Ckn(long j) {
        C1CN c1cn;
        String A03 = A03();
        if (A03 != null && (c1cn = this.A00.A07) != null) {
            c1cn.A0n(A03, j);
        }
    }

    @Override // X.C4R6
    public final void Cku(long j, String str) {
        C1CN c1cn;
        String A03 = A03();
        if (A03 != null && (c1cn = this.A00.A07) != null) {
            c1cn.A0j(A03);
        }
    }

    @Override // X.C4R6
    public final void CmT(C117275Sm c117275Sm) {
        String A03 = A03();
        if (A03 != null) {
            C2CO c2co = this.A00.A05;
            String name = c117275Sm.A01.name();
            String name2 = c117275Sm.A00.name();
            String str = c117275Sm.A02;
            if (c2co.A03.A00()) {
                int hashCode = A03.hashCode();
                C006802i c006802i = c2co.A01;
                c006802i.markerStart(28180483, hashCode);
                HashMap hashMap = new HashMap();
                hashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, "PLAYER_WARNING");
                hashMap.put("time_ms", Long.toString(System.currentTimeMillis()));
                hashMap.put("video_id", A03);
                hashMap.put("player_id", "0");
                if (name != null) {
                    hashMap.put(TraceFieldType.ErrorDomain, name);
                }
                if (name2 != null) {
                    hashMap.put(TraceFieldType.ErrorCode, name2);
                }
                if (str != null) {
                    hashMap.put("error_details", str);
                }
                C2CF.A0D.A03(28180483, hashCode, hashMap);
                c006802i.markerEnd(28180483, hashCode, (short) 2);
            }
        }
    }
}
