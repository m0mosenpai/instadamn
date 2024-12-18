package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Vsb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69634Vsb {
    public final String A05;
    public List A00 = C16930sl.A00;
    public final List A03 = new ArrayList();
    public final java.util.Set A06 = new HashSet();
    public final List A02 = new ArrayList();
    public final List A01 = new ArrayList();
    public final List A04 = new ArrayList();

    public final void A00(String str, List list, SerialDescriptor serialDescriptor) {
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1P(serialDescriptor, list);
        if (this.A06.add(str)) {
            this.A03.add(str);
            this.A02.add(serialDescriptor);
            this.A01.add(list);
            this.A04.add(false);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0u("Element with name '", str, "' is already registered in ", this.A05));
    }

    public C69634Vsb(String str) {
        this.A05 = str;
    }
}
