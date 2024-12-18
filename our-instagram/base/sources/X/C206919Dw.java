package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.notifications.badging.impl.BadgingApiImpl;
import com.instagram.notifications.badging.ui.component.ToastingBadge;
import com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206919Dw extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206919Dw(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        double d;
        Double A0m;
        Object obj;
        EnumC58122lU enumC58122lU;
        Object A03;
        String str;
        AbstractC12990ll abstractC12990ll;
        C06090Tz c06090Tz;
        long j;
        switch (this.A00) {
            case 0:
                String str2 = ((C5HX) this.A01).A0k;
                if (str2 == null) {
                    return null;
                }
                if (!AbstractC001900j.A0a(str2, "://", false)) {
                    str2 = AnonymousClass001.A0R("ig://", str2);
                }
                return AbstractC08820cl.A01(C5HX.A1I, str2);
            case 1:
                return Long.valueOf(((long) ((Number) ((C5HX) this.A01).A1H.getValue()).doubleValue()) * 1000);
            case 2:
                String str3 = ((C5HX) this.A01).A0q;
                if (str3 != null && (A0m = AnonymousClass010.A0m(str3)) != null) {
                    d = A0m.doubleValue();
                } else {
                    d = 0.0d;
                }
                return Double.valueOf(d);
            case 3:
                return new C132515ya((UserSession) this.A01);
            case 4:
                return new C54432ex[((InterfaceC19390xP[]) this.A01).length];
            case 5:
                final UserSession userSession = (UserSession) this.A01;
                C14360o3.A0B(userSession, 0);
                Context A06 = userSession.deviceSession.A06();
                HashMap hashMap = AbstractC54352ep.A00;
                hashMap.put(C19L.class, C2SW.A00);
                C06090Tz c06090Tz2 = C06090Tz.A05;
                if (C18U.A06(c06090Tz2, userSession, 36310662838092002L)) {
                    obj = userSession.A01(C54382es.class, C54372er.A00);
                } else {
                    obj = AbstractC22794A3n.A00;
                }
                hashMap.put(InterfaceC54362eq.class, obj);
                C54402eu c54402eu = new C54402eu(userSession);
                Object obj2 = hashMap.get(InterfaceC54362eq.class);
                if (obj2 != null) {
                    hashMap.put(C54392et.class, new C54392et(c54402eu, (InterfaceC54362eq) obj2));
                    Object obj3 = hashMap.get(InterfaceC54362eq.class);
                    if (obj3 != null) {
                        hashMap.put(C54412ev.class, new C54412ev(userSession, (InterfaceC54362eq) obj3));
                        hashMap.put(C54452ez.class, new C54452ez(userSession));
                        Object obj4 = hashMap.get(C54452ez.class);
                        String A00 = AbstractC111324zv.A00(2790);
                        if (obj4 != null) {
                            hashMap.put(C54462f0.class, new C54462f0(A06, userSession, (C54452ez) obj4));
                            hashMap.put(BadgingApiImpl.class, new BadgingApiImpl(new C54572fF(A06), userSession));
                            hashMap.put(C54592fH.class, new C54592fH(userSession));
                            Object obj5 = hashMap.get(C54462f0.class);
                            if (obj5 != null) {
                                C54462f0 c54462f0 = (C54462f0) obj5;
                                Object obj6 = hashMap.get(BadgingApiImpl.class);
                                if (obj6 != null) {
                                    BadgingApiImpl badgingApiImpl = (BadgingApiImpl) obj6;
                                    final C54622fK A002 = AbstractC54612fJ.A00(userSession);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put(EnumC54222eY.A09, A002);
                                    Iterator it = AbstractC54422ew.A00.iterator();
                                    while (it.hasNext()) {
                                        linkedHashMap.put(it.next(), A002);
                                    }
                                    if (C18U.A06(c06090Tz2, userSession, 36321438911571395L) || C18U.A06(C06090Tz.A06, userSession, 36322628616661367L)) {
                                        linkedHashMap.put(EnumC54222eY.A0U, AbstractC107254sW.A00(userSession));
                                    }
                                    LinkedHashMap A04 = AbstractC06930Yk.A04(linkedHashMap, AbstractC06930Yk.A05(new C09530e4(EnumC54222eY.A0Q, new InterfaceC54632fL(userSession, A002) { // from class: X.2fM
                                        public final UserSession A00;
                                        public final C54622fK A01;

                                        {
                                            C14360o3.A0B(A002, 2);
                                            this.A00 = userSession;
                                            this.A01 = A002;
                                        }

                                        @Override // X.InterfaceC54632fL
                                        public final void AHc(InterfaceC54232eZ interfaceC54232eZ) {
                                        }

                                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
                                        
                                            if (X.C18U.A06(r7, r8, 36324338013712507L) == false) goto L15;
                                         */
                                        /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
                                        
                                            if (r10 >= (java.lang.System.currentTimeMillis() - X.C18U.A01(r7, r8, 36605812990350686L))) goto L20;
                                         */
                                        @Override // X.InterfaceC54632fL
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void AfE(X.InterfaceC54232eZ r14, X.C89573yx r15, X.C54432ex r16) {
                                            /*
                                                r13 = this;
                                                r0 = 0
                                                X.C14360o3.A0B(r14, r0)
                                                X.2eY r4 = X.EnumC54222eY.A0Q
                                                if (r14 != r4) goto L8f
                                                com.instagram.common.session.UserSession r8 = r13.A00
                                                boolean r0 = X.AbstractC54792fc.A04(r8)
                                                r12 = 0
                                                if (r0 != 0) goto L90
                                                X.2Ia r1 = X.C2IZ.A04
                                                java.lang.String r0 = r8.userId
                                                X.2IZ r0 = r1.A00(r0)
                                                X.3Kr r0 = r0.A00()
                                                X.3Kq r0 = r0.A00
                                                int r6 = r0.A02
                                            L21:
                                                X.2fK r0 = r13.A01
                                                X.2ex r0 = r0.A00
                                                int r5 = r0.A00
                                                X.0Tz r7 = X.C06090Tz.A05
                                                r0 = 36324338013581434(0x810ccb0000307a, double:3.0349958539333684E-306)
                                                boolean r0 = X.C18U.A06(r7, r8, r0)
                                                if (r0 == 0) goto L82
                                                X.2hJ r0 = X.C55772hI.A00(r8)
                                                java.lang.String r1 = r0.A05
                                                X.1QO r0 = X.C1QO.A0C
                                                java.lang.String r0 = r0.toString()
                                                boolean r0 = X.C14360o3.A0K(r1, r0)
                                                if (r0 != 0) goto L82
                                                X.1Ai r0 = X.AbstractC23021Ah.A00(r8)
                                                X.0xq r1 = r0.A01
                                                java.lang.String r0 = "last_home_visit_time"
                                                r2 = 0
                                                long r10 = r1.getLong(r0, r2)
                                                int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                                                if (r0 != 0) goto L64
                                                r0 = 36324338013712507(0x810ccb0002307b, double:3.0349958540162595E-306)
                                                boolean r0 = X.C18U.A06(r7, r8, r0)
                                                r9 = 1
                                                if (r0 != 0) goto L65
                                            L64:
                                                r9 = 0
                                            L65:
                                                int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                                                if (r0 <= 0) goto L7c
                                                long r2 = java.lang.System.currentTimeMillis()
                                                r0 = 36605812990350686(0x820ccb0001155e, double:3.213001762651001E-306)
                                                long r0 = X.C18U.A01(r7, r8, r0)
                                                long r2 = r2 - r0
                                                int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                                                r0 = 1
                                                if (r1 < 0) goto L7d
                                            L7c:
                                                r0 = 0
                                            L7d:
                                                if (r9 != 0) goto L81
                                                if (r0 == 0) goto L82
                                            L81:
                                                r12 = 1
                                            L82:
                                                int r5 = r5 + r6
                                                int r5 = r5 + r12
                                                r0 = 0
                                                X.2ex r1 = new X.2ex
                                                r1.<init>(r4, r0, r5, r5)
                                                X.1Ds r0 = r15.A00
                                                r0.resumeWith(r1)
                                            L8f:
                                                return
                                            L90:
                                                r6 = 0
                                                goto L21
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: X.C54642fM.AfE(X.2eZ, X.3yx, X.2ex):void");
                                        }
                                    }), new C09530e4(EnumC54222eY.A0Z, new InterfaceC54632fL(userSession) { // from class: X.2fN
                                        public final UserSession A00;

                                        @Override // X.InterfaceC54632fL
                                        public final void AHc(InterfaceC54232eZ interfaceC54232eZ) {
                                        }

                                        @Override // X.InterfaceC54632fL
                                        public final void AfE(InterfaceC54232eZ interfaceC54232eZ, C89573yx c89573yx, C54432ex c54432ex) {
                                            C14360o3.A0B(interfaceC54232eZ, 0);
                                            EnumC54222eY enumC54222eY = EnumC54222eY.A0Z;
                                            if (interfaceC54232eZ == enumC54222eY) {
                                                UserSession userSession2 = this.A00;
                                                int A003 = AbstractC71963Ku.A00(userSession2);
                                                if (AbstractC54472f1.A03()) {
                                                    A003 = C3Ks.A01.A05(userSession2, true);
                                                }
                                                c89573yx.A00.resumeWith(new C54432ex(enumC54222eY, null, A003, A003));
                                            }
                                        }

                                        {
                                            this.A00 = userSession;
                                        }
                                    })));
                                    Object obj7 = hashMap.get(C54452ez.class);
                                    if (obj7 != null) {
                                        C54662fO c54662fO = new C54662fO((C54452ez) obj7);
                                        Object obj8 = hashMap.get(C19L.class);
                                        String A003 = AbstractC111324zv.A00(2806);
                                        if (obj8 != null) {
                                            C19L c19l = (C19L) obj8;
                                            Object obj9 = hashMap.get(C54452ez.class);
                                            if (obj9 != null) {
                                                C54452ez c54452ez = (C54452ez) obj9;
                                                Object obj10 = hashMap.get(C54592fH.class);
                                                if (obj10 != null) {
                                                    hashMap.put(C54602fI.class, new C54602fI(A06, userSession, c54462f0, c54662fO, badgingApiImpl, c54452ez, (C54592fH) obj10, A04, c19l));
                                                    hashMap.put(C54672fP.class, new C54672fP());
                                                    Object obj11 = hashMap.get(C54602fI.class);
                                                    if (obj11 != null) {
                                                        C54602fI c54602fI = (C54602fI) obj11;
                                                        Object obj12 = hashMap.get(C54392et.class);
                                                        if (obj12 != null) {
                                                            C54392et c54392et = (C54392et) obj12;
                                                            Object obj13 = hashMap.get(C54412ev.class);
                                                            if (obj13 != null) {
                                                                C54412ev c54412ev = (C54412ev) obj13;
                                                                Object obj14 = hashMap.get(C54452ez.class);
                                                                if (obj14 != null) {
                                                                    C54452ez c54452ez2 = (C54452ez) obj14;
                                                                    Object obj15 = hashMap.get(C19L.class);
                                                                    if (obj15 != null) {
                                                                        C19L c19l2 = (C19L) obj15;
                                                                        Object obj16 = hashMap.get(C54672fP.class);
                                                                        if (obj16 != null) {
                                                                            hashMap.put(C54682fQ.class, new C54682fQ(c54392et, c54412ev, c54452ez2, c54602fI, (C54672fP) obj16, c19l2));
                                                                            return new C54702fS();
                                                                        }
                                                                        throw new NullPointerException("null cannot be cast to non-null type com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeUiState");
                                                                    }
                                                                    throw new NullPointerException(A003);
                                                                }
                                                                throw new NullPointerException(A00);
                                                            }
                                                            throw new NullPointerException(AbstractC111324zv.A00(2789));
                                                        }
                                                        throw new NullPointerException(AbstractC111324zv.A00(2788));
                                                    }
                                                    throw new NullPointerException(MSV.A00(240));
                                                }
                                                throw new NullPointerException("null cannot be cast to non-null type com.instagram.notifications.badging.intf.ActivityFeedLocalNotificationBadgingRefresher");
                                            }
                                            throw new NullPointerException(A00);
                                        }
                                        throw new NullPointerException(A003);
                                    }
                                    throw new NullPointerException(A00);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.instagram.notifications.badging.api.BadgingApi");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.instagram.notifications.badging.graph.UseCaseGraph");
                        }
                        throw new NullPointerException(A00);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgeLoggingDeBouncer");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgeLoggingDeBouncer");
            case 6:
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                C54432ex c54432ex = (C54432ex) this.A01;
                sb2.append(c54432ex.A03);
                sb2.append('(');
                int i = c54432ex.A01;
                sb2.append(i);
                sb2.append("),");
                sb.append(sb2.toString());
                List<C54432ex> list = c54432ex.A04;
                if (list != null) {
                    for (C54432ex c54432ex2 : list) {
                        int i2 = c54432ex2.A01;
                        if (i2 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(c54432ex2.A03);
                            sb3.append('(');
                            sb3.append(i2);
                            sb3.append("),");
                            sb.append(sb3.toString());
                        }
                    }
                }
                sb.append(AnonymousClass001.A0O("totalCount=", i + c54432ex.A00));
                return sb.toString();
            case 7:
                return ((View) this.A01).findViewById(R.id.container);
            case 8:
                AbstractC58112lT abstractC58112lT = (AbstractC58112lT) this.A01;
                boolean z = abstractC58112lT.A09;
                C09530e4[] c09530e4Arr = new C09530e4[4];
                EnumC58122lU enumC58122lU2 = EnumC58122lU.A08;
                if (z) {
                    c09530e4Arr[0] = new C09530e4(enumC58122lU2, AbstractC58112lT.A02(abstractC58112lT));
                    c09530e4Arr[1] = new C09530e4(EnumC58122lU.A03, AbstractC58112lT.A00(abstractC58112lT));
                    c09530e4Arr[2] = new C09530e4(EnumC58122lU.A07, AbstractC58112lT.A02(abstractC58112lT));
                    enumC58122lU = EnumC58122lU.A05;
                    A03 = AbstractC58112lT.A01(abstractC58112lT);
                } else {
                    c09530e4Arr[0] = new C09530e4(enumC58122lU2, AbstractC58112lT.A05(abstractC58112lT));
                    c09530e4Arr[1] = new C09530e4(EnumC58122lU.A03, AbstractC58112lT.A04(abstractC58112lT));
                    c09530e4Arr[2] = new C09530e4(EnumC58122lU.A07, AbstractC58112lT.A05(abstractC58112lT));
                    enumC58122lU = EnumC58122lU.A05;
                    A03 = AbstractC58112lT.A03(abstractC58112lT);
                }
                c09530e4Arr[3] = new C09530e4(enumC58122lU, A03);
                return AbstractC06930Yk.A06(c09530e4Arr);
            case 9:
                return AbstractC56372iV.A00(AbstractC58112lT.A00((AbstractC58112lT) this.A01)).getView();
            case 10:
                return ((View) this.A01).findViewById(R.id.led_badge_view_stub);
            case 11:
                return AbstractC56372iV.A00(AbstractC58112lT.A01((AbstractC58112lT) this.A01)).getView();
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((View) this.A01).findViewById(R.id.number_badge_view_stub);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return AbstractC56372iV.A00(AbstractC58112lT.A02((AbstractC58112lT) this.A01)).getView();
            case 14:
                return ((View) this.A01).findViewById(R.id.dot_badge_view_stub);
            case Process.SIGTERM /* 15 */:
                AbstractC58112lT abstractC58112lT2 = (AbstractC58112lT) this.A01;
                C54682fQ viewModelFactory = ((ToastingBadge) abstractC58112lT2).getViewModelFactory();
                EnumC58122lU enumC58122lU3 = abstractC58112lT2.A03;
                EnumC58122lU enumC58122lU4 = abstractC58112lT2.A04;
                EnumC58122lU enumC58122lU5 = abstractC58112lT2.A06;
                EnumC58122lU enumC58122lU6 = abstractC58112lT2.A05;
                int i3 = abstractC58112lT2.A00;
                boolean z2 = abstractC58112lT2.A0D;
                boolean z3 = abstractC58112lT2.A0E;
                C57518Pfs c57518Pfs = new C57518Pfs(abstractC58112lT2, 32);
                C14360o3.A0B(enumC58122lU3, 0);
                C14360o3.A0B(enumC58122lU5, 2);
                C14360o3.A0B(enumC58122lU6, 3);
                InterfaceC54232eZ interfaceC54232eZ = viewModelFactory.A01;
                if (interfaceC54232eZ != null) {
                    boolean z4 = viewModelFactory.A02;
                    EnumC58162lY enumC58162lY = viewModelFactory.A00;
                    if (enumC58162lY != null) {
                        C54392et c54392et2 = viewModelFactory.A03;
                        C54412ev c54412ev2 = viewModelFactory.A04;
                        C54602fI c54602fI2 = viewModelFactory.A06;
                        C19L c19l3 = viewModelFactory.A08;
                        C54672fP c54672fP = viewModelFactory.A07;
                        UserSession userSession2 = viewModelFactory.A05.A00;
                        return new C58172lZ(c54392et2, c54412ev2, enumC58122lU3, enumC58122lU4, enumC58122lU5, enumC58122lU6, enumC58162lY, interfaceC54232eZ, c54602fI2, c54672fP, c57518Pfs, c19l3, i3, (int) TimeUnit.SECONDS.toMillis((int) C18U.A01(r6, userSession2, 36591888706502702L)), z2, z3, z4, C18U.A06(C06090Tz.A05, userSession2, 36310662838354150L));
                    }
                    str = "badgeLocation";
                } else {
                    str = "useCase";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 16:
                Object obj17 = AbstractC54352ep.A00.get(C54682fQ.class);
                if (obj17 != null) {
                    C54682fQ c54682fQ = (C54682fQ) obj17;
                    ToastingBadge toastingBadge = (ToastingBadge) this.A01;
                    c54682fQ.A01 = toastingBadge.getUseCase();
                    EnumC58162lY enumC58162lY2 = toastingBadge.A01;
                    C14360o3.A0B(enumC58162lY2, 0);
                    c54682fQ.A00 = enumC58162lY2;
                    c54682fQ.A02 = toastingBadge.A02;
                    return c54682fQ;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel.Factory");
            case 17:
                return ((C1X9) this.A01).A01.A01().keySet();
            case 18:
                return Integer.valueOf(AbstractC06950Ym.A1F(AbstractC001800i.A0a(((C71783Kb) this.A01).A06.A05.values())).size());
            case Process.SIGSTOP /* 19 */:
                AnonymousClass971 anonymousClass971 = (AnonymousClass971) this.A01;
                anonymousClass971.A04.A00(anonymousClass971.A03, new C23990AkQ(anonymousClass971));
                return C0eB.A00;
            case 20:
                abstractC12990ll = ((C50232Sp) this.A01).A02;
                c06090Tz = C06090Tz.A05;
                j = 36330140514403032L;
                break;
            case 21:
                return new AnonymousClass945((UserSession) this.A01);
            case 22:
                C94T c94t = (C94T) this.A01;
                Object value = c94t.A00.getValue();
                C14360o3.A07(value);
                return new C23380AYe((C0JM) value, null, (C73593Rl) c94t.A06.getValue(), false, "P_DELAYED_CTA_FEATURES");
            case 23:
                C1M7 A01 = C1M7.A01();
                C14360o3.A07(A01);
                C3Ri c3Ri = new C3Ri(new C73563Rh(A01).A00());
                Object value2 = ((C94T) this.A01).A00.getValue();
                C14360o3.A07(value2);
                return new C73593Rl((C0JM) value2, c3Ri);
            case 24:
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A01;
                C14360o3.A0B(abstractC12990ll2, 0);
                return ((C2048494s) abstractC12990ll2.A01(C2048494s.class, new C57510Pfk(abstractC12990ll2, 28))).A00;
            case 25:
                return new C73633Rp((UserSession) this.A01);
            case 26:
                UserSession userSession3 = ((C73633Rp) this.A01).A00;
                return ((C3SP) userSession3.A01(C3SP.class, new C57545PgJ(userSession3, 16))).A03.getValue();
            case 27:
                return new AnonymousClass947(((C94Z) this.A01).A00);
            case 28:
                return C94J.A00(((C94Z) this.A01).A00).A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                UserSession userSession4 = ((C94Z) this.A01).A00;
                C14360o3.A0B(userSession4, 0);
                return ((O8M) userSession4.A01(O8M.class, new C57510Pfk(userSession4, 33))).A00;
            case 30:
                return new C2048694u((UserSession) this.A01);
            case 31:
                return Long.valueOf(C18U.A01(C06090Tz.A05, ((C61672rU) this.A01).A01, 36599228806991331L));
            case 32:
                return C4CY.A00(((C61672rU) this.A01).A01);
            case 33:
                return Double.valueOf(C18U.A00(C06090Tz.A05, ((C61672rU) this.A01).A01, 37162178759164125L));
            case 34:
                abstractC12990ll = ((C61672rU) this.A01).A01;
                c06090Tz = C06090Tz.A05;
                j = 2342160763044828700L;
                break;
            case 35:
                return Long.valueOf(C18U.A01(C06090Tz.A05, ((C61672rU) this.A01).A01, 36599228805811679L));
            case 36:
                abstractC12990ll = ((C61672rU) this.A01).A01;
                c06090Tz = C06090Tz.A05;
                j = 2342160763045221922L;
                break;
            case 37:
                abstractC12990ll = ((C61672rU) this.A01).A01;
                c06090Tz = C06090Tz.A05;
                j = 36317753831396896L;
                break;
            case 38:
                abstractC12990ll = ((C61672rU) this.A01).A01;
                c06090Tz = C06090Tz.A05;
                j = 2342160763045156385L;
                break;
            case 39:
                abstractC12990ll = ((C61672rU) this.A01).A01;
                c06090Tz = C06090Tz.A05;
                j = 2342160763045287459L;
                break;
            case 40:
                abstractC12990ll = ((C61672rU) this.A01).A01;
                c06090Tz = C06090Tz.A05;
                j = 36317753831200285L;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                abstractC12990ll = ((C61672rU) this.A01).A01;
                c06090Tz = C06090Tz.A05;
                j = 36317753830675989L;
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                AbstractC12990ll abstractC12990ll3 = (AbstractC12990ll) this.A01;
                C14360o3.A0B(abstractC12990ll3, 0);
                return ((C2048594t) abstractC12990ll3.A01(C2048594t.class, new C57510Pfk(abstractC12990ll3, 38))).A00;
            case 43:
                return new AnonymousClass946((UserSession) this.A01);
            case 44:
                return new C5MI((UserSession) this.A01);
            case 45:
                C13920nI c13920nI = C13920nI.A00;
                InterfaceC14020nS A004 = C14120nc.A00();
                C14360o3.A07(A004);
                C14360o3.A0B(c13920nI, 1);
                ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(new C18220v9(c13920nI, A004), 232754083, 2, false, true);
                UserSession userSession5 = (UserSession) this.A01;
                C06090Tz c06090Tz3 = C06090Tz.A05;
                int A012 = (int) C18U.A01(c06090Tz3, userSession5, 36608639079618310L);
                boolean A062 = C18U.A06(c06090Tz3, userSession5, 36327164103768400L);
                int A013 = (int) C18U.A01(c06090Tz3, userSession5, 36608639080535819L);
                boolean A063 = C18U.A06(c06090Tz3, userSession5, 36327164102850888L);
                boolean A064 = C18U.A06(c06090Tz3, userSession5, 36327164103899473L);
                int A014 = (int) C18U.A01(c06090Tz3, userSession5, 36608639079487237L);
                boolean A065 = C18U.A06(c06090Tz3, userSession5, 36327164104423768L);
                boolean z5 = false;
                if (A014 != 0) {
                    z5 = true;
                }
                return new C1D3(new C1D8((int) C18U.A01(c06090Tz3, userSession5, 36608639080273673L), (int) C18U.A01(c06090Tz3, userSession5, 36608639080339210L), (int) C18U.A01(c06090Tz3, userSession5, 36608639080077064L), z5, C18U.A06(c06090Tz3, userSession5, 36327164103309645L), C18U.A06(c06090Tz3, userSession5, 36327164103506255L), C18U.A06(c06090Tz3, userSession5, 36327164103440718L)), userSession5, executorC14040nU, A012, A013, A014, A062, A064, A063, A065);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                abstractC12990ll = ((SimCarrierInfoLogger) this.A01).A00;
                c06090Tz = C06090Tz.A05;
                j = 36326558511675356L;
                break;
            case 47:
                return AbstractC12220kQ.A02(((SimCarrierInfoLogger) this.A01).A00);
            case 48:
                return Long.valueOf(((int) C18U.A01(C06090Tz.A05, ((SimCarrierInfoLogger) this.A01).A00, 36602583174943433L)) * 3600000);
            default:
                return new C87743vi((Context) this.A01);
        }
        return Boolean.valueOf(C18U.A06(c06090Tz, abstractC12990ll, j));
    }
}
