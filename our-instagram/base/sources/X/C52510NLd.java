package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.NLd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52510NLd extends AbstractC42425IqS {
    public final /* synthetic */ C52128N5b A00;

    public C52510NLd(C52128N5b c52128N5b) {
        this.A00 = c52128N5b;
    }

    @Override // X.JPT
    public final void DLL(View view, C5qT c5qT, AbstractC127945qN abstractC127945qN, C38321qM c38321qM) {
        String id;
        String str;
        C52128N5b c52128N5b = this.A00;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            Nj6 nj6 = c52128N5b.A00;
            String str2 = null;
            if (nj6 == null) {
                str = "entrySurface";
            } else {
                InterfaceC09390do interfaceC09390do = c52128N5b.A08;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C38321qM c38321qM2 = c52128N5b.A02;
                str = "entryMedia";
                if (c38321qM2 != null) {
                    C14360o3.A0B(A0r, 1);
                    AbstractC54298NzI.A00(nj6, c52128N5b, A0r, c38321qM2, C05F.A00, id, AbstractC166987dD.A1I());
                    Iterable iterable = (Iterable) ((C51056MhA) c52128N5b.A07.getValue()).A03.getValue();
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        String A0g = AbstractC37302Gc3.A0g(it);
                        if (A0g != null) {
                            A1E.add(A0g);
                        }
                    }
                    ArrayList A1F = AbstractC166987dD.A1F(A1E);
                    C38321qM c38321qM3 = c52128N5b.A02;
                    if (c38321qM3 != null) {
                        InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(c38321qM3);
                        if (A0t != null) {
                            str2 = A0t.getIconicHorizonWorldName();
                        }
                        AbstractC31172DnG.A1M(c52128N5b, AbstractC31174DnI.A0a(c52128N5b.requireActivity(), C31569Dtv.A02(null, null, "Static", str2, id, C52128N5b.__redex_internal_original_name, c52128N5b.A05, null, A1F), AbstractC166987dD.A0o(interfaceC09390do), ModalActivity.class, AbstractC111324zv.A00(848)));
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
