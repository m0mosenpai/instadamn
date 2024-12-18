package X;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.5ya, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132515ya {
    public InterfaceC16620sF A00 = C132555ye.A00;
    public final C132545yd A01;
    public final C132525yb A02;

    public final void A04(Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2, boolean z3) {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        PowerManager powerManager;
        C14360o3.A0B(str3, 2);
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06) {
            c132525yb.A00(interfaceC16660sJ);
            if (c132525yb.A03) {
                int i = c132525yb.A00;
                if (i <= 0) {
                    str6 = "atid";
                } else {
                    str6 = AnonymousClass001.A0O("atid_", i);
                }
                UserFlowLogger userFlowLogger = c132525yb.A05;
                long j = c132525yb.A04;
                C9C9 c9c9 = C132525yb.A0L;
                String str11 = c9c9.A01;
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                Object systemService = context.getSystemService("power");
                if ((systemService instanceof PowerManager) && (powerManager = (PowerManager) systemService) != null && powerManager.isDeviceIdleMode()) {
                    str7 = "idle";
                } else {
                    str7 = null;
                }
                userFlowLogger.flowMarkPoint(j, str11, str7);
                userFlowLogger.flowAnnotate(j, str6, str);
                if (str2 != null) {
                    userFlowLogger.flowAnnotate(j, "debug_atid", str2);
                }
                userFlowLogger.flowAnnotateWithCrucialData(j, "n", String.valueOf(c132525yb.A00 + 1));
                userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
                if (c132525yb.A00 == 0) {
                    userFlowLogger.flowAnnotateWithCrucialData(j, "atid", str);
                    if (z3) {
                        userFlowLogger.flowAnnotateWithCrucialData(j, "ae", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                    }
                    int i2 = 0;
                    if (str4 != null && str4.length() != 0) {
                        userFlowLogger.flowAnnotate(j, "feature_tags", str4);
                    }
                    userFlowLogger.flowAnnotate(j, "push_source", str3);
                    if (z) {
                        str8 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                    } else {
                        str8 = "0";
                    }
                    userFlowLogger.flowAnnotate(j, "silent_push", str8);
                    if (!z2) {
                        str9 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                    } else {
                        str9 = "0";
                    }
                    userFlowLogger.flowAnnotate(j, "is_bg_account", str9);
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            str10 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                        } else {
                            str10 = "0";
                        }
                        userFlowLogger.flowAnnotate(j, AbstractC58317Pt9.A00(43), str10);
                    }
                    if (num != null) {
                        userFlowLogger.flowAnnotate(j, "priority", num.intValue());
                    }
                    if (num2 != null && num != null) {
                        i2 = num2.intValue() - num.intValue();
                    }
                    userFlowLogger.flowAnnotate(j, "priority_diff", String.valueOf(i2));
                    if (str5 != null) {
                        userFlowLogger.flowAnnotate(j, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
                    }
                }
            }
        }
        this.A00 = interfaceC16620sF;
    }

    public final void A00() {
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06 && c132525yb.A03) {
            UserFlowLogger userFlowLogger = c132525yb.A05;
            long j = c132525yb.A04;
            C9C9 c9c9 = C132525yb.A0B;
            userFlowLogger.flowMarkPoint(j, c9c9.A01);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
        }
    }

    public final void A01() {
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06 && c132525yb.A03) {
            UserFlowLogger userFlowLogger = c132525yb.A05;
            long j = c132525yb.A04;
            C9C9 c9c9 = C132525yb.A0F;
            userFlowLogger.flowMarkPoint(j, c9c9.A01);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
        }
    }

    public final void A02(int i, InterfaceC16660sJ interfaceC16660sJ) {
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06) {
            c132525yb.A00(interfaceC16660sJ);
            if (c132525yb.A03) {
                UserFlowLogger userFlowLogger = c132525yb.A05;
                long j = c132525yb.A04;
                C9C9 c9c9 = C132525yb.A0N;
                userFlowLogger.flowMarkPoint(j, c9c9.A01);
                userFlowLogger.flowAnnotate(j, "is_retry", true);
                userFlowLogger.flowAnnotate(j, "remaining_retries", i);
                userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
            }
        }
    }

    public final void A03(int i, boolean z) {
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06 && c132525yb.A03) {
            UserFlowLogger userFlowLogger = c132525yb.A05;
            long j = c132525yb.A04;
            C9C9 c9c9 = C132525yb.A0I;
            userFlowLogger.flowMarkPoint(j, c9c9.A01);
            userFlowLogger.flowAnnotate(j, "mem_state_at_callback", i);
            userFlowLogger.flowAnnotate(j, "is_retry", z);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
        }
    }

    public final void A05(String str) {
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06 && c132525yb.A03) {
            UserFlowLogger userFlowLogger = c132525yb.A05;
            long j = c132525yb.A04;
            userFlowLogger.flowAnnotate(j, "skip_reason", str);
            C9C9 c9c9 = C132525yb.A0E;
            userFlowLogger.flowMarkPoint(j, c9c9.A01);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (r0.equals(r12) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            r8 = this;
            X.5yb r1 = r8.A02
            boolean r0 = r1.A06
            if (r0 == 0) goto L19
            if (r9 != 0) goto L16
            if (r14 == 0) goto L19
            if (r12 == 0) goto L19
            boolean r0 = r1.A03
            if (r0 == 0) goto L19
            java.lang.String r0 = r1.A01
            if (r0 != 0) goto L5c
            r1.A01 = r12
        L16:
            r1.A01(r13, r11)
        L19:
            X.5yd r7 = r8.A01
            boolean r0 = r7.A01
            if (r0 == 0) goto L5b
            if (r10 == 0) goto L5b
            X.0sF r5 = r8.A00
            java.lang.Long r0 = X.C132545yd.A00(r7, r10)
            if (r0 == 0) goto L5b
            long r0 = r0.longValue()
            com.facebook.quicklog.reliability.UserFlowLogger r6 = r7.A00
            X.9C9 r4 = X.C132545yd.A06
            java.lang.String r2 = r4.A01
            r6.flowMarkPoint(r0, r2)
            if (r13 != 0) goto L46
            java.lang.String r3 = "suppress_in_app_layer"
            java.lang.String r2 = "1"
            r6.flowAnnotate(r0, r3, r2)
            if (r11 == 0) goto L46
            java.lang.String r2 = "suppress_reason"
            r6.flowAnnotate(r0, r2, r11)
        L46:
            java.lang.String r3 = r4.A00
            java.lang.String r2 = "c"
            r6.flowAnnotateWithCrucialData(r0, r2, r3)
            boolean r2 = r7.A02
            if (r2 != 0) goto L53
            if (r13 != 0) goto L56
        L53:
            r6.flowEndSuccess(r0, r10)
        L56:
            X.5xi r0 = X.EnumC132075xi.A07
            r5.invoke(r0, r10)
        L5b:
            return
        L5c:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L19
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132515ya.A06(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void A07(String str, String str2, String str3, boolean z) {
        C132545yd c132545yd = this.A01;
        if (c132545yd.A01 && str != null) {
            InterfaceC16620sF interfaceC16620sF = this.A00;
            Long A00 = C132545yd.A00(c132545yd, str);
            if (A00 != null) {
                long longValue = A00.longValue();
                UserFlowLogger userFlowLogger = c132545yd.A00;
                C9C9 c9c9 = C132545yd.A04;
                userFlowLogger.flowMarkPoint(longValue, c9c9.A01);
                userFlowLogger.flowAnnotateWithCrucialData(longValue, "c", c9c9.A00);
                userFlowLogger.flowAnnotate(longValue, "msg_drop_reason", str3);
                if (z) {
                    userFlowLogger.flowEndSuccess(longValue, str);
                    interfaceC16620sF.invoke(EnumC132075xi.A07, str);
                }
            }
        }
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06 && str2 != null && c132525yb.A03) {
            String str4 = c132525yb.A01;
            if (str4 == null) {
                c132525yb.A01 = str2;
            } else if (!str4.equals(str2)) {
                return;
            }
            UserFlowLogger userFlowLogger2 = c132525yb.A05;
            long j = c132525yb.A04;
            C9C9 c9c92 = C132525yb.A09;
            userFlowLogger2.flowMarkPoint(j, c9c92.A01);
            userFlowLogger2.flowAnnotateWithCrucialData(j, "c", c9c92.A00);
            userFlowLogger2.flowAnnotate(j, "msg_drop_reason", str3);
        }
    }

    public final void A08(String str, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06) {
            c132525yb.A00(interfaceC16660sJ);
            if (c132525yb.A03) {
                c132525yb.A05.flowAnnotate(c132525yb.A04, "is_generic_after_retry", true);
                c132525yb.A01(z, str);
            }
        }
    }

    public final void A09(boolean z) {
        C132525yb c132525yb = this.A02;
        if (c132525yb.A06 && c132525yb.A03) {
            UserFlowLogger userFlowLogger = c132525yb.A05;
            long j = c132525yb.A04;
            userFlowLogger.flowAnnotate(j, "is_mi_sync", z);
            C9C9 c9c9 = C132525yb.A0J;
            userFlowLogger.flowMarkPoint(j, c9c9.A01);
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
        }
    }

    public C132515ya(UserSession userSession) {
        this.A02 = new C132525yb(userSession);
        this.A01 = new C132545yd(userSession);
    }
}
