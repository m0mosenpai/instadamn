package X;

import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.archive.data.HighlightsSettingsRepository;

/* renamed from: X.9Ce, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206479Ce extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Object A07;

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        if (i != 0) {
            return HighlightsSettingsRepository.A00((HighlightsSettingsRepository) this.A07, this, null, null, false, false, false, false);
        }
        return ((EffectCollectionService) this.A07).A0B(null, this, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206479Ce(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A06 = i;
        this.A07 = obj;
    }
}
