package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes9.dex */
public final class NER extends AbstractC66412zI {
    public final Activity A00;
    public final O3F A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        C51299MlM c51299MlM = new C51299MlM(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.metadata_monetization_container, false));
        c51299MlM.A02.A07 = new P3T(this, 36);
        AbstractC25227BEk.A11(c51299MlM.A00);
        return c51299MlM;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56112OvX c56112OvX = (C56112OvX) interfaceC66482zP;
        C51299MlM c51299MlM = (C51299MlM) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c56112OvX, c51299MlM);
        TextView textView = c51299MlM.A01;
        textView.setText(c56112OvX.A02);
        c51299MlM.A00.setText(c56112OvX.A01);
        boolean z = c56112OvX.A03;
        IgdsSwitch igdsSwitch = c51299MlM.A02;
        if (z) {
            igdsSwitch.setVisibility(0);
            igdsSwitch.setChecked(c56112OvX.A04);
        } else {
            igdsSwitch.setVisibility(8);
        }
        if (c56112OvX.A06) {
            UserSession userSession = c56112OvX.A00;
            Activity activity = this.A00;
            C5SU A0f = AbstractC167017dG.A0f(activity, activity.getString(2131964167));
            A0f.A03(textView);
            A0f.A02();
            A0f.A00 = 30000;
            A0f.A0F = A1R;
            textView.postDelayed(new PSZ(userSession, A0f.A00(), this), 1000L);
        }
        if (c56112OvX.A05) {
            UserSession userSession2 = c56112OvX.A00;
            Activity activity2 = this.A00;
            C5SU A0f2 = AbstractC167017dG.A0f(activity2, activity2.getString(2131964211));
            A0f2.A03(igdsSwitch);
            A0f2.A02();
            A0f2.A0F = A1R;
            igdsSwitch.post(new PSY(userSession2, A0f2.A00(), this));
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56112OvX.class;
    }

    public NER(Activity activity, O3F o3f) {
        this.A00 = activity;
        this.A01 = o3f;
    }
}
