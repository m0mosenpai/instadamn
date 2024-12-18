package com.instagram.direct.securityalert.data;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.C09540e5;
import X.C09550e6;
import X.C0K8;
import X.C0eB;
import X.C1YP;
import X.C45087JxH;
import X.C47662L2v;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource$insertParticipantDeviceChange$2", f = "SecurityAlertLocalDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class SecurityAlertLocalDataSource$insertParticipantDeviceChange$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ SecurityAlertLocalDataSource A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAlertLocalDataSource$insertParticipantDeviceChange$2(UserSession userSession, SecurityAlertLocalDataSource securityAlertLocalDataSource, String str, InterfaceC23621Ds interfaceC23621Ds, int i, long j, long j2, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A05 = securityAlertLocalDataSource;
        this.A04 = userSession;
        this.A03 = j;
        this.A06 = str;
        this.A01 = i;
        this.A02 = j2;
        this.A08 = z;
        this.A07 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A05;
        SecurityAlertLocalDataSource$insertParticipantDeviceChange$2 securityAlertLocalDataSource$insertParticipantDeviceChange$2 = new SecurityAlertLocalDataSource$insertParticipantDeviceChange$2(this.A04, securityAlertLocalDataSource, this.A06, interfaceC23621Ds, this.A01, this.A03, this.A02, this.A08, this.A07);
        securityAlertLocalDataSource$insertParticipantDeviceChange$2.A00 = obj;
        return securityAlertLocalDataSource$insertParticipantDeviceChange$2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SecurityAlertLocalDataSource$insertParticipantDeviceChange$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object c09540e5;
        AbstractC09560e7.A00(obj);
        SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A05;
        UserSession userSession = this.A04;
        long j = this.A03;
        String str = this.A06;
        int i = this.A01;
        long j2 = this.A02;
        boolean z = this.A08;
        boolean z2 = this.A07;
        try {
            C47662L2v A00 = securityAlertLocalDataSource.A02.A00();
            C45087JxH c45087JxH = new C45087JxH(userSession.userId, str, 0, i, j, j2, z, AbstractC167007dF.A1M(z2 ? 1 : 0));
            C1YP c1yp = A00.A01;
            c1yp.assertNotSuspendingTransaction();
            c1yp.beginTransaction();
            try {
                A00.A00.insert(c45087JxH);
                c1yp.setTransactionSuccessful();
                c1yp.endTransaction();
                c09540e5 = C0eB.A00;
            } catch (Throwable th) {
                c1yp.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            c09540e5 = new C09540e5(th2);
        }
        Throwable A002 = C09550e6.A00(c09540e5);
        if (A002 != null) {
            C0K8.A0C("SecurityAlertLocalDataSource", A002.getMessage());
        }
        return new C09550e6(c09540e5);
    }
}
