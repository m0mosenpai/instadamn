package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8QA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8QA extends C2UU {
    public static Integer A06;
    public List A00 = new ArrayList();
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final InterfaceC16620sF A04;
    public final UserSession A05;

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        C50811Mcd c50811Mcd = new C50811Mcd(context, EnumC53257Ngv.A06);
        Context context2 = c50811Mcd.getContext();
        C14360o3.A07(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) AbstractC13880nE.A04(context2, 44), (int) AbstractC13880nE.A04(context2, 44));
        layoutParams.setMargins(0, (int) AbstractC13880nE.A04(context2, 20), 0, 0);
        c50811Mcd.setLayoutParams(layoutParams);
        return new C51359MmK(c50811Mcd, this.A05, c50811Mcd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0194, code lost:
    
        if (r3.A02 == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0278  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r20, int r21) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8QA.onBindViewHolder(X.3OO, int):void");
    }

    public C8QA(Context context, UserSession userSession, InterfaceC16620sF interfaceC16620sF, int i) {
        this.A03 = context;
        this.A05 = userSession;
        this.A02 = i;
        this.A04 = interfaceC16620sF;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(502547414);
        int size = this.A00.size();
        C0f9.A0A(594946763, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C0f9.A0A(-489064083, C0f9.A03(424853329));
        return 0;
    }
}
