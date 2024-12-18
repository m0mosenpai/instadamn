package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.NEc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52338NEc extends AbstractC66412zI {
    public final O60 A00;
    public final Context A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51288MlB(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.iglive_post_live_section_header, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56106OvQ c56106OvQ = (C56106OvQ) interfaceC66482zP;
        C51288MlB c51288MlB = (C51288MlB) c3oo;
        AbstractC167007dF.A1K(c56106OvQ, c51288MlB);
        c51288MlB.A00.setText(c56106OvQ.A00);
        IgdsButton igdsButton = c51288MlB.A01;
        String str = c56106OvQ.A02;
        if (str != null) {
            igdsButton.setText(str);
            igdsButton.setVisibility(0);
            ViewOnClickListenerC55468OkN.A00(igdsButton, 26, c56106OvQ, this);
        } else {
            igdsButton.setVisibility(8);
            igdsButton.setText("");
            igdsButton.setOnClickListener(null);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56106OvQ.class;
    }

    public C52338NEc(Context context, O60 o60) {
        this.A01 = context;
        this.A00 = o60;
    }
}
