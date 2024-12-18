package com.instagram.direct.msys.impl.thread;

import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.C0f9;
import X.C3F5;
import X.C3OO;
import X.C70593Ew;
import X.InterfaceC161797Mo;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class MsysMessageListLinearLayoutManager extends MessageListLayoutManager {
    public final WeakReference A00;

    public MsysMessageListLinearLayoutManager(Context context, RecyclerView recyclerView) {
        super(context, 1, true);
        ((MessageListLayoutManager) this).A00 = true;
        this.A00 = AbstractC25225BEi.A16(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1R(C70593Ew c70593Ew, C3F5 c3f5) {
        RecyclerView recyclerView;
        View view;
        int A03 = C0f9.A03(-98934484);
        AbstractC167017dG.A1N(c70593Ew, c3f5);
        super.A1R(c70593Ew, c3f5);
        View A0d = A0d(A1b());
        if (A0d != null && (recyclerView = (RecyclerView) this.A00.get()) != null) {
            C3OO A0X = recyclerView.A0X(A0d);
            if ((A0X instanceof InterfaceC161797Mo) && (view = A0X.itemView) != null && view.getMinimumHeight() != view.getBottom()) {
                view.setMinimumHeight(view.getBottom());
                super.A1R(c70593Ew, c3f5);
            }
        }
        C0f9.A0A(445055158, A03);
    }
}
