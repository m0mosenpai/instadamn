package com.instagram.direct.messagethread.store.intf;

import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes3.dex */
public abstract class MessageListLayoutManager extends LinearLayoutManager {
    public boolean A00;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final boolean A14() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final boolean A1Y() {
        if (super.A1Y() && this.A00) {
            return true;
        }
        return false;
    }
}
