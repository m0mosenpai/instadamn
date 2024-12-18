package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.J8n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43216J8n extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C19260xA A02;
    public final /* synthetic */ ProductFeedItem A03;
    public final /* synthetic */ JII A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43216J8n(C19260xA c19260xA, ProductFeedItem productFeedItem, JII jii, String str, String str2, int i, int i2) {
        super(1);
        this.A04 = jii;
        this.A03 = productFeedItem;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c19260xA;
        this.A06 = str;
        this.A05 = str2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View A0R = AbstractC25228BEl.A0R(obj);
        this.A04.Db6(A0R, new C38675GzG(this.A02, this.A06, this.A05, 2024), this.A03, this.A01, this.A00);
        return C0eB.A00;
    }
}
