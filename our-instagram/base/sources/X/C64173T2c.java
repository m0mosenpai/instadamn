package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.T2c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64173T2c implements InterfaceC102444jN, Serializable {
    public final JsonDeserializer A00;

    @Override // X.InterfaceC102444jN
    public final /* synthetic */ Object AXq(AnonymousClass469 anonymousClass469) {
        return this.A00.A0K(anonymousClass469);
    }

    @Override // X.InterfaceC102444jN
    public final Object BXX(AnonymousClass469 anonymousClass469) {
        return this.A00.A0K(anonymousClass469);
    }

    public C64173T2c(JsonDeserializer jsonDeserializer) {
        this.A00 = jsonDeserializer;
    }
}
