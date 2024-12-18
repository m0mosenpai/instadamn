package X;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Pgq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57578Pgq extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC74963Ym A02;
    public final /* synthetic */ C26079Bg8 A03;
    public final /* synthetic */ C26079Bg8 A04;
    public final /* synthetic */ C26079Bg8 A05;
    public final /* synthetic */ InterfaceC11380iw A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57578Pgq(Context context, View view, InterfaceC74963Ym interfaceC74963Ym, C26079Bg8 c26079Bg8, C26079Bg8 c26079Bg82, C26079Bg8 c26079Bg83, InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        super(1);
        this.A00 = context;
        this.A0A = str;
        this.A09 = str2;
        this.A0D = z;
        this.A03 = c26079Bg8;
        this.A04 = c26079Bg82;
        this.A05 = c26079Bg83;
        this.A01 = view;
        this.A07 = imageUrl;
        this.A0B = z2;
        this.A0C = z3;
        this.A02 = interfaceC74963Ym;
        this.A08 = num;
        this.A06 = interfaceC11380iw;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewGroup viewGroup;
        C193328hC A0I = AbstractC31171DnF.A0I(this.A00);
        DialogInterfaceOnDismissListenerC55324Ogm.A00(A0I, this.A02, 1);
        A0I.A05 = this.A0A;
        String str = this.A09;
        if (str != null && str.length() != 0) {
            if (!this.A0D) {
                A0I.A0r(str);
            } else {
                Spanned fromHtml = Html.fromHtml(str);
                C14360o3.A07(fromHtml);
                A0I.A0r(fromHtml);
            }
        }
        C26079Bg8 c26079Bg8 = this.A03;
        if (c26079Bg8 != null) {
            String str2 = c26079Bg8.A04;
            if (str2.length() > 0) {
                A0I.A0W(DialogInterfaceOnClickListenerC55319Ogh.A00(c26079Bg8, 14), AbstractC53881NsD.A00((Integer) c26079Bg8.A02), str2, c26079Bg8.A03, c26079Bg8.A05);
            }
        }
        C26079Bg8 c26079Bg82 = this.A04;
        if (c26079Bg82 != null) {
            String str3 = c26079Bg82.A04;
            if (str3.length() > 0) {
                A0I.A0U(DialogInterfaceOnClickListenerC55319Ogh.A00(c26079Bg82, 15), AbstractC53881NsD.A00((Integer) c26079Bg82.A02), str3, c26079Bg82.A03, c26079Bg82.A05);
            }
        }
        C26079Bg8 c26079Bg83 = this.A05;
        if (c26079Bg83 != null) {
            String str4 = c26079Bg83.A04;
            if (str4.length() > 0) {
                A0I.A0V(DialogInterfaceOnClickListenerC55319Ogh.A00(c26079Bg83, 16), AbstractC53881NsD.A00((Integer) c26079Bg83.A02), str4, c26079Bg83.A03, c26079Bg83.A05);
            }
        }
        View view = this.A01;
        if (view != null) {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.removeView(view);
                }
            }
            A0I.A0l(view);
        }
        ImageUrl imageUrl = this.A07;
        if (imageUrl != null) {
            Integer num = this.A08;
            InterfaceC11380iw interfaceC11380iw = this.A06;
            if (num != null) {
                A0I.A08 = true;
                IgdsHeadline igdsHeadline = A0I.A0Z;
                igdsHeadline.setCircularImageUrl(imageUrl, null, interfaceC11380iw, num, null);
                igdsHeadline.setVisibility(0);
                A0I.A09 = true;
            } else {
                A0I.A0o(imageUrl, interfaceC11380iw);
            }
        }
        A0I.A0s(this.A0B);
        A0I.A0t(this.A0C);
        Dialog A02 = A0I.A02();
        C0fJ.A00(A02);
        return new BFC(A02, 8);
    }
}
