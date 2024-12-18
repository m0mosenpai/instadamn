package com.facebook.msys.mci;

import X.AnonymousClass001;
import X.C2NJ;
import java.io.Writer;

/* loaded from: classes.dex */
public class TaskTracker {
    public static final TaskTracker TRACKER_CRYPTO;
    public static final TaskTracker TRACKER_DATABASE;
    public static final TaskTracker TRACKER_DATABASE_READ_ONLY;
    public static final TaskTracker TRACKER_MAIN;
    public static final TaskTracker TRACKER_NETWORK;
    public static final TaskTracker TRACKER_UTILITY;
    public final int mExecutionContext;
    public final String mQueueName;

    public static native long nativeGetLong(int i, int i2);

    public static native String nativeGetString(int i, int i2);

    public static native int nativeGetTaskCount(int i);

    public static void printTaskTracker(Writer writer, TaskTracker taskTracker) {
        println(writer, taskTracker.mQueueName);
        println(writer, AnonymousClass001.A0O("  TaskCount: ", nativeGetTaskCount(taskTracker.mExecutionContext)));
        println(writer, AnonymousClass001.A0R("  PreviousTaskName: ", nativeGetString(taskTracker.mExecutionContext, 0)));
        println(writer, AnonymousClass001.A0Q("  PreviousTaskStartTimeMs: ", nativeGetLong(taskTracker.mExecutionContext, 0)));
        println(writer, AnonymousClass001.A0Q("  PreviousTaskStartUpTimeMs: ", nativeGetLong(taskTracker.mExecutionContext, 6)));
        println(writer, AnonymousClass001.A0Q("  PreviousTaskRunningTimeMs: ", nativeGetLong(taskTracker.mExecutionContext, 1)));
        println(writer, AnonymousClass001.A0Q("  PreviousTaskUpRunningTimeMs: ", nativeGetLong(taskTracker.mExecutionContext, 2)));
        println(writer, AnonymousClass001.A0R("  CurrentTaskName: ", nativeGetString(taskTracker.mExecutionContext, 1)));
        println(writer, AnonymousClass001.A0Q("  CurrentTaskStartTimeMs: ", nativeGetLong(taskTracker.mExecutionContext, 3)));
        println(writer, AnonymousClass001.A0Q("  CurrentTaskStartUpTimeMs: ", nativeGetLong(taskTracker.mExecutionContext, 7)));
        println(writer, AnonymousClass001.A0Q("  CurrentTaskRunningTimeMs: ", nativeGetLong(taskTracker.mExecutionContext, 4)));
        println(writer, AnonymousClass001.A0Q("  CurrentTaskUpRunningTimeMs: ", nativeGetLong(taskTracker.mExecutionContext, 5)));
        println(writer, "");
    }

    public static void println(Writer writer, String str) {
        writer.write(AnonymousClass001.A0R(str, "\n"));
    }

    static {
        C2NJ.A00();
        TRACKER_MAIN = new TaskTracker(1, "Main");
        TRACKER_DATABASE = new TaskTracker(2, "Database");
        TRACKER_NETWORK = new TaskTracker(3, "Network");
        TRACKER_UTILITY = new TaskTracker(4, "Utility");
        TRACKER_CRYPTO = new TaskTracker(5, "Crypto");
        TRACKER_DATABASE_READ_ONLY = new TaskTracker(6, "DatabaseReadOnly");
    }

    public TaskTracker(int i, String str) {
        this.mExecutionContext = i;
        this.mQueueName = str;
    }
}
