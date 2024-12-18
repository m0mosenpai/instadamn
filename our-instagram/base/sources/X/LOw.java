package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* loaded from: classes8.dex */
public final class LOw implements View.OnClickListener {
    public final int A00;
    public final long A01;
    public final Object A02;

    public LOw(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(1896581076);
                ((C4F7) this.A02).AOh(this.A01);
                i = 1949046665;
                break;
            case 1:
                A05 = C0f9.A05(-2080572049);
                C48755LhN c48755LhN = (C48755LhN) this.A02;
                JY1.A03(c48755LhN.A00, c48755LhN.A01, c48755LhN.A02, this.A01, true);
                i = -33878802;
                break;
            default:
                A05 = C0f9.A05(-1159509498);
                C48755LhN c48755LhN2 = (C48755LhN) this.A02;
                UserSession userSession = c48755LhN2.A02;
                FragmentActivity fragmentActivity = c48755LhN2.A00;
                NotesRepository notesRepository = c48755LhN2.A03;
                String valueOf = String.valueOf(this.A01);
                C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
                A0H.A05 = fragmentActivity.getString(2131968760);
                A0H.A0r(fragmentActivity.getString(2131968759));
                A0H.A0s(true);
                A0H.A0t(true);
                A0H.A0H(new DialogInterfaceOnClickListenerC35352FiT(fragmentActivity, notesRepository, userSession, valueOf, 5), 2131968948);
                AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC48007LMc.A00, A0H, 2131968770);
                AbstractC135966Db.A01(userSession).A0D(EnumC46303KeZ.A0C);
                i = 175970817;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
