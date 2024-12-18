package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import go.Seq;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public class EPV extends C2UT implements InterfaceC65242xM {
    public final InterfaceC11380iw analyticsModule;
    public boolean areRowDividersEnabled;
    public final Context context;
    public boolean isElevatedSurface;
    public final List objects;
    public boolean roundDialogBottomCorners;
    public boolean roundDialogTopCorners;
    public final AbstractC12990ll session;
    public boolean shouldCenterText;
    public InterfaceC37114GWz switchItemViewPointDelegate;
    public final List toAnimateMoveInItems;

    public EPV(Context context, AbstractC12990ll abstractC12990ll, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(context, 1);
        this.context = context;
        this.session = abstractC12990ll;
        this.analyticsModule = interfaceC11380iw;
        this.objects = AbstractC166987dD.A1E();
        this.toAnimateMoveInItems = AbstractC166987dD.A1E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2 == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r1 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C34957Fah getMenuItemState(int r9) {
        /*
            r8 = this;
            r1 = 1
            boolean r2 = X.AbstractC167007dF.A1N(r9)
            int r0 = r8.getCount()
            int r0 = r0 - r1
            boolean r1 = X.AbstractC167007dF.A1P(r9, r0)
            boolean r0 = r8.roundDialogTopCorners
            if (r0 == 0) goto L15
            r3 = 1
            if (r2 != 0) goto L16
        L15:
            r3 = 0
        L16:
            boolean r0 = r8.roundDialogBottomCorners
            if (r0 == 0) goto L1d
            r4 = 1
            if (r1 != 0) goto L1e
        L1d:
            r4 = 0
        L1e:
            boolean r5 = r8.shouldCenterText
            boolean r6 = r8.isElevatedSurface
            boolean r0 = r8.areRowDividersEnabled
            if (r0 == 0) goto L29
            r7 = 1
            if (r1 == 0) goto L2a
        L29:
            r7 = 0
        L2a:
            X.Fah r2 = new X.Fah
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPV.getMenuItemState(int):X.Fah");
    }

    public final void addDialogMenuItems(List list) {
        C14360o3.A0B(list, 0);
        this.objects.addAll(list);
        this.isElevatedSurface = true;
        notifyDataSetChanged();
    }

    @Override // android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // X.InterfaceC65242xM
    public EPV getAdapter() {
        return this;
    }

    @Override // X.InterfaceC65242xM
    public /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 2);
        C3OO onCreateViewHolder = onCreateViewHolder(viewGroup, getItemViewType(i));
        onBindViewHolder(onCreateViewHolder, i);
        return AbstractC31171DnF.A06(onCreateViewHolder);
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(X.C3OO r14, int r15) {
        /*
            Method dump skipped, instructions count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EPV.onBindViewHolder(X.3OO, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.Dxg, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.Dxf, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.Dxe, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.3OO, X.E19] */
    /* JADX WARN: Type inference failed for: r5v11, types: [X.3OO, X.E1D] */
    /* JADX WARN: Type inference failed for: r5v13, types: [X.3OO, X.E0o] */
    /* JADX WARN: Type inference failed for: r5v20, types: [X.3OO, X.E12] */
    /* JADX WARN: Type inference failed for: r5v21, types: [X.3OO, X.E0n] */
    /* JADX WARN: Type inference failed for: r5v23, types: [X.3OO, X.E11] */
    /* JADX WARN: Type inference failed for: r5v27, types: [X.3OO, X.E0z] */
    /* JADX WARN: Type inference failed for: r5v28, types: [X.3OO, X.E10] */
    /* JADX WARN: Type inference failed for: r5v31, types: [X.3OO, java.lang.Object, X.E14] */
    /* JADX WARN: Type inference failed for: r5v36, types: [X.3OO, X.E0v] */
    /* JADX WARN: Type inference failed for: r5v38, types: [X.3OO, X.E0x] */
    /* JADX WARN: Type inference failed for: r5v39, types: [X.3OO, X.E1A] */
    /* JADX WARN: Type inference failed for: r5v40, types: [X.3OO, X.E0p] */
    /* JADX WARN: Type inference failed for: r5v41, types: [X.3OO, X.E0j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42, types: [X.3OO, X.E0w] */
    /* JADX WARN: Type inference failed for: r5v44, types: [X.3OO, X.E0q] */
    /* JADX WARN: Type inference failed for: r5v48, types: [X.3OO, X.E15] */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.3OO, X.E0i] */
    /* JADX WARN: Type inference failed for: r5v9, types: [X.3OO, X.E0l] */
    @Override // X.C2UU
    public C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO c3oo;
        View view;
        C3OO c3oo2;
        View view2;
        C3OO c3oo3;
        C14360o3.A0B(viewGroup, 0);
        switch (C05F.A00(45)[i].intValue()) {
            case 1:
                c3oo3 = AbstractC35093Fd4.A00(this.context, viewGroup, false);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 2:
                c3oo3 = AbstractC34852FXk.A00(this.context, viewGroup);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 3:
                View inflate = A00(this).inflate(R.layout.row_textless_header, viewGroup, false);
                ?? c3oo4 = new C3OO(inflate);
                c3oo4.A00 = inflate.requireViewById(R.id.divider);
                c3oo3 = c3oo4;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 4:
                View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.context), viewGroup, R.layout.row_switch_item, false);
                C31981E3j c31981E3j = new C31981E3j(A0C);
                A0C.setTag(c31981E3j);
                F89.A00(A0C, c31981E3j.A06);
                return c31981E3j;
            case 5:
                ?? frameLayout = new FrameLayout(this.context);
                AbstractC25228BEl.A0P(frameLayout).inflate(R.layout.row_check_item, (ViewGroup) frameLayout);
                frameLayout.A01 = AbstractC166997dE.A0T(frameLayout, R.id.row_simple_text_textview);
                frameLayout.A00 = frameLayout.requireViewById(R.id.row_check_imageview);
                ?? c3oo5 = new C3OO(frameLayout);
                c3oo5.A01 = frameLayout;
                c3oo5.A00 = AbstractC166997dE.A0T(frameLayout, R.id.row_simple_text_textview);
                c3oo3 = c3oo5;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 6:
                View inflate2 = A00(this).inflate(R.layout.row_button_item, viewGroup, false);
                ?? c3oo6 = new C3OO(inflate2);
                c3oo6.A00 = (Button) inflate2.requireViewById(R.id.button_item);
                inflate2.setTag(c3oo6);
                c3oo3 = c3oo6;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 7:
                RadioGroup radioGroup = new RadioGroup(this.context);
                AbstractC31174DnI.A1D(radioGroup, -1, -2);
                ?? c3oo7 = new C3OO(radioGroup);
                c3oo7.A00 = radioGroup;
                c3oo3 = c3oo7;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 8:
                View inflate3 = A00(this).inflate(R.layout.row_user_item, viewGroup, false);
                ?? c3oo8 = new C3OO(inflate3);
                c3oo8.A03 = AbstractC31173DnH.A0T(inflate3, R.id.row_user_avatar);
                c3oo8.A02 = AbstractC166997dE.A0T(inflate3, R.id.row_user_username);
                c3oo8.A00 = AbstractC166997dE.A0T(inflate3, R.id.row_user_fullname);
                c3oo8.A01 = AbstractC166997dE.A0T(inflate3, R.id.row_user_detail);
                c3oo3 = c3oo8;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 9:
                View inflate4 = A00(this).inflate(R.layout.row_edit_text_item, viewGroup, false);
                ?? c3oo9 = new C3OO(inflate4);
                c3oo9.A00 = AbstractC31173DnH.A0H(inflate4, R.id.row_edit_text_content);
                view2 = inflate4;
                c3oo2 = c3oo9;
                view2.setTag(c3oo2);
                c3oo3 = c3oo2;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 10:
                View inflate5 = A00(this).inflate(R.layout.row_action_item, viewGroup, false);
                ?? c3oo10 = new C3OO(inflate5);
                c3oo10.A00 = AbstractC31173DnH.A0I(inflate5, R.id.row_action_icon);
                c3oo10.A01 = AbstractC166997dE.A0T(inflate5, R.id.row_action_name);
                view2 = inflate5;
                c3oo2 = c3oo10;
                view2.setTag(c3oo2);
                c3oo3 = c3oo2;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 11:
                c3oo3 = new C3OO(A00(this).inflate(R.layout.pref_load_failure_banner, viewGroup, false));
                C14360o3.A07(c3oo3);
                return c3oo3;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new E41(A00(this).inflate(R.layout.row_spinner_item, viewGroup, false), 4);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c3oo3 = AbstractC34328FBw.A00(this.context, viewGroup);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 14:
                c3oo3 = AbstractC34850FXi.A00(this.context, viewGroup);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case Process.SIGTERM /* 15 */:
                View inflate6 = A00(this).inflate(R.layout.row_metadata_item, viewGroup, false);
                ?? c3oo11 = new C3OO(inflate6);
                c3oo11.A02 = AbstractC166997dE.A0T(inflate6, R.id.row_simple_text_textview);
                c3oo11.A00 = inflate6.requireViewById(R.id.row_divider);
                c3oo11.A01 = AbstractC166997dE.A0T(inflate6, R.id.row_simple_text_metadata_textview);
                inflate6.setTag(c3oo11);
                view2 = inflate6;
                c3oo2 = c3oo11;
                view2.setTag(c3oo2);
                c3oo3 = c3oo2;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 16:
                c3oo3 = AbstractC34847FXf.A00(this.context, viewGroup);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 17:
                c3oo3 = AbstractC34848FXg.A00(this.context, viewGroup);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 18:
                ?? frameLayout2 = new FrameLayout(this.context);
                AbstractC25228BEl.A0P(frameLayout2).inflate(R.layout.row_check_secondary_text_item, (ViewGroup) frameLayout2);
                frameLayout2.A02 = AbstractC166997dE.A0T(frameLayout2, R.id.row_primary_text_textview);
                frameLayout2.A01 = AbstractC166997dE.A0T(frameLayout2, R.id.row_secondary_text_textview);
                frameLayout2.A00 = frameLayout2.requireViewById(R.id.row_check_imageview);
                ?? c3oo12 = new C3OO(frameLayout2);
                c3oo12.A02 = frameLayout2;
                c3oo12.A01 = AbstractC166997dE.A0T(frameLayout2, R.id.row_primary_text_textview);
                c3oo12.A00 = AbstractC166997dE.A0T(frameLayout2, R.id.row_secondary_text_textview);
                c3oo3 = c3oo12;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case Process.SIGSTOP /* 19 */:
                ?? frameLayout3 = new FrameLayout(this.context);
                AbstractC25228BEl.A0P(frameLayout3).inflate(R.layout.row_check_secondary_text_whatsapp_color_item, (ViewGroup) frameLayout3);
                frameLayout3.A02 = AbstractC166987dD.A0e(frameLayout3, R.id.row_primary_text_textview);
                frameLayout3.A01 = AbstractC166987dD.A0e(frameLayout3, R.id.row_secondary_text_textview);
                frameLayout3.A00 = frameLayout3.findViewById(R.id.row_check_whatsapp_color_imageview);
                ?? c3oo13 = new C3OO(frameLayout3);
                c3oo13.A02 = frameLayout3;
                c3oo13.A01 = AbstractC166997dE.A0T(frameLayout3, R.id.row_primary_text_textview);
                c3oo13.A00 = AbstractC166997dE.A0T(frameLayout3, R.id.row_secondary_text_textview);
                c3oo3 = c3oo13;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 20:
                c3oo3 = new C3OO(A00(this).inflate(R.layout.row_selection_item, viewGroup, false));
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 21:
                Context context = this.context;
                C15980qs A00 = AbstractC15960qq.A00(context);
                View inflate7 = LayoutInflater.from(context).inflate(R.layout.branding_settings_layout, viewGroup, false);
                TextView A0T = AbstractC166997dE.A0T(inflate7, R.id.branding_text_v2_from);
                TextView A0T2 = AbstractC166997dE.A0T(inflate7, R.id.branding_text_v2_facebook);
                A0T.setTypeface(A00.A02(EnumC15950qp.A0J));
                A0T2.setTypeface(A00.A02(EnumC15950qp.A0K));
                c3oo3 = new C3OO(inflate7);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 22:
                View inflate8 = A00(this).inflate(R.layout.row_image_with_description_item, viewGroup, false);
                ?? c3oo14 = new C3OO(inflate8);
                c3oo14.A00 = AbstractC31173DnH.A0I(inflate8, R.id.image_row_icon);
                c3oo14.A02 = AbstractC166997dE.A0T(inflate8, R.id.image_row_name);
                c3oo14.A01 = AbstractC166997dE.A0T(inflate8, R.id.image_row_description);
                c3oo3 = c3oo14;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 23:
                View inflate9 = A00(this).inflate(R.layout.typeahead_header, viewGroup, false);
                ?? c3oo15 = new C3OO(inflate9);
                c3oo15.A00 = (SearchEditText) inflate9.requireViewById(R.id.row_search_edit_text);
                c3oo3 = c3oo15;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 24:
                c3oo3 = AbstractC34849FXh.A00(this.context, viewGroup);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 25:
                View inflate10 = A00(this).inflate(R.layout.row_menu_fxcal_item, viewGroup, false);
                ?? c3oo16 = new C3OO(inflate10);
                c3oo16.A00 = (IgFrameLayout) inflate10.findViewById(R.id.fxcal_link_container);
                c3oo3 = c3oo16;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 26:
                View inflate11 = A00(this).inflate(R.layout.row_menu_item, viewGroup, false);
                ?? c3oo17 = new C3OO(inflate11);
                c3oo17.A02 = AbstractC166997dE.A0T(inflate11, R.id.row_simple_text_textview);
                c3oo17.A00 = inflate11.requireViewById(R.id.row_divider);
                c3oo17.A01 = AbstractC31171DnF.A08(inflate11, R.id.row_simple_text_end_imageview);
                c3oo3 = c3oo17;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 27:
                View inflate12 = A00(this).inflate(R.layout.row_large_button_item, viewGroup, false);
                inflate12.setTag(new E2B(inflate12));
                c3oo3 = (C3OO) AbstractC31172DnG.A0x(inflate12);
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 28:
                return new C31951E2f(AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.context), viewGroup, R.layout.row_info_item, false));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C31928E1i(A00(this).inflate(R.layout.row_center_image, viewGroup, false));
            case 30:
                View inflate13 = A00(this).inflate(R.layout.row_button_with_description_item, viewGroup, false);
                E2A e2a = new E2A(inflate13);
                view2 = inflate13;
                c3oo2 = e2a;
                view2.setTag(c3oo2);
                c3oo3 = c3oo2;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 31:
                View inflate14 = A00(this).inflate(R.layout.row_button_primary_wrapped_with_description_item, viewGroup, false);
                E29 e29 = new E29(inflate14);
                view2 = inflate14;
                c3oo2 = e29;
                view2.setTag(c3oo2);
                c3oo3 = c3oo2;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 32:
                View inflate15 = A00(this).inflate(R.layout.row_menu_privacy_center_item, viewGroup, false);
                ?? c3oo18 = new C3OO(inflate15);
                c3oo18.A00 = AbstractC166987dD.A0e(inflate15, R.id.link_textview);
                c3oo3 = c3oo18;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 33:
                return new C31950E2e(AbstractC25226BEj.A0R(AbstractC31172DnG.A09(this.context), viewGroup, R.layout.row_compound_item, false));
            case 34:
                View inflate16 = A00(this).inflate(R.layout.company_layer_menu_center_item, viewGroup, false);
                ?? c3oo19 = new C3OO(inflate16);
                c3oo19.A00 = (IgFrameLayout) inflate16.findViewById(R.id.accounts_center_link_container);
                c3oo19.A03 = (TitleTextView) inflate16.findViewById(R.id.accounts_center_link_textview);
                c3oo19.A01 = AbstractC31172DnG.A0Y(inflate16, R.id.accounts_center_subtitle_textview);
                c3oo19.A04 = (TitleTextView) inflate16.findViewById(R.id.fc_link_textview);
                c3oo19.A02 = AbstractC31172DnG.A0Y(inflate16, R.id.fc_subtitle_textview);
                c3oo19.A05 = AbstractC31172DnG.A0a(inflate16, R.id.company_brand_image);
                c3oo3 = c3oo19;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 35:
                View inflate17 = A00(this).inflate(R.layout.company_layer_accounts_center_item, viewGroup, false);
                ?? c3oo20 = new C3OO(inflate17);
                c3oo20.A00 = (CardView) inflate17.findViewById(R.id.accounts_center_link_container);
                c3oo20.A03 = AbstractC31172DnG.A0Y(inflate17, R.id.accounts_center_link_textview);
                c3oo20.A02 = AbstractC31172DnG.A0Y(inflate17, R.id.accounts_center_learn_more_link_textview);
                c3oo20.A01 = (IgLinearLayout) inflate17.findViewById(R.id.accounts_center_payments_row);
                c3oo3 = c3oo20;
                C14360o3.A07(c3oo3);
                return c3oo3;
            case 36:
                Context context2 = this.context;
                C14360o3.A0B(context2, 0);
                IgdsListCell A0Z = AbstractC31174DnI.A0Z(context2);
                ?? c3oo21 = new C3OO(A0Z);
                c3oo21.A00 = A0Z;
                return c3oo21;
            case 37:
                return new E38(AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.context), viewGroup, R.layout.people_cell_with_switch_item, false));
            case 38:
                return new C31949E2d(AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.context), viewGroup, R.layout.ac_transition_top_banner, false));
            case 39:
                return new E28(AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.context), viewGroup, R.layout.ac_transition_second_level_top_banner, false));
            case 40:
                Context context3 = this.context;
                C14360o3.A0B(context3, 0);
                IgdsBanner igdsBanner = new IgdsBanner(context3, null, 0);
                ?? c3oo22 = new C3OO(igdsBanner);
                c3oo22.A00 = igdsBanner;
                view = igdsBanner;
                c3oo = c3oo22;
                view.setTag(c3oo);
                return c3oo;
            case Seq.NULL_REFNUM /* 41 */:
                Context context4 = this.context;
                C14360o3.A0B(context4, 0);
                IgdsListCell A0Z2 = AbstractC31174DnI.A0Z(context4);
                C3OO c31929E1j = new C31929E1j(A0Z2);
                view = A0Z2;
                c3oo = c31929E1j;
                view.setTag(c3oo);
                return c3oo;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                Context context5 = this.context;
                InterfaceC11380iw interfaceC11380iw = this.analyticsModule;
                if (interfaceC11380iw != null) {
                    return new E37(AbstractC25227BEk.A0D(AbstractC31172DnG.A09(context5), viewGroup, R.layout.row_circular_image_center, false), interfaceC11380iw);
                }
                throw AbstractC166997dE.A0g();
            case 43:
                UserSession userSession = (UserSession) this.session;
                Context context6 = this.context;
                View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context6), viewGroup, R.layout.avatar_privacy_settings_visibility_component, false);
                C3OO c31952E2g = new C31952E2g(context6, A0D, userSession);
                view = A0D;
                c3oo = c31952E2g;
                view.setTag(c3oo);
                return c3oo;
            case 44:
                View A0D2 = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.context), viewGroup, R.layout.layout_thread_detail_secure_message_learn_more, false);
                C3OO e1l = new E1L(A0D2);
                view = A0D2;
                c3oo = e1l;
                view.setTag(c3oo);
                return c3oo;
            default:
                E1C A002 = AbstractC34851FXj.A00(this.context, viewGroup);
                if (this.isElevatedSurface) {
                    A002.itemView.setPadding(0, 0, 0, 0);
                }
                return A002;
        }
    }

    public final void setBottomSheetMenuItems(Collection collection) {
        C14360o3.A0B(collection, 0);
        this.objects.clear();
        this.isElevatedSurface = true;
        this.objects.addAll(collection);
        notifyDataSetChanged();
    }

    public final void setItems(Collection collection) {
        C14360o3.A0B(collection, 0);
        this.objects.clear();
        this.objects.addAll(collection);
        notifyDataSetChanged();
    }

    public static LayoutInflater A00(EPV epv) {
        return LayoutInflater.from(epv.context);
    }

    public final void addMenuItemWithAnimation(Object obj, int i) {
        if (!AbstractC001800i.A0u(this.objects, obj)) {
            this.toAnimateMoveInItems.add(Integer.valueOf(i));
            List list = this.objects;
            C14360o3.A0A(obj);
            list.add(i, obj);
        }
        notifyDataSetChanged();
    }

    @Override // X.C2UT, android.widget.Adapter
    public int getCount() {
        return this.objects.size();
    }

    @Override // android.widget.Adapter, X.InterfaceC65242xM
    public Object getItem(int i) {
        return this.objects.get(i);
    }

    public final int getPosition(Object obj) {
        List list = this.objects;
        C14360o3.A0B(list, 0);
        return list.indexOf(obj);
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        return C05F.A00(45).length;
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(-1516114635);
        int size = this.objects.size();
        C0f9.A0A(2037096917, A03);
        return size;
    }

    @Override // X.C2UT, X.C2UU, android.widget.Adapter
    public long getItemId(int i) {
        C0f9.A0A(-566630962, C0f9.A03(-243531129));
        return 0L;
    }

    @Override // X.C2UU, android.widget.Adapter
    public int getItemViewType(int i) {
        Integer num;
        int A03 = C0f9.A03(2092575728);
        Object item = getItem(i);
        if (item instanceof FMU) {
            num = C05F.A0G;
        } else if (item instanceof C31335Dq0) {
            num = C05F.A01;
        } else if (item instanceof C35119FeM) {
            num = C05F.A0N;
        } else if (item instanceof C35246Fgf) {
            num = C05F.A0C;
        } else if (item instanceof C36731GHa) {
            num = C05F.A0Y;
        } else if (item instanceof FNC) {
            num = C05F.A0A;
        } else if (item instanceof FNB) {
            num = C05F.A0B;
        } else if (item instanceof FMR) {
            num = C05F.A0j;
        } else if (item instanceof GHZ) {
            num = C05F.A0U;
        } else if (item instanceof C50676MYu) {
            num = C05F.A0u;
        } else if (item instanceof C34960Fak) {
            num = C05F.A15;
        } else if (item instanceof C35473Fl9) {
            num = C05F.A1I;
        } else if (item instanceof C34326FBu) {
            num = C05F.A03;
        } else if (item instanceof C34473FHl) {
            num = C05F.A04;
        } else if (item instanceof C34969Fat) {
            num = C05F.A06;
        } else if (item instanceof C35200Ffs) {
            num = C05F.A09;
        } else if (item instanceof C34966Faq) {
            num = C05F.A07;
        } else if (item instanceof GHX) {
            num = C05F.A08;
        } else if (item instanceof FLO) {
            num = C05F.A0D;
        } else if (item instanceof C34965Fap) {
            num = C05F.A0H;
        } else if (item instanceof FMT) {
            num = C05F.A0K;
        } else if (item instanceof FMS) {
            num = C05F.A0L;
        } else if (item instanceof C34940FaQ) {
            num = C05F.A0M;
        } else if (item instanceof FMQ) {
            num = C05F.A0O;
        } else if (item instanceof C34471FHj) {
            num = C05F.A0P;
        } else if (item instanceof C34472FHk) {
            num = C05F.A0R;
        } else if (C211739Zk.A00(item, 4)) {
            num = C05F.A0Z;
        } else if (item instanceof C54737OFo) {
            num = C05F.A0a;
        } else if (item instanceof FQM) {
            num = C05F.A0c;
        } else if ((item instanceof C32066E6s) && ((C32066E6s) item).A00 == 1) {
            num = C05F.A0d;
        } else {
            num = C05F.A00;
        }
        int intValue = num.intValue();
        C0f9.A0A(-896939132, A03);
        return intValue;
    }

    @Override // X.C2UT
    public void updateListView() {
        super.updateListView();
    }

    public final void setAreRowDividersEnabled(boolean z) {
        this.areRowDividersEnabled = z;
    }

    public final void setRoundDialogBottomCorners(boolean z) {
        this.roundDialogBottomCorners = z;
    }

    public final void setRoundDialogTopCorners(boolean z) {
        this.roundDialogTopCorners = z;
    }

    public final void setShouldCenterText(boolean z) {
        this.shouldCenterText = z;
    }

    public final void setSwitchItemViewPointDelegate(InterfaceC37114GWz interfaceC37114GWz) {
        this.switchItemViewPointDelegate = interfaceC37114GWz;
    }
}
