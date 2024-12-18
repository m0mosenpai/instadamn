package com.facebook.msys.mca;

import X.C137306Jk;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* loaded from: classes3.dex */
public class MailboxConfig {
    public static final MailboxConfig $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    private native NativeHolder initNativeHolder(SlimMailbox slimMailbox, AccountSession accountSession, NetworkSession networkSession, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10, int i, boolean z11, DasmConfigCreator dasmConfigCreator, List list, List list2, boolean z12, int i2, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, MailboxDatabaseConfig mailboxDatabaseConfig, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, int i3, int i4);

    static {
        C137306Jk.A00();
    }

    public MailboxConfig(SlimMailbox slimMailbox, AccountSession accountSession, NetworkSession networkSession, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j, boolean z6, long j2, boolean z7, boolean z8, long j3, boolean z9, boolean z10, int i, boolean z11, DasmConfigCreator dasmConfigCreator, List list, List list2, boolean z12, int i2, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, MailboxDatabaseConfig mailboxDatabaseConfig, MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig, int i3, int i4) {
        this.mNativeHolder = initNativeHolder(slimMailbox, accountSession, networkSession, str, str2, str3, true, false, z3, z4, z5, 500L, true, 500L, z7, z8, 500L, z9, z10, -10000, false, dasmConfigCreator, list, list2, false, 2, false, false, z15, z16, z17, false, false, false, mailboxDatabaseConfig, mailboxMessengerMediaSendManagerConfig, -1, -1);
    }
}
