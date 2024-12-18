package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.Iterator;

/* renamed from: X.1bI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29411bI implements InterfaceC29421bJ {
    public static final C0KV A04 = new C0KV() { // from class: X.1bK
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
            int A03 = C0f9.A03(-1688879575);
            int A032 = C0f9.A03(2033630141);
            C29411bI c29411bI = new C29411bI(userSession, AbstractC09440dt.A01(new C29624D2z(userSession, this)), AbstractC09440dt.A01(new D30(userSession, this)), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B33
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321422456700L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B3G
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A06, UserSession.this, 36313321422522237L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B3H
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321423570829L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B34
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321423832977L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B35
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321424029588L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B36
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321423964051L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B37
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321422587774L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B38
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321422784385L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B39
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321422718848L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B3A
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321422653311L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B3B
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321423505292L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B2U
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0a();
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B3C
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321423374218L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B3D
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A06, UserSession.this, 36313321423308681L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B3E
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321424226199L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B3F
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0c(C06090Tz.A05, UserSession.this, 36313321424553883L);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B2V
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AbstractC166997dE.A0b();
                }
            }));
            C0f9.A0A(-1697927881, A032);
            C0f9.A0A(1093274664, A03);
            return c29411bI;
        }
    };
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final L8H A02;
    public final InterfaceC09390do A03;

    public C29411bI(UserSession userSession, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, InterfaceC09390do interfaceC09390do4, InterfaceC09390do interfaceC09390do5, InterfaceC09390do interfaceC09390do6, InterfaceC09390do interfaceC09390do7, InterfaceC09390do interfaceC09390do8, InterfaceC09390do interfaceC09390do9, InterfaceC09390do interfaceC09390do10, InterfaceC09390do interfaceC09390do11, InterfaceC09390do interfaceC09390do12, InterfaceC09390do interfaceC09390do13, InterfaceC09390do interfaceC09390do14, InterfaceC09390do interfaceC09390do15, InterfaceC09390do interfaceC09390do16, InterfaceC09390do interfaceC09390do17, InterfaceC09390do interfaceC09390do18, InterfaceC09390do interfaceC09390do19) {
        this.A01 = interfaceC09390do;
        this.A03 = interfaceC09390do2;
        this.A02 = new L8H(this, interfaceC09390do9, interfaceC09390do10, interfaceC09390do11, interfaceC09390do16, interfaceC09390do18, interfaceC09390do19, interfaceC09390do5, interfaceC09390do6, interfaceC09390do7, interfaceC09390do8, interfaceC09390do4, interfaceC09390do3, interfaceC09390do12, interfaceC09390do13, interfaceC09390do14, interfaceC09390do15, interfaceC09390do17);
        this.A00 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r3.equals("executing") != false) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(X.MNP r26, X.AbstractC29011ae r27, com.instagram.model.direct.DirectThreadKey r28) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29411bI.A00(X.MNP, X.1ae, com.instagram.model.direct.DirectThreadKey):void");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        UserSession userSession = this.A00;
        C7X3 A00 = C7X2.A00(userSession);
        for (DirectThreadKey directThreadKey : abstractC29011ae.C7R()) {
            String A06 = abstractC29011ae.A06();
            if (abstractC29011ae.Ar9() == C2EY.A1i || abstractC29011ae.Ar9() == C2EY.A1m || abstractC29011ae.Ar9() == C2EY.A1C || abstractC29011ae.Ar9() == C2EY.A0m || abstractC29011ae.Ar9() == C2EY.A0K || abstractC29011ae.Ar9() == C2EY.A0z || abstractC29011ae.Ar9() == C2EY.A0q) {
                A00.A05(A06, false);
                A00.A04(A06, true);
            }
            IGFOAMessagingLocalSendSpeedLogger A002 = C7R5.A00(userSession, Integer.valueOf(A06.hashCode()));
            if (A002 != null) {
                A002.onLogSendServiceEnd();
                A002.onLogShowOptimisticMessageStart();
                A002.onLogDispatchSendMutationEnd();
            }
            A00(mnp, abstractC29011ae, directThreadKey);
        }
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C2DS c2ds = (C2DS) this.A01.getValue();
        C14360o3.A0B(c2ds, 0);
        C14360o3.A0B(abstractC29011ae, 1);
        for (DirectThreadKey directThreadKey : abstractC29011ae.C7R()) {
            C14360o3.A0A(directThreadKey);
            c2ds.EFl(directThreadKey, null, abstractC29011ae.A06());
        }
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        Iterator it = abstractC29011ae.C7R().iterator();
        while (it.hasNext()) {
            A00(mnp2, abstractC29011ae, (DirectThreadKey) it.next());
        }
    }
}
