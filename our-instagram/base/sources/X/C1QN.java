package X;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1QN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1QN {
    public static final String A0A;
    public static final boolean A0B;
    public int A00;
    public C1QQ A02;
    public String A05;
    public final Map A07;
    public final java.util.Set A08;
    public final java.util.Set A09;
    public Boolean A03 = null;
    public long A01 = 0;
    public final C0JM A06 = C03250Di.A00;
    public String A04 = null;

    public static void A00(C1QN c1qn, String str) {
        Map map = c1qn.A07;
        C1QQ c1qq = (C1QQ) map.get(str);
        if (c1qq == null) {
            c1qq = new C1QQ();
            map.put(str, c1qq);
        } else if (str.equals(c1qn.A05)) {
            c1qq.A03.clear();
            C1QQ.A01(c1qq);
        }
        c1qn.A02 = c1qq;
        c1qn.A05 = str;
    }

    public static boolean A01(C3NJ c3nj, C1QN c1qn, AbstractC12990ll abstractC12990ll) {
        boolean A06 = C18U.A06(C06090Tz.A05, abstractC12990ll, 36313798164547839L);
        C1QQ c1qq = c1qn.A02;
        if (A06) {
            List list = c1qq.A03;
            int size = list.size();
            if ((size != 0 && list.get(size - 1).equals(c3nj)) || c1qn.A02.A02(c3nj)) {
                return true;
            }
            return false;
        }
        if (!c1qq.A03.isEmpty()) {
            return true;
        }
        return false;
    }

    public C1QN() {
        String str;
        boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36318050181584745L));
        HashSet hashSet = new HashSet();
        this.A09 = hashSet;
        this.A08 = new HashSet();
        if (A0B) {
            hashSet.add("ig_text_feed_timeline");
            hashSet.add("ig_text_search_nullstate");
            hashSet.add("ig_text_newsfeed_you");
            hashSet.add("ig_text_feed_self_profile");
        } else {
            int i = 0;
            if (A07) {
                Integer[] A00 = C05F.A00(10);
                int length = A00.length;
                while (i < length) {
                    Integer num = A00[i];
                    java.util.Set set = this.A09;
                    switch (num.intValue()) {
                        case 1:
                            str = "main_inbox";
                            break;
                        case 2:
                        case 3:
                            str = "main_camera";
                            break;
                        case 4:
                            str = "main_search";
                            break;
                        case 5:
                            str = "main_profile";
                            break;
                        case 6:
                            str = "shopping";
                            break;
                        case 7:
                            str = "main_clips";
                            break;
                        case 8:
                            str = "main_direct";
                            break;
                        case 9:
                            str = "producer_profile";
                            break;
                        default:
                            str = "main_home";
                            break;
                    }
                    set.add(str);
                    i++;
                }
            } else {
                C1QO[] values = C1QO.values();
                int length2 = values.length;
                while (i < length2) {
                    this.A09.add(values[i].A06);
                    i++;
                }
            }
        }
        this.A09.add("via_push_notification");
        this.A07 = new LinkedHashMap(this.A09.size(), 0.75f, true);
        A00(this, A0A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (X.AbstractC14490oL.A09(X.AbstractC12290kX.A00) == false) goto L6;
     */
    static {
        /*
            r0 = 36318050181584745(0x81071300021769, double:3.031019403659595E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            X.C20150ym.A07(r0)
            r0 = 36313798164809987(0x810335000f0903, double:3.028330411129741E-306)
            X.0tH r0 = X.AbstractC20100yh.A00(r0)
            boolean r0 = X.C20150ym.A07(r0)
            if (r0 == 0) goto L24
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r1 = X.AbstractC14490oL.A09(r0)
            r0 = 1
            if (r1 != 0) goto L25
        L24:
            r0 = 0
        L25:
            X.C1QN.A0B = r0
            if (r0 == 0) goto L2f
            java.lang.String r0 = "ig_text_feed_timeline"
        L2c:
            X.C1QN.A0A = r0
            return
        L2f:
            java.lang.String r0 = "main_home"
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1QN.<clinit>():void");
    }
}
