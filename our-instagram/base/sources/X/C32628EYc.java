package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.EYc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32628EYc extends AbstractC66422zJ {
    public final Context A00;
    public final FP7 A01;

    public C32628EYc(Context context, FP7 fp7) {
        C14360o3.A0B(fp7, 2);
        this.A00 = context;
        this.A01 = fp7;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new E3U(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_channel_discovery_header_container, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        String str2;
        C36184Fxy c36184Fxy = (C36184Fxy) interfaceC66482zP;
        E3U e3u = (E3U) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c36184Fxy, e3u);
        View view = e3u.A02;
        view.setSelected(false);
        IgTextView igTextView = e3u.A05;
        EnumC33424Epv enumC33424Epv = EnumC33424Epv.A0A;
        Integer num = enumC33424Epv.A01;
        String str3 = null;
        if (num != null) {
            str = this.A00.getString(num.intValue());
        } else {
            str = null;
        }
        igTextView.setText(str);
        ViewOnClickListenerC35681FpG.A01(view, 41, this);
        View view2 = e3u.A00;
        view2.setSelected(A1R);
        IgTextView igTextView2 = e3u.A03;
        EnumC33424Epv enumC33424Epv2 = EnumC33424Epv.A06;
        Integer num2 = enumC33424Epv2.A01;
        if (num2 != null) {
            str2 = this.A00.getString(num2.intValue());
        } else {
            str2 = null;
        }
        igTextView2.setText(str2);
        ViewOnClickListenerC35681FpG.A01(view2, 42, this);
        View view3 = e3u.A01;
        view3.setSelected(false);
        IgTextView igTextView3 = e3u.A04;
        EnumC33424Epv enumC33424Epv3 = EnumC33424Epv.A09;
        Integer num3 = enumC33424Epv3.A01;
        if (num3 != null) {
            str3 = this.A00.getString(num3.intValue());
        }
        igTextView3.setText(str3);
        ViewOnClickListenerC35681FpG.A01(view3, 43, this);
        EnumC33424Epv enumC33424Epv4 = c36184Fxy.A00;
        boolean z = true;
        view2.setSelected(AbstractC167007dF.A1X(enumC33424Epv2, enumC33424Epv4));
        view.setSelected(AbstractC167007dF.A1X(enumC33424Epv, enumC33424Epv4));
        if (enumC33424Epv3 != enumC33424Epv4) {
            z = false;
        }
        view3.setSelected(z);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36184Fxy.class;
    }
}
