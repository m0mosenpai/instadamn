package com.instagram.creation.drafts.model.clips;

import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C05F;
import X.C12L;
import X.C14090nZ;
import X.C14360o3;
import X.C16930sl;
import X.C19K;
import X.C206659Cw;
import X.C2OW;
import X.C2PV;
import X.C47Z;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.JQ8;
import X.JQ9;
import X.JQF;
import X.JQG;
import X.MC9;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ClipsDraftPreviewItemRepository {
    public static final C2OW A09 = new Object();
    public List A00;
    public final C14090nZ A01;
    public final ClipsDraftLocalDataSource A02;
    public final InterfaceC19390xP A03;
    public final Context A04;
    public final C12L A05;
    public final UserSession A06;
    public final PendingMediaStore A07;
    public final InterfaceC19390xP A08;

    public ClipsDraftPreviewItemRepository(Context context, UserSession userSession, ClipsDraftLocalDataSource clipsDraftLocalDataSource, PendingMediaStore pendingMediaStore) {
        C14360o3.A0B(clipsDraftLocalDataSource, 1);
        C14360o3.A0B(pendingMediaStore, 2);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(context, 4);
        this.A02 = clipsDraftLocalDataSource;
        this.A07 = pendingMediaStore;
        this.A06 = userSession;
        this.A04 = context;
        this.A00 = C16930sl.A00;
        C2PV c2pv = clipsDraftLocalDataSource.A01;
        this.A03 = new JQF(this, new JQ8(clipsDraftLocalDataSource, c2pv.A0Q()));
        this.A08 = new JQG(this, new JQ9(clipsDraftLocalDataSource, c2pv.A0P()));
        C12L c12l = C12L.A00;
        this.A05 = c12l;
        this.A01 = c12l.AOT(2113530577, 3);
        Iterator it = pendingMediaStore.A09(C05F.A07).iterator();
        while (it.hasNext()) {
            this.A07.A04(((C47Z) it.next()).A35, "PANAVIDEO_DRAFT");
        }
        long currentTimeMillis = System.currentTimeMillis();
        C19K A02 = AnonymousClass194.A02(this.A01);
        C206659Cw c206659Cw = new C206659Cw(this, null, 3, currentTimeMillis);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206659Cw, A02);
    }

    public final void A01(String str, InterfaceC16660sJ interfaceC16660sJ) {
        C19K A02 = AnonymousClass194.A02(this.A01);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC9(this, interfaceC16660sJ, str, (InterfaceC23621Ds) null, 24), A02);
    }

    public final void A02(String str, InterfaceC16660sJ interfaceC16660sJ) {
        C19K A02 = AnonymousClass194.A02(this.A01);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC9(this, interfaceC16660sJ, str, (InterfaceC23621Ds) null, 26), A02);
    }

    public final void A03(String str, InterfaceC16620sF interfaceC16620sF) {
        C19K A02 = AnonymousClass194.A02(this.A01);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC9(this, interfaceC16620sF, str, (InterfaceC23621Ds) null, 25), A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.util.List r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 45
            boolean r0 = X.MAO.A02(r8, r3)
            if (r0 == 0) goto L9c
            r5 = r8
            X.MAO r5 = (X.MAO) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r2 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L4e
            if (r1 != r0) goto La3
            java.lang.Object r7 = r5.A02
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = r5.A01
            com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository r4 = (com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository) r4
            X.AbstractC09560e7.A00(r2)
        L2c:
            java.util.Iterator r3 = r7.iterator()
        L30:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r2 = r3.next()
            X.9J0 r2 = (X.C9J0) r2
            boolean r0 = r2.A00()
            if (r0 == 0) goto L30
            com.instagram.common.session.UserSession r0 = r4.A06
            X.22C r1 = X.AnonymousClass229.A01(r0)
            java.lang.String r0 = r2.A09
            r1.A1p(r0)
            goto L30
        L4e:
            X.AbstractC09560e7.A00(r2)
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r3 = r6.A02
            r5.A01 = r6
            r5.A02 = r7
            r5.A00 = r0
            java.util.Iterator r2 = r7.iterator()
        L5d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r2.next()
            X.9J0 r0 = (X.C9J0) r0
            java.lang.String r1 = r0.A09
            X.5JK r0 = r0.A04
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource.A00(r0, r3, r1)
            goto L5d
        L71:
            X.2PV r3 = r3.A01
            r0 = 10
            int r0 = X.AbstractC06950Ym.A1E(r7, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r7.iterator()
        L82:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r1.next()
            X.9J0 r0 = (X.C9J0) r0
            java.lang.String r0 = r0.A09
            r2.add(r0)
            goto L82
        L94:
            java.lang.Object r0 = r3.A0K(r2, r5)
            if (r0 == r4) goto Lad
            r4 = r6
            goto L2c
        L9c:
            X.MAO r5 = new X.MAO
            r5.<init>(r6, r8, r3)
            goto L16
        La3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lab:
            X.0eB r4 = X.C0eB.A00
        Lad:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository.A00(java.util.List, X.1Ds):java.lang.Object");
    }
}
