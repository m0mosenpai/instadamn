package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.DvK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31654DvK implements InterfaceC41501vz {
    public final JR2 A00;

    public C31654DvK(JR2 jr2) {
        C14360o3.A0B(jr2, 1);
        this.A00 = jr2;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(-1825541481);
        int A032 = C0f9.A03(28988071);
        JR2 jr2 = this.A00;
        FragmentActivity activity = jr2.A1L.getActivity();
        if (activity != null) {
            String A0k = AbstractC167017dG.A0k(activity.getResources(), 1, R.plurals.igd_inbox_thread_batch_deletion_snack_bar_message);
            C14360o3.A07(A0k);
            jr2.A0p();
            C006802i c006802i = C006802i.A0p;
            C146106i8 A0Y = AbstractC31174DnI.A0Y();
            A0Y.A0H = AbstractC43591JPw.A00(919);
            A0Y.A0D = A0k;
            A0Y.A06();
            if (!jr2.A0w().Bkz().isEmpty()) {
                AbstractC31175DnJ.A0l(activity, A0Y, 2131963949);
                A0Y.A0L = true;
                G9A.A00(A0Y, this, c006802i, 10);
            }
            AbstractC31178DnM.A1S(A0Y);
            C0f9.A0A(-1332490647, A032);
            C0f9.A0A(-1696755637, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-678259299, A032);
        throw A0g;
    }
}
