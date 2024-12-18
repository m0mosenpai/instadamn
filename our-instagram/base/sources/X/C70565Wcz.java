package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.Wcz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70565Wcz implements C2JL {
    public boolean A00;

    @Override // X.C2JL
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void onSuccess(AnonymousClass436 anonymousClass436) {
        Object Bos;
        C2JS reinterpretIfFulfillsType;
        C2JS optionalTreeField;
        if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
            C2JS c2js = (C2JS) Bos;
            if (c2js != null) {
                ImmutableList A06 = c2js.A06(C67016Uf1.class, "fx_accounts", -720229042);
                C14360o3.A07(A06);
                C1LC it = A06.iterator();
                while (it.hasNext()) {
                    C2JS c2js2 = (C2JS) it.next();
                    if (c2js2 != null && (reinterpretIfFulfillsType = c2js2.reinterpretIfFulfillsType(0, "XFBFXFBAccountInfo", C67015Uf0.class, 1627498225)) != null && (optionalTreeField = reinterpretIfFulfillsType.getOptionalTreeField(0, AbstractC58317Pt9.A00(345), C67014Uez.class, 568506791)) != null && optionalTreeField.hasFieldValue("is_silhouette")) {
                        this.A00 = optionalTreeField.getCoercedBooleanField(0, "is_silhouette");
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C0K8.A0C(AbstractC43591JPw.A00(537), "Unable to fetch avatar info");
    }
}
