package com.instagram.util.recyclerview;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes2.dex */
public final class LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 extends LinearLayoutManager {
    public final /* synthetic */ Boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1(Context context, Boolean bool) {
        super(context, 0, false);
        this.A00 = bool;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final boolean A14() {
        Boolean bool = this.A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
