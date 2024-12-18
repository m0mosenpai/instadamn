package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.model.shopping.reels.MultiProductSticker;
import com.instagram.model.shopping.reels.ProductSticker;
import com.instagram.user.model.Product;
import java.util.List;

/* loaded from: classes7.dex */
public final class HYC extends AbstractC138926Qy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final Drawable A04;
    public final IgFrameLayout A05;
    public final C84823qW A06;
    public final C138866Qr A07;
    public final InterfaceC145596hI A08;
    public final C138896Qv A09;
    public final InterfaceC56392iX A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HYC(InterfaceC56392iX interfaceC56392iX, C41181vS c41181vS, C138866Qr c138866Qr, InterfaceC145596hI interfaceC145596hI, C138896Qv c138896Qv, Integer num) {
        super(c138866Qr, EnumC138936Qz.A06);
        AbstractC167007dF.A1D(interfaceC56392iX, 1, c138866Qr);
        this.A0A = interfaceC56392iX;
        this.A07 = c138866Qr;
        this.A09 = c138896Qv;
        this.A08 = interfaceC145596hI;
        IgFrameLayout igFrameLayout = (IgFrameLayout) interfaceC56392iX.getView();
        this.A05 = igFrameLayout;
        igFrameLayout.setFocusable(true);
        Integer num2 = C05F.A00;
        List A0c = c41181vS.A0c();
        if (num == num2) {
            C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0y, A0c);
            if (A00 != null) {
                this.A06 = A00;
                igFrameLayout.setContentDescription(A00.A0K());
                Product A0G = A00.A0G();
                if (A0G != null) {
                    Context context = igFrameLayout.getContext();
                    C221099pX c221099pX = new C221099pX(context, AbstractC111324zv.A00(2727), c138866Qr.A0F - (AbstractC167017dG.A09(context) * 2), context.getResources().getDimensionPixelSize(R.dimen.direct_emoji_quick_reply_emoji_item_size), false, false);
                    this.A04 = c221099pX;
                    String A0K = A00.A0K();
                    ProductSticker productSticker = A00.A0r;
                    productSticker.getClass();
                    String str = productSticker.A0D;
                    int i = -1;
                    if (str != null) {
                        try {
                            i = Color.parseColor(str);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    c221099pX.A03(A0G, A0K, i, false);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            C84823qW A002 = AbstractC120715dH.A00(EnumC75383a5.A0q, A0c);
            if (A002 != null) {
                this.A06 = A002;
                MultiProductSticker multiProductSticker = A002.A0o;
                multiProductSticker.getClass();
                String str2 = multiProductSticker.A03;
                igFrameLayout.setContentDescription(str2 == null ? "" : str2);
                List A0M = A002.A0M();
                if (A0M != null) {
                    Context context2 = igFrameLayout.getContext();
                    C221049pS c221049pS = new C221049pS(context2, AbstractC111324zv.A00(2727), A0M, c138866Qr.A0F - (AbstractC167017dG.A09(context2) * 2), false);
                    this.A04 = c221049pS;
                    MultiProductSticker multiProductSticker2 = A002.A0o;
                    multiProductSticker2.getClass();
                    String str3 = multiProductSticker2.A03;
                    str3 = str3 == null ? "" : str3;
                    C14360o3.A07(str3);
                    String A10 = AbstractC166997dE.A10(C1Q2.A02(), str3);
                    MultiProductSticker multiProductSticker3 = A002.A0o;
                    multiProductSticker3.getClass();
                    String str4 = multiProductSticker3.A07;
                    int i2 = -1;
                    if (str4 != null) {
                        try {
                            i2 = Color.parseColor(str4);
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    c221049pS.A01(A10, i2);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        AbstractC31176DnK.A0D(igFrameLayout, R.id.product_sticker_view).setImageDrawable(this.A04);
        ViewOnClickListenerC42033Ik2.A00(igFrameLayout, 4, this);
        int i3 = c138866Qr.A0D;
        this.A02 = i3;
        this.A00 = i3;
        this.A03 = this.A04.getIntrinsicWidth();
        this.A01 = this.A04.getIntrinsicHeight();
    }

    @Override // X.AbstractC138926Qy
    public final void A07(C6R2 c6r2) {
        boolean z = c6r2.A04;
        InterfaceC56392iX interfaceC56392iX = this.A0A;
        if (z) {
            interfaceC56392iX.setVisibility(8);
        } else {
            interfaceC56392iX.setVisibility(0);
            this.A05.setTranslationY(c6r2.A03);
        }
        this.A09.A01("is_with_product_tag", String.valueOf(!z));
    }

    @Override // X.AbstractC138926Qy
    public final int A03() {
        return this.A00;
    }

    @Override // X.AbstractC138926Qy
    public final int A04() {
        return this.A01;
    }

    @Override // X.AbstractC138926Qy
    public final int A05() {
        return this.A02;
    }

    @Override // X.AbstractC138926Qy
    public final int A06() {
        return this.A03;
    }
}
