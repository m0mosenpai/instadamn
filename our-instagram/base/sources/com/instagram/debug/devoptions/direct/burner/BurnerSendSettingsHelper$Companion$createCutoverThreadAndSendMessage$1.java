package com.instagram.debug.devoptions.direct.burner;

import X.AbstractC166987dD;
import X.AbstractC31232DoF;
import X.C0YY;
import X.C0eB;
import X.C2EC;
import X.C4GO;
import X.InterfaceC16660sJ;
import X.InterfaceC83703oF;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ InterfaceC16660sJ $callback;
    public final /* synthetic */ BurnerSendSettingsConfig $config;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ UserSession $userSession;

    /* renamed from: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    public final class AnonymousClass1 extends C0YY implements InterfaceC16660sJ {
        public final /* synthetic */ InterfaceC16660sJ $callback;
        public final /* synthetic */ BurnerSendSettingsConfig $config;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ User $targetUser;
        public final /* synthetic */ UserSession $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession, User user, Context context, BurnerSendSettingsConfig burnerSendSettingsConfig) {
            super(1);
            this.$callback = interfaceC16660sJ;
            this.$userSession = userSession;
            this.$targetUser = user;
            this.$context = context;
            this.$config = burnerSendSettingsConfig;
        }

        public final void invoke(Boolean bool) {
            InterfaceC16660sJ interfaceC16660sJ;
            BurnerSendSettingsHelper.BurnerResponse burnerResponse;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    interfaceC16660sJ = this.$callback;
                    burnerResponse = BurnerSendSettingsHelper.BurnerResponse.NOT_FOLLOWING;
                } else {
                    BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
                    UserSession userSession = this.$userSession;
                    companion.getOrCreateDirectThread(userSession, this.$targetUser, new C00031(this.$context, userSession, this.$config, this.$callback));
                    return;
                }
            } else {
                interfaceC16660sJ = this.$callback;
                burnerResponse = BurnerSendSettingsHelper.BurnerResponse.INVALID_FOLLOWING_STATUS;
            }
            interfaceC16660sJ.invoke(burnerResponse);
        }

        /* renamed from: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public final class C00031 extends C0YY implements InterfaceC16660sJ {
            public final /* synthetic */ InterfaceC16660sJ $callback;
            public final /* synthetic */ BurnerSendSettingsConfig $config;
            public final /* synthetic */ Context $context;
            public final /* synthetic */ UserSession $userSession;

            /* renamed from: com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public final class C00041 extends C0YY implements InterfaceC16660sJ {
                public final /* synthetic */ InterfaceC16660sJ $callback;
                public final /* synthetic */ BurnerSendSettingsConfig $config;
                public final /* synthetic */ InterfaceC83703oF $threadTarget;
                public final /* synthetic */ UserSession $userSession;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00041(InterfaceC16660sJ interfaceC16660sJ, UserSession userSession, InterfaceC83703oF interfaceC83703oF, BurnerSendSettingsConfig burnerSendSettingsConfig) {
                    super(1);
                    this.$callback = interfaceC16660sJ;
                    this.$userSession = userSession;
                    this.$threadTarget = interfaceC83703oF;
                    this.$config = burnerSendSettingsConfig;
                }

                public final void invoke(boolean z) {
                    InterfaceC16660sJ interfaceC16660sJ;
                    BurnerSendSettingsHelper.BurnerResponse burnerResponse;
                    if (!z) {
                        interfaceC16660sJ = this.$callback;
                        burnerResponse = BurnerSendSettingsHelper.BurnerResponse.COULD_NOT_CUTOVER_THREAD;
                    } else {
                        BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
                        UserSession userSession = this.$userSession;
                        InterfaceC83703oF interfaceC83703oF = this.$threadTarget;
                        BurnerSendSettingsConfig burnerSendSettingsConfig = this.$config;
                        companion.sendMessageToThread(userSession, interfaceC83703oF, "", burnerSendSettingsConfig.messageType, burnerSendSettingsConfig.messageCount);
                        interfaceC16660sJ = this.$callback;
                        burnerResponse = BurnerSendSettingsHelper.BurnerResponse.NO_ERROR;
                    }
                    interfaceC16660sJ.invoke(burnerResponse);
                }

                @Override // X.InterfaceC16660sJ
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(AbstractC166987dD.A1a(obj));
                    return C0eB.A00;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00031(Context context, UserSession userSession, BurnerSendSettingsConfig burnerSendSettingsConfig, InterfaceC16660sJ interfaceC16660sJ) {
                super(1);
                this.$context = context;
                this.$userSession = userSession;
                this.$config = burnerSendSettingsConfig;
                this.$callback = interfaceC16660sJ;
            }

            public final void invoke(C2EC c2ec) {
                InterfaceC16660sJ interfaceC16660sJ;
                BurnerSendSettingsHelper.BurnerResponse burnerResponse;
                InterfaceC83703oF A00;
                if (c2ec == null) {
                    interfaceC16660sJ = this.$callback;
                    burnerResponse = BurnerSendSettingsHelper.BurnerResponse.COULD_NOT_CREATE_THREAD;
                } else {
                    String C7I = c2ec.C7I();
                    if (C7I != null && (A00 = AbstractC31232DoF.A00(C7I, C4GO.A01(c2ec.BSH()))) != null) {
                        BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
                        Context context = this.$context;
                        UserSession userSession = this.$userSession;
                        BurnerSendSettingsConfig burnerSendSettingsConfig = this.$config;
                        companion.ensureCutover(context, userSession, c2ec, burnerSendSettingsConfig.isTLC, new C00041(this.$callback, userSession, A00, burnerSendSettingsConfig));
                        return;
                    }
                    interfaceC16660sJ = this.$callback;
                    burnerResponse = BurnerSendSettingsHelper.BurnerResponse.COULD_NOT_CREATE_THREAD_SERVER;
                }
                interfaceC16660sJ.invoke(burnerResponse);
            }

            @Override // X.InterfaceC16660sJ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C2EC) obj);
                return C0eB.A00;
            }
        }

        @Override // X.InterfaceC16660sJ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BurnerSendSettingsHelper$Companion$createCutoverThreadAndSendMessage$1(UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, Context context, BurnerSendSettingsConfig burnerSendSettingsConfig) {
        super(1);
        this.$userSession = userSession;
        this.$callback = interfaceC16660sJ;
        this.$context = context;
        this.$config = burnerSendSettingsConfig;
    }

    public final void invoke(User user) {
        if (user == null) {
            this.$callback.invoke(BurnerSendSettingsHelper.BurnerResponse.INVALID_USERID);
            return;
        }
        BurnerSendSettingsHelper.Companion companion = BurnerSendSettingsHelper.Companion;
        UserSession userSession = this.$userSession;
        companion.isFollowing(userSession, user, new AnonymousClass1(this.$callback, userSession, user, this.$context, this.$config));
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((User) obj);
        return C0eB.A00;
    }
}
