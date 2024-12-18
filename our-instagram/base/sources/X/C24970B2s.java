package X;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.B2s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C24970B2s implements InterfaceC16820sZ {
    public final /* synthetic */ C81J A00;

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        ArrayList arrayList = this.A00.A2t;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }
}
