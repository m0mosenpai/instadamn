package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* renamed from: X.UsA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67592UsA extends C2JS implements XJl {
    @Override // X.XJl
    public final int getPriority() {
        return getCoercedIntField(1, "priority");
    }

    @Override // X.XJl
    public final XHl BHA() {
        return (XHl) getOptionalTreeField(4, "impression_settings", C67589Us7.class, -1914839836);
    }

    @Override // X.XJl
    public final XHm BKH() {
        return (XHm) getOptionalTreeField(3, "ixt_flow_target", C67590Us8.class, 41484427);
    }

    @Override // X.XJl
    public final ImmutableList C5b() {
        return getRequiredCompactedTreeListField(2, "targets", C67591Us9.class, -1056328738);
    }

    @Override // X.XJl
    public final String CBn() {
        return A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC58319PtB.A0U(AbstractC58319PtB.A0J(C94754Oe.A00), new C4OW(C94894Ou.A00, "priority"), new C4OK(C4OO.A02(), C67591Us9.class, "targets", -1056328738), new C4OK(C67590Us8.class, "ixt_flow_target", 41484427), new C4OK(C67589Us7.class, "impression_settings", -1914839836));
    }

    public C67592UsA(int i) {
        super(i);
    }

    public C67592UsA() {
        super(708584938);
    }
}
