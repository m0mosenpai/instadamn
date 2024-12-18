package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32476ESc extends C1P1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ Runnable A02;

    public C32476ESc(Context context, UserSession userSession, Runnable runnable) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = runnable;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(994520456);
        C32139EAm c32139EAm = (C32139EAm) obj;
        int A0N = AbstractC167017dG.A0N(c32139EAm, -1251114952);
        E6E e6e = c32139EAm.A00;
        if (e6e == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        int ordinal = e6e.A00.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                this.A02.run();
            }
        } else {
            C36004Fv2 c36004Fv2 = C36004Fv2.A00;
            Context context = this.A00;
            UserSession userSession = this.A01;
            Runnable runnable = this.A02;
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            AbstractC31172DnG.A1C(context, A0I, 2131976816);
            AbstractC31173DnH.A16(context, A0I, 2131976815);
            DialogInterfaceOnClickListenerC35455FkC.A01(A0I, runnable, userSession, 26, 2131975803);
            A0I.A0I(DialogInterfaceOnClickListenerC35416FjZ.A00, 2131968687);
            A0I.A04();
            AbstractC166987dD.A1W(A0I);
            AbstractC31175DnJ.A1N(AbstractC12220kQ.A01(c36004Fv2, userSession), "verified_calling_dialog_impression");
        }
        C0f9.A0A(-1987503776, A0N);
        C0f9.A0A(-1388319167, A03);
    }
}
