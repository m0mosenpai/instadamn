package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.In8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42222In8 implements InterfaceC192128fD {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC60442pS A02;

    public C42222In8(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
    }

    @Override // X.InterfaceC192128fD
    public final void Dgh(AbstractC192138fE abstractC192138fE) {
        C14360o3.A0B(abstractC192138fE, 0);
        Fragment fragment = this.A00;
        if (!fragment.mDetached) {
            if (abstractC192138fE instanceof C215539gT) {
                Context context = fragment.getContext();
                if (context != null) {
                    C9GR.A03(context, context.getString(2131968430), "network_error", 0);
                }
                Throwable cause = ((C215539gT) abstractC192138fE).A00.getCause();
                if (cause != null) {
                    C0w9.A07(this.A02.getModuleName(), cause);
                    return;
                }
                return;
            }
            if (!(abstractC192138fE instanceof C193038gj)) {
                return;
            }
            C11T.A03(new RunnableC43113J4c(C62862tP.A02(fragment, this.A02, this.A01, null), C66246U5q.A00(((C193038gj) abstractC192138fE).A00)));
        }
    }
}
