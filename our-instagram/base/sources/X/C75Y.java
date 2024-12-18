package X;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.75Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75Y extends AbstractC66412zI {
    public final UserSession A00;
    public final InterfaceC165357aO A01;
    public final AnonymousClass988 A02;
    public final Class A03;

    public static final C1574475a A00(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.thread_message_action_log, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C1574475a(inflate);
    }

    @Override // X.AbstractC66422zJ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void bind(C1574475a c1574475a, AbstractC158757Al abstractC158757Al) {
        String str;
        C14360o3.A0B(abstractC158757Al, 0);
        C14360o3.A0B(c1574475a, 1);
        TextView textView = c1574475a.A00;
        SpannableString A02 = abstractC158757Al.A02();
        C89403yg[] c89403ygArr = (C89403yg[]) A02.getSpans(0, A02.length(), C89403yg.class);
        if (c89403ygArr != null) {
            int length = c89403ygArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                C89403yg c89403yg = c89403ygArr[i];
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    List A05 = abstractC158757Al.A05();
                    if (i2 < A05.size() && (str = (String) A05.get(i2)) != null) {
                        c89403yg.A00 = new C49397LsV(this, abstractC158757Al, str);
                    }
                }
                i++;
                i2 = i3;
            }
        }
        textView.setText(A02);
        textView.setTextColor(abstractC158757Al.A00());
        textView.setTypeface(textView.getTypeface(), 0);
        textView.setBackground(abstractC158757Al.A01());
        List A052 = abstractC158757Al.A05();
        LQF lqf = null;
        if (!(A052 instanceof Collection) || !A052.isEmpty()) {
            Iterator it = A052.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str2 != null && AbstractC001900j.A0a(str2, "instagram://collection", false)) {
                    if (!abstractC158757Al.A08()) {
                        lqf = new LQF(this, c1574475a, abstractC158757Al);
                    }
                }
            }
        }
        textView.setOnLongClickListener(lqf);
        if (A02.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            AnonymousClass775.A00(textView, abstractC158757Al.A07());
            boolean A06 = abstractC158757Al.A06();
            textView.setText(A02);
            if (A06) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setHighlightColor(0);
            }
        }
        AbstractC25651Mw.A00(this.A00).E4s(new C29151CtI(abstractC158757Al.A04()));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return this.A03;
    }

    public C75Y(UserSession userSession, InterfaceC165357aO interfaceC165357aO, AnonymousClass988 anonymousClass988, Class cls) {
        this.A01 = interfaceC165357aO;
        this.A02 = anonymousClass988;
        this.A00 = userSession;
        this.A03 = cls;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return A00(layoutInflater, viewGroup);
    }
}
