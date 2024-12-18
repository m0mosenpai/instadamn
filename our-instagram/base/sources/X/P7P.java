package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P7P implements InterfaceC66092yl {
    public final InterfaceC11380iw A00;

    @Override // X.InterfaceC66092yl
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADw(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, C51341Mm2 c51341Mm2) {
        C14360o3.A0B(c51341Mm2, 0);
        C4NM c4nm = c4nj.A08;
        C5Ry c5Ry = c4nm.A07;
        if (c5Ry != null) {
            ImageUrl imageUrl = c5Ry.A00;
            IgImageView igImageView = c51341Mm2.A05;
            igImageView.setUrl(imageUrl, this.A00);
            igImageView.setVisibility(0);
        } else {
            c51341Mm2.A05.setVisibility(8);
        }
        String str = c4nm.A09.A00;
        if (str == null) {
            str = "";
        }
        TextView textView = c51341Mm2.A04;
        textView.setText(str);
        textView.setVisibility(0);
        ImageView imageView = c51341Mm2.A01;
        imageView.setVisibility(0);
        C117095Rs c117095Rs = c4nm.A03;
        if (c117095Rs != null) {
            String str2 = c117095Rs.A00;
            if (str2 == null) {
                str2 = "";
            }
            TextView textView2 = c51341Mm2.A02;
            textView2.setText(str2);
            textView2.setVisibility(0);
        } else {
            c51341Mm2.A02.setVisibility(8);
        }
        C4NV c4nv = c4nm.A01;
        if (c4nv != null) {
            C4NN c4nn = c4nv.A00;
            TextView textView3 = c51341Mm2.A03;
            String str3 = c4nn.A00;
            if (str3 == null) {
                str3 = "";
            }
            textView3.setText(str3);
            textView3.setVisibility(0);
            ViewOnClickListenerC55468OkN.A00(textView3, 4, interfaceC55362gb, c4nj);
        } else {
            c51341Mm2.A03.setVisibility(8);
        }
        ViewOnClickListenerC55459OkE.A01(imageView, c51341Mm2, interfaceC55362gb, c4nj, 26);
        if (interfaceC55362gb != null) {
            interfaceC55362gb.Dcq(c4nj);
        }
    }

    @Override // X.InterfaceC66092yl
    public final View Csl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.audio_browser_megaphone, viewGroup, false);
        if (inflate != null) {
            inflate.setTag(new C51341Mm2(inflate));
            return inflate;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC66092yl
    public final /* bridge */ /* synthetic */ void AE0(C3OO c3oo, InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, Map map) {
        C51341Mm2 c51341Mm2 = (C51341Mm2) c3oo;
        C14360o3.A0B(c51341Mm2, 0);
        ADw(interfaceC55362gb, c4nj, c51341Mm2);
    }

    public P7P(InterfaceC11380iw interfaceC11380iw) {
        this.A00 = interfaceC11380iw;
    }
}
