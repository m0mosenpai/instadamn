package com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad;

import X.C09170dP;
import X.C61K;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class BreakpadFatalJavaExceptionDescriptionHandler {
    public static final Companion Companion = new Object();

    /* loaded from: classes3.dex */
    public final class Companion {
        public final void registerBreakpadFatalJavaExceptionDescriptionHandler() {
            BreakpadFatalJavaExceptionDescriptionHandler.registerBreakpadFatalJavaExceptionDescriptionHandler();
        }

        public final Runnable breakpadHandlerRegistrationRunnable() {
            return C61K.A00;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final native void registerBreakpadFatalJavaExceptionDescriptionHandler();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad.BreakpadFatalJavaExceptionDescriptionHandler$Companion] */
    static {
        C09170dP.A0C("breakpad-fatal-java-exception-description-handler-jni");
    }

    public static final Runnable breakpadHandlerRegistrationRunnable() {
        return C61K.A00;
    }
}
