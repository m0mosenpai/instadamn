package com.instagram.analytics.analytics2;

import X.AbstractC37641p1;
import X.C23311Bt;
import X.C37571ou;
import X.C3JY;
import X.C89093yB;
import X.C89103yC;
import X.C906942h;
import X.InterfaceC26481Qd;
import android.content.Context;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class IGAnalytics2SimpleUploader extends IGAnalytics2UploaderBase {
    public static final AtomicInteger A02 = new AtomicInteger(0);
    public final int A00;
    public final int A01;

    @Override // X.InterfaceC38001pk
    public final void FDA(C89103yC c89103yC, C89093yB c89093yB) {
        AtomicInteger atomicInteger = A02;
        atomicInteger.incrementAndGet();
        int i = this.A00;
        try {
            try {
            } finally {
                atomicInteger.decrementAndGet();
            }
        } catch (IOException e) {
            e = e;
        }
        if (i == 0) {
            try {
                try {
                    C3JY A01 = C23311Bt.A00().A01(A00(c89093yB, 0, 0));
                    int i2 = A01.A02;
                    InterfaceC26481Qd A00 = A01.A00();
                    A00.getClass();
                    c89103yC.A01(A00.AjT(), i2);
                } catch (OutOfMemoryError e2) {
                    e = new IOException(e2);
                    c89103yC.A00(e);
                }
            } catch (C906942h e3) {
                e = new IOException(e3);
                c89103yC.A00(e);
            }
        }
        try {
            C3JY A012 = C23311Bt.A00().A01(A00(c89093yB, i, this.A01));
            int i3 = A012.A02;
            InterfaceC26481Qd A002 = A012.A00();
            A002.getClass();
            c89103yC.A01(A002.AjT(), i3);
        } catch (C906942h e4) {
            e = new IOException(e4);
            c89103yC.A00(e);
        }
    }

    public IGAnalytics2SimpleUploader(Context context) {
        super(context);
        int i;
        C37571ou c37571ou = AbstractC37641p1.A01;
        if (c37571ou != null) {
            this.A00 = c37571ou.A0G;
            i = c37571ou.A0H;
        } else {
            i = 0;
        }
        this.A01 = i;
    }
}
