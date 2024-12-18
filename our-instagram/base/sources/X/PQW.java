package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes9.dex */
public final class PQW implements Runnable {
    public final /* synthetic */ P1E A00;
    public final /* synthetic */ OWR A01;

    public PQW(P1E p1e, OWR owr) {
        this.A00 = p1e;
        this.A01 = owr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P1E p1e = this.A00;
        IgdsSwitch igdsSwitch = p1e.A0B;
        if (igdsSwitch != null) {
            OWR owr = this.A01;
            FragmentActivity activity = p1e.A0I.getActivity();
            if (activity != null) {
                owr.A01(activity, igdsSwitch, p1e.A0J);
            }
        }
    }
}
