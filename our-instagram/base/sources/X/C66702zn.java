package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;

/* renamed from: X.2zn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66702zn extends AbstractC65632xz {
    public final C66712zo A00;
    public final C63762ux A01;
    public final boolean A02;
    public final C62862tP A03;

    public C66702zn(Context context, C07X c07x, C62862tP c62862tP, UserSession userSession, C63762ux c63762ux) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c62862tP, 3);
        C14360o3.A0B(c63762ux, 4);
        C14360o3.A0B(c07x, 5);
        this.A03 = c62862tP;
        this.A01 = c63762ux;
        this.A00 = new C66712zo(context, c07x, c62862tP, userSession);
        this.A02 = AbstractC65492xl.A00(userSession).A0T;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "BloksNetego";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((C103464lM) obj).A06.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C103464lM c103464lM = (C103464lM) obj;
        C38047Goa c38047Goa = (C38047Goa) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c103464lM, 1);
        C14360o3.A0B(c38047Goa, 2);
        anonymousClass306.A7b(0, c103464lM, c38047Goa);
        this.A01.A9W(c103464lM, c38047Goa);
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1188761350);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C103464lM c103464lM = (C103464lM) obj;
        if (this.A02) {
            String str = c103464lM.A06;
            C14360o3.A07(str);
            this.A00.A05((LithoView) view, str, C123515iQ.A00, new C9F4(1, c103464lM, this), C123525iR.A00);
        } else {
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.bloks.BloksNetegoViewBinder.Holder");
            AbstractC40631Hzp.A00(this.A03, (IGS) tag, c103464lM);
        }
        this.A01.EDV(view, c103464lM);
        C0f9.A0A(1892454465, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int A03 = C0f9.A03(-1015931175);
        C14360o3.A0B(viewGroup, 1);
        if (this.A02) {
            inflate = this.A00.A03();
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bloks_netego_feed_item, viewGroup, false);
            inflate.setTag(new IGS(viewGroup, inflate));
            C14360o3.A0A(inflate);
        }
        C0f9.A0A(-1797570672, A03);
        return inflate;
    }
}
