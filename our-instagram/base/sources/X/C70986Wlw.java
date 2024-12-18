package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Wlw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70986Wlw implements InterfaceC71929XAx {
    public final int A00;
    public final Object A01;

    public C70986Wlw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC71929XAx
    public final void DKH() {
        UserSession userSession;
        Class<ModalActivity> cls;
        Bundle A0E;
        FragmentActivity requireActivity;
        String str;
        V1D v1d;
        switch (this.A00) {
            case 0:
                V1E v1e = (V1E) this.A01;
                C69178Vj7 c69178Vj7 = v1e.A07;
                if (c69178Vj7 != null) {
                    Hashtag hashtag = v1e.A04;
                    C146016hy c146016hy = ((AbstractC149546o6) c69178Vj7.A02).A00;
                    if (c146016hy != null) {
                        c146016hy.A00(hashtag, c69178Vj7.A00, c69178Vj7.A01);
                    }
                }
                userSession = v1e.A01;
                cls = ModalActivity.class;
                A0E = WE2.A00(v1e.A04, I58.A00(v1e, v1e.A08), "reel_context_sheet_hashtag");
                requireActivity = v1e.requireActivity();
                str = AbstractC111324zv.A00(431);
                v1d = v1e;
                break;
            case 1:
                V1D v1d2 = (V1D) this.A01;
                if (C1VW.A00 == null) {
                    return;
                }
                C69177Vj6 c69177Vj6 = v1d2.A03;
                if (c69177Vj6 != null) {
                    String A05 = v1d2.A01.A05();
                    C143536ds c143536ds = c69177Vj6.A02;
                    C84823qW c84823qW = c69177Vj6.A01;
                    C41551w4 c41551w4 = c69177Vj6.A00;
                    C146016hy c146016hy2 = ((AbstractC149546o6) c143536ds).A00;
                    if (c146016hy2 != null) {
                        C14360o3.A0B(A05, 0);
                        C145826hf c145826hf = c146016hy2.A03;
                        String str2 = c84823qW.A1g;
                        C14360o3.A07(str2);
                        c145826hf.A0N(c41551w4, true, "location", A05, str2);
                    }
                }
                userSession = v1d2.A00;
                cls = ModalActivity.class;
                C1VW.A00.getFragmentFactory();
                String A052 = v1d2.A01.A05();
                A0E = AbstractC31174DnI.A0E(A052, 0);
                A0E.putString(AbstractC43591JPw.A00(116), A052);
                requireActivity = v1d2.requireActivity();
                str = "location_feed";
                v1d = v1d2;
                break;
            default:
                EMN.A02((EMN) this.A01);
                return;
        }
        C6XJ c6xj = new C6XJ(requireActivity, A0E, userSession, cls, str);
        c6xj.A08();
        c6xj.A0C(v1d.requireActivity());
    }
}
