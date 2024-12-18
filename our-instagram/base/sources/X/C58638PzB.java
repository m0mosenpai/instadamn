package X;

/* renamed from: X.PzB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58638PzB implements C2KM {
    public final /* synthetic */ C48262Jq A00;

    public C58638PzB(C48262Jq c48262Jq) {
        this.A00 = c48262Jq;
    }

    @Override // X.C2KN
    public final /* bridge */ /* synthetic */ void DoW(Object obj) {
        AbstractC62642SJz abstractC62642SJz = (AbstractC62642SJz) obj;
        C48262Jq c48262Jq = this.A00;
        synchronized (c48262Jq) {
            int i = ((RP1) abstractC62642SJz).A01;
            boolean z = true;
            if (i != 2 && i != 1 && i != 4) {
                z = false;
            }
            c48262Jq.A02 = z;
        }
        c48262Jq.A0D.execute(new TOF(this, abstractC62642SJz));
    }
}
