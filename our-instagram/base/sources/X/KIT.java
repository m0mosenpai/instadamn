package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KIT extends AbstractC66412zI {
    public final InterfaceC165357aO A00;
    public final AnonymousClass988 A01;
    public final Context A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44633Jpd(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.thread_message_action_log, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        Object obj;
        C161467Lh c161467Lh = (C161467Lh) interfaceC66482zP;
        C44633Jpd c44633Jpd = (C44633Jpd) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c161467Lh, c44633Jpd);
        TextView textView = c44633Jpd.A00;
        SpannableString spannableString = c161467Lh.A03;
        boolean z = false;
        Object[] spans = spannableString.getSpans(0, spannableString.length(), C89403yg.class);
        C14360o3.A07(spans);
        if (spans.length == 0) {
            obj = null;
        } else {
            obj = spans[0];
        }
        C89403yg c89403yg = (C89403yg) obj;
        if (c89403yg != null) {
            c89403yg.A00 = new C49394LsS(this, c161467Lh);
        }
        String str = c161467Lh.A05;
        int i = c161467Lh.A01;
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        A01.append((CharSequence) spannableString).append((CharSequence) AnonymousClass001.A0D(str, ' '));
        C89403yg c89403yg2 = new C89403yg(C05F.A0u, str, "", i, A1R);
        ((AbstractC85223rD) c89403yg2).A01 = C05F.A01;
        AbstractC37302Gc3.A0q(A01, c89403yg2, A01.length() - AbstractC167007dF.A0A(str));
        SpannableString A07 = AbstractC43592JPx.A07(A01);
        textView.setText(A07);
        textView.setTextColor(c161467Lh.A00);
        textView.setTypeface(textView.getTypeface(), 0);
        if (c161467Lh.A06) {
            Context context = textView.getContext();
            Drawable drawable = context.getDrawable(R.drawable.rounded_background_secondary);
            if (drawable != null) {
                int A06 = AbstractC56842jH.A06(context.getColor(AbstractC53242c7.A04(context)), 199);
                Drawable mutate = drawable.mutate();
                C14360o3.A07(mutate);
                mutate.setTint(A06);
                textView.setBackground(drawable);
            }
            ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(textView);
            Resources resources = textView.getResources();
            C14360o3.A07(resources);
            A0G.setMarginStart(A00(resources, R.dimen.abc_button_padding_horizontal_material));
            A0G.setMarginEnd(A00(resources, R.dimen.abc_button_padding_horizontal_material));
            textView.setLayoutParams(A0G);
            int A00 = A00(resources, R.dimen.account_discovery_bottom_gap);
            int A002 = A00(resources, R.dimen.account_discovery_bottom_gap);
            textView.setPadding(A002, A00, A002, A00);
        }
        if (spannableString.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (c161467Lh.A04 != null) {
            z = true;
        }
        textView.setText(A07);
        if (!z) {
            return;
        }
        AbstractC25227BEk.A11(textView);
        textView.setHighlightColor(0);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161467Lh.class;
    }

    public KIT(Context context, InterfaceC165357aO interfaceC165357aO, AnonymousClass988 anonymousClass988) {
        this.A00 = interfaceC165357aO;
        this.A01 = anonymousClass988;
        this.A02 = context;
    }

    public static final int A00(Resources resources, int i) {
        try {
            return resources.getDimensionPixelSize(i);
        } catch (Resources.NotFoundException unused) {
            C0w9.A03("IgdBackground", AnonymousClass001.A0c("Cannot find resource dimension ", " in NullStateActionLogMessageItemDefinition", i));
            return 0;
        }
    }
}
