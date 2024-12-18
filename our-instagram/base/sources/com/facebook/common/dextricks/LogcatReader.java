package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class LogcatReader {
    public static final int DEFAULT_WAIT_TIME = 10000;
    public static final int GROUP_IDX_PID = 4;
    public static final int GROUP_IDX_TAG = 5;
    public static final int GROUP_IDX_TIMESTAMP = 1;
    public static final int GROUP_IDX_YEAR = 3;
    public static final Pattern LOGCAT_INFO_PARSER = Pattern.compile("^(((\\d{4})-)?\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3})\\s+(\\d+)\\s+\\d+\\s\\w\\s(\\w+)\\s:.*");
    public static final boolean MUST_PARSE_PID = false;
    public static final String TAG = "LogcatReader";
    public final String mTag;
    public final File mTmpDir;

    public static boolean shouldProcess(int i, String str, String str2) {
        if (str2 != null) {
            if (!MUST_PARSE_PID) {
                return true;
            }
            Matcher matcher = LOGCAT_INFO_PARSER.matcher(str2);
            if (matcher != null && matcher.matches()) {
                String group = matcher.group(4);
                if (matcher.group(5).equals(str)) {
                    try {
                        if (Integer.parseInt(group) == i) {
                            return true;
                        }
                    } catch (NumberFormatException e) {
                        Log.w(TAG, String.format("Could not process line since %s is not a number", group), e);
                        return false;
                    }
                }
            } else {
                String.format("Logcat line is not in the expected form. Line: %s", str2);
            }
        }
        return false;
    }

    public abstract void processLine(String str);

    public abstract void reset();

    public final boolean readAndParseProcess(int i) {
        return readAndParseProcess(i, 10000);
    }

    public LogcatReader(String str, File file) {
        this.mTag = str;
        this.mTmpDir = file;
    }

    private boolean readAndParseProcessFile(int i, RandomAccessFile randomAccessFile) {
        String readProgramOutputFile = Fs.readProgramOutputFile(randomAccessFile);
        boolean z = false;
        if (readProgramOutputFile == null) {
            Log.w(TAG, "Cannot find logcat file to parse");
            return false;
        }
        BufferedReader bufferedReader = new BufferedReader(new StringReader(readProgramOutputFile));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (shouldProcess(i, this.mTag, readLine)) {
                    processLine(readLine);
                }
                z = true;
            } finally {
                bufferedReader.close();
            }
        }
        if (!z) {
            Log.w(TAG, AnonymousClass001.A0R("Could not read out any logs. \n Read: ", readProgramOutputFile));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean readAndParseProcess(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.LogcatReader.readAndParseProcess(int, int):boolean");
    }
}
