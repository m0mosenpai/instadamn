package com.instagram.realtimeclient.clientconfig;

import X.AbstractC12990ll;
import X.AbstractC166997dE;
import X.AbstractC20100yh;
import X.C06090Tz;
import X.C0tH;
import X.C18U;

/* loaded from: classes12.dex */
public class L {

    /* loaded from: classes12.dex */
    public class ig_android_realtime_subscription_log {

        /* loaded from: classes2.dex */
        public class is_enabled {
            public static Boolean getAndExpose(AbstractC12990ll abstractC12990ll) {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, abstractC12990ll, 2342154805922759437L));
            }

            public static Boolean peekWithoutExposure(AbstractC12990ll abstractC12990ll) {
                return Boolean.valueOf(C18U.A06(C06090Tz.A06, abstractC12990ll, 2342154805922759437L));
            }

            public static C0tH getParameter() {
                return AbstractC20100yh.A00(2342154805922759437L);
            }
        }

        /* loaded from: classes4.dex */
        public class is_gqls_debug_log_enabled {
            public static Boolean getAndExpose(AbstractC12990ll abstractC12990ll) {
                return AbstractC166997dE.A0c(C06090Tz.A05, abstractC12990ll, 36311796709131022L);
            }

            public static Boolean peekWithoutExposure(AbstractC12990ll abstractC12990ll) {
                return AbstractC166997dE.A0c(C06090Tz.A06, abstractC12990ll, 36311796709131022L);
            }

            public static C0tH getParameter() {
                return AbstractC20100yh.A00(36311796709131022L);
            }
        }

        /* loaded from: classes4.dex */
        public class sampling_weight {
            public static Long getAndExpose(AbstractC12990ll abstractC12990ll) {
                return AbstractC166997dE.A0i(C06090Tz.A05, abstractC12990ll, 36593271685907530L);
            }

            public static Long peekWithoutExposure(AbstractC12990ll abstractC12990ll) {
                return AbstractC166997dE.A0i(C06090Tz.A06, abstractC12990ll, 36593271685907530L);
            }

            public static C0tH getParameter() {
                return AbstractC20100yh.A00(36593271685907530L);
            }
        }
    }
}
