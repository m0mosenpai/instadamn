package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CvX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29276CvX implements InterfaceC31057Dkz {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.InterfaceC31057Dkz
    public final void D31(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        if (id != null) {
            UserSession userSession = this.A01;
            if (C17570ts.A00(userSession).A01(id) == null) {
                String str = null;
                String A18 = AbstractC25228BEl.A18(c38321qM.A2E(userSession));
                ProductType A1z = c38321qM.A1z();
                if (A1z != null) {
                    str = A1z.A00;
                }
                C17570ts.A00(userSession).A05(new C17530to(id, A18, str));
            }
        }
    }

    @Override // X.InterfaceC31057Dkz
    public final void DPq(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        InterfaceC31135DmI BfC = c38321qM.A0C.BfC();
        if (BfC != null) {
            HYF A00 = AbstractC27688CJh.A00(this.A01);
            List Bfu = BfC.Bfu();
            ArrayList A0q = AbstractC167017dG.A0q(Bfu);
            Iterator it = Bfu.iterator();
            while (it.hasNext()) {
                String id = ((C38321qM) it.next()).getId();
                if (id == null) {
                    id = "";
                }
                A0q.add(id);
            }
            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0q);
            C14360o3.A07(copyOf);
            AbstractC166987dD.A1Z(new MCA(A00, c38321qM, copyOf, null, 15, 7), ((C4A7) A00).A01);
        }
    }

    @Override // X.InterfaceC31057Dkz
    public final void Daf(String str, String str2) {
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A1I = false;
        C189478aR A00 = A0y.A00();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_ID", str2);
        A0b.putString("user_ID", str);
        C26730BrB c26730BrB = new C26730BrB();
        c26730BrB.setArguments(A0b);
        A00.A02(fragmentActivity, c26730BrB);
    }

    @Override // X.InterfaceC31057Dkz
    public final boolean Dag(String str, String str2, String str3) {
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A03 = 0.18f;
        A0y.A04 = 1.0f;
        AbstractC25225BEi.A1Q(A0y, true);
        C189478aR A00 = A0y.A00();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_ID", str2);
        A0b.putString("user_ID", str);
        A0b.putString("post_media_id", str3);
        C26734BrF c26734BrF = new C26734BrF();
        c26734BrF.setArguments(A0b);
        A00.A02(fragmentActivity, c26734BrF);
        return true;
    }

    @Override // X.InterfaceC31057Dkz
    public final void DcB(String str) {
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        C6XJ.A02(fragmentActivity, AbstractC61636Rr0.A00(AbstractC25230BEn.A1b(AbstractC111324zv.A00(3929), str)), userSession, TransparentModalActivity.class, AbstractC111324zv.A00(3705)).A0C(fragmentActivity);
    }

    public C29276CvX(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
