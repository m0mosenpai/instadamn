package com.instagram.notifications.push.fbns;

import X.AbstractC12960li;
import X.AnonymousClass916;
import X.AnonymousClass917;
import X.AnonymousClass918;
import X.AnonymousClass919;
import X.C05F;
import X.C0f9;
import X.C0fM;
import X.C14360o3;
import X.C226218q;
import X.InterfaceC16660sJ;
import X.Q1s;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.react.modules.dialog.DialogModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class IgPushSdkFbnsReceiverShim extends BroadcastReceiver {
    public final InterfaceC16660sJ A00;
    public final InterfaceC16660sJ A01;

    public /* synthetic */ IgPushSdkFbnsReceiverShim(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnonymousClass916.A00 : interfaceC16660sJ, (i & 2) != 0 ? AnonymousClass917.A00 : interfaceC16660sJ2);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        BroadcastReceiver broadcastReceiver;
        int A01 = C0f9.A01(1234519699);
        if (intent != null) {
            str = intent.getStringExtra("receive_type");
        } else {
            str = null;
        }
        if (!C14360o3.A0K(str, "registered") && !C14360o3.A0K(str, "unregistered") && !C14360o3.A0K(str, "reg_error")) {
            AnonymousClass919 anonymousClass919 = AnonymousClass918.A00;
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                qPLInstance.markerStart(875309620, anonymousClass919.A00(intent));
                qPLInstance.markerAnnotate(875309620, anonymousClass919.A00(intent), "provider", "FBNS");
            }
        }
        int A012 = C0f9.A01(1799408930);
        C0fM.A01(this, context, intent);
        boolean z = false;
        C14360o3.A0B(intent, 0);
        if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction()) && DialogModule.KEY_MESSAGE.equals(intent.getStringExtra("receive_type"))) {
            z = ((Boolean) this.A01.invoke(this.A00.invoke(this))).booleanValue();
        }
        AnonymousClass919 anonymousClass9192 = AnonymousClass918.A00;
        if (z) {
            anonymousClass9192.A02(intent, "use_push_sdk_receiver");
            broadcastReceiver = Q1s.A00;
        } else {
            anonymousClass9192.A02(intent, "use_legacy_receiver");
            broadcastReceiver = new BroadcastReceiver();
        }
        broadcastReceiver.onReceive(context, intent);
        C0f9.A0E(1194615755, A012, intent);
        C226218q.A01(AbstractC12960li.A00).A0L(intent, C05F.A0N);
        C0f9.A0E(-2059119666, A01, intent);
    }

    public IgPushSdkFbnsReceiverShim(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        C14360o3.A0B(interfaceC16660sJ2, 2);
        this.A01 = interfaceC16660sJ;
        this.A00 = interfaceC16660sJ2;
    }

    public IgPushSdkFbnsReceiverShim() {
        this(AnonymousClass916.A00, AnonymousClass917.A00);
    }
}
