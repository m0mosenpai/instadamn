package com.instagram.direct.perf.constants;

import X.AbstractC12190kN;
import X.C14360o3;
import java.util.Locale;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ThreadFetchReason {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ThreadFetchReason[] $VALUES;
    public final String fetchType;
    public static final ThreadFetchReason MISSING_DATA_IN_INBOX_SNAPSHOT_E2E = new ThreadFetchReason("MISSING_DATA_IN_INBOX_SNAPSHOT_E2E", 0, "snapshot");
    public static final ThreadFetchReason THREAD_SUMMARY = new ThreadFetchReason("THREAD_SUMMARY", 1, "snapshot");
    public static final ThreadFetchReason DIRECT_THREAD_VIEW_LOAD_MORE_FROM_NETWORK = new ThreadFetchReason("DIRECT_THREAD_VIEW_LOAD_MORE_FROM_NETWORK", 2, "paging_new");
    public static final ThreadFetchReason INITIAL_SNAPSHOT = new ThreadFetchReason("INITIAL_SNAPSHOT", 3, "snapshot");
    public static final ThreadFetchReason MISSING_CUTOVER_OPEN_THREAD = new ThreadFetchReason("MISSING_CUTOVER_OPEN_THREAD", 4, "snapshot");
    public static final ThreadFetchReason IRIS_THREAD_SNAPSHOT_SIDE_EFFECT = new ThreadFetchReason("IRIS_THREAD_SNAPSHOT_SIDE_EFFECT", 5, "snapshot");
    public static final ThreadFetchReason EAGER_THREAD_RESOLUTION = new ThreadFetchReason("EAGER_THREAD_RESOLUTION", 6, "snapshot");
    public static final ThreadFetchReason IRIS_SYNC_MESSAGE = new ThreadFetchReason("IRIS_SYNC_MESSAGE", 7, "snapshot");
    public static final ThreadFetchReason BROADCAST_CHANNEL_SNAPSHOT_REQUEST = new ThreadFetchReason("BROADCAST_CHANNEL_SNAPSHOT_REQUEST", 8, "snapshot");
    public static final ThreadFetchReason OPEN_BROADCAST_CHANNEL = new ThreadFetchReason("OPEN_BROADCAST_CHANNEL", 9, "snapshot");
    public static final ThreadFetchReason UPDATE_STORY_MENTION_SETTINGS = new ThreadFetchReason("UPDATE_STORY_MENTION_SETTINGS", 10, "snapshot");
    public static final ThreadFetchReason BURNER = new ThreadFetchReason("BURNER", 11, "snapshot");
    public static final ThreadFetchReason ARMADILLO_BADGE_COUNTER = new ThreadFetchReason("ARMADILLO_BADGE_COUNTER", 12, "snapshot");
    public static final ThreadFetchReason FETCH_CHANNEL_MESSAGES = new ThreadFetchReason("FETCH_CHANNEL_MESSAGES", 13, "snapshot");
    public static final ThreadFetchReason STALE_THREAD_ON_THREAD_OPEN = new ThreadFetchReason("STALE_THREAD_ON_THREAD_OPEN", 14, "snapshot");
    public static final ThreadFetchReason GROUP_PREVIEW_JOIN_CHANNEL = new ThreadFetchReason("GROUP_PREVIEW_JOIN_CHANNEL", 15, "snapshot");
    public static final ThreadFetchReason GROUP_PREVIEW_FOLLOW_USER = new ThreadFetchReason("GROUP_PREVIEW_FOLLOW_USER", 16, "snapshot");
    public static final ThreadFetchReason GROUP_PREVIEW_NAVIGATE_TO_THREAD = new ThreadFetchReason("GROUP_PREVIEW_NAVIGATE_TO_THREAD", 17, "snapshot");
    public static final ThreadFetchReason MESSAGE_SHARE_STICKER = new ThreadFetchReason("MESSAGE_SHARE_STICKER", 18, "snapshot");
    public static final ThreadFetchReason RTC_SHARE = new ThreadFetchReason("RTC_SHARE", 19, "snapshot");
    public static final ThreadFetchReason LOAD_AND_OPEN_GROUP_THREAD = new ThreadFetchReason("LOAD_AND_OPEN_GROUP_THREAD", 20, "snapshot");
    public static final ThreadFetchReason ARMADILLO_MIXED_NOTIFICATION_IS_OPEN_THREAD_MUTED = new ThreadFetchReason("ARMADILLO_MIXED_NOTIFICATION_IS_OPEN_THREAD_MUTED", 21, "snapshot");
    public static final ThreadFetchReason ARMADILLO_MIXED_NOTIFICATION = new ThreadFetchReason("ARMADILLO_MIXED_NOTIFICATION", 22, "snapshot");
    public static final ThreadFetchReason CHECK_MUTED_WORDS_FOR_PUSH = new ThreadFetchReason("CHECK_MUTED_WORDS_FOR_PUSH", 23, "snapshot");
    public static final ThreadFetchReason PREPARE_FOR_PUSH_NOTIFICATION = new ThreadFetchReason("PREPARE_FOR_PUSH_NOTIFICATION", 24, "snapshot");
    public static final ThreadFetchReason CONFIRM_PENDING_MESSAGES = new ThreadFetchReason("CONFIRM_PENDING_MESSAGES", 25, "snapshot");
    public static final ThreadFetchReason BROADCAST_CHANNEL_INBOX_UPDATE = new ThreadFetchReason("BROADCAST_CHANNEL_INBOX_UPDATE", 26, "snapshot");
    public static final ThreadFetchReason DJANGO_SIDE_EFFECT = new ThreadFetchReason("DJANGO_SIDE_EFFECT", 27, "snapshot");
    public static final ThreadFetchReason CLICK_TO_JOIN = new ThreadFetchReason("CLICK_TO_JOIN", 28, "snapshot");
    public static final ThreadFetchReason HERA_CALL = new ThreadFetchReason("HERA_CALL", 29, "snapshot");
    public static final ThreadFetchReason AE_MISSING_THREAD_AT_MESSAGE_SYNC_OP_RENDERER = new ThreadFetchReason("AE_MISSING_THREAD_AT_MESSAGE_SYNC_OP_RENDERER", 30, "snapshot");
    public static final ThreadFetchReason AE_MISSING_THREAD_AT_PLACEHOLDER_SYNC_OP_RENDERER = new ThreadFetchReason("AE_MISSING_THREAD_AT_PLACEHOLDER_SYNC_OP_RENDERER", 31, "snapshot");
    public static final ThreadFetchReason AE_MISSING_THREAD_AT_TRANSPORT_SYNC_OP_RENDERER = new ThreadFetchReason("AE_MISSING_THREAD_AT_TRANSPORT_SYNC_OP_RENDERER", 32, "snapshot");
    public static final ThreadFetchReason AE_MISSING_THREAD_IN_THREAD_STORE = new ThreadFetchReason("AE_MISSING_THREAD_IN_THREAD_STORE", 33, "snapshot");

    public static final /* synthetic */ ThreadFetchReason[] $values() {
        ThreadFetchReason[] threadFetchReasonArr = new ThreadFetchReason[34];
        System.arraycopy(new ThreadFetchReason[]{MISSING_DATA_IN_INBOX_SNAPSHOT_E2E, THREAD_SUMMARY, DIRECT_THREAD_VIEW_LOAD_MORE_FROM_NETWORK, INITIAL_SNAPSHOT, MISSING_CUTOVER_OPEN_THREAD, IRIS_THREAD_SNAPSHOT_SIDE_EFFECT, EAGER_THREAD_RESOLUTION, IRIS_SYNC_MESSAGE, BROADCAST_CHANNEL_SNAPSHOT_REQUEST, OPEN_BROADCAST_CHANNEL, UPDATE_STORY_MENTION_SETTINGS, BURNER, ARMADILLO_BADGE_COUNTER, FETCH_CHANNEL_MESSAGES, STALE_THREAD_ON_THREAD_OPEN, GROUP_PREVIEW_JOIN_CHANNEL, GROUP_PREVIEW_FOLLOW_USER, GROUP_PREVIEW_NAVIGATE_TO_THREAD, MESSAGE_SHARE_STICKER, RTC_SHARE, LOAD_AND_OPEN_GROUP_THREAD, ARMADILLO_MIXED_NOTIFICATION_IS_OPEN_THREAD_MUTED, ARMADILLO_MIXED_NOTIFICATION, CHECK_MUTED_WORDS_FOR_PUSH, PREPARE_FOR_PUSH_NOTIFICATION, CONFIRM_PENDING_MESSAGES, BROADCAST_CHANNEL_INBOX_UPDATE}, 0, threadFetchReasonArr, 0, 27);
        System.arraycopy(new ThreadFetchReason[]{DJANGO_SIDE_EFFECT, CLICK_TO_JOIN, HERA_CALL, AE_MISSING_THREAD_AT_MESSAGE_SYNC_OP_RENDERER, AE_MISSING_THREAD_AT_PLACEHOLDER_SYNC_OP_RENDERER, AE_MISSING_THREAD_AT_TRANSPORT_SYNC_OP_RENDERER, AE_MISSING_THREAD_IN_THREAD_STORE}, 0, threadFetchReasonArr, 27, 7);
        return threadFetchReasonArr;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        ThreadFetchReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static ThreadFetchReason valueOf(String str) {
        return (ThreadFetchReason) Enum.valueOf(ThreadFetchReason.class, str);
    }

    public static ThreadFetchReason[] values() {
        return (ThreadFetchReason[]) $VALUES.clone();
    }

    public final String getFetchType() {
        return this.fetchType;
    }

    public ThreadFetchReason(String str, int i, String str2) {
        this.fetchType = str2;
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        C14360o3.A07(lowerCase);
        return lowerCase;
    }
}
