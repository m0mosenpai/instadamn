package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9UL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9UL extends C2UU {
    public final InterfaceC25174BBv A00;
    public final List A01 = AbstractC166987dD.A1E();
    public final UserSession A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_reel_hashtag, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        C210919Uo c210919Uo = new C210919Uo(inflate, this.A00);
        TextView textView = c210919Uo.A01;
        C14360o3.A07(context);
        textView.setTypeface(AbstractC167017dG.A0S(context));
        AbstractC56952jT.A01(inflate);
        return c210919Uo;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C210919Uo c210919Uo = (C210919Uo) c3oo;
        C14360o3.A0B(c210919Uo, 0);
        Hashtag hashtag = (Hashtag) this.A01.get(i);
        String name = hashtag.getName();
        if (name != null) {
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            str = AbstractC166997dE.A10(locale, name);
        } else {
            str = "";
        }
        TextView textView = c210919Uo.A01;
        textView.setBackgroundResource(R.drawable.reel_hashtag_background);
        textView.setText(AbstractC13670mt.A06("#%s", str));
        c210919Uo.A00 = hashtag;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(C3OO c3oo) {
        C210919Uo c210919Uo = (C210919Uo) c3oo;
        C14360o3.A0B(c210919Uo, 0);
        c210919Uo.A02.A02();
    }

    public C9UL(UserSession userSession, InterfaceC25174BBv interfaceC25174BBv) {
        this.A02 = userSession;
        this.A00 = interfaceC25174BBv;
    }

    public final void A00(List list) {
        int size = list.size();
        if (size > 10) {
            size = 10;
        }
        int i = 0;
        for (Object obj : list) {
            if (i >= size) {
                break;
            }
            List list2 = this.A01;
            if (!list2.contains(obj)) {
                list2.add(obj);
                i++;
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1146036520);
        int size = this.A01.size();
        C0f9.A0A(127980251, A03);
        return size;
    }
}
