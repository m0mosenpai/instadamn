package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Dea, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30676Dea extends C0YY implements InterfaceC16610sE {
    public static final C30676Dea A00 = new C30676Dea();

    public C30676Dea() {
        super(3);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        User user = (User) obj2;
        AbstractC907342m abstractC907342m = (AbstractC907342m) obj3;
        AbstractC167027dH.A12(obj, user, abstractC907342m);
        return new C51755Mte(AbstractC166987dD.A1J(AbstractC47996LLi.A07(new ExtendedImageUrl(user.Bhu()), null, user.getUsername(), user.getFullName(), abstractC907342m.A05("target_url"))), 12);
    }
}
