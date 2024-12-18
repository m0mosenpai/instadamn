package com.instagram.debug.devoptions.section.creationgenai;

import X.AbstractC018607g;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC23021Ah;
import X.AbstractC23611Dp;
import X.AbstractC25235BEs;
import X.AbstractC59962oe;
import X.B4Z;
import X.C07Y;
import X.C0YR;
import X.C0eB;
import X.C0f9;
import X.C194848jk;
import X.C19L;
import X.C1JX;
import X.C23031Ai;
import X.C3NX;
import X.C3NY;
import X.C9GR;
import X.EnumC193878i8;
import X.InterfaceC16530ry;
import X.InterfaceC16620sF;
import X.InterfaceC19610xo;
import X.InterfaceC23621Ds;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.consentflow.api.MagicModConsentGraphQLApi;
import com.instagram.creation.genai.memu.consentflow.api.MemuCreatorTemplatesConsentGraphQLApi;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class CreationGenAIOptions implements DeveloperOptionsSection {
    public static final CreationGenAIOptions INSTANCE = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public List getItems(final UserSession userSession, final FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        ArrayList A1E = AbstractC166987dD.A1E();
        final C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-1212863331);
                C23031Ai c23031Ai = C23031Ai.this;
                InterfaceC16530ry interfaceC16530ry = c23031Ai.A3t;
                C0YR[] c0yrArr = C23031Ai.A8c;
                interfaceC16530ry.Egi(c23031Ai, false, c0yrArr[460]);
                C23031Ai c23031Ai2 = C23031Ai.this;
                c23031Ai2.A3u.Egi(c23031Ai2, false, c0yrArr[461]);
                C23031Ai c23031Ai3 = C23031Ai.this;
                c23031Ai3.A1g.Egi(c23031Ai3, false, c0yrArr[462]);
                C23031Ai c23031Ai4 = C23031Ai.this;
                c23031Ai4.A1i.Egi(c23031Ai4, false, c0yrArr[464]);
                C23031Ai c23031Ai5 = C23031Ai.this;
                c23031Ai5.A3r.Egi(c23031Ai5, false, c0yrArr[467]);
                C23031Ai c23031Ai6 = C23031Ai.this;
                c23031Ai6.A3s.Egi(c23031Ai6, false, c0yrArr[468]);
                C23031Ai c23031Ai7 = C23031Ai.this;
                c23031Ai7.A3v.Egi(c23031Ai7, false, c0yrArr[469]);
                C23031Ai c23031Ai8 = C23031Ai.this;
                c23031Ai8.A2D.Egi(c23031Ai8, false, c0yrArr[470]);
                C23031Ai c23031Ai9 = C23031Ai.this;
                c23031Ai9.A2C.Egi(c23031Ai9, false, c0yrArr[471]);
                C23031Ai c23031Ai10 = C23031Ai.this;
                for (EnumC193878i8 enumC193878i8 : EnumC193878i8.values()) {
                    AbstractC167007dF.A18(c23031Ai10.A01, C23031Ai.A00(enumC193878i8), 0);
                }
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(C23031Ai.this);
                A0w.E7D("magic_mod_feedback_nux_seen_count", 0);
                A0w.E7G("magic_mod_feedback_nux_last_seen_time", 0L);
                A0w.apply();
                InterfaceC19610xo A0w2 = AbstractC166987dD.A0w(C23031Ai.this);
                A0w2.E7D("magic_mod_edit_prompt_nux_seen_count", 0);
                A0w2.E7G("magic_mod_edit_prompt_nux_last_seen_time", 0L);
                A0w2.apply();
                InterfaceC19610xo A0w3 = AbstractC166987dD.A0w(C23031Ai.this);
                A0w3.E7D("magic_mod_sticker_info_text_seen_count", 0);
                A0w3.apply();
                InterfaceC19610xo A0w4 = AbstractC166987dD.A0w(C23031Ai.this);
                A0w4.E7G("magic_mod_consent_last_updated_in_ms", -1L);
                A0w4.apply();
                C0f9.A0C(-869095115, A05);
            }
        }, A1E, 2131958204);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$2

            @DebugMetadata(c = "com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$2$1", f = "CreationGenAIOptions.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$2$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
                public final /* synthetic */ FragmentActivity $activity;
                public final /* synthetic */ UserSession $userSession;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(UserSession userSession, FragmentActivity fragmentActivity, InterfaceC23621Ds interfaceC23621Ds) {
                    super(2, interfaceC23621Ds);
                    this.$userSession = userSession;
                    this.$activity = fragmentActivity;
                }

                @Override // X.C1Dr
                public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
                    return new AnonymousClass1(this.$userSession, this.$activity, interfaceC23621Ds);
                }

                @Override // X.InterfaceC16620sF
                public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
                    return ((AnonymousClass1) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
                }

                @Override // X.C1Dr
                public final Object invokeSuspend(Object obj) {
                    Object obj2;
                    C1JX c1jx = C1JX.A02;
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            AbstractC09560e7.A00(obj);
                        } else {
                            throw AbstractC166987dD.A13();
                        }
                    } else {
                        AbstractC09560e7.A00(obj);
                        MagicModConsentGraphQLApi magicModConsentGraphQLApi = MagicModConsentGraphQLApi.A00;
                        UserSession userSession = this.$userSession;
                        List A1Q = AbstractC16960so.A1Q(EnumC193878i8.A09, EnumC193878i8.A0B);
                        this.label = 1;
                        obj = magicModConsentGraphQLApi.A01(userSession, A1Q, this, false);
                        if (obj == c1jx) {
                            return c1jx;
                        }
                    }
                    C3NY c3ny = (C3NY) obj;
                    if (c3ny instanceof C3NX) {
                        obj2 = ((C3NX) c3ny).A00;
                    } else if (c3ny instanceof C194848jk) {
                        obj2 = false;
                    } else {
                        throw B4Z.A00();
                    }
                    int i2 = 2131958206;
                    if (AbstractC166987dD.A1a(obj2)) {
                        i2 = 2131958207;
                    }
                    C9GR.A07(this.$activity, i2);
                    return C0eB.A00;
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-650677962);
                AbstractC166987dD.A1Z(new AnonymousClass1(userSession, FragmentActivity.this, null), C07Y.A00(FragmentActivity.this));
                C0f9.A0C(1716092220, A05);
            }
        }, A1E, 2131958205);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$3

            @DebugMetadata(c = "com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$3$1", f = "CreationGenAIOptions.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$3$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
                public final /* synthetic */ FragmentActivity $activity;
                public final /* synthetic */ C23031Ai $userPreferences;
                public final /* synthetic */ UserSession $userSession;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(C23031Ai c23031Ai, UserSession userSession, FragmentActivity fragmentActivity, InterfaceC23621Ds interfaceC23621Ds) {
                    super(2, interfaceC23621Ds);
                    this.$userPreferences = c23031Ai;
                    this.$userSession = userSession;
                    this.$activity = fragmentActivity;
                }

                @Override // X.C1Dr
                public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
                    return new AnonymousClass1(this.$userPreferences, this.$userSession, this.$activity, interfaceC23621Ds);
                }

                @Override // X.InterfaceC16620sF
                public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
                    return ((AnonymousClass1) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
                }

                @Override // X.C1Dr
                public final Object invokeSuspend(Object obj) {
                    Object obj2;
                    C1JX c1jx = C1JX.A02;
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            AbstractC09560e7.A00(obj);
                        } else {
                            throw AbstractC166987dD.A13();
                        }
                    } else {
                        AbstractC09560e7.A00(obj);
                        C23031Ai c23031Ai = this.$userPreferences;
                        AbstractC167007dF.A1L(c23031Ai, c23031Ai.A1j, C23031Ai.A8c, 465, false);
                        MemuCreatorTemplatesConsentGraphQLApi memuCreatorTemplatesConsentGraphQLApi = MemuCreatorTemplatesConsentGraphQLApi.A00;
                        UserSession userSession = this.$userSession;
                        this.label = 1;
                        obj = memuCreatorTemplatesConsentGraphQLApi.A00(userSession, this);
                        if (obj == c1jx) {
                            return c1jx;
                        }
                    }
                    C3NY c3ny = (C3NY) obj;
                    if (c3ny instanceof C3NX) {
                        obj2 = ((C3NX) c3ny).A00;
                    } else if (c3ny instanceof C194848jk) {
                        obj2 = false;
                    } else {
                        throw B4Z.A00();
                    }
                    int i2 = 2131958206;
                    if (AbstractC166987dD.A1a(obj2)) {
                        i2 = 2131958207;
                    }
                    C9GR.A07(this.$activity, i2);
                    return C0eB.A00;
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(1814060044);
                AbstractC166987dD.A1Z(new AnonymousClass1(A00, userSession, FragmentActivity.this, null), C07Y.A00(FragmentActivity.this));
                C0f9.A0C(394046362, A05);
            }
        }, A1E, 2131958236);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(897357597);
                C23031Ai c23031Ai = C23031Ai.this;
                InterfaceC16530ry interfaceC16530ry = c23031Ai.A5a;
                C0YR[] c0yrArr = C23031Ai.A8c;
                interfaceC16530ry.Egi(c23031Ai, false, c0yrArr[472]);
                C23031Ai c23031Ai2 = C23031Ai.this;
                c23031Ai2.A5o.Egi(c23031Ai2, false, c0yrArr[473]);
                c23031Ai2.A5p.Egi(c23031Ai2, false, c0yrArr[474]);
                C0f9.A0C(-688746744, A05);
            }
        }, A1E, 2131958203);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-65467608);
                C23031Ai c23031Ai = C23031Ai.this;
                AbstractC167007dF.A1L(c23031Ai, c23031Ai.A23, C23031Ai.A8c, 459, false);
                C0f9.A0C(-910991098, A05);
            }
        }, A1E, 2131958238);
        AbstractC25235BEs.A1C(fragmentActivity, new View.OnClickListener() { // from class: com.instagram.debug.devoptions.section.creationgenai.CreationGenAIOptions$getItems$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-8143230);
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(C23031Ai.this);
                A0w.E7D("ig_native_imagine_disclosure_nux_seen_count", 0);
                A0w.apply();
                C0f9.A0C(-3342384, A05);
            }
        }, A1E, 2131958237);
        return A1E;
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public int getTitleRes() {
        return 2131957929;
    }
}
