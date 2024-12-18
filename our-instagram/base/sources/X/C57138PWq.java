package X;

import com.instagram.avatars.suggestions.ContextualSuggestionsStickersRepository;
import com.instagram.genai.imageutils.MaskUtilsKt;

/* renamed from: X.PWq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57138PWq extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57138PWq(ContextualSuggestionsStickersRepository contextualSuggestionsStickersRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = 0;
        this.A04 = contextualSuggestionsStickersRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                this.A03 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return ((ContextualSuggestionsStickersRepository) this.A04).A01(this, false);
            case 1:
                this.A04 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return MaskUtilsKt.A04(null, this);
            case 2:
                this.A04 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return MaskUtilsKt.A08(null, this, 0);
            default:
                this.A04 = obj;
                this.A01 |= Integer.MIN_VALUE;
                return MaskUtilsKt.A07(null, this, 0.0f, 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57138PWq(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = i;
    }
}
