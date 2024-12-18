package com.instagram.realtimeclient;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class SkywalkerCommand {
    public HashMap mPublishTopicToPayload;
    public List mSubscribeTopics;
    public List mUnsubscribeTopics;

    public ImmutableList getSubscribeTopics() {
        List list = this.mSubscribeTopics;
        if (list != null) {
            return ImmutableList.copyOf((Collection) list);
        }
        return null;
    }

    public ImmutableList getUnsubscribeTopics() {
        List list = this.mUnsubscribeTopics;
        if (list != null) {
            return ImmutableList.copyOf((Collection) list);
        }
        return null;
    }

    public SkywalkerCommand(List list, List list2, HashMap hashMap) {
        this.mSubscribeTopics = list;
        this.mUnsubscribeTopics = list2;
        this.mPublishTopicToPayload = hashMap;
    }

    public SkywalkerCommand() {
    }
}
