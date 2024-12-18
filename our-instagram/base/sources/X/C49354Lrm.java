package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lrm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49354Lrm implements MQ7 {
    public final int A00;
    public final Object A01;

    public C49354Lrm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.MQ7
    public final void onFailure() {
        Runnable runnableC49888M1h;
        int i = this.A00;
        FragmentActivity A0C = AbstractC31172DnG.A0C(this.A01);
        if (i != 0) {
            runnableC49888M1h = new RunnableC49890M1j(A0C);
        } else {
            runnableC49888M1h = new RunnableC49888M1h(A0C);
        }
        A0C.runOnUiThread(runnableC49888M1h);
    }

    @Override // X.MQ7
    public final void onSuccess() {
        FragmentActivity requireActivity;
        Runnable runnableC49888M1h;
        if (this.A00 != 0) {
            C19L c19l = LFw.A02;
            C45476KBo c45476KBo = (C45476KBo) this.A01;
            UserSession userSession = c45476KBo.A01;
            if (userSession != null) {
                new LFw(userSession).A00("igd_nudity_detection_model_loading_nux");
                c45476KBo.requireActivity().runOnUiThread(new RunnableC49891M1k(c45476KBo));
                requireActivity = c45476KBo.requireActivity();
                runnableC49888M1h = new RunnableC49890M1j(requireActivity);
            } else {
                C14360o3.A0F("session");
                throw C00O.createAndThrow();
            }
        } else {
            C45475KBn c45475KBn = (C45475KBn) this.A01;
            c45475KBn.requireActivity().runOnUiThread(new RunnableC49889M1i(c45475KBn));
            C47859LCf.A00(1L, "DEFAULT_ON_NUX");
            requireActivity = c45475KBn.requireActivity();
            runnableC49888M1h = new RunnableC49888M1h(requireActivity);
        }
        requireActivity.runOnUiThread(runnableC49888M1h);
    }
}
