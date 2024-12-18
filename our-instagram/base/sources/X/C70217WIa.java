package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.WIa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70217WIa implements Handler.Callback {
    public final /* synthetic */ Handler.Callback A00;
    public final /* synthetic */ HandlerC25861Nt A01;

    public C70217WIa(Handler.Callback callback, HandlerC25861Nt handlerC25861Nt) {
        this.A01 = handlerC25861Nt;
        this.A00 = callback;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0oO, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        ?? obj = new Object();
        HandlerC25861Nt.A00(this.A01, new RunnableC71569WwJ(this.A00, message, obj), 1729269119);
        return obj.A00;
    }
}
