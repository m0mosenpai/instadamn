package X;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6p5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150076p5 implements InterfaceC150086p6 {
    public final Context A00;
    public final InterfaceC40711ue A01;
    public final AnonymousClass569 A02;
    public final Map A03;

    public C150076p5(Context context, InterfaceC40711ue interfaceC40711ue, AnonymousClass569 anonymousClass569) {
        C14360o3.A0B(interfaceC40711ue, 1);
        C14360o3.A0B(context, 2);
        this.A01 = interfaceC40711ue;
        this.A00 = context;
        this.A02 = anonymousClass569;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        C14360o3.A07(synchronizedMap);
        this.A03 = synchronizedMap;
    }
}
