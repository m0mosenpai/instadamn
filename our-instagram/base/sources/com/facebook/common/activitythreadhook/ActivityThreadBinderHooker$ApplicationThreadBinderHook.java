package com.facebook.common.activitythreadhook;

import X.C011804g;
import X.C03720In;
import X.C05390Qn;
import X.C0f9;
import com.facebook.common.binderhooker.BinderHook;

/* loaded from: classes.dex */
public class ActivityThreadBinderHooker$ApplicationThreadBinderHook extends BinderHook {
    public static final C03720In A02 = new C03720In("ApplicationThreadBinderHook");
    public final C011804g A00;
    public final C05390Qn A01;

    public ActivityThreadBinderHooker$ApplicationThreadBinderHook(C05390Qn c05390Qn) {
        int A03 = C0f9.A03(678242368);
        this.A00 = new C011804g(this);
        this.A01 = c05390Qn;
        C0f9.A0A(-239022467, A03);
    }
}
