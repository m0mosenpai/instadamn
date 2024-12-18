package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.Eer, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32960Eer extends C3CI {
    public final C31363DqS A00;
    public final C31434Dre A01;
    public final java.util.Set A02 = AbstractC166987dD.A1H();
    public final java.util.Set A03 = AbstractC166987dD.A1H();

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        Object obj = this.A00.A00.get(i);
        if (obj instanceof FOC) {
            FOC foc = (FOC) obj;
            Integer A00 = FVZ.A00(foc);
            if (A00 != null) {
                int intValue = A00.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        User user = foc.A02;
                        if (user != null) {
                            if (this.A03.add(user.getId())) {
                                this.A01.A01(user, "similar_entity_impression", i);
                                return;
                            }
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    return;
                }
                Hashtag hashtag = foc.A00;
                if (hashtag != null) {
                    if (!this.A02.add(hashtag.getId())) {
                        return;
                    }
                    this.A01.A00(hashtag, "similar_entity_impression", i);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public C32960Eer(C31363DqS c31363DqS, C31434Dre c31434Dre) {
        this.A01 = c31434Dre;
        this.A00 = c31363DqS;
    }

    @Override // X.C36Z
    public final Class CAO() {
        return FOC.class;
    }
}
