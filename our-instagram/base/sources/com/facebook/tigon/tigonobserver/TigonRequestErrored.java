package com.facebook.tigon.tigonobserver;

import com.facebook.tigon.TigonError;

/* loaded from: classes.dex */
public interface TigonRequestErrored extends TigonRequestSucceeded {
    TigonError error();
}
