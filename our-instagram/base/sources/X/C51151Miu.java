package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Miu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51151Miu extends C2UU {
    public final List A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final N77 A03;

    public C51151Miu(InterfaceC11380iw interfaceC11380iw, UserSession userSession, N77 n77) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = n77;
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C14360o3.A0B(c3oo, 0);
        if (getItemViewType(i) == 1) {
            C51351MmC c51351MmC = (C51351MmC) c3oo;
            C54573O8z c54573O8z = (C54573O8z) this.A00.get(i);
            InterfaceC11380iw interfaceC11380iw = this.A01;
            C14360o3.A0B(c54573O8z, 0);
            User user = c54573O8z.A00;
            String str2 = null;
            if (user != null) {
                str = user.getId();
            } else {
                str = null;
            }
            c51351MmC.A00 = str;
            User user2 = c54573O8z.A00;
            if (user2 != null) {
                ((IgImageView) AbstractC166987dD.A17(c51351MmC.A04)).setUrl(user2.Bhu(), interfaceC11380iw);
            }
            TextView A06 = AbstractC37302Gc3.A06(c51351MmC.A05);
            User user3 = c54573O8z.A00;
            if (user3 != null) {
                str2 = user3.getUsername();
            }
            A06.setText(str2);
            AbstractC37302Gc3.A06(c51351MmC.A02).setText(c54573O8z.A01);
            InterfaceC09390do interfaceC09390do = c51351MmC.A06;
            MSZ.A11(AbstractC167007dF.A0L(interfaceC09390do).getResources(), AbstractC37302Gc3.A06(interfaceC09390do), "👋", 2131965626);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51351MmC(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_iglive_fundraiser_donor, false), this.A01, this.A03);
            }
            throw AbstractC31175DnJ.A0U("Unsupported view type: ", i);
        }
        return new C51230MkF(AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.layout_iglive_fundraiser_donor_empty_state, viewGroup, false), 2);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(2023427355);
        List list = this.A00;
        if (list.isEmpty()) {
            size = 1;
        } else {
            size = list.size();
        }
        C0f9.A0A(190807290, A03);
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r3.A00.isEmpty() == false) goto L6;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r4) {
        /*
            r3 = this;
            r0 = 336254245(0x140ad525, float:7.009255E-27)
            int r2 = X.C0f9.A03(r0)
            if (r4 != 0) goto L12
            java.util.List r0 = r3.A00
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L13
        L12:
            r1 = 1
        L13:
            r0 = 2040415947(0x799e46cb, float:1.0272734E35)
            X.C0f9.A0A(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51151Miu.getItemViewType(int):int");
    }
}
