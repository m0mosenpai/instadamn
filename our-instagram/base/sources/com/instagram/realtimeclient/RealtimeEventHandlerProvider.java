package com.instagram.realtimeclient;

import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public interface RealtimeEventHandlerProvider {
    RealtimeEventHandler get(UserSession userSession);
}
