package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.follow.FollowButtonBase;

/* renamed from: X.5uM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130165uM extends C0YY implements InterfaceC16660sJ {
    public static final C130165uM A00 = new C130165uM();

    public C130165uM() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ViewGroup viewGroup;
        C2YJ c2yj = (C2YJ) obj;
        C14360o3.A0B(c2yj, 0);
        View view = c2yj.A00;
        View view2 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            view2 = viewGroup.getChildAt(0);
        }
        if (view2 instanceof FollowButton) {
            FollowButtonBase followButtonBase = (FollowButtonBase) view2;
            followButtonBase.A0J.A0C = EnumC77563dg.A04;
            followButtonBase.performClick();
        }
        return C0eB.A00;
    }
}
