package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.instagram.direct.appwidget.DirectWidgetProvider;

/* renamed from: X.TFk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64474TFk implements InterfaceC41501vz {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ DirectWidgetProvider A02;

    public C64474TFk(Context context, DirectWidgetProvider directWidgetProvider, int i) {
        this.A02 = directWidgetProvider;
        this.A01 = context;
        this.A00 = i;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1793319099);
        int A032 = C0f9.A03(-1662720214);
        DirectWidgetProvider directWidgetProvider = this.A02;
        Context context = this.A01;
        int i = this.A00;
        if (AbstractC58322PtE.A0G(context, i).getBoolean("com.instagram.direct.appwidget.IS_EMPTY_CHAT", false)) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            C14360o3.A07(appWidgetManager);
            DirectWidgetProvider.A02(appWidgetManager, context, directWidgetProvider, i);
        }
        C0f9.A0A(-1710309803, A032);
        C0f9.A0A(-378803125, A03);
    }
}
