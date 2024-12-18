package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0eS;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.common.build.BuildConstants;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class OptSvcAnalyticsStore {
    public static final int CURRENT_SCHEMA_VERSION = 2;
    public static final String DEX2OAT_LOGGING_KEY_PREFIX = "dex2oat_stat";
    public static final String EVENT_DIR_NAME = "optsvc_analytics";
    public static final String FILE_SUFFIX = ".txt";
    public static final String LOGGING_KEY_APP_VERSION = "app_version";
    public static final String LOGGING_KEY_ATTEMPT_NUMBER = "attempt_number";
    public static final String LOGGING_KEY_CLIENT_TIME = "client_time";
    public static final String LOGGING_KEY_DETAIL_MSG = "detail_msg";
    public static final String LOGGING_KEY_DEX2OAT_FAILURE = "failure";
    public static final String LOGGING_KEY_DEX2OAT_PERCENT = "percent_success";
    public static final String LOGGING_KEY_DEX2OAT_SUCCESS = "success";
    public static final String LOGGING_KEY_DEX2OAT_TOTAL_CASES = "total_cases";
    public static final String LOGGING_KEY_DURATION = "duration";
    public static final String LOGGING_KEY_EVENT_NAME = "event_name";
    public static final String LOGGING_KEY_EXIT_CODE = "exit_code";
    public static final String LOGGING_KEY_JOB_NAME = "job_name";
    public static final String LOGGING_KEY_STEP = "step";
    public static final String TAG = "OptSvcAnalytics";
    public static final int UNKNOWN_SCHEMA_VERSION = -1;

    /* loaded from: classes.dex */
    public interface EventConsumer {
        void consume(String str, Map map);
    }

    public static boolean readEventFileFully(File file, Map map) {
        InputStreamReader inputStreamReader;
        FileInputStream fileInputStream;
        BufferedReader bufferedReader = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream, Charset.forName(ReactWebViewManager.HTML_ENCODING));
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine != null) {
                                    String readLine2 = bufferedReader2.readLine();
                                    if (readLine2 != null) {
                                        map.put(readLine, readLine2);
                                    } else {
                                        try {
                                            bufferedReader2.close();
                                            break;
                                        } catch (IOException unused) {
                                            closeIt(inputStreamReader);
                                            closeIt(fileInputStream);
                                            return false;
                                        }
                                    }
                                } else {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                    try {
                                        inputStreamReader.close();
                                    } catch (IOException unused3) {
                                    }
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException unused4) {
                                    }
                                    if (map.containsKey("event_name") && !TextUtils.isEmpty((CharSequence) map.get("event_name"))) {
                                        return true;
                                    }
                                }
                            } catch (Exception e) {
                                e = e;
                                bufferedReader = bufferedReader2;
                                Log.w(TAG, "Failed to read event", e);
                                closeIt(bufferedReader);
                                closeIt(inputStreamReader);
                                closeIt(fileInputStream);
                                return false;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                closeIt(bufferedReader);
                                closeIt(inputStreamReader);
                                closeIt(fileInputStream);
                                throw th;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    inputStreamReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e4) {
            e = e4;
            inputStreamReader = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            inputStreamReader = null;
            fileInputStream = null;
        }
    }

    public static void closeIt(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        if (isFileOldEnoughToDelete(r2) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void consumeEvents(android.content.Context r10, boolean r11, int r12, com.facebook.common.dextricks.OptSvcAnalyticsStore.EventConsumer r13) {
        /*
            java.lang.Class<com.facebook.common.dextricks.OptSvcAnalyticsStore> r9 = com.facebook.common.dextricks.OptSvcAnalyticsStore.class
            monitor-enter(r9)
            if (r10 == 0) goto L79
            r0 = 345253467(0x1494265b, float:1.495931E-26)
            java.io.File r0 = X.C0eS.A00(r10, r0)     // Catch: java.lang.Throwable -> L76
            r0.mkdirs()     // Catch: java.lang.Throwable -> L76
            java.io.File[] r8 = r0.listFiles()     // Catch: java.lang.Throwable -> L76
            if (r8 == 0) goto L79
            int r7 = r8.length     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L79
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L76
            r6.<init>()     // Catch: java.lang.Throwable -> L76
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L76
            r5.<init>()     // Catch: java.lang.Throwable -> L76
            r4 = 0
            r3 = 0
        L24:
            r2 = r8[r4]     // Catch: java.lang.Throwable -> L76
            if (r11 == 0) goto L55
            java.lang.String r1 = r2.getName()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = ".txt"
            boolean r0 = r1.endsWith(r0)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L55
            int r1 = getSchemaVersionFromFile(r2)     // Catch: java.lang.Throwable -> L76
            r0 = 2
            if (r1 != r0) goto L5b
            if (r3 >= r12) goto L5b
            r6.clear()     // Catch: java.lang.Throwable -> L76
            boolean r0 = readEventFileFully(r2, r6)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L5b
            java.lang.String r0 = "event_name"
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L76
            r13.consume(r0, r6)     // Catch: java.lang.Throwable -> L76
            int r3 = r3 + 1
            goto L5b
        L55:
            boolean r0 = isFileOldEnoughToDelete(r2)     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L5e
        L5b:
            r5.add(r2)     // Catch: java.lang.Throwable -> L76
        L5e:
            int r4 = r4 + 1
            if (r4 < r7) goto L24
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L76
        L66:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L76
            if (r0 == 0) goto L79
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L76
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L76
            r0.delete()     // Catch: java.lang.Throwable -> L76
            goto L66
        L76:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L79:
            monitor-exit(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.OptSvcAnalyticsStore.consumeEvents(android.content.Context, boolean, int, com.facebook.common.dextricks.OptSvcAnalyticsStore$EventConsumer):void");
    }

    public static String escape(String str) {
        return str.replace("\\", "\\\\").replace("\n", "\\n");
    }

    public static String escapeObjectCoalesceNull(Object obj) {
        if (obj == null) {
            return "";
        }
        return escape(obj.toString());
    }

    public static String getNewFileName() {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        sb.append(".");
        sb.append(2);
        sb.append(FILE_SUFFIX);
        return sb.toString();
    }

    public static void logEvent(Context context, String str, Map map) {
        if (context != null && str != null && map != null && !map.isEmpty()) {
            File A00 = C0eS.A00(context, SC.android_optsvc_analytics);
            A00.mkdirs();
            captureCommonKeyValues(map);
            String newFileName = getNewFileName();
            File file = new File(A00, newFileName);
            File file2 = new File(A00, AnonymousClass001.A0R(newFileName, ".tmp"));
            StringBuilder sb = new StringBuilder("event_name");
            sb.append("\n");
            sb.append(str);
            sb.append("\n");
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                if (str2 != null) {
                    String escape = escape(str2);
                    String escapeObjectCoalesceNull = escapeObjectCoalesceNull(entry.getValue());
                    sb.append(escape);
                    sb.append("\n");
                    sb.append(escapeObjectCoalesceNull);
                    sb.append("\n");
                }
            }
            try {
                writeUTF8BytesToFile(sb.toString(), file2);
            } catch (IOException e) {
                Log.w(TAG, "Failed to log event", e);
            }
            file2.renameTo(file);
        }
    }

    public static String unescape(String str) {
        return str.replace("\\n", "\n").replace("\\\\", "\\");
    }

    public static void writeUTF8BytesToFile(String str, File file) {
        byte[] bytes = str.getBytes(Charset.forName(ReactWebViewManager.HTML_ENCODING));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bytes, 0, bytes.length);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static void captureCommonKeyValues(Map map) {
        map.put(LOGGING_KEY_APP_VERSION, Integer.valueOf(BuildConstants.A01()));
        map.put(LOGGING_KEY_CLIENT_TIME, Long.valueOf(System.currentTimeMillis()));
    }

    public static int getSchemaVersionFromFile(File file) {
        int indexOf;
        String name = file.getName();
        int length = name.length();
        int i = -1;
        if (length < 6 || (indexOf = name.indexOf(46)) < 0) {
            return -1;
        }
        try {
            i = Integer.parseInt(name.substring(indexOf + 1, length - 4));
            return i;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static File getStorageDir(Context context) {
        File A00 = C0eS.A00(context, SC.android_optsvc_analytics);
        A00.mkdirs();
        return A00;
    }

    public static boolean isFileOldEnoughToDelete(File file) {
        if (System.currentTimeMillis() - file.lastModified() <= TimeUnit.DAYS.toMillis(1L)) {
            return false;
        }
        return true;
    }
}
