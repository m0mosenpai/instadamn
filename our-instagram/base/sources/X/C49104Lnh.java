package X;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.Arrays;

/* renamed from: X.Lnh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49104Lnh implements C7QC {
    public final InterfaceC11380iw A00;
    public final C162907Rb A01;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        CharSequence charSequence;
        String str;
        C158737Aj c158737Aj;
        float f;
        C02V c02v;
        ImageUrl imageUrl;
        Float f2;
        C49162Lof c49162Lof = (C49162Lof) c7qd;
        C7QY c7qy = (C7QY) interfaceC129555tK;
        IgImageView igImageView = c49162Lof.A04;
        Context context = igImageView.getContext();
        C1579877i c1579877i = c7qy.A0D;
        TextView textView = c49162Lof.A02;
        if (c1579877i != null) {
            charSequence = c1579877i.A09;
        } else {
            charSequence = "";
        }
        textView.setText(charSequence);
        RoundedCornerFrameLayout roundedCornerFrameLayout = c49162Lof.A05;
        int color = roundedCornerFrameLayout.getContext().getColor(AbstractC53242c7.A0E(context));
        String str2 = null;
        if (c1579877i == null) {
            str = null;
        } else {
            try {
                str = c1579877i.A0F;
            } catch (IllegalArgumentException unused) {
                C0w9.A03("CardBubbleXma", "Invalid title text color");
            }
        }
        if (!TextUtils.isEmpty(str)) {
            color = Color.parseColor(str);
        }
        textView.setTextColor(color);
        AbstractC1583778x abstractC1583778x = c7qy.A0F;
        if (abstractC1583778x instanceof C158737Aj) {
            c158737Aj = (C158737Aj) abstractC1583778x;
        } else {
            c158737Aj = null;
        }
        float A0A = AbstractC13880nE.A0A(context) / 2.5f;
        if (c158737Aj != null && (f2 = c158737Aj.A02) != null) {
            igImageView.setUrl(c158737Aj.A00, this.A00);
            igImageView.A0A = new C80673iw();
            f = f2.floatValue();
        } else {
            igImageView.A09();
            f = 0.75f;
        }
        AbstractC13880nE.A0g(roundedCornerFrameLayout, (int) A0A);
        AbstractC13880nE.A0W(roundedCornerFrameLayout, (int) (A0A / f));
        if (c1579877i != null && (imageUrl = c1579877i.A01) != null) {
            IgImageView igImageView2 = c49162Lof.A03;
            igImageView2.setUrl(imageUrl, this.A00);
            AbstractC13880nE.A0g(igImageView2, AbstractC166987dD.A0C(context, imageUrl.getWidth()));
            AbstractC13880nE.A0W(igImageView2, AbstractC166987dD.A0C(context, imageUrl.getHeight()));
        } else {
            c49162Lof.A03.A09();
        }
        float[] fArr = AbstractC1580577p.A01(context, c7qy.A0C).A01;
        roundedCornerFrameLayout.A01(fArr[0], fArr[2], fArr[4], fArr[6]);
        C9C9 c9c9 = c7qy.A06;
        String str3 = null;
        if (c9c9 != null) {
            str2 = c9c9.A01;
            str3 = c9c9.A00;
        }
        roundedCornerFrameLayout.setContentDescription(str2);
        if (str3 != null) {
            c02v = new C44442Jl9(str3, 0);
        } else {
            c02v = new C02V();
        }
        AbstractC010103p.A0B(roundedCornerFrameLayout, c02v);
        this.A01.A02(c49162Lof, c7qy);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49162Lof c49162Lof = (C49162Lof) c7qd;
        c49162Lof.A04.A09();
        c49162Lof.A03.A09();
        this.A01.A01(c49162Lof);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49104Lnh(InterfaceC11380iw interfaceC11380iw, InterfaceC165077Zw interfaceC165077Zw, AnonymousClass988 anonymousClass988) {
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        this.A01 = new C162907Rb(Arrays.asList(new C1580177l(new C49015Lm3(this, interfaceC165077Zw), c7az.A00(interfaceC165077Zw), new C7Q9(interfaceC165077Zw, z), interfaceC165077Zw, anonymousClass988), c7az));
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_card_bubble_xma_message);
        C7N9.A01(A0A);
        C49162Lof c49162Lof = new C49162Lof(A0A);
        this.A01.A00(c49162Lof);
        return c49162Lof;
    }
}
