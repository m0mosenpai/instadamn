package com.bloks.foa.extensions.regex;

import X.C09170dP;

/* loaded from: classes4.dex */
public final class StringRegexUtils {
    public static final StringRegexUtils INSTANCE = new Object();

    public static final native boolean matchesRegex(String str, String str2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.bloks.foa.extensions.regex.StringRegexUtils] */
    static {
        C09170dP.A0C("stringregex-jni");
    }
}
