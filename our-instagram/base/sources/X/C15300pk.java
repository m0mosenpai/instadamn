package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.analytics.memory.AddressSpace;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15300pk implements C0N9 {
    public final int A00;

    public C15300pk(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.05D, java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, X.04q] */
    /* JADX WARN: Type inference failed for: r4v28, types: [X.049, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.079, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.05P, java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.0LR] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.05D, java.lang.Object, X.0LR] */
    @Override // X.C0N9
    public final Object ALP(final C0NK c0nk) {
        final File file;
        C0OP c0op;
        Integer num;
        C0LR[] c0lrArr;
        C0Wg c0Wg;
        switch (this.A00) {
            case 0:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 28:
                File A02 = c0nk.A05().A02(c0nk.A05().A07);
                if (A02 != null) {
                    return new C013905f(A02);
                }
                return null;
            case 1:
            case Process.SIGTERM /* 15 */:
            case 30:
                file = c0nk.A05().A02(c0nk.A05().A07);
                if (file == null) {
                    return null;
                }
                final C0Pe A05 = c0nk.A05();
                return new C0LR(A05, file) { // from class: X.07Q
                    public final C0Pe A00;
                    public final File A01;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A1I;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        File file2 = this.A01;
                        File file3 = new File(file2, "state.txt");
                        if (file3.exists()) {
                            C0ME c0me = new C0ME(file3, false);
                            char A052 = c0me.A05();
                            boolean A01 = C0MG.A01(A052);
                            String A0H = c0me.A0H();
                            c024209q.A03(C0LK.A4U, file2.getName());
                            c024209q.A02(C0LK.A2u, Long.valueOf(C0Pe.A00(file2, "")));
                            c024209q.A00(C0LK.A03, A01);
                            c024209q.A03(C0LK.A4O, String.valueOf(A052));
                            c024209q.A03(C0LK.A4R, A0H);
                            c024209q.A02(C0LK.A1F, Long.valueOf(c0me.A0E()));
                            c024209q.A03(C0LK.A4N, String.valueOf(c0me.A02()));
                            c024209q.A00(C0LK.A02, c0me.A0O());
                            c024209q.A01(C0LK.A1E, c0me.A07());
                            c024209q.A01(C0LK.A1H, c0me.A09(false));
                            c024209q.A01(C0LK.A1G, c0me.A09(true));
                            c024209q.A00(C0LK.A04, c0me.A0R());
                            c024209q.A00(C0LK.A0X, c0me.A0S());
                            c024209q.A00(C0LK.A0b, c0me.A0T());
                            c024209q.A03(C0LK.A6W, c0me.A0L());
                            File file4 = new File(file2, "first_intent.txt");
                            if (file4.exists()) {
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file4));
                                    try {
                                        c024209q.A03(C0LK.A5j, bufferedReader.readLine());
                                        bufferedReader.close();
                                    } finally {
                                    }
                                } catch (IOException unused) {
                                }
                            }
                            C10860hv c10860hv = C0LK.A3G;
                            C0Pe c0Pe = this.A00;
                            c024209q.A02(c10860hv, Long.valueOf(c0Pe.A00 - c0Pe.A01));
                            c024209q.A03(C0LK.A7d, c0me.A0M());
                            c024209q.A03(C0LK.A5Z, c0me.A0K());
                            c024209q.A03(C0LK.A8n, c0me.A0N());
                            c024209q.A02(C0LK.A1w, Long.valueOf(c0me.A0D()));
                            c024209q.A03(C0LK.A4C, String.valueOf(c0me.A03()));
                            c024209q.A03(C0LK.A4Z, c0me.A0I());
                            char A00 = C0MB.A00(new File(file2, "native_state.txt"));
                            char A002 = C0MB.A00(new File(file2, "anr_state.txt"));
                            char A06 = c0me.A06();
                            c024209q.A03(C0LK.A4S, String.valueOf(A06));
                            c024209q.A03(C0LK.A4T, String.valueOf(A00));
                            c024209q.A03(C0LK.A4P, String.valueOf(A002));
                            c024209q.A03(C0LK.A4Q, String.valueOf(C0MG.A00(A06, A00, A002)));
                            c024209q.A03(C0LK.A5N, String.valueOf(new File(file2, "shut_down").exists()));
                            c024209q.A03(C0LK.A54, String.valueOf(c0me.A04()));
                            c024209q.A02(C0LK.A3H, Long.valueOf(c0me.A0F()));
                            c024209q.A03(C0LK.A5l, String.valueOf(c0me.A0Q()));
                            Boolean A0G = c0me.A0G();
                            if (A0G != null) {
                                c024209q.A00(C0LK.A0c, A0G.booleanValue());
                            }
                            c024209q.A03(C0LK.A9k, String.valueOf(c0me.A0U()));
                            C0MD A012 = C0ME.A01(c0me, 364, 365);
                            if (A012 != null) {
                                c024209q.A00(C0LK.A0Z, A012.A01);
                                String str = A012.A00;
                                if (str != null && str.length() > 0) {
                                    c024209q.A03(C0LK.A8W, str);
                                }
                            }
                            C0MC A003 = C0ME.A00(c0me, "last OnPause request received time ms", 207L);
                            if (A003 != null && !A003.A04) {
                                if (A003.A03) {
                                    c024209q.A02(C0LK.A20, Long.valueOf(A003.A02));
                                    c024209q.A02(C0LK.A1z, Long.valueOf(A003.A00));
                                } else {
                                    C0K8.A0P("lacrima", "Timestamp value %s for base key last_on_pause_request_recv is not valid", A003);
                                    c024209q.A00(C0LK.A0T, true);
                                }
                            }
                            C0MC A004 = C0ME.A00(c0me, "last OnPause request to leave app received time ms", 224L);
                            if (A004 != null && !A004.A04) {
                                if (A004.A03) {
                                    c024209q.A02(C0LK.A24, Long.valueOf(A004.A02));
                                    c024209q.A02(C0LK.A23, Long.valueOf(A004.A00));
                                } else {
                                    C0K8.A0P("lacrima", "Timestamp value %s for base key \"last_on_pause_request_to_leave_app_recv\" is not valid", A004);
                                    c024209q.A00(C0LK.A0V, true);
                                }
                            }
                            C0MD A013 = C0ME.A01(c0me, 493, 494);
                            if (A013 != null) {
                                c024209q.A00(C0LK.A0Y, A013.A01);
                                String str2 = A013.A00;
                                if (str2 != null && str2.length() > 0) {
                                    c024209q.A03(C0LK.A8V, str2);
                                }
                            }
                            C0MC A005 = C0ME.A00(c0me, "last OnPause request execute start time ms", 241L);
                            if (A005 != null && !A005.A04) {
                                if (A005.A03) {
                                    c024209q.A02(C0LK.A1y, Long.valueOf(A005.A02));
                                    c024209q.A02(C0LK.A1x, Long.valueOf(A005.A00));
                                } else {
                                    C0K8.A0P("lacrima", "Timestamp value %s for base key \"last_on_pause_request_exec\" is not valid", A005);
                                    c024209q.A00(C0LK.A0S, true);
                                }
                            }
                            C0MC A006 = C0ME.A00(c0me, "last OnPause request to leave app execute start time ms", 258L);
                            if (A006 != null && !A006.A04) {
                                if (A006.A03) {
                                    c024209q.A02(C0LK.A22, Long.valueOf(A006.A02));
                                    c024209q.A02(C0LK.A21, Long.valueOf(A006.A00));
                                } else {
                                    C0K8.A0P("lacrima", "Timestamp value %s for base key \"last_on_pause_request_to_leave_app_exec\" is not valid", A006);
                                    c024209q.A00(C0LK.A0U, true);
                                }
                            }
                            boolean A0P = c0me.A0P();
                            c024209q.A03(C0LK.A5C, String.valueOf(A0P));
                            if (A0P) {
                                c024209q.A03(C0LK.A5E, String.valueOf(c0me.A0C()));
                                c024209q.A03(C0LK.A5D, String.valueOf(c0me.A0J()));
                            }
                            int A08 = c0me.A08();
                            if (A08 > 0) {
                                c024209q.A01(C0LK.A13, A08);
                                c024209q.A02(C0LK.A14, Long.valueOf(c0me.A0A()));
                                c024209q.A02(C0LK.A15, Long.valueOf(c0me.A0B()));
                            }
                            if (C0L6.A04 != null) {
                                c024209q.A00(C0LK.A0d, false);
                            }
                        }
                    }

                    {
                        this.A01 = file;
                        this.A00 = A05;
                    }
                };
            case 2:
            case 5:
            case 7:
                file = c0nk.A05().A05;
                C02R.A03(file, "Did you call SessionManager.init()?");
                final C0Pe A052 = c0nk.A05();
                return new C0LR(A052, file) { // from class: X.07Q
                    public final C0Pe A00;
                    public final File A01;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A1I;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        File file2 = this.A01;
                        File file3 = new File(file2, "state.txt");
                        if (file3.exists()) {
                            C0ME c0me = new C0ME(file3, false);
                            char A0522 = c0me.A05();
                            boolean A01 = C0MG.A01(A0522);
                            String A0H = c0me.A0H();
                            c024209q.A03(C0LK.A4U, file2.getName());
                            c024209q.A02(C0LK.A2u, Long.valueOf(C0Pe.A00(file2, "")));
                            c024209q.A00(C0LK.A03, A01);
                            c024209q.A03(C0LK.A4O, String.valueOf(A0522));
                            c024209q.A03(C0LK.A4R, A0H);
                            c024209q.A02(C0LK.A1F, Long.valueOf(c0me.A0E()));
                            c024209q.A03(C0LK.A4N, String.valueOf(c0me.A02()));
                            c024209q.A00(C0LK.A02, c0me.A0O());
                            c024209q.A01(C0LK.A1E, c0me.A07());
                            c024209q.A01(C0LK.A1H, c0me.A09(false));
                            c024209q.A01(C0LK.A1G, c0me.A09(true));
                            c024209q.A00(C0LK.A04, c0me.A0R());
                            c024209q.A00(C0LK.A0X, c0me.A0S());
                            c024209q.A00(C0LK.A0b, c0me.A0T());
                            c024209q.A03(C0LK.A6W, c0me.A0L());
                            File file4 = new File(file2, "first_intent.txt");
                            if (file4.exists()) {
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file4));
                                    try {
                                        c024209q.A03(C0LK.A5j, bufferedReader.readLine());
                                        bufferedReader.close();
                                    } finally {
                                    }
                                } catch (IOException unused) {
                                }
                            }
                            C10860hv c10860hv = C0LK.A3G;
                            C0Pe c0Pe = this.A00;
                            c024209q.A02(c10860hv, Long.valueOf(c0Pe.A00 - c0Pe.A01));
                            c024209q.A03(C0LK.A7d, c0me.A0M());
                            c024209q.A03(C0LK.A5Z, c0me.A0K());
                            c024209q.A03(C0LK.A8n, c0me.A0N());
                            c024209q.A02(C0LK.A1w, Long.valueOf(c0me.A0D()));
                            c024209q.A03(C0LK.A4C, String.valueOf(c0me.A03()));
                            c024209q.A03(C0LK.A4Z, c0me.A0I());
                            char A00 = C0MB.A00(new File(file2, "native_state.txt"));
                            char A002 = C0MB.A00(new File(file2, "anr_state.txt"));
                            char A06 = c0me.A06();
                            c024209q.A03(C0LK.A4S, String.valueOf(A06));
                            c024209q.A03(C0LK.A4T, String.valueOf(A00));
                            c024209q.A03(C0LK.A4P, String.valueOf(A002));
                            c024209q.A03(C0LK.A4Q, String.valueOf(C0MG.A00(A06, A00, A002)));
                            c024209q.A03(C0LK.A5N, String.valueOf(new File(file2, "shut_down").exists()));
                            c024209q.A03(C0LK.A54, String.valueOf(c0me.A04()));
                            c024209q.A02(C0LK.A3H, Long.valueOf(c0me.A0F()));
                            c024209q.A03(C0LK.A5l, String.valueOf(c0me.A0Q()));
                            Boolean A0G = c0me.A0G();
                            if (A0G != null) {
                                c024209q.A00(C0LK.A0c, A0G.booleanValue());
                            }
                            c024209q.A03(C0LK.A9k, String.valueOf(c0me.A0U()));
                            C0MD A012 = C0ME.A01(c0me, 364, 365);
                            if (A012 != null) {
                                c024209q.A00(C0LK.A0Z, A012.A01);
                                String str = A012.A00;
                                if (str != null && str.length() > 0) {
                                    c024209q.A03(C0LK.A8W, str);
                                }
                            }
                            C0MC A003 = C0ME.A00(c0me, "last OnPause request received time ms", 207L);
                            if (A003 != null && !A003.A04) {
                                if (A003.A03) {
                                    c024209q.A02(C0LK.A20, Long.valueOf(A003.A02));
                                    c024209q.A02(C0LK.A1z, Long.valueOf(A003.A00));
                                } else {
                                    C0K8.A0P("lacrima", "Timestamp value %s for base key last_on_pause_request_recv is not valid", A003);
                                    c024209q.A00(C0LK.A0T, true);
                                }
                            }
                            C0MC A004 = C0ME.A00(c0me, "last OnPause request to leave app received time ms", 224L);
                            if (A004 != null && !A004.A04) {
                                if (A004.A03) {
                                    c024209q.A02(C0LK.A24, Long.valueOf(A004.A02));
                                    c024209q.A02(C0LK.A23, Long.valueOf(A004.A00));
                                } else {
                                    C0K8.A0P("lacrima", "Timestamp value %s for base key \"last_on_pause_request_to_leave_app_recv\" is not valid", A004);
                                    c024209q.A00(C0LK.A0V, true);
                                }
                            }
                            C0MD A013 = C0ME.A01(c0me, 493, 494);
                            if (A013 != null) {
                                c024209q.A00(C0LK.A0Y, A013.A01);
                                String str2 = A013.A00;
                                if (str2 != null && str2.length() > 0) {
                                    c024209q.A03(C0LK.A8V, str2);
                                }
                            }
                            C0MC A005 = C0ME.A00(c0me, "last OnPause request execute start time ms", 241L);
                            if (A005 != null && !A005.A04) {
                                if (A005.A03) {
                                    c024209q.A02(C0LK.A1y, Long.valueOf(A005.A02));
                                    c024209q.A02(C0LK.A1x, Long.valueOf(A005.A00));
                                } else {
                                    C0K8.A0P("lacrima", "Timestamp value %s for base key \"last_on_pause_request_exec\" is not valid", A005);
                                    c024209q.A00(C0LK.A0S, true);
                                }
                            }
                            C0MC A006 = C0ME.A00(c0me, "last OnPause request to leave app execute start time ms", 258L);
                            if (A006 != null && !A006.A04) {
                                if (A006.A03) {
                                    c024209q.A02(C0LK.A22, Long.valueOf(A006.A02));
                                    c024209q.A02(C0LK.A21, Long.valueOf(A006.A00));
                                } else {
                                    C0K8.A0P("lacrima", "Timestamp value %s for base key \"last_on_pause_request_to_leave_app_exec\" is not valid", A006);
                                    c024209q.A00(C0LK.A0U, true);
                                }
                            }
                            boolean A0P = c0me.A0P();
                            c024209q.A03(C0LK.A5C, String.valueOf(A0P));
                            if (A0P) {
                                c024209q.A03(C0LK.A5E, String.valueOf(c0me.A0C()));
                                c024209q.A03(C0LK.A5D, String.valueOf(c0me.A0J()));
                            }
                            int A08 = c0me.A08();
                            if (A08 > 0) {
                                c024209q.A01(C0LK.A13, A08);
                                c024209q.A02(C0LK.A14, Long.valueOf(c0me.A0A()));
                                c024209q.A02(C0LK.A15, Long.valueOf(c0me.A0B()));
                            }
                            if (C0L6.A04 != null) {
                                c024209q.A00(C0LK.A0d, false);
                            }
                        }
                    }

                    {
                        this.A01 = file;
                        this.A00 = A052;
                    }
                };
            case 3:
                c0op = C0OP.A0Q;
                return new C07580aX(c0nk.A04(), c0op, c0nk.A05(), C04590Mb.A05);
            case 4:
                Application application = c0nk.A0J;
                ?? obj = new Object();
                obj.A00 = application;
                return obj;
            case 6:
            case 14:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 32:
            default:
                Application application2 = c0nk.A0J;
                ?? obj2 = new Object();
                obj2.A00 = application2;
                return obj2;
            case 8:
                final boolean z = false;
                return new C0LR(z) { // from class: X.032
                    public final boolean A00;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A0a;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    {
                        this.A00 = z;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        C0AT.A00();
                        C10860hv c10860hv = C0LK.A3A;
                        long[] jArr = C0AT.A01;
                        c024209q.A02(c10860hv, Long.valueOf(jArr[0]));
                        c024209q.A02(C0LK.A37, Long.valueOf(jArr[1]));
                        c024209q.A02(C0LK.A35, Long.valueOf(jArr[3]));
                        c024209q.A02(C0LK.A33, Long.valueOf(jArr[6]));
                        c024209q.A02(C0LK.A38, Long.valueOf(jArr[8] + jArr[9] + jArr[10] + jArr[11]));
                        c024209q.A02(C0LK.A36, Long.valueOf(jArr[2] + jArr[4] + jArr[5] + jArr[12]));
                        c024209q.A02(C0LK.A39, Long.valueOf(jArr[7]));
                        c024209q.A02(C0LK.A34, Long.valueOf(jArr[13]));
                        if (this.A00) {
                            c024209q.A01(C0LK.A1q, AddressSpace.getLargestChunkKb());
                        }
                        Runtime runtime = Runtime.getRuntime();
                        c024209q.A02(C0LK.A1o, Long.valueOf(runtime.maxMemory()));
                        c024209q.A02(C0LK.A1p, Long.valueOf(runtime.totalMemory()));
                        c024209q.A02(C0LK.A1n, Long.valueOf(runtime.freeMemory()));
                        if (!C0AR.A00) {
                            int[] iArr = {8192};
                            long[] jArr2 = new long[1];
                            if (C0JC.A01("/dev/memcg/memory.usage_in_bytes", iArr, jArr2)) {
                                long j = jArr2[0];
                                if (C0JC.A01("/dev/memcg/memory.memsw.usage_in_bytes", iArr, jArr2)) {
                                    long j2 = jArr2[0];
                                    c024209q.A02(C0LK.A2D, Long.valueOf(j));
                                    c024209q.A02(C0LK.A2C, Long.valueOf(j2));
                                }
                            }
                            C0AR.A00 = true;
                        }
                        long[] jArr3 = new long[1];
                        C0JC.A02("/proc/self/status", jArr3, AbstractC02520Aa.A00);
                        c024209q.A02(C0LK.A3B, Long.valueOf(jArr3[0]));
                    }
                };
            case 9:
                num = C05F.A0M;
                final boolean z2 = true;
                C0LR c0lr = new C0LR(z2) { // from class: X.032
                    public final boolean A00;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A0a;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    {
                        this.A00 = z2;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        C0AT.A00();
                        C10860hv c10860hv = C0LK.A3A;
                        long[] jArr = C0AT.A01;
                        c024209q.A02(c10860hv, Long.valueOf(jArr[0]));
                        c024209q.A02(C0LK.A37, Long.valueOf(jArr[1]));
                        c024209q.A02(C0LK.A35, Long.valueOf(jArr[3]));
                        c024209q.A02(C0LK.A33, Long.valueOf(jArr[6]));
                        c024209q.A02(C0LK.A38, Long.valueOf(jArr[8] + jArr[9] + jArr[10] + jArr[11]));
                        c024209q.A02(C0LK.A36, Long.valueOf(jArr[2] + jArr[4] + jArr[5] + jArr[12]));
                        c024209q.A02(C0LK.A39, Long.valueOf(jArr[7]));
                        c024209q.A02(C0LK.A34, Long.valueOf(jArr[13]));
                        if (this.A00) {
                            c024209q.A01(C0LK.A1q, AddressSpace.getLargestChunkKb());
                        }
                        Runtime runtime = Runtime.getRuntime();
                        c024209q.A02(C0LK.A1o, Long.valueOf(runtime.maxMemory()));
                        c024209q.A02(C0LK.A1p, Long.valueOf(runtime.totalMemory()));
                        c024209q.A02(C0LK.A1n, Long.valueOf(runtime.freeMemory()));
                        if (!C0AR.A00) {
                            int[] iArr = {8192};
                            long[] jArr2 = new long[1];
                            if (C0JC.A01("/dev/memcg/memory.usage_in_bytes", iArr, jArr2)) {
                                long j = jArr2[0];
                                if (C0JC.A01("/dev/memcg/memory.memsw.usage_in_bytes", iArr, jArr2)) {
                                    long j2 = jArr2[0];
                                    c024209q.A02(C0LK.A2D, Long.valueOf(j));
                                    c024209q.A02(C0LK.A2C, Long.valueOf(j2));
                                }
                            }
                            C0AR.A00 = true;
                        }
                        long[] jArr3 = new long[1];
                        C0JC.A02("/proc/self/status", jArr3, AbstractC02520Aa.A00);
                        c024209q.A02(C0LK.A3B, Long.valueOf(jArr3[0]));
                    }
                };
                ?? obj3 = new Object();
                Application application3 = c0nk.A0J;
                ?? obj4 = new Object();
                obj4.A00 = application3;
                c0lrArr = new C0LR[]{c0lr, obj3, obj4, new Object(), new C02P()};
                return new C09U(num, c0lrArr);
            case 10:
                num = C05F.A0t;
                InterfaceC08830cm interfaceC08830cm = c0nk.A07;
                if (interfaceC08830cm == null) {
                    interfaceC08830cm = new C15310pl(c0nk, 9);
                    c0nk.A07 = interfaceC08830cm;
                }
                ?? obj5 = new Object();
                obj5.A00 = interfaceC08830cm;
                final boolean z3 = true;
                C0LR c0lr2 = new C0LR(z3) { // from class: X.032
                    public final boolean A00;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A0a;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    {
                        this.A00 = z3;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        C0AT.A00();
                        C10860hv c10860hv = C0LK.A3A;
                        long[] jArr = C0AT.A01;
                        c024209q.A02(c10860hv, Long.valueOf(jArr[0]));
                        c024209q.A02(C0LK.A37, Long.valueOf(jArr[1]));
                        c024209q.A02(C0LK.A35, Long.valueOf(jArr[3]));
                        c024209q.A02(C0LK.A33, Long.valueOf(jArr[6]));
                        c024209q.A02(C0LK.A38, Long.valueOf(jArr[8] + jArr[9] + jArr[10] + jArr[11]));
                        c024209q.A02(C0LK.A36, Long.valueOf(jArr[2] + jArr[4] + jArr[5] + jArr[12]));
                        c024209q.A02(C0LK.A39, Long.valueOf(jArr[7]));
                        c024209q.A02(C0LK.A34, Long.valueOf(jArr[13]));
                        if (this.A00) {
                            c024209q.A01(C0LK.A1q, AddressSpace.getLargestChunkKb());
                        }
                        Runtime runtime = Runtime.getRuntime();
                        c024209q.A02(C0LK.A1o, Long.valueOf(runtime.maxMemory()));
                        c024209q.A02(C0LK.A1p, Long.valueOf(runtime.totalMemory()));
                        c024209q.A02(C0LK.A1n, Long.valueOf(runtime.freeMemory()));
                        if (!C0AR.A00) {
                            int[] iArr = {8192};
                            long[] jArr2 = new long[1];
                            if (C0JC.A01("/dev/memcg/memory.usage_in_bytes", iArr, jArr2)) {
                                long j = jArr2[0];
                                if (C0JC.A01("/dev/memcg/memory.memsw.usage_in_bytes", iArr, jArr2)) {
                                    long j2 = jArr2[0];
                                    c024209q.A02(C0LK.A2D, Long.valueOf(j));
                                    c024209q.A02(C0LK.A2C, Long.valueOf(j2));
                                }
                            }
                            C0AR.A00 = true;
                        }
                        long[] jArr3 = new long[1];
                        C0JC.A02("/proc/self/status", jArr3, AbstractC02520Aa.A00);
                        c024209q.A02(C0LK.A3B, Long.valueOf(jArr3[0]));
                    }
                };
                ?? obj6 = new Object();
                Application application4 = c0nk.A0J;
                ?? obj7 = new Object();
                obj7.A00 = application4;
                c0lrArr = new C0LR[]{obj5, c0lr2, obj6, obj7, new Object(), new C02P()};
                return new C09U(num, c0lrArr);
            case 11:
                c0nk.A0J.getPackageName();
                return new Object();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c0op = C0OP.A0R;
                return new C07580aX(c0nk.A04(), c0op, c0nk.A05(), C04590Mb.A05);
            case 16:
                return null;
            case 17:
                final Application application5 = c0nk.A0J;
                final C0Pe A053 = c0nk.A05();
                final C0LW A04 = c0nk.A04();
                return new C0OO(application5, A04, A053) { // from class: X.0r8
                    public final Application A00;
                    public final C0LW A01;
                    public final C0Pe A02;

                    @Override // X.C0OO
                    public final /* synthetic */ C0Z0 BNJ() {
                        return null;
                    }

                    @Override // X.C0OO
                    public final void start() {
                        C024209q c024209q = new C024209q(null);
                        HashMap A022 = C0LB.A02();
                        String str = (String) A022.get("fb.report_source");
                        if (!TextUtils.isEmpty(str)) {
                            c024209q.A03(C0LK.A98, str);
                            String A01 = C0LB.A01(A022);
                            if (!TextUtils.isEmpty(A01)) {
                                c024209q.A03(C0LK.A9A, A01);
                            } else {
                                File file2 = new File(this.A02.A06, "report_source");
                                c024209q.A04(C0LP.A0F, C0M6.CRITICAL_REPORT, new File(file2, "report_source_ref.txt"));
                            }
                        }
                        String str2 = (String) A022.get("fb.testing.build_target");
                        if (!TextUtils.isEmpty(str2)) {
                            c024209q.A03(C0LK.A7I, str2);
                        }
                        String str3 = (String) A022.get("ig.ig_server_rev_hash");
                        if (!TextUtils.isEmpty(str3)) {
                            c024209q.A03(C0LK.A62, str3);
                        }
                        String A03 = AbstractC02650Ap.A03("fb.fury_stacktraces_filename");
                        if (!TextUtils.isEmpty(A03)) {
                            File filesDir = this.A00.getFilesDir();
                            c024209q.A04(C0LP.A0A, C0M6.CRITICAL_REPORT, new File(filesDir, A03));
                        }
                        C0LW c0lw = this.A01;
                        c0lw.A09(c024209q, C0M6.CRITICAL_REPORT, this);
                        c0lw.A09(c024209q, C0M6.LARGE_REPORT, this);
                    }

                    @Override // X.C0OO
                    public final C0OP BW2() {
                        return C0OP.A0S;
                    }

                    {
                        this.A00 = application5;
                        this.A02 = A053;
                        this.A01 = A04;
                    }

                    @Override // X.C0OO
                    public final /* synthetic */ int BDP() {
                        return 100000;
                    }
                };
            case 18:
                final Application application6 = c0nk.A0J;
                return new C0LR(application6) { // from class: X.05g
                    public final Context A00;

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A1D;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:39:0x017b, code lost:
                    
                        if (r6 != null) goto L43;
                     */
                    @Override // X.C0LR
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void E4h(X.C024209q r26, X.C0M6 r27) {
                        /*
                            Method dump skipped, instructions count: 448
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C014005g.E4h(X.09q, X.0M6):void");
                    }

                    {
                        this.A00 = application6;
                    }
                };
            case Process.SIGSTOP /* 19 */:
                final Application application7 = c0nk.A0J;
                return new C0LR(application7, c0nk, this) { // from class: X.0hV
                    public final Context A00;
                    public final /* synthetic */ C0NK A01;
                    public final /* synthetic */ C15300pk A02;

                    {
                        this.A02 = this;
                        this.A01 = c0nk;
                        this.A00 = application7;
                    }

                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A07;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num2) {
                        return false;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e8, code lost:
                    
                        if (r1.contains("/system/framework/core.jar") != false) goto L7;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
                    /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
                    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                    @Override // X.C0LR
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void E4h(X.C024209q r5, X.C0M6 r6) {
                        /*
                            r4 = this;
                            X.0hu r1 = X.C0LK.A5M
                            X.0NK r0 = r4.A01
                            X.0cm r0 = r0.A0R
                            java.lang.Object r0 = r0.get()
                            java.lang.String r0 = (java.lang.String) r0
                            r5.A03(r1, r0)
                            X.0hu r1 = X.C0LK.A5O
                            java.lang.String r0 = android.os.Build.MODEL
                            r5.A03(r1, r0)
                            X.0hu r1 = X.C0LK.A5P
                            java.lang.String r0 = android.os.Build.DEVICE
                            r5.A03(r1, r0)
                            X.0hu r1 = X.C0LK.A5K
                            java.lang.String r0 = android.os.Build.BRAND
                            r5.A03(r1, r0)
                            X.0hu r1 = X.C0LK.A5R
                            java.lang.String r0 = android.os.Build.VERSION.RELEASE
                            r5.A03(r1, r0)
                            X.0hu r1 = X.C0LK.A5Q
                            java.lang.String r0 = "Android"
                            r5.A03(r1, r0)
                            X.0hu r3 = X.C0LK.A3i
                            java.lang.String r2 = "DALVIK"
                            java.lang.String r0 = "java.boot.class.path"
                            java.lang.String r1 = java.lang.System.getProperty(r0)
                            if (r1 == 0) goto Lec
                            java.lang.String r0 = "/apex/com.android.art/javalib/core-libart.jar"
                            boolean r0 = r1.contains(r0)
                            if (r0 == 0) goto Ld6
                            java.lang.String r2 = "ART_APEX"
                        L49:
                            r5.A03(r3, r2)
                            X.0hu r1 = X.C0LK.A3j
                            java.lang.String r0 = android.os.Build.VERSION.RELEASE
                            r5.A03(r1, r0)
                            X.0hu r3 = X.C0LK.A9T
                            X.0Jd r0 = new X.0Jd
                            r0.<init>()
                            java.lang.String r2 = r0.A00
                            java.lang.String r1 = ":"
                            java.lang.String r0 = r0.A01
                            java.lang.String r0 = X.AnonymousClass001.A0g(r2, r1, r0)
                            r5.A03(r3, r0)
                            X.0hw r2 = X.C0LK.A08
                            java.lang.String r1 = "/apex/com.android.art/lib64/libart.so"
                            java.io.File r0 = new java.io.File
                            r0.<init>(r1)
                            boolean r0 = r0.exists()
                            if (r0 != 0) goto L90
                            java.lang.String r1 = "/apex/com.android.art/lib/libart.so"
                            java.io.File r0 = new java.io.File
                            r0.<init>(r1)
                            boolean r0 = r0.exists()
                            if (r0 != 0) goto Ld4
                            java.lang.String r1 = "/system/lib64/libc.so"
                            java.io.File r0 = new java.io.File
                            r0.<init>(r1)
                            boolean r0 = r0.exists()
                            if (r0 == 0) goto Ld4
                        L90:
                            r0 = 1
                        L91:
                            r5.A00(r2, r0)
                            X.0hu r1 = X.C0LK.A3h
                            java.lang.String r0 = "os.version"
                            java.lang.String r0 = java.lang.System.getProperty(r0)
                            r5.A03(r1, r0)
                            int r1 = android.os.Build.VERSION.SDK_INT
                            r0 = 30
                            if (r1 < r0) goto Lb9
                            org.json.JSONObject r2 = X.C0M8.A00()
                            int r0 = r2.length()
                            if (r0 <= 0) goto Lb9
                            X.0hu r1 = X.C0LK.A9M
                            java.lang.String r0 = r2.toString()
                            r5.A03(r1, r0)
                        Lb9:
                            X.0hu r1 = X.C0LK.A9N
                            java.lang.String r0 = android.os.Build.VERSION.SECURITY_PATCH
                            r5.A03(r1, r0)
                            android.content.Context r0 = r4.A00
                            android.content.pm.PackageManager r2 = r0.getPackageManager()
                            if (r2 == 0) goto Ld3
                            X.0hw r1 = X.C0LK.A06
                            java.lang.String r0 = "android.hardware.ram.low"
                            boolean r0 = r2.hasSystemFeature(r0)
                            r5.A00(r1, r0)
                        Ld3:
                            return
                        Ld4:
                            r0 = 0
                            goto L91
                        Ld6:
                            java.lang.String r0 = "/system/framework/core-libart.jar"
                            boolean r0 = r1.contains(r0)
                            if (r0 == 0) goto Le2
                            java.lang.String r2 = "ART"
                            goto L49
                        Le2:
                            java.lang.String r0 = "/system/framework/core.jar"
                            boolean r0 = r1.contains(r0)
                            if (r0 == 0) goto Lec
                            goto L49
                        Lec:
                            java.lang.String r2 = "UNKNOWN"
                            goto L49
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C10610hV.E4h(X.09q, X.0M6):void");
                    }
                };
            case 20:
                synchronized (C0L8.class) {
                    c0Wg = C0L8.A00;
                }
                if (c0Wg == null) {
                    C0Wg c0Wg2 = new C0Wg(c0nk, this);
                    synchronized (C0L8.class) {
                        C0L8.A00 = c0Wg2;
                    }
                }
                final C0Pe A054 = c0nk.A05();
                final C0LW A042 = c0nk.A04();
                return new C0OO(A042, A054) { // from class: X.09O
                    public final C0LW A00;
                    public final C0Pe A01;

                    @Override // X.C0OO
                    public final /* synthetic */ C0Z0 BNJ() {
                        return null;
                    }

                    @Override // X.C0OO
                    public final void start() {
                        C024209q c024209q = new C024209q(null);
                        c024209q.A03(C0LK.A4V, this.A01.A08);
                        C0LW c0lw = this.A00;
                        c0lw.A09(c024209q, C0M6.CRITICAL_REPORT, this);
                        c0lw.A09(c024209q, C0M6.LARGE_REPORT, this);
                    }

                    @Override // X.C0OO
                    public final C0OP BW2() {
                        return C0OP.A0U;
                    }

                    {
                        this.A01 = A054;
                        this.A00 = A042;
                    }

                    @Override // X.C0OO
                    public final /* synthetic */ int BDP() {
                        return 100000;
                    }
                };
            case 21:
                final C0Pe A055 = c0nk.A05();
                final C0LW A043 = c0nk.A04();
                return new C0OO(A043, A055) { // from class: X.076
                    public final C0LW A00;
                    public final C0Pe A01;

                    @Override // X.C0OO
                    public final /* synthetic */ C0Z0 BNJ() {
                        return null;
                    }

                    @Override // X.C0OO
                    public final void start() {
                        C024209q c024209q = new C024209q(null);
                        c024209q.A03(C0LK.A4V, this.A01.A08);
                        C0LW c0lw = this.A00;
                        C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                        c0lw.A0E(c0m6, this);
                        c0lw.A08(c024209q, c0m6, this);
                        c0lw.A0D(c0m6, this);
                        C0M6 c0m62 = C0M6.LARGE_REPORT;
                        c0lw.A0E(c0m62, this);
                        c0lw.A08(c024209q, c0m62, this);
                        c0lw.A0D(c0m62, this);
                    }

                    @Override // X.C0OO
                    public final C0OP BW2() {
                        return C0OP.A0J;
                    }

                    {
                        this.A01 = A055;
                        this.A00 = A043;
                    }

                    @Override // X.C0OO
                    public final /* synthetic */ int BDP() {
                        return 100000;
                    }
                };
            case 22:
                final C0LW A044 = c0nk.A04();
                return new C0OO(A044) { // from class: X.0Lm
                    public final C0LW A00;

                    @Override // X.C0OO
                    public final /* synthetic */ C0Z0 BNJ() {
                        return null;
                    }

                    @Override // X.C0OO
                    public final void start() {
                        C024209q c024209q = new C024209q(null);
                        C0LW c0lw = this.A00;
                        C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                        c0lw.A0E(c0m6, this);
                        c0lw.A08(c024209q, c0m6, this);
                        c0lw.A0D(c0m6, this);
                        C0M6 c0m62 = C0M6.LARGE_REPORT;
                        c0lw.A0E(c0m62, this);
                        c0lw.A08(c024209q, c0m62, this);
                        c0lw.A0D(c0m62, this);
                    }

                    @Override // X.C0OO
                    public final C0OP BW2() {
                        return C0OP.A03;
                    }

                    {
                        this.A00 = A044;
                    }

                    @Override // X.C0OO
                    public final /* synthetic */ int BDP() {
                        return 100000;
                    }
                };
            case 23:
                return new AnonymousClass091(c0nk.A04(), C0L6.A04);
            case 24:
                final C0LW A045 = c0nk.A04();
                return new C0OO(A045) { // from class: X.08d
                    public final C0LW A00;

                    @Override // X.C0OO
                    public final /* synthetic */ C0Z0 BNJ() {
                        return null;
                    }

                    @Override // X.C0OO
                    public final C0OP BW2() {
                        return C0OP.A0Z;
                    }

                    @Override // X.C0OO
                    public final void start() {
                        C022008r c022008r = new C022008r(this);
                        C0AN.A01.add(c022008r);
                        java.util.Set set = C0AN.A00;
                        synchronized (set) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                it.next();
                                C020708d c020708d = c022008r.A00;
                                C024209q c024209q = new C024209q(null);
                                try {
                                    Iterator it2 = Collections.unmodifiableSet(new HashSet(set)).iterator();
                                    if (it2.hasNext()) {
                                        it2.next();
                                        throw new NullPointerException("getScopeName");
                                    }
                                    c024209q.A03(C0LK.AA1, AnonymousClass001.A0R("[", "]").replace(",]", "]"));
                                    C0LW c0lw = c020708d.A00;
                                    c0lw.A09(c024209q, C0M6.CRITICAL_REPORT, c020708d);
                                    c0lw.A09(c024209q, C0M6.LARGE_REPORT, c020708d);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }

                    {
                        this.A00 = A045;
                    }

                    @Override // X.C0OO
                    public final /* synthetic */ int BDP() {
                        return 100000;
                    }
                };
            case 25:
                return new C07280a2(c0nk.A04(), c0nk.A05());
            case 26:
                return new C04990Oa(c0nk.A05());
            case 27:
                Application application8 = c0nk.A0J;
                ?? obj8 = new Object();
                obj8.A00 = application8;
                return obj8;
            case 31:
                final C0LW A046 = c0nk.A04();
                return new C0OO(A046) { // from class: X.0GX
                    public final C0LW A00;

                    @Override // X.C0OO
                    public final /* synthetic */ C0Z0 BNJ() {
                        return null;
                    }

                    @Override // X.C0OO
                    public final C0OP BW2() {
                        return C0OP.A0Y;
                    }

                    @Override // X.C0OO
                    public final void start() {
                        AbstractC023209g.A00 = this;
                    }

                    {
                        this.A00 = A046;
                    }

                    @Override // X.C0OO
                    public final /* synthetic */ int BDP() {
                        return 100000;
                    }
                };
            case 33:
                return new AnonymousClass078(c0nk.A0J, C05F.A01);
            case 34:
                File A022 = c0nk.A05().A02("");
                if (A022 != null) {
                    return new AnonymousClass048(A022);
                }
                return null;
            case 35:
                return new C0ZZ(c0nk.A04());
            case 36:
                return new C02B(200);
        }
    }
}
