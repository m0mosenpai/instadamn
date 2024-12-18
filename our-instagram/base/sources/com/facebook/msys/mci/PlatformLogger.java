package com.facebook.msys.mci;

import X.C53882dS;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PlatformLogger {
    public static native void platformEventLog(int i);

    public static native void platformEventLog(int i, int i2);

    public static native void platformEventLog(int i, int i2, Map map);

    public static native void platformEventLogNoMsys(int i, int i2);

    public static native void platformEventLogNoMsysWithInstanceId(int i, int i2, int i3);

    public static native void platformEventLogS2STraceStartPointAnnotation(String str, String str2);

    public static native void platformEventStartS2STrace(String str);

    public static native void platformEventStructuredLoggerAdd1TidTraceIdWithAliasId(String str, String str2);

    public static native void platformEventStructuredLoggerAddFirtSendAnnotationWithAliasId(String str, String str2);

    public static native void platformEventStructuredLoggerAddThreadFBIdAnnotationWithAliasId(String str, String str2);

    public static native void platformEventStructuredLoggerFBNEndS2SEvent(int i, String str, String str2);

    public static native void platformEventStructuredLoggerFBNS2SEventSendEntryPointAnnotation(String str, String str2);

    public static native void platformEventStructuredLoggerFBNS2SEventThreadTypeAnnotation(String str, String str2);

    public static native void platformEventStructuredLoggerFBNStartOpenBeagleS2SEvent(String str);

    public static native void platformEventStructuredLoggerFBNStartS2SEvent(PrivacyContext privacyContext, String str, String str2, String str3, int i, List list, Map map);

    public static native void platformEventStructuredLoggerInsertArmadilloTlcControlOpenThread(String str);

    public static native void platformEventStructuredLoggerInsertMsysApiCallBackStart(String str);

    public static native void platformEventStructuredLoggerInstamadilloAdd1TidTraceIdWithAliasId(String str, String str2);

    public static native void platformEventStructuredLoggerInstamadilloAddFailReasonAnnotationWithAliasId(String str, String str2);

    public static native void platformEventStructuredLoggerInstamadilloAddIsDisappearingModeAnnotationWithAliasId(String str, String str2, boolean z);

    public static native void platformEventStructuredLoggerInstamadilloAddIsInstamadilloAnnotationWithAliasId(String str, String str2, boolean z);

    public static native void platformEventStructuredLoggerInstamadilloAddIsVanishModeAnnotationWithAliasId(String str, String str2, boolean z);

    public static native void platformEventStructuredLoggerInstamadilloAddMessageIDWithAliasId(String str, String str2);

    public static native void platformEventStructuredLoggerInstamadilloAddMutationTypeAnnotationsWithAliasId(String str, int i, String str2);

    public static native void platformEventStructuredLoggerInstamadilloAddOpenThreadIdAnnotationWithAliasId(String str, String str2, String str3);

    public static native void platformEventStructuredLoggerInstamadilloAddThreadTypeAnnotationWithAliasId(String str, String str2);

    public static native void platformEventStructuredLoggerInstamadilloAddTransportTypeAnnotationWithAliasId(String str, String str2, String str3);

    public static native void platformEventStructuredLoggerInstamadilloStartS2SEvent(String str);

    public static native void platformEventStructuredLoggerInstamadilloStartS2SEventWithQplInstance(String str, long j);

    public static native void platformEventStructuredLoggerInstamadilloStartTraceWithAnnotations(String str, boolean z, String str2, String str3, String str4, String str5, String str6);

    public static native void platformEventStructuredLoggerS2SEventMsysApiMainContextInvoked(String str);

    public static native void platformEventStructuredLoggerThreadFBIdAnnotationWithAliasId(String str, String str2);

    public static native void platformTraceRecordMarkerEnd(int i);

    public static native void platformTraceRecordMarkerStart(int i);

    static {
        C53882dS.A00();
    }
}
