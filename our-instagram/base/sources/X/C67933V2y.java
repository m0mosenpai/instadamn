package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.V2y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67933V2y extends AbstractC65632xz {
    public final Context A00;
    public final V16 A01;
    public final InterfaceC11380iw A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C67933V2y(Context context, V16 v16, InterfaceC11380iw interfaceC11380iw) {
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A01 = v16;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, -1913136905);
        C14360o3.A0B(obj, 2);
        C69287Vkv c69287Vkv = (C69287Vkv) view.getTag();
        if (c69287Vkv != null) {
            InterfaceC11380iw interfaceC11380iw = this.A02;
            V16 v16 = this.A01;
            C68249VJl c68249VJl = (C68249VJl) obj;
            boolean A1Y = AbstractC25229BEm.A1Y(interfaceC11380iw);
            AbstractC167007dF.A1E(v16, 2, c68249VJl);
            String str = c68249VJl.A06;
            if (str != null) {
                TextView textView = c69287Vkv.A02;
                textView.setVisibility(A1Y ? 1 : 0);
                textView.setText(str);
            }
            String str2 = c68249VJl.A04;
            if (str2 != null) {
                TextView textView2 = c69287Vkv.A01;
                textView2.setVisibility(A1Y ? 1 : 0);
                textView2.setText(str2);
            }
            ImageUrl imageUrl = c68249VJl.A00;
            if (imageUrl != null) {
                IgImageView igImageView = c69287Vkv.A04;
                igImageView.setVisibility(A1Y ? 1 : 0);
                igImageView.setUrl(imageUrl, interfaceC11380iw);
            }
            String str3 = c68249VJl.A01;
            if (str3 != null) {
                TextView textView3 = c69287Vkv.A00;
                textView3.setVisibility(A1Y ? 1 : 0);
                textView3.setText(str3);
                WNV.A00(textView3, 47, v16, c68249VJl);
            }
            WNV.A00(c69287Vkv.A03, 48, v16, c68249VJl);
            C0f9.A0A(1981367981, A0G);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-1509614939, A0G);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 1324981064);
        View A07 = AbstractC31175DnJ.A07(LayoutInflater.from(this.A00), viewGroup, R.layout.aymt_megaphone, false);
        A07.setTag(new C69287Vkv(AbstractC65702TsY.A0H(A07, R.id.title), AbstractC65702TsY.A0H(A07, R.id.message), AbstractC65702TsY.A0H(A07, R.id.primary_button), (ColorFilterAlphaImageView) AbstractC166997dE.A0S(A07, R.id.dismiss_button), (IgImageView) AbstractC166997dE.A0S(A07, R.id.megaphone_icon)));
        C0f9.A0A(-2099923993, A0G);
        return A07;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
