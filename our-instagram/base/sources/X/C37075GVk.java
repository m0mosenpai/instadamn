package X;

import com.instagram.user.model.User;

/* renamed from: X.GVk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37075GVk extends C0YY implements InterfaceC16660sJ {
    public static final C37075GVk A00 = new C37075GVk();

    public C37075GVk() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        User user = (User) obj;
        C14360o3.A0B(user, 0);
        String pkId = user.A03.getPkId();
        if (pkId == null) {
            return "";
        }
        return pkId;
    }
}
