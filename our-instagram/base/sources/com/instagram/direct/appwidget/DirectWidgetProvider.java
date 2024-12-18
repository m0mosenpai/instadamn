package com.instagram.direct.appwidget;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC12220kQ;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C023409i;
import X.C04750Mt;
import X.C09Y;
import X.C0BQ;
import X.C0QR;
import X.C11L;
import X.C12260kU;
import X.C14360o3;
import X.C17060sy;
import X.C63289Sgo;
import X.C64505TGt;
import X.InterfaceC02590Ai;
import X.InterfaceC08190bh;
import X.MSW;
import X.MSZ;
import X.TGr;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class DirectWidgetProvider extends C0QR {
    @Override // X.AbstractC07560aV
    public final void A05(Context context, Intent intent, InterfaceC08190bh interfaceC08190bh) {
        String str;
        Bundle extras;
        int[] intArray;
        int[] intArray2;
        Bundle extras2;
        Bundle extras3;
        String str2;
        C14360o3.A0B(context, 0);
        String action = intent.getAction();
        if (action != null) {
            str = new C11L("com\\.instagram\\.android\\.").A01(action, "android.");
        } else {
            str = null;
        }
        if ("thread_update_event".equals(str)) {
            Bundle extras4 = intent.getExtras();
            if (extras4 != null) {
                AppWidgetManager.getInstance(context).notifyAppWidgetViewDataChanged(extras4.getInt("appWidgetId"), R.id.profiles_container);
                return;
            }
            return;
        }
        if ("active_session_change_event".equals(str)) {
            Bundle extras5 = intent.getExtras();
            if (extras5 == null) {
                return;
            }
            int i = extras5.getInt("appWidgetId");
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            C14360o3.A07(appWidgetManager);
            C63289Sgo c63289Sgo = C63289Sgo.A00;
            Integer valueOf = Integer.valueOf(i);
            String A02 = c63289Sgo.A02(context, valueOf);
            AbstractC18680vv A0F = AbstractC31171DnF.A0F(this);
            if ((A0F instanceof UserSession) && AbstractC001800i.A0u(C0BQ.A00(A0F).BOd(), A02)) {
                return;
            }
            AbstractC18680vv A0F2 = AbstractC31171DnF.A0F(this);
            if ((A0F2 instanceof UserSession) && AbstractC001800i.A0u(C0BQ.A00(A0F2).BOd(), A02)) {
                if (A02 != null) {
                    return;
                }
            } else if (A02 != null) {
                context.deleteSharedPreferences(AnonymousClass001.A0O("app_widget_id_", i));
                A02(appWidgetManager, context, this, i);
                return;
            }
            C09Y c09y = C023409i.A0A;
            if (!(c09y.A05(this) instanceof UserSession)) {
                return;
            }
            SharedPreferences A00 = C63289Sgo.A00(context, valueOf);
            UserSession A08 = c09y.A08(this);
            String username = C17060sy.A01.A01(A08).getUsername();
            String str3 = A08.userId;
            SharedPreferences.Editor edit = A00.edit();
            edit.putString(AnonymousClass001.A0O("com.instagram.direct.appwidget.USER_ID", i), str3);
            edit.putString(AnonymousClass001.A0O("com.instagram.direct.appwidget.USER", i), username);
            edit.apply();
            A02(appWidgetManager, context, this, i);
            return;
        }
        if (("android.appwidget.action.APPWIDGET_UPDATE".equals(str) || "android.appwidget.action.APPWIDGET_UPDATE_OPTIONS".equals(str)) && (extras = intent.getExtras()) != null && (intArray = extras.getIntArray("appWidgetIds")) != null) {
            for (int i2 : intArray) {
                AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
                C14360o3.A07(appWidgetManager2);
                A02(appWidgetManager2, context, this, i2);
            }
        }
        if ("direct_v2".equals(str) && (extras3 = intent.getExtras()) != null) {
            String A022 = C63289Sgo.A00.A02(context, Integer.valueOf(extras3.getInt("appWidgetId")));
            Bundle extras6 = intent.getExtras();
            if (extras6 != null) {
                str2 = extras6.getString("com.instagram.direct.appwidget.THREAD_ID");
            } else {
                str2 = null;
            }
            Intent A04 = AbstractC31171DnF.A04();
            if (A022 != null) {
                A04.setClassName(context, "com.instagram.mainactivity.LauncherActivity");
                A04.setFlags(335544320);
                Uri.Builder authority = new Uri.Builder().scheme("instagram").authority("direct_v2");
                authority.appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2);
                authority.appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A022);
                authority.appendQueryParameter("t", "direct_widget");
                A04.setData(authority.build());
                C12260kU.A0C(context, A04);
            }
        }
        if ("direct-inbox".equals(str) && (extras2 = intent.getExtras()) != null) {
            String A023 = C63289Sgo.A00.A02(context, Integer.valueOf(extras2.getInt("appWidgetId")));
            Intent A042 = AbstractC31171DnF.A04();
            A042.setClassName(context, "com.instagram.mainactivity.LauncherActivity");
            A042.setFlags(335544320);
            Uri.Builder authority2 = new Uri.Builder().scheme("instagram").authority("direct-inbox");
            if (A023 != null && !AbstractC001900j.A0T(A023)) {
                authority2.appendQueryParameter(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A023);
            }
            A042.setData(authority2.build());
            C12260kU.A0C(context, A042);
        }
        Bundle extras7 = intent.getExtras();
        if (extras7 == null || (intArray2 = extras7.getIntArray("appWidgetIds")) == null) {
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        int length = intArray2.length;
        for (int i3 : intArray2) {
            if (!AbstractC58322PtE.A0G(context, i3).getBoolean("has_configured_widget", false)) {
                AbstractC166997dE.A1W(A1E, i3);
            }
        }
        if (length == 0) {
            return;
        }
        AbstractC18680vv A0F3 = AbstractC31171DnF.A0F(this);
        C14360o3.A0B(A0F3, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(A0F3), "ig_app_widget_lifecycle");
        if (!A0f.isSampled() || str == null) {
            return;
        }
        A0f.AAP("widget_name", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A0f.AAP("lifecycle_event_name", str);
        ArrayList A17 = AbstractC25225BEi.A17(length);
        int i4 = 0;
        do {
            A17.add(String.valueOf(intArray2[i4]));
            i4++;
        } while (i4 < length);
        A0f.AAk("widget_ids", AbstractC001800i.A0a(A17));
        A0f.Cht();
    }

    public static final void A02(AppWidgetManager appWidgetManager, Context context, DirectWidgetProvider directWidgetProvider, int i) {
        String A02 = C63289Sgo.A00.A02(context, Integer.valueOf(i));
        AbstractC18680vv A0F = AbstractC31171DnF.A0F(directWidgetProvider);
        if ((A0F instanceof UserSession) && AbstractC001800i.A0u(C0BQ.A00(A0F).BOd(), A02)) {
            C63289Sgo.A01(new C64505TGt(appWidgetManager, context, directWidgetProvider, i), A02);
            return;
        }
        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context);
        C14360o3.A07(appWidgetManager2);
        A01(appWidgetManager2, context, i, R.string.res_0x7f13007b_name_removed, R.string.res_0x7f13007a_name_removed);
    }

    public static final RemoteViews A00(PendingIntent pendingIntent, Context context, Intent intent, String str, int i, int i2, int i3) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), i);
        remoteViews.setRemoteAdapter(i3, R.id.profiles_container, intent);
        if (str != null) {
            C63289Sgo c63289Sgo = C63289Sgo.A00;
            Integer valueOf = Integer.valueOf(i3);
            C63289Sgo.A01(new TGr(context, remoteViews, i2), c63289Sgo.A02(context, valueOf));
            int i4 = C63289Sgo.A00(context, valueOf).getInt(AnonymousClass001.A0O("widget_dark_mode_ui", i3), -1);
            if (i4 != 1) {
                if (i4 != 2) {
                    remoteViews.setInt(R.id.view_container, "setBackgroundResource", R.drawable.appwidget_rounded_corner);
                } else {
                    remoteViews.setTextColor(R.id.title_text, -1);
                    remoteViews.setInt(R.id.view_container, "setBackgroundColor", -16777216);
                }
            } else {
                remoteViews.setTextColor(R.id.title_text, -16777216);
                remoteViews.setInt(R.id.view_container, "setBackgroundColor", -1);
            }
        }
        Intent A08 = MSW.A08(context, DirectWidgetProvider.class);
        A08.setAction("direct-inbox");
        A08.putExtra("appWidgetId", i3);
        int i5 = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i5 = 167772160;
        }
        C04750Mt A0R = MSZ.A0R(context, A08);
        A0R.A08();
        remoteViews.setOnClickPendingIntent(R.id.ig_icon, A0R.A02(context, i3, i5));
        remoteViews.setPendingIntentTemplate(R.id.profiles_container, pendingIntent);
        return remoteViews;
    }

    public static final void A01(AppWidgetManager appWidgetManager, Context context, int i, int i2, int i3) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.direct_app_widget_stress_screen);
        remoteViews.setTextViewText(R.id.title, context.getString(i2));
        remoteViews.setTextViewText(R.id.subtitle, context.getString(i3));
        Intent A08 = MSW.A08(context, DirectWidgetProvider.class);
        A08.setAction("direct-inbox");
        A08.putExtra("appWidgetId", i);
        int i4 = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = 167772160;
        }
        C04750Mt A0R = MSZ.A0R(context, A08);
        A0R.A08();
        remoteViews.setOnClickPendingIntent(R.id.go_to_ig_button, A0R.A02(context, i, i4));
        appWidgetManager.updateAppWidget(i, remoteViews);
    }
}
