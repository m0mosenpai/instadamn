package X;

import com.facebook.msys.mca.MailboxCallback;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.665, reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass665 {
    public final LinkedHashMap A00 = new LinkedHashMap();
    public final Executor A01;

    public final synchronized void A00() {
        this.A00.clear();
        if (this instanceof AnonymousClass664) {
            ((AnonymousClass664) this).A00 = null;
        }
    }

    public final synchronized void A01(MailboxCallback mailboxCallback, InterfaceC1350569e interfaceC1350569e, Object obj, Executor executor, boolean z) {
        LinkedHashMap linkedHashMap = this.A00;
        boolean containsKey = linkedHashMap.containsKey(mailboxCallback);
        linkedHashMap.put(mailboxCallback, executor);
        if (!containsKey && z) {
            RunnableC132645yn runnableC132645yn = new RunnableC132645yn(mailboxCallback, interfaceC1350569e, obj);
            if (executor == null) {
                executor = this.A01;
            }
            executor.execute(runnableC132645yn);
            linkedHashMap.remove(mailboxCallback);
            if (this instanceof AnonymousClass664) {
                ((AnonymousClass664) this).A00 = null;
            }
        }
    }

    public final synchronized void A02(InterfaceC1350569e interfaceC1350569e, Object obj) {
        Iterable<Map.Entry> entrySet;
        LinkedHashMap linkedHashMap = this.A00;
        if (linkedHashMap.size() > 1) {
            entrySet = new ArrayList(linkedHashMap.entrySet());
        } else {
            entrySet = linkedHashMap.entrySet();
        }
        for (Map.Entry entry : entrySet) {
            MailboxCallback mailboxCallback = (MailboxCallback) entry.getKey();
            mailboxCallback.getClass();
            Executor executor = (Executor) entry.getValue();
            RunnableC132645yn runnableC132645yn = new RunnableC132645yn(mailboxCallback, interfaceC1350569e, obj);
            if (executor == null) {
                executor = this.A01;
            }
            executor.execute(runnableC132645yn);
        }
        A00();
    }

    public AnonymousClass665(Executor executor) {
        this.A01 = executor;
    }
}
