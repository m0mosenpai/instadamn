package X;

/* renamed from: X.Gtc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38342Gtc extends AbstractC65412xd {
    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        C38635Gyc c38635Gyc = (C38635Gyc) obj;
        C38635Gyc c38635Gyc2 = (C38635Gyc) obj2;
        AbstractC167017dG.A1N(c38635Gyc, c38635Gyc2);
        if (C14360o3.A0K(c38635Gyc.A04.A01(), c38635Gyc2.A04.A01()) && c38635Gyc.A05 == c38635Gyc2.A05) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        C38635Gyc c38635Gyc = (C38635Gyc) obj;
        C38635Gyc c38635Gyc2 = (C38635Gyc) obj2;
        AbstractC167017dG.A1N(c38635Gyc, c38635Gyc2);
        return C14360o3.A0K(c38635Gyc.A04.A01(), c38635Gyc2.A04.A01());
    }
}
