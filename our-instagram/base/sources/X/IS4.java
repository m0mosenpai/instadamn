package X;

/* loaded from: classes7.dex */
public abstract class IS4 {
    public static final void A00(C11520jB c11520jB, C132835z6 c132835z6) {
        C14360o3.A0B(c132835z6, 1);
        c11520jB.A04(AbstractC128995sK.A08, c132835z6.A00().A03);
        c11520jB.A04(AbstractC128995sK.A0A, "KEYWORD");
        c11520jB.A04(AbstractC128995sK.A07, c132835z6.A04);
        c11520jB.A04(AbstractC128995sK.A09, AbstractC40609HzT.A00(c132835z6.A02));
    }

    public static final void A01(C11520jB c11520jB, AbstractC127945qN abstractC127945qN) {
        C130505uv c130505uv = abstractC127945qN.A03;
        if (c130505uv != null && c130505uv.A00 == EnumC130515uw.A0B) {
            Object obj = c130505uv.A0F;
            C14360o3.A0A(obj);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.discovery.interests.model.KeywordRecommendation");
            A00(c11520jB, (C132835z6) obj);
        }
    }
}
