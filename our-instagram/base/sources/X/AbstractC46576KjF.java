package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.KjF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46576KjF {
    public static final MPW A00(InterfaceC16660sJ interfaceC16660sJ) {
        MPW c45134Jya;
        C47784L8k c47784L8k = new C47784L8k();
        interfaceC16660sJ.invoke(c47784L8k);
        InterfaceC50385MMn interfaceC50385MMn = c47784L8k.A01;
        if (interfaceC50385MMn != null) {
            if (interfaceC50385MMn instanceof EnumC46307Ked) {
                C14360o3.A0C(interfaceC50385MMn, "null cannot be cast to non-null type com.facebook.wearable.mediastream.events.model.EngagementEvent.Type");
                c45134Jya = new C45133JyZ((EnumC46307Ked) interfaceC50385MMn, AbstractC06930Yk.A03(c47784L8k.A02), c47784L8k.A00);
            } else if (interfaceC50385MMn instanceof EnumC46306Kec) {
                C14360o3.A0C(interfaceC50385MMn, "null cannot be cast to non-null type com.facebook.wearable.mediastream.events.model.ModelEngagementEvent.Type");
                c45134Jya = new C45135Jyb((EnumC46306Kec) interfaceC50385MMn, AbstractC06930Yk.A03(c47784L8k.A02), c47784L8k.A00);
            } else {
                C14360o3.A0C(interfaceC50385MMn, "null cannot be cast to non-null type com.facebook.wearable.mediastream.events.model.LifeCycleEvent.Type");
                c45134Jya = new C45134Jya((EnumC223469td) interfaceC50385MMn, AbstractC06930Yk.A03(c47784L8k.A02), c47784L8k.A00);
            }
            return c45134Jya;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        throw C00O.createAndThrow();
    }
}
