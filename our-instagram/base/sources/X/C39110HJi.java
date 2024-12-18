package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.HJi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39110HJi extends AbstractC64162vb {
    public final C41727Idy A00;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C41726Idx c41726Idx = (C41726Idx) obj2;
        C14360o3.A0B(c41726Idx, 1);
        C41727Idy c41727Idy = this.A00;
        Product product = c41726Idx.A09;
        C14360o3.A0A(product);
        c41727Idy.A03(product);
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C41726Idx c41726Idx = (C41726Idx) obj2;
        C14360o3.A0B(c41726Idx, 1);
        C41727Idy c41727Idy = this.A00;
        Product product = c41726Idx.A09;
        C14360o3.A0A(product);
        c41727Idy.A03(product);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39110HJi(UserSession userSession, C41727Idy c41727Idy) {
        super(AbstractC37302Gc3.A0J(userSession));
        AbstractC167017dG.A1P(userSession, c41727Idy);
        this.A00 = c41727Idy;
    }
}
