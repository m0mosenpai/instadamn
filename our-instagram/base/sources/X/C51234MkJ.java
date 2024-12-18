package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.MkJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51234MkJ extends C3OO {
    public final C84743qO A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51234MkJ(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        C84743qO c84743qO = new C84743qO();
        C167847ee c167847ee = new C167847ee();
        c167847ee.A02(1.0f);
        c167847ee.A03(0.6f);
        Context context = view.getContext();
        c167847ee.A05(AbstractC167007dF.A09(context, R.attr.igds_color_tag_or_toast_background));
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_media_background);
        C84793qT c84793qT = c167847ee.A00;
        c84793qT.A09 = A09;
        c84793qT.A06 = 0;
        c84793qT.A03 = 0.0f;
        c84793qT.A0H = true;
        c167847ee.A04(1000L);
        c84743qO.A03(c167847ee.A01());
        this.A00 = c84743qO;
        AbstractC31173DnH.A0I(view, R.id.acr_browser_item_placeholder).setImageDrawable(c84743qO);
    }
}
