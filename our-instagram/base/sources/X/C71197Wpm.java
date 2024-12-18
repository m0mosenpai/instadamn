package X;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Wpm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71197Wpm implements Iterable, InterfaceC15590qF {
    public final /* synthetic */ SerialDescriptor A00;

    public C71197Wpm(SerialDescriptor serialDescriptor) {
        this.A00 = serialDescriptor;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C71662WyE(this.A00);
    }
}
