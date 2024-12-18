package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;

/* renamed from: X.J8m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43215J8m extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ ProductCardSubtitleType A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ProductCheckoutPropertiesIntf A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43215J8m(ProductCardSubtitleType productCardSubtitleType, UserSession userSession, ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf, String str, String str2, boolean z, boolean z2) {
        super(1);
        this.A04 = str;
        this.A03 = str2;
        this.A06 = z;
        this.A01 = userSession;
        this.A02 = productCheckoutPropertiesIntf;
        this.A05 = z2;
        this.A00 = productCardSubtitleType;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C14360o3.A0B(context, 0);
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        String str = this.A04;
        String str2 = this.A03;
        boolean z = this.A06;
        Integer valueOf = Integer.valueOf(AbstractC1566271k.A00(context));
        CharSequence charSequence = str;
        if (z) {
            charSequence = AbstractC1566271k.A03(context, valueOf, str, str2);
        }
        A01.append(charSequence);
        ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf = this.A02;
        boolean z2 = this.A05;
        int ordinal = this.A00.ordinal();
        if ((ordinal == 10 || ordinal == 11) && z2 && productCheckoutPropertiesIntf != null) {
            Boolean bool = false;
            if (bool.equals(productCheckoutPropertiesIntf.Bh1())) {
                A01.append((CharSequence) " · ");
                A01.append((CharSequence) context.getString(2131970008));
                return A01;
            }
        }
        return A01;
    }
}
