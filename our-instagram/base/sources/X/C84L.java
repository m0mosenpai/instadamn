package X;

import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.CreationSFXRepository$soundEffectsFlow$1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.84L, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84L {
    public final C49602Pt A00;
    public final C19L A01;
    public final C05A A02;
    public final C05A A03;
    public final C0UO A04;
    public final List A05;

    public C84L(C49602Pt c49602Pt, C19L c19l, int i) {
        this.A01 = c19l;
        this.A00 = c49602Pt;
        C008002u A00 = C10E.A00(Integer.valueOf(i));
        this.A03 = A00;
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        C008002u c008002u = new C008002u(arrayList);
        this.A02 = c008002u;
        this.A04 = AbstractC208910l.A01(C16930sl.A00, c19l, C10Q.A03(new CreationSFXRepository$soundEffectsFlow$1(null), c008002u, A00), C10I.A00);
    }
}
