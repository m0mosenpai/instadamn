package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.OOh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54872OOh {
    public static final void A00(C44135Jf0 c44135Jf0, C54725OFc c54725OFc) {
        AbstractC167007dF.A1K(c54725OFc, c44135Jf0);
        View view = c54725OFc.A01;
        view.setVisibility(0);
        IgTextView igTextView = c54725OFc.A07;
        Context context = c54725OFc.A00;
        AbstractC166987dD.A1P(context, igTextView, 2131973274);
        IgSimpleImageView igSimpleImageView = c54725OFc.A04;
        igSimpleImageView.setVisibility(0);
        String str = c44135Jf0.A06;
        boolean A0T = AbstractC001900j.A0T(str);
        IgTextView igTextView2 = c54725OFc.A06;
        if (A0T) {
            igTextView2.setVisibility(8);
            if (c54725OFc.A02 == EnumC53368NjJ.BIO_IG_REELS_EDIT) {
                c54725OFc.A05.setVisibility(8);
            }
        } else {
            igTextView2.setVisibility(0);
            igTextView2.setText(str);
            AbstractC166987dD.A1P(context, igTextView, 2131961611);
            if (c54725OFc.A02 == EnumC53368NjJ.BIO_IG_REELS_EDIT) {
                igSimpleImageView.setVisibility(8);
                IgSimpleImageView igSimpleImageView2 = c54725OFc.A05;
                igSimpleImageView2.setVisibility(0);
                C0fQ.A00(new ViewOnClickListenerC48063LPo(c44135Jf0, 38), igSimpleImageView2);
            }
            C73773Sh c73773Sh = AbstractC73763Sg.A03;
            String str2 = c44135Jf0.A07;
            if (str2 == null) {
                str2 = "{}";
            }
            C73803Sk c73803Sk = c73773Sh.A02;
            C0YW A00 = AbstractC15410pw.A00(String.class);
            Integer num = C05F.A00;
            Map map = (Map) c73773Sh.A00(str2, AbstractC192158fG.A02(AbstractC15410pw.A02(new C18210v6(num, A00), new C18210v6(num, AbstractC15410pw.A00(JsonElement.class))), c73803Sk));
            if (map.containsKey("formatted_price")) {
                igTextView.setText(str);
                String valueOf = String.valueOf(map.get("formatted_price"));
                C14360o3.A0B(valueOf, 0);
                igTextView2.setText(AbstractC001900j.A0E("\"", "\"", valueOf));
            }
        }
        ViewOnClickListenerC55464OkJ.A01(view, 58, c44135Jf0, c54725OFc);
    }
}
