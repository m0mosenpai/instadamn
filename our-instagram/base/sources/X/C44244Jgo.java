package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.Jgo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44244Jgo implements C2JL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C44244Jgo(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                C6FQ c6fq = (C6FQ) this.A01;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A02;
                C6FX A0s = AbstractC25225BEi.A0s();
                A0s.A01(AbstractC06930Yk.A0E());
                AbstractC25227BEk.A1M(c6fq, A0s, interfaceC103384lE);
                return;
            case 1:
                JT0 jt0 = (JT0) this.A02;
                jt0.A00.remove(this.A01);
                return;
            case 2:
                C14360o3.A0B(th, 0);
                str = "MEMContextApiHandleMetaProvider";
                str2 = "Cannot execute callback due to failed logging-in to MEMContext";
                C0K8.A0F(str, str2, th);
                return;
            default:
                C14360o3.A0B(th, 0);
                str = "MEMContextApiHandleMetaProvider";
                str2 = "Cannot run callback due to failed logging-in to MEMContext";
                C0K8.A0F(str, str2, th);
                return;
        }
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                AbstractC25227BEk.A1M((C6FQ) this.A01, AbstractC31179DnN.A0I(obj), (InterfaceC103384lE) this.A02);
                return;
            case 1:
                JT0 jt0 = (JT0) this.A02;
                jt0.A00.remove(this.A01);
                return;
            case 2:
                ((C48164LTo) this.A02).A00.execute((Runnable) this.A01);
                return;
            default:
                ((C48164LTo) this.A02).A00.ELJ((MailboxCallback) this.A01);
                return;
        }
    }
}
