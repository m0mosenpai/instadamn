package X;

import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.DsW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31486DsW extends C3CI {
    public final AbstractC31433Drd A00;
    public final C31440Drk A01;
    public final java.util.Set A02 = AbstractC166987dD.A1H();

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        Object A01 = this.A01.A01(i);
        if (A01 instanceof FOC) {
            FOC foc = (FOC) A01;
            Integer A00 = FVZ.A00(foc);
            if (A00 != null) {
                int intValue = A00.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        User user = foc.A02;
                        if (user != null) {
                            if (this.A02.add(user.getId())) {
                                this.A00.A0B(user, i);
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
                    AbstractC31433Drd abstractC31433Drd = this.A00;
                    if (!abstractC31433Drd.A04.add(hashtag.getId())) {
                        return;
                    }
                    abstractC31433Drd.A01.A00(hashtag, "similar_entity_impression", i);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public C31486DsW(AbstractC31433Drd abstractC31433Drd, C31440Drk c31440Drk) {
        this.A01 = c31440Drk;
        this.A00 = abstractC31433Drd;
    }

    @Override // X.C36Z
    public final Class CAO() {
        return FOC.class;
    }
}
