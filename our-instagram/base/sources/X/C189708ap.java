package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189708ap {
    public C150736qU A00;
    public boolean A01;
    public final UserSession A02;
    public final C189718aq A03 = new Object() { // from class: X.8aq
    };

    public final boolean A00() {
        C150736qU c150736qU = this.A00;
        if (c150736qU == null) {
            C14360o3.A0F("sparkARFLMConsentManager");
            throw C00O.createAndThrow();
        }
        EnumC150766qZ enumC150766qZ = c150736qU.A04;
        if (enumC150766qZ == null) {
            enumC150766qZ = EnumC150766qZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        }
        if (enumC150766qZ != EnumC150766qZ.CONSENTED) {
            EnumC150766qZ enumC150766qZ2 = c150736qU.A04;
            if (enumC150766qZ2 == null) {
                enumC150766qZ2 = EnumC150766qZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            }
            if (enumC150766qZ2 != EnumC150766qZ.NOT_APPLICABLE) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8aq] */
    public C189708ap(UserSession userSession) {
        this.A02 = userSession;
        C150736qU c150736qU = ((C150696qQ) userSession.A01(C150696qQ.class, new C57243PbR(userSession, 3))).A00;
        this.A00 = c150736qU;
        EnumC150766qZ enumC150766qZ = c150736qU.A04;
        int ordinal = (enumC150766qZ == null ? EnumC150766qZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE : enumC150766qZ).ordinal();
        this.A01 = (ordinal == 1 || ordinal == 3 || ordinal == 5) ? false : true;
        C150736qU c150736qU2 = this.A00;
        if (c150736qU2 == null) {
            C14360o3.A0F("sparkARFLMConsentManager");
            throw C00O.createAndThrow();
        }
        c150736qU2.A01.add(new InterfaceC58362lv() { // from class: X.8ar
            @Override // X.InterfaceC58362lv
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                EnumC150766qZ enumC150766qZ2 = (EnumC150766qZ) obj;
                C14360o3.A0B(enumC150766qZ2, 0);
                C189708ap c189708ap = C189708ap.this;
                int ordinal2 = enumC150766qZ2.ordinal();
                boolean z = true;
                if (ordinal2 == 1 || ordinal2 == 3 || ordinal2 == 5) {
                    z = false;
                }
                c189708ap.A01 = z;
            }
        });
    }
}
