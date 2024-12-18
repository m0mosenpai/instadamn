package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EYn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32639EYn extends AbstractC66422zJ {
    public View A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final EOS A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        HallPassViewModel hallPassViewModel = (HallPassViewModel) interfaceC66482zP;
        E3X e3x = (E3X) c3oo;
        AbstractC167007dF.A1K(hallPassViewModel, e3x);
        Context context = this.A01;
        EOS eos = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        AbstractC25233BEq.A0w(0, context, eos, interfaceC11380iw);
        int A01 = AbstractC13890nF.A01(context) / 2;
        IgTextView igTextView = e3x.A03;
        igTextView.setText(hallPassViewModel.A05);
        igTextView.setMaxWidth(A01);
        e3x.A04.setChecked(hallPassViewModel.A00);
        e3x.A02.setText(AbstractC167017dG.A0k(context.getResources(), hallPassViewModel.A02, R.plurals.campfire_members_count_label));
        ViewOnClickListenerC31591DuJ.A00(e3x.A01, 26, hallPassViewModel, eos);
        IgdsFaceSwarm igdsFaceSwarm = e3x.A05;
        ViewOnClickListenerC31591DuJ.A00(igdsFaceSwarm, 27, hallPassViewModel, eos);
        ViewOnClickListenerC31591DuJ.A00(igTextView, 28, hallPassViewModel, eos);
        ViewOnClickListenerC31591DuJ.A00(e3x.A00, 29, hallPassViewModel, eos);
        List list = hallPassViewModel.A06;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1E.add(new C9C2((Drawable) null, AbstractC25226BEj.A15(it).Bhu(), (String) null, 6));
        }
        if (A1E.size() < 2) {
            A1E.add(new C9C2(igdsFaceSwarm.getContext().getDrawable(R.drawable.campfire_group_icon_drawable), (ImageUrl) null, (String) null, 5));
        }
        igdsFaceSwarm.setCustomSizeDp(45);
        igdsFaceSwarm.A08 = false;
        igdsFaceSwarm.setFaceSwarmItems(A1E, interfaceC11380iw);
    }

    public C32639EYn(Context context, InterfaceC11380iw interfaceC11380iw, EOS eos) {
        this.A01 = context;
        this.A03 = eos;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_campfire_list_row_item, false);
        this.A00 = A0R;
        return new E3X(A0R);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HallPassViewModel.class;
    }
}
