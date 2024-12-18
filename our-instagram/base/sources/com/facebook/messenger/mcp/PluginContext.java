package com.facebook.messenger.mcp;

import X.C14360o3;
import com.facebook.msys.mca.Mailbox;

/* loaded from: classes12.dex */
public final class PluginContext {
    public final Mailbox A00;

    public PluginContext(Mailbox mailbox) {
        C14360o3.A0B(mailbox, 1);
        this.A00 = mailbox;
    }

    public final Mailbox getMailbox() {
        return this.A00;
    }
}
