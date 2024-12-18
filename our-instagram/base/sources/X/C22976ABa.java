package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

/* renamed from: X.ABa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22976ABa {
    public ACU A00;
    public final ViewStub A01;
    public final C7Vn A02;
    public final InterfaceC09390do A03;

    public C22976ABa(ViewStub viewStub, C7Vn c7Vn) {
        C14360o3.A0B(viewStub, 2);
        this.A02 = c7Vn;
        this.A01 = viewStub;
        this.A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37054GUk(this, 47));
    }

    public final void A00(AAT aat) {
        View.OnClickListener onClickListener;
        EnumC223399tW enumC223399tW;
        C14360o3.A0B(aat, 0);
        InterfaceC09390do interfaceC09390do = this.A03;
        if (!interfaceC09390do.CWa()) {
            C7Vn c7Vn = this.A02;
            EnumC223459tc enumC223459tc = aat.A03;
            boolean z = aat.A09;
            AnonymousClass983 anonymousClass983 = c7Vn.A00;
            UserSession userSession = anonymousClass983.A10;
            String A00 = C7Vn.A00(c7Vn);
            String A07 = AnonymousClass983.A07(anonymousClass983);
            boolean z2 = anonymousClass983.A0b instanceof MsysThreadId;
            InterfaceC60442pS interfaceC60442pS = anonymousClass983.A1Q;
            if (z) {
                enumC223399tW = null;
            } else {
                C81663kb A05 = AnonymousClass983.A05(anonymousClass983);
                if (A05 != null) {
                    User Ba5 = A05.Ba5();
                    C83403nh BLs = A05.BLs();
                    if (Ba5 != null && Ba5.A27()) {
                        enumC223399tW = EnumC223399tW.FOLLOWED_BY_RECIPIENT;
                    } else if (!A05.BBy()) {
                        enumC223399tW = EnumC223399tW.EMPTY_THREAD;
                    } else if (BLs != null && Ba5 != null && C14360o3.A0K(BLs.A1u, Ba5.getId())) {
                        enumC223399tW = EnumC223399tW.HAS_MESSAGES_FROM_RECIPIENT;
                    }
                }
                enumC223399tW = EnumC223399tW.NONE;
            }
            C14360o3.A0B(interfaceC60442pS, 6);
            C162337Ov.A05(enumC223459tc, enumC223399tW, interfaceC60442pS, userSession, A00, A07, 1, z2, z);
        }
        AbstractC166987dD.A0d(interfaceC09390do).setVisibility(0);
        View A0d = AbstractC166987dD.A0d(interfaceC09390do);
        View.OnClickListener onClickListener2 = aat.A00;
        C0fQ.A00(onClickListener2, A0d);
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0R(AbstractC166987dD.A0d(interfaceC09390do), R.id.top_container);
        viewGroup.removeAllViews();
        ACU A002 = AbstractC22719A0p.A00(AbstractC166987dD.A0d(interfaceC09390do).getContext());
        ViewGroup viewGroup2 = A002.A00;
        C14360o3.A07(viewGroup2.requireViewById(R.id.icon));
        A002.A02(aat.A05);
        A002.A00(onClickListener2, aat.A08, null, aat.A01);
        A002.A01(aat.A04);
        viewGroup.addView(viewGroup2);
        this.A00 = A002;
        ViewGroup viewGroup3 = (ViewGroup) AbstractC166997dE.A0R(AbstractC166987dD.A0d(interfaceC09390do), R.id.bottom_container);
        if (viewGroup3.getChildCount() == 0) {
            String str = aat.A07;
            if (str.length() > 0 && (onClickListener = aat.A02) != null) {
                LIW A003 = AbstractC47008KqR.A00(AbstractC166987dD.A0d(interfaceC09390do).getContext());
                Integer num = aat.A06;
                if (num != null) {
                    LIW.A00(onClickListener, A003, str, R.id.permissions_choice_button_right, num.intValue());
                } else {
                    A003.A02(str, onClickListener);
                }
                viewGroup3.addView(A003.A00);
            }
        }
    }
}
