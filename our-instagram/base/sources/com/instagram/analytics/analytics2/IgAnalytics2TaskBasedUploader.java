package com.instagram.analytics.analytics2;

import X.AbstractC20100yh;
import X.AbstractC24481Hr;
import X.C14120nc;
import X.C14360o3;
import X.C20150ym;
import X.C89093yB;
import X.C89103yC;
import X.InterfaceC14020nS;
import X.TG3;
import X.TG4;
import X.TUM;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class IgAnalytics2TaskBasedUploader extends IGAnalytics2UploaderBase {
    public static final AtomicInteger A01 = new AtomicInteger(0);
    public static final AtomicInteger A02 = new AtomicInteger(Integer.MAX_VALUE);
    public final InterfaceC14020nS A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgAnalytics2TaskBasedUploader(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A00 = A00;
    }

    @Override // X.InterfaceC38001pk
    public final void FDA(C89103yC c89103yC, C89093yB c89093yB) {
        this.A00.ATO(AbstractC24481Hr.A06.A00(new TUM(c89103yC, c89093yB, this), 699, 5, false, false).A02(new TG3(c89103yC), 700, 5, true, false).A02(new TG4(c89103yC), 701, 5, C20150ym.A07(AbstractC20100yh.A00(36310778803585313L)), false));
    }
}
