package X;

import android.content.Context;

/* renamed from: X.In7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42221In7 implements InterfaceC192128fD {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C62862tP A01;

    public C42221In7(Context context, C62862tP c62862tP) {
        this.A00 = context;
        this.A01 = c62862tP;
    }

    @Override // X.InterfaceC192128fD
    public final void Dgh(AbstractC192138fE abstractC192138fE) {
        C14360o3.A0B(abstractC192138fE, 0);
        if (abstractC192138fE instanceof C215539gT) {
            Context context = this.A00;
            C9GR.A03(context, context.getString(2131968430), "network_error", 0);
            Throwable cause = ((C215539gT) abstractC192138fE).A00.getCause();
            if (cause != null) {
                C0w9.A07(this.A01.A04.getModuleName(), cause);
                return;
            }
            return;
        }
        if (!(abstractC192138fE instanceof C193038gj)) {
            return;
        }
        C11T.A02(new J51(this.A01, C66246U5q.A00(((C193038gj) abstractC192138fE).A00)));
    }
}
