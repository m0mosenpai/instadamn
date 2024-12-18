package X;

/* renamed from: X.HIs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39094HIs extends C4F4 {
    public final C1571273r A00;
    public final EnumC153216up A01;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C39094HIs c39094HIs = (C39094HIs) obj;
        if (this.A01 == c39094HIs.A01 && this.A00.equals(c39094HIs.A00)) {
            return true;
        }
        return false;
    }

    public C39094HIs(C1571273r c1571273r, EnumC153216up enumC153216up) {
        this.A00 = c1571273r;
        this.A01 = enumC153216up;
    }
}
