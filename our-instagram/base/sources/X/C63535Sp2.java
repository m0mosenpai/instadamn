package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.direct.appwidget.DirectWidgetProvider;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Sp2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63535Sp2 implements RemoteViewsService.RemoteViewsFactory {
    public final int A01;
    public final Context A02;
    public final Intent A07;
    public List A00 = C16930sl.A00;
    public final HashSet A06 = AbstractC166987dD.A1H();
    public final InterfaceC41501vz A05 = new C64473TFj(this, 3);
    public final InterfaceC41501vz A04 = new C64473TFj(this, 2);
    public final InterfaceC41501vz A03 = new C31650DvG(this, 12);

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    public static final void A00(C63535Sp2 c63535Sp2) {
        Context context = c63535Sp2.A02;
        Intent intent = new Intent("thread_update_event", null, context.getApplicationContext(), DirectWidgetProvider.class);
        intent.putExtra("appWidgetId", c63535Sp2.A07.getIntExtra("appWidgetId", 0));
        context.sendBroadcast(intent);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        RemoteViews remoteViews = new RemoteViews(this.A02.getPackageName(), R.layout.appwidget_recipient_profile);
        remoteViews.setViewVisibility(R.id.picture_glimmer, 0);
        remoteViews.setViewVisibility(R.id.single_profile_picture, 8);
        remoteViews.setViewVisibility(R.id.group_picture, 8);
        remoteViews.setViewVisibility(R.id.username_glimmer, 0);
        remoteViews.setViewVisibility(R.id.username, 8);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        Bitmap A05;
        Bitmap A052;
        Bitmap A053;
        Context context = this.A02;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.appwidget_recipient_profile);
        remoteViews.setViewVisibility(R.id.picture_glimmer, 8);
        remoteViews.setViewVisibility(R.id.username_glimmer, 8);
        DirectThreadWidgetItem directThreadWidgetItem = (DirectThreadWidgetItem) this.A00.get(i);
        remoteViews.setTextViewText(R.id.username, directThreadWidgetItem.A04);
        remoteViews.setViewVisibility(R.id.username, 0);
        int i2 = 4;
        if (directThreadWidgetItem.A00) {
            i2 = 0;
        }
        remoteViews.setViewVisibility(R.id.unread_indicator, i2);
        String str = null;
        Bitmap A0H = C25821No.A00().A0H(new SimpleImageUrl(directThreadWidgetItem.A03), null);
        String str2 = directThreadWidgetItem.A01;
        if (str2 == null) {
            remoteViews.setViewVisibility(R.id.group_picture, 8);
            remoteViews.setViewVisibility(R.id.single_profile_picture, 0);
            if (A0H != null && (A053 = C1NC.A05(A0H)) != null) {
                remoteViews.setImageViewBitmap(R.id.single_profile_picture, A053);
            }
        } else {
            remoteViews.setViewVisibility(R.id.single_profile_picture, 8);
            remoteViews.setViewVisibility(R.id.group_picture, 0);
            if (A0H != null && (A052 = C1NC.A05(A0H)) != null) {
                remoteViews.setImageViewBitmap(R.id.front_picture, A052);
            }
            Bitmap A0H2 = C25821No.A00().A0H(new SimpleImageUrl(str2), null);
            if (A0H2 != null && (A05 = C1NC.A05(A0H2)) != null) {
                remoteViews.setImageViewBitmap(R.id.back_picture, A05);
            }
        }
        int i3 = this.A01;
        int i4 = AbstractC58322PtE.A0G(context, i3).getInt(AnonymousClass001.A0O("widget_dark_mode_ui", i3), -1);
        if (i4 != 1) {
            if (i4 != 2) {
                remoteViews.setTextColor(R.id.username, context.getColor(R.color.direct_widget_primary_text));
            } else {
                remoteViews.setTextColor(R.id.username, -1);
            }
        } else {
            remoteViews.setTextColor(R.id.username, -16777216);
        }
        Bundle extras = this.A07.getExtras();
        if (extras != null) {
            str = extras.getString("com.instagram.direct.appwidget.USER_ID");
        }
        Intent A04 = AbstractC31171DnF.A04();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("com.instagram.direct.appwidget.THREAD_ID", directThreadWidgetItem.A02);
        A0b.putString("com.instagram.direct.appwidget.USER_ID", str);
        A04.putExtras(A0b);
        remoteViews.setOnClickFillInIntent(R.id.profile, A04);
        return remoteViews;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        String A02 = C63289Sgo.A00.A02(this.A02, Integer.valueOf(this.A01));
        C63289Sgo.A01(new C64502TGp(this, 1), A02);
        C63289Sgo.A01(new C64502TGp(this, 2), A02);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        C63289Sgo c63289Sgo = C63289Sgo.A00;
        Context context = this.A02;
        int i = this.A01;
        C63289Sgo.A01(new C64502TGp(this, 3), c63289Sgo.A02(context, Integer.valueOf(i)));
        context.deleteSharedPreferences(AnonymousClass001.A0O("app_widget_id_", i));
    }

    public C63535Sp2(Context context, Intent intent, int i) {
        this.A02 = context;
        this.A07 = intent;
        this.A01 = i;
    }
}
