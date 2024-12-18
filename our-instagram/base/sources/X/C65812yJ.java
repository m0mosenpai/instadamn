package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.2yJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65812yJ extends AbstractC65632xz {
    public C693439u A00;
    public InterfaceC63392uM A01;
    public final C63902vB A02;
    public final Context A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "SimpleAction";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C105854pw c105854pw = (C105854pw) obj;
        C42665IuM c42665IuM = (C42665IuM) obj2;
        if (c42665IuM.Ceb()) {
            anonymousClass306.A7a(1);
            return;
        }
        anonymousClass306.A7a(0);
        InterfaceC63392uM interfaceC63392uM = this.A01;
        interfaceC63392uM.getClass();
        interfaceC63392uM.A9W(c105854pw, c42665IuM);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((C105854pw) obj).getId().hashCode();
    }

    public C65812yJ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63902vB c63902vB) {
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A02 = c63902vB;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1328533330);
        C105854pw c105854pw = (C105854pw) obj;
        C42665IuM c42665IuM = (C42665IuM) obj2;
        if (i != 0) {
            if (i == 1) {
                C693439u c693439u = this.A00;
                c693439u.getClass();
                c693439u.A01(view, this.A05, c105854pw, c42665IuM);
            } else {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                C0f9.A0A(1811840482, A03);
                throw unsupportedOperationException;
            }
        } else {
            Object tag = view.getTag();
            tag.getClass();
            IQW.A01(this.A04, this.A02, (C38492GwD) tag, c42665IuM, c105854pw);
            InterfaceC63392uM interfaceC63392uM = this.A01;
            interfaceC63392uM.getClass();
            interfaceC63392uM.EDV(view, c105854pw);
        }
        C0f9.A0A(-1339605983, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A00;
        int i2;
        int A03 = C0f9.A03(1237737987);
        if (i != 0) {
            if (i == 1) {
                A00 = C693539v.A00(this.A03, viewGroup, "v1", 1);
                i2 = 608029114;
            } else {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unhandled view type");
                C0f9.A0A(94120912, A03);
                throw unsupportedOperationException;
            }
        } else {
            A00 = IQW.A00(this.A03, viewGroup);
            i2 = -2091136143;
        }
        C0f9.A0A(i2, A03);
        return A00;
    }
}
