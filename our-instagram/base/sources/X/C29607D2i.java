package X;

import java.util.Comparator;

/* renamed from: X.D2i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29607D2i implements Comparator {
    public final /* synthetic */ C6O0 A00;

    public C29607D2i(C6O0 c6o0) {
        this.A00 = c6o0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC25236BEt.A02(this.A00, (C6Ih) obj2, obj);
    }
}