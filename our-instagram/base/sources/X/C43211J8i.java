package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.EnableAudioParameters;
import com.instagram.api.schemas.ProductTaggingFeedComponentType;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedHeader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.J8i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43211J8i extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final String A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43211J8i(String str, boolean z, int i) {
        super(1);
        this.A00 = i;
        this.A01 = str;
        this.A02 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                C2VK c2vk = (C2VK) obj;
                C14360o3.A0B(c2vk, 0);
                c2vk.EG7(this.A01, this.A02);
                break;
            case 1:
                C166137bh c166137bh = (C166137bh) obj;
                C14360o3.A0B(c166137bh, 0);
                String str = this.A01;
                boolean z = this.A02;
                C14360o3.A0B(str, 1);
                return AbstractC166327c1.A08(c166137bh, str, new C25310BIf(z, 5));
            case 2:
                C166137bh c166137bh2 = (C166137bh) obj;
                C14360o3.A0B(c166137bh2, 0);
                return AbstractC166327c1.A06(c166137bh2, this.A01, null, new C25310BIf(this.A02, 2));
            case 3:
                C52000Myq c52000Myq = (C52000Myq) obj;
                C14360o3.A0B(c52000Myq, 0);
                boolean z2 = this.A02;
                String str2 = this.A01;
                AudioApi audioApi = c52000Myq.A01.A09.A00;
                if (audioApi != null) {
                    audioApi.enableAudio(AbstractC16960so.A1M(new EnableAudioParameters(str2, 1, z2)));
                    break;
                } else {
                    throw AbstractC166987dD.A14(MSV.A00(118));
                }
            case 4:
                C37783Gjy c37783Gjy = (C37783Gjy) obj;
                C14360o3.A0B(c37783Gjy, 0);
                return C37783Gjy.A00(null, c37783Gjy, this.A01, null, null, null, null, null, 3646, true, false, false, this.A02);
            default:
                C38672GzD c38672GzD = (C38672GzD) obj;
                C14360o3.A0B(c38672GzD, 0);
                String str3 = this.A01;
                boolean z3 = this.A02;
                C14360o3.A0B(str3, 1);
                List list = c38672GzD.A04;
                ProductTaggingFeedComponentType productTaggingFeedComponentType = ProductTaggingFeedComponentType.A0A;
                C38619GyM A00 = C38684GzP.A00(productTaggingFeedComponentType);
                C14360o3.A0B(productTaggingFeedComponentType, 0);
                A00.A02 = productTaggingFeedComponentType;
                A00.A03 = "spinner/default";
                C38684GzP c38684GzP = new C38684GzP(null, 511);
                c38684GzP.A06 = new C51740MtP(str3, z3, 17);
                A00.A01 = c38684GzP;
                ArrayList A0T = AbstractC001800i.A0T(A00, list);
                ShoppingTaggingFeedHeader shoppingTaggingFeedHeader = c38672GzD.A01;
                return C38672GzD.A00(c38672GzD.A00, shoppingTaggingFeedHeader, c38672GzD.A02, A0T, c38672GzD.A03, c38672GzD.A05);
        }
        return C0eB.A00;
    }
}
