package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.0ME, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ME {
    public final File A00;

    public static synchronized C0MC A00(C0ME c0me, String str, long j) {
        C0MC c0mc;
        synchronized (c0me) {
            if (j >= 0) {
                File file = c0me.A00;
                if (!file.exists() || file.length() <= j) {
                    return null;
                }
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        randomAccessFile.seek(j);
                        if (randomAccessFile.readByte() == 1) {
                            c0mc = new C0MC(-425L);
                        } else {
                            long readLong = randomAccessFile.readLong();
                            if (readLong < 0) {
                                c0mc = new C0MC(-869L);
                            } else {
                                long readLong2 = randomAccessFile.readLong();
                                if (readLong2 < 0) {
                                    c0mc = new C0MC(-869L);
                                } else {
                                    c0mc = new C0MC(readLong, readLong2);
                                }
                            }
                        }
                        randomAccessFile.close();
                    } catch (Throwable th) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    C0PC.A00().DEh("AppStateParserRelAbs", e, null);
                    C0K8.A0M("lacrima", "Could not read %s due to IO issue", e, str);
                    c0mc = new C0MC(-536L);
                } catch (NumberFormatException e2) {
                    C0PC.A00().DEh("AppStateParserRelAbs", e2, null);
                    C0K8.A0M("lacrima", "Could not read %s", e2, str);
                    c0mc = new C0MC(-647L);
                }
                return c0mc;
            }
            throw new IllegalArgumentException();
        }
    }

    public static synchronized C0MD A01(C0ME c0me, int i, int i2) {
        String str;
        RandomAccessFile randomAccessFile;
        synchronized (c0me) {
            File file = c0me.A00;
            if (file.exists()) {
                long j = i;
                if (file.length() > j) {
                    long j2 = i2;
                    if (file.length() > j2) {
                        boolean z = false;
                        try {
                            randomAccessFile = new RandomAccessFile(file, "r");
                        } catch (IOException e) {
                            e = e;
                            str = null;
                        }
                        try {
                            randomAccessFile.seek(j);
                            boolean z2 = false;
                            if (randomAccessFile.readByte() != 0) {
                                z2 = true;
                            }
                            try {
                                randomAccessFile.seek(j2);
                                int readByte = randomAccessFile.readByte();
                                if (readByte != 0) {
                                    byte[] bArr = new byte[readByte];
                                    randomAccessFile.readFully(bArr, 0, readByte);
                                    str = new String(bArr);
                                } else {
                                    str = null;
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e2) {
                                    e = e2;
                                    z = z2;
                                    C0PC.A00().DEh("AppStateParserSuccessState", e, null);
                                    e.getMessage();
                                    z2 = z;
                                    return new C0MD(z2, str);
                                }
                                return new C0MD(z2, str);
                            } catch (Throwable th) {
                                th = th;
                                z = z2;
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            }
            return null;
        }
    }

    public final synchronized char A02() {
        char c;
        File file = this.A00;
        if (file.exists() && file.length() > 196) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(196L);
                    c = (char) randomAccessFile.readByte();
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserActivityCallbackStageSymbol", e, null);
                C0K8.A0H("lacrima", "Could not read activity callback stage", e);
            }
        }
        c = '0';
        return c;
    }

    public final synchronized char A03() {
        File file = this.A00;
        if (file.exists() && file.length() > 1777) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(1777L);
                    char readByte = (char) randomAccessFile.readByte();
                    if (readByte == 0) {
                        readByte = ' ';
                    }
                    randomAccessFile.close();
                    return readByte;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserAppInitState", e, null);
                C0K8.A0H("lacrima", "Could not read appInitState", e);
            }
        }
        return ' ';
    }

    public final synchronized char A04() {
        File file = this.A00;
        if (file.exists() && file.length() > 166) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(166L);
                    char readByte = (char) randomAccessFile.readByte();
                    randomAccessFile.close();
                    return readByte;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserColdstartMode", e, null);
                C0K8.A0H("lacrima", "Could not read cold start mode", e);
            }
        }
        return ' ';
    }

    public final synchronized char A05() {
        char c;
        File file = this.A00;
        if (file.exists() && file.length() > 1) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(1L);
                    c = (char) randomAccessFile.readByte();
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserForegroundState", e, null);
                C0K8.A0H("lacrima", "Could not read activity state", e);
            }
        }
        c = '?';
        return c;
    }

    public final synchronized char A06() {
        char c;
        File file = this.A00;
        if (file.exists() && file.length() > 0) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(0L);
                    c = (char) randomAccessFile.readByte();
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserStatus", e, null);
                C0K8.A0H("lacrima", "Could not read status", e);
            }
        }
        c = '0';
        return c;
    }

    public final synchronized int A07() {
        int i;
        RandomAccessFile randomAccessFile;
        File file = this.A00;
        if (file.exists() && file.length() > 200) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserActivityCallbackState", e, null);
                C0K8.A0H("lacrima", "Could not read activity callback state byte", e);
            }
            try {
                randomAccessFile.seek(200L);
                i = randomAccessFile.readByte() - 48;
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        i = 0;
        return i;
    }

    public final synchronized int A08() {
        int i;
        File file = this.A00;
        if (file.exists() && file.length() > 749) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(749L);
                    i = randomAccessFile.readInt();
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserAppThreadProcessState", e, null);
                C0K8.A0H("lacrima", "Could not read application thread process state", e);
            }
        }
        i = -1;
        return i;
    }

    public final synchronized int A09(boolean z) {
        byte b;
        RandomAccessFile randomAccessFile;
        int i = 204;
        if (z) {
            i = 203;
        }
        File file = this.A00;
        if (file.exists()) {
            long j = i;
            if (file.length() > j) {
                try {
                    randomAccessFile = new RandomAccessFile(file, "r");
                } catch (IOException e) {
                    C0PC.A00().DEh("AppStateParserNumActivities", e, null);
                    C0K8.A0H("lacrima", "Could not read number of activities byte", e);
                }
                try {
                    randomAccessFile.seek(j);
                    b = randomAccessFile.readByte();
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            }
        }
        b = 0;
        return b;
    }

    public final synchronized long A0A() {
        File file = this.A00;
        if (file.exists() && file.length() > 1753) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(1753L);
                    long readLong = randomAccessFile.readLong();
                    randomAccessFile.close();
                    return readLong;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserAppThreadProcessStateUpdateTime", e, null);
                C0K8.A0H("lacrima", "Could not read application thread process state update unixtime", e);
            }
        }
        return 0L;
    }

    public final synchronized long A0B() {
        File file = this.A00;
        if (file.exists() && file.length() > 1761) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(1761L);
                    long readLong = randomAccessFile.readLong();
                    randomAccessFile.close();
                    return readLong;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserAppThreadProcessStateUptime", e, null);
                C0K8.A0H("lacrima", "Could not read application thread process state update device uptime", e);
            }
        }
        return 0L;
    }

    public final synchronized long A0C() {
        long j;
        RandomAccessFile randomAccessFile;
        File file = this.A00;
        if (file.exists() && file.length() > 275) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserContentProviderDiedTime", e, null);
                C0K8.A0H("lacrima", "Could not read content provider died time", e);
            }
            try {
                randomAccessFile.seek(276L);
                j = randomAccessFile.readLong();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        j = 0;
        return j;
    }

    public final synchronized long A0D() {
        File file = this.A00;
        if (file.exists() && file.length() > 1769) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(1769L);
                    long readLong = randomAccessFile.readLong();
                    randomAccessFile.close();
                    return readLong;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserLastNavigationTime", e, null);
                C0K8.A0H("lacrima", "Could not read LastNavigationTimeMs", e);
            }
        }
        return 0L;
    }

    public final synchronized long A0E() {
        File file = this.A00;
        if (file.exists() && file.length() > 180) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(180L);
                    int readByte = randomAccessFile.readByte();
                    if (readByte == 0) {
                        randomAccessFile.close();
                    } else {
                        byte[] bArr = new byte[readByte];
                        randomAccessFile.readFully(bArr, 0, readByte);
                        long parseLong = Long.parseLong(new String(bArr));
                        randomAccessFile.close();
                        return parseLong;
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException | NumberFormatException e) {
                C0PC.A00().DEh("AppStateParserLastUpdate", e, null);
                C0K8.A0H("lacrima", "Could not read end point", e);
            }
        }
        return 0L;
    }

    public final synchronized long A0F() {
        File file = this.A00;
        if (file.exists() && file.length() > 167) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(167L);
                    int readByte = randomAccessFile.readByte();
                    if (readByte == 0) {
                        randomAccessFile.close();
                    } else {
                        byte[] bArr = new byte[readByte];
                        randomAccessFile.readFully(bArr, 0, readByte);
                        long parseLong = Long.parseLong(new String(bArr));
                        randomAccessFile.close();
                        return parseLong;
                    }
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException | NumberFormatException e) {
                C0PC.A00().DEh("AppStateParserTTFirstActivityTransition", e, null);
                C0K8.A0H("lacrima", "Could not read time to first activity transition", e);
            }
        }
        return 0L;
    }

    public final synchronized Boolean A0G() {
        boolean z;
        RandomAccessFile randomAccessFile;
        boolean z2 = true;
        File file = this.A00;
        if (file.exists() && file.length() > 205) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserScreenLocked", e, null);
                C0K8.A0H("lacrima", "Could not read lock screen byte", e);
            }
            try {
                randomAccessFile.seek(205L);
                char readByte = (char) randomAccessFile.readByte();
                if (readByte == ' ') {
                    randomAccessFile.close();
                    return null;
                }
                if (readByte != '1') {
                    z2 = false;
                }
                z = Boolean.valueOf(z2);
                randomAccessFile.close();
                return z;
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String A0H() {
        /*
            r10 = this;
            r9 = r10
            monitor-enter(r9)
            java.io.File r8 = r10.A00     // Catch: java.io.IOException -> Laf java.lang.Throwable -> Lbe
            java.lang.String r5 = r8.getCanonicalPath()     // Catch: java.io.IOException -> Laf java.lang.Throwable -> Lbe
            r4 = 32
            boolean r0 = r8.exists()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L4b
            long r6 = r8.length()     // Catch: java.lang.Throwable -> Lad
            r0 = 2
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L4b
            java.lang.String r3 = "r"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L38 java.lang.Throwable -> Lad
            r2.<init>(r8, r3)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> Lad
            r2.seek(r0)     // Catch: java.lang.Throwable -> L2e
            byte r0 = r2.readByte()     // Catch: java.lang.Throwable -> L2e
            char r6 = (char) r0     // Catch: java.lang.Throwable -> L2e
            r2.close()     // Catch: java.io.IOException -> L38 java.lang.Throwable -> Lad
            goto L4d
        L2e:
            r1 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.io.IOException -> L38 java.lang.Throwable -> Lad
        L37:
            throw r1     // Catch: java.io.IOException -> L38 java.lang.Throwable -> Lad
        L38:
            r3 = move-exception
            X.0P8 r2 = X.C0PC.A00()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "AppStateParserForegroundEntitySymbol"
            r0 = 0
            r2.DEh(r1, r3, r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not read foreground entity"
            X.C0K8.A0H(r1, r0, r3)     // Catch: java.lang.Throwable -> Lad
        L4b:
            r6 = 32
        L4d:
            java.lang.String r0 = "_entity"
            java.lang.String r0 = X.AnonymousClass001.A0R(r5, r0)     // Catch: java.lang.Throwable -> Lbe
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Lbe
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbe
            if (r6 != r4) goto L5d
            java.lang.String r5 = "NONE"
            goto La7
        L5d:
            r0 = 33
            if (r6 != r0) goto L64
            java.lang.String r5 = "OTHERS"
            goto La7
        L64:
            java.util.Properties r4 = new java.util.Properties     // Catch: java.lang.Throwable -> Lbe
            r4.<init>()     // Catch: java.lang.Throwable -> Lbe
            r5 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> La5 java.lang.Throwable -> Lbe
            r0.<init>(r1)     // Catch: java.io.IOException -> La5 java.lang.Throwable -> Lbe
            r4.load(r0)     // Catch: java.lang.Throwable -> L9b
            r0.close()     // Catch: java.io.IOException -> La5 java.lang.Throwable -> Lbe
            java.util.Set r0 = r4.stringPropertyNames()     // Catch: java.lang.Throwable -> Lbe
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> Lbe
        L7d:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto La7
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = r4.getProperty(r2)     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lbe
            if (r0 != 0) goto L7d
            r0 = 0
            char r0 = r1.charAt(r0)     // Catch: java.lang.Throwable -> Lbe
            if (r6 != r0) goto L7d
            goto La8
        L9b:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> La0
            goto La4
        La0:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.io.IOException -> La5 java.lang.Throwable -> Lbe
        La4:
            throw r1     // Catch: java.io.IOException -> La5 java.lang.Throwable -> Lbe
        La5:
            r2 = r5
            goto La8
        La7:
            r2 = r5
        La8:
            if (r2 != 0) goto Lbc
            java.lang.String r2 = ""
            goto Lbc
        Lad:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lbe
        Laf:
            r3 = move-exception
            X.0P8 r2 = X.C0PC.A00()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = "AppStateParserForegroundEntityName"
            r0 = 0
            r2.DEh(r1, r3, r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r2 = ""
        Lbc:
            monitor-exit(r9)
            return r2
        Lbe:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ME.A0H():java.lang.String");
    }

    public final synchronized String A0I() {
        String str;
        RandomAccessFile randomAccessFile;
        int i = 1000;
        File file = this.A00;
        if (file.exists() && file.length() > 753) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserAttributionID", e, null);
                C0K8.A0H("lacrima", "Could not read attribution ID", e);
            }
            try {
                randomAccessFile.seek(753L);
                short readShort = randomAccessFile.readShort();
                if (readShort == 0) {
                    str = "unknown";
                } else {
                    if (readShort <= 1000) {
                        i = readShort;
                    }
                    byte[] bArr = new byte[i];
                    randomAccessFile.readFully(bArr, 0, i);
                    str = new String(bArr);
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        str = "unknown";
        return str;
    }

    public final synchronized String A0J() {
        String str;
        RandomAccessFile randomAccessFile;
        File file = this.A00;
        if (file.exists() && file.length() > 275) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserContentProviderDiedName", e, null);
                C0K8.A0H("lacrima", "Could not read content provider died name", e);
            }
            try {
                randomAccessFile.seek(284L);
                int readByte = randomAccessFile.readByte();
                if (readByte == 0) {
                    str = "unknown";
                } else {
                    byte[] bArr = new byte[readByte];
                    randomAccessFile.readFully(bArr, 0, readByte);
                    str = new String(bArr);
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        str = "";
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #6 {all -> 0x008b, blocks: (B:23:0x0070, B:31:0x007c), top: B:22:0x0070 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String A0K() {
        /*
            r9 = this;
            r8 = r9
            monitor-enter(r8)
            java.io.File r7 = r9.A00     // Catch: java.lang.Throwable -> Lb0
            boolean r0 = r7.exists()     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L55
            long r3 = r7.length()     // Catch: java.lang.Throwable -> Lb0
            r1 = 85
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L55
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L42 java.lang.Throwable -> Lb0
            r3.<init>(r7, r0)     // Catch: java.io.IOException -> L42 java.lang.Throwable -> Lb0
            r3.seek(r1)     // Catch: java.lang.Throwable -> L38
            byte r2 = r3.readByte()     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L29
            java.lang.String r4 = "unknown"
            goto L34
        L29:
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L38
            r0 = 0
            r3.readFully(r1, r0, r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L38
        L34:
            r3.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> Lb0
            goto L58
        L38:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.io.IOException -> L42 java.lang.Throwable -> Lb0
        L41:
            throw r1     // Catch: java.io.IOException -> L42 java.lang.Throwable -> Lb0
        L42:
            r3 = move-exception
            X.0P8 r2 = X.C0PC.A00()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "AppStateParserEndpoint"
            r0 = 0
            r2.DEh(r1, r3, r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not read end point"
            X.C0K8.A0H(r1, r0, r3)     // Catch: java.lang.Throwable -> Lb0
        L55:
            java.lang.String r4 = "unknown"
        L58:
            boolean r0 = r7.exists()     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto La8
            long r5 = r7.length()     // Catch: java.lang.Throwable -> Lb0
            r1 = 622(0x26e, double:3.073E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto La8
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb0
            r3.<init>(r7, r0)     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb0
            r3.seek(r1)     // Catch: java.lang.Throwable -> L8b
            byte r2 = r3.readByte()     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L7c
            java.lang.String r0 = ""
            goto L87
        L7c:
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> L8b
            r0 = 0
            r3.readFully(r1, r0, r2)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L8b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8b
        L87:
            r3.close()     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb0
            goto Laa
        L8b:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L90
            goto L94
        L90:
            r0 = move-exception
            X.AnonymousClass083.A00(r1, r0)     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb0
        L94:
            throw r1     // Catch: java.io.IOException -> L95 java.lang.Throwable -> Lb0
        L95:
            r3 = move-exception
            X.0P8 r2 = X.C0PC.A00()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "AppStateParserEndpoint2"
            r0 = 0
            r2.DEh(r1, r3, r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = "lacrima"
            java.lang.String r0 = "Could not read end point"
            X.C0K8.A0H(r1, r0, r3)     // Catch: java.lang.Throwable -> Lb0
        La8:
            java.lang.String r0 = ""
        Laa:
            java.lang.String r0 = X.AnonymousClass001.A0R(r4, r0)     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r8)
            return r0
        Lb0:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ME.A0K():java.lang.String");
    }

    public final synchronized String A0L() {
        File file = this.A00;
        if (file.exists() && file.length() > 1987) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(1987L);
                    int readByte = randomAccessFile.readByte() & 255;
                    if (readByte == 0) {
                        randomAccessFile.close();
                        return null;
                    }
                    byte[] bArr = new byte[readByte];
                    randomAccessFile.readFully(bArr, 0, readByte);
                    String str = new String(bArr);
                    randomAccessFile.close();
                    return str;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserIntent", e, null);
                C0K8.A0H("lacrima", "Could not read intent", e);
            }
        }
        return null;
    }

    public final synchronized String A0M() {
        String str;
        File file = this.A00;
        if (file.exists() && file.length() > 3) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(3L);
                    int readByte = randomAccessFile.readByte();
                    if (readByte == 0) {
                        str = "unknown";
                    } else {
                        byte[] bArr = new byte[readByte];
                        randomAccessFile.readFully(bArr, 0, readByte);
                        str = new String(bArr);
                    }
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserNavMod", e, null);
                C0K8.A0H("lacrima", "Could not read nav module", e);
            }
        }
        str = "unknown";
        return str;
    }

    public final synchronized String A0N() {
        String str;
        RandomAccessFile randomAccessFile;
        File file = this.A00;
        if (file.exists() && file.length() > 1778) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserEndpoint", e, null);
                C0K8.A0H("lacrima", "Could not read previous endpoint", e);
            }
            try {
                randomAccessFile.seek(1778L);
                byte readByte = randomAccessFile.readByte();
                if (readByte == 0) {
                    str = "unknown";
                } else {
                    int i = readByte & 255;
                    byte[] bArr = new byte[i];
                    randomAccessFile.readFully(bArr, 0, i);
                    str = new String(bArr);
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        }
        str = "unknown";
        return str;
    }

    public final synchronized boolean A0O() {
        File file = this.A00;
        if (file.exists() && file.length() > 198) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(198L);
                    boolean z = false;
                    if (((char) randomAccessFile.readByte()) == '1') {
                        z = true;
                    }
                    randomAccessFile.close();
                    return z;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserActivityFinishing", e, null);
                C0K8.A0H("lacrima", "Could not read activity finishing byte", e);
            }
        }
        return false;
    }

    public final synchronized boolean A0P() {
        File file = this.A00;
        if (file.exists() && file.length() > 275) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(275L);
                    boolean z = false;
                    if (((char) randomAccessFile.readByte()) == '1') {
                        z = true;
                    }
                    randomAccessFile.close();
                    return z;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserContentProviderDied", e, null);
                C0K8.A0H("lacrima", "Could not read content provider died byte", e);
            }
        }
        return false;
    }

    public final synchronized boolean A0Q() {
        File file = this.A00;
        if (file.exists() && file.length() > 178) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(178L);
                    boolean z = false;
                    if (((char) randomAccessFile.readByte()) == '1') {
                        z = true;
                    }
                    randomAccessFile.close();
                    return z;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserForeroundUntilFirstActTrans", e, null);
                C0K8.A0H("lacrima", "Could not read foreground until first activity transition", e);
            }
        }
        return false;
    }

    public final synchronized boolean A0R() {
        File file = this.A00;
        if (file.exists() && file.length() > 202) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(202L);
                    boolean z = false;
                    if (((char) randomAccessFile.readByte()) == '1') {
                        z = true;
                    }
                    randomAccessFile.close();
                    return z;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserHomeTaskSwitcher", e, null);
                C0K8.A0H("lacrima", "Could not read home task switcher pressed byte", e);
            }
        }
        return false;
    }

    public final synchronized boolean A0S() {
        File file = this.A00;
        if (file.exists() && file.length() > 1985) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(1985L);
                    boolean z = false;
                    if (((char) randomAccessFile.readByte()) == '1') {
                        z = true;
                    }
                    randomAccessFile.close();
                    return z;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserMultiWindow", e, null);
                C0K8.A0H("lacrima", "Could not read multi window mode byte", e);
            }
        }
        return false;
    }

    public final synchronized boolean A0T() {
        File file = this.A00;
        if (file.exists() && file.length() > 1986) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(1986L);
                    boolean z = false;
                    if (((char) randomAccessFile.readByte()) == '1') {
                        z = true;
                    }
                    randomAccessFile.close();
                    return z;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserPipMode", e, null);
                C0K8.A0H("lacrima", "Could not read PIP mode byte", e);
            }
        }
        return false;
    }

    public final synchronized boolean A0U() {
        File file = this.A00;
        if (file.exists() && file.length() > 206) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(206L);
                    boolean z = false;
                    if (((char) randomAccessFile.readByte()) == '1') {
                        z = true;
                    }
                    randomAccessFile.close();
                    return z;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                C0PC.A00().DEh("AppStateParserSysBinderDied", e, null);
                C0K8.A0H("lacrima", "Could not read system binder died byte", e);
            }
        }
        return false;
    }

    public C0ME(File file) {
        this.A00 = file;
    }

    public C0ME(File file, boolean z) {
        this.A00 = file;
    }
}
