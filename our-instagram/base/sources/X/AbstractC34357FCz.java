package X;

/* renamed from: X.FCz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34357FCz {
    public static final void A00(AbstractC12990ll abstractC12990ll, Boolean bool, Boolean bool2, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "igts_defaults");
        if (A0f.isSampled()) {
            A0f.AAP("event_type", str2);
            A0f.AAP("client_userid", str);
            if (bool != null) {
                A0f.A7v("is_set_to_private", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool2 != null) {
                A0f.A7v("should_set_teen_users_as_private", Boolean.valueOf(bool2.booleanValue()));
            }
            A0f.Cht();
        }
    }
}
