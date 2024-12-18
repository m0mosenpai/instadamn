package com.facebook.msys.mca;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* loaded from: classes3.dex */
public class MessageSyncServiceConfig {
    public final NativeHolder mNativeHolder;

    public MessageSyncServiceConfig(String str, String str2, AccountSession accountSession, SlimMailbox slimMailbox, MailboxDatabaseConfig mailboxDatabaseConfig, NetworkSession networkSession, DasmConfigCreator dasmConfigCreator, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, String str3, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10) {
        this.mNativeHolder = initNativeHolder(str, str2, accountSession, slimMailbox, mailboxDatabaseConfig, networkSession, dasmConfigCreator, mailboxMessengerMediaSendManagerConfig, str3, list, i, true, false, z3, z4, z5, 500L, true, 500L, z7, z8, 500L, z9, z10);
    }

    public static native NativeHolder initNativeHolder(String str, String str2, AccountSession accountSession, SlimMailbox slimMailbox, MailboxDatabaseConfig mailboxDatabaseConfig, NetworkSession networkSession, DasmConfigCreator dasmConfigCreator, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, String str3, List list, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10);
}
