package com.instagram.repository.user;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AnonymousClass501;
import X.AnonymousClass700;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.MV2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.repository.user.UserRepository$fetchUserInfoUsingReactiveStream$1", f = "UserRepository.kt", i = {1}, l = {323, 356}, m = "invokeSuspend", n = {"fetchedUserDetail"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class UserRepository$fetchUserInfoUsingReactiveStream$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass700 A03;
    public final /* synthetic */ MV2 A04;
    public final /* synthetic */ AnonymousClass501 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepository$fetchUserInfoUsingReactiveStream$1(AnonymousClass700 anonymousClass700, MV2 mv2, AnonymousClass501 anonymousClass501, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = mv2;
        this.A05 = anonymousClass501;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = i;
        this.A03 = anonymousClass700;
        this.A08 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new UserRepository$fetchUserInfoUsingReactiveStream$1(this.A03, this.A04, this.A05, this.A07, this.A06, interfaceC23621Ds, this.A02, this.A08);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r9 = r22
            X.1JX r1 = X.C1JX.A02
            r12 = r21
            int r2 = r12.A00
            r0 = 2
            r6 = 1
            if (r2 == 0) goto L2d
            if (r2 == r6) goto L49
            java.lang.Object r13 = r12.A01
            X.O4P r13 = (X.O4P) r13
            X.AbstractC09560e7.A00(r9)
        L15:
            boolean r0 = r13 instanceof X.C52687NSt
            if (r0 == 0) goto L2a
            X.MV2 r0 = r12.A04
            X.5K8 r2 = r0.A03
            com.instagram.user.model.User r0 = r13.A00
            java.lang.String r1 = r0.getId()
            X.16a r0 = r0.A0I()
            r2.EPB(r0, r1)
        L2a:
            X.0eB r1 = X.C0eB.A00
            return r1
        L2d:
            X.AbstractC09560e7.A00(r9)
            X.MV2 r2 = r12.A04
            com.instagram.repository.user.UserNetworkDataSource r7 = r2.A02
            X.501 r9 = r12.A05
            java.lang.String r10 = r12.A07
            java.lang.String r11 = r12.A06
            int r13 = r12.A02
            X.700 r8 = r12.A03
            boolean r14 = r12.A08
            r12.A00 = r6
            java.lang.Object r9 = r7.A01(r8, r9, r10, r11, r12, r13, r14)
            if (r9 != r1) goto L4c
            return r1
        L49:
            X.AbstractC09560e7.A00(r9)
        L4c:
            X.3NY r9 = (X.C3NY) r9
            X.MV2 r4 = r12.A04
            X.02i r8 = r4.A00
            r7 = 31784979(0x1e50013, float:8.412142E-38)
            int r5 = r12.A02
            java.lang.String r3 = "profile_info_data_source"
            java.lang.String r2 = "reactive_stream_network"
            r8.markerAnnotate(r7, r5, r3, r2)
            boolean r2 = r9 instanceof X.C3NX
            if (r2 == 0) goto Lae
            X.3NX r9 = (X.C3NX) r9
            java.lang.Object r7 = r9.A00
            X.93s r7 = (X.C2045893s) r7
            com.instagram.user.model.User r16 = X.C72W.A00(r7)
            if (r16 == 0) goto L9c
            X.700 r5 = r12.A03
            java.lang.String r17 = X.C72W.A01(r7)
            long r2 = r7.mServerElapsedTime
            boolean r20 = r7.CR4()
            X.72X r15 = r5.A00()
            java.lang.Object r5 = r7.F7f()
            X.5qh r5 = (X.InterfaceC128135qh) r5
            X.Ps7 r14 = r5.BlD()
            X.NSt r13 = new X.NSt
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18, r20)
        L8f:
            X.0Ui r2 = r4.A04
            r12.A01 = r13
            r12.A00 = r0
            java.lang.Object r0 = r2.emit(r13, r12)
            if (r0 != r1) goto L15
            return r1
        L9c:
            X.501 r2 = r12.A05
            com.instagram.user.model.User r5 = X.MV2.A00(r2)
            r3 = 0
            X.O8a r2 = new X.O8a
            r2.<init>(r3, r6)
            X.NSs r13 = new X.NSs
            r13.<init>(r2, r5)
            goto L8f
        Lae:
            boolean r2 = r9 instanceof X.C194848jk
            if (r2 == 0) goto Lc4
            X.501 r2 = r12.A05
            com.instagram.user.model.User r3 = X.MV2.A00(r2)
            X.8jk r9 = (X.C194848jk) r9
            java.lang.Object r2 = r9.A00
            X.O8a r2 = (X.C54548O8a) r2
            X.NSs r13 = new X.NSs
            r13.<init>(r2, r3)
            goto L8f
        Lc4:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.user.UserRepository$fetchUserInfoUsingReactiveStream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UserRepository$fetchUserInfoUsingReactiveStream$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
