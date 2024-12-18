package com.facebook.rtc.chatd.utils;

import X.LDC;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class JavaCppHelper {
    public native ArrayList convertPackedParamsToArrayList(McfReference mcfReference);

    static {
        LDC.A00();
    }
}
