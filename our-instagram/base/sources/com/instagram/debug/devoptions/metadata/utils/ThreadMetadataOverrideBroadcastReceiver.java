package com.instagram.debug.devoptions.metadata.utils;

import X.C06090Tz;
import X.C08310bt;
import X.C0f9;
import X.C0fM;
import X.C14360o3;
import X.C18U;
import X.C6XJ;
import X.InterfaceC16820sZ;
import X.InterfaceC83713oG;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.modal.ModalActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ThreadMetadataOverrideBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Object();
    public static final String INTENT_ACTION = "dev_intent_action_thread_metadata_override";
    public final InterfaceC16820sZ activityProvider;
    public final InterfaceC16820sZ threadTargetProvider;
    public final UserSession userSession;

    public ThreadMetadataOverrideBroadcastReceiver(InterfaceC16820sZ interfaceC16820sZ, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC16820sZ2, 3);
        this.activityProvider = interfaceC16820sZ;
        this.userSession = userSession;
        this.threadTargetProvider = interfaceC16820sZ2;
    }

    public static final boolean isEnabled(UserSession userSession) {
        return Companion.isEnabled(userSession);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C0f9.A01(-1086799473);
        C0fM.A01(this, context, intent);
        C14360o3.A0B(context, 0);
        C14360o3.A0B(intent, 1);
        if (!C08310bt.A02().A00(context, intent, this)) {
            i = 1292916960;
        } else {
            Activity activity = (Activity) this.activityProvider.invoke();
            UserSession userSession = this.userSession;
            C6XJ c6xj = new C6XJ(activity, ThreadMetadataOverrideFragment.Companion.createArgs(userSession, (InterfaceC83713oG) this.threadTargetProvider.invoke()), userSession, ModalActivity.class, "dev_direct_thread_metadata_override");
            c6xj.A08();
            c6xj.A0C(activity);
            i = -731173789;
        }
        C0f9.A0E(i, A01, intent);
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public final boolean isEnabled(UserSession userSession) {
            C14360o3.A0B(userSession, 0);
            C18U.A06(C06090Tz.A05, userSession, 36318075951257473L);
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
