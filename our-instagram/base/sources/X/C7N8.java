package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.7N8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7N8 extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC165527af A01;
    public final UserSession A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.thread_message_seen_indicator, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C161767Ml(inflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.view.View] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        View.OnClickListener viewOnClickListenerC23217ARb;
        TextView textView;
        int i;
        Object[] objArr;
        String string;
        final C161717Mg c161717Mg = (C161717Mg) interfaceC66482zP;
        C161767Ml c161767Ml = (C161767Ml) c3oo;
        C14360o3.A0B(c161717Mg, 0);
        C14360o3.A0B(c161767Ml, 1);
        TextView textView2 = c161767Ml.A02;
        Context context = textView2.getContext();
        if (c161717Mg.A07) {
            textView2.setVisibility(0);
            c161767Ml.A00.setVisibility(8);
            textView2.setTextColor(c161717Mg.A01);
            C14360o3.A0A(context);
            textView2.setText(AbstractC1578076o.A00(context, c161717Mg));
            AnonymousClass775.A00(textView2, c161717Mg.A08);
            return;
        }
        if (c161717Mg.A0B) {
            java.util.Set set = c161717Mg.A05;
            List A01 = AbstractC1578276q.A01(set);
            int min = Math.min(10, A01.size());
            for (int i2 = 0; i2 < min; i2++) {
                ImageUrl imageUrl = (ImageUrl) ((C206419By) A01.get(i2)).A01;
                Object obj = c161767Ml.A03.get(i2);
                C14360o3.A07(obj);
                IgImageView igImageView = (IgImageView) ((InterfaceC56392iX) obj).getView();
                igImageView.setVisibility(0);
                if (imageUrl != null) {
                    igImageView.setUrl(imageUrl, this.A00);
                } else {
                    igImageView.setImageDrawable(context.getDrawable(R.drawable.profile_anonymous_user));
                }
            }
            int size = set.size();
            int size2 = set.size();
            if (size > 10) {
                if (size2 > 10) {
                    TextView textView3 = c161767Ml.A01;
                    textView3.setVisibility(0);
                    textView3.setText(context.getString(2131958642, Integer.valueOf(set.size() - 10)));
                }
            } else {
                while (size2 < 10) {
                    ((InterfaceC56392iX) c161767Ml.A03.get(size2)).setVisibility(8);
                    size2++;
                }
                c161767Ml.A01.setVisibility(8);
            }
            LinearLayout linearLayout = c161767Ml.A00;
            C14360o3.A0A(context);
            C14360o3.A0B(context, 0);
            List A012 = AbstractC1578276q.A01(set);
            if (A012.isEmpty()) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder(((C206419By) A012.get(0)).A02);
                int min2 = Math.min(10, A012.size());
                for (int i3 = 1; i3 < min2; i3++) {
                    sb.append(context.getString(2131958641, ((C206419By) A012.get(i3)).A02));
                }
                if (A012.size() > 10) {
                    i = 2131958643;
                    objArr = new Object[]{sb.toString(), Integer.valueOf(A012.size() - 10)};
                } else {
                    i = 2131958640;
                    objArr = new Object[]{sb.toString()};
                }
                string = context.getString(i, objArr);
                C14360o3.A0A(string);
            }
            linearLayout.setContentDescription(string);
            if (c161717Mg.A0A) {
                textView2.setText(AbstractC1578076o.A00(context, c161717Mg));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(8);
            }
            ?? r6 = c161767Ml.itemView;
            viewOnClickListenerC23217ARb = new View.OnClickListener() { // from class: X.9Ha
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int A05 = C0f9.A05(-963585727);
                    C7N8.this.A01.F7y(c161717Mg);
                    C0f9.A0C(568981842, A05);
                }
            };
            textView = r6;
        } else {
            textView2.setVisibility(0);
            c161767Ml.A00.setVisibility(8);
            C14360o3.A0A(context);
            textView2.setText(AbstractC1578076o.A00(context, c161717Mg));
            textView2.setTextColor(c161717Mg.A01);
            if (!c161717Mg.A09) {
                return;
            }
            viewOnClickListenerC23217ARb = new ViewOnClickListenerC23217ARb(this, c161717Mg);
            textView = textView2;
        }
        C0fQ.A00(viewOnClickListenerC23217ARb, textView);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161717Mg.class;
    }

    public C7N8(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165527af interfaceC165527af) {
        this.A01 = interfaceC165527af;
        this.A00 = interfaceC11380iw;
        this.A02 = userSession;
    }
}
