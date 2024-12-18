package com.instagram.debug.trainyardtracker;

import X.AbstractC001800i;
import X.C14360o3;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class TrainyardTracker {
    public final List events = new ArrayList();
    public final Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.instagram.debug.trainyardtracker.TrainyardTracker$handler$1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            C14360o3.A0B(message, 0);
            Object obj = message.obj;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.debug.trainyardtracker.TrainyardExecutorEvent");
            TrainyardTracker trainyardTracker = TrainyardTracker.this;
            synchronized (trainyardTracker.events) {
                trainyardTracker.events.add(obj);
            }
            return true;
        }
    });

    public final void storeEvent(TrainyardExecutorEvent trainyardExecutorEvent) {
        C14360o3.A0B(trainyardExecutorEvent, 0);
        Message.obtain(this.handler, 0, trainyardExecutorEvent).sendToTarget();
    }

    public final List getAndDrainEvents() {
        List A0a;
        synchronized (this.events) {
            A0a = AbstractC001800i.A0a(this.events);
            this.events.clear();
        }
        return A0a;
    }
}
