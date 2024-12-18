package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.Mj0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51157Mj0 extends C2UU {
    public InterfaceC11380iw A00;
    public List A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;

    public C51157Mj0(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = C16930sl.A00;
        this.A03 = AbstractC09440dt.A01(C43197J7u.A00);
    }

    public final void A00(List list) {
        C14360o3.A0B(list, 0);
        this.A01 = list;
        notifyDataSetChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0258, code lost:
    
        if (r0 != null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025d, code lost:
    
        if (r0 != null) goto L59;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r11, int r12) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51157Mj0.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        LayoutInflater from = LayoutInflater.from(A06);
        switch (MSW.A07(C05F.A00(14), i)) {
            case 0:
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A07(A06);
                return new C51259Mki(new C38311Gsx(A06));
            case 1:
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A07(A06);
                return new C51285Ml8(this.A02, new IgdsListCell(A06, null));
            case 2:
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A07(A06);
                return new C51260Mkj(new IgdsListCell(A06, null));
            case 3:
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C3OO(AbstractC25226BEj.A0R(from, viewGroup, R.layout.product_settings_loading_row, false));
            case 4:
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A07(A06);
                return new C51257Mkg(new IgdsFooterCell(A06, null));
            case 5:
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51258Mkh(AbstractC25226BEj.A0R(from, viewGroup, R.layout.product_settings_h_scroll_item, false));
            case 6:
                int i8 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A07(A06);
                return new C51248MkX(VVA.A00(A06, viewGroup, true));
            case 7:
                int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0A(from);
                C14360o3.A0B(from, 1);
                Context context = from.getContext();
                View A0C = AbstractC31173DnH.A0C(from, viewGroup, R.layout.merchant_hscroll, false);
                C38503GwO c38503GwO = new C38503GwO(A0C);
                A0C.setTag(c38503GwO);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
                linearLayoutManager.A12(true);
                RecyclerView recyclerView = c38503GwO.A04;
                recyclerView.setLayoutManager(linearLayoutManager);
                Resources resources = context.getResources();
                ViewGroup.LayoutParams layoutParams = A0C.getLayoutParams();
                layoutParams.height = -2;
                A0C.setLayoutParams(layoutParams);
                AbstractC37304Gc5.A0z(recyclerView, AbstractC166997dE.A05(resources), AbstractC166997dE.A07(resources));
                AbstractC13880nE.A0Y(recyclerView, AbstractC166997dE.A05(resources));
                return new C38503GwO(A0C);
            case 8:
                int i10 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51347Mm8(AbstractC25226BEj.A0R(from, viewGroup, R.layout.fan_club_main_recommendation_row, false), this.A02);
            case 9:
                int i11 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51329Mlq(AbstractC25226BEj.A0R(from, viewGroup, R.layout.fan_club_settings_recommendations_row, false));
            case 10:
                int i12 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C81423kC(AbstractC25226BEj.A0R(from, viewGroup, R.layout.generic_v3_megaphone, false));
            case 11:
                int i13 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A07(A06);
                return new C51256Mkf(new IgdsBanner(A06, null, 0));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                int i14 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51284Ml7(AbstractC25226BEj.A0R(from, viewGroup, R.layout.product_setting_text_row, false));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int i15 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51321Mli(AbstractC25226BEj.A0R(from, viewGroup, R.layout.product_settings_next_step_row, false));
            default:
                throw B4Z.A00();
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1701950599);
        int size = this.A01.size();
        C0f9.A0A(-371092068, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(123525585);
        int intValue = ((InterfaceC57961Pn7) this.A01.get(i)).BKE().intValue();
        C0f9.A0A(354204809, A03);
        return intValue;
    }
}
