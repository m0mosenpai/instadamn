package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.0Wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06570Wi {
    public static C10V A00;
    public static volatile boolean A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized C10V A00() {
        C10V c10v;
        C10V c10v2;
        synchronized (C06570Wi.class) {
            C10V c10v3 = A00;
            c10v = c10v3;
            if (c10v3 == null) {
                if (A01) {
                    c10v2 = new C10V() { // from class: X.0e1
                        public final C0Wh A00 = new C0Wh();

                        @Override // X.C10V
                        public final String A00() {
                            boolean z;
                            ArrayList arrayList;
                            String formatStrLocaleSafe;
                            C0Wh c0Wh = this.A00;
                            synchronized (c0Wh) {
                                z = false;
                                if (c0Wh.A00 == 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                return "";
                            }
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
                            StringBuilder sb = new StringBuilder();
                            synchronized (c0Wh) {
                                int i = c0Wh.A00;
                                arrayList = new ArrayList(i);
                                for (int i2 = 0; i2 < i; i2++) {
                                    arrayList.add(c0Wh.A03[(c0Wh.A01 + i2) % 128]);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C0Wf c0Wf = (C0Wf) it.next();
                                try {
                                    Object obj = c0Wf.A01;
                                    if (obj == null) {
                                        formatStrLocaleSafe = c0Wf.A04;
                                    } else {
                                        Object obj2 = c0Wf.A02;
                                        if (obj2 == null) {
                                            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(c0Wf.A04, obj);
                                        } else {
                                            Object obj3 = c0Wf.A03;
                                            if (obj3 == null) {
                                                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(c0Wf.A04, obj, obj2);
                                            } else {
                                                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(c0Wf.A04, obj, obj2, obj3);
                                            }
                                        }
                                    }
                                    sb.append(simpleDateFormat.format(new Date(c0Wf.A00)));
                                    sb.append(": [");
                                    sb.append(c0Wf.A05);
                                    sb.append("] ");
                                    sb.append(formatStrLocaleSafe);
                                    sb.append("\n");
                                } catch (RuntimeException e) {
                                    sb.append("Log format error: ");
                                    sb.append(e.getMessage());
                                    sb.append("; format string: ");
                                    sb.append(c0Wf.A04);
                                    android.util.Log.e("ProfiloInternalRecorder", e.getMessage(), e);
                                }
                            }
                            return sb.toString();
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v0, types: [X.0Wf, java.lang.Object] */
                        @Override // X.C10V
                        public final void A01(Object obj, Object obj2, Object obj3, String str, String str2) {
                            C0Wh c0Wh = this.A00;
                            ?? obj4 = new Object();
                            obj4.A00 = System.currentTimeMillis();
                            obj4.A05 = str;
                            obj4.A04 = str2;
                            obj4.A01 = obj;
                            obj4.A02 = obj2;
                            obj4.A03 = obj3;
                            c0Wh.A00(obj4);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v0, types: [X.0Wf, java.lang.Object] */
                        @Override // X.C10V
                        public final void A02(Object obj, Object obj2, String str, String str2) {
                            C0Wh c0Wh = this.A00;
                            ?? obj3 = new Object();
                            obj3.A00 = System.currentTimeMillis();
                            obj3.A05 = str;
                            obj3.A04 = str2;
                            obj3.A01 = obj;
                            obj3.A02 = obj2;
                            c0Wh.A00(obj3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v0, types: [X.0Wf, java.lang.Object] */
                        @Override // X.C10V
                        public final void A03(String str, Object obj, String str2) {
                            C0Wh c0Wh = this.A00;
                            ?? obj2 = new Object();
                            obj2.A00 = System.currentTimeMillis();
                            obj2.A05 = str;
                            obj2.A04 = str2;
                            obj2.A01 = obj;
                            c0Wh.A00(obj2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v0, types: [X.0Wf, java.lang.Object] */
                        @Override // X.C10V
                        public final void A04(String str, String str2) {
                            C0Wh c0Wh = this.A00;
                            ?? obj = new Object();
                            obj.A00 = System.currentTimeMillis();
                            obj.A05 = str;
                            obj.A04 = str2;
                            c0Wh.A00(obj);
                        }
                    };
                } else {
                    c10v2 = new Object();
                }
                A00 = c10v2;
                c10v = c10v2;
            }
        }
        return c10v;
    }
}
