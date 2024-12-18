package com.instagram.direct.securityalert.data;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC23641Du;
import X.AbstractC25231BEo;
import X.C0eB;
import X.C12L;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.securityalert.data.SecurityAlertRepository$handleParticipantDeviceChange$2", f = "SecurityAlertRepository.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class SecurityAlertRepository$handleParticipantDeviceChange$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ SecurityAlertRepository A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAlertRepository$handleParticipantDeviceChange$2(UserSession userSession, SecurityAlertRepository securityAlertRepository, String str, InterfaceC23621Ds interfaceC23621Ds, int i, long j, long j2, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A05 = securityAlertRepository;
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
        SecurityAlertRepository securityAlertRepository = this.A05;
        return new SecurityAlertRepository$handleParticipantDeviceChange$2(this.A04, securityAlertRepository, this.A06, interfaceC23621Ds, this.A01, this.A03, this.A02, this.A08, this.A07);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2 = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A05.A02;
            UserSession userSession = this.A04;
            long j = this.A03;
            String str = this.A06;
            int i = this.A01;
            long j2 = this.A02;
            boolean z = this.A08;
            boolean z2 = this.A07;
            this.A00 = 1;
            Object A00 = AbstractC23641Du.A00(this, AbstractC25231BEo.A0e(C12L.A00), new SecurityAlertLocalDataSource$insertParticipantDeviceChange$2(userSession, securityAlertLocalDataSource, str, null, i, j, j2, z, z2));
            if (A00 != obj2) {
                A00 = C0eB.A00;
            }
            if (A00 == obj2) {
                return obj2;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SecurityAlertRepository$handleParticipantDeviceChange$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
