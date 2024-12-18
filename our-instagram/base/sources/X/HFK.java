package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HFK extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final JPm A03;
    public final HH9 A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;

    public HFK(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPm jPm, HH9 hh9, Integer num, String str, boolean z) {
        C14360o3.A0B(jPm, 3);
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A03 = jPm;
        this.A02 = userSession;
        this.A05 = num;
        this.A06 = str;
        this.A07 = z;
        this.A04 = hh9;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        C42335Iox c42335Iox;
        C38441GvO c38441GvO;
        int A03 = C0f9.A03(-469522685);
        AbstractC167017dG.A1P(view, obj);
        if ((obj instanceof C42335Iox) && (c42335Iox = (C42335Iox) obj) != null) {
            Object tag = view.getTag();
            if ((tag instanceof C38441GvO) && (c38441GvO = (C38441GvO) tag) != null) {
                IS8.A01(this.A00, this.A01, this.A02, c38441GvO, this.A03, this.A04, c42335Iox, this.A05, this.A06, c42335Iox.A03.A00.A00, this.A07);
            }
        }
        C0f9.A0A(1469778586, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1861697628);
        LinearLayout A00 = IS8.A00(this.A00);
        C0f9.A0A(795109296, A03);
        return A00;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
