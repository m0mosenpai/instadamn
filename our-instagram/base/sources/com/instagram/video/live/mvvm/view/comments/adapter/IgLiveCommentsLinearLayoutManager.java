package com.instagram.video.live.mvvm.view.comments.adapter;

import X.C0f9;
import X.C0w9;
import X.C14360o3;
import X.C3F5;
import X.C70593Ew;
import X.MSV;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes2.dex */
public final class IgLiveCommentsLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
    public final void A1R(C70593Ew c70593Ew, C3F5 c3f5) {
        String message;
        int A03 = C0f9.A03(1582907712);
        C14360o3.A0B(c70593Ew, 0);
        C14360o3.A0B(c3f5, 1);
        try {
            super.A1R(c70593Ew, c3f5);
        } catch (IndexOutOfBoundsException e) {
            Throwable cause = e.getCause();
            if ((cause == null || (message = cause.getMessage()) == null) && (message = e.getMessage()) == null) {
                message = "Comment layout out of bound";
            }
            C0w9.A03(MSV.A00(505), message);
        }
        C0f9.A0A(1730357647, A03);
    }

    public IgLiveCommentsLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
