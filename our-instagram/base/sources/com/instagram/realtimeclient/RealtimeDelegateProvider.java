package com.instagram.realtimeclient;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.MainRealtimeEventHandler;

/* loaded from: classes.dex */
public interface RealtimeDelegateProvider {
    MainRealtimeEventHandler.Delegate get(UserSession userSession);
}
