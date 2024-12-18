package com.instagram.debug.devoptions.direct.burner;

import X.AbstractC001900j;
import X.AbstractC115105If;
import X.AbstractC12190kN;
import X.AbstractC151506rw;
import X.AbstractC165967bO;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.AbstractC34054F1h;
import X.AnonymousClass001;
import X.C0f9;
import X.C14360o3;
import X.C151516rx;
import X.C161867Mw;
import X.C1GJ;
import X.C1ON;
import X.C1P1;
import X.C25621Ms;
import X.C2AG;
import X.C2EC;
import X.C2JD;
import X.C32207EDg;
import X.C34793FUv;
import X.C4GO;
import X.C4LM;
import X.C7IP;
import X.C7IR;
import X.C7K9;
import X.C81663kb;
import X.InterfaceC16660sJ;
import X.InterfaceC40821up;
import X.InterfaceC83703oF;
import X.LL3;
import X.LLX;
import X.MR6;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsConfig;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.user.model.User;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BurnerSendSettingsHelper {
    public static final int $stable = 0;
    public static final Companion Companion = new Object();
    public static final int MESSAGE_SEND_BATCH_DELAY_IN_MS = 30000;
    public static final int MESSAGE_SEND_BATCH_SIZE = 50;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class BurnerResponse {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ BurnerResponse[] $VALUES;
        public final String errorMsg;
        public static final BurnerResponse NO_ERROR = new BurnerResponse("NO_ERROR", 0, "No error");
        public static final BurnerResponse INVALID_USERID = new BurnerResponse("INVALID_USERID", 1, "Could not find target user id");
        public static final BurnerResponse INVALID_FOLLOWING_STATUS = new BurnerResponse("INVALID_FOLLOWING_STATUS", 2, "Could not check if followed/following");
        public static final BurnerResponse NOT_FOLLOWING = new BurnerResponse("NOT_FOLLOWING", 3, "Target user is not followed/following");
        public static final BurnerResponse COULD_NOT_CREATE_THREAD = new BurnerResponse("COULD_NOT_CREATE_THREAD", 4, "Could not create thread");
        public static final BurnerResponse COULD_NOT_CREATE_THREAD_SERVER = new BurnerResponse("COULD_NOT_CREATE_THREAD_SERVER", 5, "Could not create thread (null threadId)");
        public static final BurnerResponse COULD_NOT_CUTOVER_THREAD = new BurnerResponse("COULD_NOT_CUTOVER_THREAD", 6, "Could not cutover thread");

        public static final /* synthetic */ BurnerResponse[] $values() {
            return new BurnerResponse[]{NO_ERROR, INVALID_USERID, INVALID_FOLLOWING_STATUS, NOT_FOLLOWING, COULD_NOT_CREATE_THREAD, COULD_NOT_CREATE_THREAD_SERVER, COULD_NOT_CUTOVER_THREAD};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        static {
            BurnerResponse[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
        }

        public static BurnerResponse valueOf(String str) {
            return (BurnerResponse) Enum.valueOf(BurnerResponse.class, str);
        }

        public static BurnerResponse[] values() {
            return (BurnerResponse[]) $VALUES.clone();
        }

        public BurnerResponse(String str, int i, String str2) {
            this.errorMsg = str2;
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }
    }

    /* loaded from: classes6.dex */
    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final void isFollowing(UserSession userSession, User user, final InterfaceC16660sJ interfaceC16660sJ) {
            AbstractC167007dF.A1K(user, userSession);
            C1ON A02 = AbstractC151506rw.A02(userSession, user.getId(), false);
            A02.A00 = new C1P1() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$isFollowing$task$1
                @Override // X.C1P1
                public void onFail(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(1733619832);
                    InterfaceC16660sJ.this.invoke(null);
                    C0f9.A0A(-1885729891, A03);
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
                
                    if (r5.A0E == false) goto L8;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onSuccess(X.C151516rx r5) {
                    /*
                        r4 = this;
                        r0 = -762786643(0xffffffffd288ccad, float:-2.9377472E11)
                        int r3 = X.AbstractC167017dG.A0N(r5, r0)
                        X.0sJ r2 = X.InterfaceC16660sJ.this
                        java.lang.Boolean r0 = r5.A02
                        if (r0 == 0) goto L18
                        boolean r0 = r0.booleanValue()
                        if (r0 == 0) goto L18
                        boolean r1 = r5.A0E
                        r0 = 1
                        if (r1 != 0) goto L19
                    L18:
                        r0 = 0
                    L19:
                        X.AbstractC25227BEk.A1Q(r2, r0)
                        r0 = -1921792206(0xffffffff8d73c732, float:-7.511993E-31)
                        X.C0f9.A0A(r0, r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$isFollowing$task$1.onSuccess(X.6rx):void");
                }

                @Override // X.C1P1
                public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(-1931276532);
                    onSuccess((C151516rx) obj);
                    C0f9.A0A(-794579605, A03);
                }
            };
            C1GJ.A04(A02, 809649118);
        }

        public final void createCutoverThreadAndSendMessage(Context context, UserSession userSession, BurnerSendSettingsConfig burnerSendSettingsConfig, InterfaceC16660sJ interfaceC16660sJ) {
            C14360o3.A0B(context, 0);
            AbstractC167027dH.A13(userSession, burnerSendSettingsConfig, interfaceC16660sJ);
            fetchUser(userSession, burnerSendSettingsConfig, new BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1(userSession, interfaceC16660sJ, context, burnerSendSettingsConfig));
        }

        public final void sendMessageToThread(UserSession userSession, InterfaceC83703oF interfaceC83703oF, final String str, BurnerSendSettingsConfig.MessageType messageType, int i) {
            AbstractC167007dF.A1D(userSession, 0, str);
            C14360o3.A0B(messageType, 3);
            final C7IR c7ir = new C7IR(userSession, new C7IP(null, "burner", "burner", null), null, AbstractC165967bO.A00(userSession), new BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$1(interfaceC83703oF), BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$2.INSTANCE, BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$3.INSTANCE, BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$4.INSTANCE, BurnerSendSettingsHelper$Companion$sendMessageToThread$sendController$5.INSTANCE);
            int i2 = (i / 50) + (AbstractC25230BEn.A1Q(i % 50) ? 1 : 0);
            for (int i3 = 0; i3 < i2; i3++) {
                final int i4 = i3 * 50;
                final int min = Math.min(i, i4 + 50);
                C1GJ.A05(new C2AG() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$sendMessageToThread$1$1
                    @Override // X.C11R
                    public int getRunnableId() {
                        return 1334005072;
                    }

                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        int i5 = min;
                        int i6 = i4;
                        int i7 = i5 - i6;
                        C7IR c7ir2 = c7ir;
                        String str2 = str;
                        for (int i8 = 0; i8 < i7; i8++) {
                            c7ir2.A02(null, null, null, null, null, null, null, AnonymousClass001.A0b(str2, ": test ", i8 + i6 + 1), null, null, null, false);
                        }
                        return null;
                    }
                }, 1334005072, 3, i3 * 30000, false, false);
            }
        }

        private final void fetchUser(UserSession userSession, BurnerSendSettingsConfig burnerSendSettingsConfig, final InterfaceC16660sJ interfaceC16660sJ) {
            String str = burnerSendSettingsConfig.targetUserId;
            if (str != null) {
                if (AbstractC001900j.A0T(str)) {
                    interfaceC16660sJ.invoke(null);
                } else {
                    C4LM.A02.A02(userSession, new C7K9() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$fetchUser$2$1
                        @Override // X.C7K9
                        public void onSuccess(User user) {
                            C14360o3.A0B(user, 0);
                            InterfaceC16660sJ.this.invoke(user);
                        }

                        @Override // X.C7K9
                        public void onFail(AbstractC115105If abstractC115105If) {
                            InterfaceC16660sJ.this.invoke(null);
                        }
                    }, str);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void ensureCutover(Context context, UserSession userSession, C2EC c2ec, boolean z, InterfaceC16660sJ interfaceC16660sJ) {
            if (C161867Mw.A02(c2ec.Aic())) {
                AbstractC25227BEk.A1Q(interfaceC16660sJ, true);
                return;
            }
            String C7I = c2ec.C7I();
            if (C7I == null) {
                return;
            }
            AbstractC34054F1h.A00(context, userSession, C7I, new BurnerSendSettingsHelper$Companion$ensureCutover$1$1(interfaceC16660sJ, c2ec, z), -1L, z, false, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void getOrCreateDirectThread(final UserSession userSession, User user, final InterfaceC16660sJ interfaceC16660sJ) {
            C81663kb BZR = C2JD.A00(userSession).BZR(null, null, null, C4GO.A01(AbstractC166987dD.A1J(user)));
            if (BZR.C7I() != null) {
                interfaceC16660sJ.invoke(BZR);
                return;
            }
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("direct_v2/threads/broadcast/text/");
            A0c.A0P(null, C32207EDg.class, C34793FUv.class, false);
            A0c.A9s("text", "create/bump thread");
            A0c.A9s("action", "send_item");
            LLX.A0A(A0c, BZR.BKb());
            C1ON A0N = A0c.A0N();
            A0N.A00 = new C1P1() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$getOrCreateDirectThread$task$1
                @Override // X.C1P1
                public void onFail(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(-1549410584);
                    InterfaceC16660sJ.this.invoke(null);
                    C0f9.A0A(-757347741, A03);
                }

                public void onSuccess(C32207EDg c32207EDg) {
                    int A0N2 = AbstractC167017dG.A0N(c32207EDg, 349323193);
                    String A01 = c32207EDg.A01();
                    if (A01 != null) {
                        UserSession userSession2 = userSession;
                        final InterfaceC16660sJ interfaceC16660sJ2 = InterfaceC16660sJ.this;
                        LL3.A03(userSession2, ThreadFetchReason.BURNER, new MR6() { // from class: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$getOrCreateDirectThread$task$1$onSuccess$1$1
                            @Override // X.MR6
                            public /* synthetic */ void onFailureInBackground(InterfaceC40821up interfaceC40821up) {
                            }

                            @Override // X.MR6
                            public /* synthetic */ void onStart() {
                            }

                            @Override // X.MR6
                            public /* synthetic */ void onSuccessInBackground(C2EC c2ec) {
                            }

                            @Override // X.MR6
                            public void onFailure() {
                                InterfaceC16660sJ.this.invoke(null);
                            }

                            @Override // X.MR6
                            public void onSuccess(C2EC c2ec) {
                                InterfaceC16660sJ.this.invoke(c2ec);
                            }
                        }, 20, A01, true);
                    } else {
                        InterfaceC16660sJ.this.invoke(null);
                    }
                    C0f9.A0A(1573124822, A0N2);
                }

                @Override // X.C1P1
                public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(-32031749);
                    onSuccess((C32207EDg) obj);
                    C0f9.A0A(2081912155, A03);
                }
            };
            C1GJ.A04(A0N, 744669200);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final void sendMessageToThread(UserSession userSession, InterfaceC83703oF interfaceC83703oF, String str, BurnerSendSettingsConfig.MessageType messageType, int i) {
        Companion.sendMessageToThread(userSession, interfaceC83703oF, str, messageType, i);
    }
}
