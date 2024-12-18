package X;

import java.util.List;
import java.util.ListIterator;

/* renamed from: X.1HL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HL implements C1G4 {
    public final AbstractC12990ll A00;
    public final C1HM A01;
    public final C1G4 A02;
    public final String A03;

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        List list;
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        String str = this.A03;
        java.net.URI uri = c1qw.A09;
        boolean A0K = C14360o3.A0K(str, uri.getHost());
        boolean z = false;
        if (C17280tP.A4E.A00().A0g() && AbstractC001900j.A0a(str, ":", false)) {
            List A03 = new C11L(":").A03(str);
            if (!A03.isEmpty()) {
                ListIterator listIterator = A03.listIterator(A03.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = AbstractC001800i.A0d(A03, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = C16930sl.A00;
            z = C14360o3.A0K(((String[]) list.toArray(new String[0]))[0], uri.getHost());
        }
        if (A0K || z) {
            c26511Qg.A01(new C19Q() { // from class: X.1Qu
                @Override // X.C19Q, X.C19O
                public final void onResponseStarted(C1QW c1qw2, C1QY c1qy2, C3JQ c3jq) {
                    String str2;
                    C14360o3.A0B(c1qw2, 0);
                    C14360o3.A0B(c1qy2, 1);
                    C14360o3.A0B(c3jq, 2);
                    C1HL c1hl = C1HL.this;
                    final C1HM c1hm = c1hl.A01;
                    final AbstractC12990ll abstractC12990ll = c1hl.A00;
                    if (c3jq.A01()) {
                        C23781El A00 = c3jq.A00("X-AED");
                        final int i = -1;
                        if (A00 != null) {
                            try {
                                int parseInt = Integer.parseInt(A00.A01.trim());
                                if (parseInt >= 0) {
                                    i = parseInt;
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (i == -1) {
                            String simpleName = C1HM.class.getSimpleName();
                            if (A00 == null) {
                                C0w9.A03(simpleName, "Emergency push version header missing");
                                str2 = "missing_header";
                            } else {
                                C0w9.A03(simpleName, "Invalid emergency push version received");
                                str2 = AnonymousClass001.A0R("invalid_version: ", A00.toString());
                            }
                        } else {
                            str2 = null;
                        }
                        InterfaceC19630xq interfaceC19630xq = c1hm.A04.A00;
                        if (!interfaceC19630xq.contains("preference_emergency_push_version")) {
                            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                            ARD.E7D("preference_emergency_push_version", i);
                            ARD.commit();
                            VT8.A00(abstractC12990ll, C05F.A0C, null, str2, i);
                            return;
                        }
                        final int i2 = interfaceC19630xq.getInt("preference_emergency_push_version", Integer.MIN_VALUE);
                        if (i <= i2) {
                            return;
                        }
                        C11T.A05("This operation can't be run on UI thread.");
                        if (!c1hm.A05.tryAcquire()) {
                            return;
                        }
                        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll);
                        c25621Ms.A09(C05F.A0N);
                        c25621Ms.A0B("aed/current/");
                        c25621Ms.A0S(C5LA.class, C5LB.class);
                        C1ON A0N = c25621Ms.A0N();
                        A0N.A00 = new C1P1() { // from class: X.5LC
                            /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
                            /* JADX WARN: Removed duplicated region for block: B:34:0x0114  */
                            /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x0195  */
                            /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
                            /* JADX WARN: Removed duplicated region for block: B:80:0x0256  */
                            /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
                            /* JADX WARN: Removed duplicated region for block: B:96:0x013e  */
                            /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
                            @Override // X.C1P1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r21) {
                                /*
                                    Method dump skipped, instructions count: 604
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C5LC.onSuccess(java.lang.Object):void");
                            }

                            @Override // X.C1P1
                            public final void onFail(AbstractC115105If abstractC115105If) {
                                int A032 = C0f9.A03(1105788208);
                                super.onFail(abstractC115105If);
                                VT8.A00(abstractC12990ll, C05F.A01, Integer.valueOf(i), "failed_fetch_instructions", i2);
                                c1hm.A05.release();
                                C0f9.A0A(-1033418420, A032);
                            }
                        };
                        C1GJ.A02(A0N);
                    }
                }
            });
        }
        InterfaceC27191Tt startRequest = this.A02.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    public C1HL(AbstractC12990ll abstractC12990ll, C1G4 c1g4) {
        C1HM c1hm;
        this.A00 = abstractC12990ll;
        this.A02 = c1g4;
        synchronized (C1HM.class) {
            c1hm = C1HM.A06;
            if (c1hm == null) {
                c1hm = new C1HM(AbstractC19730y1.A00(AbstractC12960li.A00));
                C1HM.A06 = c1hm;
            }
        }
        this.A01 = c1hm;
        String A00 = C1HO.A00();
        C14360o3.A07(A00);
        this.A03 = A00;
    }
}
