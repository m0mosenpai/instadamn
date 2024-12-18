package X;

import android.content.Context;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7NA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NA extends AbstractC66412zI {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9E3(this, 1));
    public final InterfaceC165197a8 A03;
    public final AnonymousClass988 A04;

    public C7NA(Context context, UserSession userSession, InterfaceC165197a8 interfaceC165197a8, AnonymousClass988 anonymousClass988) {
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = anonymousClass988;
        this.A03 = interfaceC165197a8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x010d, code lost:
    
        if (r13 == null) goto L24;
     */
    @Override // X.AbstractC66422zJ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bind(X.C7NB r19, X.C161807Mp r20) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7NA.bind(X.7NB, X.7Mp):void");
    }

    @Override // X.AbstractC66422zJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C7NB createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        try {
            View inflate = layoutInflater.inflate(R.layout.thread_message_username, viewGroup, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate;
        } catch (InflateException e) {
            Context context = this.A00;
            AbstractC53172bz.A03(context, e);
            context.getTheme().applyStyle(AbstractC53172bz.A00(), true);
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.thread_message_username, viewGroup, false);
            C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) inflate2;
        }
        return new C7NB(textView);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C161807Mp.class;
    }
}
