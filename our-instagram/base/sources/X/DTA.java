package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTA extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C136606Go A00;
    public final /* synthetic */ Modifier A01;
    public final /* synthetic */ C2DC A02;
    public final /* synthetic */ C72 A03;
    public final /* synthetic */ C28874Coi A04;
    public final /* synthetic */ String A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTA(C136606Go c136606Go, Modifier modifier, C2DC c2dc, C72 c72, C28874Coi c28874Coi, String str) {
        super(2);
        this.A00 = c136606Go;
        this.A01 = modifier;
        this.A03 = c72;
        this.A04 = c28874Coi;
        this.A02 = c2dc;
        this.A05 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        BZO A01;
        BZP A06;
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2072260670, "com.instagram.barcelona.feed.post.ui.PostProfilePreview.<anonymous> (PostProfilePreview.kt:65)");
            }
            C136606Go c136606Go = this.A00;
            A01 = AbstractC28503Chw.A01(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f);
            BZO A00 = A01.A00(AbstractC28503Chw.A02(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.8f, C5AE.A00(0.07f, 0.0f)));
            A06 = AbstractC28503Chw.A06(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f);
            AbstractC28495Cho.A02(A00, A06.A00(AbstractC28503Chw.A07(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.3f, C5AE.A00(0.07f, 0.0f))), c136606Go, c5Tl, null, null, C5UA.A01(c5Tl, new C30559Dcg(this.A01, this.A03, this.A04, this.A02, this.A05, 3), -2058937556), 196608, 18);
            if (C0fH.A02()) {
                C0fH.A00(-1045352122);
            }
        }
        return C0eB.A00;
    }
}
