package com.instagram.common.analytics.intf;

import X.AnonymousClass001;
import X.C0x9;
import X.C14360o3;
import X.C19260xA;
import X.C19280xC;
import X.EnumC11440j2;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AnalyticsEventDebugInfo implements Parcelable {
    public String A00;
    public List A01 = new ArrayList();
    public final int A02;

    public static C19280xC A00(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        int i = 0;
        while (true) {
            List list = analyticsEventDebugInfo.A01;
            AnalyticsEventDebugInfo analyticsEventDebugInfo2 = null;
            if (i >= list.size()) {
                return null;
            }
            AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) list.get(i);
            if ("module".equals(analyticsEventEntry.A02)) {
                C19280xC A01 = C19280xC.A01(analyticsEventDebugInfo.A00, String.valueOf(analyticsEventEntry.A01));
                for (int i2 = 0; i2 < list.size(); i2++) {
                    AnalyticsEventEntry analyticsEventEntry2 = (AnalyticsEventEntry) list.get(i2);
                    String str = analyticsEventEntry2.A02;
                    Object obj = analyticsEventEntry2.A01;
                    if ("extra".equals(str)) {
                        analyticsEventDebugInfo2 = analyticsEventEntry2.A00;
                    } else if ("sample_rate".equals(str)) {
                        A01.A02 = (Integer) obj;
                    } else if ("time".equals(str)) {
                        String valueOf = String.valueOf(obj);
                        A01.A00 = Math.round(Double.parseDouble(valueOf.substring(0, valueOf.indexOf(32))));
                    } else if ("tags".equals(str)) {
                        long longValue = ((Number) obj).longValue();
                        EnumSet noneOf = EnumSet.noneOf(EnumC11440j2.class);
                        C14360o3.A07(noneOf);
                        for (EnumC11440j2 enumC11440j2 : EnumC11440j2.values()) {
                            long j = enumC11440j2.A00;
                            if ((j & longValue) == j) {
                                noneOf.add(enumC11440j2);
                            }
                        }
                        Iterator it = noneOf.iterator();
                        while (it.hasNext()) {
                            A01.A07.add(it.next());
                        }
                    }
                }
                A02(analyticsEventDebugInfo2, A01.A06);
                return A01;
            }
            i++;
        }
    }

    public static void A03(AnalyticsEventDebugInfo analyticsEventDebugInfo, String str, StringBuilder sb, boolean z) {
        String str2;
        int i = 0;
        while (true) {
            List list = analyticsEventDebugInfo.A01;
            if (i < list.size()) {
                AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) list.get(i);
                sb.append(str);
                if (z) {
                    sb.append(analyticsEventEntry.A02);
                    sb.append(" = ");
                }
                if (analyticsEventEntry.A00 != null) {
                    if (analyticsEventEntry.A00.A02 == 2) {
                        sb.append("{\n");
                        A03(analyticsEventEntry.A00, AnonymousClass001.A0R(str, "  "), sb, true);
                        sb.append(str);
                        str2 = "}";
                    } else if (analyticsEventEntry.A00.A02 == 3) {
                        sb.append("[\n");
                        A03(analyticsEventEntry.A00, AnonymousClass001.A0R(str, "  "), sb, false);
                        sb.append(str);
                        str2 = "]";
                    }
                    sb.append(str2);
                } else {
                    sb.append(analyticsEventEntry.A01);
                }
                sb.append("\n");
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static C0x9 A01(AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        Object obj;
        C0x9 c0x9 = new C0x9();
        int i = 0;
        while (true) {
            List list = analyticsEventDebugInfo.A01;
            if (i < list.size()) {
                AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) list.get(i);
                Object obj2 = analyticsEventEntry.A01;
                AnalyticsEventDebugInfo analyticsEventDebugInfo2 = analyticsEventEntry.A00;
                if (analyticsEventDebugInfo2 != null) {
                    int i2 = analyticsEventDebugInfo2.A02;
                    if (i2 == 2) {
                        C19260xA c19260xA = new C19260xA();
                        A02(analyticsEventEntry.A00, c19260xA);
                        obj = c19260xA;
                    } else if (i2 != 3) {
                        i++;
                    } else {
                        obj = A01(analyticsEventDebugInfo2);
                    }
                    c0x9.A00.add(obj);
                    i++;
                } else {
                    if (obj2 instanceof Long) {
                        c0x9.A02(((Number) obj2).longValue());
                    } else if (obj2 instanceof Integer) {
                        c0x9.A01(((Number) obj2).intValue());
                    } else if (obj2 instanceof Boolean) {
                        c0x9.A05(((Boolean) obj2).booleanValue());
                    } else {
                        boolean z = obj2 instanceof C19260xA;
                        obj = obj2;
                        if (!z) {
                            boolean z2 = obj2 instanceof C0x9;
                            obj = obj2;
                            if (!z2) {
                                if (obj2 instanceof Double) {
                                    c0x9.A00(((Number) obj2).doubleValue());
                                } else {
                                    c0x9.A04(String.valueOf(obj2));
                                }
                            }
                        }
                        c0x9.A00.add(obj);
                    }
                    i++;
                }
            } else {
                return c0x9;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0x9] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.0xA] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r7, X.C19260xA r8) {
        /*
            if (r7 == 0) goto L83
            r5 = 0
        L3:
            java.util.List r1 = r7.A01
            int r0 = r1.size()
            if (r5 >= r0) goto L83
            java.lang.Object r3 = r1.get(r5)
            com.instagram.common.analytics.intf.AnalyticsEventEntry r3 = (com.instagram.common.analytics.intf.AnalyticsEventEntry) r3
            java.lang.String r4 = r3.A02
            java.lang.Object r6 = r3.A01
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r2 = r3.A00
            if (r2 == 0) goto L34
            if (r4 != 0) goto L1f
            java.lang.String r4 = java.lang.String.valueOf(r5)
        L1f:
            int r1 = r2.A02
            r0 = 2
            if (r1 != r0) goto L79
            X.0xA r6 = new X.0xA
            r6.<init>()
            com.instagram.common.analytics.intf.AnalyticsEventDebugInfo r0 = r3.A00
            A02(r0, r6)
        L2e:
            X.C19260xA.A00(r8, r6, r4)
        L31:
            int r5 = r5 + 1
            goto L3
        L34:
            if (r4 == 0) goto L31
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 != 0) goto L80
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L80
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 != 0) goto L80
            boolean r0 = r6 instanceof X.C19260xA
            if (r0 != 0) goto L2e
            boolean r0 = r6 instanceof X.C0x9
            if (r0 != 0) goto L80
            boolean r0 = r6 instanceof java.util.List
            if (r0 == 0) goto L54
            java.util.List r6 = (java.util.List) r6
            r8.A08(r4, r6)
            goto L31
        L54:
            boolean r0 = r6 instanceof java.lang.String[]
            if (r0 == 0) goto L6c
            r3 = r6
            java.lang.String[] r3 = (java.lang.String[]) r3
            X.0x9 r6 = new X.0x9
            r6.<init>()
            int r2 = r3.length
            r1 = 0
        L62:
            if (r1 >= r2) goto L2e
            r0 = r3[r1]
            r6.A04(r0)
            int r1 = r1 + 1
            goto L62
        L6c:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 != 0) goto L80
            if (r6 == 0) goto L31
            java.lang.String r6 = java.lang.String.valueOf(r6)
            if (r6 == 0) goto L31
            goto L2e
        L79:
            r0 = 3
            if (r1 != r0) goto L31
            X.0x9 r6 = A01(r2)
        L80:
            if (r6 == 0) goto L31
            goto L2e
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.analytics.intf.AnalyticsEventDebugInfo.A02(com.instagram.common.analytics.intf.AnalyticsEventDebugInfo, X.0xA):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A00);
    }

    public AnalyticsEventDebugInfo(int i) {
        this.A02 = i;
    }
}
