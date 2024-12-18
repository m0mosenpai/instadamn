package com.instagram.direct.notifications.impl;

import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC25228BEl;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC46863Knw;
import X.AbstractC46889KoW;
import X.AnonymousClass001;
import X.C023409i;
import X.C0K8;
import X.C0w9;
import X.C16930sl;
import X.C2054597s;
import X.C218914p;
import X.C3o9;
import X.EnumC92794Ds;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import X.M7F;
import X.M7J;
import X.PvO;
import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class DirectNotificationActionService extends IntentService implements InterfaceC11380iw {
    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_notification_action_service";
    }

    public DirectNotificationActionService() {
        super("DirectNotificationActionService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        String str;
        EnumC92794Ds enumC92794Ds;
        C3o9 directThreadKey;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        if (intent == null) {
            C0w9.A04("DirectNotificationActionService", "Unexpected null intent", 1);
            return;
        }
        try {
            String action = intent.getAction();
            if (action == null) {
                str3 = "notification_action_clicked_no_action";
                str4 = "No action is defined for the notification action.";
            } else {
                Uri data = intent.getData();
                Boolean bool2 = null;
                if (data != null) {
                    str = data.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                } else {
                    str = null;
                }
                if (str == null) {
                    C0K8.A0D("DirectNotificationActionService", "No thread id found in notification action");
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        C0w9.A04("notification_action_clicked_no_extra", AnonymousClass001.A0g("The notification action ", intent.getAction(), " is triggered but there is intended user ID in the extra."), 1);
                    } else {
                        UserSession A07 = C023409i.A0A.A07(extras);
                        if (A07 == null) {
                            str3 = "notification_action_clicked_for_inactive_user";
                            str4 = "Attempting to send from notification action when logged into a different account.";
                        } else {
                            String queryParameter = data.getQueryParameter(TraceFieldType.TransportType);
                            if (queryParameter != null && queryParameter.length() != 0) {
                                enumC92794Ds = AbstractC46863Knw.A00(queryParameter);
                            } else {
                                enumC92794Ds = EnumC92794Ds.A05;
                            }
                            if (enumC92794Ds.A00()) {
                                directThreadKey = new MsysThreadId(enumC92794Ds, null, Long.parseLong(str));
                            } else {
                                directThreadKey = new DirectThreadKey(str, null);
                            }
                            C3o9 c3o9 = directThreadKey;
                            if (action.equals("direct_text_reply")) {
                                AbstractC46889KoW.A00(new M7F(A07, enumC92794Ds, this, c3o9, data.getQueryParameter("reply"), data.getQueryParameter("uuid"), data.getQueryParameter("category"), data.getQueryParameter("experiments_mask")));
                            } else if (action.equals("direct_inline_like")) {
                                C2054597s c2054597s = C2054597s.A00;
                                C16930sl c16930sl = C16930sl.A00;
                                Capabilities createWithAdditionalCapabilities = c2054597s.createWithAdditionalCapabilities(c16930sl, c16930sl);
                                String queryParameter2 = data.getQueryParameter("message_id");
                                String queryParameter3 = data.getQueryParameter("message_client_context");
                                String queryParameter4 = data.getQueryParameter("uuid");
                                String queryParameter5 = data.getQueryParameter("category");
                                Boolean.parseBoolean(data.getQueryParameter("is_instamadillo"));
                                AbstractC46889KoW.A00(new M7J(A07, createWithAdditionalCapabilities, enumC92794Ds, this, c3o9, queryParameter2, queryParameter3, queryParameter4, queryParameter5));
                            } else {
                                C0w9.A03("DirectNotificationActionService", AnonymousClass001.A0R("Unknown intent action: ", intent.getAction()));
                            }
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A07), "ig_push_notification_user_action");
                            if (A0f.isSampled()) {
                                String queryParameter6 = data.getQueryParameter("intended_recipient_user_id");
                                A0f.AAP("recipient_id", queryParameter6);
                                A0f.AAP("push_identifier", data.getQueryParameter("push_id"));
                                A0f.AAP("push_category", data.getQueryParameter("category"));
                                String queryParameter7 = data.getQueryParameter("is_vm_active");
                                Long l = null;
                                if (queryParameter7 != null) {
                                    bool = Boolean.valueOf(Boolean.parseBoolean(queryParameter7));
                                } else {
                                    bool = null;
                                }
                                A0f.A7v("is_vm_active", bool);
                                String queryParameter8 = data.getQueryParameter("is_e2ee");
                                if (queryParameter8 != null) {
                                    bool2 = Boolean.valueOf(Boolean.parseBoolean(queryParameter8));
                                }
                                A0f.A7v("is_e2ee", bool2);
                                A0f.A7v("is_bg_account", AbstractC31172DnG.A0s(AbstractC31171DnF.A1V(A07, queryParameter6)));
                                String queryParameter9 = data.getQueryParameter("occamadillo_thread_id");
                                if (queryParameter9 != null) {
                                    l = AbstractC25228BEl.A13(queryParameter9);
                                }
                                A0f.A9K("occamadillo_thread_id", l);
                                A0f.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, data.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID));
                                A0f.AAP("action_type", action);
                                if (C218914p.A08()) {
                                    str2 = AppStateModule.APP_STATE_BACKGROUND;
                                } else {
                                    str2 = "foreground";
                                }
                                A0f.AAP("app_state", str2);
                                A0f.Cht();
                            }
                        }
                    }
                }
            }
            C0w9.A04(str3, str4, 1);
        } finally {
            PvO.A01(intent);
        }
    }
}
