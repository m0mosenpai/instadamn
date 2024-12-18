package X;

import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;

/* renamed from: X.9Cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206529Cj extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206529Cj(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A07;
        switch (i) {
            case 0:
                return ((ContentFilterDictionaryImpl) obj2).Bbf(this, false);
            case 1:
                return ContentFilterDictionaryRegistrar.A01((ContentFilterDictionaryRegistrar) obj2, null, this);
            default:
                return ContentFilterEngineImpl.A00(null, (ContentFilterEngineImpl) obj2, this);
        }
    }
}
