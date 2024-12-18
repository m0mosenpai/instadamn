package com.meta.foa.instagram.performancelogging.navigation;

import X.C47900LDu;
import X.InterfaceC161097Ju;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public interface IGFOAMessagingThreadViewNavigationLogger extends InterfaceC161097Ju {
    public static final C47900LDu Companion = C47900LDu.A01;

    void annotateFirstUserIsBackground(boolean z);

    void annotateIsDm(boolean z);

    void annotateIsInstamadillo(boolean z);

    void annotateIsVm(boolean z);

    void annotateMessageMatchingSuccess(boolean z);

    void annotateMissingMessageId(boolean z);

    void annotateOpenThreadId(String str);

    void annotatePushCategory(String str);

    void maybeEndFlowCancel(String str, String str2);

    void maybeEndFlowSuccess(String str);

    void onLogDirectThreadFragmentCreated();

    void onLogDirectThreadFragmentPaused();

    void onLogDirectThreadFragmentResumed();

    void onLogThreadRenderingEnd(boolean z);

    void updateExtras(UserSession userSession);
}
