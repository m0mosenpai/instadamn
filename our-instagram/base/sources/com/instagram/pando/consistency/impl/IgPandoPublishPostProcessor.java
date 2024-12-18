package com.instagram.pando.consistency.impl;

import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.user.model.ImmutablePandoUserDict;

/* loaded from: classes.dex */
public interface IgPandoPublishPostProcessor {
    void onStart();

    void processMedia(ImmutablePandoMediaDict immutablePandoMediaDict);

    void processUser(ImmutablePandoUserDict immutablePandoUserDict);
}
