package X;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.bindergroup.AccountLinkModel;

/* loaded from: classes6.dex */
public final class ESE extends AbstractC65632xz {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, obj);
        if (obj instanceof AccountLinkModel.BottomMessageData) {
            anonymousClass306.A7a(A1R ? 1 : 0);
        } else {
            anonymousClass306.A7a(0);
        }
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    public static void A00(TextView textView, FOF fof) {
        fof.A07.setVisibility(8);
        fof.A04.setVisibility(8);
        textView.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0210, code lost:
    
        if ((r14 instanceof com.instagram.profile.bindergroup.AccountLinkModel.AddFacebookPageLinkData) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0252, code lost:
    
        if (r2 != false) goto L91;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r17, android.view.View r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESE.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public ESE(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A01 = userSession;
        this.A02 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A0C;
        Object fof;
        int A03 = C0f9.A03(-1373547756);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_profile_edit_bottom_message_row, false);
                fof = new FJU(A0C);
            } else {
                IllegalStateException A14 = AbstractC166987dD.A14(AbstractC43591JPw.A00(649));
                C0f9.A0A(-87482482, A03);
                throw A14;
            }
        } else {
            A0C = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_edit_link_row, false);
            fof = new FOF(A0C);
        }
        A0C.setTag(fof);
        C0f9.A0A(-1768997064, A03);
        return A0C;
    }
}
