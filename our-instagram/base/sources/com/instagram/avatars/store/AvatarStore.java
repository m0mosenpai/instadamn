package com.instagram.avatars.store;

import X.AbstractC001800i;
import X.AbstractC25651Mw;
import X.AbstractC40511uK;
import X.AbstractC40691uc;
import X.AbstractC439521d;
import X.AbstractC439921h;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C125515lx;
import X.C125525ly;
import X.C125535lz;
import X.C125545m0;
import X.C126475ni;
import X.C143306dV;
import X.C14360o3;
import X.C18U;
import X.C1P1;
import X.C206999Ee;
import X.C214629f0;
import X.C21B;
import X.C21C;
import X.C25671My;
import X.C2JM;
import X.C2JQ;
import X.C439421c;
import X.C439821g;
import X.C440921r;
import X.C441021s;
import X.C441221u;
import X.C9BC;
import X.C9FN;
import X.EnumC143276dS;
import X.InterfaceC13000lm;
import X.InterfaceC16660sJ;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.InterfaceC41501vz;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.avatars.status.AvatarStatusRepository;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Deprecated;

/* loaded from: classes.dex */
public final class AvatarStore implements InterfaceC13000lm {
    public C9BC A00;
    public AbstractC439521d A01;
    public final AvatarStatusRepository A02;
    public final C25671My A03;
    public final InterfaceC41501vz A04;
    public final InterfaceC41501vz A05;
    public final InterfaceC41501vz A06;
    public final UserSession A07;
    public final C21C A08;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = r7 instanceof X.C206449Cb
            if (r0 == 0) goto L8c
            r5 = r7
            X.9Cb r5 = (X.C206449Cb) r5
            int r0 = r5.A04
            if (r0 != r3) goto L8c
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r4 = r5.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L60
            if (r0 != r3) goto Lb9
            boolean r9 = r5.A03
            java.lang.Object r1 = r5.A01
            com.instagram.avatars.store.AvatarStore r1 = (com.instagram.avatars.store.AvatarStore) r1
            X.AbstractC09560e7.A00(r4)
        L2b:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L56
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r3 = r4.A00
            X.5lx r3 = (X.C125515lx) r3
            if (r3 == 0) goto L53
            X.5lz r2 = X.C125535lz.A00
        L3b:
            com.instagram.common.session.UserSession r1 = r1.A07
            com.instagram.avatars.store.AvatarStore r0 = X.C20Y.A00(r1)
            X.21d r0 = A00(r3, r2, r0, r1, r9)
            X.3NX r4 = new X.3NX
            r4.<init>(r0)
        L4a:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L92
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r2 = r4.A00
        L52:
            return r2
        L53:
            X.5ly r2 = X.C125525ly.A00
            goto L3b
        L56:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L4a
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L60:
            X.AbstractC09560e7.A00(r4)
            X.21d r1 = r6.A01
            X.21c r0 = X.C439421c.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L7c
            X.21d r1 = r6.A01
            X.9f0 r0 = X.C214629f0.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L7c
            if (r8 != 0) goto L7c
            X.21d r2 = r6.A01
            return r2
        L7c:
            com.instagram.avatars.status.AvatarStatusRepository r0 = r6.A02
            r5.A01 = r6
            r5.A03 = r9
            r5.A00 = r3
            java.lang.Object r4 = r0.A00(r5)
            if (r4 == r2) goto L52
            r1 = r6
            goto L2b
        L8c:
            X.9Cb r5 = new X.9Cb
            r5.<init>(r6, r7, r3)
            goto L17
        L92:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lb3
            X.8jk r4 = (X.C194848jk) r4
            java.lang.Object r2 = r4.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error checkHasAvatar -> "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AvatarStore"
            X.C0w9.A03(r0, r1)
            X.21c r2 = X.C439421c.A00
            return r2
        Lb3:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Lb9:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.store.AvatarStore.A02(X.1Ds, boolean, boolean):java.lang.Object");
    }

    public final void A05(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        final AvatarStatusRepository avatarStatusRepository = this.A02;
        final C9FN c9fn = new C9FN(1, userSession, this, interfaceC16660sJ);
        C1P1 c1p1 = new C1P1() { // from class: X.6dU
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-2091416322);
                C14360o3.A0B(abstractC115105If, 0);
                c9fn.invoke(null, abstractC115105If.A01());
                C0f9.A0A(893842115, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                C2JS optionalTreeField;
                C2JS optionalTreeField2;
                C125505lw c125505lw;
                Integer num;
                String str;
                boolean z;
                EnumC61206Rh6 enumC61206Rh6;
                int A03 = C0f9.A03(500283663);
                AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
                int A032 = C0f9.A03(285579810);
                C14360o3.A0B(anonymousClass435, 0);
                C2JS c2js = (C2JS) anonymousClass435.A01;
                if (c2js != null && (optionalTreeField = c2js.getOptionalTreeField(0, "viewer", C125485lu.class, -518179601)) != null && (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C125495lv.class, 1022275758)) != null && (c125505lw = (C125505lw) optionalTreeField2.getOptionalTreeField(0, "user_avatar", C125505lw.class, -417973107)) != null) {
                    String optionalStringField = c125505lw.getOptionalStringField(0, "strong_id__");
                    String optionalStringField2 = c125505lw.getOptionalStringField(1, "config_hash");
                    C58568Pxk A0E = c125505lw.A0E();
                    if (A0E != null && (enumC61206Rh6 = (EnumC61206Rh6) A0E.getOptionalEnumField(1, "avatar_style", EnumC61206Rh6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null) {
                        int ordinal = enumC61206Rh6.ordinal();
                        if (ordinal != -1 && ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    num = C05F.A0C;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                num = C05F.A01;
                            }
                        } else {
                            num = C05F.A00;
                        }
                    } else {
                        num = null;
                    }
                    C58568Pxk A0E2 = c125505lw.A0E();
                    if (A0E2 != null) {
                        str = A0E2.getOptionalStringField(0, "avatar_revision");
                    } else {
                        str = null;
                    }
                    C58568Pxk A0E3 = c125505lw.A0E();
                    if (A0E3 != null) {
                        z = A0E3.getCoercedBooleanField(2, "is_convergence_2_auto_migrated");
                    } else {
                        z = false;
                    }
                    if (optionalStringField != null && optionalStringField.length() != 0 && optionalStringField2 != null && optionalStringField2.length() != 0 && !optionalStringField2.equals("0")) {
                        c9fn.invoke(new C125515lx(num, optionalStringField, optionalStringField2, str, z), null);
                        C0f9.A0A(2087972613, A032);
                        C0f9.A0A(1788742748, A03);
                    }
                }
                c9fn.invoke(null, null);
                C0f9.A0A(2087972613, A032);
                C0f9.A0A(1788742748, A03);
            }
        };
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        AbstractC40691uc.A01(avatarStatusRepository.A00).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "HasAvatarQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C143306dV.class, false, null, 0, null, "viewer", new ArrayList()), c1p1);
    }

    public static final AbstractC439521d A00(C125515lx c125515lx, AbstractC439921h abstractC439921h, AvatarStore avatarStore, UserSession userSession, boolean z) {
        AbstractC439521d abstractC439521d;
        if (z) {
            C21C c21c = avatarStore.A08;
            C14360o3.A0B(userSession, 0);
            EnumC143276dS[] values = EnumC143276dS.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (EnumC143276dS enumC143276dS : values) {
                arrayList.add(enumC143276dS.A00);
            }
            Set<String> A0j = AbstractC001800i.A0j(arrayList);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36317771008644661L)) {
                A0j.add(C18U.A04(c06090Tz, userSession, 36880720961995109L));
                A0j.add(C18U.A04(c06090Tz, userSession, 36880720962126182L));
            }
            if (C18U.A06(c06090Tz, userSession, 36318630002039153L)) {
                A0j.add(C18U.A04(c06090Tz, userSession, 36881579955519876L));
                A0j.add(C18U.A04(c06090Tz, userSession, 36881579955585413L));
                A0j.add(C18U.A04(c06090Tz, userSession, 36881579955716487L));
                A0j.add(C18U.A04(c06090Tz, userSession, 36881579955650950L));
            }
            for (String str : A0j) {
                C14360o3.A0B(str, 1);
                InterfaceC19610xo ARD = c21c.A00.ARD();
                ARD.E77(AnonymousClass001.A0R("KEY_FORCE_CACHE_REQUEST", str), true);
                ARD.apply();
            }
            InterfaceC19630xq interfaceC19630xq = c21c.A00;
            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
            ARD2.E77("KEY_AVATAR_GLOBAL_SEARCH_FORCE_NETWORK_REQUEST", true);
            ARD2.apply();
            InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
            ARD3.E77("KEY_AVATAR_PROFILE_STICKERS_FORCE_NETWORK_REQUEST", true);
            ARD3.apply();
            InterfaceC19610xo ARD4 = interfaceC19630xq.ARD();
            ARD4.E7K("key_user_avatar_version_pre_rendering_cache_map", null);
            ARD4.apply();
        }
        if (C14360o3.A0K(abstractC439921h, C125535lz.A00)) {
            if (c125515lx != null) {
                abstractC439521d = new C126475ni(c125515lx);
            } else {
                abstractC439521d = C214629f0.A00;
            }
        } else if (C14360o3.A0K(abstractC439921h, C125525ly.A00)) {
            abstractC439521d = C125545m0.A00;
        } else if (C14360o3.A0K(abstractC439921h, C439821g.A00)) {
            abstractC439521d = C439421c.A00;
        } else {
            throw new RuntimeException();
        }
        avatarStore.A01 = abstractC439521d;
        return abstractC439521d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 12
            boolean r0 = X.C9CW.A00(r6, r3)
            if (r0 == 0) goto L45
            r4 = r6
            X.9CW r4 = (X.C9CW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L4d
            X.AbstractC09560e7.A00(r1)
        L24:
            X.21d r1 = (X.AbstractC439521d) r1
        L26:
            X.21h r3 = r1.A00
            return r3
        L29:
            X.AbstractC09560e7.A00(r1)
            X.21d r0 = r5.A01
            X.21h r1 = r0.A00
            X.21g r0 = X.C439821g.A00
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L42
            r4.A00 = r2
            r0 = 0
            java.lang.Object r1 = r5.A02(r4, r0, r0)
            if (r1 != r3) goto L24
            return r3
        L42:
            X.21d r1 = r5.A01
            goto L26
        L45:
            r0 = 42
            X.9CW r4 = new X.9CW
            r4.<init>(r5, r6, r3, r0)
            goto L16
        L4d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.store.AvatarStore.A01(X.1Ds):java.lang.Object");
    }

    public final void A03() {
        A00(null, C125525ly.A00, this, this.A07, true);
        this.A00 = new C9BC(3, 0, false, false, true);
    }

    @Deprecated(message = "Use coroutine version.")
    public final void A04(InterfaceC16660sJ interfaceC16660sJ) {
        if (C14360o3.A0K(this.A01.A00, C439821g.A00)) {
            A05(new C206999Ee(interfaceC16660sJ, 35), this.A07);
        } else {
            interfaceC16660sJ.invoke(this.A01.A00);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C25671My c25671My = this.A03;
        c25671My.A02(this.A06, C440921r.class);
        c25671My.A02(this.A05, C441021s.class);
        c25671My.A02(this.A04, C441221u.class);
    }

    public /* synthetic */ AvatarStore(UserSession userSession) {
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        AvatarStatusRepository avatarStatusRepository = new AvatarStatusRepository(userSession, C21B.A00(userSession));
        C21C A002 = C21B.A00(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 2);
        C14360o3.A0B(A002, 4);
        this.A07 = userSession;
        this.A03 = A00;
        this.A02 = avatarStatusRepository;
        this.A08 = A002;
        this.A01 = C439421c.A00;
        this.A00 = new C9BC(7, 0, false, false, false);
        this.A06 = new InterfaceC41501vz() { // from class: X.21m
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1401126962);
                int A032 = C0f9.A03(-2134441008);
                AvatarStore avatarStore = AvatarStore.this;
                AvatarStore.A00(null, C125535lz.A00, avatarStore, avatarStore.A07, true);
                C19K A02 = AbstractC24771Iv.A02(973501692, 3);
                AbstractC23641Du.A05(AnonymousClass191.A00, new MBq(avatarStore, null, 22), A02);
                avatarStore.A00 = new C9BC(5, 0, false, true, false);
                C0f9.A0A(-1970018184, A032);
                C0f9.A0A(-545852730, A03);
            }
        };
        this.A04 = new InterfaceC41501vz() { // from class: X.21o
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1643989266);
                int A032 = C0f9.A03(1223352609);
                AvatarStore avatarStore = AvatarStore.this;
                AvatarStore.A00(null, C125535lz.A00, avatarStore, avatarStore.A07, true);
                C19K A02 = AbstractC24771Iv.A02(973501692, 3);
                C206639Cu c206639Cu = new C206639Cu(avatarStore, null, 8);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A02);
                avatarStore.A00 = new C9BC(6, 0, true, false, false);
                C0f9.A0A(-507181131, A032);
                C0f9.A0A(-1395022510, A03);
            }
        };
        this.A05 = new InterfaceC41501vz() { // from class: X.21p
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(740837047);
                int A032 = C0f9.A03(34520678);
                AvatarStore.this.A03();
                C0f9.A0A(909888204, A032);
                C0f9.A0A(-1185786090, A03);
            }
        };
    }
}
