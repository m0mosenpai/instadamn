package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.M3p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49948M3p implements Runnable {
    public final /* synthetic */ C49049Lmb A00;
    public final /* synthetic */ MessageIdentifier A01;

    public RunnableC49948M3p(C49049Lmb c49049Lmb, MessageIdentifier messageIdentifier) {
        this.A00 = c49049Lmb;
        this.A01 = messageIdentifier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC43593JPy.A0Z(this.A00.A00).DS3(this.A01);
    }
}
