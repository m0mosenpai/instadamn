package com.instagram.direct.securityalert.data;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2", f = "SecurityAlertLocalDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ Object A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ SecurityAlertLocalDataSource A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ Number A06;
    public final /* synthetic */ Number A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2(SecurityAlertLocalDataSource securityAlertLocalDataSource, Number number, Number number2, Number number3, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, int i3) {
        super(2, interfaceC23621Ds);
        this.A04 = securityAlertLocalDataSource;
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
        SecurityAlertLocalDataSource securityAlertLocalDataSource = this.A04;
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2 securityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2 = new SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2(securityAlertLocalDataSource, this.A05, this.A06, this.A07, this.A09, this.A0A, this.A08, interfaceC23621Ds, i, i2, i3);
        securityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2.A00 = obj;
        return securityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r12 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        if (r12 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0115, code lost:
    
        if (r4 == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.1YP] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SecurityAlertLocalDataSource$insertOrUpdatePeerDeviceChangeAlert$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
