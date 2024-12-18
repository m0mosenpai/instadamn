package com.instagram.direct.appwidget;

import X.AbstractC003100w;
import X.AbstractC166987dD;
import X.C14360o3;
import X.C63535Sp2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViewsService;

/* loaded from: classes10.dex */
public final class DirectWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        int i;
        String schemeSpecificPart;
        Integer A0j;
        C14360o3.A0B(intent, 0);
        Context A0O = AbstractC166987dD.A0O(this);
        Uri data = intent.getData();
        if (data != null && (schemeSpecificPart = data.getSchemeSpecificPart()) != null && (A0j = AbstractC003100w.A0j(schemeSpecificPart, 10)) != null) {
            i = A0j.intValue();
        } else {
            i = 0;
        }
        return new C63535Sp2(A0O, intent, i);
    }
}
