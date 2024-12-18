package X;

import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116485Pd implements InterfaceC116495Pe {
    public int A00;
    public boolean A01;
    public final C97004Xl A02;
    public final List A04 = new ArrayList();
    public final Object A03 = new Object();

    @Override // X.InterfaceC116495Pe
    public final Timeline C8Z() {
        return this.A02.A01;
    }

    @Override // X.InterfaceC116495Pe
    public final Object CCH() {
        return this.A03;
    }

    public C116485Pd(C4XW c4xw, boolean z) {
        this.A02 = new C97004Xl(c4xw, z);
    }
}
