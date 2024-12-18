package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.ERb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32449ERb extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final ELn A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 1481839642);
        C14360o3.A0B(obj, 2);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.settings.common.audiencepicker.AudiencePickerFacepileViewBinder.Holder");
            FLG flg = (FLG) tag;
            C51750MtZ c51750MtZ = (C51750MtZ) obj;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            ELn eLn = this.A02;
            AbstractC167007dF.A1K(flg, c51750MtZ);
            AbstractC167007dF.A1E(interfaceC11380iw, 2, eLn);
            List list = (List) c51750MtZ.A00;
            View view2 = flg.A00;
            Context context = view2.getContext();
            flg.A01.setImageDrawable(AbstractC89513yr.A01(context, null, 5, interfaceC11380iw.getModuleName(), list, context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen), false, false, false));
            AbstractC166987dD.A1P(context, flg.A02, 2131973168);
            ViewOnClickListenerC35689FpO.A01(view2, 29, eLn);
        }
        C0f9.A0A(1962530680, A0G);
    }

    public C32449ERb(Context context, InterfaceC11380iw interfaceC11380iw, ELn eLn) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = eLn;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(484899515);
        View A0A = AbstractC31176DnK.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_audience_picker_facepile);
        A0A.setTag(new FLG(A0A));
        C0f9.A0A(504491934, A03);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
