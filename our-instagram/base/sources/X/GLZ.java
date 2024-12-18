package X;

/* loaded from: classes6.dex */
public final class GLZ implements Runnable {
    public final /* synthetic */ EHR A00;

    public GLZ(EHR ehr) {
        this.A00 = ehr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EHR ehr = this.A00;
        ehr.A03.set(true);
        ehr.A02.invoke();
        ehr.A07();
        EHR.A01(ehr);
    }
}
