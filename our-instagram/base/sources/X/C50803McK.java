package X;

import android.widget.BaseAdapter;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.McK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50803McK extends BaseAdapter {
    public EnumC53319Nhv A00;
    public boolean A01;
    public boolean A02;
    public boolean A03 = false;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC57880Plk A06;
    public final InterfaceC58084Pp9 A07;
    public final InterfaceC58159PqO A08;
    public final ArrayList A09;
    public final Map A0A;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A09.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A09.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return Long.parseLong(MSW.A0t(this.A09, i).A06);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return AbstractC167007dF.A1X(MSW.A0t(this.A09, i).A03, EnumC40111tc.A0a) ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.ILh, X.NX6] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            r11 = this;
            if (r13 != 0) goto L34
            int r0 = r11.getItemViewType(r12)
            if (r0 == 0) goto L6c
            r2 = 0
            android.view.LayoutInflater r1 = X.AbstractC31177DnL.A0E(r14, r2)
            r0 = 2131627454(0x7f0e0dbe, float:1.8882173E38)
            android.view.View r13 = X.AbstractC31173DnH.A0C(r1, r14, r0, r2)
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            X.NX6 r1 = new X.NX6
            r1.<init>(r13)
            r0 = 2131434587(0x7f0b1c5b, float:1.8490992E38)
            android.view.View r0 = X.AbstractC166987dD.A0c(r13, r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r0
            r1.A01 = r0
            r0 = 2131442514(0x7f0b3b52, float:1.850707E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.AbstractC37302Gc3.A0K(r13, r0)
            r1.A00 = r0
        L31:
            r13.setTag(r1)
        L34:
            int r0 = r11.getItemViewType(r12)
            if (r0 == 0) goto L87
            java.lang.Object r6 = X.AbstractC31172DnG.A0x(r13)
            X.NX6 r6 = (X.NX6) r6
            java.util.ArrayList r0 = r11.A09
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r5 = X.MSW.A0t(r0, r12)
            X.0iw r4 = r11.A04
            X.Plk r3 = r11.A06
            X.AbstractC167017dG.A1N(r6, r5)
            r0 = 3
            X.C14360o3.A0B(r3, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r6.A00
            com.instagram.common.typedurl.ImageUrl r1 = r5.A02
            java.lang.String r0 = "Required value was null."
            if (r1 == 0) goto L82
            if (r4 == 0) goto L7d
            r2.setUrl(r1, r4)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r1 = r6.A01
            float r0 = X.AbstractC55229Oez.A00(r5)
            r1.A00 = r0
            r0 = 60
            X.Ok3.A00(r1, r0, r3)
            return r13
        L6c:
            android.view.LayoutInflater r1 = X.AbstractC25228BEl.A0P(r14)
            r0 = 2131627456(0x7f0e0dc0, float:1.8882177E38)
            android.view.View r13 = X.AbstractC31172DnG.A0A(r1, r14, r0)
            X.NX7 r1 = new X.NX7
            r1.<init>(r13)
            goto L31
        L7d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L87:
            java.lang.Object r2 = X.AbstractC31172DnG.A0x(r13)
            X.NX7 r2 = (X.NX7) r2
            X.Nhv r4 = r11.A00
            java.util.ArrayList r0 = r11.A09
            java.lang.Object r3 = r0.get(r12)
            com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo r3 = (com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo) r3
            com.instagram.common.session.UserSession r1 = r11.A05
            X.0iw r0 = r11.A04
            X.PqO r6 = r11.A08
            r6.getClass()
            X.Pp9 r5 = r11.A07
            java.util.Map r7 = r11.A0A
            boolean r8 = r11.A03
            boolean r9 = r11.A02
            boolean r10 = r11.A01
            X.AbstractC54232NyD.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50803McK.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C50803McK(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC57880Plk interfaceC57880Plk, InterfaceC58084Pp9 interfaceC58084Pp9, InterfaceC58159PqO interfaceC58159PqO, ArrayList arrayList, Map map, boolean z, boolean z2) {
        this.A09 = arrayList;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A08 = interfaceC58159PqO;
        this.A07 = interfaceC58084Pp9;
        this.A06 = interfaceC57880Plk;
        this.A0A = map;
        this.A02 = z;
        this.A01 = z2;
    }
}
