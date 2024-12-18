package com.instagram.util.share;

import android.content.BroadcastReceiver;

/* loaded from: classes6.dex */
public class ShareUtil$ChosenComponentReceiver extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00dc, code lost:
    
        if (r17 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e7, code lost:
    
        r5 = (java.lang.String) r3.get("share_surface");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ef, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f1, code lost:
    
        r4 = (java.lang.String) r3.get("ranking_token");
        r13 = X.AbstractC31171DnF.A0h("carousel_index", r3);
        r3 = (java.lang.String) r3.get("carousel_media_id");
        r11 = r27.getStringExtra("log_event_module_name");
        r2 = X.C19280xC.A01(r2, new X.C35994Fus(r11).getModuleName());
        r1 = r27.getSerializableExtra("log_event_extras");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0120, code lost:
    
        if ((r1 instanceof java.util.HashMap) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0122, code lost:
    
        r2.A0F((java.util.HashMap) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0127, code lost:
    
        r10 = r27.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012f, code lost:
    
        if ((r10 instanceof android.content.ComponentName) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0131, code lost:
    
        r10 = (android.content.ComponentName) r10;
        r2.A0C("selection_package", r10.getPackageName());
        r2.A0C("selection_class", r10.getClassName());
        r2.A0C("selection_short_class", r10.getShortClassName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0150, code lost:
    
        if ((r7 instanceof com.instagram.common.session.UserSession) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0152, code lost:
    
        r15 = (com.instagram.common.session.UserSession) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0164, code lost:
    
        if (X.AbstractC166997dE.A0c(X.C06090Tz.A05, r15, 36323878452080296L).booleanValue() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0166, code lost:
    
        X.AbstractC73317Y7a.A0I(new X.C35995Fut(r11), r15, X.AbstractC82733mb.A00(r13), r17, r5, "system_share_sheet", r6, r10.getPackageName(), r4, null, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0182, code lost:
    
        X.AbstractC31173DnH.A1S(r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        if (r5 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r3 == null) goto L6;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r26, android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.util.share.ShareUtil$ChosenComponentReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
