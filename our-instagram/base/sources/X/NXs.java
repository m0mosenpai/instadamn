package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NXs extends AnonymousClass772 {
    public final int A00 = 1;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NXs(C52194N8j c52194N8j, int i, int i2) {
        super(Integer.valueOf(i2));
        this.A02 = c52194N8j;
        this.A01 = i;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        if (this.A00 != 0) {
            C54435O3p c54435O3p = ((C52194N8j) this.A02).A01;
            int i = this.A01;
            C26871BtY c26871BtY = c54435O3p.A00;
            C193328hC A0O = AbstractC31175DnJ.A0O(c26871BtY);
            A0O.A05 = AbstractC166997dE.A0N(c26871BtY).getString(2131974299);
            A0O.A0Z(new DialogInterfaceOnClickListenerC55275Ofq(c26871BtY, i, 3), EnumC193348hE.A06, AbstractC166997dE.A0q(AbstractC166997dE.A0N(c26871BtY), 2131957640), true);
            A0O.A0E(null);
            A0O.A0s(true);
            A0O.A0t(true);
            A0O.A0n(c26871BtY);
            AbstractC166987dD.A1W(A0O);
            return;
        }
        OyU oyU = (OyU) this.A02;
        TextView textView = oyU.A03;
        if (textView == null) {
            str = "helperText";
        } else {
            AbstractC13880nE.A0O(textView);
            Activity activity = oyU.A08;
            Resources resources = activity.getResources();
            int i2 = this.A01;
            Integer valueOf = Integer.valueOf(i2);
            String A0r = AbstractC25231BEo.A0r(resources, valueOf, R.plurals.user_pay_badges_thanks_sticker_list_supporters_title, i2);
            C189448aO A0y = AbstractC25225BEi.A0y(oyU.A0B);
            A0y.A03 = 0.7f;
            AbstractC25225BEi.A1Q(A0y, true);
            A0y.A0d = A0r;
            C189478aR A00 = A0y.A00();
            OK9 A002 = AbstractC34338FCg.A00().A00();
            C51853Mvx c51853Mvx = oyU.A05;
            str = "model";
            if (c51853Mvx != null) {
                String str2 = c51853Mvx.A03;
                if (str2 == null && (str2 = c51853Mvx.A04) == null) {
                    throw AbstractC166987dD.A14("Missing media insight id");
                }
                A00.A02(activity, A002.A01(valueOf, C05F.A0N, c51853Mvx.A02, str2, "", "", c51853Mvx.A04, c51853Mvx.A05, false, false));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NXs(OyU oyU, int i, int i2) {
        super(Integer.valueOf(i2));
        this.A02 = oyU;
        this.A01 = i;
    }
}
