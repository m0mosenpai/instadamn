package com.instagram.creator.agent.suggestedreplies.viewmodel;

import X.AbstractC141776au;
import X.AbstractC23021Ah;
import X.AbstractC23641Du;
import X.AbstractC43591JPw;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C0HM;
import X.C0K8;
import X.C0UO;
import X.C0YR;
import X.C0Zx;
import X.C141796aw;
import X.C14360o3;
import X.C16930sl;
import X.C18920wW;
import X.C18U;
import X.C23031Ai;
import X.C2EE;
import X.C38688GzT;
import X.C7DC;
import X.C7DI;
import X.C7IM;
import X.C7VK;
import X.D4v;
import X.EnumC46279KeB;
import X.EnumC46280KeC;
import X.EnumC46296KeS;
import X.InterfaceC02590Ai;
import X.InterfaceC16530ry;
import X.L7S;
import X.MBa;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.suggestedreplies.constants.SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext;
import com.instagram.creator.agent.suggestedreplies.repository.CreatorAgentSuggestedRepliesRepository;
import com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository;
import com.instagram.user.model.User;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class CreatorAgentSuggestedRepliesViewModel extends C7VK {
    public final C05A _uiState;
    public C7DC currentComposerState;
    public AnonymousClass195 currentJob;
    public boolean isKeyboardShowing;
    public final L7S logger;
    public String otherUserMessagingId;
    public EnumC46296KeS pendingTypeOfCollapse;
    public final CreatorAgentSuggestedRepliesRepository repository;
    public final CreatorAgentSuggestedRepliesSettingsRepository settingsRepository;
    public final C0UO uiState;
    public final UserSession userSession;

    public CreatorAgentSuggestedRepliesViewModel(UserSession userSession, L7S l7s, CreatorAgentSuggestedRepliesRepository creatorAgentSuggestedRepliesRepository, CreatorAgentSuggestedRepliesSettingsRepository creatorAgentSuggestedRepliesSettingsRepository) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(l7s, 2);
        C14360o3.A0B(creatorAgentSuggestedRepliesRepository, 3);
        C14360o3.A0B(creatorAgentSuggestedRepliesSettingsRepository, 4);
        this.userSession = userSession;
        this.logger = l7s;
        this.repository = creatorAgentSuggestedRepliesRepository;
        this.settingsRepository = creatorAgentSuggestedRepliesSettingsRepository;
        C008002u c008002u = new C008002u(new C38688GzT((C7IM) null, C05F.A01, C05F.A00, C16930sl.A00));
        this._uiState = c008002u;
        this.uiState = c008002u;
    }

    private final boolean isEligibleForInThreadOptInExperience(int i) {
        if (i != 1) {
            if (i != 0) {
                return false;
            }
            if (!Boolean.valueOf(C18U.A06(C06090Tz.A05, this.userSession, 36321237047780599L)).booleanValue()) {
                return false;
            }
        }
        C23031Ai A00 = AbstractC23021Ah.A00(this.userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A1a;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (((Boolean) interfaceC16530ry.CES(A00, c0yrArr[387])).booleanValue()) {
            return false;
        }
        C23031Ai A002 = AbstractC23021Ah.A00(this.userSession);
        long longValue = ((Number) A002.A6d.CES(A002, c0yrArr[389])).longValue();
        UserSession userSession = this.userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        return longValue < Long.valueOf(C18U.A01(c06090Tz, userSession, 36602712024552198L)).longValue() && Boolean.valueOf(C18U.A06(c06090Tz, this.userSession, 36321237047583990L)).booleanValue();
    }

    public final void generateResponses(boolean z) {
        Object value;
        C38688GzT c38688GzT;
        String str;
        String obj;
        String str2;
        String str3 = this.otherUserMessagingId;
        if (str3 != null) {
            C05A c05a = this._uiState;
            do {
                value = c05a.getValue();
                c38688GzT = (C38688GzT) value;
            } while (!c05a.AIi(value, C38688GzT.A02((C7IM) c38688GzT.A03, (Integer) c38688GzT.A00, C05F.A0C, (List) c38688GzT.A02)));
            L7S l7s = this.logger;
            EnumC46279KeB enumC46279KeB = l7s.A00;
            String str4 = "";
            if (enumC46279KeB == null) {
                C0K8.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
            } else {
                C18920wW c18920wW = l7s.A03;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_creator_agents_suggested_replies_request_sr_message");
                if (A00.isSampled()) {
                    String obj2 = C0HM.A00().toString();
                    C14360o3.A07(obj2);
                    UUID uuid = l7s.A01;
                    if (uuid == null || (str = uuid.toString()) == null) {
                        str = "";
                    }
                    A00.AAP("sr_session_id", str);
                    UUID uuid2 = l7s.A02;
                    if (uuid2 != null && (obj = uuid2.toString()) != null) {
                        str4 = obj;
                    }
                    A00.AAP("thread_session_id", str4);
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A01(EnumC46280KeC.CLIENT, "request_from");
                    A00.AAQ(c0Zx, "sr_context");
                    A00.A8R(enumC46279KeB, "inbox_type");
                    A00.AAP(AbstractC43591JPw.A00(1337), obj2);
                    A00.Cht();
                    str4 = obj2;
                }
            }
            L7S l7s2 = this.logger;
            UUID uuid3 = l7s2.A02;
            String str5 = null;
            if (uuid3 != null) {
                str2 = uuid3.toString();
            } else {
                str2 = null;
            }
            UUID uuid4 = l7s2.A01;
            if (uuid4 != null) {
                str5 = uuid4.toString();
            }
            this.currentJob = AbstractC23641Du.A04(AnonymousClass191.A00, new MBa(this, new SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext(l7s2.A00, str2, str5, str4), str3, null, 3, z), AbstractC141776au.A00(this));
        }
    }

    public final void onKeyboardCollapsed() {
        Object value;
        C38688GzT c38688GzT;
        this.isKeyboardShowing = false;
        C05A c05a = this._uiState;
        do {
            value = c05a.getValue();
            c38688GzT = (C38688GzT) value;
        } while (!c05a.AIi(value, C38688GzT.A02((C7IM) c38688GzT.A03, C05F.A01, (Integer) c38688GzT.A01, (List) c38688GzT.A02)));
    }

    public final void onKeyboardExpanded() {
        Object value;
        C38688GzT c38688GzT;
        this.isKeyboardShowing = true;
        if (((C38688GzT) this.uiState.getValue()).A00 == C05F.A0C) {
            L7S l7s = this.logger;
            EnumC46296KeS enumC46296KeS = this.pendingTypeOfCollapse;
            if (enumC46296KeS == null) {
                enumC46296KeS = EnumC46296KeS.TAP_KEYBOARD;
            }
            l7s.A00(enumC46296KeS);
            this.pendingTypeOfCollapse = null;
        }
        C05A c05a = this._uiState;
        do {
            value = c05a.getValue();
            c38688GzT = (C38688GzT) value;
        } while (!c05a.AIi(value, C38688GzT.A02((C7IM) c38688GzT.A03, C05F.A00, (Integer) c38688GzT.A01, (List) c38688GzT.A02)));
    }

    public final void updateTheme(C7IM c7im) {
        Object value;
        C38688GzT c38688GzT;
        C14360o3.A0B(c7im, 0);
        C05A c05a = this._uiState;
        do {
            value = c05a.getValue();
            c38688GzT = (C38688GzT) value;
        } while (!c05a.AIi(value, C38688GzT.A02(c7im, (Integer) c38688GzT.A00, (Integer) c38688GzT.A01, (List) c38688GzT.A02)));
    }

    public static /* synthetic */ void generateResponses$default(CreatorAgentSuggestedRepliesViewModel creatorAgentSuggestedRepliesViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        creatorAgentSuggestedRepliesViewModel.generateResponses(z);
    }

    private final void hideAndReset() {
        Object value;
        Integer num;
        C05A c05a = this._uiState;
        do {
            value = c05a.getValue();
            num = C05F.A00;
        } while (!c05a.AIi(value, C38688GzT.A02((C7IM) ((C38688GzT) value).A03, num, num, C16930sl.A00)));
    }

    public final void cancel() {
        Object value;
        C38688GzT c38688GzT;
        this.logger.A00(EnumC46296KeS.TAP_CANCEL);
        AnonymousClass195 anonymousClass195 = this.currentJob;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C05A c05a = this._uiState;
        do {
            value = c05a.getValue();
            c38688GzT = (C38688GzT) value;
        } while (!c05a.AIi(value, C38688GzT.A02((C7IM) c38688GzT.A03, C05F.A01, C05F.A00, (List) c38688GzT.A02)));
    }

    public final void checkIfNuxAccepted() {
        updateThread(this.currentComposerState);
    }

    public final SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext getLoggingContext() {
        String str;
        L7S l7s = this.logger;
        UUID uuid = l7s.A02;
        String str2 = null;
        if (uuid != null) {
            str = uuid.toString();
        } else {
            str = null;
        }
        UUID uuid2 = l7s.A01;
        if (uuid2 != null) {
            str2 = uuid2.toString();
        }
        return new SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext(l7s.A00, str, str2, "");
    }

    public final C0UO getUiState() {
        return this.uiState;
    }

    public final void onContainerExpanded(boolean z) {
        String obj;
        Object value;
        C38688GzT c38688GzT;
        Integer num;
        L7S l7s = this.logger;
        C18920wW c18920wW = l7s.A03;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_creator_agents_suggested_replies_open");
        EnumC46279KeB enumC46279KeB = l7s.A00;
        if (enumC46279KeB == null) {
            C0K8.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
        } else if (A00.isSampled()) {
            A00.A8R(enumC46279KeB, "inbox_type");
            UUID uuid = l7s.A01;
            String str = null;
            if (uuid != null) {
                str = uuid.toString();
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            A00.AAP("sr_session_id", str);
            UUID uuid2 = l7s.A02;
            if (uuid2 != null && (obj = uuid2.toString()) != null) {
                str2 = obj;
            }
            A00.AAP("thread_session_id", str2);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A03("is_sr_auto_shown", Boolean.valueOf(z));
            A00.AAQ(c0Zx, "sr_context");
            A00.Cht();
        }
        C05A c05a = this._uiState;
        do {
            value = c05a.getValue();
            c38688GzT = (C38688GzT) value;
            if (this.isKeyboardShowing) {
                num = C05F.A00;
            } else {
                num = C05F.A0C;
            }
        } while (!c05a.AIi(value, C38688GzT.A02((C7IM) c38688GzT.A03, num, (Integer) c38688GzT.A01, (List) c38688GzT.A02)));
        if (((C38688GzT) this.uiState.getValue()).A01 != C05F.A0C && ((List) ((C38688GzT) this.uiState.getValue()).A02).isEmpty()) {
            generateResponses(false);
        }
    }

    public final void onEditTapped() {
        String obj;
        L7S l7s = this.logger;
        EnumC46279KeB enumC46279KeB = l7s.A00;
        if (enumC46279KeB == null) {
            C0K8.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
        } else {
            C18920wW c18920wW = l7s.A03;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_creator_agents_suggested_replies_tap_edit");
            if (A00.isSampled()) {
                A00.A8R(enumC46279KeB, "inbox_type");
                UUID uuid = l7s.A01;
                String str = null;
                if (uuid != null) {
                    str = uuid.toString();
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                A00.AAP("sr_session_id", str);
                UUID uuid2 = l7s.A02;
                if (uuid2 != null && (obj = uuid2.toString()) != null) {
                    str2 = obj;
                }
                A00.AAP("thread_session_id", str2);
                A00.Cht();
            }
        }
        this.pendingTypeOfCollapse = EnumC46296KeS.TAP_EDIT;
    }

    public final void onNonNetworkError() {
        this.pendingTypeOfCollapse = EnumC46296KeS.AUTO_DISMISS_NO_REPLIES;
    }

    public final void onSendTapped() {
        String obj;
        Object value;
        C38688GzT c38688GzT;
        L7S l7s = this.logger;
        EnumC46279KeB enumC46279KeB = l7s.A00;
        if (enumC46279KeB == null) {
            C0K8.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
        } else {
            C18920wW c18920wW = l7s.A03;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_creator_agents_suggested_replies_tap_send");
            if (A00.isSampled()) {
                A00.A8R(enumC46279KeB, "inbox_type");
                UUID uuid = l7s.A01;
                String str = null;
                if (uuid != null) {
                    str = uuid.toString();
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                A00.AAP("sr_session_id", str);
                UUID uuid2 = l7s.A02;
                if (uuid2 != null && (obj = uuid2.toString()) != null) {
                    str2 = obj;
                }
                A00.AAP("thread_session_id", str2);
                A00.Cht();
            }
        }
        C05A c05a = this._uiState;
        do {
            value = c05a.getValue();
            c38688GzT = (C38688GzT) value;
        } while (!c05a.AIi(value, C38688GzT.A02((C7IM) c38688GzT.A03, C05F.A01, (Integer) c38688GzT.A01, C16930sl.A00)));
    }

    public final void refreshResponses() {
        String obj;
        L7S l7s = this.logger;
        EnumC46279KeB enumC46279KeB = l7s.A00;
        if (enumC46279KeB == null) {
            C0K8.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
        } else {
            C18920wW c18920wW = l7s.A03;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_creator_agents_suggested_replies_tap_refresh");
            if (A00.isSampled()) {
                A00.A8R(enumC46279KeB, "inbox_type");
                UUID uuid = l7s.A01;
                String str = null;
                if (uuid != null) {
                    str = uuid.toString();
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                A00.AAP("sr_session_id", str);
                UUID uuid2 = l7s.A02;
                if (uuid2 != null && (obj = uuid2.toString()) != null) {
                    str2 = obj;
                }
                A00.AAP("thread_session_id", str2);
                A00.Cht();
            }
        }
        generateResponses(true);
    }

    public final void updateThread(C7DC c7dc) {
        C2EE A01;
        User Ba5;
        Long BTC;
        String obj;
        EnumC46279KeB enumC46279KeB;
        Object value;
        C38688GzT c38688GzT;
        Integer num;
        C2EE A012;
        Object value2;
        C38688GzT c38688GzT2;
        String str;
        EnumC46279KeB enumC46279KeB2;
        this.currentComposerState = c7dc;
        if (c7dc != null && !c7dc.A03() && c7dc.A02 == C7DI.A0K && (A01 = c7dc.A01()) != null && A01.C7g() == 1003) {
            C2EE A013 = c7dc.A01();
            if (A013 != null) {
                int C7C = A013.C7C();
                if (Integer.valueOf(C7C) != null && (C7C == 0 || C7C == 1)) {
                    C2EE A014 = c7dc.A01();
                    if (A014 != null && (Ba5 = A014.Ba5()) != null && (BTC = Ba5.BTC()) != null && (obj = BTC.toString()) != null) {
                        if (Boolean.valueOf(C18U.A06(C06090Tz.A05, this.userSession, 36321237047387379L)).booleanValue()) {
                            if (!C14360o3.A0K(this.otherUserMessagingId, obj)) {
                                AnonymousClass195 anonymousClass195 = this.currentJob;
                                if (anonymousClass195 != null) {
                                    anonymousClass195.AGH(null);
                                }
                                this.otherUserMessagingId = obj;
                                L7S l7s = this.logger;
                                l7s.A02 = C0HM.A00();
                                if (C7C != 0) {
                                    enumC46279KeB2 = EnumC46279KeB.GENERAL;
                                } else {
                                    enumC46279KeB2 = EnumC46279KeB.PRIMARY;
                                }
                                l7s.A00 = enumC46279KeB2;
                                l7s.A01 = C0HM.A00();
                            }
                            L7S l7s2 = this.logger;
                            if (C7C != 0) {
                                enumC46279KeB = EnumC46279KeB.GENERAL;
                            } else {
                                enumC46279KeB = EnumC46279KeB.PRIMARY;
                            }
                            l7s2.A00 = enumC46279KeB;
                            if (!((Boolean) this.settingsRepository.A01.getValue()).booleanValue()) {
                                if (isEligibleForInThreadOptInExperience(C7C)) {
                                    Object obj2 = ((C38688GzT) this.uiState.getValue()).A00;
                                    Integer num2 = C05F.A0N;
                                    if (obj2 != num2) {
                                        L7S l7s3 = this.logger;
                                        EnumC46279KeB enumC46279KeB3 = l7s3.A00;
                                        if (enumC46279KeB3 == null) {
                                            C0K8.A0E("SuggestedRepliesLogger", "SR logger not initialized properly");
                                        } else {
                                            C18920wW c18920wW = l7s3.A03;
                                            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_creator_agents_suggested_replies_thread_opt_in_imp");
                                            if (A00.isSampled()) {
                                                A00.A8R(enumC46279KeB3, "inbox_type");
                                                UUID uuid = l7s3.A02;
                                                if (uuid == null || (str = uuid.toString()) == null) {
                                                    str = "";
                                                }
                                                A00.AAP("thread_session_id", str);
                                                A00.Cht();
                                            }
                                        }
                                    }
                                    C05A c05a = this._uiState;
                                    do {
                                        value2 = c05a.getValue();
                                        c38688GzT2 = (C38688GzT) value2;
                                    } while (!c05a.AIi(value2, C38688GzT.A02((C7IM) c38688GzT2.A03, num2, (Integer) c38688GzT2.A01, C16930sl.A00)));
                                    return;
                                }
                            } else {
                                if (C7C == 1 && (A012 = c7dc.A01()) != null && A012.CXF()) {
                                    onContainerExpanded(true);
                                    return;
                                }
                                C05A c05a2 = this._uiState;
                                do {
                                    value = c05a2.getValue();
                                    c38688GzT = (C38688GzT) value;
                                    if (this.isKeyboardShowing) {
                                        num = C05F.A00;
                                    } else {
                                        num = C05F.A01;
                                    }
                                } while (!c05a2.AIi(value, C38688GzT.A02((C7IM) c38688GzT.A03, num, C05F.A00, C16930sl.A00)));
                                return;
                            }
                        }
                    }
                }
            }
            hideAndReset();
        }
        this.otherUserMessagingId = null;
        hideAndReset();
    }

    public final void init() {
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new D4v(this, null, 10), A00);
    }
}
