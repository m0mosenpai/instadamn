package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.79Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C79Y implements C7QC {
    public final Context A00;
    public final InterfaceC165197a8 A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A00;
        InterfaceC165197a8 interfaceC165197a8 = this.A01;
        View findViewById = viewGroup.findViewById(R.id.direct_context_reply_context_info_text_view);
        C14360o3.A07(findViewById);
        return new C1585379o(context, (IgTextView) findViewById, interfaceC165197a8);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C1585379o c1585379o = (C1585379o) c7qd;
        C1585679r c1585679r = (C1585679r) interfaceC129555tK;
        C14360o3.A0B(c1585379o, 0);
        C14360o3.A0B(c1585679r, 1);
        c1585379o.A00(c1585679r);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C1585379o c1585379o = (C1585379o) c7qd;
        C14360o3.A0B(c1585379o, 0);
        c1585379o.A01.setVisibility(8);
    }

    public C79Y(Context context, InterfaceC165197a8 interfaceC165197a8) {
        this.A00 = context;
        this.A01 = interfaceC165197a8;
    }
}
