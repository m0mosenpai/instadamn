package X;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.util.LruCache;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.4Sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95694Sd implements C1HW, InterfaceC13000lm {
    public static final java.util.Set A0I;
    public int A00;
    public long A01;
    public long A02;
    public Location A03;
    public String A04;
    public HashMap A05;
    public int A06;
    public long A07;
    public C1HX A08;
    public C1EQ A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final Context A0D;
    public final UserSession A0E;
    public final int A0F;
    public final LruCache A0G;
    public final boolean A0H;

    public final synchronized void A03(C4T2 c4t2, C19280xC c19280xC, C95684Sc c95684Sc, C75363a3 c75363a3, String str) {
        int i;
        String str2;
        Location lastLocation;
        String str3;
        if (str != null) {
            if (str.length() != 0 && (i = this.A00) > 0 && Math.abs(str.hashCode() % i) == this.A06) {
                java.util.Set set = A0I;
                String str4 = null;
                if (c19280xC != null) {
                    str2 = c19280xC.A04;
                } else {
                    str2 = null;
                }
                if ((AbstractC001800i.A0u(set, str2) || c4t2 != null) && !C218914p.A08() && this.A0A && this.A0B) {
                    if (c75363a3 != null && (str3 = (String) AbstractC001800i.A0J(c75363a3.A06())) != null && str3.length() != 0) {
                        LruCache lruCache = AbstractC08820cl.A00;
                        String host = android.net.Uri.parse(str3).getHost();
                        if (host != null && host.length() != 0) {
                            if (c95684Sc != null) {
                                c95684Sc.A1D = host;
                                if (c19280xC != null) {
                                    c19280xC.A0C("resource_url", host);
                                }
                            }
                            if (c4t2 != null) {
                                c4t2.A06("resource_url", host);
                            }
                        }
                    }
                    if (this.A0H) {
                        Location location = null;
                        if (c19280xC != null) {
                            str4 = c19280xC.A04;
                        }
                        if (!C14360o3.A0K(str4, "video_exited") || c4t2 != null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            Object obj = AbstractC15820qc.A02(this.A0D).first;
                            if (c95684Sc != null) {
                                String A00 = A00(str);
                                c95684Sc.A18 = A00;
                                if (c19280xC != null) {
                                    c19280xC.A0C("random_session_id", A00);
                                }
                            }
                            if (c4t2 != null) {
                                c4t2.A06("random_session_id", A00(str));
                            }
                            if (C14360o3.A0K(obj, "mobile")) {
                                A02(c4t2, c19280xC, c95684Sc, this.A05);
                            } else {
                                if (uptimeMillis - this.A01 > this.A0C) {
                                    this.A04 = C108364uN.A00(AbstractC12290kX.A00).A03();
                                    this.A01 = uptimeMillis;
                                }
                                String str5 = this.A04;
                                if (str5 != null && str5.length() != 0) {
                                    if (c95684Sc != null) {
                                        c95684Sc.A0m = str5;
                                        if (c19280xC != null) {
                                            c19280xC.A0C("hardware_address", str5);
                                        }
                                    }
                                    if (c4t2 != null) {
                                        c4t2.A06("hardware_address", str5);
                                    }
                                }
                            }
                            if (uptimeMillis - this.A02 > this.A0C) {
                                C1VW c1vw = C1VW.A00;
                                if (c1vw != null) {
                                    location = c1vw.getLastLocation(this.A0E, "VideoPlayerLoggerNetworkInsightHelper");
                                }
                                this.A03 = location;
                                this.A02 = uptimeMillis;
                            }
                            Location location2 = this.A03;
                            if (location2 != null) {
                                if (c95684Sc != null) {
                                    Double valueOf = Double.valueOf(location2.getLatitude());
                                    c95684Sc.A0B = valueOf;
                                    if (c19280xC != null) {
                                        c19280xC.A0A("device_lat", valueOf);
                                    }
                                    Double valueOf2 = Double.valueOf(location2.getLongitude());
                                    c95684Sc.A0C = valueOf2;
                                    if (c19280xC != null) {
                                        c19280xC.A0A("device_long", valueOf2);
                                    }
                                }
                                if (c4t2 != null) {
                                    c4t2.A04("device_lat", Double.valueOf(location2.getLatitude()));
                                    c4t2.A04("device_long", Double.valueOf(location2.getLongitude()));
                                }
                            }
                            if (c95684Sc != null) {
                                Integer valueOf3 = Integer.valueOf(i);
                                c95684Sc.A0X = valueOf3;
                                if (c19280xC != null) {
                                    c19280xC.A08(valueOf3, "client_sample_weight");
                                }
                            }
                            if (c4t2 != null) {
                                c4t2.A05("client_sample_weight", Long.valueOf(i));
                            }
                        }
                    } else {
                        if (c95684Sc != null) {
                            String A002 = A00(str);
                            c95684Sc.A18 = A002;
                            if (c19280xC != null) {
                                c19280xC.A0C("random_session_id", A002);
                            }
                        }
                        if (c4t2 != null) {
                            c4t2.A06("random_session_id", A00(str));
                        }
                        if (c95684Sc != null) {
                            String str6 = (String) AbstractC15820qc.A02(this.A0D).first;
                            c95684Sc.A0q = str6;
                            if (c19280xC != null) {
                                c19280xC.A0C("connection_type", str6);
                            }
                        }
                        if (c4t2 != null) {
                            c4t2.A06("connection_type", (String) AbstractC15820qc.A02(this.A0D).first);
                        }
                        HashMap hashMap = new HashMap();
                        UserSession userSession = this.A0E;
                        C1CY.A00().A0f(hashMap);
                        A02(c4t2, c19280xC, c95684Sc, hashMap);
                        C1VW c1vw2 = C1VW.A00;
                        if (c1vw2 != null && (lastLocation = c1vw2.getLastLocation(userSession, "VideoPlayerLoggerNetworkInsightHelper")) != null) {
                            if (c95684Sc != null) {
                                Double valueOf4 = Double.valueOf(lastLocation.getLatitude());
                                c95684Sc.A0B = valueOf4;
                                if (c19280xC != null) {
                                    c19280xC.A0A("device_lat", valueOf4);
                                }
                                Double valueOf5 = Double.valueOf(lastLocation.getLongitude());
                                c95684Sc.A0C = valueOf5;
                                if (c19280xC != null) {
                                    c19280xC.A0A("device_long", valueOf5);
                                }
                            }
                            if (c4t2 != null) {
                                c4t2.A04("device_lat", Double.valueOf(lastLocation.getLatitude()));
                                c4t2.A04("device_long", Double.valueOf(lastLocation.getLongitude()));
                            }
                        }
                        String A03 = C108364uN.A00(AbstractC12290kX.A00).A03();
                        if (A03 != null && A03.length() != 0) {
                            if (c95684Sc != null) {
                                c95684Sc.A0m = A03;
                                if (c19280xC != null) {
                                    c19280xC.A0C("hardware_address", A03);
                                }
                            }
                            if (c4t2 != null) {
                                c4t2.A06("hardware_address", A03);
                            }
                        }
                        if (c95684Sc != null) {
                            Integer valueOf6 = Integer.valueOf(i);
                            c95684Sc.A0X = valueOf6;
                            if (c19280xC != null) {
                                c19280xC.A08(valueOf6, "client_sample_weight");
                            }
                        }
                        if (c4t2 != null) {
                            c4t2.A05("client_sample_weight", Long.valueOf(i));
                        }
                    }
                }
            }
        }
    }

    static {
        ImmutableSet A02 = ImmutableSet.A02("video_paused", "video_started_playing", "video_buffering_started", "video_buffering_finished", "video_exited", "video_should_start", "video_playing_update");
        C14360o3.A07(A02);
        A0I = A02;
    }

    private final String A00(String str) {
        LruCache lruCache = this.A0G;
        String str2 = (String) lruCache.get(str);
        if (str2 == null) {
            String obj = C0HM.A00().toString();
            lruCache.put(str, obj);
            return obj;
        }
        return str2;
    }

    private final void A01() {
        Long l;
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str3;
        C1HX c1hx = this.A08;
        if (c1hx != null && this.A09 != null) {
            HashMap hashMap = new HashMap();
            C54s c54s = new C54s(C913045j.A00);
            Integer num5 = null;
            c54s.A0F(TraceFieldType.NetworkType, c1hx.A08);
            C1HX c1hx2 = this.A08;
            if (c1hx2 != null) {
                l = Long.valueOf(c1hx2.A05);
            } else {
                l = null;
            }
            if (l != null) {
                long longValue = l.longValue();
                if (longValue != Long.MAX_VALUE) {
                    c54s.A0E("ci", longValue);
                }
            }
            C1HX c1hx3 = this.A08;
            if (c1hx3 != null) {
                str = c1hx3.A06;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                c54s.A0F("mcc", str);
            }
            C1HX c1hx4 = this.A08;
            if (c1hx4 != null) {
                str2 = c1hx4.A07;
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                c54s.A0F("mnc", str2);
            }
            C1HX c1hx5 = this.A08;
            if (c1hx5 != null) {
                num = Integer.valueOf(c1hx5.A04);
            } else {
                num = null;
            }
            AbstractC121585f7.A00(c54s, num, "tac");
            C1EQ c1eq = this.A09;
            if (c1eq != null) {
                num2 = Integer.valueOf(c1eq.A04);
            } else {
                num2 = null;
            }
            AbstractC121585f7.A00(c54s, num2, "signal_dbm");
            C1EQ c1eq2 = this.A09;
            if (c1eq2 != null) {
                num3 = Integer.valueOf(c1eq2.A06);
            } else {
                num3 = null;
            }
            AbstractC121585f7.A00(c54s, num3, "lte_rsrq");
            C1EQ c1eq3 = this.A09;
            if (c1eq3 != null) {
                num4 = Integer.valueOf(c1eq3.A08);
            } else {
                num4 = null;
            }
            AbstractC121585f7.A00(c54s, num4, "lte_rssnr");
            C1EQ c1eq4 = this.A09;
            if (c1eq4 != null) {
                num5 = Integer.valueOf(c1eq4.A07);
            }
            AbstractC121585f7.A00(c54s, num5, "lte_rssi");
            C23441Cg A00 = C1CY.A00();
            C14360o3.A07(A00);
            if (A00.A0R) {
                c54s.A0F("nr_state", "CONNECTED");
            }
            C23411Cd c23411Cd = A00.A03;
            if (c23411Cd != null) {
                str3 = c23411Cd.A00.getSimOperator();
            } else {
                str3 = null;
            }
            if (str3 != null && str3.length() != 0) {
                c54s.A0F("sim_operator_mcc_mnc", str3);
            }
            hashMap.put("network_params", c54s.toString());
            this.A05 = hashMap;
        }
    }

    public static final void A02(C4T2 c4t2, C19280xC c19280xC, C95684Sc c95684Sc, HashMap hashMap) {
        if (c95684Sc != null) {
            c95684Sc.A1Q = hashMap;
            if (c19280xC != null) {
                c19280xC.A0F(hashMap);
            }
        }
        if (c4t2 != null) {
            c4t2.A06("network_generation", (String) hashMap.get("network_generation"));
            c4t2.A06("network_params", (String) hashMap.get("network_params"));
            c4t2.A06("network_type_info", (String) hashMap.get("network_type_info"));
            c4t2.A03("is_network_roaming", Boolean.valueOf(Boolean.parseBoolean((String) hashMap.get("is_network_roaming"))));
        }
    }

    @Override // X.C1HW
    public final void onCellIdentityChanged(C1HX c1hx) {
        synchronized (this.A05) {
            this.A08 = c1hx;
            A01();
        }
    }

    @Override // X.C1HW
    public final void onCellSignalStrengthChanged(C1EQ c1eq) {
        synchronized (this.A05) {
            this.A09 = c1eq;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.A07 > this.A0F) {
                A01();
                this.A07 = uptimeMillis;
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (this.A0H) {
            C1CY.A00().A0K.remove(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (X.C1CY.A00().A0g() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C95694Sd(android.content.Context r6, com.instagram.common.session.UserSession r7) {
        /*
            r5 = this;
            r5.<init>()
            r5.A0D = r6
            r5.A0E = r7
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314283495524872(0x8103a600060a08, double:3.028637336228104E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L1f
            X.1Cg r0 = X.C1CY.A00()
            boolean r0 = r0.A0g()
            r3 = 1
            if (r0 != 0) goto L20
        L1f:
            r3 = 0
        L20:
            r5.A0H = r3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.A05 = r0
            if (r3 == 0) goto L92
            r0 = 36595758471907579(0x8203a6000108fb, double:3.206643244701284E-306)
        L30:
            long r0 = X.C18U.A01(r2, r7, r0)
            int r4 = (int) r0
            r5.A00 = r4
            if (r4 > 0) goto L88
            r0 = -1
        L3a:
            r5.A06 = r0
            r0 = 36595758472169726(0x8203a6000508fe, double:3.206643244867067E-306)
            long r0 = X.C18U.A01(r2, r7, r0)
            int r4 = (int) r0
            r0 = 5000(0x1388, float:7.006E-42)
            if (r4 > 0) goto L83
            r4 = 1000(0x3e8, float:1.401E-42)
        L4c:
            android.util.LruCache r0 = new android.util.LruCache
            r0.<init>(r4)
            r5.A0G = r0
            r0 = 36595758472038653(0x8203a6000308fd, double:3.2066432447841756E-306)
            long r0 = X.C18U.A01(r2, r7, r0)
            int r4 = (int) r0
            r5.A0C = r4
            r0 = 36595758472300799(0x8203a6000708ff, double:3.206643244949958E-306)
            long r1 = X.C18U.A01(r2, r7, r0)
            int r0 = (int) r1
            r5.A0F = r0
            if (r3 == 0) goto L74
            X.1Cg r0 = X.C1CY.A00()
            r0.A0d(r5)
        L74:
            boolean r0 = X.C1VW.isLocationEnabled(r6)
            r5.A0A = r0
            java.lang.String r0 = "VIDEO_PLAYER_LOGGER"
            boolean r0 = X.C1VW.isLocationPermitted(r6, r7, r0)
            r5.A0B = r0
            return
        L83:
            if (r4 <= r0) goto L4c
            r4 = 5000(0x1388, float:7.006E-42)
            goto L4c
        L88:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r0 = r0.nextInt(r4)
            goto L3a
        L92:
            r0 = 36595758471973116(0x8203a6000208fc, double:3.20664324474273E-306)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95694Sd.<init>(android.content.Context, com.instagram.common.session.UserSession):void");
    }
}
