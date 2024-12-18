package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Il9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42099Il9 implements InterfaceC48192Ji {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C42099Il9(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        C2JS optionalTreeField;
        C2JS c2js2;
        C15370ps c15370ps;
        String str;
        switch (this.A00) {
            case 0:
                if (anonymousClass436 == null || (c2js = (C2JS) anonymousClass436.Bos()) == null || (optionalTreeField = c2js.getOptionalTreeField(0, AbstractC111324zv.A00(418), C59662Qjg.class, -200563672)) == null) {
                    return;
                }
                String A00 = AbstractC58317Pt9.A00(977);
                if (!optionalTreeField.hasFieldValue(A00)) {
                    return;
                }
                if (optionalTreeField.getCoercedBooleanField(0, A00)) {
                    ((C15370ps) this.A03).A00 = "ad_profile_center";
                }
                AbstractC41669Ic1.A02((FragmentActivity) this.A01, (UserSession) this.A02, (String) ((C15370ps) this.A03).A00);
                return;
            case 1:
                if (anonymousClass436 == null || (c2js2 = (C2JS) anonymousClass436.Bos()) == null) {
                    return;
                }
                Enum optionalEnumField = c2js2.getOptionalEnumField(0, AbstractC58317Pt9.A00(406), EnumC39616HeQ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                if (optionalEnumField != null) {
                    if (optionalEnumField == EnumC39616HeQ.FREE_BA_EXPERIENCE) {
                        c15370ps = (C15370ps) this.A03;
                        str = "afs";
                    } else if (optionalEnumField == EnumC39616HeQ.CONTEXTUAL_ADS_EXPERIENCE) {
                        c15370ps = (C15370ps) this.A03;
                        str = "afs_contextual_ads";
                    }
                    c15370ps.A00 = str;
                }
                AbstractC41669Ic1.A02((FragmentActivity) this.A01, (UserSession) this.A02, (String) ((C15370ps) this.A03).A00);
                return;
            default:
                C685736u c685736u = (C685736u) this.A03;
                AbstractC135966Db.A01(c685736u.A0J).A0E(EnumC46303KeZ.A0K);
                C685736u.A00((C42592ItB) this.A02, (C42662IuJ) this.A01, EnumC114405Eh.A02, c685736u);
                return;
        }
    }
}
