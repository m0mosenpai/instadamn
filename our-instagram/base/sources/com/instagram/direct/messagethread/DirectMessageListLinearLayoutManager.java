package com.instagram.direct.messagethread;

import X.C7KQ;
import X.C7KR;
import android.content.Context;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;

/* loaded from: classes3.dex */
public final class DirectMessageListLinearLayoutManager extends MessageListLayoutManager {
    public final C7KR A00;
    public final boolean A01;
    public final C7KQ A02;
    public final String A03;

    public DirectMessageListLinearLayoutManager(Context context, int i) {
        super(context, 1, true);
        ((MessageListLayoutManager) this).A00 = true;
        this.A01 = true;
        this.A03 = "DirectMessageListLinearLayoutManager";
        this.A02 = new C7KQ(context, this, i);
        this.A00 = new C7KR(context, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0139, code lost:
    
        if (r1 != 68) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013e, code lost:
    
        if (r11.A01 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0120, code lost:
    
        if (r3 == null) goto L53;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1R(X.C70593Ew r12, X.C3F5 r13) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.DirectMessageListLinearLayoutManager.A1R(X.3Ew, X.3F5):void");
    }
}
