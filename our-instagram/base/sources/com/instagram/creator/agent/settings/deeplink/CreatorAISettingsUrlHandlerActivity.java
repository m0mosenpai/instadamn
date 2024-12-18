package com.instagram.creator.agent.settings.deeplink;

import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

/* loaded from: classes5.dex */
public final class CreatorAISettingsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    @Override // com.instagram.base.activity.BaseFragmentActivity
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r5 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r0 = r1.getQueryParameter("destination");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r7 = X.AbstractC25228BEl.A1A(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        r3 = X.AbstractC166997dE.A0Y(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        r9 = r7.hashCode();
        r6 = X.AbstractC43591JPw.A00(18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        switch(r9) {
            case -1342261615: goto L40;
            case -1236063016: goto L48;
            case -1030574761: goto L37;
            case 819322293: goto L34;
            case 2120227558: goto L31;
            default: goto L29;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r7.equals("add_avoided_topic") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        r2 = X.AbstractC61636Rr0.A00(X.AbstractC167007dF.A1b(r6, X.C63.A02, X.AbstractC166987dD.A1L("creator_ai_creator_fbid", r3.A03.getFbidV2()), X.AbstractC166987dD.A1L("creator_ai_entry_point_extra", r5)));
        r0 = 2205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        r1 = X.AbstractC111324zv.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        X.C6XJ.A03(r10, r2, r13, com.instagram.modal.ModalActivity.class, r1).A0A(r10, 107);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        if (r7.equals("add_keyword_response") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        r2 = X.AbstractC167027dH.A09(r6, X.C63.A02, X.AbstractC166987dD.A1L("creator_ai_creator_igid", r3.getId()), X.AbstractC166987dD.A1L("creator_ai_creator_fbid", r3.A03.getFbidV2()), X.AbstractC166987dD.A1L("creator_ai_entry_point_extra", r5));
        r0 = 4202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        if (r7.equals(X.AbstractC111324zv.A00(5140)) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        if (r7.equals("fact_list") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        r1 = X.EnumC27380C6j.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0101, code lost:
    
        r2 = X.AbstractC167017dG.A0T("creator_ai_creator_fbid", r3.A03.getFbidV2(), X.AbstractC166987dD.A1L("creator_ai_initial_information_tab", r1));
        r0 = 4205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        r1 = X.EnumC27380C6j.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f7, code lost:
    
        if (r7.equals("fact_list") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0126, code lost:
    
        if (r7.equals(X.AbstractC111324zv.A00(1900)) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
    
        r2 = X.AbstractC167027dH.A09("creator_ai_add_fact_content_type", X.EnumC27380C6j.A04, X.AbstractC166987dD.A1L("creator_ai_creator_fbid", r3.A03.getFbidV2()), X.AbstractC166987dD.A1L("creator_ai_entry_point_extra", r5), X.AbstractC166987dD.A1L(r6, X.C63.A02));
        r1 = "creator_ai_add_fact";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0077, code lost:
    
        r2 = X.AbstractC167017dG.A0T("creator_ai_creator_igid", r3.getId(), X.AbstractC166987dD.A1L("creator_ai_entry_point_extra", r5));
        r2.putBoolean("creator_ai_should_open_audience_management", X.C14360o3.A0K(r7, "auto_replies"));
        r1 = "creator_ai_settings";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004e, code lost:
    
        if (r1 != null) goto L22;
     */
    @Override // com.instagram.urlhandler.UserSessionUrlHandlerActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0n(android.os.Bundle r11, android.os.Bundle r12, com.instagram.common.session.UserSession r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.deeplink.CreatorAISettingsUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }
}
