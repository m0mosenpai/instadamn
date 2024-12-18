package com.instagram.direct.notifications.impl;

import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.C0f9;
import X.C0w9;
import X.C14360o3;
import X.PvO;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes8.dex */
public final class DirectNotificationActionReceiver extends PvO {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle resultsFromIntent;
        CharSequence charSequence;
        String str;
        String str2;
        int A01 = C0f9.A01(-480267960);
        boolean A1a = AbstractC167017dG.A1a(context, intent);
        String action = intent.getAction();
        Uri data = intent.getData();
        if (action == null) {
            str = "notification_action_clicked_no_action";
            str2 = "Receive an intent to notification action receiver but there is no action.";
        } else if (data == null) {
            str = "notification_action_clicked_no_data";
            str2 = "Receive an intent to notification action receiver but there is no data.";
        } else {
            if (action.equals("direct_text_reply") && (resultsFromIntent = RemoteInput.getResultsFromIntent(intent)) != null && (charSequence = resultsFromIntent.getCharSequence("DirectNotificationConstants.DirectReply")) != null) {
                data = data.buildUpon().appendQueryParameter("reply", AbstractC25228BEl.A1A(charSequence.toString())).build();
            }
            C14360o3.A0A(data);
            C14360o3.A0B(data, 2);
            Intent putExtra = new Intent(context, (Class<?>) DirectNotificationActionService.class).setData(data).setAction(action).putExtra("IgSessionManager.SESSION_TOKEN_KEY", data.getQueryParameter("intended_recipient_user_id"));
            C14360o3.A07(putExtra);
            PvO.A00(context, putExtra);
            C0f9.A0E(-2136552611, A01, intent);
        }
        C0w9.A04(str, str2, A1a ? 1 : 0);
        C0f9.A0E(-2136552611, A01, intent);
    }
}
