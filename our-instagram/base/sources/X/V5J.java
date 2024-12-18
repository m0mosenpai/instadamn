package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class V5J extends AbstractC66412zI {
    public final InterfaceC71978XDn A00;
    public final InterfaceC71978XDn A01;
    public final XAq A02;

    public V5J(InterfaceC71978XDn interfaceC71978XDn, XAq xAq) {
        C14360o3.A0B(interfaceC71978XDn, 1);
        this.A01 = interfaceC71978XDn;
        this.A02 = xAq;
        this.A00 = new C70886Wjf(this);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        NUU nuu = (NUU) interfaceC66482zP;
        boolean A1a = AbstractC167017dG.A1a(nuu, c3oo);
        View view = c3oo.itemView;
        C14360o3.A06(view);
        Object tag = c3oo.itemView.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.discovery.inform.ui.InformMessageV2ViewBinder.Holder");
        C69442VnR c69442VnR = (C69442VnR) tag;
        C38657Gyy c38657Gyy = nuu.A00;
        List list = c38657Gyy.A0A;
        InterfaceC71978XDn interfaceC71978XDn = this.A00;
        XAq xAq = this.A02;
        C14360o3.A0B(c69442VnR, A1a ? 1 : 0);
        C14360o3.A0B(interfaceC71978XDn, 4);
        AbstractC68486VSr.A00(c69442VnR.A05, c38657Gyy.A09);
        AbstractC68486VSr.A00(c69442VnR.A03, c38657Gyy.A04);
        UJR ujr = c69442VnR.A07;
        C14360o3.A0B(ujr, 0);
        List list2 = c38657Gyy.A0B;
        int i = 0;
        if (list2 != null && !list2.isEmpty()) {
            View view2 = ujr.A00;
            view2.setVisibility(0);
            URD urd = (URD) ((XFN) list2.get(0));
            String str2 = urd.A03;
            if (str2 != null) {
                IgImageView igImageView = ujr.A03;
                Integer[] A00 = C05F.A00(2);
                int length = A00.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Integer num = A00[i2];
                    if (1 - num.intValue() != 0) {
                        str = "call-pano";
                    } else {
                        str = "help-pano";
                    }
                    if (str.equals(str2)) {
                        if (1 - num.intValue() != 0) {
                            i = R.drawable.instagram_call_end_pano_filled_24;
                        } else {
                            i = R.drawable.instagram_help_pano_outline_24;
                        }
                    } else {
                        i2++;
                    }
                }
                igImageView.setImageResource(i);
                Context context = igImageView.getContext();
                AbstractC31177DnL.A0p(context, igImageView, AbstractC53242c7.A08(context));
            }
            ujr.A02.setText(urd.A04);
            ujr.A01.setText(urd.A02);
            IgdsButton igdsButton = ujr.A04;
            igdsButton.setText(urd.A00);
            WNP.A00(igdsButton, 33, interfaceC71978XDn, c38657Gyy);
            view2.setElevation(15.0f);
            view2.setOutlineProvider(new C66347UAt(view2, A1a ? 1 : 0));
            view2.setClipToOutline(A1a);
        } else {
            ujr.A00.setVisibility(8);
        }
        AbstractC68486VSr.A00(c69442VnR.A02, c38657Gyy.A07);
        IgdsListCell igdsListCell = c69442VnR.A08;
        IgdsListCell igdsListCell2 = c69442VnR.A0A;
        boolean z = true;
        IgdsListCell igdsListCell3 = c69442VnR.A09;
        List A1Q = AbstractC16960so.A1Q(igdsListCell, igdsListCell2, igdsListCell3);
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            Iterator it = A1Q.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(8);
            }
        } else {
            igdsListCell.setVisibility(0);
            igdsListCell.A05(R.drawable.instagram_call_pano_outline_24);
            EnumC53237Nga enumC53237Nga = EnumC53237Nga.A04;
            igdsListCell.setTextCellType(enumC53237Nga);
            igdsListCell2.setVisibility(0);
            igdsListCell2.A05(R.drawable.instagram_direct_pano_outline_24);
            igdsListCell2.setTextCellType(enumC53237Nga);
            igdsListCell3.setVisibility(0);
            igdsListCell3.A05(R.drawable.instagram_guides_pano_outline_24);
            igdsListCell3.setTextCellType(enumC53237Nga);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                IgdsListCell igdsListCell4 = (IgdsListCell) A1Q.get(i3);
                igdsListCell4.A0I(String.valueOf(((UR1) list.get(i3)).A02));
                igdsListCell4.A0H(String.valueOf(((UR1) list.get(i3)).A01));
                C0fQ.A00(new WMh(i3, 0, c38657Gyy, interfaceC71978XDn, list), igdsListCell4);
            }
        }
        boolean Ejj = interfaceC71978XDn.Ejj(c38657Gyy);
        SpannableStringBuilder spannableStringBuilder = null;
        TextView textView = c69442VnR.A04;
        if (Ejj) {
            textView.setVisibility(0);
            c69442VnR.A00.setVisibility(0);
            String str3 = c38657Gyy.A03;
            String str4 = c38657Gyy.A08;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(AnonymousClass001.A0T(str3, str4, ' '));
            if (str4 != null) {
                AnonymousClass773.A05(spannableStringBuilder2, new VB4(c38657Gyy, interfaceC71978XDn, view.getContext().getColor(AbstractC53242c7.A0C(textView.getContext()))), str4);
                spannableStringBuilder = spannableStringBuilder2;
            }
            AbstractC31176DnK.A1G(textView, spannableStringBuilder);
        } else {
            textView.setVisibility(8);
            c69442VnR.A00.setVisibility(8);
            textView.setOnClickListener(null);
        }
        if (xAq != null) {
            xAq.ECz(view, c38657Gyy);
        }
        AbstractC43592JPx.A1H(c69442VnR.A06, -1, c69442VnR.A01.getHeight());
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return NUU.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.inform_header_v2, false);
        A0C.setTag(new C69442VnR(viewGroup, A0C));
        C3OO c3oo = new C3OO(A0C);
        if (A0C.getTag() instanceof C69442VnR) {
            return c3oo;
        }
        throw AbstractC31172DnG.A0u();
    }
}
