package com.instagram.pendingmedia.service.impl;

import X.AbstractC09440dt;
import X.AbstractC129685tX;
import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass195;
import X.AnonymousClass197;
import X.C05F;
import X.C12N;
import X.C13920nI;
import X.C14090nZ;
import X.C14360o3;
import X.C19K;
import X.C24721Ip;
import X.C3E1;
import X.C3E6;
import X.C46032KYx;
import X.C73163Pr;
import X.C9DS;
import X.C9EQ;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC24731Iq;
import X.InterfaceC70363Du;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class ConcurrentUploadQueueProcessor {
    public static final C3E6 A0F = new Object();
    public AnonymousClass195 A00;
    public final Context A01;
    public final UserSession A02;
    public final C14090nZ A03;
    public final C14090nZ A04;
    public final InterfaceC70363Du A05;
    public final C3E1 A06;
    public final PendingMediaStore A07;
    public final Map A08;
    public final AtomicInteger A09;
    public final InterfaceC09390do A0A;
    public final CoroutineExceptionHandler A0B;
    public final InterfaceC24731Iq A0C;
    public final InterfaceC24731Iq A0D;
    public final C13920nI A0E;

    public ConcurrentUploadQueueProcessor(Context context, C12N c12n, UserSession userSession, InterfaceC70363Du interfaceC70363Du, C3E1 c3e1, PendingMediaStore pendingMediaStore, Map map, int i) {
        C14360o3.A0B(context, 2);
        C14360o3.A0B(map, 7);
        C14360o3.A0B(c12n, 8);
        this.A01 = context;
        this.A05 = interfaceC70363Du;
        this.A07 = pendingMediaStore;
        this.A06 = c3e1;
        this.A02 = userSession;
        this.A08 = map;
        this.A0A = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EQ(this, 4));
        this.A0E = C13920nI.A00;
        C14090nZ A00 = c12n.CPG(319, 2).A00(i + 1);
        this.A03 = A00;
        this.A04 = A00.A00(i);
        this.A09 = new AtomicInteger(0);
        Integer num = C05F.A00;
        this.A0D = new C24721Ip(Integer.MAX_VALUE);
        this.A0C = new C24721Ip(Integer.MAX_VALUE);
        this.A0B = new ConcurrentUploadQueueProcessor$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C19K A02 = AnonymousClass194.A02(this.A03.plus(this.A0B).plus(new AnonymousClass197(null)));
        this.A00 = AbstractC23641Du.A03(num, AnonymousClass191.A00, new C9DS(this, null, 11), A02);
    }

    public final C73163Pr A00(C46032KYx c46032KYx) {
        C14360o3.A0B(c46032KYx, 0);
        AbstractC129685tX.A00(c46032KYx, this.A0D);
        return c46032KYx.A04;
    }
}
