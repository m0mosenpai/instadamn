package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.util.recyclerview.LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1;

/* renamed from: X.2yH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65792yH extends AbstractC65632xz {
    public C693439u A00;
    public C685736u A01;
    public boolean A02;
    public LinearLayoutManager A03;
    public final InterfaceC63842v5 A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C63872v8 A08;
    public final C65802yI A09;
    public final Integer A0A;
    public final String A0B = "netego_interests";

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "InterestRecommendations";
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    public C65792yH(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC63842v5 interfaceC63842v5, C63872v8 c63872v8, Integer num) {
        this.A05 = context;
        this.A04 = interfaceC63842v5;
        this.A07 = userSession;
        this.A09 = new C65802yI(context, interfaceC11380iw);
        this.A06 = interfaceC11380iw;
        this.A08 = c63872v8;
        this.A0A = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r5.A09 != false) goto L23;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r24, android.view.View r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65792yH.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C47K c47k = (C47K) obj;
        C114385Ef c114385Ef = (C114385Ef) obj2;
        if (c114385Ef.Ceb()) {
            anonymousClass306.A7a(1);
        } else {
            anonymousClass306.A7a(0);
            this.A04.A9W(c47k, c114385Ef);
        }
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        String str = ((C47K) obj).A0F;
        if (str == null) {
            str = "";
        }
        return str.hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (this.A02) {
            this.A02 = false;
            return Integer.MAX_VALUE;
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A03 = C0f9.A03(528317780);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass001.A0O(AbstractC111324zv.A00(703), i));
                    C0f9.A0A(-1483927780, A03);
                    throw unsupportedOperationException;
                }
            } else {
                inflate = C693539v.A00(this.A05, viewGroup, "v1", 2);
                i2 = -964161175;
                C0f9.A0A(i2, A03);
                return inflate;
            }
        }
        Context context = this.A05;
        LinearLayoutManagerUtil$createOrRestoreLayoutManager$layoutManager$1 A00 = AbstractC92774Dp.A00(context, this.A03, null);
        this.A03 = A00;
        A00.A12(true);
        inflate = LayoutInflater.from(context).inflate(R.layout.netego_carousel, viewGroup, false);
        C47713L4u c47713L4u = new C47713L4u(context, inflate);
        c47713L4u.A07.setLayoutManager(A00);
        inflate.setTag(c47713L4u);
        i2 = 1693350493;
        C0f9.A0A(i2, A03);
        return inflate;
    }
}
