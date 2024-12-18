package X;

import java.util.Map;

/* renamed from: X.61y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1336861y {
    public static final Map A00;
    public static final Map A01;
    public static final Map A02;

    static {
        EnumC1336961z enumC1336961z = EnumC1336961z.A05;
        AnonymousClass621 anonymousClass621 = AnonymousClass621.A06;
        AnonymousClass621 anonymousClass6212 = AnonymousClass621.A03;
        AnonymousClass621 anonymousClass6213 = AnonymousClass621.A05;
        AnonymousClass621 anonymousClass6214 = AnonymousClass621.A04;
        C09530e4 c09530e4 = new C09530e4(enumC1336961z, new AnonymousClass621[]{anonymousClass621, anonymousClass6212, anonymousClass6213, anonymousClass6214});
        EnumC1336961z enumC1336961z2 = EnumC1336961z.A03;
        C09530e4 c09530e42 = new C09530e4(enumC1336961z2, new AnonymousClass621[]{anonymousClass621, anonymousClass6212, anonymousClass6214});
        EnumC1336961z enumC1336961z3 = EnumC1336961z.A04;
        A00 = AbstractC06930Yk.A06(c09530e4, c09530e42, new C09530e4(enumC1336961z3, new AnonymousClass621[]{anonymousClass621, anonymousClass6212, anonymousClass6214}));
        A01 = AbstractC06930Yk.A06(new C09530e4(enumC1336961z2, "message_expiration_lockbox_state_sync_opt_out_key"), new C09530e4(enumC1336961z3, "message_expiration_lockbox_state_sync_triggered_key"));
        A02 = AbstractC06930Yk.A06(new C09530e4("secure_key_store_identity_private_key", "ipr"), new C09530e4("secure_key_store_identity_public_key", "ipu"));
    }
}
