package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.util.List;

/* renamed from: X.Dzz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31893Dzz extends C2UU {
    public String A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final DirectShareSheetFragment A04;
    public final List A05;

    public C31893Dzz(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectShareSheetFragment directShareSheetFragment) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = interfaceC11380iw;
        this.A04 = directShareSheetFragment;
        this.A05 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(A06), viewGroup, R.layout.direct_shortcuts_item, false);
        C14360o3.A07(A06);
        return new E2F(A0D, A06);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        E2F e2f = (E2F) c3oo;
        C14360o3.A0B(e2f, 0);
        int i2 = e2f.mItemViewType;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 3) {
                    Context context = this.A01;
                    Drawable drawable = context.getDrawable(R.drawable.instagram_add_pano_outline_24);
                    if (drawable != null) {
                        drawable.setColorFilter(context.getColor(R.color.igds_prism_gray_06), PorterDuff.Mode.SRC);
                    }
                    e2f.A02.setImageDrawable(drawable);
                    InterfaceC19630xq A0x = AbstractC166987dD.A0x(this.A03);
                    if (A0x.getInt("create_sharesheet_shortcut_nux_seen_count", 0) < 3 && !A0x.getBoolean("has_clicked_create_shortcut_nux", false)) {
                        IgTextView igTextView = e2f.A01;
                        AbstractC166987dD.A1P(context, igTextView, 2131956984);
                        boolean isSelected = e2f.A00.isSelected();
                        int i3 = R.color.igds_prism_gray_06;
                        if (isSelected) {
                            i3 = R.color.design_dark_default_color_on_background;
                        }
                        AbstractC166987dD.A1O(context, igTextView, i3);
                        igTextView.setVisibility(0);
                    }
                    ViewOnClickListenerC35679FpE.A01(e2f.A00, 67, this);
                    return;
                }
                return;
            }
            FQ1 fq1 = (FQ1) this.A05.get(i - 1);
            String str2 = fq1.A00;
            C148336m3 A05 = C148336m3.A04.A05(this.A03, str2);
            if (A05 == null) {
                A05 = C168157fA.A01(str2);
            }
            e2f.A02.setUrl(C168157fA.A00(A05.A01, A05.A02), this.A02);
            View view = e2f.A00;
            view.setSelected(C14360o3.A0K(fq1.A01, this.A00));
            ViewOnClickListenerC35683FpI.A00(view, 32, this, fq1);
            view.setOnLongClickListener(new LQH(1, fq1, this, e2f));
            return;
        }
        View view2 = e2f.A00;
        view2.setSelected(C14360o3.A0K(this.A00, "groups"));
        ViewOnClickListenerC35679FpE.A01(view2, 68, this);
        Context context2 = this.A01;
        Drawable drawable2 = context2.getDrawable(R.drawable.instagram_group_pano_filled_24);
        if (drawable2 != null) {
            boolean isSelected2 = view2.isSelected();
            int i4 = R.color.igds_prism_gray_06;
            if (isSelected2) {
                i4 = R.color.design_dark_default_color_on_background;
            }
            drawable2.setColorFilter(context2.getColor(i4), PorterDuff.Mode.SRC);
        }
        IgTextView igTextView2 = e2f.A01;
        boolean isSelected3 = view2.isSelected();
        int i5 = R.color.igds_prism_gray_06;
        if (isSelected3) {
            i5 = R.color.design_dark_default_color_on_background;
        }
        AbstractC166987dD.A1O(context2, igTextView2, i5);
        igTextView2.setVisibility(AbstractC167007dF.A05(view2.isSelected() ? 1 : 0));
        if (view2.isSelected()) {
            str = context2.getString(2131962585);
        } else {
            str = "";
        }
        igTextView2.setText(str);
        e2f.A02.setImageDrawable(drawable2);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(940070633);
        int size = this.A05.size() + 1 + 1;
        C0f9.A0A(-1431460165, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(-592354005);
        if (i == 0) {
            i2 = 0;
        } else {
            List list = this.A05;
            if (i <= list.size()) {
                i2 = 1;
            } else {
                int size = list.size();
                i2 = -1;
                if (i > size) {
                    i2 = 3;
                }
            }
        }
        C0f9.A0A(-990795995, A03);
        return i2;
    }
}
