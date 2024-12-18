package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profilecard.domain.ProfileCardViewModel;
import com.instagram.user.model.User;

/* renamed from: X.PZh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57163PZh extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;
    public final String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57163PZh(User user, C50953MfM c50953MfM, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = 5;
        this.A05 = c50953MfM;
        this.A07 = user;
        this.A08 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String str;
        int i;
        switch (this.A06) {
            case 0:
                Object obj8 = this.A04;
                Object obj9 = this.A07;
                String str2 = this.A08;
                Object obj10 = this.A01;
                return new C57163PZh(obj8, obj9, this.A02, this.A03, obj10, str2, interfaceC23621Ds, 0);
            case 1:
                C57163PZh c57163PZh = new C57163PZh(this.A04, this.A07, this.A02, this.A03, this.A01, this.A08, interfaceC23621Ds, 1);
                c57163PZh.A05 = obj;
                return c57163PZh;
            case 2:
                obj2 = this.A05;
                obj3 = this.A07;
                obj4 = this.A04;
                obj5 = this.A01;
                obj6 = this.A03;
                obj7 = this.A02;
                str = this.A08;
                i = 2;
                return new C57163PZh(obj2, obj3, obj4, obj5, obj6, obj7, str, interfaceC23621Ds, i);
            case 3:
                ProfileCardViewModel profileCardViewModel = (ProfileCardViewModel) this.A05;
                C57163PZh c57163PZh2 = new C57163PZh((Activity) this.A07, (InterfaceC11380iw) this.A01, (O7E) this.A02, profileCardViewModel, this.A08, interfaceC23621Ds);
                c57163PZh2.A03 = obj;
                return c57163PZh2;
            case 4:
                return new C57163PZh((Context) this.A02, (ViewGroup) this.A01, (FragmentActivity) this.A07, (UserSession) this.A03, this.A08, interfaceC23621Ds);
            case 5:
                return new C57163PZh((User) this.A07, (C50953MfM) this.A05, this.A08, interfaceC23621Ds);
            default:
                obj7 = this.A02;
                str = this.A08;
                obj5 = this.A01;
                obj6 = this.A03;
                obj3 = this.A07;
                obj2 = this.A05;
                obj4 = this.A04;
                i = 6;
                return new C57163PZh(obj2, obj3, obj4, obj5, obj6, obj7, str, interfaceC23621Ds, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0402 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57163PZh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57163PZh) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57163PZh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A05 = obj;
        this.A07 = obj2;
        this.A04 = obj3;
        this.A01 = obj4;
        this.A03 = obj5;
        this.A02 = obj6;
        this.A08 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57163PZh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A04 = obj;
        this.A08 = str;
        this.A07 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57163PZh(Activity activity, InterfaceC11380iw interfaceC11380iw, O7E o7e, ProfileCardViewModel profileCardViewModel, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = 3;
        this.A05 = profileCardViewModel;
        this.A02 = o7e;
        this.A07 = activity;
        this.A01 = interfaceC11380iw;
        this.A08 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57163PZh(Context context, ViewGroup viewGroup, FragmentActivity fragmentActivity, UserSession userSession, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A06 = 4;
        this.A03 = userSession;
        this.A08 = str;
        this.A02 = context;
        this.A01 = viewGroup;
        this.A07 = fragmentActivity;
    }
}
