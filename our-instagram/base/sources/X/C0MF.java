package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: X.0MF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MF {
    public final char A00;
    public final char A01;
    public final char A02;
    public final char A03;
    public final char A04;
    public final boolean A05;
    public final boolean A06;
    public final File A07;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (r4.A0H().contains(X.C0AI.A01.getClass().getSimpleName()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0MF A00(X.C0Pe r15, boolean r16) {
        /*
            r14 = 0
            if (r15 == 0) goto La1
            java.lang.String r0 = r15.A07
            java.io.File r9 = r15.A02(r0)
            if (r9 == 0) goto La1
            java.lang.String r1 = "state.txt"
            java.io.File r0 = new java.io.File
            r0.<init>(r9, r1)
            X.0ME r4 = new X.0ME
            r4.<init>(r0)
            java.lang.String r0 = "native_state.txt"
            java.io.File r3 = new java.io.File
            r3.<init>(r9, r0)
            java.lang.String r0 = "anr_state.txt"
            java.io.File r2 = new java.io.File
            r2.<init>(r9, r0)
            char r8 = r4.A06()
            char r7 = X.C0MB.A00(r3)
            char r6 = X.C0MB.A00(r2)
            char r13 = r4.A05()
            boolean r5 = X.C0MG.A01(r13)
            java.lang.Integer r0 = X.C05F.A01
            boolean r0 = X.C0MG.A02(r0, r8)
            if (r0 != 0) goto L97
            java.lang.Integer r1 = X.C05F.A0N
            boolean r0 = X.C0MG.A02(r1, r8)
            if (r0 != 0) goto L97
            java.lang.Integer r0 = X.C05F.A0C
            boolean r0 = X.C0MG.A02(r0, r7)
            if (r0 != 0) goto L97
            boolean r0 = X.C0MG.A02(r1, r6)
            if (r0 != 0) goto L97
            r0 = 102(0x66, float:1.43E-43)
            if (r13 != r0) goto L97
            java.lang.String r1 = r4.A0H()
            java.lang.Object r0 = X.C0AI.A01
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L97
        L71:
            if (r16 == 0) goto L85
            if (r14 != 0) goto L85
            int r1 = r4.A08()
            X.0Me r0 = X.C04620Me.A03
            if (r0 == 0) goto L99
            int r0 = r0.A01()
            boolean r14 = X.C0MM.A00(r1, r0)
        L85:
            char r10 = r4.A06()
            char r11 = X.C0MB.A00(r3)
            char r12 = X.C0MB.A00(r2)
            X.0MF r8 = new X.0MF
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L97:
            r14 = r5
            goto L71
        L99:
            java.lang.String r1 = "Did you call PreviousSessionHelper.init?"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        La1:
            X.0MF r8 = new X.0MF
            r8.<init>()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MF.A00(X.0Pe, boolean):X.0MF");
    }

    public final boolean A04() {
        char c = this.A03;
        if (!C0MG.A02(C05F.A01, c)) {
            Integer num = C05F.A0N;
            if (C0MG.A02(num, c)) {
                return false;
            }
            return (C0MG.A02(C05F.A0C, this.A04) || C0MG.A02(num, this.A00)) ? false : true;
        }
        return false;
    }

    public static String A01(C0Pe c0Pe, Long l) {
        String str;
        if (c0Pe == null) {
            return "sm_null";
        }
        if (c0Pe.A02(c0Pe.A07) != null) {
            C0MF A00 = A00(c0Pe, false);
            if (A00.A06) {
                if (l != null) {
                    long longValue = l.longValue();
                    if (longValue >= 0 && longValue <= 1) {
                        if (A00.A05) {
                            str = "fg_";
                        } else {
                            str = "bg_";
                        }
                        return AnonymousClass001.A0R(str, "battery_death");
                    }
                }
                return A00.A02();
            }
        }
        return "psd_null";
    }

    public final String A02() {
        StringBuilder sb;
        String str;
        File file = this.A07;
        if (file != null && this.A06) {
            char c = this.A01;
            String str2 = "fg_";
            if (C0MG.A02(C05F.A01, c)) {
                File file2 = new File(file, "critical_suppl_java_detect_prop.txt");
                if (file2.exists()) {
                    Properties properties = new Properties();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        try {
                            properties.load(fileInputStream);
                            String property = properties.getProperty("java_cause");
                            if (property != null && property.contains("OutOfMemoryError")) {
                                String str3 = "bg_";
                                if (this.A05) {
                                    str3 = "fg_";
                                }
                                String A0R = AnonymousClass001.A0R(str3, "oom");
                                fileInputStream.close();
                                return A0R;
                            }
                            fileInputStream.close();
                        } finally {
                        }
                    } catch (IOException e) {
                        C0PC.A00().DEh("PrevSessAppDeathFromDir", e, null);
                    }
                }
                sb = new StringBuilder();
                if (!this.A05) {
                    str2 = "bg_";
                }
                sb.append(str2);
                str = "java";
            } else if (A03()) {
                sb = new StringBuilder();
                if (!this.A05) {
                    str2 = "bg_";
                }
                sb.append(str2);
                str = "anr";
            } else if (C0MG.A02(C05F.A0C, c)) {
                sb = new StringBuilder();
                if (!this.A05) {
                    str2 = "bg_";
                }
                sb.append(str2);
                str = "native";
            } else if (A04()) {
                sb = new StringBuilder();
                if (!this.A05) {
                    str2 = "bg_";
                }
                sb.append(str2);
                str = "unexplained";
            } else {
                sb = new StringBuilder();
                sb.append(this.A03);
                sb.append("_");
                sb.append(this.A04);
                sb.append("_");
                sb.append(this.A00);
                str = "_null";
            }
            sb.append(str);
            return sb.toString();
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (X.C0MG.A02(X.C05F.A0C, r3.A04) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            r3 = this;
            char r0 = r3.A03
            java.lang.Integer r2 = X.C05F.A0N
            boolean r0 = X.C0MG.A02(r2, r0)
            if (r0 == 0) goto L14
            char r1 = r3.A04
            java.lang.Integer r0 = X.C05F.A0C
            boolean r0 = X.C0MG.A02(r0, r1)
            if (r0 == 0) goto L1d
        L14:
            char r0 = r3.A00
            boolean r1 = X.C0MG.A02(r2, r0)
            r0 = 0
            if (r1 == 0) goto L1e
        L1d:
            r0 = 1
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MF.A03():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r4 == 'j') goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r5 == 'Q') goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        if (r6 != 'i') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4 == 'j') goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0MF(java.io.File r3, char r4, char r5, char r6, char r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.A06 = r0
            r2.A07 = r3
            r2.A03 = r4
            r2.A04 = r5
            r2.A00 = r6
            r0 = 48
            r1 = 48
            if (r5 == r0) goto L4c
            r0 = 105(0x69, float:1.47E-43)
            if (r5 == r0) goto L4c
            r0 = 57
            if (r5 != r0) goto L27
            r0 = 106(0x6a, float:1.49E-43)
            if (r4 != r0) goto L27
        L20:
            r2.A01 = r4
            r2.A02 = r7
            r2.A05 = r8
            return
        L27:
            r0 = 82
            if (r4 == r0) goto L47
            r0 = 85
            if (r4 == r0) goto L47
            r0 = 114(0x72, float:1.6E-43)
            if (r4 == r0) goto L47
            r0 = 99
            if (r4 == r0) goto L47
            r0 = 117(0x75, float:1.64E-43)
            if (r4 == r0) goto L47
            r0 = 113(0x71, float:1.58E-43)
            if (r4 == r0) goto L47
            r0 = 109(0x6d, float:1.53E-43)
            if (r4 == r0) goto L47
            r0 = 106(0x6a, float:1.49E-43)
            if (r4 != r0) goto L53
        L47:
            r0 = 81
            if (r5 != r0) goto L53
            goto L20
        L4c:
            r5 = r6
            if (r6 == r1) goto L20
            r0 = 105(0x69, float:1.47E-43)
            if (r6 == r0) goto L20
        L53:
            r4 = r5
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MF.<init>(java.io.File, char, char, char, char, boolean):void");
    }

    public C0MF() {
        this.A06 = false;
        this.A07 = null;
        this.A03 = (char) 0;
        this.A04 = (char) 0;
        this.A00 = (char) 0;
        this.A01 = (char) 0;
        this.A02 = (char) 0;
        this.A05 = false;
    }
}
