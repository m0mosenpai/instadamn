package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.util.List;

/* loaded from: classes9.dex */
public final class NEU extends AbstractC66412zI {
    public final Activity A00;
    public final UserSession A01;

    public NEU(Activity activity, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = activity;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51338Mlz(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.metadata_sharing_toggle_row, false));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        EPU epu;
        C56119Ove c56119Ove = (C56119Ove) interfaceC66482zP;
        C51338Mlz c51338Mlz = (C51338Mlz) c3oo;
        ?? A1R = AbstractC167007dF.A1R(0, c56119Ove, c51338Mlz);
        c51338Mlz.A04.setText(c56119Ove.A04);
        CharSequence charSequence = c56119Ove.A03;
        InterfaceC190658cN interfaceC190658cN = null;
        TextView textView = c51338Mlz.A02;
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
        }
        List list = c56119Ove.A06;
        TextView textView2 = c51338Mlz.A03;
        if (list != null) {
            if (textView2 != null && list.size() > A1R && (epu = c56119Ove.A01) != null) {
                AnonymousClass773.A07(epu, textView2, AbstractC25226BEj.A1I(list, 0), AbstractC25226BEj.A1I(list, A1R == true ? 1 : 0));
            }
            textView2.setVisibility(0);
        } else {
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
        }
        c51338Mlz.A01.setVisibility(8);
        IgdsSwitch igdsSwitch = c51338Mlz.A05;
        igdsSwitch.setVisibility(0);
        boolean z = c56119Ove.A08;
        igdsSwitch.setChecked(c56119Ove.A0A);
        if (z) {
            igdsSwitch.setClickable(false);
            C0fQ.A00(c56119Ove.A00, c51338Mlz.A00);
        } else {
            if (c56119Ove.A07) {
                interfaceC190658cN = c56119Ove.A02;
            }
            igdsSwitch.A07 = interfaceC190658cN;
        }
        View view = c51338Mlz.itemView;
        boolean z2 = c56119Ove.A07;
        view.setEnabled(z2);
        c51338Mlz.itemView.setAlpha(AbstractC25230BEn.A00(z2 ? 1 : 0));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56119Ove.class;
    }
}
