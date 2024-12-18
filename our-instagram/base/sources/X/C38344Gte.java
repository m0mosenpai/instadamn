package X;

/* renamed from: X.Gte, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38344Gte extends AbstractC65412xd {
    public static final C38344Gte A00 = new Object();

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        AbstractC39658Hin abstractC39658Hin = (AbstractC39658Hin) obj;
        AbstractC39658Hin abstractC39658Hin2 = (AbstractC39658Hin) obj2;
        AbstractC167017dG.A1N(abstractC39658Hin, abstractC39658Hin2);
        if ((abstractC39658Hin instanceof HYM) && (abstractC39658Hin2 instanceof HYM) && C14360o3.A0K(((HYM) abstractC39658Hin).A07, ((HYM) abstractC39658Hin2).A07)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        AbstractC167017dG.A1N(obj, obj2);
        return obj.equals(obj2);
    }
}
