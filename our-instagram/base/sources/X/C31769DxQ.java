package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.util.List;

/* renamed from: X.DxQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31769DxQ extends BaseAdapter {
    public final List A00;
    public final UserSession A01;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    private final void A00(View view) {
        UserSession userSession = this.A01;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36328053160361022L)) {
            int paddingStart = view.getPaddingStart();
            int paddingEnd = view.getPaddingEnd();
            int A03 = AbstractC167017dG.A03(view.getContext());
            view.setPaddingRelative(paddingStart, A03, paddingEnd, A03);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context;
        if (view == null) {
            view = null;
            if (viewGroup != null) {
                context = viewGroup.getContext();
            } else {
                context = null;
            }
            View inflate = LayoutInflater.from(context).inflate(R.layout.update_profile_picture_option_row, viewGroup, false);
            if (inflate != null) {
                FOS fos = (FOS) this.A00.get(i);
                if (fos.A09) {
                    TextView A0e = AbstractC166987dD.A0e(inflate, R.id.row_header);
                    if (A0e != null) {
                        Context context2 = inflate.getContext();
                        String A0p = AbstractC166997dE.A0p(context2, 2131965052);
                        android.net.Uri A0B = AbstractC25227BEk.A0B(AbstractC63260SgI.A01(context2, "https://help.instagram.com/557544397610546?ref=igapp"));
                        Spanned A0B2 = AbstractC31173DnH.A0B(inflate.getResources(), A0p, fos.A04);
                        C14360o3.A07(A0B2);
                        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(SpannableString.valueOf(A0B2));
                        AnonymousClass773.A05(A0H, new C50761MbS(A0B), A0p);
                        AbstractC31176DnK.A1G(A0e, A0H);
                        A0e.setVisibility(0);
                    }
                    AbstractC31176DnK.A1E(inflate, R.id.row_divider, 0);
                    return inflate;
                }
                ImageView A08 = AbstractC31171DnF.A08(inflate, R.id.row_icon);
                if (A08 != null) {
                    A00(A08);
                    A08.setImageResource(fos.A02);
                    if (fos.A08) {
                        AbstractC31173DnH.A11(inflate.getContext(), A08, fos.A01);
                    }
                }
                TextView A0e2 = AbstractC166987dD.A0e(inflate, R.id.row_label);
                if (A0e2 != null) {
                    A00(A0e2);
                    A0e2.setText(fos.A04);
                    if (fos.A08) {
                        AbstractC166987dD.A1O(inflate.getContext(), A0e2, fos.A03);
                    }
                }
                if (fos.A0B) {
                    IgdsSwitch igdsSwitch = (IgdsSwitch) AbstractC31173DnH.A0U(inflate, R.id.switch_stub).getView();
                    igdsSwitch.A07 = fos.A06;
                    igdsSwitch.setChecked(fos.A0A);
                    Integer num = fos.A07;
                    if (num != null) {
                        AbstractC166997dE.A18(inflate.getContext(), igdsSwitch, num.intValue());
                    }
                    A00(igdsSwitch);
                }
                C0fQ.A00(fos.A05, inflate);
                AbstractC166997dE.A18(inflate.getContext(), inflate, fos.A00);
                return inflate;
            }
        }
        return view;
    }

    public C31769DxQ(UserSession userSession, List list) {
        AbstractC167017dG.A1P(list, userSession);
        this.A00 = list;
        this.A01 = userSession;
    }
}
