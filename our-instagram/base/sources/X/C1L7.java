package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.1L7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1L7 extends C1L9 {
    public final ImmutableList A00;

    @Override // X.C1L9
    public final Object A00(int index) {
        return this.A00.get(index);
    }

    public C1L7(ImmutableList list, int index) {
        super(list.size(), index);
        this.A00 = list;
    }
}
