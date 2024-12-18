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
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.securityalert.data.SecurityAlertRepository$insertOrUpdateSecurityAlert$1", f = "SecurityAlertRepository.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class SecurityAlertRepository$insertOrUpdateSecurityAlert$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SecurityAlertRepository A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAlertRepository$insertOrUpdateSecurityAlert$1(SecurityAlertRepository securityAlertRepository, Number number, Number number2, Number number3, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A04 = securityAlertRepository;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = number;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A06 = number2;
        this.A07 = number3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        SecurityAlertRepository securityAlertRepository = this.A04;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        return new SecurityAlertRepository$insertOrUpdateSecurityAlert$1(securityAlertRepository, this.A05, this.A06, this.A07, this.A09, this.A0A, this.A08, interfaceC23621Ds, i, i2, i3);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Object obj2 = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A04.A02;
            int i = this.A03;
            int i2 = this.A01;
            int i3 = this.A02;
            Number number = this.A05;
            String str = this.A09;
            String str2 = this.A0A;
            String str3 = this.A08;
            Number number2 = this.A06;
            Number number3 = this.A07;
            this.A00 = 1;
            Object A00 = AbstractC23641Du.A00(this, AbstractC25231BEo.A0e(C12L.A00), new SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2(securityAlertLocalDataSource, number, number2, number3, str, str2, str3, null, i, i2, i3));
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
        return ((SecurityAlertRepository$insertOrUpdateSecurityAlert$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
