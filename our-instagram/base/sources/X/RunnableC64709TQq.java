package X;

import android.view.View;
import com.facebook.R;
import com.instagram.business.instantexperiences.ui.InstantExperiencesAutofillBar;
import java.util.List;

/* renamed from: X.TQq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64709TQq implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C64454TEq A01;
    public final /* synthetic */ InterfaceC65451TkN A02;
    public final /* synthetic */ List A03;

    public RunnableC64709TQq(View view, C64454TEq c64454TEq, InterfaceC65451TkN interfaceC65451TkN, List list) {
        this.A01 = c64454TEq;
        this.A00 = view;
        this.A03 = list;
        this.A02 = interfaceC65451TkN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C64454TEq c64454TEq = this.A01;
        InstantExperiencesAutofillBar instantExperiencesAutofillBar = c64454TEq.A00;
        if (instantExperiencesAutofillBar == null) {
            instantExperiencesAutofillBar = (InstantExperiencesAutofillBar) AbstractC167017dG.A0U(this.A00, R.id.instant_experiences_autofill_bar);
            c64454TEq.A00 = instantExperiencesAutofillBar;
        }
        instantExperiencesAutofillBar.A00(new C64452TEo(this), this.A03);
        c64454TEq.A02.A00(true);
    }
}
